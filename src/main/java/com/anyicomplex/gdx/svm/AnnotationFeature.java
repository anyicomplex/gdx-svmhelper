package com.anyicomplex.gdx.svm;

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Vector;
import java.util.stream.Collectors;

@AutomaticFeature
public class AnnotationFeature implements Feature {
	@Override
	public void beforeAnalysis (BeforeAnalysisAccess access) {
		try {
			Field f = ClassLoader.class.getDeclaredField("classes");
			f.setAccessible(true);
			ClassLoader classLoader = access.getApplicationClassLoader();
			Vector<Class<?>> classes = (Vector<Class<?>>)f.get(classLoader);
			Class<?>[] toAdd = classes.stream().filter(aClass -> aClass.isAnnotationPresent(CollectForReflection.class)).toArray(Class[]::new);
			System.out.print("The following classes are added because of the CollectForReflection annotation: ");
			System.out.println(Arrays.stream(toAdd).map(Class::getName).collect(Collectors.joining(", ")));
			FeatureUtils.registerForAnyInstantiation(toAdd);
		} catch (NoSuchFieldException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
