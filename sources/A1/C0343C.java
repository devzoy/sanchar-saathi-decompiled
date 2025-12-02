package a1;

import Q0.i;
import Q0.q;
import Z0.m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a1.C  reason: case insensitive filesystem */
public class C0343C {

    /* renamed from: e  reason: collision with root package name */
    public static final String f3945e = i.i("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    public final q f3946a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f3947b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map f3948c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Object f3949d = new Object();

    /* renamed from: a1.C$a */
    public interface a {
        void a(m mVar);
    }

    /* renamed from: a1.C$b */
    public static class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final C0343C f3950e;

        /* renamed from: f  reason: collision with root package name */
        public final m f3951f;

        public b(C0343C c4, m mVar) {
            this.f3950e = c4;
            this.f3951f = mVar;
        }

        public void run() {
            synchronized (this.f3950e.f3949d) {
                try {
                    if (((b) this.f3950e.f3947b.remove(this.f3951f)) != null) {
                        a aVar = (a) this.f3950e.f3948c.remove(this.f3951f);
                        if (aVar != null) {
                            aVar.a(this.f3951f);
                        }
                    } else {
                        i.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f3951f}));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C0343C(q qVar) {
        this.f3946a = qVar;
    }

    public void a(m mVar, long j4, a aVar) {
        synchronized (this.f3949d) {
            i e4 = i.e();
            String str = f3945e;
            e4.a(str, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f3947b.put(mVar, bVar);
            this.f3948c.put(mVar, aVar);
            this.f3946a.a(j4, bVar);
        }
    }

    public void b(m mVar) {
        synchronized (this.f3949d) {
            try {
                if (((b) this.f3947b.remove(mVar)) != null) {
                    i e4 = i.e();
                    String str = f3945e;
                    e4.a(str, "Stopping timer for " + mVar);
                    this.f3948c.remove(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
