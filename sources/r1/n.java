package R1;

import java.util.Objects;

public final class n implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f2575e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f2576f;

    public n(o oVar, f fVar) {
        this.f2575e = fVar;
        Objects.requireNonNull(oVar);
        this.f2576f = oVar;
    }

    public final void run() {
        o oVar = this.f2576f;
        synchronized (oVar.b()) {
            try {
                if (oVar.c() != null) {
                    oVar.c().a(this.f2575e.f());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
