package X0;

import Q0.i;
import V0.b;
import a1.m;
import a1.o;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import c1.C0403b;
import v3.l;

public final class j extends h {

    /* renamed from: f  reason: collision with root package name */
    public final ConnectivityManager f3453f;

    /* renamed from: g  reason: collision with root package name */
    public final a f3454g = new a(this);

    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f3455a;

        public a(j jVar) {
            this.f3455a = jVar;
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            l.e(network, "network");
            l.e(networkCapabilities, "capabilities");
            i e4 = i.e();
            String b4 = k.f3456a;
            e4.a(b4, "Network capabilities changed: " + networkCapabilities);
            j jVar = this.f3455a;
            jVar.g(k.c(jVar.f3453f));
        }

        public void onLost(Network network) {
            l.e(network, "network");
            i.e().a(k.f3456a, "Network connection lost");
            j jVar = this.f3455a;
            jVar.g(k.c(jVar.f3453f));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Context context, C0403b bVar) {
        super(context, bVar);
        l.e(context, "context");
        l.e(bVar, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        l.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f3453f = (ConnectivityManager) systemService;
    }

    public void h() {
        try {
            i.e().a(k.f3456a, "Registering network callback");
            o.a(this.f3453f, this.f3454g);
        } catch (IllegalArgumentException e4) {
            i.e().d(k.f3456a, "Received exception while registering network callback", e4);
        } catch (SecurityException e5) {
            i.e().d(k.f3456a, "Received exception while registering network callback", e5);
        }
    }

    public void i() {
        try {
            i.e().a(k.f3456a, "Unregistering network callback");
            m.c(this.f3453f, this.f3454g);
        } catch (IllegalArgumentException e4) {
            i.e().d(k.f3456a, "Received exception while unregistering network callback", e4);
        } catch (SecurityException e5) {
            i.e().d(k.f3456a, "Received exception while unregistering network callback", e5);
        }
    }

    /* renamed from: k */
    public b e() {
        return k.c(this.f3453f);
    }
}
