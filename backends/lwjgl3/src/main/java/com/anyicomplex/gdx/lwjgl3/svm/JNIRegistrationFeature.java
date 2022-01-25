package com.anyicomplex.gdx.lwjgl3.svm;

import com.oracle.svm.core.annotate.AutomaticFeature;
import com.oracle.svm.core.jni.JNIRuntimeAccess;
import org.graalvm.nativeimage.hosted.Feature;

@AutomaticFeature
public class JNIRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {

        try {
            //LWJGL3
            JNIRuntimeAccess.register(org.lwjgl.system.CallbackI.V.class.getDeclaredMethod("callback", long.class));
            JNIRuntimeAccess.register(org.lwjgl.system.CallbackI.Z.class.getDeclaredMethod("callback", long.class));
            JNIRuntimeAccess.register(org.lwjgl.system.CallbackI.B.class.getDeclaredMethod("callback", long.class));
            JNIRuntimeAccess.register(org.lwjgl.system.CallbackI.S.class.getDeclaredMethod("callback", long.class));
            JNIRuntimeAccess.register(org.lwjgl.system.CallbackI.I.class.getDeclaredMethod("callback", long.class));
            JNIRuntimeAccess.register(org.lwjgl.system.CallbackI.J.class.getDeclaredMethod("callback", long.class));
            JNIRuntimeAccess.register(org.lwjgl.system.CallbackI.N.class.getDeclaredMethod("callback", long.class));
            JNIRuntimeAccess.register(org.lwjgl.system.CallbackI.F.class.getDeclaredMethod("callback", long.class));
            JNIRuntimeAccess.register(org.lwjgl.system.CallbackI.D.class.getDeclaredMethod("callback", long.class));
            JNIRuntimeAccess.register(org.lwjgl.system.CallbackI.P.class.getDeclaredMethod("callback", long.class));
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

}
