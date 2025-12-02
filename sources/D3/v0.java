package D3;

import v3.l;

public abstract class v0 extends B implements W, C0253k0 {

    /* renamed from: h  reason: collision with root package name */
    public w0 f844h;

    public final w0 A() {
        w0 w0Var = this.f844h;
        if (w0Var != null) {
            return w0Var;
        }
        l.n("job");
        return null;
    }

    public final void B(w0 w0Var) {
        this.f844h = w0Var;
    }

    public void a() {
        A().D0(this);
    }

    public boolean b() {
        return true;
    }

    public A0 j() {
        return null;
    }

    public String toString() {
        return M.a(this) + '@' + M.b(this) + "[job@" + M.b(A()) + ']';
    }
}
