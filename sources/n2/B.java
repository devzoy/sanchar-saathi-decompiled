package N2;

import N2.F;
import android.view.KeyEvent;

public final /* synthetic */ class B implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ D f1851e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ F.c f1852f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f1853g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f1854h;

    public /* synthetic */ B(D d4, F.c cVar, long j4, KeyEvent keyEvent) {
        this.f1851e = d4;
        this.f1852f = cVar;
        this.f1853g = j4;
        this.f1854h = keyEvent;
    }

    public final void run() {
        this.f1851e.l(this.f1852f, this.f1853g, this.f1854h);
    }
}
