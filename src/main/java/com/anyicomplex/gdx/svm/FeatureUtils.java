package com.anyicomplex.gdx.svm;

import org.graalvm.nativeimage.hosted.RuntimeReflection;

public class FeatureUtils {

    public static void registerForAnyInstantiation(Class<?>... classes) {
        RuntimeReflection.register(classes);
        for (Class<?> clazz : classes) {
            RuntimeReflection.register(clazz.getDeclaredConstructors());
            RuntimeReflection.register(clazz.getDeclaredMethods());
            RuntimeReflection.register(clazz.getDeclaredFields());
            registerForAnyInstantiation(clazz.getDeclaredClasses());
        }
    }

}
