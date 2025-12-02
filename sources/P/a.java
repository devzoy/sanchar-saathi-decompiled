package P;

import P.f;
import P.g;
import android.graphics.Typeface;
import android.os.Handler;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final g.c f2156a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2157b;

    /* renamed from: P.a$a  reason: collision with other inner class name */
    public class C0045a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g.c f2158e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Typeface f2159f;

        public C0045a(g.c cVar, Typeface typeface) {
            this.f2158e = cVar;
            this.f2159f = typeface;
        }

        public void run() {
            this.f2158e.b(this.f2159f);
        }
    }

    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g.c f2161e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f2162f;

        public b(g.c cVar, int i4) {
            this.f2161e = cVar;
            this.f2162f = i4;
        }

        public void run() {
            this.f2161e.a(this.f2162f);
        }
    }

    public a(g.c cVar, Handler handler) {
        this.f2156a = cVar;
        this.f2157b = handler;
    }

    public final void a(int i4) {
        this.f2157b.post(new b(this.f2156a, i4));
    }

    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f2186a);
        } else {
            a(eVar.f2187b);
        }
    }

    public final void c(Typeface typeface) {
        this.f2157b.post(new C0045a(this.f2156a, typeface));
    }
}
