package D3;

import l3.f;
import l3.i;
import l3.j;
import u3.p;

/* renamed from: D3.h  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0246h {
    public static final Object a(i iVar, p pVar) {
        i iVar2;
        Z z4;
        Thread currentThread = Thread.currentThread();
        f fVar = (f) iVar.d(f.f11129d);
        if (fVar == null) {
            z4 = J0.f784a.b();
            iVar2 = E.d(C0249i0.f824e, iVar.h(z4));
        } else {
            Z z5 = null;
            Z z6 = fVar instanceof Z ? (Z) fVar : null;
            if (z6 != null) {
                if (z6.Y()) {
                    z5 = z6;
                }
                if (z5 != null) {
                    z4 = z5;
                    iVar2 = E.d(C0249i0.f824e, iVar);
                }
            }
            z4 = J0.f784a.a();
            iVar2 = E.d(C0249i0.f824e, iVar);
        }
        C0240e eVar = new C0240e(iVar2, currentThread, z4);
        eVar.S0(K.DEFAULT, eVar, pVar);
        return eVar.T0();
    }

    public static /* synthetic */ Object b(i iVar, p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            iVar = j.f11131e;
        }
        return C0244g.c(iVar, pVar);
    }
}
