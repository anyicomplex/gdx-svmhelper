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

import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.RecomputeFieldValue;
import com.oracle.svm.core.annotate.RecomputeFieldValue.Kind;
import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;

import java.lang.reflect.Field;
import java.util.List;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.POINTER_SIZE;

/**
 * source https://github.com/chirontt/lwjgl3-helloworld-native/blob/main/src/main/java/com/github/chirontt/lwjgl/graalvm/LwjglSubstitutions.java
 */
@TargetClass(org.lwjgl.system.ThreadLocalUtil.class)
final class Target_org_lwjgl_system_ThreadLocalUtil {

  @Alias
  @RecomputeFieldValue(kind = Kind.FromAlias, isFinal = true)
  private static long JNI_NATIVE_INTERFACE;

  @Alias
  @RecomputeFieldValue(kind = Kind.FromAlias, isFinal = true)
  private static long FUNCTION_MISSING_ABORT;

  @Substitute
  public static void setFunctionMissingAddresses(Class<?> capabilitiesClass, int index) {
    if (capabilitiesClass == null) {
      long missingCaps = memGetAddress(JNI_NATIVE_INTERFACE + Integer.toUnsignedLong(index) * POINTER_SIZE);
      if (missingCaps != NULL) {
        getAllocator().free(missingCaps);
        memPutAddress(JNI_NATIVE_INTERFACE + Integer.toUnsignedLong(index) * POINTER_SIZE, NULL);
      }
    } else {
      int functionCount = getFieldsFromCapabilities(capabilitiesClass).size();

      long missingCaps = getAllocator().malloc(Integer.toUnsignedLong(functionCount) * POINTER_SIZE);
      for (int i = 0; i < functionCount; i++) {
        memPutAddress(missingCaps + Integer.toUnsignedLong(i) * POINTER_SIZE, FUNCTION_MISSING_ABORT);
      }

      //the whole purpose of substituting this method is just to remove the following line
      //(which causes the resulting native image to crash!)
      //memPutAddress(JNI_NATIVE_INTERFACE + Integer.toUnsignedLong(index) * POINTER_SIZE, missingCaps);
    }
  }

  @Alias
  private static List<Field> getFieldsFromCapabilities(Class<?> capabilitiesClass) {
    return null;
  }

}

/** Dummy class with the file's name. */
public class Lwjgl3Substitutions {}