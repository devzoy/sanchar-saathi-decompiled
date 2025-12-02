package K3;

import D3.C0243f0;
import D3.F;
import I3.G;
import I3.I;
import java.util.concurrent.Executor;
import l3.i;
import l3.j;
import z3.e;

public final class b extends C0243f0 implements Executor {

    /* renamed from: h  reason: collision with root package name */
    public static final b f1741h = new b();

    /* renamed from: i  reason: collision with root package name */
    public static final F f1742i = m.f1762g.M(I.e("kotlinx.coroutines.io.parallelism", e.a(64, G.a()), 0, 0, 12, (Object) null));

    public void K(i iVar, Runnable runnable) {
        f1742i.K(iVar, runnable);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    public void execute(Runnable runnable) {
        K(j.f11131e, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
