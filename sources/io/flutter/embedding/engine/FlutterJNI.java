package io.flutter.embedding.engine;

import O2.d;
import P2.f;
import X2.u;
import Y2.o;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import android.view.Surface;
import g3.C0639c;
import io.flutter.embedding.engine.a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.m;
import io.flutter.plugin.platform.t;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry;
import io.flutter.view.d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o1.C0818c;

public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static b asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private a accessibilityDelegate;
    private Q2.a deferredComponentManager;
    private final Set<a.b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<m> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private Z2.a localizationPlugin;
    private final Looper mainLooper = Looper.getMainLooper();
    private Long nativeShellHolderId;
    private f platformMessageHandler;
    private t platformViewsController;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();

    public interface a {
        void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr);

        void c(ByteBuffer byteBuffer, String[] strArr);
    }

    public interface b {
        void a(long j4);
    }

    public static class c {
        public FlutterJNI a() {
            return new FlutterJNI();
        }
    }

    private static void asyncWaitForVsync(long j4) {
        b bVar = asyncWaitForVsyncDelegate;
        if (bVar != null) {
            bVar.a(j4);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j4) {
        try {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new d(j4));
        } catch (IOException e4) {
            M2.b.c(TAG, "Failed to decode image", e4);
            return null;
        }
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() != this.mainLooper) {
            throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
        }
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i4, ByteBuffer byteBuffer) {
        f fVar = this.platformMessageHandler;
        if (fVar != null) {
            fVar.g(i4, byteBuffer);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j4, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j4, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j4);

    private native void nativeDeferredComponentInstallFailure(int i4, String str, boolean z4);

    private native void nativeDestroy(long j4);

    private native void nativeDispatchEmptyPlatformMessage(long j4, String str, int i4);

    private native void nativeDispatchPlatformMessage(long j4, String str, ByteBuffer byteBuffer, int i4, int i5);

    private native void nativeDispatchPointerDataPacket(long j4, ByteBuffer byteBuffer, int i4);

    private native void nativeDispatchSemanticsAction(long j4, int i4, int i5, ByteBuffer byteBuffer, int i6);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i4);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i4);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i4);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i4);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i4);

    private native Bitmap nativeGetBitmap(long j4);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j4, int i4, int i5);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j4);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j4, int i4);

    private native void nativeInvokePlatformMessageResponseCallback(long j4, int i4, ByteBuffer byteBuffer, int i5);

    private native void nativeLoadDartDeferredLibrary(long j4, int i4, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j4);

    private native void nativeMarkTextureFrameAvailable(long j4, long j5);

    private native void nativeNotifyLowMemoryWarning(long j4);

    private native void nativeOnVsync(long j4, long j5, long j6);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j4, long j5, WeakReference<TextureRegistry.ImageConsumer> weakReference);

    private native void nativeRegisterTexture(long j4, long j5, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j4, String str, String str2, String str3, AssetManager assetManager, List<String> list);

    private native void nativeScheduleFrame(long j4);

    private native void nativeSetAccessibilityFeatures(long j4, int i4);

    private native void nativeSetSemanticsEnabled(long j4, boolean z4);

    private native void nativeSetViewportMetrics(long j4, float f4, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3);

    private native boolean nativeShouldDisableAHB();

    private native FlutterJNI nativeSpawn(long j4, String str, String str2, String str3, List<String> list);

    private native void nativeSurfaceChanged(long j4, int i4, int i5);

    private native void nativeSurfaceCreated(long j4, Surface surface);

    private native void nativeSurfaceDestroyed(long j4);

    private native void nativeSurfaceWindowChanged(long j4, Surface surface);

    private native void nativeUnregisterTexture(long j4, long j5);

    private native void nativeUpdateDisplayMetrics(long j4);

    private native void nativeUpdateJavaAssetManager(long j4, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f4);

    private void onPreEngineRestart() {
        for (a.b b4 : this.engineLifecycleListeners) {
            b4.b();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.c(byteBuffer, strArr);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.b(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean ShouldDisableAHB() {
        return nativeShouldDisableAHB();
    }

    public void addEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(mVar);
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j4) {
        nativeCleanupMessageData(j4);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < strArr.length; i4 += 3) {
            String str = strArr[i4];
            String str2 = strArr[i4 + 1];
            String str3 = strArr[i4 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        Locale c4 = this.localizationPlugin.c(arrayList);
        return c4 == null ? new String[0] : new String[]{c4.getLanguage(), c4.getCountry(), c4.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        t tVar = this.platformViewsController;
        if (tVar != null) {
            return tVar.K();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void deferredComponentInstallFailure(int i4, String str, boolean z4) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i4, str, z4);
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        t tVar = this.platformViewsController;
        if (tVar != null) {
            tVar.N();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i4);
            return;
        }
        M2.b.g(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i4);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i4, int i5) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i4, i5);
            return;
        }
        M2.b.g(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i5);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i4);
    }

    public void dispatchSemanticsAction(int i4, d.g gVar) {
        dispatchSemanticsAction(i4, gVar, (Object) null);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public float getScaledFontSize(float f4, int i4) {
        DisplayMetrics b4 = u.b(i4);
        if (b4 != null) {
            return TypedValue.applyDimension(2, f4, b4) / b4.density;
        }
        M2.b.b(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i4) + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i4, long j4) {
        f fVar = this.platformMessageHandler;
        if (fVar != null) {
            fVar.h(str, byteBuffer, i4, j4);
        } else {
            nativeCleanupMessageData(j4);
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j4) {
        if (initCalled) {
            M2.b.g(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j4);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i4) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i4);
            } else {
                M2.b.g(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i4);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i4, ByteBuffer byteBuffer, int i5) {
        if (byteBuffer.isDirect()) {
            this.shellHolderLock.readLock().lock();
            try {
                if (isAttached()) {
                    nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i4, byteBuffer, i5);
                } else {
                    M2.b.g(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i4);
                }
            } finally {
                this.shellHolderLock.readLock().unlock();
            }
        } else {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i4) {
        return nativeFlutterTextUtilsIsEmoji(i4);
    }

    public boolean isCodePointEmojiModifier(int i4) {
        return nativeFlutterTextUtilsIsEmojiModifier(i4);
    }

    public boolean isCodePointEmojiModifierBase(int i4) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i4);
    }

    public boolean isCodePointRegionalIndicator(int i4) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i4);
    }

    public boolean isCodePointVariantSelector(int i4) {
        return nativeFlutterTextUtilsIsVariationSelector(i4);
    }

    public void loadDartDeferredLibrary(int i4, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i4, strArr);
    }

    public void loadLibrary(Context context) {
        if (loadLibraryCalled) {
            M2.b.g(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        C0818c.a(context, "flutter");
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j4);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        t tVar = this.platformViewsController;
        if (tVar != null) {
            tVar.h0();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int i4, int i5, int i6, int i7, int i8) {
        ensureRunningOnMainThread();
        t tVar = this.platformViewsController;
        if (tVar != null) {
            tVar.j0(i4, i5, i6, i7, i8);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(int i4, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        t tVar = this.platformViewsController;
        if (tVar != null) {
            tVar.k0(i4, i5, i6, i7, i8, i9, i10, flutterMutatorsStack);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        t tVar = this.platformViewsController;
        if (tVar != null) {
            tVar.l0();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (m g4 : this.flutterUiDisplayListeners) {
            g4.g();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (m d4 : this.flutterUiDisplayListeners) {
            d4.d();
        }
    }

    public void onSurfaceChanged(int i4, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i4, i5);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j4, long j5, long j6) {
        nativeOnVsync(j4, j5, j6);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            M2.b.g(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j4, TextureRegistry.ImageConsumer imageConsumer) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j4, new WeakReference(imageConsumer));
    }

    public void registerTexture(long j4, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j4, new WeakReference(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(mVar);
    }

    public void requestDartDeferredLibrary(int i4) {
        M2.b.b(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(a aVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = aVar;
    }

    public void setAccessibilityFeatures(int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i4);
        }
    }

    public void setAccessibilityFeaturesInNative(int i4) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i4);
    }

    public void setAsyncWaitForVsyncDelegate(b bVar) {
        asyncWaitForVsyncDelegate = bVar;
    }

    public void setDeferredComponentManager(Q2.a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void setLocalizationPlugin(Z2.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(f fVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = fVar;
    }

    public void setPlatformViewsController(t tVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = tVar;
    }

    public void setRefreshRateFPS(float f4) {
        refreshRateFPS = f4;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z4);
        }
    }

    public void setSemanticsEnabledInNative(boolean z4) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z4);
    }

    public void setViewportMetrics(float f4, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f4, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, iArr, iArr2, iArr3);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list);
        Long l4 = nativeSpawn.nativeShellHolderId;
        C0639c.a((l4 == null || l4.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    public void unregisterTexture(long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j4);
    }

    public void updateDisplayMetrics(int i4, float f4, float f5, float f6) {
        displayWidth = f4;
        displayHeight = f5;
        displayDensity = f6;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i4, d.g gVar, Object obj) {
        ByteBuffer byteBuffer;
        int i5;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = o.f3778a.a(obj);
            i5 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i5 = 0;
        }
        dispatchSemanticsAction(i4, gVar.f10690e, byteBuffer, i5);
    }

    public void dispatchSemanticsAction(int i4, int i5, ByteBuffer byteBuffer, int i6) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i4, i5, byteBuffer, i6);
    }
}
