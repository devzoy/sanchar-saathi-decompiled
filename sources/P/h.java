package P;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class h {

    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public String f2195a;

        /* renamed from: b  reason: collision with root package name */
        public int f2196b;

        /* renamed from: P.h$a$a  reason: collision with other inner class name */
        public static class C0046a extends Thread {

            /* renamed from: e  reason: collision with root package name */
            public final int f2197e;

            public C0046a(Runnable runnable, String str, int i4) {
                super(runnable, str);
                this.f2197e = i4;
            }

            public void run() {
                Process.setThreadPriority(this.f2197e);
                super.run();
            }
        }

        public a(String str, int i4) {
            this.f2195a = str;
            this.f2196b = i4;
        }

        public Thread newThread(Runnable runnable) {
            return new C0046a(runnable, this.f2195a, this.f2196b);
        }
    }

    public static class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public Callable f2198e;

        /* renamed from: f  reason: collision with root package name */
        public R.a f2199f;

        /* renamed from: g  reason: collision with root package name */
        public Handler f2200g;

        public class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ R.a f2201e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Object f2202f;

            public a(R.a aVar, Object obj) {
                this.f2201e = aVar;
                this.f2202f = obj;
            }

            public void run() {
                this.f2201e.accept(this.f2202f);
            }
        }

        public b(Handler handler, Callable callable, R.a aVar) {
            this.f2198e = callable;
            this.f2199f = aVar;
            this.f2200g = handler;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f2198e.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f2200g.post(new a(this.f2199f, obj));
        }
    }

    public static ThreadPoolExecutor a(String str, int i4, int i5) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i5, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i4));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void b(Executor executor, Callable callable, R.a aVar) {
        executor.execute(new b(b.a(), callable, aVar));
    }

    public static Object c(ExecutorService executorService, Callable callable, int i4) {
        try {
            return executorService.submit(callable).get((long) i4, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e4) {
            throw new RuntimeException(e4);
        } catch (InterruptedException e5) {
            throw e5;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
