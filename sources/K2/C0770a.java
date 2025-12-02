package k2;

import J.a;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: k2.a  reason: case insensitive filesystem */
public class C0770a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f10970i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f10971j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f10972k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f10973l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f10974a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f10975b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f10976c;

    /* renamed from: d  reason: collision with root package name */
    public int f10977d;

    /* renamed from: e  reason: collision with root package name */
    public int f10978e;

    /* renamed from: f  reason: collision with root package name */
    public int f10979f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f10980g;

    /* renamed from: h  reason: collision with root package name */
    public Paint f10981h;

    public C0770a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i4, float f4, float f5) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i5 = i4;
        float f6 = f5;
        boolean z4 = f6 < 0.0f;
        Path path = this.f10980g;
        if (z4) {
            int[] iArr = f10972k;
            iArr[0] = 0;
            iArr[1] = this.f10979f;
            iArr[2] = this.f10978e;
            iArr[3] = this.f10977d;
            float f7 = f4;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f4, f6);
            path.close();
            float f8 = (float) (-i5);
            rectF2.inset(f8, f8);
            int[] iArr2 = f10972k;
            iArr2[0] = 0;
            iArr2[1] = this.f10977d;
            iArr2[2] = this.f10978e;
            iArr2[3] = this.f10979f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f9 = 1.0f - (((float) i5) / width);
            float[] fArr = f10973l;
            fArr[1] = f9;
            fArr[2] = ((1.0f - f9) / 2.0f) + f9;
            this.f10975b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f10972k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z4) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f10981h);
            }
            canvas.drawArc(rectF, f4, f5, true, this.f10975b);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i4) {
        rectF.bottom += (float) i4;
        rectF.offset(0.0f, (float) (-i4));
        int[] iArr = f10970i;
        iArr[0] = this.f10979f;
        iArr[1] = this.f10978e;
        iArr[2] = this.f10977d;
        Paint paint = this.f10976c;
        float f4 = rectF.left;
        paint.setShader(new LinearGradient(f4, rectF.top, f4, rectF.bottom, iArr, f10971j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f10976c);
        canvas.restore();
    }

    public Paint c() {
        return this.f10974a;
    }

    public void d(int i4) {
        this.f10977d = a.d(i4, 68);
        this.f10978e = a.d(i4, 20);
        this.f10979f = a.d(i4, 0);
        this.f10974a.setColor(this.f10977d);
    }

    public C0770a(int i4) {
        this.f10980g = new Path();
        this.f10981h = new Paint();
        this.f10974a = new Paint();
        d(i4);
        this.f10981h.setColor(0);
        Paint paint = new Paint(4);
        this.f10975b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f10976c = new Paint(paint);
    }
}
