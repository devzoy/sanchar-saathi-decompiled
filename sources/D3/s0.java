package D3;

public class s0 extends w0 implements C0269x {

    /* renamed from: g  reason: collision with root package name */
    public final boolean f843g = P0();

    public s0(p0 p0Var) {
        super(true);
        n0(p0Var);
    }

    public final boolean P0() {
        w0 A4;
        r j02 = j0();
        C0264s sVar = j02 instanceof C0264s ? (C0264s) j02 : null;
        if (!(sVar == null || (A4 = sVar.A()) == null)) {
            while (!A4.g0()) {
                r j03 = A4.j0();
                C0264s sVar2 = j03 instanceof C0264s ? (C0264s) j03 : null;
                if (sVar2 != null) {
                    A4 = sVar2.A();
                    if (A4 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean g0() {
        return this.f843g;
    }

    public boolean h0() {
        return true;
    }
}
