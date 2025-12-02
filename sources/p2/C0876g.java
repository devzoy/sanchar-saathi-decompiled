package p2;

/* renamed from: p2.g  reason: case insensitive filesystem */
public final class C0876g {

    /* renamed from: a  reason: collision with root package name */
    public n f11705a;

    public /* synthetic */ C0876g(C0875f fVar) {
    }

    public final C0874e a() {
        n nVar = this.f11705a;
        if (nVar != null) {
            return new C0869E(nVar, (C0868D) null);
        }
        throw new IllegalStateException(String.valueOf(n.class.getCanonicalName()).concat(" must be set"));
    }

    public final C0876g b(n nVar) {
        this.f11705a = nVar;
        return this;
    }
}
