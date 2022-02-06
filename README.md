# gdx-graalhelper
[![Java CI with Gradle](https://github.com/anyicomplex/gdx-graalhelper/actions/workflows/gradle.yml/badge.svg)](https://github.com/anyicomplex/gdx-graalhelper/actions/workflows/gradle.yml)
[![Publish to Maven Central](https://github.com/anyicomplex/gdx-graalhelper/actions/workflows/gradle-publish.yml/badge.svg)](https://github.com/anyicomplex/gdx-graalhelper/actions/workflows/gradle-publish.yml)

Experimental helper for [libGDX](https://libgdx.com/) to build [GraalVM](https://www.graalvm.org/) native-image.  
**Note: This library is now beta version, should has some bugs and cannot provide any guarantee of success build.**

## Current state
- Support of LWJGL3 backend v1.10.0
- Support of MOE backend (third-party)
- Support of libGDX official extensions (working in progress)

## Examples
https://github.com/anyicomplex/gdx-native-image-example  
https://github.com/anyicomplex/unlucky-ae

## Usage
### 1. Add this repo to your project dependency
Step 1. Add the Maven Central repository to your build file
```groovy
allprojects {
	repositories {
		...
		mavenCentral()
	}
}
```

Step 2. Add the dependency
```groovy
dependencies {
	implementation 'io.github.anyicomplex:gdx-graalhelper:1.10.0-beta3'
	implementation 'io.github.anyicomplex:gdx-graalhelper-backend-lwjgl3:1.10.0-beta3'     // LWJGL3
	implementation 'io.github.anyicomplex:gdx-graalhelper-backend-moe:1.10.0-beta3'        // MOE
	implementation 'io.github.anyicomplex:gdx-graalhelper-extension-box2d:1.10.0-beta3'    // Box2D
	implementation 'io.github.anyicomplex:gdx-graalhelper-extension-bullet:1.10.0-beta3'   // Bullet
	implementation 'io.github.anyicomplex:gdx-graalhelper-extension-freetype:1.10.0-beta3' // FreeType
    
    implementation 'io.github.anyicomplex:gdx-graalhelper-extension-controllers-lwjgl3:2.2.1-beta3' // Controllers
}
```
### 2. Set the shared library path (LWJGL3 backend only)
You can either add `Lwjgl3NativeImageUtils.setupSharedLibraryPath(String libPath)` to your Launcher's `main(String[] args)`
```java
public static void main(String[] args) {
    // Ensure that path has been set before Lwjgl3Application initialization
    Lwjgl3NativeImageUtils.setupSharedLibraryPath(); // equal as Lwjgl3NativeImageUtils.setSharedLibraryPath(".");
    /*Code*/
    createApplication();
}
```
or set jvmFlag `org.lwjgl.librarypath`  
At run time:  
either
```java
System.setProperty("org.lwjgl.librarypath", /*Your shared library path*/); // equals as Lwjgl3NativeImageUtils.setSharedLibraryPath(String libPath);
```
or
```sh
java /*args*/ -Dorg.lwjgl.librarypath=<Your shared library path> /*args*/
```
At build time:
```sh
native-image /*args*/ -Dorg.lwjgl.librarypath=<Your shared library path> /*args*/
```
### 3. Make fat-jar, then build native-image
You need at least [GraalVM](https://www.graalvm.org/) CE (or EE) v21.3.0 to build.  
For more information of GraalVM `native-image`, please follow [here](https://www.graalvm.org/reference-manual/native-image/) :)  
You should pass `--report-unsupported-elements-at-runtime` arg to `native-image`, otherwise it will build a fallback image.  
`native-image --report-unsupported-elements-at-runtime -jar <jarName>.jar` has work on **MY MACHINE**.
### 4. Copy shared libraries and assets
Shared libraries can be found at dependency jars, or you can also extract them from the built fat-jar.  
Put them to `org.lwjgl.librarypath` directory.  
Assets should be put at the same path of built native-image.
### 5. All done. Now you can try to run built native-image!

## License
[Apache 2.0](https://github.com/anyicomplex/gdx-graalhelper/blob/master/LICENSE)

## Special thanks
[Berstanio](https://github.com/Berstanio)
