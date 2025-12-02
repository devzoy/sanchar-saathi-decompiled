package Z0;

import v3.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f3807a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3808b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3809c;

    public i(String str, int i4, int i5) {
        l.e(str, "workSpecId");
        this.f3807a = str;
        this.f3808b = i4;
        this.f3809c = i5;
    }

    public final int a() {
        return this.f3808b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f3807a, iVar.f3807a) && this.f3808b == iVar.f3808b && this.f3809c == iVar.f3809c;
    }

    public int hashCode() {
        return (((this.f3807a.hashCode() * 31) + Integer.hashCode(this.f3808b)) * 31) + Integer.hashCode(this.f3809c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f3807a + ", generation=" + this.f3808b + ", systemId=" + this.f3809c + ')';
    }
}
