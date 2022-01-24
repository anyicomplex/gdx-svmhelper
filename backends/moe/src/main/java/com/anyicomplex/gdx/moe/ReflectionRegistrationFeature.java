package com.anyicomplex.gdx.moe;

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

@AutomaticFeature
public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        try {
            RuntimeReflection.register(Class.forName("com.badlogic.gdx.backends.iosmoe.IOSMusic$1").getMethods());
            RuntimeReflection.register(Class.forName("com.badlogic.gdx.backends.iosmoe.IOSInput$4").getMethods());
            RuntimeReflection.register(Class.forName("com.badlogic.gdx.backends.iosmoe.IOSInput$5").getMethods());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    
    public void registerForAnyInstantiation(Class<?>... classes) {
        RuntimeReflection.register(classes);
        for (Class<?> clazz : classes) {
            RuntimeReflection.register(clazz.getDeclaredConstructors());
            RuntimeReflection.register(clazz.getDeclaredMethods());
            RuntimeReflection.register(clazz.getDeclaredFields());
            registerForAnyInstantiation(clazz.getDeclaredClasses());
        }
    }

}
