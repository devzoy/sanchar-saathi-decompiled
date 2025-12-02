package R1;

import java.util.concurrent.Executor;

public final class k implements p {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f2567a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2568b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public b f2569c;

    public k(Executor executor, b bVar) {
        this.f2567a = executor;
        this.f2569c = bVar;
    }

    public final void a(f fVar) {
        synchronized (this.f2568b) {
            try {
                if (this.f2569c != null) {
                    this.f2567a.execute(new j(this, fVar));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final /* synthetic */ Object b() {
        return this.f2568b;
    }

    public final /* synthetic */ b c() {
        return this.f2569c;
    }
}
