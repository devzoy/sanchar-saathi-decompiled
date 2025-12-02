package i0;

import android.util.Log;
import androidx.lifecycle.F;
import androidx.lifecycle.G;
import androidx.lifecycle.H;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class L extends F {

    /* renamed from: i  reason: collision with root package name */
    public static final G.c f9892i = new a();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f9893b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f9894c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f9895d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9896e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9897f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9898g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9899h = false;

    public class a implements G.c {
        public F a(Class cls) {
            return new L(true);
        }
    }

    public L(boolean z4) {
        this.f9896e = z4;
    }

    public static L i(H h4) {
        return (L) new G(h4, f9892i).b(L.class);
    }

    public void b() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f9897f = true;
    }

    public void c(C0695p pVar) {
        if (this.f9899h) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f9893b.containsKey(pVar.f10169h)) {
            this.f9893b.put(pVar.f10169h, pVar);
            if (I.I0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + pVar);
            }
        }
    }

    public void d(C0695p pVar, boolean z4) {
        if (I.I0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + pVar);
        }
        f(pVar.f10169h, z4);
    }

    public void e(String str, boolean z4) {
        if (I.I0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        f(str, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l4 = (L) obj;
        return this.f9893b.equals(l4.f9893b) && this.f9894c.equals(l4.f9894c) && this.f9895d.equals(l4.f9895d);
    }

    public final void f(String str, boolean z4) {
        L l4 = (L) this.f9894c.get(str);
        if (l4 != null) {
            if (z4) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(l4.f9894c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    l4.e((String) it.next(), true);
                }
            }
            l4.b();
            this.f9894c.remove(str);
        }
        H h4 = (H) this.f9895d.get(str);
        if (h4 != null) {
            h4.a();
            this.f9895d.remove(str);
        }
    }

    public C0695p g(String str) {
        return (C0695p) this.f9893b.get(str);
    }

    public L h(C0695p pVar) {
        L l4 = (L) this.f9894c.get(pVar.f10169h);
        if (l4 != null) {
            return l4;
        }
        L l5 = new L(this.f9896e);
        this.f9894c.put(pVar.f10169h, l5);
        return l5;
    }

    public int hashCode() {
        return (((this.f9893b.hashCode() * 31) + this.f9894c.hashCode()) * 31) + this.f9895d.hashCode();
    }

    public Collection j() {
        return new ArrayList(this.f9893b.values());
    }

    public H k(C0695p pVar) {
        H h4 = (H) this.f9895d.get(pVar.f10169h);
        if (h4 != null) {
            return h4;
        }
        H h5 = new H();
        this.f9895d.put(pVar.f10169h, h5);
        return h5;
    }

    public boolean l() {
        return this.f9897f;
    }

    public void m(C0695p pVar) {
        if (this.f9899h) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f9893b.remove(pVar.f10169h) != null && I.I0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + pVar);
        }
    }

    public void n(boolean z4) {
        this.f9899h = z4;
    }

    public boolean o(C0695p pVar) {
        if (!this.f9893b.containsKey(pVar.f10169h)) {
            return true;
        }
        return this.f9896e ? this.f9897f : !this.f9898g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f9893b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f9894c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f9895d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
