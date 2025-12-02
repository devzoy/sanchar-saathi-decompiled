package y1;

/* renamed from: y1.a  reason: case insensitive filesystem */
public final class C1006a {

    /* renamed from: a  reason: collision with root package name */
    public final int f12728a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12729b;

    public C1006a(int i4, int i5) {
        this.f12728a = i4;
        this.f12729b = i5;
    }

    public int a() {
        return this.f12729b;
    }

    public int b() {
        return this.f12728a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1006a) {
            C1006a aVar = (C1006a) obj;
            return this.f12728a == aVar.f12728a && this.f12729b == aVar.f12729b;
        }
    }

    public int hashCode() {
        int i4 = this.f12728a;
        return ((i4 >>> 16) | (i4 << 16)) ^ this.f12729b;
    }

    public String toString() {
        int i4 = this.f12728a;
        int length = String.valueOf(i4).length();
        int i5 = this.f12729b;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i5).length());
        sb.append(i4);
        sb.append("x");
        sb.append(i5);
        return sb.toString();
    }
}
