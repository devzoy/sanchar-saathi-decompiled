package D3;

import java.util.concurrent.CancellationException;
import l3.i;

public abstract /* synthetic */ class u0 {
    public static final C0269x a(p0 p0Var) {
        return new s0(p0Var);
    }

    public static /* synthetic */ C0269x b(p0 p0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = null;
        }
        return t0.a(p0Var);
    }

    public static final void c(i iVar, CancellationException cancellationException) {
        p0 p0Var = (p0) iVar.d(p0.f838b);
        if (p0Var != null) {
            p0Var.c(cancellationException);
        }
    }

    public static final void d(p0 p0Var) {
        if (!p0Var.b()) {
            throw p0Var.z();
        }
    }

    public static final void e(i iVar) {
        p0 p0Var = (p0) iVar.d(p0.f838b);
        if (p0Var != null) {
            t0.d(p0Var);
        }
    }
}
