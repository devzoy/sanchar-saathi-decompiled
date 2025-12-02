package N2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.n;
import java.nio.ByteBuffer;
import java.util.Locale;

public class l extends View implements n {

    /* renamed from: c  reason: collision with root package name */
    public ImageReader f1928c;

    /* renamed from: d  reason: collision with root package name */
    public Image f1929d;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f1930e;

    /* renamed from: f  reason: collision with root package name */
    public FlutterRenderer f1931f;

    /* renamed from: g  reason: collision with root package name */
    public b f1932g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1933h;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1934a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                N2.l$b[] r0 = N2.l.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1934a = r0
                N2.l$b r1 = N2.l.b.background     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1934a     // Catch:{ NoSuchFieldError -> 0x001d }
                N2.l$b r1 = N2.l.b.overlay     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: N2.l.a.<clinit>():void");
        }
    }

    public enum b {
        background,
        overlay
    }

    public l(Context context, int i4, int i5, b bVar) {
        this(context, h(i4, i5), bVar);
    }

    public static ImageReader h(int i4, int i5) {
        int i6;
        int i7;
        if (i4 <= 0) {
            j("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i4));
            i6 = 1;
        } else {
            i6 = i4;
        }
        if (i5 <= 0) {
            j("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i5));
            i7 = 1;
        } else {
            i7 = i5;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i6, i7, 1, 3, 768) : ImageReader.newInstance(i6, i7, 1, 3);
    }

    public static void j(String str, Object... objArr) {
        M2.b.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    public void a() {
        if (this.f1933h) {
            setAlpha(0.0f);
            e();
            this.f1930e = null;
            f();
            invalidate();
            this.f1933h = false;
        }
    }

    public void b() {
    }

    public void c(FlutterRenderer flutterRenderer) {
        if (a.f1934a[this.f1932g.ordinal()] == 1) {
            flutterRenderer.B(this.f1928c.getSurface());
        }
        setAlpha(1.0f);
        this.f1931f = flutterRenderer;
        this.f1933h = true;
    }

    public void d() {
    }

    public boolean e() {
        if (!this.f1933h) {
            return false;
        }
        Image acquireLatestImage = this.f1928c.acquireLatestImage();
        if (acquireLatestImage != null) {
            f();
            this.f1929d = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void f() {
        Image image = this.f1929d;
        if (image != null) {
            image.close();
            this.f1929d = null;
        }
    }

    public void g() {
        this.f1928c.close();
    }

    public FlutterRenderer getAttachedRenderer() {
        return this.f1931f;
    }

    public ImageReader getImageReader() {
        return this.f1928c;
    }

    public Surface getSurface() {
        return this.f1928c.getSurface();
    }

    public final void i() {
        setAlpha(0.0f);
    }

    public void k(int i4, int i5) {
        if (this.f1931f != null) {
            if (i4 != this.f1928c.getWidth() || i5 != this.f1928c.getHeight()) {
                f();
                g();
                this.f1928c = h(i4, i5);
            }
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f1929d.getHardwareBuffer();
            this.f1930e = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f1929d.getPlanes();
        if (planes.length == 1) {
            Image.Plane plane = planes[0];
            int rowStride = plane.getRowStride() / plane.getPixelStride();
            int height = this.f1929d.getHeight();
            Bitmap bitmap = this.f1930e;
            if (!(bitmap != null && bitmap.getWidth() == rowStride && this.f1930e.getHeight() == height)) {
                this.f1930e = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
            }
            ByteBuffer buffer = plane.getBuffer();
            buffer.rewind();
            this.f1930e.copyPixelsFromBuffer(buffer);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1929d != null) {
            l();
        }
        Bitmap bitmap = this.f1930e;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        if (!(i4 == this.f1928c.getWidth() && i5 == this.f1928c.getHeight()) && this.f1932g == b.background && this.f1933h) {
            k(i4, i5);
            this.f1931f.B(this.f1928c.getSurface());
        }
    }

    public l(Context context, ImageReader imageReader, b bVar) {
        super(context, (AttributeSet) null);
        this.f1933h = false;
        this.f1928c = imageReader;
        this.f1932g = bVar;
        i();
    }
}
