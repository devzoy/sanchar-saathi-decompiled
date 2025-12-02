package androidx.recyclerview.widget;

import S.C;
import S.C0310a;
import T.m;
import T.n;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

public class k extends C0310a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f6018d;

    /* renamed from: e  reason: collision with root package name */
    public final a f6019e;

    public static class a extends C0310a {

        /* renamed from: d  reason: collision with root package name */
        public final k f6020d;

        /* renamed from: e  reason: collision with root package name */
        public Map f6021e = new WeakHashMap();

        public a(k kVar) {
            this.f6020d = kVar;
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C0310a aVar = (C0310a) this.f6021e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        public n b(View view) {
            C0310a aVar = (C0310a) this.f6021e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C0310a aVar = (C0310a) this.f6021e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        public void g(View view, m mVar) {
            if (this.f6020d.o() || this.f6020d.f6018d.getLayoutManager() == null) {
                super.g(view, mVar);
                return;
            }
            this.f6020d.f6018d.getLayoutManager().O0(view, mVar);
            C0310a aVar = (C0310a) this.f6021e.get(view);
            if (aVar != null) {
                aVar.g(view, mVar);
            } else {
                super.g(view, mVar);
            }
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C0310a aVar = (C0310a) this.f6021e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0310a aVar = (C0310a) this.f6021e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        public boolean j(View view, int i4, Bundle bundle) {
            if (this.f6020d.o() || this.f6020d.f6018d.getLayoutManager() == null) {
                return super.j(view, i4, bundle);
            }
            C0310a aVar = (C0310a) this.f6021e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i4, bundle)) {
                    return true;
                }
            } else if (super.j(view, i4, bundle)) {
                return true;
            }
            return this.f6020d.f6018d.getLayoutManager().i1(view, i4, bundle);
        }

        public void l(View view, int i4) {
            C0310a aVar = (C0310a) this.f6021e.get(view);
            if (aVar != null) {
                aVar.l(view, i4);
            } else {
                super.l(view, i4);
            }
        }

        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C0310a aVar = (C0310a) this.f6021e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public C0310a n(View view) {
            return (C0310a) this.f6021e.remove(view);
        }

        public void o(View view) {
            C0310a j4 = C.j(view);
            if (j4 != null && j4 != this) {
                this.f6021e.put(view, j4);
            }
        }
    }

    public k(RecyclerView recyclerView) {
        this.f6018d = recyclerView;
        C0310a n4 = n();
        if (n4 == null || !(n4 instanceof a)) {
            this.f6019e = new a(this);
        } else {
            this.f6019e = (a) n4;
        }
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().K0(accessibilityEvent);
            }
        }
    }

    public void g(View view, m mVar) {
        super.g(view, mVar);
        if (!o() && this.f6018d.getLayoutManager() != null) {
            this.f6018d.getLayoutManager().M0(mVar);
        }
    }

    public boolean j(View view, int i4, Bundle bundle) {
        if (super.j(view, i4, bundle)) {
            return true;
        }
        if (o() || this.f6018d.getLayoutManager() == null) {
            return false;
        }
        return this.f6018d.getLayoutManager().g1(i4, bundle);
    }

    public C0310a n() {
        return this.f6019e;
    }

    public boolean o() {
        return this.f6018d.l0();
    }
}
