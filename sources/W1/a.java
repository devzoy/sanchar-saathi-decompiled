package W1;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import k0.C0765a;
import k0.C0766b;
import k0.C0767c;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f3396a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f3397b = new C0766b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f3398c = new C0765a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f3399d = new C0767c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f3400e = new DecelerateInterpolator();

    public static float a(float f4, float f5, float f6) {
        return f4 + (f6 * (f5 - f4));
    }
}
