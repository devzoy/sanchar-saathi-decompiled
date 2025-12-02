package w1;

import B1.e;
import D1.b;
import R1.g;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import u1.C0941a;
import u1.c;
import v.C0944a;
import v1.C0947a;
import v1.C0951e;
import v1.C0952f;
import v1.k;
import z1.C1031n;
import z1.C1032o;

/* renamed from: w1.w  reason: case insensitive filesystem */
public final class C0989w implements C0952f.a, C0952f.b {

    /* renamed from: c  reason: collision with root package name */
    public final Queue f12631c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    public final C0947a.f f12632d;

    /* renamed from: e  reason: collision with root package name */
    public final C0969b f12633e;

    /* renamed from: f  reason: collision with root package name */
    public final C0982o f12634f;

    /* renamed from: g  reason: collision with root package name */
    public final Set f12635g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public final Map f12636h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final int f12637i;

    /* renamed from: j  reason: collision with root package name */
    public final M f12638j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12639k;

    /* renamed from: l  reason: collision with root package name */
    public final List f12640l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public C0941a f12641m = null;

    /* renamed from: n  reason: collision with root package name */
    public int f12642n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ C0972e f12643o;

    public C0989w(C0972e eVar, C0951e eVar2) {
        Objects.requireNonNull(eVar);
        this.f12643o = eVar;
        C0947a.f k4 = eVar2.k(eVar.f().getLooper(), this);
        this.f12632d = k4;
        this.f12633e = eVar2.h();
        this.f12634f = new C0982o();
        this.f12637i = eVar2.l();
        if (k4.o()) {
            this.f12638j = eVar2.m(eVar.E(), eVar.f());
        } else {
            this.f12638j = null;
        }
    }

    public final boolean A() {
        return this.f12632d.o();
    }

    public final int B() {
        return this.f12637i;
    }

    public final int C() {
        return this.f12642n;
    }

    public final void D() {
        this.f12642n++;
    }

    public final /* synthetic */ void H(C0990x xVar) {
        if (!this.f12640l.contains(xVar) || this.f12639k) {
            return;
        }
        if (!this.f12632d.b()) {
            z();
        } else {
            f();
        }
    }

    public final /* synthetic */ void I(C0990x xVar) {
        c[] f4;
        if (this.f12640l.remove(xVar)) {
            C0972e eVar = this.f12643o;
            eVar.f().removeMessages(15, xVar);
            eVar.f().removeMessages(16, xVar);
            c b4 = xVar.b();
            Queue<T> queue = this.f12631c;
            ArrayList arrayList = new ArrayList(queue.size());
            for (T t4 : queue) {
                if ((t4 instanceof H) && (f4 = ((H) t4).f(this)) != null && b.b(f4, b4)) {
                    arrayList.add(t4);
                }
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                T t5 = (T) arrayList.get(i4);
                queue.remove(t5);
                t5.b(new k(b4));
            }
        }
    }

    public final /* synthetic */ C0947a.f J() {
        return this.f12632d;
    }

    public final /* synthetic */ C0969b a() {
        return this.f12633e;
    }

    public final /* synthetic */ boolean b() {
        return this.f12639k;
    }

