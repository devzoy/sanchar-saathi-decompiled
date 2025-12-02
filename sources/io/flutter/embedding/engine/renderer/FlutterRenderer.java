package io.flutter.embedding.engine.renderer;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.lifecycle.C0384k;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.v;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class FlutterRenderer implements TextureRegistry {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f10351i = false;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f10352j = false;

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f10353a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicLong f10354b = new AtomicLong(0);

    /* renamed from: c  reason: collision with root package name */
    public Surface f10355c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10356d = false;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f10357e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    public final Set f10358f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public final List f10359g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final m f10360h;

    public final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.b {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_IMAGES = 5;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;
        private TextureRegistry.SurfaceProducer.a callback;
        private boolean createNewReader = true;
        private final long id;
        private boolean ignoringFence = false;
        private final ArrayDeque<b> imageReaderQueue = new ArrayDeque<>();
        private long lastDequeueTime = 0;
        private a lastDequeuedImage = null;
        private long lastQueueTime = 0;
        /* access modifiers changed from: private */
        public b lastReaderDequeuedFrom = null;
        private long lastScheduleTime = 0;
        private final Object lock = new Object();
        /* access modifiers changed from: private */
        public boolean notifiedDestroy = false;
        private int numTrims = 0;
        private final HashMap<ImageReader, b> perImageReaders = new HashMap<>();
        /* access modifiers changed from: private */
        public boolean released;
        private int requestedHeight = 1;
        private int requestedWidth = 1;

        public class a {

            /* renamed from: a  reason: collision with root package name */
            public final Image f10361a;

            /* renamed from: b  reason: collision with root package name */
            public final long f10362b;

            public a(Image image, long j4) {
                this.f10361a = image;
                this.f10362b = j4;
            }
        }

        public class b {

            /* renamed from: a  reason: collision with root package name */
            public final ImageReader f10364a;

            /* renamed from: b  reason: collision with root package name */
            public final ArrayDeque f10365b = new ArrayDeque();

            /* renamed from: c  reason: collision with root package name */
            public boolean f10366c = false;

            public b(ImageReader imageReader) {
                this.f10364a = imageReader;
                imageReader.setOnImageAvailableListener(new j(this), new Handler(Looper.getMainLooper()));
            }

            public boolean c() {
                return this.f10365b.isEmpty() && ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this;
            }

            public void d() {
                this.f10366c = true;
                this.f10364a.close();
                this.f10365b.clear();
            }

            public a e() {
                if (this.f10365b.isEmpty()) {
                    return null;
                }
                return (a) this.f10365b.removeFirst();
            }

            public boolean f() {
                return this.f10365b.isEmpty();
            }

            public final /* synthetic */ void g(ImageReader imageReader) {
                Image image;
                try {
                    image = imageReader.acquireLatestImage();
                } catch (IllegalStateException e4) {
                    M2.b.b(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e4);
                    image = null;
                }
                if (image != null) {
                    if (ImageReaderSurfaceProducer.this.released || this.f10366c) {
                        image.close();
                    } else {
                        ImageReaderSurfaceProducer.this.onImage(imageReader, image);
                    }
                }
            }

            public a h(Image image) {
                if (this.f10366c) {
                    return null;
                }
                a aVar = new a(image, System.nanoTime());
                this.f10365b.add(aVar);
                while (this.f10365b.size() > 2) {
                    ((a) this.f10365b.removeFirst()).f10361a.close();
                }
                return aVar;
            }
        }

        public ImageReaderSurfaceProducer(long j4) {
            this.id = j4;
        }

        private void cleanup() {
            synchronized (this.lock) {
                try {
                    for (b next : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == next) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        next.d();
                    }
                    this.perImageReaders.clear();
                    a aVar = this.lastDequeuedImage;
                    if (aVar != null) {
                        aVar.f10361a.close();
                        this.lastDequeuedImage = null;
                    }
                    b bVar = this.lastReaderDequeuedFrom;
                    if (bVar != null) {
                        bVar.d();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                } finally {
                }
            }
        }

        private ImageReader createImageReader() {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 33) {
                return createImageReader33();
            }
            if (i4 >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        private ImageReader createImageReader29() {
            return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 5, 256);
        }

        private ImageReader createImageReader33() {
            h.a();
            ImageReader.Builder a4 = g.a(this.requestedWidth, this.requestedHeight);
            ImageReader.Builder unused = a4.setMaxImages(5);
            ImageReader.Builder unused2 = a4.setImageFormat(34);
            ImageReader.Builder unused3 = a4.setUsage(256);
            return a4.build();
        }

        private b getActiveReader() {
            synchronized (this.lock) {
                try {
                    if (this.createNewReader) {
                        this.createNewReader = false;
                        b orCreatePerImageReader = getOrCreatePerImageReader(createImageReader());
                        return orCreatePerImageReader;
                    }
                    b peekLast = this.imageReaderQueue.peekLast();
                    return peekLast;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$dequeueImage$0() {
            if (!this.released) {
                FlutterRenderer.this.v();
            }
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
                return;
            }
            this.ignoringFence = true;
            M2.b.a(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
            FlutterRenderer.this.u(this);
            FlutterRenderer.this.f10359g.remove(this);
        }

        private void waitOnFence(Image image) {
            try {
                boolean unused = image.getFence().awaitForever();
            } catch (IOException unused2) {
            }
        }

        public Image acquireLatestImage() {
            a dequeueImage = dequeueImage();
            if (dequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(dequeueImage.f10361a);
            return dequeueImage.f10361a;
        }

        public double deltaMillis(long j4) {
            return ((double) j4) / 1000000.0d;
        }

        public a dequeueImage() {
            a aVar;
            boolean z4;
            synchronized (this.lock) {
                try {
                    Iterator<b> it = this.imageReaderQueue.iterator();
                    aVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        b next = it.next();
                        a e4 = next.e();
                        if (e4 == null) {
                            aVar = e4;
                        } else {
                            a aVar2 = this.lastDequeuedImage;
                            if (aVar2 != null) {
                                aVar2.f10361a.close();
                            }
                            this.lastDequeuedImage = e4;
                            this.lastReaderDequeuedFrom = next;
                            aVar = e4;
                        }
                    }
                    pruneImageReaderQueue();
                    Iterator<b> it2 = this.imageReaderQueue.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!it2.next().f()) {
                                z4 = true;
                                break;
                            }
                        } else {
                            z4 = false;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (z4) {
                FlutterRenderer.this.f10357e.post(new i(this));
            }
            return aVar;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        public void finalize() {
            try {
                if (!this.released) {
                    releaseInternal();
                    FlutterRenderer.this.f10357e.post(new g(this.id, FlutterRenderer.this.f10353a));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }

        public int getHeight() {
            return this.requestedHeight;
        }

        public b getOrCreatePerImageReader(ImageReader imageReader) {
            b bVar = this.perImageReaders.get(imageReader);
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b(imageReader);
            this.perImageReaders.put(imageReader, bVar2);
            this.imageReaderQueue.add(bVar2);
            return bVar2;
        }

        public Surface getSurface() {
            return getActiveReader().f10364a.getSurface();
        }

        public int getWidth() {
            return this.requestedWidth;
        }

        public boolean handlesCropAndRotation() {
            return false;
        }

        public long id() {
            return this.id;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numImages() {
            int i4;
            synchronized (this.lock) {
                try {
                    Iterator<b> it = this.imageReaderQueue.iterator();
                    i4 = 0;
                    while (it.hasNext()) {
                        i4 += it.next().f10365b.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i4;
        }

        public int numTrims() {
            int i4;
            synchronized (this.lock) {
                i4 = this.numTrims;
            }
            return i4;
        }

        public void onImage(ImageReader imageReader, Image image) {
            a h4;
            synchronized (this.lock) {
                h4 = getOrCreatePerImageReader(imageReader).h(image);
            }
            if (h4 != null) {
                FlutterRenderer.this.v();
            }
        }

        public void onTrimMemory(int i4) {
            if (i4 >= 40) {
                synchronized (this.lock) {
                    this.numTrims++;
                }
                cleanup();
                this.createNewReader = true;
            }
        }

        public void pruneImageReaderQueue() {
            b peekFirst;
            while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null && peekFirst.c()) {
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(peekFirst.f10364a);
                peekFirst.d();
            }
        }

        public void release() {
            if (!this.released) {
                releaseInternal();
                FlutterRenderer.this.D(this.id);
            }
        }

        public void scheduleFrame() {
            FlutterRenderer.this.v();
        }

        public void setCallback(TextureRegistry.SurfaceProducer.a aVar) {
        }

        public void setSize(int i4, int i5) {
            int max = Math.max(1, i4);
            int max2 = Math.max(1, i5);
            if (this.requestedWidth != max || this.requestedHeight != max2) {
                this.createNewReader = true;
                this.requestedHeight = max2;
                this.requestedWidth = max;
            }
        }
    }

    public final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        public ImageTextureRegistryEntry(long j4) {
            this.id = j4;
        }

        private void maybeWaitOnFence(Image image2) {
            if (image2 == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image2);
                return;
            }
            this.ignoringFence = true;
            M2.b.a(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
        }

        private void waitOnFence(Image image2) {
            try {
                boolean unused = image2.getFence().awaitForever();
            } catch (IOException unused2) {
            }
        }

        public Image acquireLatestImage() {
            Image image2;
            synchronized (this) {
                image2 = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image2);
            return image2;
        }

        public void finalize() {
            try {
                if (this.released) {
                    super.finalize();
                    return;
                }
                Image image2 = this.image;
                if (image2 != null) {
                    image2.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.f10357e.post(new g(this.id, FlutterRenderer.this.f10353a));
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }

        public long id() {
            return this.id;
        }

        public void pushImage(Image image2) {
            Image image3;
            if (!this.released) {
                synchronized (this) {
                    image3 = this.image;
                    this.image = image2;
                }
                if (image3 != null) {
                    M2.b.b(TAG, "Dropping PlatformView Frame");
                    image3.close();
                }
                if (image2 != null) {
                    FlutterRenderer.this.v();
                }
            }
        }

        public void release() {
            if (!this.released) {
                this.released = true;
                Image image2 = this.image;
                if (image2 != null) {
                    image2.close();
                    this.image = null;
                }
                FlutterRenderer.this.D(this.id);
            }
        }
    }

    public class a implements m {
        public a() {
        }

        public void d() {
            boolean unused = FlutterRenderer.this.f10356d = false;
        }

        public void g() {
            boolean unused = FlutterRenderer.this.f10356d = true;
        }
    }

    public class b implements DefaultLifecycleObserver {
        public b() {
        }

        public void a(C0384k kVar) {
            M2.b.f("FlutterRenderer", "onResume called; notifying SurfaceProducers");
            for (ImageReaderSurfaceProducer access$200 : FlutterRenderer.this.f10359g) {
                TextureRegistry.SurfaceProducer.a unused = access$200.getClass();
            }
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f10370a;

        /* renamed from: b  reason: collision with root package name */
        public final e f10371b;

        /* renamed from: c  reason: collision with root package name */
        public final d f10372c;

        public c(Rect rect, e eVar, d dVar) {
            this.f10370a = rect;
            this.f10371b = eVar;
            this.f10372c = dVar;
        }
    }

    public enum d {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        

        /* renamed from: e  reason: collision with root package name */
        public final int f10377e;

        /* access modifiers changed from: public */
        d(int i4) {
            this.f10377e = i4;
        }
    }

    public enum e {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        

        /* renamed from: e  reason: collision with root package name */
        public final int f10383e;

        /* access modifiers changed from: public */
        e(int i4) {
            this.f10383e = i4;
        }
    }

    public final class f implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.b {

        /* renamed from: a  reason: collision with root package name */
        public final long f10384a;

        /* renamed from: b  reason: collision with root package name */
        public final SurfaceTextureWrapper f10385b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10386c;

        /* renamed from: d  reason: collision with root package name */
        public TextureRegistry.b f10387d;

        public f(long j4, SurfaceTexture surfaceTexture) {
            this.f10384a = j4;
            this.f10385b = new SurfaceTextureWrapper(surfaceTexture, new k(this));
            surfaceTexture().setOnFrameAvailableListener(new l(this), new Handler());
        }

        public final /* synthetic */ void c() {
        }

        public final /* synthetic */ void d(SurfaceTexture surfaceTexture) {
            if (!this.f10386c && FlutterRenderer.this.f10353a.isAttached()) {
                this.f10385b.markDirty();
                FlutterRenderer.this.v();
            }
        }

        public final void e() {
            FlutterRenderer.this.u(this);
        }

        public SurfaceTextureWrapper f() {
            return this.f10385b;
        }

        public void finalize() {
            try {
                if (!this.f10386c) {
                    FlutterRenderer.this.f10357e.post(new g(this.f10384a, FlutterRenderer.this.f10353a));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }

        public long id() {
            return this.f10384a;
        }

        public void onTrimMemory(int i4) {
            TextureRegistry.b bVar = this.f10387d;
            if (bVar != null) {
                bVar.onTrimMemory(i4);
            }
        }

        public void release() {
            if (!this.f10386c) {
                M2.b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f10384a + ").");
                this.f10385b.release();
                FlutterRenderer.this.D(this.f10384a);
                e();
                this.f10386c = true;
            }
        }

        public void setOnFrameConsumedListener(TextureRegistry.a aVar) {
        }

        public void setOnTrimMemoryListener(TextureRegistry.b bVar) {
            this.f10387d = bVar;
        }

        public SurfaceTexture surfaceTexture() {
            return this.f10385b.surfaceTexture();
        }
    }

    public static final class g implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final long f10389e;

        /* renamed from: f  reason: collision with root package name */
        public final FlutterJNI f10390f;

        public g(long j4, FlutterJNI flutterJNI) {
            this.f10389e = j4;
            this.f10390f = flutterJNI;
        }

        public void run() {
            if (this.f10390f.isAttached()) {
                M2.b.f("FlutterRenderer", "Releasing a Texture (" + this.f10389e + ").");
                this.f10390f.unregisterTexture(this.f10389e);
            }
        }
    }

    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public float f10391a = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public int f10392b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f10393c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f10394d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f10395e = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f10396f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f10397g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f10398h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f10399i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f10400j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f10401k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f10402l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f10403m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f10404n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f10405o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f10406p = -1;

        /* renamed from: q  reason: collision with root package name */
        public final List f10407q = new ArrayList();

        /* renamed from: r  reason: collision with root package name */
        public final List f10408r = new ArrayList();

        public void c(List list) {
            this.f10408r.clear();
            this.f10408r.addAll(list);
        }

        public void d(List list) {
            this.f10407q.clear();
            this.f10407q.addAll(list);
        }

        public boolean e() {
            return this.f10392b > 0 && this.f10393c > 0 && this.f10391a > 0.0f;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        a aVar = new a();
        this.f10360h = aVar;
        this.f10353a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        v.o().b().a(new b());
    }

    public void A(int i4, int i5) {
        this.f10353a.onSurfaceChanged(i4, i5);
    }

    public void B(Surface surface) {
        this.f10355c = surface;
        this.f10353a.onSurfaceWindowChanged(surface);
    }

    public final void C(int[] iArr, int i4, Rect rect) {
        iArr[i4] = rect.left;
        iArr[i4 + 1] = rect.top;
        iArr[i4 + 2] = rect.right;
        iArr[i4 + 3] = rect.bottom;
    }

    public final void D(long j4) {
        this.f10353a.unregisterTexture(j4);
    }

    public TextureRegistry.ImageTextureEntry a() {
        ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.f10354b.getAndIncrement());
        M2.b.f("FlutterRenderer", "New ImageTextureEntry ID: " + imageTextureRegistryEntry.id());
        p(imageTextureRegistryEntry.id(), imageTextureRegistryEntry);
        return imageTextureRegistryEntry;
    }

    public TextureRegistry.SurfaceProducer b() {
        if (f10351i || Build.VERSION.SDK_INT < 29 || this.f10353a.ShouldDisableAHB()) {
            TextureRegistry.SurfaceTextureEntry c4 = c();
            o oVar = new o(c4.id(), this.f10357e, this.f10353a, c4);
            M2.b.f("FlutterRenderer", "New SurfaceTextureSurfaceProducer ID: " + c4.id());
            return oVar;
        }
        long andIncrement = this.f10354b.getAndIncrement();
        ImageReaderSurfaceProducer imageReaderSurfaceProducer = new ImageReaderSurfaceProducer(andIncrement);
        p(andIncrement, imageReaderSurfaceProducer);
        j(imageReaderSurfaceProducer);
        this.f10359g.add(imageReaderSurfaceProducer);
        M2.b.f("FlutterRenderer", "New ImageReaderSurfaceProducer ID: " + andIncrement);
        return imageReaderSurfaceProducer;
    }

    public TextureRegistry.SurfaceTextureEntry c() {
        M2.b.f("FlutterRenderer", "Creating a SurfaceTexture.");
        return r(new SurfaceTexture(0));
    }

    public void i(m mVar) {
        this.f10353a.addIsDisplayingFlutterUiListener(mVar);
        if (this.f10356d) {
            mVar.g();
        }
    }

    public void j(TextureRegistry.b bVar) {
        k();
        this.f10358f.add(new WeakReference(bVar));
    }

    public final void k() {
        Iterator it = this.f10358f.iterator();
        while (it.hasNext()) {
            if (((TextureRegistry.b) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
    }

    public void l(ByteBuffer byteBuffer, int i4) {
        this.f10353a.dispatchPointerDataPacket(byteBuffer, i4);
    }

    public boolean m() {
        return this.f10356d;
    }

    public boolean n() {
        return this.f10353a.getIsSoftwareRenderingEnabled();
    }

    public void o(int i4) {
        Iterator it = this.f10358f.iterator();
        while (it.hasNext()) {
            TextureRegistry.b bVar = (TextureRegistry.b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.onTrimMemory(i4);
            } else {
                it.remove();
            }
        }
    }

    public final void p(long j4, TextureRegistry.ImageConsumer imageConsumer) {
        this.f10353a.registerImageTexture(j4, imageConsumer);
    }

    public final TextureRegistry.SurfaceTextureEntry q(long j4, SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        f fVar = new f(j4, surfaceTexture);
        M2.b.f("FlutterRenderer", "New SurfaceTexture ID: " + fVar.id());
        s(fVar.id(), fVar.f());
        j(fVar);
        return fVar;
    }

    public TextureRegistry.SurfaceTextureEntry r(SurfaceTexture surfaceTexture) {
        return q(this.f10354b.getAndIncrement(), surfaceTexture);
    }

    public final void s(long j4, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f10353a.registerTexture(j4, surfaceTextureWrapper);
    }

    public void t(m mVar) {
        this.f10353a.removeIsDisplayingFlutterUiListener(mVar);
    }

    public void u(TextureRegistry.b bVar) {
        for (WeakReference weakReference : this.f10358f) {
            if (weakReference.get() == bVar) {
                this.f10358f.remove(weakReference);
                return;
            }
        }
    }

    public void v() {
        this.f10353a.scheduleFrame();
    }

    public void w(boolean z4) {
        this.f10353a.setSemanticsEnabled(z4);
    }

    public void x(h hVar) {
        h hVar2 = hVar;
        if (hVar.e()) {
            M2.b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + hVar2.f10392b + " x " + hVar2.f10393c + "\nPadding - L: " + hVar2.f10397g + ", T: " + hVar2.f10394d + ", R: " + hVar2.f10395e + ", B: " + hVar2.f10396f + "\nInsets - L: " + hVar2.f10401k + ", T: " + hVar2.f10398h + ", R: " + hVar2.f10399i + ", B: " + hVar2.f10400j + "\nSystem Gesture Insets - L: " + hVar2.f10405o + ", T: " + hVar2.f10402l + ", R: " + hVar2.f10403m + ", B: " + hVar2.f10403m + "\nDisplay Features: " + hVar.f10407q.size() + "\nDisplay Cutouts: " + hVar.f10408r.size());
            int size = hVar.f10407q.size() + hVar.f10408r.size();
            int[] iArr = new int[(size * 4)];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i4 = 0; i4 < hVar.f10407q.size(); i4++) {
                c cVar = (c) hVar.f10407q.get(i4);
                C(iArr, i4 * 4, cVar.f10370a);
                iArr2[i4] = cVar.f10371b.f10383e;
                iArr3[i4] = cVar.f10372c.f10377e;
            }
            int size2 = hVar.f10407q.size() * 4;
            for (int i5 = 0; i5 < hVar.f10408r.size(); i5++) {
                c cVar2 = (c) hVar.f10408r.get(i5);
                C(iArr, (i5 * 4) + size2, cVar2.f10370a);
                iArr2[hVar.f10407q.size() + i5] = cVar2.f10371b.f10383e;
                iArr3[hVar.f10407q.size() + i5] = cVar2.f10372c.f10377e;
            }
            this.f10353a.setViewportMetrics(hVar2.f10391a, hVar2.f10392b, hVar2.f10393c, hVar2.f10394d, hVar2.f10395e, hVar2.f10396f, hVar2.f10397g, hVar2.f10398h, hVar2.f10399i, hVar2.f10400j, hVar2.f10401k, hVar2.f10402l, hVar2.f10403m, hVar2.f10404n, hVar2.f10405o, hVar2.f10406p, iArr, iArr2, iArr3);
        }
    }

    public void y(Surface surface, boolean z4) {
        if (!z4) {
            z();
        }
        this.f10355c = surface;
        if (z4) {
            this.f10353a.onSurfaceWindowChanged(surface);
        } else {
            this.f10353a.onSurfaceCreated(surface);
        }
    }

    public void z() {
        if (this.f10355c != null) {
            this.f10353a.onSurfaceDestroyed();
            if (this.f10356d) {
                this.f10360h.d();
            }
            this.f10356d = false;
            this.f10355c = null;
        }
    }
}
