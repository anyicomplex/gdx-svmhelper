package com.anyicomplex.gdx.lwjgl3.svm;

public class Lwjgl3NativeImageUtils {

    public static void setSharedLibraryPath(String libPath) {
        System.setProperty("org.lwjgl.librarypath", libPath);
    }

    public static void setupSharedLibraryPath() {
        setSharedLibraryPath(".");
    }

}
