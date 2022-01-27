package com.anyicomplex.gdx.moe.svm;

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

}
