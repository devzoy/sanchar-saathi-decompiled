package w1;

import J1.f;
import R1.g;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;
import u1.C0941a;
import u1.d;
import v.b;
import v1.C0951e;
import z1.C;
import z1.C1025h;
import z1.C1026i;
import z1.C1030m;
import z1.C1033p;
import z1.C1034q;
import z1.C1035s;
import z1.C1036t;
import z1.r;

/* renamed from: w1.e  reason: case insensitive filesystem */
public class C0972e implements Handler.Callback {

    /* renamed from: p  reason: collision with root package name */
    public static final Status f12586p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: q  reason: collision with root package name */
    public static final Status f12587q = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: r  reason: collision with root package name */
    public static final Object f12588r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public static C0972e f12589s;

    /* renamed from: t  reason: collision with root package name */
    public static volatile boolean f12590t = false;

    /* renamed from: a  reason: collision with root package name */
    public long f12591a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12592b = false;

    /* renamed from: c  reason: collision with root package name */
    public r f12593c;

    /* renamed from: d  reason: collision with root package name */
    public C1036t f12594d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f12595e;

    /* renamed from: f  reason: collision with root package name */
    public final d f12596f;

    /* renamed from: g  reason: collision with root package name */
    public final C f12597g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f12598h = new AtomicInteger(1);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f12599i = new AtomicInteger(0);

    /* renamed from: j  reason: collision with root package name */
    public final Map f12600j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k  reason: collision with root package name */
    public C0983p f12601k = null;

    /* renamed from: l  reason: collision with root package name */
    public final Set f12602l = new b();

    /* renamed from: m  reason: collision with root package name */
    public final Set f12603m = new b();

    /* renamed from: n  reason: collision with root package name */
    public final Handler f12604n;

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f12605o = true;

