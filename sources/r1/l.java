package R1;

import java.util.Objects;
import z1.C1032o;

public final class l implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f2570e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f2571f;

    public l(m mVar, f fVar) {
        this.f2570e = fVar;
        Objects.requireNonNull(mVar);
        this.f2571f = mVar;
    }

    public final void run() {
        m mVar = this.f2571f;
        synchronized (mVar.b()) {
            try {
                if (mVar.c() != null) {
                    mVar.c().a((Exception) C1032o.f(this.f2570e.e()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
