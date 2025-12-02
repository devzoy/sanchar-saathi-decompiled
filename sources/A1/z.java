package a1;

import Q0.e;
import Q0.f;
import Q0.i;
import Z0.u;
import android.content.Context;
import android.os.Build;
import androidx.work.c;
import b1.C0392c;
import c1.C0403b;
import y2.C1007a;

public class z implements Runnable {

    /* renamed from: k  reason: collision with root package name */
    public static final String f3988k = i.i("WorkForegroundRunnable");

    /* renamed from: e  reason: collision with root package name */
    public final C0392c f3989e = C0392c.t();

    /* renamed from: f  reason: collision with root package name */
    public final Context f3990f;

    /* renamed from: g  reason: collision with root package name */
    public final u f3991g;

    /* renamed from: h  reason: collision with root package name */
    public final c f3992h;

    /* renamed from: i  reason: collision with root package name */
    public final f f3993i;

    /* renamed from: j  reason: collision with root package name */
    public final C0403b f3994j;

    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C0392c f3995e;

        public a(C0392c cVar) {
            this.f3995e = cVar;
        }

        public void run() {
            if (!z.this.f3989e.isCancelled()) {
                try {
                    e eVar = (e) this.f3995e.get();
                    if (eVar != null) {
                        i e4 = i.e();
                        String str = z.f3988k;
                        e4.a(str, "Updating notification for " + z.this.f3991g.f3836c);
                        z zVar = z.this;
                        zVar.f3989e.r(zVar.f3993i.a(zVar.f3990f, zVar.f3992h.f(), eVar));
                        return;
                    }
                    throw new IllegalStateException("Worker was marked important (" + z.this.f3991g.f3836c + ") but did not provide ForegroundInfo");
                } catch (Throwable th) {
                    z.this.f3989e.q(th);
                }
            }
        }
    }

    public z(Context context, u uVar, c cVar, f fVar, C0403b bVar) {
        this.f3990f = context;
        this.f3991g = uVar;
        this.f3992h = cVar;
        this.f3993i = fVar;
        this.f3994j = bVar;
    }

    public C1007a b() {
        return this.f3989e;
    }

    public final /* synthetic */ void c(C0392c cVar) {
        if (!this.f3989e.isCancelled()) {
            cVar.r(this.f3992h.d());
        } else {
            cVar.cancel(true);
        }
    }

    public void run() {
        if (!this.f3991g.f3850q || Build.VERSION.SDK_INT >= 31) {
            this.f3989e.p((Object) null);
            return;
        }
        C0392c t4 = C0392c.t();
        this.f3994j.a().execute(new y(this, t4));
        t4.a(new a(t4), this.f3994j.a());
    }
}
