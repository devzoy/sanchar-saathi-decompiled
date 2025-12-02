package a1;

import Q0.i;
import R0.E;
import R0.v;

public class u implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public static final String f3979h = i.i("StopWorkRunnable");

    /* renamed from: e  reason: collision with root package name */
    public final E f3980e;

    /* renamed from: f  reason: collision with root package name */
    public final v f3981f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3982g;

    public u(E e4, v vVar, boolean z4) {
        this.f3980e = e4;
        this.f3981f = vVar;
        this.f3982g = z4;
    }

    public void run() {
        boolean t4 = this.f3982g ? this.f3980e.n().t(this.f3981f) : this.f3980e.n().u(this.f3981f);
        i e4 = i.e();
        String str = f3979h;
        e4.a(str, "StopWorkRunnable for " + this.f3981f.a().b() + "; Processor.stopWork = " + t4);
    }
}
