package e1;

import T1.a;
import android.graphics.Paint;
import com.amolg.flutterbarcodescanner.camera.GraphicOverlay;

/* renamed from: e1.a  reason: case insensitive filesystem */
public class C0588a extends GraphicOverlay.a {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f8755f = {-16776961, -16711681, -16711936};

    /* renamed from: g  reason: collision with root package name */
    public static int f8756g = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f8757b;

    /* renamed from: c  reason: collision with root package name */
    public Paint f8758c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f8759d;

    /* renamed from: e  reason: collision with root package name */
    public volatile a f8760e;

    public C0588a(GraphicOverlay graphicOverlay) {
        super(graphicOverlay);
        int[] iArr = f8755f;
        int length = (f8756g + 1) % iArr.length;
        f8756g = length;
        int i4 = iArr[length];
        Paint paint = new Paint();
        this.f8758c = paint;
        paint.setColor(i4);
        this.f8758c.setStyle(Paint.Style.STROKE);
        this.f8758c.setStrokeWidth(4.0f);
        Paint paint2 = new Paint();
        this.f8759d = paint2;
        paint2.setColor(i4);
        this.f8759d.setTextSize(36.0f);
    }

    public a b() {
        return this.f8760e;
    }

    public void c(int i4) {
        this.f8757b = i4;
    }

    public void d(a aVar) {
        this.f8760e = aVar;
        a();
    }
}
