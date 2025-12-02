package S1;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import y1.C1006a;
import z1.C1032o;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f2734a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2735b;

    /* renamed from: c  reason: collision with root package name */
    public Camera f2736c;

    /* renamed from: d  reason: collision with root package name */
    public int f2737d;

    /* renamed from: e  reason: collision with root package name */
    public int f2738e;

    /* renamed from: f  reason: collision with root package name */
    public C1006a f2739f;

    /* renamed from: g  reason: collision with root package name */
    public float f2740g;

    /* renamed from: h  reason: collision with root package name */
    public int f2741h;

    /* renamed from: i  reason: collision with root package name */
    public int f2742i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2743j;

    /* renamed from: k  reason: collision with root package name */
    public String f2744k;

    /* renamed from: l  reason: collision with root package name */
    public SurfaceTexture f2745l;

    /* renamed from: m  reason: collision with root package name */
    public Thread f2746m;

    /* renamed from: n  reason: collision with root package name */
    public b f2747n;

    /* renamed from: o  reason: collision with root package name */
    public final IdentityHashMap f2748o;

    /* renamed from: S1.a$a  reason: collision with other inner class name */
    public static class C0057a {

        /* renamed from: a  reason: collision with root package name */
        public final b f2749a;

        /* renamed from: b  reason: collision with root package name */
        public a f2750b;

        public C0057a(Context context, b bVar) {
            a aVar = new a();
            this.f2750b = aVar;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (bVar != null) {
                this.f2749a = bVar;
                Context unused = aVar.f2734a = context;
            } else {
                throw new IllegalArgumentException("No detector supplied.");
            }
        }

        public a a() {
            a aVar = this.f2750b;
            aVar.getClass();
            b unused = aVar.f2747n = new b(this.f2749a);
            return this.f2750b;
        }

        public C0057a b(boolean z4) {
            boolean unused = this.f2750b.f2743j = z4;
            return this;
        }

        public C0057a c(int i4, int i5) {
            if (i4 <= 0 || i4 > 1000000 || i5 <= 0 || i5 > 1000000) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Invalid preview size: ");
                sb.append(i4);
                sb.append("x");
                sb.append(i5);
                throw new IllegalArgumentException(sb.toString());
            }
            int unused = this.f2750b.f2741h = i4;
            int unused2 = this.f2750b.f2742i = i5;
            return this;
        }
    }

    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public b f2751e;

        /* renamed from: f  reason: collision with root package name */
        public long f2752f = SystemClock.elapsedRealtime();

        /* renamed from: g  reason: collision with root package name */
        public final Object f2753g = new Object();

        /* renamed from: h  reason: collision with root package name */
        public boolean f2754h = true;

        /* renamed from: i  reason: collision with root package name */
        public long f2755i;

        /* renamed from: j  reason: collision with root package name */
        public int f2756j = 0;

        /* renamed from: k  reason: collision with root package name */
        public ByteBuffer f2757k;

        public b(b bVar) {
            this.f2751e = bVar;
        }

        public final void a() {
            b bVar = this.f2751e;
            if (bVar != null) {
                bVar.d();
                this.f2751e = null;
            }
        }

        public final void b(boolean z4) {
            synchronized (this.f2753g) {
                this.f2754h = z4;
                this.f2753g.notifyAll();
            }
        }

        public final void c(byte[] bArr, Camera camera) {
            synchronized (this.f2753g) {
                try {
                    ByteBuffer byteBuffer = this.f2757k;
                    if (byteBuffer != null) {
                        camera.addCallbackBuffer(byteBuffer.array());
                        this.f2757k = null;
                    }
                    if (!a.this.f2748o.containsKey(bArr)) {
                        Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                        return;
                    }
                    this.f2755i = SystemClock.elapsedRealtime() - this.f2752f;
                    this.f2756j++;
                    this.f2757k = (ByteBuffer) a.this.f2748o.get(bArr);
                    this.f2753g.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            ((S1.b) z1.C1032o.f(r6.f2751e)).c(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            android.util.Log.e("CameraSource", "Exception thrown from receiver.", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
            ((android.hardware.Camera) z1.C1032o.f(S1.a.k(r6.f2758l))).addCallbackBuffer(((java.nio.ByteBuffer) z1.C1032o.f(r2)).array());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cd, code lost:
            throw r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0022 A[Catch:{ InterruptedException -> 0x0014 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0020 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
            L_0x0000:
                java.lang.Object r0 = r6.f2753g
                monitor-enter(r0)
            L_0x0003:
                boolean r1 = r6.f2754h     // Catch:{ all -> 0x0011 }
                if (r1 == 0) goto L_0x001e
                java.nio.ByteBuffer r2 = r6.f2757k     // Catch:{ all -> 0x0011 }
                if (r2 != 0) goto L_0x001e
                java.lang.Object r1 = r6.f2753g     // Catch:{ InterruptedException -> 0x0014 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0014 }
                goto L_0x0003
            L_0x0011:
                r1 = move-exception
                goto L_0x00ce
            L_0x0014:
                r1 = move-exception
                java.lang.String r2 = "CameraSource"
                java.lang.String r3 = "Frame processing loop terminated."
                android.util.Log.d(r2, r3, r1)     // Catch:{ all -> 0x0011 }
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x001e:
                if (r1 != 0) goto L_0x0022
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x0022:
                S1.c$a r1 = new S1.c$a     // Catch:{ all -> 0x0011 }
                r1.<init>()     // Catch:{ all -> 0x0011 }
                java.nio.ByteBuffer r2 = r6.f2757k     // Catch:{ all -> 0x0011 }
                java.lang.Object r2 = z1.C1032o.f(r2)     // Catch:{ all -> 0x0011 }
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch:{ all -> 0x0011 }
                S1.a r3 = S1.a.this     // Catch:{ all -> 0x0011 }
                y1.a r3 = r3.f2739f     // Catch:{ all -> 0x0011 }
                int r3 = r3.b()     // Catch:{ all -> 0x0011 }
                S1.a r4 = S1.a.this     // Catch:{ all -> 0x0011 }
                y1.a r4 = r4.f2739f     // Catch:{ all -> 0x0011 }
                int r4 = r4.a()     // Catch:{ all -> 0x0011 }
                r5 = 17
                S1.c$a r1 = r1.c(r2, r3, r4, r5)     // Catch:{ all -> 0x0011 }
                int r2 = r6.f2756j     // Catch:{ all -> 0x0011 }
                S1.c$a r1 = r1.b(r2)     // Catch:{ all -> 0x0011 }
                long r2 = r6.f2755i     // Catch:{ all -> 0x0011 }
                S1.c$a r1 = r1.e(r2)     // Catch:{ all -> 0x0011 }
                S1.a r2 = S1.a.this     // Catch:{ all -> 0x0011 }
                int r2 = r2.f2738e     // Catch:{ all -> 0x0011 }
                S1.c$a r1 = r1.d(r2)     // Catch:{ all -> 0x0011 }
                S1.c r1 = r1.a()     // Catch:{ all -> 0x0011 }
                java.nio.ByteBuffer r2 = r6.f2757k     // Catch:{ all -> 0x0011 }
                r3 = 0
                r6.f2757k = r3     // Catch:{ all -> 0x0011 }
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                S1.b r0 = r6.f2751e     // Catch:{ Exception -> 0x0091 }
                java.lang.Object r0 = z1.C1032o.f(r0)     // Catch:{ Exception -> 0x0091 }
                S1.b r0 = (S1.b) r0     // Catch:{ Exception -> 0x0091 }
                r0.c(r1)     // Catch:{ Exception -> 0x0091 }
                S1.a r0 = S1.a.this
                android.hardware.Camera r0 = r0.f2736c
                java.lang.Object r0 = z1.C1032o.f(r0)
                android.hardware.Camera r0 = (android.hardware.Camera) r0
                java.lang.Object r1 = z1.C1032o.f(r2)
                java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
                byte[] r1 = r1.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x008f:
                r0 = move-exception
                goto L_0x00b4
            L_0x0091:
                r0 = move-exception
                java.lang.String r1 = "CameraSource"
                java.lang.String r3 = "Exception thrown from receiver."
                android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x008f }
                S1.a r0 = S1.a.this
                android.hardware.Camera r0 = r0.f2736c
                java.lang.Object r0 = z1.C1032o.f(r0)
                android.hardware.Camera r0 = (android.hardware.Camera) r0
                java.lang.Object r1 = z1.C1032o.f(r2)
                java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
                byte[] r1 = r1.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x00b4:
                S1.a r1 = S1.a.this
                android.hardware.Camera r1 = r1.f2736c
                java.lang.Object r1 = z1.C1032o.f(r1)
                android.hardware.Camera r1 = (android.hardware.Camera) r1
                java.lang.Object r2 = z1.C1032o.f(r2)
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                byte[] r2 = r2.array()
                r1.addCallbackBuffer(r2)
                throw r0
            L_0x00ce:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: S1.a.b.run():void");
        }
    }

    public class c implements Camera.PreviewCallback {
        public c() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            a.this.f2747n.c(bArr, camera);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public C1006a f2760a;

        /* renamed from: b  reason: collision with root package name */
        public C1006a f2761b;

        public d(Camera.Size size, Camera.Size size2) {
            this.f2760a = new C1006a(size.width, size.height);
            if (size2 != null) {
                this.f2761b = new C1006a(size2.width, size2.height);
            }
        }

        public final C1006a a() {
            return this.f2760a;
        }

        public final C1006a b() {
            return this.f2761b;
        }
    }

    public a() {
        this.f2735b = new Object();
        this.f2737d = 0;
        this.f2740g = 30.0f;
        this.f2741h = 1024;
        this.f2742i = 768;
        this.f2743j = false;
        this.f2748o = new IdentityHashMap();
    }

    public void a() {
        synchronized (this.f2735b) {
            c();
            this.f2747n.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S1.a b(android.view.SurfaceHolder r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2735b
            monitor-enter(r0)
            android.hardware.Camera r1 = r2.f2736c     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return r2
        L_0x0009:
            r3 = move-exception
            goto L_0x0031
        L_0x000b:
            android.hardware.Camera r1 = r2.g()     // Catch:{ all -> 0x0009 }
            r2.f2736c = r1     // Catch:{ all -> 0x0009 }
            r1.setPreviewDisplay(r3)     // Catch:{ all -> 0x0009 }
            android.hardware.Camera r3 = r2.f2736c     // Catch:{ all -> 0x0009 }
            r3.startPreview()     // Catch:{ all -> 0x0009 }
            java.lang.Thread r3 = new java.lang.Thread     // Catch:{ all -> 0x0009 }
            S1.a$b r1 = r2.f2747n     // Catch:{ all -> 0x0009 }
            r3.<init>(r1)     // Catch:{ all -> 0x0009 }
            r2.f2746m = r3     // Catch:{ all -> 0x0009 }
            S1.a$b r3 = r2.f2747n     // Catch:{ all -> 0x0009 }
            r1 = 1
            r3.b(r1)     // Catch:{ all -> 0x0009 }
            java.lang.Thread r3 = r2.f2746m     // Catch:{ all -> 0x0009 }
            if (r3 == 0) goto L_0x002f
            r3.start()     // Catch:{ all -> 0x0009 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return r2
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.a.b(android.view.SurfaceHolder):S1.a");
    }

    public void c() {
        synchronized (this.f2735b) {
            this.f2747n.b(false);
            Thread thread = this.f2746m;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused) {
                    Log.d("CameraSource", "Frame processing thread interrupted on release.");
                }
                this.f2746m = null;
            }
            Camera camera = this.f2736c;
            if (camera != null) {
                camera.stopPreview();
                this.f2736c.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                try {
                    this.f2736c.setPreviewTexture((SurfaceTexture) null);
                    this.f2745l = null;
                    this.f2736c.setPreviewDisplay((SurfaceHolder) null);
                } catch (Exception e4) {
                    String valueOf = String.valueOf(e4);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 32);
                    sb.append("Failed to clear camera preview: ");
                    sb.append(valueOf);
                    Log.e("CameraSource", sb.toString());
                }
                ((Camera) C1032o.f(this.f2736c)).release();
                this.f2736c = null;
            }
            this.f2748o.clear();
        }
    }

    public final Camera g() {
        int i4;
        int i5;
        int i6 = this.f2737d;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= Camera.getNumberOfCameras()) {
                i8 = -1;
                break;
            }
            Camera.getCameraInfo(i8, cameraInfo);
            if (cameraInfo.facing == i6) {
                break;
            }
            i8++;
        }
        if (i8 != -1) {
            Camera open = Camera.open(i8);
            int i9 = this.f2741h;
            int i10 = this.f2742i;
            Camera.Parameters parameters = open.getParameters();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            ArrayList arrayList = new ArrayList();
            for (Camera.Size next : supportedPreviewSizes) {
                float f4 = ((float) next.width) / ((float) next.height);
                Iterator<Camera.Size> it = supportedPictureSizes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Camera.Size next2 = it.next();
                    if (Math.abs(f4 - (((float) next2.width) / ((float) next2.height))) < 0.01f) {
                        arrayList.add(new d(next, next2));
                        break;
                    }
                }
            }
            if (arrayList.size() == 0) {
                Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
                for (Camera.Size dVar : supportedPreviewSizes) {
                    arrayList.add(new d(dVar, (Camera.Size) null));
                }
            }
            int size = arrayList.size();
            int i11 = Integer.MAX_VALUE;
            int i12 = 0;
            int i13 = Integer.MAX_VALUE;
            d dVar2 = null;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                d dVar3 = (d) obj;
                C1006a a4 = dVar3.a();
                int abs = Math.abs(a4.b() - i9) + Math.abs(a4.a() - i10);
                if (abs < i13) {
                    dVar2 = dVar3;
                    i13 = abs;
                }
            }
            d dVar4 = (d) C1032o.f(dVar2);
            if (dVar4 != null) {
                C1006a b4 = dVar4.b();
                this.f2739f = dVar4.a();
                int i14 = (int) (this.f2740g * 1000.0f);
                int[] iArr = null;
                for (int[] next3 : open.getParameters().getSupportedPreviewFpsRange()) {
                    int abs2 = Math.abs(i14 - next3[0]) + Math.abs(i14 - next3[1]);
                    if (abs2 < i11) {
                        iArr = next3;
                        i11 = abs2;
                    }
                }
                int[] iArr2 = (int[]) C1032o.f(iArr);
                if (iArr2 != null) {
                    Camera.Parameters parameters2 = open.getParameters();
                    if (b4 != null) {
                        parameters2.setPictureSize(b4.b(), b4.a());
                    }
                    parameters2.setPreviewSize(this.f2739f.b(), this.f2739f.a());
                    parameters2.setPreviewFpsRange(iArr2[0], iArr2[1]);
                    parameters2.setPreviewFormat(17);
                    int rotation = ((WindowManager) C1032o.f((WindowManager) this.f2734a.getSystemService("window"))).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        if (rotation == 1) {
                            i7 = 90;
                        } else if (rotation == 2) {
                            i7 = 180;
                        } else if (rotation != 3) {
                            StringBuilder sb = new StringBuilder(31);
                            sb.append("Bad rotation value: ");
                            sb.append(rotation);
                            Log.e("CameraSource", sb.toString());
                        } else {
                            i7 = 270;
                        }
                    }
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    Camera.getCameraInfo(i8, cameraInfo2);
                    if (cameraInfo2.facing == 1) {
                        i5 = (cameraInfo2.orientation + i7) % 360;
                        i4 = (360 - i5) % 360;
                    } else {
                        i5 = ((cameraInfo2.orientation - i7) + 360) % 360;
                        i4 = i5;
                    }
                    this.f2738e = i5 / 90;
                    open.setDisplayOrientation(i4);
                    parameters2.setRotation(i5);
                    if (this.f2744k != null) {
                        if (parameters2.getSupportedFocusModes().contains(this.f2744k)) {
                            parameters2.setFocusMode((String) C1032o.f(this.f2744k));
                        } else {
                            Log.w("CameraSource", String.format("FocusMode %s is not supported on this device.", new Object[]{this.f2744k}));
                            this.f2744k = null;
                        }
                    }
                    if (this.f2744k == null && this.f2743j) {
                        if (parameters2.getSupportedFocusModes().contains("continuous-video")) {
                            parameters2.setFocusMode("continuous-video");
                            this.f2744k = "continuous-video";
                        } else {
                            Log.i("CameraSource", "Camera auto focus is not supported on this device.");
                        }
                    }
                    open.setParameters(parameters2);
                    open.setPreviewCallbackWithBuffer(new c());
                    open.addCallbackBuffer(i(this.f2739f));
                    open.addCallbackBuffer(i(this.f2739f));
                    open.addCallbackBuffer(i(this.f2739f));
                    open.addCallbackBuffer(i(this.f2739f));
                    return open;
                }
                throw new IOException("Could not find suitable preview frames per second range.");
            }
            throw new IOException("Could not find suitable preview size.");
        }
        throw new IOException("Could not find requested camera.");
    }

    public final byte[] i(C1006a aVar) {
        byte[] bArr = new byte[(((int) Math.ceil(((double) ((((long) aVar.a()) * ((long) aVar.b())) * ((long) ImageFormat.getBitsPerPixel(17)))) / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.f2748o.put(bArr, wrap);
        return bArr;
    }
}
