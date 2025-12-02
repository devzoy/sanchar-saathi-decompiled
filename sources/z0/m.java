package Z0;

import v3.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f3817a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3818b;

    public m(String str, int i4) {
        l.e(str, "workSpecId");
        this.f3817a = str;
        this.f3818b = i4;
    }

    public final int a() {
        return this.f3818b;
    }

    public final String b() {
        return this.f3817a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f3817a, mVar.f3817a) && this.f3818b == mVar.f3818b;
    }

    public int hashCode() {
        return (this.f3817a.hashCode() * 31) + Integer.hashCode(this.f3818b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f3817a + ", generation=" + this.f3818b + ')';
    }
}
