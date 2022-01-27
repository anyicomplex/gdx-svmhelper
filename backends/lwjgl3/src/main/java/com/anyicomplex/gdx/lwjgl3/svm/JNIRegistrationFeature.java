package com.anyicomplex.gdx.lwjgl3.svm;

import com.oracle.svm.core.annotate.AutomaticFeature;
import com.oracle.svm.core.jni.JNIRuntimeAccess;
import org.graalvm.nativeimage.hosted.Feature;

@AutomaticFeature
public class JNIRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {

        //LWJGL3
        for (Class<?> aClass : org.lwjgl.system.CallbackI.class.getDeclaredClasses()) {
            JNIRuntimeAccess.register(aClass.getDeclaredMethods());
        }
    }

}
