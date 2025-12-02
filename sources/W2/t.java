package w2;

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
import v2.i;

public final class t {

    /* renamed from: n  reason: collision with root package name */
    public static final Map f12670n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f12671a;

    /* renamed from: b  reason: collision with root package name */
    public final i f12672b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12673c;

    /* renamed from: d  reason: collision with root package name */
    public final List f12674d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Set f12675e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f12676f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public boolean f12677g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f12678h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f12679i;

    /* renamed from: j  reason: collision with root package name */
    public final IBinder.DeathRecipient f12680j = new k(this);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f12681k = new AtomicInteger(0);

    /* renamed from: l  reason: collision with root package name */
    public ServiceConnection f12682l;

    /* renamed from: m  reason: collision with root package name */
    public IInterface f12683m;

    public t(Context context, i iVar, String str, Intent intent, i iVar2, o oVar) {
        this.f12671a = context;
        this.f12672b = iVar;
        this.f12673c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
        this.f12678h = intent;
        this.f12679i = new WeakReference((Object) null);
    }

    public static /* synthetic */ void j(t tVar) {
        tVar.f12672b.c("reportBinderDeath", new Object[0]);
        b.a(tVar.f12679i.get());
        tVar.f12672b.c("%s : Binder has died.", tVar.f12673c);
        for (j c4 : tVar.f12674d) {
            c4.c(tVar.v());
        }
        tVar.f12674d.clear();
        synchronized (tVar.f12676f) {
            tVar.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(t tVar, g gVar) {
        tVar.f12675e.add(gVar);
        gVar.a().a(new l(tVar, gVar));
    }

    public static /* bridge */ /* synthetic */ void p(t tVar, j jVar) {
        if (tVar.f12683m == null && !tVar.f12677g) {
            tVar.f12672b.c("Initiate binding to the service.", new Object[0]);
            tVar.f12674d.add(jVar);
            r rVar = new r(tVar, (s) null);
            tVar.f12682l = rVar;
            tVar.f12677g = true;
            if (!tVar.f12671a.bindService(tVar.f12678h, rVar, 1)) {
                tVar.f12672b.c("Failed to bind to the service.", new Object[0]);
                tVar.f12677g = false;
                for (j c4 : tVar.f12674d) {
                    c4.c(new u());
                }
                tVar.f12674d.clear();
            }
        } else if (tVar.f12677g) {
            tVar.f12672b.c("Waiting to bind to the service.", new Object[0]);
            tVar.f12674d.add(jVar);
        } else {
            jVar.run();
        }
    }

    public static /* bridge */ /* synthetic */ void q(t tVar) {
        tVar.f12672b.c("linkToDeath", new Object[0]);
        try {
            tVar.f12683m.asBinder().linkToDeath(tVar.f12680j, 0);
        } catch (RemoteException e4) {
            tVar.f12672b.b(e4, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(t tVar) {
        tVar.f12672b.c("unlinkToDeath", new Object[0]);
        tVar.f12683m.asBinder().unlinkToDeath(tVar.f12680j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f12670n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f12673c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f12673c, 10);
                    handlerThread.start();
                    map.put(this.f12673c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f12673c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f12683m;
    }

    public final void s(j jVar, g gVar) {
        c().post(new m(this, jVar.b(), gVar, jVar));
    }

    public final /* synthetic */ void t(g gVar, f fVar) {
        synchronized (this.f12676f) {
            this.f12675e.remove(gVar);
        }
    }

    public final void u(g gVar) {
        synchronized (this.f12676f) {
            this.f12675e.remove(gVar);
        }
        c().post(new n(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f12673c).concat(" : Binder has died."));
    }

    public final void w() {
        for (g c4 : this.f12675e) {
            c4.c(v());
        }
        this.f12675e.clear();
    }
}
