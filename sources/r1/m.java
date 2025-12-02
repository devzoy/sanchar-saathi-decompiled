package R1;

import java.util.concurrent.Executor;

public final class m implements p {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f2572a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2573b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public c f2574c;

    public m(Executor executor, c cVar) {
        this.f2572a = executor;
        this.f2574c = cVar;
    }

    public final void a(f fVar) {
        if (!fVar.i() && !fVar.g()) {
            synchronized (this.f2573b) {
                try {
                    if (this.f2574c != null) {
                        this.f2572a.execute(new l(this, fVar));
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
        return this.f2573b;
    }

    public final /* synthetic */ c c() {
        return this.f2574c;
    }
}
