package D3;

import I3.B;
import I3.J;
import J3.a;
import J3.b;
import l3.e;
import l3.f;
import l3.i;
import l3.j;
import m3.C0795c;
import n3.h;
import u3.p;
import v3.l;

/* renamed from: D3.i  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0248i {
    public static final p0 a(I i4, i iVar, K k4, p pVar) {
        i d4 = E.d(i4, iVar);
        C0232a y0Var = k4.k() ? new y0(d4, pVar) : new F0(d4, true);
        y0Var.S0(k4, y0Var, pVar);
        return y0Var;
    }

    public static /* synthetic */ p0 b(I i4, i iVar, K k4, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            iVar = j.f11131e;
        }
        if ((i5 & 2) != 0) {
            k4 = K.DEFAULT;
        }
        return C0244g.a(i4, iVar, k4, pVar);
    }

    /* JADX INFO: finally extract failed */
    public static final Object c(i iVar, p pVar, e eVar) {
        Object obj;
        i a4 = eVar.a();
        i e4 = E.e(a4, iVar);
        t0.e(e4);
        if (e4 == a4) {
            B b4 = new B(e4, eVar);
            obj = b.b(b4, b4, pVar);
        } else {
            f.b bVar = f.f11129d;
            if (l.a(e4.d(bVar), a4.d(bVar))) {
                L0 l02 = new L0(e4, eVar);
                i a5 = l02.a();
                Object c4 = J.c(a5, (Object) null);
                try {
                    Object b5 = b.b(l02, l02, pVar);
                    J.a(a5, c4);
                    obj = b5;
                } catch (Throwable th) {
                    J.a(a5, c4);
                    throw th;
                }
            } else {
                S s4 = new S(e4, eVar);
                a.d(pVar, s4, s4, (u3.l) null, 4, (Object) null);
                obj = s4.T0();
            }
        }
        if (obj == C0795c.c()) {
            h.c(eVar);
        }
        return obj;
    }
}
