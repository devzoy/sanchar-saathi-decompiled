package O2;

import N2.C0288b;
import R2.d;
import T2.a;
import Y2.l;
import Y2.m;
import Y2.n;
import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C0380g;
import g3.C0641e;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class b implements T2.b, U2.b {

    /* renamed from: a  reason: collision with root package name */
    public final Map f2048a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final io.flutter.embedding.engine.a f2049b;

    /* renamed from: c  reason: collision with root package name */
    public final a.b f2050c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f2051d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public C0288b f2052e;

    /* renamed from: f  reason: collision with root package name */
    public c f2053f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2054g = false;

    /* renamed from: h  reason: collision with root package name */
    public final Map f2055h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public Service f2056i;

    /* renamed from: j  reason: collision with root package name */
    public final Map f2057j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public BroadcastReceiver f2058k;

    /* renamed from: l  reason: collision with root package name */
    public final Map f2059l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    public ContentProvider f2060m;

    /* renamed from: O2.b$b  reason: collision with other inner class name */
    public static class C0043b implements a.C0063a {

        /* renamed from: a  reason: collision with root package name */
        public final d f2061a;

        public C0043b(d dVar) {
            this.f2061a = dVar;
        }
    }

    public static class c implements U2.c {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f2062a;

        /* renamed from: b  reason: collision with root package name */
        public final HiddenLifecycleReference f2063b;

        /* renamed from: c  reason: collision with root package name */
        public final Set f2064c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        public final Set f2065d = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        public final Set f2066e = new HashSet();

        /* renamed from: f  reason: collision with root package name */
        public final Set f2067f = new HashSet();

        /* renamed from: g  reason: collision with root package name */
        public final Set f2068g = new HashSet();

        /* renamed from: h  reason: collision with root package name */
        public final Set f2069h = new HashSet();

        public c(Activity activity, C0380g gVar) {
            this.f2062a = activity;
            this.f2063b = new HiddenLifecycleReference(gVar);
        }

        public void a(l lVar) {
            this.f2065d.add(lVar);
        }

        public Object b() {
            return this.f2063b;
        }

        public void c(m mVar) {
            this.f2066e.add(mVar);
        }

        public void d(n nVar) {
            this.f2064c.add(nVar);
        }

        public Activity e() {
            return this.f2062a;
        }

        public void f(l lVar) {
            this.f2065d.remove(lVar);
        }

        public void g(n nVar) {
            this.f2064c.remove(nVar);
        }

        public boolean h(int i4, int i5, Intent intent) {
            Iterator it = new HashSet(this.f2065d).iterator();
            while (true) {
                boolean z4 = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z4;
                    }
                    if (((l) it.next()).onActivityResult(i4, i5, intent) || z4) {
                        z4 = true;
                    }
                }
            }
        }

        public void i(Intent intent) {
            for (m onNewIntent : this.f2066e) {
                onNewIntent.onNewIntent(intent);
            }
        }

        public void j(Bundle bundle) {
            Iterator it = this.f2069h.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }

        public void k(Bundle bundle) {
            Iterator it = this.f2069h.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }

        public void l() {
            Iterator it = this.f2067f.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
    }

    public b(Context context, io.flutter.embedding.engine.a aVar, d dVar, io.flutter.embedding.engine.b bVar) {
        this.f2049b = aVar;
        this.f2050c = new a.b(context, aVar, aVar.k(), aVar.t(), aVar.q().W(), new C0043b(dVar), bVar);
    }

    public void a(T2.a aVar) {
        C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (o(aVar.getClass())) {
                M2.b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f2049b + ").");
                if (g4 != null) {
                    g4.close();
                    return;
                }
                return;
            }
            M2.b.f("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f2048a.put(aVar.getClass(), aVar);
            aVar.onAttachedToEngine(this.f2050c);
            if (aVar instanceof U2.a) {
                U2.a aVar2 = (U2.a) aVar;
                this.f2051d.put(aVar.getClass(), aVar2);
                if (p()) {
                    aVar2.onAttachedToActivity(this.f2053f);
                }
            }
            if (g4 != null) {
                g4.close();
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void b() {
        if (p()) {
            C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
            try {
                this.f2054g = true;
                for (U2.a onDetachedFromActivityForConfigChanges : this.f2051d.values()) {
                    onDetachedFromActivityForConfigChanges.onDetachedFromActivityForConfigChanges();
                }
                j();
                if (g4 != null) {
                    g4.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            M2.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        throw th;
    }

    public void c(C0288b bVar, C0380g gVar) {
        C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0288b bVar2 = this.f2052e;
            if (bVar2 != null) {
                bVar2.f();
            }
            k();
            this.f2052e = bVar;
            h((Activity) bVar.g(), gVar);
            if (g4 != null) {
                g4.close();
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void d(Bundle bundle) {
        if (p()) {
            C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                this.f2053f.j(bundle);
                if (g4 != null) {
                    g4.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            M2.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        throw th;
    }

    public void e() {
        if (p()) {
            C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (U2.a onDetachedFromActivity : this.f2051d.values()) {
                    onDetachedFromActivity.onDetachedFromActivity();
                }
                j();
                if (g4 != null) {
                    g4.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            M2.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        throw th;
    }

    public void f(Bundle bundle) {
        if (p()) {
            C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#onSaveInstanceState");
            try {
                this.f2053f.k(bundle);
                if (g4 != null) {
                    g4.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            M2.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        throw th;
    }

    public void g() {
        if (p()) {
            C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                this.f2053f.l();
                if (g4 != null) {
                    g4.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            M2.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        throw th;
    }

    public final void h(Activity activity, C0380g gVar) {
        this.f2053f = new c(activity, gVar);
        this.f2049b.q().u0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f2049b.q().C(activity, this.f2049b.t(), this.f2049b.k());
        for (U2.a aVar : this.f2051d.values()) {
            if (this.f2054g) {
                aVar.onReattachedToActivityForConfigChanges(this.f2053f);
            } else {
                aVar.onAttachedToActivity(this.f2053f);
            }
        }
        this.f2054g = false;
    }

    public void i() {
        M2.b.f("FlutterEngineCxnRegstry", "Destroying.");
        k();
        v();
    }

    public final void j() {
        this.f2049b.q().O();
        this.f2052e = null;
        this.f2053f = null;
    }

    public final void k() {
        if (p()) {
            e();
        } else if (s()) {
            n();
        } else if (q()) {
            l();
        } else if (r()) {
            m();
        }
    }

    public void l() {
        if (q()) {
            C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
            try {
                Iterator it = this.f2057j.values().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                } else if (g4 != null) {
                    g4.close();
                    return;
                } else {
                    return;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            M2.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        throw th;
    }

    public void m() {
        if (r()) {
            C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#detachFromContentProvider");
            try {
                Iterator it = this.f2059l.values().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                } else if (g4 != null) {
                    g4.close();
                    return;
                } else {
                    return;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            M2.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        throw th;
    }

    public void n() {
        if (s()) {
            C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#detachFromService");
            try {
                Iterator it = this.f2055h.values().iterator();
                if (!it.hasNext()) {
                    this.f2056i = null;
                    if (g4 != null) {
                        g4.close();
                        return;
                    }
                    return;
                }
                android.support.v4.media.session.b.a(it.next());
                throw null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            M2.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        throw th;
    }

    public boolean o(Class cls) {
        return this.f2048a.containsKey(cls);
    }

    public boolean onActivityResult(int i4, int i5, Intent intent) {
        if (p()) {
            C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                boolean h4 = this.f2053f.h(i4, i5, intent);
                if (g4 != null) {
                    g4.close();
                }
                return h4;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            M2.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        throw th;
    }

    public void onNewIntent(Intent intent) {
        if (p()) {
            C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                this.f2053f.i(intent);
                if (g4 != null) {
                    g4.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            M2.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        throw th;
    }

    public final boolean p() {
        return this.f2052e != null;
    }

    public final boolean q() {
        return this.f2058k != null;
    }

    public final boolean r() {
        return this.f2060m != null;
    }

    public final boolean s() {
        return this.f2056i != null;
    }

    public void t(Class cls) {
        T2.a aVar = (T2.a) this.f2048a.get(cls);
        if (aVar != null) {
            C0641e g4 = C0641e.g("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
            try {
                if (aVar instanceof U2.a) {
                    if (p()) {
                        ((U2.a) aVar).onDetachedFromActivity();
                    }
                    this.f2051d.remove(cls);
                }
                aVar.onDetachedFromEngine(this.f2050c);
                this.f2048a.remove(cls);
                if (g4 != null) {
                    g4.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            return;
        }
        throw th;
    }

    public void u(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            t((Class) it.next());
        }
    }

    public void v() {
        u(new HashSet(this.f2048a.keySet()));
        this.f2048a.clear();
    }
}
