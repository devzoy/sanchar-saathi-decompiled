package I3;

import D3.C0232a;
import D3.D;
import l3.i;
import m3.C0794b;
import n3.e;
import u3.l;

public class B extends C0232a implements e {

    /* renamed from: h  reason: collision with root package name */
    public final l3.e f1524h;

    public B(i iVar, l3.e eVar) {
        super(iVar, true, true);
        this.f1524h = eVar;
    }

    public void P(Object obj) {
        C0282k.c(C0794b.b(this.f1524h), D.a(obj, this.f1524h), (l) null, 2, (Object) null);
    }

    public void P0(Object obj) {
        l3.e eVar = this.f1524h;
        eVar.q(D.a(obj, eVar));
    }

    public final e l() {
        l3.e eVar = this.f1524h;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public final boolean p0() {
        return true;
    }
}
