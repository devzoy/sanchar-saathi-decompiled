package M2;

import R2.d;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static a f1798d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f1799e;

    /* renamed from: a  reason: collision with root package name */
    public d f1800a;

    /* renamed from: b  reason: collision with root package name */
    public FlutterJNI.c f1801b;

    /* renamed from: c  reason: collision with root package name */
    public ExecutorService f1802c;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public d f1803a;

        /* renamed from: b  reason: collision with root package name */
        public FlutterJNI.c f1804b;

        /* renamed from: c  reason: collision with root package name */
        public ExecutorService f1805c;

        /* renamed from: M2.a$b$a  reason: collision with other inner class name */
        public class C0035a implements ThreadFactory {

            /* renamed from: a  reason: collision with root package name */
            public int f1806a;

            public C0035a() {
                this.f1806a = 0;
            }

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i4 = this.f1806a;
                this.f1806a = i4 + 1;
                sb.append(i4);
                thread.setName(sb.toString());
                return thread;
            }
        }

        public a a() {
            b();
            return new a(this.f1803a, (Q2.a) null, this.f1804b, this.f1805c);
        }

        public final void b() {
            if (this.f1804b == null) {
                this.f1804b = new FlutterJNI.c();
            }
            if (this.f1805c == null) {
                this.f1805c = Executors.newCachedThreadPool(new C0035a());
            }
            if (this.f1803a == null) {
                this.f1803a = new d(this.f1804b.a(), this.f1805c);
            }
        }
    }

    public static a e() {
        f1799e = true;
        if (f1798d == null) {
            f1798d = new b().a();
        }
        return f1798d;
    }

    public Q2.a a() {
        return null;
    }

    public ExecutorService b() {
        return this.f1802c;
    }

    public d c() {
        return this.f1800a;
    }

    public FlutterJNI.c d() {
        return this.f1801b;
    }

    public a(d dVar, Q2.a aVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f1800a = dVar;
        this.f1801b = cVar;
        this.f1802c = executorService;
    }
}
