package com.anyicomplex.gdx.lwjgl3;

public final class Lwjgl3GraalHelper {

    public static void setupSharedLibraryPath(String libPath) {
        System.setProperty("org.lwjgl.librarypath", libPath);
    }

    public static void setupSharedLibraryPath() {
        setupSharedLibraryPath(".");
    }

}
