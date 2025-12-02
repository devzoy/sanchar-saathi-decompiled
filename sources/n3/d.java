package n3;

import l3.e;
import l3.f;
import l3.i;
import v3.l;

public abstract class d extends C0807a {

    /* renamed from: f  reason: collision with root package name */
    public final i f11269f;

    /* renamed from: g  reason: collision with root package name */
    public transient e f11270g;

    public d(e eVar, i iVar) {
        super(eVar);
        this.f11269f = iVar;
    }

    public i a() {
        i iVar = this.f11269f;
        l.b(iVar);
        return iVar;
    }

    public void p() {
        e eVar = this.f11270g;
        if (!(eVar == null || eVar == this)) {
            i.b d4 = a().d(f.f11129d);
            l.b(d4);
            ((f) d4).e(eVar);
        }
        this.f11270g = c.f11268e;
    }

    public final e r() {
        e eVar = this.f11270g;
        if (eVar == null) {
            f fVar = (f) a().d(f.f11129d);
            if (fVar == null || (eVar = fVar.J(this)) == null) {
                eVar = this;
            }
            this.f11270g = eVar;
        }
        return eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        this(eVar, eVar != null ? eVar.a() : null);
    }
}
