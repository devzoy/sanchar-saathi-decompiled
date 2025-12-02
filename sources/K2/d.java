package K2;

import Y2.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

public class d extends BroadcastReceiver implements c.d {

    /* renamed from: c  reason: collision with root package name */
    public final Context f1703c;

    /* renamed from: d  reason: collision with root package name */
    public final a f1704d;

    /* renamed from: e  reason: collision with root package name */
    public c.b f1705e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f1706f = new Handler(Looper.getMainLooper());

    /* renamed from: g  reason: collision with root package name */
    public ConnectivityManager.NetworkCallback f1707g;

    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        public void onAvailable(Network network) {
            d dVar = d.this;
            dVar.k(dVar.f1704d.a(network));
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            d dVar = d.this;
            dVar.k(dVar.f1704d.b(networkCapabilities));
        }

        public void onLost(Network network) {
            d.this.j();
        }
    }

    public d(Context context, a aVar) {
        this.f1703c = context;
        this.f1704d = aVar;
    }

    public void a(Object obj, c.b bVar) {
        this.f1705e = bVar;
        this.f1707g = new a();
        this.f1704d.c().registerDefaultNetworkCallback(this.f1707g);
        k(this.f1704d.d());
    }

    public void b(Object obj) {
        if (this.f1707g != null) {
            this.f1704d.c().unregisterNetworkCallback(this.f1707g);
            this.f1707g = null;
        }
    }

    public final /* synthetic */ void h() {
        this.f1705e.a(this.f1704d.d());
    }

    public final /* synthetic */ void i(List list) {
        this.f1705e.a(list);
    }

    public final void j() {
        this.f1706f.postDelayed(new c(this), 500);
    }

    public final void k(List list) {
        this.f1706f.post(new b(this, list));
    }

    public void onReceive(Context context, Intent intent) {
        c.b bVar = this.f1705e;
        if (bVar != null) {
            bVar.a(this.f1704d.d());
        }
    }
}
