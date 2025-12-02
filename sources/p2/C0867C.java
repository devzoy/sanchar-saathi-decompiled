package p2;

/* renamed from: p2.C  reason: case insensitive filesystem */
public final class C0867C extends C0873d {

    /* renamed from: a  reason: collision with root package name */
    public final int f11680a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11681b;

    public /* synthetic */ C0867C(int i4, boolean z4, C0866B b4) {
        this.f11680a = i4;
        this.f11681b = z4;
    }

    public final boolean a() {
        return this.f11681b;
    }

    public final int b() {
        return this.f11680a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0873d) {
            C0873d dVar = (C0873d) obj;
            return this.f11680a == dVar.b() && this.f11681b == dVar.a();
        }
    }

    public final int hashCode() {
        return ((this.f11680a ^ 1000003) * 1000003) ^ (true != this.f11681b ? 1237 : 1231);
    }

    public final String toString() {
        int i4 = this.f11680a;
        boolean z4 = this.f11681b;
        return "AppUpdateOptions{appUpdateType=" + i4 + ", allowAssetPackDeletion=" + z4 + "}";
    }
}
