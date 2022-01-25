package com.anyicomplex.gdx.lwjgl3.svm;

import com.anyicomplex.gdx.svm.FeatureUtils;
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

        // This is currently fail hard implemented. So if there is somehow a mismatch between lwjgl3 versions it is possible, that the lib wont work at all
        try {
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
            RuntimeReflection.register(java.nio.Buffer.class.getDeclaredField("address"));
            RuntimeReflection.register(com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window.class);

            // JLayer
            RuntimeReflection.register(javazoom.jl.decoder.SynthesisFilter.class);

            // LWJGL3
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.CLongBuffer.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.PointerBuffer.class);
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
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.jni.JNINativeMethod.class);

            RuntimeReflection.register(org.lwjgl.system.MemoryUtil.MemoryAllocator.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.Struct.class);
            // Platform APIs
            if (isWindows) {
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.DEVMODE.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.DEVMODE.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.DISPLAY_DEVICE.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.DISPLAY_DEVICE.Buffer.class);
                RuntimeReflection.register(org.lwjgl.system.windows.GDI32.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.HARDWAREINPUT.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.HARDWAREINPUT.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.INPUT.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.INPUT.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.KEYBDINPUT.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.KEYBDINPUT.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.MONITORINFOEX.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.MONITORINFOEX.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.MOUSEINPUT.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.MOUSEINPUT.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.MSG.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.MSG.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.POINT.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.POINT.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.POINTL.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.POINTL.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.RECT.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.RECT.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.SECURITY_ATTRIBUTES.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.TOUCHINPUT.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.TOUCHINPUT.Buffer.class);
                RuntimeReflection.register(org.lwjgl.system.windows.User32.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.WINDOWPLACEMENT.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.WNDCLASSEX.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.windows.WNDCLASSEX.Buffer.class);
            }
            else if (isLinux) {
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.Visual.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.Visual.Buffer.class);
                RuntimeReflection.register(org.lwjgl.system.linux.X11.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XAnyEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XAnyEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XButtonEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XButtonEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XCirculateEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XCirculateEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XCirculateRequestEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XCirculateRequestEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XClientMessageEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XClientMessageEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XColormapEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XColormapEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XConfigureEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XConfigureEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XConfigureRequestEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XConfigureRequestEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XCreateWindowEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XCreateWindowEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XCrossingEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XCrossingEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XDestroyWindowEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XDestroyWindowEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XErrorEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XErrorEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XExposeEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XExposeEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XFocusChangeEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XFocusChangeEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XGenericEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XGenericEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XGenericEventCookie.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XGenericEventCookie.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XGraphicsExposeEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XGraphicsExposeEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XGravityEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XGravityEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XKeyEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XKeyEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XKeymapEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XKeymapEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XMapEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XMapEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XMappingEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XMappingEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XMapRequestEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XMapRequestEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XMotionEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XMotionEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XNoExposeEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XNoExposeEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XPropertyEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XPropertyEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XReparentEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XReparentEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XResizeRequestEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XResizeRequestEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XSelectionClearEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XSelectionClearEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XSelectionEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XSelectionEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XSelectionRequestEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XSelectionRequestEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XSetWindowAttributes.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XSetWindowAttributes.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XTimeCoord.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XTimeCoord.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XUnmapEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XUnmapEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XVisibilityEvent.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XVisibilityEvent.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XVisualInfo.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.linux.XVisualInfo.Buffer.class);
            }
            else if (isMac) {
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.macosx.CGEventTapInformation.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.macosx.CGEventTapInformation.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.macosx.CGPoint.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.macosx.CGPoint.Buffer.class);
                RuntimeReflection.register(org.lwjgl.system.macosx.CoreGraphics.class);
                RuntimeReflection.register(org.lwjgl.system.macosx.LibSystem.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.macosx.ObjCMethodDescription.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.macosx.ObjCMethodDescription.Buffer.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.macosx.ObjCPropertyAttribute.class);
                FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.macosx.ObjCPropertyAttribute.Buffer.class);
                RuntimeReflection.register(org.lwjgl.system.macosx.ObjCRuntime.class);
            }

            // LWJGL3 GLFW
            RuntimeReflection.register(org.lwjgl.glfw.GLFW.class);
            RuntimeReflection.register(org.lwjgl.glfw.GLFW.class.getDeclaredFields());
            RuntimeReflection.register(org.lwjgl.glfw.GLFWErrorCallback.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.glfw.GLFWGamepadState.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.glfw.GLFWGamepadState.Buffer.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.glfw.GLFWGammaRamp.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.glfw.GLFWGammaRamp.Buffer.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.glfw.GLFWImage.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.glfw.GLFWImage.Buffer.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.glfw.GLFWVidMode.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.glfw.GLFWVidMode.Buffer.class);

            // LWJGL3 jemalloc
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.system.jemalloc.ExtentHooks.class);
            RuntimeReflection.register(org.lwjgl.system.jemalloc.JEmalloc.class);

            // LWJGL3 OpenAL
            RuntimeReflection.register(org.lwjgl.openal.ALC.class);
            RuntimeReflection.register(org.lwjgl.openal.ALCapabilities.class);
            RuntimeReflection.register(org.lwjgl.openal.ALCapabilities.class.getFields());

            // LWJGL3 OpenGL
            RuntimeReflection.register(org.lwjgl.opengl.GL.class);
            RuntimeReflection.register(org.lwjgl.opengl.GLCapabilities.class);
            RuntimeReflection.register(org.lwjgl.opengl.GLCapabilities.class.getFields());
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.opengl.GLXStereoNotifyEventEXT.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.opengl.GLXStereoNotifyEventEXT.Buffer.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.opengl.GPU_DEVICE.class);
            FeatureUtils.registerForAnyInstantiation(org.lwjgl.opengl.GPU_DEVICE.Buffer.class);
        }
        catch (NoSuchMethodException | NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

}
