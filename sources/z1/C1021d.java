package z1;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import u1.C0941a;

/* renamed from: z1.d  reason: case insensitive filesystem */
public abstract class C1021d {

    /* renamed from: E  reason: collision with root package name */
    public static final String[] f12918E = {"service_esmobile", "service_googleme"};

    /* renamed from: F  reason: collision with root package name */
    public static final u1.c[] f12919F = new u1.c[0];

    /* renamed from: A  reason: collision with root package name */
    public C0941a f12920A = null;

    /* renamed from: B  reason: collision with root package name */
    public boolean f12921B = false;

    /* renamed from: C  reason: collision with root package name */
    public volatile V f12922C = null;

    /* renamed from: D  reason: collision with root package name */
    public AtomicInteger f12923D = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public int f12924a;

    /* renamed from: b  reason: collision with root package name */
    public long f12925b;

    /* renamed from: c  reason: collision with root package name */
    public long f12926c;

    /* renamed from: d  reason: collision with root package name */
    public int f12927d;

    /* renamed from: e  reason: collision with root package name */
    public long f12928e;

    /* renamed from: f  reason: collision with root package name */
    public volatile String f12929f = null;

    /* renamed from: g  reason: collision with root package name */
    public e0 f12930g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f12931h;

    /* renamed from: i  reason: collision with root package name */
    public final Looper f12932i;

    /* renamed from: j  reason: collision with root package name */
    public final C1026i f12933j;

    /* renamed from: k  reason: collision with root package name */
    public final u1.e f12934k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f12935l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f12936m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public final Object f12937n = new Object();

    /* renamed from: o  reason: collision with root package name */
    public C1029l f12938o;

    /* renamed from: p  reason: collision with root package name */
    public c f12939p;

    /* renamed from: q  reason: collision with root package name */
    public IInterface f12940q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f12941r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public S f12942s;

    /* renamed from: t  reason: collision with root package name */
    public int f12943t = 1;

    /* renamed from: u  reason: collision with root package name */
    public final a f12944u;

    /* renamed from: v  reason: collision with root package name */
    public final b f12945v;

    /* renamed from: w  reason: collision with root package name */
    public final int f12946w;

    /* renamed from: x  reason: collision with root package name */
    public final String f12947x;

    /* renamed from: y  reason: collision with root package name */
    public volatile String f12948y;

    /* renamed from: z  reason: collision with root package name */
    public volatile E1.a f12949z;

