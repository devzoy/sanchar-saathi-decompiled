package R1;

import java.util.concurrent.Executor;

public final class o implements p {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f2577a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2578b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public d f2579c;

    public o(Executor executor, d dVar) {
        this.f2577a = executor;
        this.f2579c = dVar;
    }

    public final void a(f fVar) {
        if (fVar.i()) {
            synchronized (this.f2578b) {
                try {
                    if (this.f2579c != null) {
                        this.f2577a.execute(new n(this, fVar));
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final /* synthetic */ Object b() {
        return this.f2578b;
    }

    public final /* synthetic */ d c() {
        return this.f2579c;
    }
}
