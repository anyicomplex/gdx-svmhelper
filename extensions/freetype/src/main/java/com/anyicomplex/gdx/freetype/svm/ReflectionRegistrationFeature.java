package com.anyicomplex.gdx.freetype.svm;

import com.anyicomplex.gdx.svm.FeatureUtils;
import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

@AutomaticFeature
public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.class);
    }

}
