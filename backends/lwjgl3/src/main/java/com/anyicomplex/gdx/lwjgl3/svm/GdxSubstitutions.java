/*
 * Copyright 2022 Yi An
 * Copyright 2022 Berstanio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.anyicomplex.gdx.lwjgl3.svm;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.SharedLibraryLoader;
import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@TargetClass(SharedLibraryLoader.class)
final class com_badlogic_gdx_utils_SharedLibraryLoader {

  @Alias
  private String nativesJar;

  @Substitute
  private InputStream readFile (String path) {
    if (nativesJar == null) {
      // LWJGL library path
      String libPath = System.getProperty("org.lwjgl.librarypath");
      if (libPath != null) {
        InputStream input;
        try {
          input = new FileInputStream(new File(libPath, path));
        }
        catch (IOException ex) {
          throw new GdxRuntimeException("Unable to read library file: " + path, ex);
        }
        return input;
      }
      InputStream input = SharedLibraryLoader.class.getResourceAsStream("/" + path);
      if (input == null) throw new GdxRuntimeException("Unable to read file for extraction: " + path);
      return input;
    }

    // Read from JAR.
    try {
      ZipFile file = new ZipFile(nativesJar);
      ZipEntry entry = file.getEntry(path);
      if (entry == null) throw new GdxRuntimeException("Couldn't find '" + path + "' in JAR: " + nativesJar);
      return file.getInputStream(entry);
    } catch (IOException ex) {
      throw new GdxRuntimeException("Error reading '" + path + "' in JAR: " + nativesJar, ex);
    }
  }

  @Substitute
  private void loadFile (String sourcePath) {
    String sourceCrc = crc(readFile(sourcePath));

    String fileName = new File(sourcePath).getName();

    // LWJGL library path
    String libPath = System.getProperty("org.lwjgl.librarypath");
    if (libPath != null) {
      File file = new File(libPath, fileName);
      Throwable ex = loadFile(sourcePath, sourceCrc, file);
      if (ex == null) return;
    }

    // Temp directory with username in path.
    File file = new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + sourceCrc,
            fileName);
    Throwable ex = loadFile(sourcePath, sourceCrc, file);
    if (ex == null) return;

    // System provided temp directory.
    try {
      file = File.createTempFile(sourceCrc, null);
      if (file.delete() && loadFile(sourcePath, sourceCrc, file) == null) return;
    } catch (Throwable ignored) {
    }

    // User home.
    file = new File(System.getProperty("user.home") + "/.libgdx/" + sourceCrc, fileName);
    if (loadFile(sourcePath, sourceCrc, file) == null) return;

    // Relative directory.
    file = new File(".temp/" + sourceCrc, fileName);
    if (loadFile(sourcePath, sourceCrc, file) == null) return;

    // Fallback to java.library.path location, eg for applets.
    file = new File(System.getProperty("java.library.path"), sourcePath);
    if (file.exists()) {
      System.load(file.getAbsolutePath());
      return;
    }

    throw new GdxRuntimeException(ex);
  }

  @Alias
  public String crc (InputStream input) {
    return null;
  }

  @Alias
  private Throwable loadFile (String sourcePath, String sourceCrc, File extractedFile) {
    return null;
  }

}

/** Dummy class with the file's name. */
public class GdxSubstitutions {}