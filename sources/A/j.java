package A;

import A.e;
import z.d;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static boolean[] f156a = new boolean[3];

    public static void a(f fVar, d dVar, e eVar) {
        eVar.f88j = -1;
        eVar.f90k = -1;
        e.b bVar = fVar.f56M[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f56M[0] == e.b.MATCH_PARENT) {
            int i4 = eVar.f45B.f29e;
            int N4 = fVar.N() - eVar.f47D.f29e;
            d dVar2 = eVar.f45B;
            dVar2.f31g = dVar.q(dVar2);
            d dVar3 = eVar.f47D;
            dVar3.f31g = dVar.q(dVar3);
            dVar.f(eVar.f45B.f31g, i4);
            dVar.f(eVar.f47D.f31g, N4);
            eVar.f88j = 2;
            eVar.h0(i4, N4);
        }
        if (fVar.f56M[1] != bVar2 && eVar.f56M[1] == e.b.MATCH_PARENT) {
            int i5 = eVar.f46C.f29e;
            int t4 = fVar.t() - eVar.f48E.f29e;
            d dVar4 = eVar.f46C;
            dVar4.f31g = dVar.q(dVar4);
            d dVar5 = eVar.f48E;
            dVar5.f31g = dVar.q(dVar5);
            dVar.f(eVar.f46C.f31g, i5);
            dVar.f(eVar.f48E.f31g, t4);
            if (eVar.f68Y > 0 || eVar.M() == 8) {
                d dVar6 = eVar.f49F;
                dVar6.f31g = dVar.q(dVar6);
                dVar.f(eVar.f49F.f31g, eVar.f68Y + i5);
            }
            eVar.f90k = 2;
            eVar.v0(i5, t4);
        }
    }

    public static final boolean b(int i4, int i5) {
        return (i4 & i5) == i5;
    }
}
