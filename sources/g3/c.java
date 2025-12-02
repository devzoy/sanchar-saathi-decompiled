package G3;

import F3.a;
import F3.r;
import H3.e;
import h3.C0673n;
import l3.i;
import m3.C0795c;
import u3.p;

public abstract class c extends e {

    /* renamed from: h  reason: collision with root package name */
    public final p f1279h;

    public c(p pVar, i iVar, int i4, a aVar) {
        super(iVar, i4, aVar);
        this.f1279h = pVar;
    }

    public static /* synthetic */ Object k(c cVar, r rVar, l3.e eVar) {
        Object g4 = cVar.f1279h.g(rVar, eVar);
        return g4 == C0795c.c() ? g4 : C0673n.f9639a;
    }

    public Object f(r rVar, l3.e eVar) {
        return k(this, rVar, eVar);
    }

    public String toString() {
        return "block[" + this.f1279h + "] -> " + super.toString();
    }
}
