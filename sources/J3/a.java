package J3;

import I3.C0282k;
import h3.C0667h;
import h3.C0668i;
import h3.C0673n;
import l3.e;
import m3.C0794b;
import u3.l;
import u3.p;

public abstract class a {
    public static final void a(e eVar, Throwable th) {
        C0667h.a aVar = C0667h.f9633e;
        eVar.q(C0667h.a(C0668i.a(th)));
        throw th;
    }

    public static final void b(e eVar, e eVar2) {
        try {
            e b4 = C0794b.b(eVar);
            C0667h.a aVar = C0667h.f9633e;
            C0282k.c(b4, C0667h.a(C0673n.f9639a), (l) null, 2, (Object) null);
        } catch (Throwable th) {
            a(eVar2, th);
        }
    }

    public static final void c(p pVar, Object obj, e eVar, l lVar) {
        try {
            e b4 = C0794b.b(C0794b.a(pVar, obj, eVar));
            C0667h.a aVar = C0667h.f9633e;
            C0282k.b(b4, C0667h.a(C0673n.f9639a), lVar);
        } catch (Throwable th) {
            a(eVar, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, e eVar, l lVar, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, eVar, lVar);
    }
}
