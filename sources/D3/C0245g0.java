package D3;

import I3.C0274c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import l3.i;

/* renamed from: D3.g0  reason: case insensitive filesystem */
public final class C0245g0 extends C0243f0 implements Q {

    /* renamed from: h  reason: collision with root package name */
    public final Executor f823h;

    public C0245g0(Executor executor) {
        this.f823h = executor;
        C0274c.a(O());
    }

    public void K(i iVar, Runnable runnable) {
        try {
            Executor O4 = O();
            C0236c.a();
            O4.execute(runnable);
        } catch (RejectedExecutionException e4) {
            C0236c.a();
            N(iVar, e4);
            V.b().K(iVar, runnable);
        }
    }

    public final void N(i iVar, RejectedExecutionException rejectedExecutionException) {
        t0.c(iVar, C0241e0.a("The task was rejected", rejectedExecutionException));
    }

    public Executor O() {
        return this.f823h;
    }

    public void close() {
        Executor O4 = O();
        ExecutorService executorService = O4 instanceof ExecutorService ? (ExecutorService) O4 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0245g0) && ((C0245g0) obj).O() == O();
    }

    public int hashCode() {
        return System.identityHashCode(O());
    }

    public String toString() {
        return O().toString();
    }
}
