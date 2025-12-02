package K2;

import T2.a;
import Y2.b;
import Y2.c;
import Y2.j;
import android.content.Context;
import android.net.ConnectivityManager;

public class f implements a {

    /* renamed from: c  reason: collision with root package name */
    public j f1710c;

    /* renamed from: d  reason: collision with root package name */
    public c f1711d;

    /* renamed from: e  reason: collision with root package name */
    public d f1712e;

    public final void a(b bVar, Context context) {
        this.f1710c = new j(bVar, "dev.fluttercommunity.plus/connectivity");
        this.f1711d = new c(bVar, "dev.fluttercommunity.plus/connectivity_status");
        a aVar = new a((ConnectivityManager) context.getSystemService("connectivity"));
        e eVar = new e(aVar);
        this.f1712e = new d(context, aVar);
        this.f1710c.e(eVar);
        this.f1711d.d(this.f1712e);
    }

    public final void b() {
        this.f1710c.e((j.c) null);
        this.f1711d.d((c.d) null);
        this.f1712e.b((Object) null);
        this.f1710c = null;
        this.f1711d = null;
        this.f1712e = null;
    }

    public void onAttachedToEngine(a.b bVar) {
        a(bVar.b(), bVar.a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        b();
    }
}
