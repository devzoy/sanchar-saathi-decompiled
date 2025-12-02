package D0;

import D0.C0228l;
import O.a;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import i0.C0695p;
import i0.U;
import java.util.ArrayList;
import java.util.List;

/* renamed from: D0.e  reason: case insensitive filesystem */
public class C0221e extends U {

    /* renamed from: D0.e$a */
    public class a extends C0228l.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f633a;

        public a(Rect rect) {
            this.f633a = rect;
        }
    }

    /* renamed from: D0.e$b */
    public class b implements C0228l.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f635a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f636b;

        public b(View view, ArrayList arrayList) {
            this.f635a = view;
            this.f636b = arrayList;
        }

        public void a(C0228l lVar) {
            lVar.U(this);
            lVar.a(this);
        }

        public void b(C0228l lVar) {
        }

        public void c(C0228l lVar) {
        }

        public void d(C0228l lVar) {
            lVar.U(this);
            this.f635a.setVisibility(8);
            int size = this.f636b.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((View) this.f636b.get(i4)).setVisibility(0);
            }
        }

        public void e(C0228l lVar) {
        }
    }

    /* renamed from: D0.e$c */
    public class c extends C0229m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f638a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f639b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f640c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f641d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f642e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f643f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f638a = obj;
            this.f639b = arrayList;
            this.f640c = obj2;
            this.f641d = arrayList2;
            this.f642e = obj3;
            this.f643f = arrayList3;
        }

        public void a(C0228l lVar) {
            Object obj = this.f638a;
            if (obj != null) {
                C0221e.this.D(obj, this.f639b, (ArrayList) null);
            }
            Object obj2 = this.f640c;
            if (obj2 != null) {
                C0221e.this.D(obj2, this.f641d, (ArrayList) null);
            }
            Object obj3 = this.f642e;
            if (obj3 != null) {
                C0221e.this.D(obj3, this.f643f, (ArrayList) null);
            }
        }

        public void d(C0228l lVar) {
            lVar.U(this);
        }
    }

    /* renamed from: D0.e$d */
    public class d implements a.C0041a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C0228l f645a;

        public d(C0228l lVar) {
            this.f645a = lVar;
        }

        public void a() {
            this.f645a.k();
        }
    }

    /* renamed from: D0.e$e  reason: collision with other inner class name */
    public class C0004e implements C0228l.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f647a;

        public C0004e(Runnable runnable) {
            this.f647a = runnable;
        }

        public void a(C0228l lVar) {
        }

        public void b(C0228l lVar) {
        }

        public void c(C0228l lVar) {
        }

        public void d(C0228l lVar) {
            this.f647a.run();
        }

        public void e(C0228l lVar) {
        }
    }

    /* renamed from: D0.e$f */
    public class f extends C0228l.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f649a;

        public f(Rect rect) {
            this.f649a = rect;
        }
    }

    public static boolean C(C0228l lVar) {
        return !U.l(lVar.E()) || !U.l(lVar.F()) || !U.l(lVar.G());
    }

    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.H().clear();
            pVar.H().addAll(arrayList2);
            D(pVar, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.j0((C0228l) obj);
        return pVar;
    }

    public void D(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C0228l lVar = (C0228l) obj;
        int i4 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int m02 = pVar.m0();
            while (i4 < m02) {
                D(pVar.l0(i4), arrayList, arrayList2);
                i4++;
            }
        } else if (!C(lVar)) {
            List H4 = lVar.H();
            if (H4.size() == arrayList.size() && H4.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i4 < size) {
                    lVar.b((View) arrayList2.get(i4));
                    i4++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    lVar.V((View) arrayList.get(size2));
                }
            }
        }
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((C0228l) obj).b(view);
        }
    }

    public void b(Object obj, ArrayList arrayList) {
        C0228l lVar = (C0228l) obj;
        if (lVar != null) {
            int i4 = 0;
            if (lVar instanceof p) {
                p pVar = (p) lVar;
                int m02 = pVar.m0();
                while (i4 < m02) {
                    b(pVar.l0(i4), arrayList);
                    i4++;
                }
            } else if (!C(lVar) && U.l(lVar.H())) {
                int size = arrayList.size();
                while (i4 < size) {
                    lVar.b((View) arrayList.get(i4));
                    i4++;
                }
            }
        }
    }

    public void e(ViewGroup viewGroup, Object obj) {
        C0230n.a(viewGroup, (C0228l) obj);
    }

    public boolean g(Object obj) {
        return obj instanceof C0228l;
    }

    public Object h(Object obj) {
        if (obj != null) {
            return ((C0228l) obj).clone();
        }
        return null;
    }

    public Object o(Object obj, Object obj2, Object obj3) {
        C0228l lVar = (C0228l) obj;
        C0228l lVar2 = (C0228l) obj2;
        C0228l lVar3 = (C0228l) obj3;
        if (lVar != null && lVar2 != null) {
            lVar = new p().j0(lVar).j0(lVar2).r0(1);
        } else if (lVar == null) {
            lVar = lVar2 != null ? lVar2 : null;
        }
        if (lVar3 == null) {
            return lVar;
        }
        p pVar = new p();
        if (lVar != null) {
            pVar.j0(lVar);
        }
        pVar.j0(lVar3);
        return pVar;
    }

    public Object p(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.j0((C0228l) obj);
        }
        if (obj2 != null) {
            pVar.j0((C0228l) obj2);
        }
        if (obj3 != null) {
            pVar.j0((C0228l) obj3);
        }
        return pVar;
    }

    public void r(Object obj, View view, ArrayList arrayList) {
        ((C0228l) obj).a(new b(view, arrayList));
    }

    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((C0228l) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((C0228l) obj).a0(new f(rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((C0228l) obj).a0(new a(rect));
        }
    }

    public void w(C0695p pVar, Object obj, O.a aVar, Runnable runnable) {
        C0228l lVar = (C0228l) obj;
        aVar.b(new d(lVar));
        lVar.a(new C0004e(runnable));
    }

    public void z(Object obj, View view, ArrayList arrayList) {
        p pVar = (p) obj;
        List H4 = pVar.H();
        H4.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            U.f(H4, (View) arrayList.get(i4));
        }
        H4.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }
}
