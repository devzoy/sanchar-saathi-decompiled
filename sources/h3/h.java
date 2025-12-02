package H3;

import F3.a;
import G3.d;
import G3.e;
import h3.C0673n;
import l3.i;
import l3.j;
import m3.C0795c;
import v3.g;

public final class h extends g {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(d dVar, i iVar, int i4, a aVar, int i5, g gVar) {
        this(dVar, (i5 & 2) != 0 ? j.f11131e : iVar, (i5 & 4) != 0 ? -3 : i4, (i5 & 8) != 0 ? a.SUSPEND : aVar);
    }

    public e g(i iVar, int i4, a aVar) {
        return new h(this.f1452h, iVar, i4, aVar);
    }

    public Object n(e eVar, l3.e eVar2) {
        Object c4 = this.f1452h.c(eVar, eVar2);
        return c4 == C0795c.c() ? c4 : C0673n.f9639a;
    }

    public h(d dVar, i iVar, int i4, a aVar) {
        super(dVar, iVar, i4, aVar);
    }
}
