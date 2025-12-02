package f1;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import y1.C1006a;

/* renamed from: f1.a  reason: case insensitive filesystem */
public class C0620a {

    /* renamed from: a  reason: collision with root package name */
    public Context f8999a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9000b;

    /* renamed from: c  reason: collision with root package name */
    public Camera f9001c;

    /* renamed from: d  reason: collision with root package name */
    public int f9002d;

    /* renamed from: e  reason: collision with root package name */
    public int f9003e;

    /* renamed from: f  reason: collision with root package name */
    public C1006a f9004f;

    /* renamed from: g  reason: collision with root package name */
    public float f9005g;

    /* renamed from: h  reason: collision with root package name */
    public int f9006h;

    /* renamed from: i  reason: collision with root package name */
    public int f9007i;

    /* renamed from: j  reason: collision with root package name */
    public String f9008j;

    /* renamed from: k  reason: collision with root package name */
    public String f9009k;

    /* renamed from: l  reason: collision with root package name */
    public Thread f9010l;

    /* renamed from: m  reason: collision with root package name */
    public d f9011m;

    /* renamed from: n  reason: collision with root package name */
    public Map f9012n;

    /* renamed from: f1.a$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final S1.b f9013a;

        /* renamed from: b  reason: collision with root package name */
        public C0620a f9014b;

        public b(Context context, S1.b bVar) {
            C0620a aVar = new C0620a();
            this.f9014b = aVar;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (bVar != null) {
                this.f9013a = bVar;
                Context unused = aVar.f8999a = context;
            } else {
                throw new IllegalArgumentException("No detector supplied.");
            }
        }

        public C0620a a() {
            C0620a aVar = this.f9014b;
            C0620a aVar2 = this.f9014b;
            Objects.requireNonNull(aVar2);
            d unused = aVar.f9011m = new d(this.f9013a);
            return this.f9014b;
        }

        public b b(int i4) {
            if (i4 == 0 || i4 == 1) {
                int unused = this.f9014b.f9002d = i4;
                return this;
            }
            throw new IllegalArgumentException("Invalid camera: " + i4);
        }

        public b c(String str) {
            String unused = this.f9014b.f9009k = str;
            return this;
        }

        public b d(String str) {
            String unused = this.f9014b.f9008j = str;
            return this;
        }

        public b e(float f4) {
            if (f4 > 0.0f) {
                float unused = this.f9014b.f9005g = f4;
                return this;
            }
            throw new IllegalArgumentException("Invalid fps: " + f4);
        }

