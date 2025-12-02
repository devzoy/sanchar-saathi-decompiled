package H3;

import I3.J;
import l3.e;
import l3.i;
import m3.C0795c;
import n3.h;
import u3.p;
import v3.z;

public abstract class f {
    /* JADX INFO: finally extract failed */
    public static final Object b(i iVar, Object obj, Object obj2, p pVar, e eVar) {
        Object c4 = J.c(iVar, obj2);
        try {
            Object g4 = ((p) z.a(pVar, 2)).g(obj, new r(eVar, iVar));
            J.a(iVar, c4);
            if (g4 == C0795c.c()) {
                h.c(eVar);
            }
            return g4;
        } catch (Throwable th) {
            J.a(iVar, c4);
            throw th;
        }
    }

    public static /* synthetic */ Object c(i iVar, Object obj, Object obj2, p pVar, e eVar, int i4, Object obj3) {
        if ((i4 & 4) != 0) {
            obj2 = J.b(iVar);
        }
        return b(iVar, obj, obj2, pVar, eVar);
    }

    public static final G3.e d(G3.e eVar, i iVar) {
        return eVar instanceof q ? eVar : new s(eVar, iVar);
    }
}
