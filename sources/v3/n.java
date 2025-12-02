package v3;

public final class n implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Class f12463a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12464b;

    public n(Class cls, String str) {
        l.e(cls, "jClass");
        l.e(str, "moduleName");
        this.f12463a = cls;
        this.f12464b = str;
    }

    public Class d() {
        return this.f12463a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) && l.a(d(), ((n) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d() + " (Kotlin reflection is not available)";
    }
}
