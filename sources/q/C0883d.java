package q;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: q.d  reason: case insensitive filesystem */
public class C0883d extends C0884e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11750a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f11751b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c  reason: collision with root package name */
    public volatile Handler f11752c;

    /* renamed from: q.d$a */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f11753a = new AtomicInteger(0);

        public a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f11753a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: q.d$b */
    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler d(Looper looper) {
        return b.a(looper);
    }

    public void a(Runnable runnable) {
        this.f11751b.execute(runnable);
    }

    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void c(Runnable runnable) {
        if (this.f11752c == null) {
            synchronized (this.f11750a) {
                try {
                    if (this.f11752c == null) {
                        this.f11752c = d(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f11752c.post(runnable);
    }
}
