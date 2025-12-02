package e2;

import V1.a;
import android.content.Context;
import android.graphics.Color;
import b2.C0393a;
import i2.b;

/* renamed from: e2.a  reason: case insensitive filesystem */
public class C0592a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8777a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8778b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8779c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8780d;

    public C0592a(Context context) {
        this.f8777a = b.b(context, a.f2979n, false);
        this.f8778b = C0393a.a(context, a.f2978m, 0);
        this.f8779c = C0393a.a(context, a.f2976k, 0);
        this.f8780d = context.getResources().getDisplayMetrics().density;
    }

    public float a(float f4) {
        float f5 = this.f8780d;
        if (f5 <= 0.0f || f4 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f4 / f5))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i4, float f4) {
        float a4 = a(f4);
        return J.a.d(C0393a.f(J.a.d(i4, 255), this.f8778b, a4), Color.alpha(i4));
    }

    public int c(int i4, float f4) {
        return (!this.f8777a || !e(i4)) ? i4 : b(i4, f4);
    }

    public boolean d() {
        return this.f8777a;
    }

    public final boolean e(int i4) {
        return J.a.d(i4, 255) == this.f8779c;
    }
}
