package u0;

import h3.C0673n;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import v3.l;

/* renamed from: u0.C  reason: case insensitive filesystem */
public final class C0937C implements Executor {

    /* renamed from: e  reason: collision with root package name */
    public final Executor f12106e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f12107f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    public Runnable f12108g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f12109h = new Object();

    public C0937C(Executor executor) {
        l.e(executor, "executor");
        this.f12106e = executor;
    }

    public static final void b(Runnable runnable, C0937C c4) {
        l.e(runnable, "$command");
        l.e(c4, "this$0");
        try {
            runnable.run();
        } finally {
            c4.c();
        }
    }

    public final void c() {
        synchronized (this.f12109h) {
            try {
                Object poll = this.f12107f.poll();
                Runnable runnable = (Runnable) poll;
                this.f12108g = runnable;
                if (poll != null) {
                    this.f12106e.execute(runnable);
                }
                C0673n nVar = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void execute(Runnable runnable) {
        l.e(runnable, "command");
        synchronized (this.f12109h) {
            try {
                this.f12107f.offer(new C0936B(runnable, this));
                if (this.f12108g == null) {
                    c();
                }
                C0673n nVar = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
