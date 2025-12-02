package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C0380g;
import v3.l;

public class D {

    /* renamed from: a  reason: collision with root package name */
    public final l f5346a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5347b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public a f5348c;

    public static final class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final l f5349e;

        /* renamed from: f  reason: collision with root package name */
        public final C0380g.a f5350f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5351g;

        public a(l lVar, C0380g.a aVar) {
            l.e(lVar, "registry");
            l.e(aVar, "event");
            this.f5349e = lVar;
            this.f5350f = aVar;
        }

        public void run() {
            if (!this.f5351g) {
                this.f5349e.h(this.f5350f);
                this.f5351g = true;
            }
        }
    }

    public D(C0384k kVar) {
        l.e(kVar, "provider");
        this.f5346a = new l(kVar);
    }

    public C0380g a() {
        return this.f5346a;
    }

    public void b() {
        f(C0380g.a.ON_START);
    }

    public void c() {
        f(C0380g.a.ON_CREATE);
    }

    public void d() {
        f(C0380g.a.ON_STOP);
        f(C0380g.a.ON_DESTROY);
    }

    public void e() {
        f(C0380g.a.ON_START);
    }

    public final void f(C0380g.a aVar) {
        a aVar2 = this.f5348c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f5346a, aVar);
        this.f5348c = aVar3;
        Handler handler = this.f5347b;
        l.b(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }
}
