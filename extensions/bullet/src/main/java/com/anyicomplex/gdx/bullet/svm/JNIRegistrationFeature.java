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

package com.anyicomplex.gdx.bullet.svm;

import com.oracle.svm.core.annotate.AutomaticFeature;
import com.oracle.svm.core.jni.JNIRuntimeAccess;
import org.graalvm.nativeimage.hosted.Feature;

@AutomaticFeature
public class JNIRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {

        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.linearmath.LinearMath.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.btBroadphasePair.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.btBroadphaseAabbCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.btBroadphaseRayCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.btNodeOverlapCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.btOverlapCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.btOverlapFilterCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.btTriangleCallback.class);
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.collision.btInternalTriangleIndexCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.ICollide.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.btConvexTriangleCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.btGhostPairCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.RayResultCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.ClosestRayResultCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.AllHitsRayResultCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.ConvexResultCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.ClosestConvexResultCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.ContactResultCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.btTriangleRaycastCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.btTriangleConvexcastCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.CustomCollisionDispatcher.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.ContactListener.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.ContactCache.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.dynamics.InternalTickCallback.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.dynamics.CustomActionInterface.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.extras.btBulletWorldImporter.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw.class);
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.linearmath.btMotionState.class);
        JNIRuntimeAccess.register(java.math.BigInteger.class);

        // TODO: 21.06.2021 Add the methods more selective
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.linearmath.LinearMathJNI.class.getDeclaredMethods());
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.extras.ExtrasJNI.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.collision.CollisionJNI.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.dynamics.DynamicsJNI.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.collision.btBroadphasePair.class.getDeclaredMethods());
        JNIRuntimeAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btBroadphaseAabbCallback.class.getDeclaredMethods());
        JNIRuntimeAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btBroadphaseRayCallback.class.getDeclaredMethods());
        JNIRuntimeAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btNodeOverlapCallback.class.getDeclaredMethods());
        JNIRuntimeAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btOverlapFilterCallback.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.collision.btTriangleCallback.class.getDeclaredMethods());
        JNIRuntimeAccess.register(com.badlogic.gdx.physics.bullet.collision.btInternalTriangleIndexCallback.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.collision.ICollide.class.getDeclaredMethods());
        JNIRuntimeAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btConvexTriangleCallback.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.collision.btGhostPairCallback.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.collision.RayResultCallback.class.getDeclaredMethods());
        JNIRuntimeAccess.register(
            com.badlogic.gdx.physics.bullet.collision.ClosestRayResultCallback.class.getDeclaredMethods());
        JNIRuntimeAccess.register(
            com.badlogic.gdx.physics.bullet.collision.AllHitsRayResultCallback.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.collision.ConvexResultCallback.class.getDeclaredMethods());
        JNIRuntimeAccess.register(
            com.badlogic.gdx.physics.bullet.collision.ClosestConvexResultCallback.class.getDeclaredMethods());
        JNIRuntimeAccess.register(
            com.badlogic.gdx.physics.bullet.collision.ContactResultCallback.class.getDeclaredMethods());
        JNIRuntimeAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btTriangleRaycastCallback.class.getDeclaredMethods());
        JNIRuntimeAccess.register(
            com.badlogic.gdx.physics.bullet.collision.btTriangleConvexcastCallback.class.getDeclaredMethods());
        JNIRuntimeAccess.register(
            com.badlogic.gdx.physics.bullet.collision.CustomCollisionDispatcher.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.collision.ContactListener.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.collision.ContactCache.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.dynamics.InternalTickCallback.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.dynamics.CustomActionInterface.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.extras.btBulletWorldImporter.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw.class.getDeclaredMethods());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.linearmath.btMotionState.class.getDeclaredMethods());
        JNIRuntimeAccess.register(com.badlogic.gdx.utils.Pool.class.getDeclaredMethods());

        JNIRuntimeAccess.register(com.badlogic.gdx.math.Vector3.class.getDeclaredFields());
        JNIRuntimeAccess.register(com.badlogic.gdx.math.Matrix4.class.getDeclaredFields());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.linearmath.LinearMath.class.getDeclaredFields());
        JNIRuntimeAccess
            .register(com.badlogic.gdx.physics.bullet.collision.btBroadphasePair.class.getDeclaredFields());

        try {
            JNIRuntimeAccess.register(java.math.BigInteger.class.getConstructor(byte[].class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

}
