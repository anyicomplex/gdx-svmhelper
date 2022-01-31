package com.anyicomplex.gdx.box2d.svm;

import com.badlogic.gdx.physics.box2d.World;
import com.oracle.svm.core.annotate.AutomaticFeature;
import com.oracle.svm.core.jni.JNIRuntimeAccess;
import org.graalvm.nativeimage.hosted.Feature;

@AutomaticFeature
public class JNIRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {

        try {
            JNIRuntimeAccess.register(World.class);
            JNIRuntimeAccess.register(World.class.getDeclaredMethod("beginContact", long.class));
            JNIRuntimeAccess.register(World.class.getDeclaredMethod("endContact", long.class));
            JNIRuntimeAccess.register(World.class.getDeclaredMethod("preSolve", long.class, long.class));
            JNIRuntimeAccess.register(World.class.getDeclaredMethod("postSolve", long.class, long.class));
            JNIRuntimeAccess.register(World.class.getDeclaredMethod("reportFixture", long.class));
            JNIRuntimeAccess.register(World.class.getDeclaredMethod("reportRayFixture", long.class, float.class, float.class, float.class, float.class, float.class));
            JNIRuntimeAccess.register(World.class.getDeclaredMethod("contactFilter", long.class, long.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

}
