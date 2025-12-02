package v3;

import A3.a;
import A3.e;

public abstract class i extends c implements h, e {

    /* renamed from: l  reason: collision with root package name */
    public final int f12460l;

    /* renamed from: m  reason: collision with root package name */
    public final int f12461m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(int i4, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f12460l = i4;
        this.f12461m = i5 >> 1;
    }

    public a b() {
        return x.a(this);
    }

    public int d() {
        return this.f12460l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return j().equals(iVar.j()) && n().equals(iVar.n()) && this.f12461m == iVar.f12461m && this.f12460l == iVar.f12460l && l.a(e(), iVar.e()) && l.a(l(), iVar.l());
        } else if (obj instanceof e) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((l() == null ? 0 : l().hashCode() * 31) + j().hashCode()) * 31) + n().hashCode();
    }

    public String toString() {
        a a4 = a();
        if (a4 != this) {
            return a4.toString();
        }
        if ("<init>".equals(j())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + j() + " (Kotlin reflection is not available)";
    }
}
