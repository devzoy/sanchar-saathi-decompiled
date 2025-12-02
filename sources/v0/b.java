package V0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2955a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2956b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2957c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2958d;

    public b(boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f2955a = z4;
        this.f2956b = z5;
        this.f2957c = z6;
        this.f2958d = z7;
    }

    public final boolean a() {
        return this.f2955a;
    }

    public final boolean b() {
        return this.f2957c;
    }

    public final boolean c() {
        return this.f2958d;
    }

    public final boolean d() {
        return this.f2956b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2955a == bVar.f2955a && this.f2956b == bVar.f2956b && this.f2957c == bVar.f2957c && this.f2958d == bVar.f2958d;
    }

    public int hashCode() {
        boolean z4 = this.f2955a;
        boolean z5 = true;
        if (z4) {
            z4 = true;
        }
        int i4 = (z4 ? 1 : 0) * true;
        boolean z6 = this.f2956b;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f2957c;
        if (z7) {
            z7 = true;
        }
        int i6 = (i5 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.f2958d;
        if (!z8) {
            z5 = z8;
        }
        return i6 + (z5 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f2955a + ", isValidated=" + this.f2956b + ", isMetered=" + this.f2957c + ", isNotRoaming=" + this.f2958d + ')';
    }
}
