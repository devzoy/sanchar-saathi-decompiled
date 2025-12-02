package w1;

import android.app.Activity;
import u1.C0941a;
import u1.d;
import v.b;
import z1.C1032o;

/* renamed from: w1.p  reason: case insensitive filesystem */
public final class C0983p extends Y {

    /* renamed from: h  reason: collision with root package name */
    public final b f12622h = new b();

    /* renamed from: i  reason: collision with root package name */
    public final C0972e f12623i;

    public C0983p(C0975h hVar, C0972e eVar, d dVar) {
        super(hVar, dVar);
        this.f12623i = eVar;
        this.f12612c.a("ConnectionlessLifecycleHelper", this);
    }

    public static void t(Activity activity, C0972e eVar, C0969b bVar) {
        C0975h c4 = C0974g.c(activity);
        C0983p pVar = (C0983p) c4.c("ConnectionlessLifecycleHelper", C0983p.class);
        if (pVar == null) {
            pVar = new C0983p(c4, eVar, d.m());
        }
        C1032o.g(bVar, "ApiKey cannot be null");
        pVar.f12622h.add(bVar);
        eVar.p(pVar);
    }

    public final void h() {
        super.h();
        v();
    }

    public final void j() {
        super.j();
        v();
    }

    public final void k() {
        super.k();
        this.f12623i.q(this);
    }

    public final void o(C0941a aVar, int i4) {
        this.f12623i.x(aVar, i4);
    }

    public final void p() {
        this.f12623i.s();
    }

    public final b u() {
        return this.f12622h;
    }

    public final void v() {
        if (!this.f12622h.isEmpty()) {
            this.f12623i.p(this);
        }
    }
}
