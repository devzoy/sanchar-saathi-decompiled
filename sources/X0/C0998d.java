package x0;

import android.os.Bundle;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.C0384k;
import java.util.Iterator;
import java.util.Map;
import r.C0902b;
import v3.g;
import v3.l;

/* renamed from: x0.d  reason: case insensitive filesystem */
public final class C0998d {

    /* renamed from: f  reason: collision with root package name */
    public static final b f12692f = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final C0902b f12693a = new C0902b();

    /* renamed from: b  reason: collision with root package name */
    public boolean f12694b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f12695c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12696d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12697e = true;

    /* renamed from: x0.d$a */
    public interface a {
    }

    /* renamed from: x0.d$b */
    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: x0.d$c */
    public interface c {
        Bundle a();
    }

    public static final void d(C0998d dVar, C0384k kVar, C0380g.a aVar) {
        l.e(dVar, "this$0");
        l.e(kVar, "<anonymous parameter 0>");
        l.e(aVar, "event");
        if (aVar == C0380g.a.ON_START) {
            dVar.f12697e = true;
        } else if (aVar == C0380g.a.ON_STOP) {
            dVar.f12697e = false;
        }
    }

    public final Bundle b(String str) {
        l.e(str, "key");
        if (this.f12696d) {
            Bundle bundle = this.f12695c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f12695c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f12695c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f12695c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final c c(String str) {
        l.e(str, "key");
        Iterator it = this.f12693a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            l.d(entry, "components");
            c cVar = (c) entry.getValue();
            if (l.a((String) entry.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(C0380g gVar) {
        l.e(gVar, "lifecycle");
        if (!this.f12694b) {
            gVar.a(new C0997c(this));
            this.f12694b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.");
    }

    public final void f(Bundle bundle) {
        if (!this.f12694b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        } else if (!this.f12696d) {
            this.f12695c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            this.f12696d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
    }

    public final void g(Bundle bundle) {
        l.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f12695c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0902b.d v4 = this.f12693a.v();
        l.d(v4, "this.components.iteratorWithAdditions()");
        while (v4.hasNext()) {
            Map.Entry entry = (Map.Entry) v4.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String str, c cVar) {
        l.e(str, "key");
        l.e(cVar, "provider");
        if (((c) this.f12693a.y(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}
