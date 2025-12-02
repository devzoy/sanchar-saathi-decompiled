package n2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import l2.g;
import l2.k;

/* renamed from: n2.b  reason: case insensitive filesystem */
public class C0802b extends g {

    /* renamed from: A  reason: collision with root package name */
    public final Paint f11231A;

    /* renamed from: B  reason: collision with root package name */
    public final RectF f11232B;

    /* renamed from: C  reason: collision with root package name */
    public int f11233C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0802b(k kVar) {
        super(kVar == null ? new k() : kVar);
        this.f11231A = new Paint(1);
        m0();
        this.f11232B = new RectF();
    }

    public void draw(Canvas canvas) {
        h0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f11232B, this.f11231A);
        g0(canvas);
    }

    public boolean f0() {
        return !this.f11232B.isEmpty();
    }

    public final void g0(Canvas canvas) {
        if (!n0(getCallback())) {
            canvas.restoreToCount(this.f11233C);
        }
    }

    public final void h0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (n0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        j0(canvas);
    }

    public void i0() {
        k0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void j0(Canvas canvas) {
        this.f11233C = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
    }

    public void k0(float f4, float f5, float f6, float f7) {
        RectF rectF = this.f11232B;
        if (f4 != rectF.left || f5 != rectF.top || f6 != rectF.right || f7 != rectF.bottom) {
            rectF.set(f4, f5, f6, f7);
            invalidateSelf();
        }
    }

    public void l0(RectF rectF) {
        k0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void m0() {
        this.f11231A.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f11231A.setColor(-1);
        this.f11231A.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final boolean n0(Drawable.Callback callback) {
        return callback instanceof View;
    }
}