        public b f(int i4, int i5) {
            if (i4 <= 0 || i4 > 1000000 || i5 <= 0 || i5 > 1000000) {
                throw new IllegalArgumentException("Invalid preview size: " + i4 + "x" + i5);
            }
            int unused = this.f9014b.f9006h = i4;
            int unused2 = this.f9014b.f9007i = i5;
            return this;
        }
    }

    /* renamed from: f1.a$c */
    public class c implements Camera.PreviewCallback {
        public c() {
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            C0620a.this.f9011m.c(bArr, camera);
        }
    }

    /* renamed from: f1.a$d */
    public class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public S1.b f9016e;

        /* renamed from: f  reason: collision with root package name */
        public long f9017f = SystemClock.elapsedRealtime();

        /* renamed from: g  reason: collision with root package name */
        public final Object f9018g = new Object();

        /* renamed from: h  reason: collision with root package name */
        public boolean f9019h = true;

        /* renamed from: i  reason: collision with root package name */
        public long f9020i;

        /* renamed from: j  reason: collision with root package name */
        public int f9021j = 0;

        /* renamed from: k  reason: collision with root package name */
        public ByteBuffer f9022k;

        public d(S1.b bVar) {
            this.f9016e = bVar;
        }

        public void a() {
            S1.b bVar = this.f9016e;
            if (bVar != null) {
                bVar.d();
                this.f9016e = null;
            }
        }

        public void b(boolean z4) {
            synchronized (this.f9018g) {
                this.f9019h = z4;
                this.f9018g.notifyAll();
            }
        }

        public void c(byte[] bArr, Camera camera) {
            synchronized (this.f9018g) {
                try {
                    ByteBuffer byteBuffer = this.f9022k;
                    if (byteBuffer != null) {
                        camera.addCallbackBuffer(byteBuffer.array());
                        this.f9022k = null;
                    }
                    if (C0620a.this.f9012n.containsKey(bArr)) {
                        this.f9020i = SystemClock.elapsedRealtime() - this.f9017f;
                        this.f9021j++;
                        this.f9022k = (ByteBuffer) C0620a.this.f9012n.get(bArr);
                        this.f9018g.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r6.f9016e.c(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
            f1.C0620a.b(r6.f9023l).addCallbackBuffer(r2.array());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
            f1.C0620a.b(r6.f9023l).addCallbackBuffer(r2.array());
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0013 */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0019  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0017 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
            L_0x0000:
                java.lang.Object r0 = r6.f9018g
                monitor-enter(r0)
            L_0x0003:
                boolean r1 = r6.f9019h     // Catch:{ all -> 0x0011 }
                if (r1 == 0) goto L_0x0015
                java.nio.ByteBuffer r2 = r6.f9022k     // Catch:{ all -> 0x0011 }
                if (r2 != 0) goto L_0x0015
                java.lang.Object r1 = r6.f9018g     // Catch:{ InterruptedException -> 0x0013 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0013 }
                goto L_0x0003
            L_0x0011:
                r1 = move-exception
                goto L_0x007b
            L_0x0013:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x0015:
                if (r1 != 0) goto L_0x0019
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x0019:
                S1.c$a r1 = new S1.c$a     // Catch:{ all -> 0x0011 }
                r1.<init>()     // Catch:{ all -> 0x0011 }
                java.nio.ByteBuffer r2 = r6.f9022k     // Catch:{ all -> 0x0011 }
                f1.a r3 = f1.C0620a.this     // Catch:{ all -> 0x0011 }
                y1.a r3 = r3.f9004f     // Catch:{ all -> 0x0011 }
                int r3 = r3.b()     // Catch:{ all -> 0x0011 }
                f1.a r4 = f1.C0620a.this     // Catch:{ all -> 0x0011 }
                y1.a r4 = r4.f9004f     // Catch:{ all -> 0x0011 }
                int r4 = r4.a()     // Catch:{ all -> 0x0011 }
                r5 = 17
                S1.c$a r1 = r1.c(r2, r3, r4, r5)     // Catch:{ all -> 0x0011 }
                int r2 = r6.f9021j     // Catch:{ all -> 0x0011 }
                S1.c$a r1 = r1.b(r2)     // Catch:{ all -> 0x0011 }
                long r2 = r6.f9020i     // Catch:{ all -> 0x0011 }
                S1.c$a r1 = r1.e(r2)     // Catch:{ all -> 0x0011 }
                f1.a r2 = f1.C0620a.this     // Catch:{ all -> 0x0011 }
                int r2 = r2.f9003e     // Catch:{ all -> 0x0011 }
                S1.c$a r1 = r1.d(r2)     // Catch:{ all -> 0x0011 }
                S1.c r1 = r1.a()     // Catch:{ all -> 0x0011 }
                java.nio.ByteBuffer r2 = r6.f9022k     // Catch:{ all -> 0x0011 }
                r3 = 0
                r6.f9022k = r3     // Catch:{ all -> 0x0011 }
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                S1.b r0 = r6.f9016e     // Catch:{ all -> 0x006d }
                r0.c(r1)     // Catch:{ all -> 0x006d }
                f1.a r0 = f1.C0620a.this
                android.hardware.Camera r0 = r0.f9001c
                byte[] r1 = r2.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x006d:
                f1.a r0 = f1.C0620a.this
                android.hardware.Camera r0 = r0.f9001c
                byte[] r1 = r2.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x007b:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.C0620a.d.run():void");
        }
    }

    /* renamed from: f1.a$e */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public C1006a f9024a;

        /* renamed from: b  reason: collision with root package name */
        public C1006a f9025b;

        public e(Camera.Size size, Camera.Size size2) {
            this.f9024a = new C1006a(size.width, size.height);
            if (size2 != null) {
                this.f9025b = new C1006a(size2.width, size2.height);
            }
        }

        public C1006a a() {
            return this.f9025b;
        }

        public C1006a b() {
            return this.f9024a;
        }
    }

    public static int s(int i4) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i5 = 0; i5 < Camera.getNumberOfCameras(); i5++) {
            Camera.getCameraInfo(i5, cameraInfo);
            if (cameraInfo.facing == i4) {
                return i5;
            }
        }
        return -1;
    }

    public static Camera.Size t(List list, int i4, int i5) {
        double d4 = ((double) i5) / ((double) i4);
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        double d5 = Double.MAX_VALUE;
        double d6 = Double.MAX_VALUE;
        while (it.hasNext()) {
            Camera.Size size2 = (Camera.Size) it.next();
            if (Math.abs((((double) size2.width) / ((double) size2.height)) - d4) <= 0.1d && ((double) Math.abs(size2.height - i5)) < d6) {
                d6 = (double) Math.abs(size2.height - i5);
                size = size2;
            }
        }
        if (size == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Camera.Size size3 = (Camera.Size) it2.next();
                if (((double) Math.abs(size3.height - i5)) < d5) {
                    size = size3;
                    d5 = (double) Math.abs(size3.height - i5);
                }
            }
        }
        return size;
    }

    public static e x(Camera camera, int i4, int i5) {
        return new e(t(camera.getParameters().getSupportedPreviewSizes(), i4, i5), (Camera.Size) null);
    }

    public C0620a A(SurfaceHolder surfaceHolder) {
        synchronized (this.f9000b) {
            try {
                if (this.f9001c != null) {
                    return this;
                }
                Camera n4 = n();
                this.f9001c = n4;
                n4.setPreviewDisplay(surfaceHolder);
                this.f9001c.startPreview();
                this.f9010l = new Thread(this.f9011m);
                this.f9011m.b(true);
                this.f9010l.start();
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9000b
            monitor-enter(r0)
            f1.a$d r1 = r3.f9011m     // Catch:{ all -> 0x0012 }
            r2 = 0
            r1.b(r2)     // Catch:{ all -> 0x0012 }
            java.lang.Thread r1 = r3.f9010l     // Catch:{ all -> 0x0012 }
            r2 = 0
            if (r1 == 0) goto L_0x0016
            r1.join()     // Catch:{ InterruptedException -> 0x0014 }
            goto L_0x0014
        L_0x0012:
            r1 = move-exception
            goto L_0x0035
        L_0x0014:
            r3.f9010l = r2     // Catch:{ all -> 0x0012 }
        L_0x0016:
            java.util.Map r1 = r3.f9012n     // Catch:{ all -> 0x0012 }
            r1.clear()     // Catch:{ all -> 0x0012 }
            android.hardware.Camera r1 = r3.f9001c     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0033
            r1.stopPreview()     // Catch:{ all -> 0x0012 }
            android.hardware.Camera r1 = r3.f9001c     // Catch:{ all -> 0x0012 }
            r1.setPreviewCallbackWithBuffer(r2)     // Catch:{ all -> 0x0012 }
            android.hardware.Camera r1 = r3.f9001c     // Catch:{ Exception -> 0x002c }
            r1.setPreviewTexture(r2)     // Catch:{ Exception -> 0x002c }
        L_0x002c:
            android.hardware.Camera r1 = r3.f9001c     // Catch:{ all -> 0x0012 }
            r1.release()     // Catch:{ all -> 0x0012 }
            r3.f9001c = r2     // Catch:{ all -> 0x0012 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C0620a.B():void");
    }

    public final Camera n() {
        int s4 = s(this.f9002d);
        if (s4 != -1) {
            Camera open = Camera.open(s4);
            e x4 = x(open, this.f9006h, this.f9007i);
            if (x4 != null) {
                C1006a a4 = x4.a();
                this.f9004f = x4.b();
                int[] w4 = w(open, this.f9005g);
                if (w4 != null) {
                    Camera.Parameters parameters = open.getParameters();
                    if (a4 != null) {
                        parameters.setPictureSize(a4.b(), a4.a());
                    }
                    parameters.setPreviewSize(this.f9004f.b(), this.f9004f.a());
                    parameters.setPreviewFpsRange(w4[0], w4[1]);
                    parameters.setPreviewFormat(17);
                    z(open, parameters, s4);
                    if (this.f9008j != null && parameters.getSupportedFocusModes().contains(this.f9008j)) {
                        parameters.setFocusMode(this.f9008j);
                    }
                    this.f9008j = parameters.getFocusMode();
                    if (!(this.f9009k == null || parameters.getSupportedFlashModes() == null || !parameters.getSupportedFlashModes().contains(this.f9009k))) {
                        parameters.setFlashMode(this.f9009k);
                    }
                    this.f9009k = parameters.getFlashMode();
                    open.setParameters(parameters);
                    open.setPreviewCallbackWithBuffer(new c());
                    open.addCallbackBuffer(o(this.f9004f));
                    open.addCallbackBuffer(o(this.f9004f));
                    open.addCallbackBuffer(o(this.f9004f));
                    open.addCallbackBuffer(o(this.f9004f));
                    return open;
                }
                throw new RuntimeException("Could not find suitable preview frames per second range.");
            }
            throw new RuntimeException("Could not find suitable preview size.");
        }
        throw new RuntimeException("Could not find requested camera.");
    }

    public final byte[] o(C1006a aVar) {
        byte[] bArr = new byte[(((int) Math.ceil(((double) ((long) ((aVar.a() * aVar.b()) * ImageFormat.getBitsPerPixel(17)))) / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.f9012n.put(bArr, wrap);
        return bArr;
    }

    public int p(float f4) {
        synchronized (this.f9000b) {
            try {
                Camera camera = this.f9001c;
                int i4 = 0;
                if (camera == null) {
                    return 0;
                }
                Camera.Parameters parameters = camera.getParameters();
                if (!parameters.isZoomSupported()) {
                    return 0;
                }
                int maxZoom = parameters.getMaxZoom();
                int zoom = parameters.getZoom() + 1;
                int round = Math.round(f4 > 1.0f ? ((float) zoom) + (f4 * ((float) (maxZoom / 10))) : ((float) zoom) * f4) - 1;
                if (round >= 0) {
                    i4 = round > maxZoom ? maxZoom : round;
                }
                parameters.setZoom(i4);
                this.f9001c.setParameters(parameters);
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int q() {
        return this.f9002d;
    }

    public String r() {
        return this.f9008j;
    }

    public C1006a u() {
        return this.f9004f;
    }

    public void v() {
        synchronized (this.f9000b) {
            B();
            this.f9011m.a();
        }
    }

    public final int[] w(Camera camera, float f4) {
        int i4 = (int) (f4 * 1000.0f);
        int[] iArr = null;
        int i5 = Integer.MAX_VALUE;
        for (int[] next : camera.getParameters().getSupportedPreviewFpsRange()) {
            int abs = Math.abs(i4 - next[0]) + Math.abs(i4 - next[1]);
            if (abs < i5) {
                iArr = next;
                i5 = abs;
            }
        }
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9000b
            monitor-enter(r0)
            android.hardware.Camera r1 = r3.f9001c     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0026
            android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch:{ all -> 0x0024 }
            java.util.List r2 = r1.getSupportedFlashModes()     // Catch:{ all -> 0x0024 }
            boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0026
            r1.setFlashMode(r4)     // Catch:{ all -> 0x0024 }
            android.hardware.Camera r2 = r3.f9001c     // Catch:{ all -> 0x0024 }
            r2.setParameters(r1)     // Catch:{ all -> 0x0024 }
            r3.f9009k = r4     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            r4 = 1
            return r4
        L_0x0024:
            r4 = move-exception
            goto L_0x0029
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            r4 = 0
            return r4
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C0620a.y(java.lang.String):boolean");
    }

    public final void z(Camera camera, Camera.Parameters parameters, int i4) {
        int i5;
        int i6;
        int rotation = ((WindowManager) this.f8999a.getSystemService("window")).getDefaultDisplay().getRotation();
        int i7 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i7 = 90;
            } else if (rotation == 2) {
                i7 = 180;
            } else if (rotation == 3) {
                i7 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i4, cameraInfo);
        if (cameraInfo.facing == 1) {
            i5 = (cameraInfo.orientation + i7) % 360;
            i6 = (360 - i5) % 360;
        } else {
            i5 = ((cameraInfo.orientation - i7) + 360) % 360;
            i6 = i5;
        }
        this.f9003e = i5 / 90;
        camera.setDisplayOrientation(i6);
        parameters.setRotation(i5);
    }

    public C0620a() {
        this.f9000b = new Object();
        this.f9002d = 0;
        this.f9005g = 30.0f;
        this.f9006h = 1024;
        this.f9007i = 768;
        this.f9008j = null;
        this.f9009k = null;
        this.f9012n = new HashMap();
    }
}
