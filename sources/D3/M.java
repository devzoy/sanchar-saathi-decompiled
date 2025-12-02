package D3;

import I3.C0281j;
import h3.C0667h;
import h3.C0668i;
import l3.e;

public abstract class M {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(e eVar) {
        Object obj;
        if (eVar instanceof C0281j) {
            return eVar.toString();
        }
        try {
            C0667h.a aVar = C0667h.f9633e;
            obj = C0667h.a(eVar + '@' + b(eVar));
        } catch (Throwable th) {
            C0667h.a aVar2 = C0667h.f9633e;
            obj = C0667h.a(C0668i.a(th));
        }
        Throwable b4 = C0667h.b(obj);
        String str = obj;
        if (b4 != null) {
            str = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) str;
    }
}
