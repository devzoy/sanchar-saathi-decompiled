package N2;

import N2.F;
import android.view.KeyEvent;

public final /* synthetic */ class C implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ D f1855e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ F.c f1856f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f1857g;

    public /* synthetic */ C(D d4, F.c cVar, KeyEvent keyEvent) {
        this.f1855e = d4;
        this.f1856f = cVar;
        this.f1857g = keyEvent;
    }

    public final void run() {
        this.f1855e.m(this.f1856f, this.f1857g);
    }
}
