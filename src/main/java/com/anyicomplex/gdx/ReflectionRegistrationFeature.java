package com.anyicomplex.gdx;

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

@AutomaticFeature
public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        // libGDX
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.BitmapFont.class);
        registerForAnyInstantiation(com.badlogic.gdx.audio.Music.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.Pixmap.class);
        registerForAnyInstantiation(com.badlogic.gdx.audio.Sound.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.TextureAtlas.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.Texture.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Skin.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.ParticleEffect.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.ParticleEffect.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.PolygonRegion.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.Model.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.glutils.ShaderProgram.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.Cubemap.class);
        RuntimeReflection.register(com.badlogic.gdx.files.FileHandle.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.GlyphLayout.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.Color.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.Sprite.class);
        registerForAnyInstantiation(int[].class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.model.Node.class);
        registerForAnyInstantiation(com.badlogic.gdx.math.Matrix4.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.VertexAttribute.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.ModelInstance.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.ParticleController.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter.class);
        registerForAnyInstantiation(com.badlogic.gdx.utils.Array.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.ResourceData.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.ResourceData.SaveData.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.ResourceData.AssetData.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.renderers.BillboardControllerRenderData.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.renderers.PointSpriteControllerRenderData.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.RangedNumericValue.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.GradientColorValue.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencer.AspectTextureRegion.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue.SpawnSide.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.attributes.DirectionalLightsAttribute.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.attributes.PointLightsAttribute.class);
        registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.attributes.SpotLightsAttribute.class);
        registerForAnyInstantiation(com.badlogic.gdx.math.CumulativeDistribution.CumulativeValue.class);
        registerForAnyInstantiation(com.badlogic.gdx.Net.HttpRequest.class);
        registerForAnyInstantiation(com.badlogic.gdx.math.Rectangle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.Actor.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.InputEvent.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.Stage.TouchFocus.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.AddAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RemoveAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.MoveToAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.MoveByAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.SizeToAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.SizeByAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RotateToAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RotateByAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.ColorAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.AlphaAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.VisibleAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.TouchableAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.DelayAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.TimeScaleAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.SequenceAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.ParallelAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RepeatAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RunnableAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.LayoutAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.AfterAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.AddListenerAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RemoveListenerAction.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Image.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.ProgressBar.ProgressBarStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.TextTooltip.TextTooltipStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Touchpad.TouchpadStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Tree.TreeStyle.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.Drawable.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedDrawable.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable.class);
        registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable.class);
        registerForAnyInstantiation(Object.class);
        registerForAnyInstantiation(String.class);
        registerForAnyInstantiation(Integer.class);
        registerForAnyInstantiation(Boolean.class);
        registerForAnyInstantiation(Float.class);
        registerForAnyInstantiation(Long.class);
        registerForAnyInstantiation(Double.class);
        registerForAnyInstantiation(Short.class);
        registerForAnyInstantiation(Byte.class);
        registerForAnyInstantiation(Character.class);
        registerForAnyInstantiation(com.badlogic.gdx.utils.Queue.class);
        registerForAnyInstantiation(java.util.ArrayList.class);
        registerForAnyInstantiation(com.badlogic.gdx.utils.ObjectMap.class);
        registerForAnyInstantiation(com.badlogic.gdx.utils.ObjectIntMap.class);
        registerForAnyInstantiation(com.badlogic.gdx.utils.ObjectFloatMap.class);
        registerForAnyInstantiation(com.badlogic.gdx.utils.ObjectSet.class);
        registerForAnyInstantiation(com.badlogic.gdx.utils.IntMap.class);
        registerForAnyInstantiation(com.badlogic.gdx.utils.LongMap.class);
        registerForAnyInstantiation(com.badlogic.gdx.utils.IntSet.class);
        registerForAnyInstantiation(com.badlogic.gdx.utils.ArrayMap.class);
        registerForAnyInstantiation(java.util.HashMap.class);
        registerForAnyInstantiation(Enum.class);
        registerForAnyInstantiation(java.util.Collection.class);
        registerForAnyInstantiation(com.badlogic.gdx.utils.Json.Serializable.class);
        registerForAnyInstantiation(java.util.Map.class);
        registerForAnyInstantiation(Deprecated.class);
        RuntimeReflection.register(com.badlogic.gdx.utils.SharedLibraryLoader.class);

        RuntimeReflection.register(com.badlogic.gdx.math.Circle.class);
        RuntimeReflection.register(com.badlogic.gdx.math.Ellipse.class);
        RuntimeReflection.register(com.badlogic.gdx.math.GridPoint2.class);
        RuntimeReflection.register(com.badlogic.gdx.math.GridPoint3.class);
        //RuntimeReflection.register(com.badlogic.gdx.math.Rectangle.class);
        RuntimeReflection.register(com.badlogic.gdx.math.Vector2.class);
        RuntimeReflection.register(com.badlogic.gdx.math.Vector3.class);
        RuntimeReflection.register(com.badlogic.gdx.math.collision.Ray.class);
        RuntimeReflection.register(com.badlogic.gdx.math.collision.Segment.class);
        RuntimeReflection.register(com.badlogic.gdx.math.collision.Sphere.class);
        RuntimeReflection.register(com.badlogic.gdx.scenes.scene2d.Action.class);
        //RuntimeReflection.register(com.badlogic.gdx.scenes.scene2d.ui.Image.class);
        RuntimeReflection.register(com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable.class);
        RuntimeReflection.register(com.badlogic.gdx.utils.Bits.class);
        RuntimeReflection.register(com.badlogic.gdx.utils.I18NBundle.class);
        RuntimeReflection.register(StringBuilder.class);
        RuntimeReflection.register(com.badlogic.gdx.utils.Timer.class);

        RuntimeReflection.register(java.nio.ByteBuffer.class);
        RuntimeReflection.register(java.nio.ShortBuffer.class);
        RuntimeReflection.register(java.nio.CharBuffer.class);
        RuntimeReflection.register(java.nio.IntBuffer.class);
        RuntimeReflection.register(java.nio.LongBuffer.class);
        RuntimeReflection.register(java.nio.FloatBuffer.class);
        RuntimeReflection.register(java.nio.DoubleBuffer.class);
        RuntimeReflection.register(java.nio.Buffer.class);

        RuntimeReflection.register(com.badlogic.gdx.LifecycleListener.class);

        try {
            RuntimeReflection.register(java.io.File.class.getMethod("canExecute"));
            RuntimeReflection.register(java.io.File.class.getMethod("setExecutable", boolean.class, boolean.class));
        } catch (NoSuchMethodException e) {
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
