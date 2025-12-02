package w1;

import android.app.Activity;
import i0.C0699u;
import z1.C1032o;

/* renamed from: w1.f  reason: case insensitive filesystem */
public class C0973f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12609a;

    public C0973f(Activity activity) {
        C1032o.g(activity, "Activity must not be null");
        this.f12609a = activity;
    }

    public final boolean a() {
        return this.f12609a instanceof C0699u;
    }

    public final boolean b() {
        return this.f12609a instanceof Activity;
    }

    public final Activity c() {
        return (Activity) this.f12609a;
    }

    public final C0699u d() {
        return (C0699u) this.f12609a;
    }
}
