package a1;

import c1.C0402a;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class s implements C0402a {

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f3970e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    public final Executor f3971f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f3972g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f3973h = new Object();

    public static class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final s f3974e;

        /* renamed from: f  reason: collision with root package name */
        public final Runnable f3975f;

        public a(s sVar, Runnable runnable) {
            this.f3974e = sVar;
            this.f3975f = runnable;
        }

        public void run() {
            try {
                this.f3975f.run();
                synchronized (this.f3974e.f3973h) {
                    this.f3974e.a();
                }
            } catch (Throwable th) {
                synchronized (this.f3974e.f3973h) {
                    this.f3974e.a();
                    throw th;
                }
            }
        }
    }

    public s(Executor executor) {
        this.f3971f = executor;
    }

    public boolean C() {
        boolean z4;
        synchronized (this.f3973h) {
            z4 = !this.f3970e.isEmpty();
        }
        return z4;
    }

    public void a() {
        Runnable runnable = (Runnable) this.f3970e.poll();
        this.f3972g = runnable;
        if (runnable != null) {
            this.f3971f.execute(runnable);
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f3973h) {
            try {
                this.f3970e.add(new a(this, runnable));
                if (this.f3972g == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