    /* renamed from: c */
    public final void E() {
        v();
        n(C0941a.f12304i);
        k();
        Iterator it = this.f12636h.values().iterator();
        if (!it.hasNext()) {
            f();
            l();
            return;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    /* renamed from: d */
    public final void F(int i4) {
        v();
        this.f12639k = true;
        this.f12634f.e(i4, this.f12632d.m());
        C0969b bVar = this.f12633e;
        C0972e eVar = this.f12643o;
        eVar.f().sendMessageDelayed(Message.obtain(eVar.f(), 9, bVar), 5000);
        eVar.f().sendMessageDelayed(Message.obtain(eVar.f(), 11, bVar), 120000);
        eVar.b().c();
        Iterator it = this.f12636h.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(u1.C0941a r5) {
        /*
            r4 = this;
            java.lang.Object r0 = w1.C0972e.f12588r
            monitor-enter(r0)
            w1.e r1 = r4.f12643o     // Catch:{ all -> 0x0025 }
            w1.p r2 = r1.d()     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0027
            java.util.Set r2 = r1.e()     // Catch:{ all -> 0x0025 }
            w1.b r3 = r4.f12633e     // Catch:{ all -> 0x0025 }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0027
            w1.p r1 = r1.d()     // Catch:{ all -> 0x0025 }
            int r2 = r4.f12637i     // Catch:{ all -> 0x0025 }
            r1.q(r5, r2)     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            r5 = 1
            return r5
        L_0x0025:
            r5 = move-exception
            goto L_0x002a
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            r5 = 0
            return r5
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.C0989w.e(u1.a):boolean");
    }

    public final void f() {
        Queue queue = this.f12631c;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            T t4 = (T) arrayList.get(i4);
            if (this.f12632d.b()) {
                if (g(t4)) {
                    queue.remove(t4);
                }
                i4++;
            } else {
                return;
            }
        }
    }

    public final boolean g(T t4) {
        if (!(t4 instanceof H)) {
            h(t4);
            return true;
        }
        H h4 = (H) t4;
        c o4 = o(h4.f(this));
        if (o4 == null) {
            h(t4);
            return true;
        }
        String name = this.f12632d.getClass().getName();
        String d4 = o4.d();
        long e4 = o4.e();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(d4).length() + 2 + String.valueOf(e4).length() + 2);
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(d4);
        sb.append(", ");
        sb.append(e4);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        C0972e eVar = this.f12643o;
        if (!eVar.g() || !h4.g(this)) {
            h4.b(new k(o4));
            return true;
        }
        C0990x xVar = new C0990x(this.f12633e, o4, (byte[]) null);
        List list = this.f12640l;
        int indexOf = list.indexOf(xVar);
        if (indexOf >= 0) {
            C0990x xVar2 = (C0990x) list.get(indexOf);
            eVar.f().removeMessages(15, xVar2);
            eVar.f().sendMessageDelayed(Message.obtain(eVar.f(), 15, xVar2), 5000);
            return false;
        }
        list.add(xVar);
        eVar.f().sendMessageDelayed(Message.obtain(eVar.f(), 15, xVar), 5000);
        eVar.f().sendMessageDelayed(Message.obtain(eVar.f(), 16, xVar), 120000);
        C0941a aVar = new C0941a(2, (PendingIntent) null);
        if (e(aVar)) {
            String d5 = o4.d();
            long e5 = o4.e();
            StringBuilder sb2 = new StringBuilder(String.valueOf(d5).length() + 61 + String.valueOf(e5).length());
            sb2.append("A dialog should be displayed for missing feature: ");
            sb2.append(d5);
            sb2.append(", version: ");
            sb2.append(e5);
            Log.w("GoogleApiManager", sb2.toString());
            return false;
        } else if (!eVar.w(aVar, this.f12637i)) {
            return false;
        } else {
            String d6 = o4.d();
            long e6 = o4.e();
            StringBuilder sb3 = new StringBuilder(String.valueOf(d6).length() + 55 + String.valueOf(e6).length());
            sb3.append("Notification displayed for missing feature: ");
            sb3.append(d6);
            sb3.append(", version: ");
            sb3.append(e6);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
    }

    public final void h(T t4) {
        t4.c(this.f12634f, A());
        try {
            t4.d(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f12632d.e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void i(Status status, Exception exc, boolean z4) {
        C1032o.c(this.f12643o.f());
        boolean z5 = true;
        boolean z6 = status == null;
        if (exc != null) {
            z5 = false;
        }
        if (z6 != z5) {
            Iterator it = this.f12631c.iterator();
            while (it.hasNext()) {
                T t4 = (T) it.next();
                if (!z4 || t4.f12557a == 2) {
                    if (status != null) {
                        t4.a(status);
                    } else {
                        t4.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: j */
    public final void G(Status status) {
        C1032o.c(this.f12643o.f());
        i(status, (Exception) null, false);
    }

    public final void k() {
        if (this.f12639k) {
            C0972e eVar = this.f12643o;
            C0969b bVar = this.f12633e;
            eVar.f().removeMessages(11, bVar);
            eVar.f().removeMessages(9, bVar);
            this.f12639k = false;
        }
    }

    public final void l() {
        C0969b bVar = this.f12633e;
        C0972e eVar = this.f12643o;
        eVar.f().removeMessages(12, bVar);
        eVar.f().sendMessageDelayed(eVar.f().obtainMessage(12, bVar), eVar.B());
    }

    public final boolean m(boolean z4) {
        C1032o.c(this.f12643o.f());
        C0947a.f fVar = this.f12632d;
        if (!fVar.b() || !this.f12636h.isEmpty()) {
            return false;
        }
        if (!this.f12634f.c()) {
            fVar.e("Timing out service connection.");
            return true;
        } else if (!z4) {
            return false;
        } else {
            l();
            return false;
        }
    }

    public final void n(C0941a aVar) {
        Set set = this.f12635g;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (C1031n.a(aVar, C0941a.f12304i)) {
                this.f12632d.l();
            }
            throw null;
        }
        set.clear();
    }

    public final c o(c[] cVarArr) {
        if (!(cVarArr == null || cVarArr.length == 0)) {
            c[] k4 = this.f12632d.k();
            if (k4 == null) {
                k4 = new c[0];
            }
            C0944a aVar = new C0944a(k4.length);
            for (c cVar : k4) {
                aVar.put(cVar.d(), Long.valueOf(cVar.e()));
            }
            for (c cVar2 : cVarArr) {
                Long l4 = (Long) aVar.get(cVar2.d());
                if (l4 == null || l4.longValue() < cVar2.e()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final void onConnected(Bundle bundle) {
        C0972e eVar = this.f12643o;
        if (Looper.myLooper() == eVar.f().getLooper()) {
            E();
            return;
        }
        eVar.f().post(new C0985s(this));
    }

    public final void onConnectionFailed(C0941a aVar) {
        q(aVar, (Exception) null);
    }

    public final void onConnectionSuspended(int i4) {
        C0972e eVar = this.f12643o;
        if (Looper.myLooper() == eVar.f().getLooper()) {
            F(i4);
            return;
        }
        eVar.f().post(new C0986t(this, i4));
    }

    public final void p(C0941a aVar) {
        C1032o.c(this.f12643o.f());
        C0947a.f fVar = this.f12632d;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.e(sb.toString());
        q(aVar, (Exception) null);
    }

    public final void q(C0941a aVar, Exception exc) {
        C0972e eVar = this.f12643o;
        C1032o.c(eVar.f());
        M m4 = this.f12638j;
        if (m4 != null) {
            m4.J();
        }
        v();
        eVar.b().c();
        n(aVar);
        if ((this.f12632d instanceof e) && aVar.d() != 24) {
            eVar.C(true);
            eVar.f().sendMessageDelayed(eVar.f().obtainMessage(19), 300000);
        }
        if (aVar.d() == 4) {
            G(C0972e.f12587q);
        } else if (aVar.d() == 25) {
            G(C0972e.j(this.f12633e, aVar));
        } else {
            Queue queue = this.f12631c;
            if (queue.isEmpty()) {
                this.f12641m = aVar;
            } else if (exc != null) {
                C1032o.c(eVar.f());
                i((Status) null, exc, false);
            } else if (eVar.g()) {
                C0969b bVar = this.f12633e;
                i(C0972e.j(bVar, aVar), (Exception) null, true);
                if (!queue.isEmpty() && !e(aVar) && !eVar.w(aVar, this.f12637i)) {
                    if (aVar.d() == 18) {
                        this.f12639k = true;
                    }
                    if (this.f12639k) {
                        eVar.f().sendMessageDelayed(Message.obtain(eVar.f(), 9, bVar), 5000);
                    } else {
                        G(C0972e.j(bVar, aVar));
                    }
                }
            } else {
                G(C0972e.j(this.f12633e, aVar));
            }
        }
    }

    public final void r(T t4) {
        C1032o.c(this.f12643o.f());
        if (!this.f12632d.b()) {
            this.f12631c.add(t4);
            C0941a aVar = this.f12641m;
            if (aVar == null || !aVar.h()) {
                z();
            } else {
                q(this.f12641m, (Exception) null);
            }
        } else if (g(t4)) {
            l();
        } else {
            this.f12631c.add(t4);
        }
    }

    public final void s() {
        C1032o.c(this.f12643o.f());
        G(C0972e.f12586p);
        this.f12634f.d();
        for (C0976i iVar : (C0976i[]) this.f12636h.keySet().toArray(new C0976i[0])) {
            r(new S((C0976i) null, new g()));
        }
        n(new C0941a(4));
        C0947a.f fVar = this.f12632d;
        if (fVar.b()) {
            fVar.h(new C0988v(this));
        }
    }

    public final C0947a.f t() {
        return this.f12632d;
    }

    public final Map u() {
        return this.f12636h;
    }

    public final void v() {
        C1032o.c(this.f12643o.f());
        this.f12641m = null;
    }

    public final void w() {
        C1032o.c(this.f12643o.f());
        if (this.f12639k) {
            z();
        }
    }

    public final void x() {
        C0972e eVar = this.f12643o;
        C1032o.c(eVar.f());
        if (this.f12639k) {
            k();
            G(eVar.a().f(eVar.E()) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f12632d.e("Timing out connection while resuming.");
        }
    }

    public final boolean y() {
        return m(true);
    }

    public final void z() {
        C0972e eVar = this.f12643o;
        C1032o.c(eVar.f());
        C0947a.f fVar = this.f12632d;
        if (!fVar.b() && !fVar.j()) {
            try {
                int a4 = eVar.b().a(eVar.E(), fVar);
                if (a4 != 0) {
                    C0941a aVar = new C0941a(a4, (PendingIntent) null);
                    String name = this.f12632d.getClass().getName();
                    String obj = aVar.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    Log.w("GoogleApiManager", sb.toString());
                    q(aVar, (Exception) null);
                    return;
                }
                C0992z zVar = new C0992z(eVar, fVar, this.f12633e);
                if (fVar.o()) {
                    ((M) C1032o.f(this.f12638j)).I(zVar);
                }
                try {
                    fVar.a(zVar);
                } catch (SecurityException e4) {
                    q(new C0941a(10), e4);
                }
            } catch (IllegalStateException e5) {
                q(new C0941a(10), e5);
            }
        }
    }
}
