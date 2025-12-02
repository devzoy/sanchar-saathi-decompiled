package I3;

import B3.e;
import B3.g;
import D3.G;
import java.util.Collection;
import java.util.ServiceLoader;

/* renamed from: I3.g  reason: case insensitive filesystem */
public abstract class C0278g {

    /* renamed from: a  reason: collision with root package name */
    public static final Collection f1550a;

    static {
        Class<G> cls = G.class;
        f1550a = g.c(e.a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    public static final Collection a() {
        return f1550a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
