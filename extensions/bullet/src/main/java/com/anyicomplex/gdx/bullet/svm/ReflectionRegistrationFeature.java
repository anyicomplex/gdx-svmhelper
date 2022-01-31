package com.anyicomplex.gdx.bullet.svm;

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

@AutomaticFeature
public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {

        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.AllHitsRayResultCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.btConvexTriangleCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.btGhostPairCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.btTriangleConvexcastCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.btTriangleRaycastCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.ClosestConvexResultCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.ClosestRayResultCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.ContactResultCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.ConvexResultCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.CustomCollisionDispatcher.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.ICollide.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.collision.RayResultCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.dynamics.InternalTickCallback.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.extras.btBulletWorldImporter.class);
        RuntimeReflection.register(com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw.class);

    }

}
