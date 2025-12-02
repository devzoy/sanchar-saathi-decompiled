package q2;

import R1.f;
import R1.g;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.v4.media.session.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p2.q;

public final class D {

    /* renamed from: o  reason: collision with root package name */
    public static final Map f11879o = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f11880a;

    /* renamed from: b  reason: collision with root package name */
    public final s f11881b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11882c;

    /* renamed from: d  reason: collision with root package name */
    public final List f11883d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Set f11884e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f11885f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public boolean f11886g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f11887h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f11888i;

    /* renamed from: j  reason: collision with root package name */
    public final IBinder.DeathRecipient f11889j = new v(this);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f11890k = new AtomicInteger(0);

    /* renamed from: l  reason: collision with root package name */
    public ServiceConnection f11891l;

    /* renamed from: m  reason: collision with root package name */
    public IInterface f11892m;

    /* renamed from: n  reason: collision with root package name */
    public final q f11893n;

    public D(Context context, s sVar, String str, Intent intent, q qVar, y yVar) {
        this.f11880a = context;
        this.f11881b = sVar;
        this.f11882c = "AppUpdateService";
        this.f11887h = intent;
        this.f11893n = qVar;
        this.f11888i = new WeakReference((Object) null);
    }

    public static /* synthetic */ void j(D d4) {
        d4.f11881b.d("reportBinderDeath", new Object[0]);
        b.a(d4.f11888i.get());
        d4.f11881b.d("%s : Binder has died.", d4.f11882c);
        for (t c4 : d4.f11883d) {
            c4.c(d4.v());
        }
        d4.f11883d.clear();
        synchronized (d4.f11885f) {
            d4.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(D d4, g gVar) {
        d4.f11884e.add(gVar);
        gVar.a().a(new u(d4, gVar));
    }

    public static /* bridge */ /* synthetic */ void p(D d4, t tVar) {
        if (d4.f11892m == null && !d4.f11886g) {
            d4.f11881b.d("Initiate binding to the service.", new Object[0]);
            d4.f11883d.add(tVar);
            C c4 = new C(d4, (B) null);
            d4.f11891l = c4;
            d4.f11886g = true;
            if (!d4.f11880a.bindService(d4.f11887h, c4, 1)) {
                d4.f11881b.d("Failed to bind to the service.", new Object[0]);
                d4.f11886g = false;
                for (t c5 : d4.f11883d) {
                    c5.c(new E());
                }
                d4.f11883d.clear();
            }
        } else if (d4.f11886g) {
            d4.f11881b.d("Waiting to bind to the service.", new Object[0]);
            d4.f11883d.add(tVar);
        } else {
            tVar.run();
        }
    }

    public static /* bridge */ /* synthetic */ void q(D d4) {
        d4.f11881b.d("linkToDeath", new Object[0]);
        try {
            d4.f11892m.asBinder().linkToDeath(d4.f11889j, 0);
        } catch (RemoteException e4) {
            d4.f11881b.c(e4, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(D d4) {
        d4.f11881b.d("unlinkToDeath", new Object[0]);
        d4.f11892m.asBinder().unlinkToDeath(d4.f11889j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f11879o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f11882c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f11882c, 10);
                    handlerThread.start();
                    map.put(this.f11882c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f11882c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f11892m;
    }

    public final void s(t tVar, g gVar) {
        c().post(new w(this, tVar.b(), gVar, tVar));
    }

    public final /* synthetic */ void t(g gVar, f fVar) {
        synchronized (this.f11885f) {
            this.f11884e.remove(gVar);
        }
    }

    public final void u(g gVar) {
        synchronized (this.f11885f) {
            this.f11884e.remove(gVar);
        }
        c().post(new x(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f11882c).concat(" : Binder has died."));
    }

    public final void w() {
        for (g c4 : this.f11884e) {
            c4.c(v());
        }
        this.f11884e.clear();
    }
}
