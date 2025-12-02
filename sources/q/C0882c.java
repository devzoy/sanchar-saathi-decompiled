package q;

import java.util.concurrent.Executor;

/* renamed from: q.c  reason: case insensitive filesystem */
public class C0882c extends C0884e {

    /* renamed from: c  reason: collision with root package name */
    public static volatile C0882c f11745c;

    /* renamed from: d  reason: collision with root package name */
    public static final Executor f11746d = new C0880a();

    /* renamed from: e  reason: collision with root package name */
    public static final Executor f11747e = new C0881b();

    /* renamed from: a  reason: collision with root package name */
    public C0884e f11748a;

    /* renamed from: b  reason: collision with root package name */
    public final C0884e f11749b;

    public C0882c() {
        C0883d dVar = new C0883d();
        this.f11749b = dVar;
        this.f11748a = dVar;
    }

    public static Executor f() {
        return f11747e;
    }

    public static C0882c g() {
        if (f11745c != null) {
            return f11745c;
        }
        synchronized (C0882c.class) {
            try {
                if (f11745c == null) {
                    f11745c = new C0882c();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f11745c;
    }

    public void a(Runnable runnable) {
        this.f11748a.a(runnable);
    }

    public boolean b() {
        return this.f11748a.b();
    }

    public void c(Runnable runnable) {
        this.f11748a.c(runnable);
    }
}