    public C0972e(Context context, Looper looper, d dVar) {
        this.f12595e = context;
        f fVar = new f(looper, this);
        this.f12604n = fVar;
        this.f12596f = dVar;
        this.f12597g = new C(dVar);
        if (D1.f.a(context)) {
            this.f12605o = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    public static Status j(C0969b bVar, C0941a aVar) {
        String b4 = bVar.b();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(b4).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b4);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(aVar, sb.toString());
    }

    public static C0972e m(Context context) {
        C0972e eVar;
        synchronized (f12588r) {
            try {
                if (f12589s == null) {
                    f12589s = new C0972e(context.getApplicationContext(), C1026i.b().getLooper(), d.m());
                    if (f12590t) {
                        Handler handler = f12589s.f12604n;
                        Objects.requireNonNull(handler);
                        C1025h.k0(new C0964A(handler));
                    }
                }
                eVar = f12589s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final /* synthetic */ long B() {
        return this.f12591a;
    }

    public final /* synthetic */ void C(boolean z4) {
        this.f12592b = true;
    }

    public final /* synthetic */ Context E() {
        return this.f12595e;
    }

    public final /* synthetic */ d a() {
        return this.f12596f;
    }

    public final /* synthetic */ C b() {
        return this.f12597g;
    }

    public final /* synthetic */ Map c() {
        return this.f12600j;
    }

    public final /* synthetic */ C0983p d() {
        return this.f12601k;
    }

    public final /* synthetic */ Set e() {
        return this.f12602l;
    }

    public final /* synthetic */ Handler f() {
        return this.f12604n;
    }

    public final /* synthetic */ boolean g() {
        return this.f12605o;
    }

    public final C0989w h(C0951e eVar) {
        Map map = this.f12600j;
        C0969b h4 = eVar.h();
        C0989w wVar = (C0989w) map.get(h4);
        if (wVar == null) {
            wVar = new C0989w(this, eVar);
            map.put(h4, wVar);
        }
        if (wVar.A()) {
            this.f12603m.add(h4);
        }
        wVar.z();
        return wVar;
    }

    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        long j4 = 300000;
        C0989w wVar = null;
        switch (i4) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j4 = 10000;
                }
                this.f12591a = j4;
                Handler handler = this.f12604n;
                handler.removeMessages(12);
                for (C0969b obtainMessage : this.f12600j.keySet()) {
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f12591a);
                }
                break;
            case 2:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 3:
                for (C0989w wVar2 : this.f12600j.values()) {
                    wVar2.v();
                    wVar2.z();
                }
                break;
            case 4:
            case 8:
            case 13:
                I i5 = (I) message.obj;
                Map map = this.f12600j;
                C0951e eVar = i5.f12539c;
                C0989w wVar3 = (C0989w) map.get(eVar.h());
                if (wVar3 == null) {
                    wVar3 = h(eVar);
                }
                if (wVar3.A() && this.f12599i.get() != i5.f12538b) {
                    i5.f12537a.a(f12586p);
                    wVar3.s();
                    break;
                } else {
                    wVar3.r(i5.f12537a);
                    break;
                }
                break;
            case 5:
                int i6 = message.arg1;
                C0941a aVar = (C0941a) message.obj;
                Iterator it = this.f12600j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C0989w wVar4 = (C0989w) it.next();
                        if (wVar4.B() == i6) {
                            wVar = wVar4;
                        }
                    }
                }
                if (wVar != null) {
                    if (aVar.d() != 13) {
                        wVar.G(j(wVar.a(), aVar));
                        break;
                    } else {
                        String d4 = this.f12596f.d(aVar.d());
                        String e4 = aVar.e();
                        StringBuilder sb = new StringBuilder(String.valueOf(d4).length() + 69 + String.valueOf(e4).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(d4);
                        sb.append(": ");
                        sb.append(e4);
                        wVar.G(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 65);
                    sb2.append("Could not find API instance ");
                    sb2.append(i6);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                Context context = this.f12595e;
                if (context.getApplicationContext() instanceof Application) {
                    C0970c.c((Application) context.getApplicationContext());
                    C0970c.b().a(new r(this));
                    if (!C0970c.b().e(true)) {
                        this.f12591a = 300000;
                        break;
                    }
                }
                break;
            case 7:
                h((C0951e) message.obj);
                break;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION:
                Map map2 = this.f12600j;
                if (map2.containsKey(message.obj)) {
                    ((C0989w) map2.get(message.obj)).w();
                    break;
                }
                break;
            case IBulkCursor.GET_EXTRAS_TRANSACTION:
                Set<C0969b> set = this.f12603m;
                for (C0969b remove : set) {
                    C0989w wVar5 = (C0989w) this.f12600j.remove(remove);
                    if (wVar5 != null) {
                        wVar5.s();
                    }
                }
                set.clear();
                break;
            case IBulkCursor.RESPOND_TRANSACTION:
                Map map3 = this.f12600j;
                if (map3.containsKey(message.obj)) {
                    ((C0989w) map3.get(message.obj)).x();
                    break;
                }
                break;
            case IBulkCursor.CLOSE_TRANSACTION:
                Map map4 = this.f12600j;
                if (map4.containsKey(message.obj)) {
                    ((C0989w) map4.get(message.obj)).y();
                    break;
                }
                break;
            case 14:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 15:
                C0990x xVar = (C0990x) message.obj;
                Map map5 = this.f12600j;
                if (map5.containsKey(xVar.a())) {
                    ((C0989w) map5.get(xVar.a())).H(xVar);
                    break;
                }
                break;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS:
                C0990x xVar2 = (C0990x) message.obj;
                Map map6 = this.f12600j;
                if (map6.containsKey(xVar2.a())) {
                    ((C0989w) map6.get(xVar2.a())).I(xVar2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                G g4 = (G) message.obj;
                long j5 = g4.f12535c;
                if (j5 != 0) {
                    r rVar = this.f12593c;
                    if (rVar != null) {
                        List e5 = rVar.e();
                        if (rVar.d() != g4.f12534b || (e5 != null && e5.size() >= g4.f12536d)) {
                            this.f12604n.removeMessages(17);
                            k();
                        } else {
                            this.f12593c.g(g4.f12533a);
                        }
                    }
                    if (this.f12593c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(g4.f12533a);
                        this.f12593c = new r(g4.f12534b, arrayList);
                        Handler handler2 = this.f12604n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), j5);
                        break;
                    }
                } else {
                    l().a(new r(g4.f12534b, Arrays.asList(new C1030m[]{g4.f12533a})));
                    break;
                }
                break;
            case 19:
                this.f12592b = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + 20);
                sb3.append("Unknown message id: ");
                sb3.append(i4);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    public final void i(g gVar, int i4, C0951e eVar) {
        F b4;
        if (i4 != 0 && (b4 = F.b(this, i4, eVar.h())) != null) {
            R1.f a4 = gVar.a();
            Handler handler = this.f12604n;
            Objects.requireNonNull(handler);
            a4.b(new C0965B(handler), b4);
        }
    }

    public final void k() {
        r rVar = this.f12593c;
        if (rVar != null) {
            if (rVar.d() > 0 || v()) {
                l().a(rVar);
            }
            this.f12593c = null;
        }
    }

    public final C1036t l() {
        if (this.f12594d == null) {
            this.f12594d = C1035s.a(this.f12595e);
        }
        return this.f12594d;
    }

    public final int n() {
        return this.f12598h.getAndIncrement();
    }

    public final void o(C0951e eVar) {
        Handler handler = this.f12604n;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void p(C0983p pVar) {
        synchronized (f12588r) {
            try {
                if (this.f12601k != pVar) {
                    this.f12601k = pVar;
                    this.f12602l.clear();
                }
                this.f12602l.addAll(pVar.u());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(C0983p pVar) {
        synchronized (f12588r) {
            try {
                if (this.f12601k == pVar) {
                    this.f12601k = null;
                    this.f12602l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0989w r(C0969b bVar) {
        return (C0989w) this.f12600j.get(bVar);
    }

    public final void s() {
        Handler handler = this.f12604n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void t(C0951e eVar, int i4, a aVar) {
        I i5 = new I(new P(i4, aVar), this.f12599i.get(), eVar);
        Handler handler = this.f12604n;
        handler.sendMessage(handler.obtainMessage(4, i5));
    }

    public final void u(C0951e eVar, int i4, C0981n nVar, g gVar, C0979l lVar) {
        i(gVar, nVar.e(), eVar);
        I i5 = new I(new Q(i4, nVar, gVar, lVar), this.f12599i.get(), eVar);
        Handler handler = this.f12604n;
        handler.sendMessage(handler.obtainMessage(4, i5));
    }

    public final boolean v() {
        if (this.f12592b) {
            return false;
        }
        C1034q a4 = C1033p.b().a();
        if (a4 != null && !a4.g()) {
            return false;
        }
        int b4 = this.f12597g.b(this.f12595e, 203400000);
        return b4 == -1 || b4 == 0;
    }

    public final boolean w(C0941a aVar, int i4) {
        return this.f12596f.s(this.f12595e, aVar, i4);
    }

    public final void x(C0941a aVar, int i4) {
        if (!w(aVar, i4)) {
            Handler handler = this.f12604n;
            handler.sendMessage(handler.obtainMessage(5, i4, 0, aVar));
        }
    }

    public final void y(C1030m mVar, int i4, long j4, int i5) {
        G g4 = new G(mVar, i4, j4, i5);
        Handler handler = this.f12604n;
        handler.sendMessage(handler.obtainMessage(18, g4));
    }
}
