package R1;

import java.util.Objects;

public final class j implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f2565e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2566f;

    public j(k kVar, f fVar) {
        this.f2565e = fVar;
        Objects.requireNonNull(kVar);
        this.f2566f = kVar;
    }

    public final void run() {
        k kVar = this.f2566f;
        synchronized (kVar.b()) {
            try {
                if (kVar.c() != null) {
                    kVar.c().a(this.f2565e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
