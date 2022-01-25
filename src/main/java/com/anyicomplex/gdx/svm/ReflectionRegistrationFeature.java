package com.anyicomplex.gdx.svm;

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

@AutomaticFeature
public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {
        // libGDX
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.BitmapFont.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.audio.Music.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.Pixmap.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.audio.Sound.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.TextureAtlas.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.Texture.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Skin.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.ParticleEffect.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.ParticleEffect.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.PolygonRegion.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.Model.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.glutils.ShaderProgram.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.Cubemap.class);
        RuntimeReflection.register(com.badlogic.gdx.files.FileHandle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.GlyphLayout.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.Color.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g2d.Sprite.class);
        FeatureUtils.registerForAnyInstantiation(int[].class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.model.Node.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.math.Matrix4.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.model.data.ModelMeshPart.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.VertexAttribute.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.ModelInstance.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.ParticleController.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.utils.Array.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.ResourceData.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.ResourceData.SaveData.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.ResourceData.AssetData.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.renderers.BillboardControllerRenderData.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.renderers.PointSpriteControllerRenderData.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.RangedNumericValue.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.GradientColorValue.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencer.AspectTextureRegion.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue.SpawnSide.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.attributes.DirectionalLightsAttribute.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.attributes.PointLightsAttribute.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.graphics.g3d.attributes.SpotLightsAttribute.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.math.CumulativeDistribution.CumulativeValue.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.Net.HttpRequest.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.math.Rectangle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.Actor.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.InputEvent.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.Stage.TouchFocus.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.AddAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RemoveAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.MoveToAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.MoveByAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.SizeToAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.SizeByAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RotateToAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RotateByAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.ColorAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.AlphaAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.VisibleAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.TouchableAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.DelayAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.TimeScaleAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.SequenceAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.ParallelAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RepeatAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RunnableAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.LayoutAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.AfterAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.AddListenerAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.actions.RemoveListenerAction.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Image.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.ProgressBar.ProgressBarStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.TextTooltip.TextTooltipStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Touchpad.TouchpadStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Tree.TreeStyle.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.Drawable.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedDrawable.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable.class);
        FeatureUtils.registerForAnyInstantiation(Object.class);
        FeatureUtils.registerForAnyInstantiation(String.class);
        FeatureUtils.registerForAnyInstantiation(Integer.class);
        FeatureUtils.registerForAnyInstantiation(Boolean.class);
        FeatureUtils.registerForAnyInstantiation(Float.class);
        FeatureUtils.registerForAnyInstantiation(Long.class);
        FeatureUtils.registerForAnyInstantiation(Double.class);
        FeatureUtils.registerForAnyInstantiation(Short.class);
        FeatureUtils.registerForAnyInstantiation(Byte.class);
        FeatureUtils.registerForAnyInstantiation(Character.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.utils.Queue.class);
        FeatureUtils.registerForAnyInstantiation(java.util.ArrayList.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.utils.ObjectMap.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.utils.ObjectIntMap.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.utils.ObjectFloatMap.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.utils.ObjectSet.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.utils.IntMap.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.utils.LongMap.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.utils.IntSet.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.utils.ArrayMap.class);
        FeatureUtils.registerForAnyInstantiation(java.util.HashMap.class);
        FeatureUtils.registerForAnyInstantiation(Enum.class);
        FeatureUtils.registerForAnyInstantiation(java.util.Collection.class);
        FeatureUtils.registerForAnyInstantiation(com.badlogic.gdx.utils.Json.Serializable.class);
        FeatureUtils.registerForAnyInstantiation(java.util.Map.class);
        FeatureUtils.registerForAnyInstantiation(Deprecated.class);
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

}
