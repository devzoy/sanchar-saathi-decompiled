package D3;

public final class Y implements C0253k0 {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f807e;

    public Y(boolean z4) {
        this.f807e = z4;
    }

    public boolean b() {
        return this.f807e;
    }

    public A0 j() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
