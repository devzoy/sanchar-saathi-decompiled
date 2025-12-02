package l3;

import l3.i;
import u3.l;

public abstract class b implements i.c {

    /* renamed from: e  reason: collision with root package name */
    public final l f11125e;

    /* renamed from: f  reason: collision with root package name */
    public final i.c f11126f;

    public b(i.c cVar, l lVar) {
        v3.l.e(cVar, "baseKey");
        v3.l.e(lVar, "safeCast");
        this.f11125e = lVar;
        this.f11126f = cVar instanceof b ? ((b) cVar).f11126f : cVar;
    }

    public final boolean a(i.c cVar) {
        v3.l.e(cVar, "key");
        return cVar == this || this.f11126f == cVar;
    }

    public final i.b b(i.b bVar) {
        v3.l.e(bVar, "element");
        return (i.b) this.f11125e.i(bVar);
    }
}