    /* renamed from: z1.d$a */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i4);
    }

    /* renamed from: z1.d$b */
    public interface b {
        void onConnectionFailed(C0941a aVar);
    }

    /* renamed from: z1.d$c */
    public interface c {
        void a(C0941a aVar);
    }

    /* renamed from: z1.d$d  reason: collision with other inner class name */
    public class C0215d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C1021d f12950a;

        public C0215d(C1021d dVar) {
            Objects.requireNonNull(dVar);
            this.f12950a = dVar;
        }

        public final void a(C0941a aVar) {
            if (aVar.i()) {
                C1021d dVar = this.f12950a;
                dVar.p((C1027j) null, dVar.B());
                return;
            }
            C1021d dVar2 = this.f12950a;
            if (dVar2.d0() != null) {
                dVar2.d0().onConnectionFailed(aVar);
            }
        }
    }

    /* renamed from: z1.d$e */
    public interface e {
        void a();
    }

    public C1021d(Context context, Looper looper, C1026i iVar, u1.e eVar, int i4, a aVar, b bVar, String str) {
        C1032o.g(context, "Context must not be null");
        this.f12931h = context;
        C1032o.g(looper, "Looper must not be null");
        this.f12932i = looper;
        C1032o.g(iVar, "Supervisor must not be null");
        this.f12933j = iVar;
        C1032o.g(eVar, "API availability must not be null");
        this.f12934k = eVar;
        this.f12935l = new O(this, looper);
        this.f12946w = i4;
        this.f12944u = aVar;
        this.f12945v = bVar;
        this.f12947x = str;
    }

    public String A() {
        return null;
    }

    public abstract Set B();

    public final IInterface C() {
        IInterface iInterface;
        synchronized (this.f12936m) {
            try {
                if (this.f12943t != 5) {
                    q();
                    IInterface iInterface2 = this.f12940q;
                    C1032o.g(iInterface2, "Client is connected but service is null");
                    iInterface = iInterface2;
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String D();

    public abstract String E();

    public String F() {
        return "com.google.android.gms";
    }

    public C1023f G() {
        V v4 = this.f12922C;
        if (v4 == null) {
            return null;
        }
        return v4.f12896h;
    }

    public boolean H() {
        return i() >= 211700000;
    }

    public boolean I() {
        return this.f12922C != null;
    }

    public void J(IInterface iInterface) {
        this.f12926c = System.currentTimeMillis();
    }

    public void K(C0941a aVar) {
        this.f12927d = aVar.d();
        this.f12928e = System.currentTimeMillis();
    }

    public void L(int i4) {
        this.f12924a = i4;
        this.f12925b = System.currentTimeMillis();
    }

    public void M(int i4, IBinder iBinder, Bundle bundle, int i5) {
        T t4 = new T(this, i4, iBinder, bundle);
        Handler handler = this.f12935l;
        handler.sendMessage(handler.obtainMessage(1, i5, -1, t4));
    }

    public boolean N() {
        return false;
    }

    public void O(E1.a aVar) {
        this.f12949z = aVar;
    }

    public void P(String str) {
        this.f12948y = str;
    }

    public void Q(int i4) {
        int i5 = this.f12923D.get();
        Handler handler = this.f12935l;
        handler.sendMessage(handler.obtainMessage(6, i5, i4));
    }

    public boolean R() {
        return false;
    }

    public final String S() {
        String str = this.f12947x;
        return str == null ? this.f12931h.getClass().getName() : str;
    }

    public final void T(int i4, Bundle bundle, int i5) {
        U u4 = new U(this, i4, bundle);
        Handler handler = this.f12935l;
        handler.sendMessage(handler.obtainMessage(7, i5, -1, u4));
    }

    public final /* synthetic */ void U(V v4) {
        this.f12922C = v4;
        if (R()) {
            C1023f fVar = v4.f12896h;
            C1033p.b().c(fVar == null ? null : fVar.j());
        }
    }

    public final /* synthetic */ void V(int i4, IInterface iInterface) {
        h0(i4, (IInterface) null);
    }

    public final /* synthetic */ boolean W(int i4, int i5, IInterface iInterface) {
        synchronized (this.f12936m) {
            try {
                if (this.f12943t != i4) {
                    return false;
                }
                h0(i5, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void X(int i4) {
        int i5;
        int i6;
        synchronized (this.f12936m) {
            i5 = this.f12943t;
        }
        if (i5 == 3) {
            this.f12921B = true;
            i6 = 5;
        } else {
            i6 = 4;
        }
        Handler handler = this.f12935l;
        handler.sendMessage(handler.obtainMessage(i6, this.f12923D.get(), 16));
    }

    public final /* synthetic */ boolean Y() {
        if (this.f12921B || TextUtils.isEmpty(D()) || TextUtils.isEmpty(A())) {
            return false;
        }
        try {
            Class.forName(D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object Z() {
        return this.f12937n;
    }

    public void a(c cVar) {
        C1032o.g(cVar, "Connection progress callbacks cannot be null.");
        this.f12939p = cVar;
        h0(2, (IInterface) null);
    }

    public final /* synthetic */ void a0(C1029l lVar) {
        this.f12938o = lVar;
    }

    public boolean b() {
        boolean z4;
        synchronized (this.f12936m) {
            z4 = this.f12943t == 4;
        }
        return z4;
    }

    public final /* synthetic */ ArrayList b0() {
        return this.f12941r;
    }

    public final /* synthetic */ a c0() {
        return this.f12944u;
    }

    public final /* synthetic */ b d0() {
        return this.f12945v;
    }

    public void e(String str) {
        this.f12929f = str;
        n();
    }

    public final /* synthetic */ C0941a e0() {
        return this.f12920A;
    }

    public boolean f() {
        return true;
    }

    public final /* synthetic */ void f0(C0941a aVar) {
        this.f12920A = aVar;
    }

    public final /* synthetic */ boolean g0() {
        return this.f12921B;
    }

    public void h(e eVar) {
        eVar.a();
    }

    public final void h0(int i4, IInterface iInterface) {
        e0 e0Var;
        boolean z4 = false;
        if ((i4 == 4) == (iInterface != null)) {
            z4 = true;
        }
        C1032o.a(z4);
        synchronized (this.f12936m) {
            try {
                this.f12943t = i4;
                this.f12940q = iInterface;
                Bundle bundle = null;
                if (i4 == 1) {
                    S s4 = this.f12942s;
                    if (s4 != null) {
                        C1026i iVar = this.f12933j;
                        String a4 = this.f12930g.a();
                        C1032o.f(a4);
                        iVar.d(a4, this.f12930g.b(), 4225, s4, S(), this.f12930g.c());
                        this.f12942s = null;
                    }
                } else if (i4 == 2 || i4 == 3) {
                    S s5 = this.f12942s;
                    if (!(s5 == null || (e0Var = this.f12930g) == null)) {
                        String a5 = e0Var.a();
                        String b4 = e0Var.b();
                        StringBuilder sb = new StringBuilder(String.valueOf(a5).length() + 70 + String.valueOf(b4).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(a5);
                        sb.append(" on ");
                        sb.append(b4);
                        Log.e("GmsClient", sb.toString());
                        C1026i iVar2 = this.f12933j;
                        String a6 = this.f12930g.a();
                        C1032o.f(a6);
                        iVar2.d(a6, this.f12930g.b(), 4225, s5, S(), this.f12930g.c());
                        this.f12923D.incrementAndGet();
                    }
                    S s6 = new S(this, this.f12923D.get());
                    this.f12942s = s6;
                    e0 e0Var2 = (this.f12943t != 3 || A() == null) ? new e0(F(), E(), false, 4225, H()) : new e0(x().getPackageName(), A(), true, 4225, false);
                    this.f12930g = e0Var2;
                    if (e0Var2.c()) {
                        if (i() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f12930g.a())));
                        }
                    }
                    C1026i iVar3 = this.f12933j;
                    String a7 = this.f12930g.a();
                    C1032o.f(a7);
                    C0941a c4 = iVar3.c(new Z(a7, this.f12930g.b(), 4225, this.f12930g.c()), s6, S(), v());
                    if (!c4.i()) {
                        String a8 = this.f12930g.a();
                        String b5 = this.f12930g.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a8).length() + 34 + String.valueOf(b5).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(a8);
                        sb2.append(" on ");
                        sb2.append(b5);
                        Log.w("GmsClient", sb2.toString());
                        int d4 = c4.d() == -1 ? 16 : c4.d();
                        if (c4.g() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c4.g());
                        }
                        T(d4, bundle, this.f12923D.get());
                    }
                } else if (i4 == 4) {
                    C1032o.f(iInterface);
                    J(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract int i();

    public boolean j() {
        boolean z4;
        synchronized (this.f12936m) {
            int i4 = this.f12943t;
            z4 = true;
            if (i4 != 2) {
                if (i4 != 3) {
                    z4 = false;
                }
            }
        }
        return z4;
    }

    public final u1.c[] k() {
        V v4 = this.f12922C;
        if (v4 == null) {
            return null;
        }
        return v4.f12894f;
    }

    public String l() {
        e0 e0Var;
        if (b() && (e0Var = this.f12930g) != null) {
            return e0Var.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public String m() {
        return this.f12929f;
    }

    public void n() {
        this.f12923D.incrementAndGet();
        ArrayList arrayList = this.f12941r;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((P) arrayList.get(i4)).d();
                }
                arrayList.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.f12937n) {
            this.f12938o = null;
        }
        h0(1, (IInterface) null);
    }

    public boolean o() {
        return false;
    }

    public void p(C1027j jVar, Set set) {
        String a4;
        Set set2 = set;
        Bundle z4 = z();
        if (Build.VERSION.SDK_INT < 31) {
            a4 = this.f12948y;
        } else if (this.f12949z == null) {
            a4 = this.f12948y;
        } else {
            AttributionSource a5 = this.f12949z.a();
            a4 = a5 == null ? this.f12948y : a5.getAttributionTag() == null ? this.f12948y : a5.getAttributionTag();
        }
        String str = a4;
        int i4 = this.f12946w;
        int i5 = u1.e.f12319a;
        Scope[] scopeArr = C1024g.f12975s;
        Bundle bundle = new Bundle();
        u1.c[] cVarArr = C1024g.f12976t;
        C1024g gVar = r3;
        C1024g gVar2 = new C1024g(6, i4, i5, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, cVarArr, cVarArr, true, 0, false, str);
        C1024g gVar3 = gVar;
        gVar3.f12980h = this.f12931h.getPackageName();
        gVar3.f12983k = z4;
        if (set2 != null) {
            gVar3.f12982j = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (o()) {
            Account t4 = t();
            if (t4 == null) {
                t4 = new Account("<<default account>>", "com.google");
            }
            gVar3.f12984l = t4;
            if (jVar != null) {
                gVar3.f12981i = jVar.asBinder();
            }
        } else if (N()) {
            gVar3.f12984l = t();
        }
        gVar3.f12985m = f12919F;
        gVar3.f12986n = u();
        if (R()) {
            gVar3.f12989q = true;
        }
        try {
            synchronized (this.f12937n) {
                C1029l lVar = this.f12938o;
                if (lVar != null) {
                    lVar.E(new Q(this, this.f12923D.get()), gVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            Q(3);
        } catch (SecurityException e5) {
            throw e5;
        } catch (RemoteException | RuntimeException e6) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e6);
            M(8, (IBinder) null, (Bundle) null, this.f12923D.get());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void q() {
        if (!b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public abstract IInterface r(IBinder iBinder);

    public boolean s() {
        return false;
    }

    public abstract Account t();

    public u1.c[] u() {
        return f12919F;
    }

    public abstract Executor v();

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.f12931h;
    }

    public int y() {
        return this.f12946w;
    }

    public Bundle z() {
        return new Bundle();
    }
}
