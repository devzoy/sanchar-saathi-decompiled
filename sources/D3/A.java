package D3;

import u3.l;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final Object f772a;

    /* renamed from: b  reason: collision with root package name */
    public final l f773b;

    public A(Object obj, l lVar) {
        this.f772a = obj;
        this.f773b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a4 = (A) obj;
        return v3.l.a(this.f772a, a4.f772a) && v3.l.a(this.f773b, a4.f773b);
    }

    public int hashCode() {
        Object obj = this.f772a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f773b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f772a + ", onCancellation=" + this.f773b + ')';
    }
}
