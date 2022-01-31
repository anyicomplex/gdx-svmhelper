package com.anyicomplex.gdx.controllers.lwjgl3.svm;

import com.anyicomplex.gdx.svm.FeatureUtils;
import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

@AutomaticFeature
public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        RuntimeReflection.register(com.badlogic.gdx.controllers.desktop.support.JamepadController.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.controllers.desktop.JamepadControllerManager.class);

        //Jamepad
        RuntimeReflection.register(com.studiohartman.jamepad.ControllerManager.class);
    }

}
