package S1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import java.nio.ByteBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f2767a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f2768b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f2769c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final c f2770a = new c();

        public c a() {
            if (this.f2770a.f2768b != null || this.f2770a.f2769c != null) {
                return this.f2770a;
            }
            C0059c unused = this.f2770a.getClass();
            throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
        }

        public a b(int i4) {
            int unused = this.f2770a.c().f2773c = i4;
            return this;
        }

        public a c(ByteBuffer byteBuffer, int i4, int i5, int i6) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            } else if (byteBuffer.capacity() < i4 * i5) {
                throw new IllegalArgumentException("Invalid image data size.");
            } else if (i6 == 16 || i6 == 17 || i6 == 842094169) {
                ByteBuffer unused = this.f2770a.f2768b = byteBuffer;
                b c4 = this.f2770a.c();
                int unused2 = c4.f2771a = i4;
                int unused3 = c4.f2772b = i5;
                int unused4 = c4.f2776f = i6;
                return this;
            } else {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unsupported image format: ");
                sb.append(i6);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public a d(int i4) {
            int unused = this.f2770a.c().f2775e = i4;
            return this;
        }

        public a e(long j4) {
            long unused = this.f2770a.c().f2774d = j4;
            return this;
        }
    }

    /* renamed from: S1.c$c  reason: collision with other inner class name */
    public static class C0059c {
    }

    public c() {
        this.f2767a = new b();
        this.f2768b = null;
        this.f2769c = null;
    }

    public Bitmap a() {
        return this.f2769c;
    }

    public ByteBuffer b() {
        Bitmap bitmap = this.f2769c;
        if (bitmap == null) {
            return this.f2768b;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = this.f2769c.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        this.f2769c.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) ((int) ((((float) Color.red(iArr[i5])) * 0.299f) + (((float) Color.green(iArr[i5])) * 0.587f) + (((float) Color.blue(iArr[i5])) * 0.114f)));
        }
        return ByteBuffer.wrap(bArr);
    }

    public b c() {
        return this.f2767a;
    }

    public Image.Plane[] d() {
        return null;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2771a;

        /* renamed from: b  reason: collision with root package name */
        public int f2772b;

        /* renamed from: c  reason: collision with root package name */
        public int f2773c;

        /* renamed from: d  reason: collision with root package name */
        public long f2774d;

        /* renamed from: e  reason: collision with root package name */
        public int f2775e;

        /* renamed from: f  reason: collision with root package name */
        public int f2776f = -1;

        public b() {
        }

        public int a() {
            return this.f2776f;
        }

        public int b() {
            return this.f2772b;
        }

        public int c() {
            return this.f2773c;
        }

        public int d() {
            return this.f2775e;
        }

        public long e() {
            return this.f2774d;
        }

        public int f() {
            return this.f2771a;
        }

        public final void i() {
            if (this.f2775e % 2 != 0) {
                int i4 = this.f2771a;
                this.f2771a = this.f2772b;
                this.f2772b = i4;
            }
            this.f2775e = 0;
        }

        public b(b bVar) {
            this.f2771a = bVar.f();
            this.f2772b = bVar.b();
            this.f2773c = bVar.c();
            this.f2774d = bVar.e();
            this.f2775e = bVar.d();
            this.f2776f = bVar.a();
        }
    }
}
