package com.anyicomplex.gdx.lwjgl3;

import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

@AutomaticFeature
public class ReflectionRegistrationFeature implements Feature {

    @Override
    public void beforeAnalysis(BeforeAnalysisAccess access) {

        boolean isWindows = System.getProperty("os.name").contains("Windows");
        boolean isLinux = System.getProperty("os.name").contains("Linux");
        boolean isMac = System.getProperty("os.name").contains("Mac");

        try {
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
            RuntimeReflection.register(java.io.File.class.getMethod("canExecute"));
            RuntimeReflection.register(java.io.File.class.getMethod("setExecutable", boolean.class, boolean.class));
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

            // LWJGL3 backend
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Ogg.Sound.class);
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Ogg.Music.class);
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Wav.Sound.class);
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Wav.Music.class);
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Mp3.Sound.class);
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Mp3.Music.class);
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Ogg.Sound.class.getConstructor(
                    com.badlogic.gdx.backends.lwjgl3.audio.OpenALLwjgl3Audio.class, com.badlogic.gdx.files.FileHandle.class));
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Ogg.Music.class.getConstructor(
                    com.badlogic.gdx.backends.lwjgl3.audio.OpenALLwjgl3Audio.class, com.badlogic.gdx.files.FileHandle.class));
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Wav.Sound.class.getConstructor(
                    com.badlogic.gdx.backends.lwjgl3.audio.OpenALLwjgl3Audio.class, com.badlogic.gdx.files.FileHandle.class));
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Wav.Music.class.getConstructor(
                    com.badlogic.gdx.backends.lwjgl3.audio.OpenALLwjgl3Audio.class, com.badlogic.gdx.files.FileHandle.class));
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Mp3.Sound.class.getConstructor(
                    com.badlogic.gdx.backends.lwjgl3.audio.OpenALLwjgl3Audio.class, com.badlogic.gdx.files.FileHandle.class));
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.Mp3.Music.class.getConstructor(
                    com.badlogic.gdx.backends.lwjgl3.audio.OpenALLwjgl3Audio.class, com.badlogic.gdx.files.FileHandle.class));
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.audio.OpenALMusic.class);
            RuntimeReflection.register(com.badlogic.gdx.LifecycleListener.class);
            RuntimeReflection.register(java.nio.Buffer.class);
            RuntimeReflection.register(java.nio.Buffer.class.getDeclaredField("address"));
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window.class);

            // JLayer
            RuntimeReflection.register(javazoom.jl.decoder.SynthesisFilter.class);

            // LWJGL3
            registerForAnyInstantiation(org.lwjgl.CLongBuffer.class);
            registerForAnyInstantiation(org.lwjgl.PointerBuffer.class);
            RuntimeReflection.register(org.lwjgl.system.APIUtil.class);
            RuntimeReflection.register(org.lwjgl.system.CallbackI.V.class.getDeclaredMethod("callback", long.class));
            RuntimeReflection.register(org.lwjgl.system.CallbackI.Z.class.getDeclaredMethod("callback", long.class));
            RuntimeReflection.register(org.lwjgl.system.CallbackI.B.class.getDeclaredMethod("callback", long.class));
            RuntimeReflection.register(org.lwjgl.system.CallbackI.S.class.getDeclaredMethod("callback", long.class));
            RuntimeReflection.register(org.lwjgl.system.CallbackI.I.class.getDeclaredMethod("callback", long.class));
            RuntimeReflection.register(org.lwjgl.system.CallbackI.J.class.getDeclaredMethod("callback", long.class));
            RuntimeReflection.register(org.lwjgl.system.CallbackI.N.class.getDeclaredMethod("callback", long.class));
            RuntimeReflection.register(org.lwjgl.system.CallbackI.F.class.getDeclaredMethod("callback", long.class));
            RuntimeReflection.register(org.lwjgl.system.CallbackI.D.class.getDeclaredMethod("callback", long.class));
            RuntimeReflection.register(org.lwjgl.system.CallbackI.P.class.getDeclaredMethod("callback", long.class));
            RuntimeReflection.register(org.lwjgl.system.Library.class);
            RuntimeReflection.register(ClassLoader.class.getDeclaredMethod("findLibrary", String.class));
            RuntimeReflection.register(org.lwjgl.system.LibraryResource.class);
            RuntimeReflection.register(org.lwjgl.system.MemoryStack.class);
            //RuntimeReflection.register(java.lang.Object.class);
            RuntimeReflection.register(sun.misc.Unsafe.class);
            RuntimeReflection.register(sun.misc.Unsafe.class.getDeclaredFields());
            RuntimeReflection.register(sun.misc.Unsafe.class.getDeclaredMethod("arrayIndexScale", Class.class));
            RuntimeReflection.register(sun.misc.Unsafe.class.getDeclaredMethod("objectFieldOffset", java.lang.reflect.Field.class));
            RuntimeReflection.register(org.lwjgl.system.Pointer.Default.class.getDeclaredField("address"));
            RuntimeReflection.register(org.lwjgl.system.CustomBuffer.class);
            RuntimeReflection.register(org.lwjgl.system.CustomBuffer.class.getDeclaredField("container"));
            RuntimeReflection.register(org.lwjgl.system.CustomBuffer.class.getDeclaredField("mark"));
            RuntimeReflection.register(org.lwjgl.system.CustomBuffer.class.getDeclaredField("position"));
            RuntimeReflection.register(org.lwjgl.system.CustomBuffer.class.getDeclaredField("limit"));
            RuntimeReflection.register(org.lwjgl.system.CustomBuffer.class.getDeclaredField("capacity"));
            //RuntimeReflection.register(org.lwjgl.system.Struct.class.getDeclaredField("container"));
            registerForAnyInstantiation(org.lwjgl.system.jni.JNINativeMethod.class);
            RuntimeReflection.register(java.nio.ByteBuffer.class);
            RuntimeReflection.register(java.nio.ShortBuffer.class);
            RuntimeReflection.register(java.nio.CharBuffer.class);
            RuntimeReflection.register(java.nio.IntBuffer.class);
            RuntimeReflection.register(java.nio.LongBuffer.class);
            RuntimeReflection.register(java.nio.FloatBuffer.class);
            RuntimeReflection.register(java.nio.DoubleBuffer.class);
            RuntimeReflection.register(org.lwjgl.system.MemoryUtil.MemoryAllocator.class);
            registerForAnyInstantiation(org.lwjgl.system.Struct.class);
            // Platform APIs
            if (isWindows) {
                registerForAnyInstantiation(org.lwjgl.system.windows.DEVMODE.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.DEVMODE.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.DISPLAY_DEVICE.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.DISPLAY_DEVICE.Buffer.class);
                RuntimeReflection.register(org.lwjgl.system.windows.GDI32.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.HARDWAREINPUT.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.HARDWAREINPUT.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.INPUT.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.INPUT.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.KEYBDINPUT.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.KEYBDINPUT.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.MONITORINFOEX.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.MONITORINFOEX.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.MOUSEINPUT.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.MOUSEINPUT.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.MSG.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.MSG.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.POINT.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.POINT.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.POINTL.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.POINTL.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.RECT.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.RECT.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.SECURITY_ATTRIBUTES.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.TOUCHINPUT.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.TOUCHINPUT.Buffer.class);
                RuntimeReflection.register(org.lwjgl.system.windows.User32.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.WINDOWPLACEMENT.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.WNDCLASSEX.class);
                registerForAnyInstantiation(org.lwjgl.system.windows.WNDCLASSEX.Buffer.class);
            }
            else if (isLinux) {
                registerForAnyInstantiation(org.lwjgl.system.linux.Visual.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.Visual.Buffer.class);
                RuntimeReflection.register(org.lwjgl.system.linux.X11.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XAnyEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XAnyEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XButtonEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XButtonEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XCirculateEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XCirculateEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XCirculateRequestEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XCirculateRequestEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XClientMessageEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XClientMessageEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XColormapEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XColormapEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XConfigureEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XConfigureEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XConfigureRequestEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XConfigureRequestEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XCreateWindowEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XCreateWindowEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XCrossingEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XCrossingEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XDestroyWindowEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XDestroyWindowEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XErrorEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XErrorEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XExposeEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XExposeEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XFocusChangeEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XFocusChangeEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XGenericEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XGenericEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XGenericEventCookie.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XGenericEventCookie.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XGraphicsExposeEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XGraphicsExposeEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XGravityEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XGravityEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XKeyEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XKeyEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XKeymapEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XKeymapEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XMapEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XMapEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XMappingEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XMappingEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XMapRequestEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XMapRequestEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XMotionEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XMotionEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XNoExposeEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XNoExposeEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XPropertyEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XPropertyEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XReparentEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XReparentEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XResizeRequestEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XResizeRequestEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XSelectionClearEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XSelectionClearEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XSelectionEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XSelectionEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XSelectionRequestEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XSelectionRequestEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XSetWindowAttributes.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XSetWindowAttributes.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XTimeCoord.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XTimeCoord.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XUnmapEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XUnmapEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XVisibilityEvent.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XVisibilityEvent.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XVisualInfo.class);
                registerForAnyInstantiation(org.lwjgl.system.linux.XVisualInfo.Buffer.class);
            }
            else if (isMac) {
                registerForAnyInstantiation(org.lwjgl.system.macosx.CGEventTapInformation.class);
                registerForAnyInstantiation(org.lwjgl.system.macosx.CGEventTapInformation.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.macosx.CGPoint.class);
                registerForAnyInstantiation(org.lwjgl.system.macosx.CGPoint.Buffer.class);
                RuntimeReflection.register(org.lwjgl.system.macosx.CoreGraphics.class);
                RuntimeReflection.register(org.lwjgl.system.macosx.LibSystem.class);
                registerForAnyInstantiation(org.lwjgl.system.macosx.ObjCMethodDescription.class);
                registerForAnyInstantiation(org.lwjgl.system.macosx.ObjCMethodDescription.Buffer.class);
                registerForAnyInstantiation(org.lwjgl.system.macosx.ObjCPropertyAttribute.class);
                registerForAnyInstantiation(org.lwjgl.system.macosx.ObjCPropertyAttribute.Buffer.class);
                RuntimeReflection.register(org.lwjgl.system.macosx.ObjCRuntime.class);
            }

            // LWJGL3 GLFW
            RuntimeReflection.register(org.lwjgl.glfw.GLFW.class);
            RuntimeReflection.register(org.lwjgl.glfw.GLFW.class.getDeclaredFields());
            RuntimeReflection.register(org.lwjgl.glfw.GLFWErrorCallback.class);
            registerForAnyInstantiation(org.lwjgl.glfw.GLFWGamepadState.class);
            registerForAnyInstantiation(org.lwjgl.glfw.GLFWGamepadState.Buffer.class);
            registerForAnyInstantiation(org.lwjgl.glfw.GLFWGammaRamp.class);
            registerForAnyInstantiation(org.lwjgl.glfw.GLFWGammaRamp.Buffer.class);
            registerForAnyInstantiation(org.lwjgl.glfw.GLFWImage.class);
            registerForAnyInstantiation(org.lwjgl.glfw.GLFWImage.Buffer.class);
            registerForAnyInstantiation(org.lwjgl.glfw.GLFWVidMode.class);
            registerForAnyInstantiation(org.lwjgl.glfw.GLFWVidMode.Buffer.class);

            // LWJGL3 jemalloc
            registerForAnyInstantiation(org.lwjgl.system.jemalloc.ExtentHooks.class);
            RuntimeReflection.register(org.lwjgl.system.jemalloc.JEmalloc.class);

            // LWJGL3 OpenAL
            RuntimeReflection.register(org.lwjgl.openal.ALC.class);
            RuntimeReflection.register(org.lwjgl.openal.ALCapabilities.class);
            RuntimeReflection.register(org.lwjgl.openal.ALCapabilities.class.getFields());

            // LWJGL3 OpenGL
            RuntimeReflection.register(org.lwjgl.opengl.GL.class);
            RuntimeReflection.register(org.lwjgl.opengl.GLCapabilities.class);
            RuntimeReflection.register(org.lwjgl.opengl.GLCapabilities.class.getFields());
            registerForAnyInstantiation(org.lwjgl.opengl.GLXStereoNotifyEventEXT.class);
            registerForAnyInstantiation(org.lwjgl.opengl.GLXStereoNotifyEventEXT.Buffer.class);
            registerForAnyInstantiation(org.lwjgl.opengl.GPU_DEVICE.class);
            registerForAnyInstantiation(org.lwjgl.opengl.GPU_DEVICE.Buffer.class);
        }
        catch (NoSuchMethodException | NoSuchFieldException e) {
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
