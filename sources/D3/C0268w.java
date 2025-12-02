package D3;

import h3.C0667h;

/* renamed from: D3.w  reason: case insensitive filesystem */
public abstract class C0268w {
    public static final C0266u a(p0 p0Var) {
        return new C0267v(p0Var);
    }

    public static /* synthetic */ C0266u b(p0 p0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = null;
        }
        return a(p0Var);
    }

    public static final boolean c(C0266u uVar, Object obj) {
        Throwable b4 = C0667h.b(obj);
        return b4 == null ? uVar.t(obj) : uVar.r(b4);
    }
}
