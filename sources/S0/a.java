package S0;

import Q0.i;
import Q0.q;
import Z0.u;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f2718d = i.i("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    public final b f2719a;

    /* renamed from: b  reason: collision with root package name */
    public final q f2720b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f2721c = new HashMap();

    /* renamed from: S0.a$a  reason: collision with other inner class name */
    public class C0056a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ u f2722e;

        public C0056a(u uVar) {
            this.f2722e = uVar;
        }

        public void run() {
            i e4 = i.e();
            String str = a.f2718d;
            e4.a(str, "Scheduling work " + this.f2722e.f3834a);
            a.this.f2719a.c(this.f2722e);
        }
    }

    public a(b bVar, q qVar) {
        this.f2719a = bVar;
        this.f2720b = qVar;
    }

    public void a(u uVar) {
        Runnable runnable = (Runnable) this.f2721c.remove(uVar.f3834a);
        if (runnable != null) {
            this.f2720b.b(runnable);
        }
        C0056a aVar = new C0056a(uVar);
        this.f2721c.put(uVar.f3834a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f2720b.a(uVar.a() - currentTimeMillis, aVar);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f2721c.remove(str);
        if (runnable != null) {
            this.f2720b.b(runnable);
        }
    }
}
