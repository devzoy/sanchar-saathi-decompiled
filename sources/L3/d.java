package l3;

import java.io.Serializable;
import l3.i;
import u3.p;
import v3.l;

public final class d implements i, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public final i f11127e;

    /* renamed from: f  reason: collision with root package name */
    public final i.b f11128f;

    public d(i iVar, i.b bVar) {
        l.e(iVar, "left");
        l.e(bVar, "element");
        this.f11127e = iVar;
        this.f11128f = bVar;
    }

    public static final String o(String str, i.b bVar) {
        l.e(str, "acc");
        l.e(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    public i B(i.c cVar) {
        l.e(cVar, "key");
        if (this.f11128f.d(cVar) != null) {
            return this.f11127e;
        }
        i B4 = this.f11127e.B(cVar);
        return B4 == this.f11127e ? this : B4 == j.f11131e ? this.f11128f : new d(B4, this.f11128f);
    }

    public Object H(Object obj, p pVar) {
        l.e(pVar, "operation");
        return pVar.g(this.f11127e.H(obj, pVar), this.f11128f);
    }

    public i.b d(i.c cVar) {
        l.e(cVar, "key");
        d dVar = this;
        while (true) {
            i.b d4 = dVar.f11128f.d(cVar);
            if (d4 != null) {
                return d4;
            }
            i iVar = dVar.f11127e;
            if (!(iVar instanceof d)) {
                return iVar.d(cVar);
            }
            dVar = (d) iVar;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (dVar.n() != n() || !dVar.l(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(i.b bVar) {
        return l.a(d(bVar.getKey()), bVar);
    }

    public i h(i iVar) {
        return i.a.b(this, iVar);
    }

    public int hashCode() {
        return this.f11127e.hashCode() + this.f11128f.hashCode();
    }

    public final boolean l(d dVar) {
        while (f(dVar.f11128f)) {
            i iVar = dVar.f11127e;
            if (iVar instanceof d) {
                dVar = (d) iVar;
            } else {
                l.c(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return f((i.b) iVar);
            }
        }
        return false;
    }

    public final int n() {
        int i4 = 2;
        d dVar = this;
        while (true) {
            i iVar = dVar.f11127e;
            dVar = iVar instanceof d ? (d) iVar : null;
            if (dVar == null) {
                return i4;
            }
            i4++;
        }
    }

    public String toString() {
        return '[' + ((String) H("", new c())) + ']';
    }
}
