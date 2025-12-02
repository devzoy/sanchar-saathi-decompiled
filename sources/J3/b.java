package J3;

import D3.C0271z;
import D3.x0;
import I3.B;
import I3.J;
import h3.C0667h;
import h3.C0668i;
import l3.e;
import l3.i;
import m3.C0795c;
import n3.h;
import u3.p;
import v3.g;
import v3.z;

public abstract class b {
    public static final void a(p pVar, Object obj, e eVar) {
        i a4;
        Object c4;
        e a5 = h.a(eVar);
        try {
            a4 = eVar.a();
            c4 = J.c(a4, (Object) null);
            Object g4 = ((p) z.a(pVar, 2)).g(obj, a5);
            J.a(a4, c4);
            if (g4 != C0795c.c()) {
                a5.q(C0667h.a(g4));
            }
        } catch (Throwable th) {
            C0667h.a aVar = C0667h.f9633e;
            a5.q(C0667h.a(C0668i.a(th)));
        }
    }

    public static final Object b(B b4, Object obj, p pVar) {
        Object obj2;
        try {
            obj2 = ((p) z.a(pVar, 2)).g(obj, b4);
        } catch (Throwable th) {
            obj2 = new C0271z(th, false, 2, (g) null);
        }
        if (obj2 == C0795c.c()) {
            return C0795c.c();
        }
        Object s02 = b4.s0(obj2);
        if (s02 == x0.f859b) {
            return C0795c.c();
        }
        if (!(s02 instanceof C0271z)) {
            return x0.h(s02);
        }
        throw ((C0271z) s02).f872a;
    }
}
