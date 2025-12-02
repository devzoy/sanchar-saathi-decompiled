package v3;

import A3.a;
import A3.h;

public abstract class s extends c implements h {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f12465l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        boolean z4 = false;
        this.f12465l = (i4 & 2) == 2 ? true : z4;
    }

    public a a() {
        return this.f12465l ? this : super.a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return l().equals(sVar.l()) && j().equals(sVar.j()) && n().equals(sVar.n()) && l.a(e(), sVar.e());
        } else if (obj instanceof h) {
            return obj.equals(a());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((l().hashCode() * 31) + j().hashCode()) * 31) + n().hashCode();
    }

    public h o() {
        if (!this.f12465l) {
            return (h) super.m();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public String toString() {
        a a4 = a();
        if (a4 != this) {
            return a4.toString();
        }
        return "property " + j() + " (Kotlin reflection is not available)";
    }
}
