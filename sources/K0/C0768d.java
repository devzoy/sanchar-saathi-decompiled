package k0;

import android.view.animation.Interpolator;

/* renamed from: k0.d  reason: case insensitive filesystem */
public abstract class C0768d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f10965a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10966b;

    public C0768d(float[] fArr) {
        this.f10965a = fArr;
        this.f10966b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f4) {
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f10965a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f4), fArr.length - 2);
        float f5 = this.f10966b;
        float f6 = (f4 - (((float) min) * f5)) / f5;
        float[] fArr2 = this.f10965a;
        float f7 = fArr2[min];
        return f7 + (f6 * (fArr2[min + 1] - f7));
    }
}
