package D3;

import I3.C0281j;
import l3.e;

/* renamed from: D3.o  reason: case insensitive filesystem */
public abstract class C0260o {
    public static final void a(C0254l lVar, W w4) {
        lVar.I(new X(w4));
    }

    public static final C0256m b(e eVar) {
        if (!(eVar instanceof C0281j)) {
            return new C0256m(eVar, 1);
        }
        C0256m j4 = ((C0281j) eVar).j();
        if (j4 != null) {
            if (!j4.M()) {
                j4 = null;
            }
            if (j4 != null) {
                return j4;
            }
        }
        return new C0256m(eVar, 2);
    }
}
