package Z0;

import v3.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f3802a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f3803b;

    public d(String str, Long l4) {
        l.e(str, "key");
        this.f3802a = str;
        this.f3803b = l4;
    }

    public final String a() {
        return this.f3802a;
    }

    public final Long b() {
        return this.f3803b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f3802a, dVar.f3802a) && l.a(this.f3803b, dVar.f3803b);
    }

    public int hashCode() {
        int hashCode = this.f3802a.hashCode() * 31;
        Long l4 = this.f3803b;
        return hashCode + (l4 == null ? 0 : l4.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f3802a + ", value=" + this.f3803b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z4) {
        this(str, Long.valueOf(z4 ? 1 : 0));
        l.e(str, "key");
    }
}
