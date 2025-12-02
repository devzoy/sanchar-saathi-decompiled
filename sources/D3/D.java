package D3;

import h3.C0667h;
import h3.C0668i;
import l3.e;
import u3.l;
import v3.g;

public abstract class D {
    public static final Object a(Object obj, e eVar) {
        if (!(obj instanceof C0271z)) {
            return C0667h.a(obj);
        }
        C0667h.a aVar = C0667h.f9633e;
        return C0667h.a(C0668i.a(((C0271z) obj).f872a));
    }

    public static final Object b(Object obj, C0254l lVar) {
        Throwable b4 = C0667h.b(obj);
        return b4 == null ? obj : new C0271z(b4, false, 2, (g) null);
    }

    public static final Object c(Object obj, l lVar) {
        Throwable b4 = C0667h.b(obj);
        return b4 == null ? lVar != null ? new A(obj, lVar) : obj : new C0271z(b4, false, 2, (g) null);
    }

    public static /* synthetic */ Object d(Object obj, l lVar, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
