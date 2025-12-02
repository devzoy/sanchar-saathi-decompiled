package androidx.datastore.preferences.protobuf;

public class o0 extends m0 {
    /* renamed from: A */
    public n0 g(Object obj) {
        return ((C0370w) obj).unknownFields;
    }

    /* renamed from: B */
    public int h(n0 n0Var) {
        return n0Var.d();
    }

    /* renamed from: C */
    public int i(n0 n0Var) {
        return n0Var.e();
    }

    /* renamed from: D */
    public n0 k(n0 n0Var, n0 n0Var2) {
        return n0.c().equals(n0Var2) ? n0Var : n0.c().equals(n0Var) ? n0.j(n0Var, n0Var2) : n0Var.i(n0Var2);
    }

    /* renamed from: E */
    public n0 n() {
        return n0.k();
    }

    /* renamed from: F */
    public void o(Object obj, n0 n0Var) {
        p(obj, n0Var);
    }

    /* renamed from: G */
    public void p(Object obj, n0 n0Var) {
        ((C0370w) obj).unknownFields = n0Var;
    }

    /* renamed from: H */
    public n0 r(n0 n0Var) {
        n0Var.h();
        return n0Var;
    }

    /* renamed from: I */
    public void s(n0 n0Var, s0 s0Var) {
        n0Var.p(s0Var);
    }

    /* renamed from: J */
    public void t(n0 n0Var, s0 s0Var) {
        n0Var.r(s0Var);
    }

    public void j(Object obj) {
        g(obj).h();
    }

    public boolean q(e0 e0Var) {
        return false;
    }

    /* renamed from: u */
    public void a(n0 n0Var, int i4, int i5) {
        n0Var.n(r0.c(i4, 5), Integer.valueOf(i5));
    }

    /* renamed from: v */
    public void b(n0 n0Var, int i4, long j4) {
        n0Var.n(r0.c(i4, 1), Long.valueOf(j4));
    }

    /* renamed from: w */
    public void c(n0 n0Var, int i4, n0 n0Var2) {
        n0Var.n(r0.c(i4, 3), n0Var2);
    }

    /* renamed from: x */
    public void d(n0 n0Var, int i4, C0355g gVar) {
        n0Var.n(r0.c(i4, 2), gVar);
    }

    /* renamed from: y */
    public void e(n0 n0Var, int i4, long j4) {
        n0Var.n(r0.c(i4, 0), Long.valueOf(j4));
    }

    /* renamed from: z */
    public n0 f(Object obj) {
        n0 A4 = g(obj);
        if (A4 != n0.c()) {
            return A4;
        }
        n0 k4 = n0.k();
        p(obj, k4);
        return k4;
    }
}
