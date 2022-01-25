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
