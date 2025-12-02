package D3;

import I3.C0281j;
import I3.J;
import h3.C0667h;
import h3.C0668i;
import h3.C0673n;
import l3.e;
import l3.i;
import v3.l;

public abstract class U {
    public static final void a(T t4, int i4) {
        e d4 = t4.d();
        boolean z4 = i4 == 4;
        if (z4 || !(d4 instanceof C0281j) || b(i4) != b(t4.f801g)) {
            d(t4, d4, z4);
            return;
        }
        F f4 = ((C0281j) d4).f1553h;
        i a4 = d4.a();
        if (f4.L(a4)) {
            f4.K(a4, t4);
        } else {
            e(t4);
        }
    }

    public static final boolean b(int i4) {
        return i4 == 1 || i4 == 2;
    }

    public static final boolean c(int i4) {
        return i4 == 2;
    }

    public static final void d(T t4, e eVar, boolean z4) {
        Object f4;
        Object h4 = t4.h();
        Throwable e4 = t4.e(h4);
        if (e4 != null) {
            C0667h.a aVar = C0667h.f9633e;
            f4 = C0668i.a(e4);
        } else {
            C0667h.a aVar2 = C0667h.f9633e;
            f4 = t4.f(h4);
        }
        Object a4 = C0667h.a(f4);
        if (z4) {
            l.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C0281j jVar = (C0281j) eVar;
            e eVar2 = jVar.f1554i;
            Object obj = jVar.f1556k;
            i a5 = eVar2.a();
            Object c4 = J.c(a5, obj);
            L0 g4 = c4 != J.f1532a ? E.g(eVar2, a5, c4) : null;
            try {
                jVar.f1554i.q(a4);
                C0673n nVar = C0673n.f9639a;
            } finally {
                if (g4 == null || g4.T0()) {
                    J.a(a5, c4);
                }
            }
        } else {
            eVar.q(a4);
        }
    }

    public static final void e(T t4) {
        Z b4 = J0.f784a.b();
        if (b4.U()) {
            b4.Q(t4);
            return;
        }
        b4.S(true);
        try {
            d(t4, t4.d(), true);
            do {
            } while (b4.X());
        } catch (Throwable th) {
            b4.N(true);
            throw th;
        }
        b4.N(true);
    }
}
