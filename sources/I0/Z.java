package i0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import d.C0566b;
import h0.C0651b;
import h3.C0673n;
import i3.C0743t;
import i3.C0746w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import v3.g;
import v3.l;

public abstract class Z {

    /* renamed from: f  reason: collision with root package name */
    public static final a f9990f = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f9991a;

    /* renamed from: b  reason: collision with root package name */
    public final List f9992b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List f9993c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f9994d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9995e;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Z a(ViewGroup viewGroup, I i4) {
            l.e(viewGroup, "container");
            l.e(i4, "fragmentManager");
            a0 A02 = i4.A0();
            l.d(A02, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, A02);
        }

        public final Z b(ViewGroup viewGroup, a0 a0Var) {
            l.e(viewGroup, "container");
            l.e(a0Var, "factory");
            Object tag = viewGroup.getTag(C0651b.f9587b);
            if (tag instanceof Z) {
                return (Z) tag;
            }
            Z a4 = a0Var.a(viewGroup);
            l.d(a4, "factory.createController(container)");
            viewGroup.setTag(C0651b.f9587b, a4);
            return a4;
        }

        public a() {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9996a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9997b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9998c;

        public final void a(ViewGroup viewGroup) {
            l.e(viewGroup, "container");
            if (!this.f9998c) {
                c(viewGroup);
            }
            this.f9998c = true;
        }

        public boolean b() {
            return this.f9996a;
        }

        public abstract void c(ViewGroup viewGroup);

        public abstract void d(ViewGroup viewGroup);

        public void e(C0566b bVar, ViewGroup viewGroup) {
            l.e(bVar, "backEvent");
            l.e(viewGroup, "container");
        }

        public void f(ViewGroup viewGroup) {
            l.e(viewGroup, "container");
        }

        public final void g(ViewGroup viewGroup) {
            l.e(viewGroup, "container");
            if (!this.f9997b) {
                f(viewGroup);
            }
            this.f9997b = true;
        }
    }

    public static final class c extends d {

        /* renamed from: l  reason: collision with root package name */
        public final O f9999l;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(i0.Z.d.b r3, i0.Z.d.a r4, i0.O r5) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                v3.l.e(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                v3.l.e(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                v3.l.e(r5, r0)
                i0.p r0 = r5.k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                v3.l.d(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.f9999l = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.Z.c.<init>(i0.Z$d$b, i0.Z$d$a, i0.O):void");
        }

        public void e() {
            super.e();
            i().f10177p = false;
            this.f9999l.m();
        }

        public void q() {
            if (!o()) {
                super.q();
                if (j() == d.a.ADDING) {
                    C0695p k4 = this.f9999l.k();
                    l.d(k4, "fragmentStateManager.fragment");
                    View findFocus = k4.f10144L.findFocus();
                    if (findFocus != null) {
                        k4.x1(findFocus);
                        if (I.I0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k4);
                        }
                    }
                    View r12 = i().r1();
                    l.d(r12, "this.fragment.requireView()");
                    if (r12.getParent() == null) {
                        this.f9999l.b();
                        r12.setAlpha(0.0f);
                    }
                    if (r12.getAlpha() == 0.0f && r12.getVisibility() == 0) {
                        r12.setVisibility(4);
                    }
                    r12.setAlpha(k4.L());
                } else if (j() == d.a.REMOVING) {
                    C0695p k5 = this.f9999l.k();
                    l.d(k5, "fragmentStateManager.fragment");
                    View r13 = k5.r1();
                    l.d(r13, "fragment.requireView()");
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + r13.findFocus() + " on view " + r13 + " for Fragment " + k5);
                    }
                    r13.clearFocus();
                }
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public b f10000a;

        /* renamed from: b  reason: collision with root package name */
        public a f10001b;

        /* renamed from: c  reason: collision with root package name */
        public final C0695p f10002c;

        /* renamed from: d  reason: collision with root package name */
        public final List f10003d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public boolean f10004e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10005f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f10006g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f10007h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f10008i = true;

        /* renamed from: j  reason: collision with root package name */
        public final List f10009j;

        /* renamed from: k  reason: collision with root package name */
        public final List f10010k;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;
            

            /* renamed from: e  reason: collision with root package name */
            public static final a f10015e = null;

            public static final class a {
                public /* synthetic */ a(g gVar) {
                    this();
                }

                public final b a(View view) {
                    l.e(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i4) {
                    if (i4 == 0) {
                        return b.VISIBLE;
                    }
                    if (i4 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i4 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i4);
                }

                public a() {
                }
            }

            /* renamed from: i0.Z$d$b$b  reason: collision with other inner class name */
            public /* synthetic */ class C0167b {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f10021a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                static {
                    /*
                        i0.Z$d$b[] r0 = i0.Z.d.b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        i0.Z$d$b r1 = i0.Z.d.b.REMOVED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        i0.Z$d$b r1 = i0.Z.d.b.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        i0.Z$d$b r1 = i0.Z.d.b.GONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        i0.Z$d$b r1 = i0.Z.d.b.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        f10021a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: i0.Z.d.b.C0167b.<clinit>():void");
                }
            }

            static {
                f10015e = new a((g) null);
            }

            public static final b k(int i4) {
                return f10015e.b(i4);
            }

            /* JADX WARNING: type inference failed for: r7v1, types: [android.view.ViewParent] */
            /* JADX WARNING: type inference failed for: r0v8, types: [android.view.ViewParent] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 2 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void f(android.view.View r6, android.view.ViewGroup r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "view"
                    v3.l.e(r6, r0)
                    java.lang.String r0 = "container"
                    v3.l.e(r7, r0)
                    int[] r0 = i0.Z.d.b.C0167b.f10021a
                    int r1 = r5.ordinal()
                    r0 = r0[r1]
                    r1 = 1
                    r2 = 0
                    java.lang.String r3 = "FragmentManager"
                    r4 = 2
                    if (r0 == r1) goto L_0x00bf
                    java.lang.String r1 = "SpecialEffectsController: Setting view "
                    if (r0 == r4) goto L_0x006b
                    r7 = 3
                    if (r0 == r7) goto L_0x0047
                    r7 = 4
                    if (r0 == r7) goto L_0x0025
                    goto L_0x00f1
                L_0x0025:
                    boolean r0 = i0.I.I0(r4)
                    if (r0 == 0) goto L_0x0042
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to INVISIBLE"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r3, r0)
                L_0x0042:
                    r6.setVisibility(r7)
                    goto L_0x00f1
                L_0x0047:
                    boolean r7 = i0.I.I0(r4)
                    if (r7 == 0) goto L_0x0064
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r1)
                    r7.append(r6)
                    java.lang.String r0 = " to GONE"
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    android.util.Log.v(r3, r7)
                L_0x0064:
                    r7 = 8
                    r6.setVisibility(r7)
                    goto L_0x00f1
                L_0x006b:
                    boolean r0 = i0.I.I0(r4)
                    if (r0 == 0) goto L_0x0088
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to VISIBLE"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r3, r0)
                L_0x0088:
                    android.view.ViewParent r0 = r6.getParent()
                    boolean r1 = r0 instanceof android.view.ViewGroup
                    if (r1 == 0) goto L_0x0093
                    r2 = r0
                    android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                L_0x0093:
                    if (r2 != 0) goto L_0x00ba
                    boolean r0 = i0.I.I0(r4)
                    if (r0 == 0) goto L_0x00b7
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "SpecialEffectsController: Adding view "
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to Container "
                    r0.append(r1)
                    r0.append(r7)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r3, r0)
                L_0x00b7:
                    r7.addView(r6)
                L_0x00ba:
                    r7 = 0
                    r6.setVisibility(r7)
                    goto L_0x00f1
                L_0x00bf:
                    android.view.ViewParent r7 = r6.getParent()
                    boolean r0 = r7 instanceof android.view.ViewGroup
                    if (r0 == 0) goto L_0x00ca
                    r2 = r7
                    android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                L_0x00ca:
                    if (r2 == 0) goto L_0x00f1
                    boolean r7 = i0.I.I0(r4)
                    if (r7 == 0) goto L_0x00ee
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r0 = "SpecialEffectsController: Removing view "
                    r7.append(r0)
                    r7.append(r6)
                    java.lang.String r0 = " from container "
                    r7.append(r0)
                    r7.append(r2)
                    java.lang.String r7 = r7.toString()
                    android.util.Log.v(r3, r7)
                L_0x00ee:
                    r2.removeView(r6)
                L_0x00f1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: i0.Z.d.b.f(android.view.View, android.view.ViewGroup):void");
            }
        }

        public /* synthetic */ class c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f10022a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    i0.Z$d$a[] r0 = i0.Z.d.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    i0.Z$d$a r1 = i0.Z.d.a.ADDING     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    i0.Z$d$a r1 = i0.Z.d.a.REMOVING     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    i0.Z$d$a r1 = i0.Z.d.a.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f10022a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: i0.Z.d.c.<clinit>():void");
            }
        }

        public d(b bVar, a aVar, C0695p pVar) {
            l.e(bVar, "finalState");
            l.e(aVar, "lifecycleImpact");
            l.e(pVar, "fragment");
            this.f10000a = bVar;
            this.f10001b = aVar;
            this.f10002c = pVar;
            ArrayList arrayList = new ArrayList();
            this.f10009j = arrayList;
            this.f10010k = arrayList;
        }

        public final void a(Runnable runnable) {
            l.e(runnable, "listener");
            this.f10003d.add(runnable);
        }

        public final void b(b bVar) {
            l.e(bVar, "effect");
            this.f10009j.add(bVar);
        }

        public final void c(ViewGroup viewGroup) {
            l.e(viewGroup, "container");
            this.f10007h = false;
            if (!this.f10004e) {
                this.f10004e = true;
                if (this.f10009j.isEmpty()) {
                    e();
                    return;
                }
                for (b a4 : C0746w.I(this.f10010k)) {
                    a4.a(viewGroup);
                }
            }
        }

        public final void d(ViewGroup viewGroup, boolean z4) {
            l.e(viewGroup, "container");
            if (!this.f10004e) {
                if (z4) {
                    this.f10006g = true;
                }
                c(viewGroup);
            }
        }

        public void e() {
            this.f10007h = false;
            if (!this.f10005f) {
                if (I.I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f10005f = true;
                for (Runnable run : this.f10003d) {
                    run.run();
                }
            }
        }

        public final void f(b bVar) {
            l.e(bVar, "effect");
            if (this.f10009j.remove(bVar) && this.f10009j.isEmpty()) {
                e();
            }
        }

        public final List g() {
            return this.f10010k;
        }

        public final b h() {
            return this.f10000a;
        }

        public final C0695p i() {
            return this.f10002c;
        }

        public final a j() {
            return this.f10001b;
        }

        public final boolean k() {
            return this.f10008i;
        }

        public final boolean l() {
            return this.f10004e;
        }

        public final boolean m() {
            return this.f10005f;
        }

        public final boolean n() {
            return this.f10006g;
        }

        public final boolean o() {
            return this.f10007h;
        }

        public final void p(b bVar, a aVar) {
            l.e(bVar, "finalState");
            l.e(aVar, "lifecycleImpact");
            int i4 = c.f10022a[aVar.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f10002c + " mFinalState = " + this.f10000a + " -> REMOVED. mLifecycleImpact  = " + this.f10001b + " to REMOVING.");
                    }
                    this.f10000a = b.REMOVED;
                    this.f10001b = a.REMOVING;
                    this.f10008i = true;
                } else if (i4 == 3 && this.f10000a != b.REMOVED) {
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f10002c + " mFinalState = " + this.f10000a + " -> " + bVar + '.');
                    }
                    this.f10000a = bVar;
                }
            } else if (this.f10000a == b.REMOVED) {
                if (I.I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f10002c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f10001b + " to ADDING.");
                }
                this.f10000a = b.VISIBLE;
                this.f10001b = a.ADDING;
                this.f10008i = true;
            }
        }

        public void q() {
            this.f10007h = true;
        }

        public final void r(boolean z4) {
            this.f10008i = z4;
        }

        public String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            return "Operation {" + hexString + "} {finalState = " + this.f10000a + " lifecycleImpact = " + this.f10001b + " fragment = " + this.f10002c + '}';
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10023a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10023a = iArr;
        }
    }

    public Z(ViewGroup viewGroup) {
        l.e(viewGroup, "container");
        this.f9991a = viewGroup;
    }

    public static final void h(Z z4, c cVar) {
        l.e(z4, "this$0");
        l.e(cVar, "$operation");
        if (z4.f9992b.contains(cVar)) {
            d.b h4 = cVar.h();
            View view = cVar.i().f10144L;
            l.d(view, "operation.fragment.mView");
            h4.f(view, z4.f9991a);
        }
    }

    public static final void i(Z z4, c cVar) {
        l.e(z4, "this$0");
        l.e(cVar, "$operation");
        z4.f9992b.remove(cVar);
        z4.f9993c.remove(cVar);
    }

    public static final Z u(ViewGroup viewGroup, I i4) {
        return f9990f.a(viewGroup, i4);
    }

    public static final Z v(ViewGroup viewGroup, a0 a0Var) {
        return f9990f.b(viewGroup, a0Var);
    }

    public final void A() {
        for (d dVar : this.f9992b) {
            if (dVar.j() == d.a.ADDING) {
                View r12 = dVar.i().r1();
                l.d(r12, "fragment.requireView()");
                dVar.p(d.b.f10015e.b(r12.getVisibility()), d.a.NONE);
            }
        }
    }

    public final void B(boolean z4) {
        this.f9994d = z4;
    }

    public final void c(d dVar) {
        l.e(dVar, "operation");
        if (dVar.k()) {
            d.b h4 = dVar.h();
            View r12 = dVar.i().r1();
            l.d(r12, "operation.fragment.requireView()");
            h4.f(r12, this.f9991a);
            dVar.r(false);
        }
    }

    public abstract void d(List list, boolean z4);

    public void e(List list) {
        l.e(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0743t.p(arrayList, ((d) it.next()).g());
        }
        List I4 = C0746w.I(C0746w.L(arrayList));
        int size = I4.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((b) I4.get(i4)).d(this.f9991a);
        }
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            c((d) list.get(i5));
        }
        List I5 = C0746w.I(list);
        int size3 = I5.size();
        for (int i6 = 0; i6 < size3; i6++) {
            d dVar = (d) I5.get(i6);
            if (dVar.g().isEmpty()) {
                dVar.e();
            }
        }
    }

    public final void f() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        z(this.f9993c);
        e(this.f9993c);
    }

    public final void g(d.b bVar, d.a aVar, O o4) {
        synchronized (this.f9992b) {
            try {
                C0695p k4 = o4.k();
                l.d(k4, "fragmentStateManager.fragment");
                d o5 = o(k4);
                if (o5 == null) {
                    if (o4.k().f10177p) {
                        C0695p k5 = o4.k();
                        l.d(k5, "fragmentStateManager.fragment");
                        o5 = p(k5);
                    } else {
                        o5 = null;
                    }
                }
                if (o5 != null) {
                    o5.p(bVar, aVar);
                    return;
                }
                c cVar = new c(bVar, aVar, o4);
                this.f9992b.add(cVar);
                cVar.a(new X(this, cVar));
                cVar.a(new Y(this, cVar));
                C0673n nVar = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(d.b bVar, O o4) {
        l.e(bVar, "finalState");
        l.e(o4, "fragmentStateManager");
        if (I.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + o4.k());
        }
        g(bVar, d.a.ADDING, o4);
    }

    public final void k(O o4) {
        l.e(o4, "fragmentStateManager");
        if (I.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + o4.k());
        }
        g(d.b.GONE, d.a.NONE, o4);
    }

    public final void l(O o4) {
        l.e(o4, "fragmentStateManager");
        if (I.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + o4.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, o4);
    }

    public final void m(O o4) {
        l.e(o4, "fragmentStateManager");
        if (I.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + o4.k());
        }
        g(d.b.VISIBLE, d.a.NONE, o4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0155 A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018a A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0191 A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b0 A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0105 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r11 = this;
            r0 = 1
            boolean r1 = r11.f9995e
            if (r1 == 0) goto L_0x0006
            return
        L_0x0006:
            android.view.ViewGroup r1 = r11.f9991a
            boolean r1 = r1.isAttachedToWindow()
            r2 = 0
            if (r1 != 0) goto L_0x0015
            r11.q()
            r11.f9994d = r2
            return
        L_0x0015:
            java.util.List r1 = r11.f9992b
            monitor-enter(r1)
            java.util.List r3 = r11.f9992b     // Catch:{ all -> 0x0060 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0060 }
            r4 = 2
            if (r3 == 0) goto L_0x0074
            java.util.List r0 = r11.f9993c     // Catch:{ all -> 0x0060 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0060 }
            java.util.List r0 = i3.C0746w.K(r0)     // Catch:{ all -> 0x0060 }
            java.util.List r3 = r11.f9993c     // Catch:{ all -> 0x0060 }
            r3.clear()     // Catch:{ all -> 0x0060 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0032:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x01b7
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0060 }
            i0.Z$d r3 = (i0.Z.d) r3     // Catch:{ all -> 0x0060 }
            boolean r5 = i0.I.I0(r4)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x0063
            java.lang.String r5 = "FragmentManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r6.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r7 = "SpecialEffectsController: Cancelling operation "
            r6.append(r7)     // Catch:{ all -> 0x0060 }
            r6.append(r3)     // Catch:{ all -> 0x0060 }
            java.lang.String r7 = " with no incoming pendingOperations"
            r6.append(r7)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0060 }
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0063
        L_0x0060:
            r0 = move-exception
            goto L_0x01bb
        L_0x0063:
            android.view.ViewGroup r5 = r11.f9991a     // Catch:{ all -> 0x0060 }
            r3.d(r5, r2)     // Catch:{ all -> 0x0060 }
            boolean r5 = r3.m()     // Catch:{ all -> 0x0060 }
            if (r5 != 0) goto L_0x0032
            java.util.List r5 = r11.f9993c     // Catch:{ all -> 0x0060 }
            r5.add(r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0032
        L_0x0074:
            java.util.List r3 = r11.f9993c     // Catch:{ all -> 0x0060 }
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x0060 }
            java.util.List r3 = i3.C0746w.K(r3)     // Catch:{ all -> 0x0060 }
            java.util.List r5 = r11.f9993c     // Catch:{ all -> 0x0060 }
            r5.clear()     // Catch:{ all -> 0x0060 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0085:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x00c4
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0060 }
            i0.Z$d r5 = (i0.Z.d) r5     // Catch:{ all -> 0x0060 }
            boolean r6 = i0.I.I0(r4)     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x00ad
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r7.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r8 = "SpecialEffectsController: Cancelling operation "
            r7.append(r8)     // Catch:{ all -> 0x0060 }
            r7.append(r5)     // Catch:{ all -> 0x0060 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0060 }
            android.util.Log.v(r6, r7)     // Catch:{ all -> 0x0060 }
        L_0x00ad:
            android.view.ViewGroup r6 = r11.f9991a     // Catch:{ all -> 0x0060 }
            i0.p r7 = r5.i()     // Catch:{ all -> 0x0060 }
            boolean r7 = r7.f10177p     // Catch:{ all -> 0x0060 }
            r5.d(r6, r7)     // Catch:{ all -> 0x0060 }
            boolean r6 = r5.m()     // Catch:{ all -> 0x0060 }
            if (r6 != 0) goto L_0x0085
            java.util.List r6 = r11.f9993c     // Catch:{ all -> 0x0060 }
            r6.add(r5)     // Catch:{ all -> 0x0060 }
            goto L_0x0085
        L_0x00c4:
            r11.A()     // Catch:{ all -> 0x0060 }
            java.util.List r3 = r11.f9992b     // Catch:{ all -> 0x0060 }
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x0060 }
            java.util.List r3 = i3.C0746w.K(r3)     // Catch:{ all -> 0x0060 }
            boolean r5 = r3.isEmpty()     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x00d7
            monitor-exit(r1)
            return
        L_0x00d7:
            java.util.List r5 = r11.f9992b     // Catch:{ all -> 0x0060 }
            r5.clear()     // Catch:{ all -> 0x0060 }
            java.util.List r5 = r11.f9993c     // Catch:{ all -> 0x0060 }
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x0060 }
            r5.addAll(r6)     // Catch:{ all -> 0x0060 }
            boolean r5 = i0.I.I0(r4)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x00f1
            java.lang.String r5 = "FragmentManager"
            java.lang.String r6 = "SpecialEffectsController: Executing pending operations"
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x0060 }
        L_0x00f1:
            boolean r5 = r11.f9994d     // Catch:{ all -> 0x0060 }
            r11.d(r3, r5)     // Catch:{ all -> 0x0060 }
            v3.t r5 = new v3.t     // Catch:{ all -> 0x0060 }
            r5.<init>()     // Catch:{ all -> 0x0060 }
            r5.f12466e = r0     // Catch:{ all -> 0x0060 }
            r6 = r3
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x0060 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0060 }
            r7 = r0
        L_0x0105:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0060 }
            if (r8 == 0) goto L_0x0157
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0060 }
            i0.Z$d r8 = (i0.Z.d) r8     // Catch:{ all -> 0x0060 }
            java.util.List r9 = r8.g()     // Catch:{ all -> 0x0060 }
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ all -> 0x0060 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0060 }
            if (r9 != 0) goto L_0x014a
            java.util.List r9 = r8.g()     // Catch:{ all -> 0x0060 }
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ all -> 0x0060 }
            boolean r10 = r9 instanceof java.util.Collection     // Catch:{ all -> 0x0060 }
            if (r10 == 0) goto L_0x0131
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ all -> 0x0060 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0060 }
            if (r10 == 0) goto L_0x0131
            goto L_0x0148
        L_0x0131:
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0135:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0060 }
            if (r10 == 0) goto L_0x0148
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0060 }
            i0.Z$b r10 = (i0.Z.b) r10     // Catch:{ all -> 0x0060 }
            boolean r10 = r10.b()     // Catch:{ all -> 0x0060 }
            if (r10 != 0) goto L_0x0135
            goto L_0x014a
        L_0x0148:
            r9 = r0
            goto L_0x014b
        L_0x014a:
            r9 = r2
        L_0x014b:
            r5.f12466e = r9     // Catch:{ all -> 0x0060 }
            i0.p r8 = r8.i()     // Catch:{ all -> 0x0060 }
            boolean r8 = r8.f10177p     // Catch:{ all -> 0x0060 }
            if (r8 != 0) goto L_0x0105
            r7 = r2
            goto L_0x0105
        L_0x0157:
            boolean r6 = r5.f12466e     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x0185
            r6 = r3
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x0060 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0060 }
            r8.<init>()     // Catch:{ all -> 0x0060 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0167:
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x0060 }
            if (r9 == 0) goto L_0x017d
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x0060 }
            i0.Z$d r9 = (i0.Z.d) r9     // Catch:{ all -> 0x0060 }
            java.util.List r9 = r9.g()     // Catch:{ all -> 0x0060 }
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ all -> 0x0060 }
            i3.C0743t.p(r8, r9)     // Catch:{ all -> 0x0060 }
            goto L_0x0167
        L_0x017d:
            boolean r6 = r8.isEmpty()     // Catch:{ all -> 0x0060 }
            if (r6 != 0) goto L_0x0185
            r6 = r0
            goto L_0x0186
        L_0x0185:
            r6 = r2
        L_0x0186:
            r5.f12466e = r6     // Catch:{ all -> 0x0060 }
            if (r7 != 0) goto L_0x0191
            r11.z(r3)     // Catch:{ all -> 0x0060 }
            r11.e(r3)     // Catch:{ all -> 0x0060 }
            goto L_0x01a8
        L_0x0191:
            if (r6 == 0) goto L_0x01a8
            r11.z(r3)     // Catch:{ all -> 0x0060 }
            int r5 = r3.size()     // Catch:{ all -> 0x0060 }
            r6 = r2
        L_0x019b:
            if (r6 >= r5) goto L_0x01a8
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0060 }
            i0.Z$d r7 = (i0.Z.d) r7     // Catch:{ all -> 0x0060 }
            r11.c(r7)     // Catch:{ all -> 0x0060 }
            int r6 = r6 + r0
            goto L_0x019b
        L_0x01a8:
            r11.f9994d = r2     // Catch:{ all -> 0x0060 }
            boolean r0 = i0.I.I0(r4)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x01b7
            java.lang.String r0 = "FragmentManager"
            java.lang.String r2 = "SpecialEffectsController: Finished executing pending operations"
            android.util.Log.v(r0, r2)     // Catch:{ all -> 0x0060 }
        L_0x01b7:
            h3.n r0 = h3.C0673n.f9639a     // Catch:{ all -> 0x0060 }
            monitor-exit(r1)
            return
        L_0x01bb:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.Z.n():void");
    }

    public final d o(C0695p pVar) {
        Object obj;
        Iterator it = this.f9992b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (l.a(dVar.i(), pVar) && !dVar.l()) {
                break;
            }
        }
        return (d) obj;
    }

    public final d p(C0695p pVar) {
        Object obj;
        Iterator it = this.f9993c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (l.a(dVar.i(), pVar) && !dVar.l()) {
                break;
            }
        }
        return (d) obj;
    }

    public final void q() {
        String str;
        String str2;
        if (I.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f9991a.isAttachedToWindow();
        synchronized (this.f9992b) {
            try {
                A();
                z(this.f9992b);
                for (d dVar : C0746w.K(this.f9993c)) {
                    if (I.I0(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f9991a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.f9991a);
                }
                for (d dVar2 : C0746w.K(this.f9992b)) {
                    if (I.I0(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f9991a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.f9991a);
                }
                C0673n nVar = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (this.f9995e) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f9995e = false;
            n();
        }
    }

    public final d.a s(O o4) {
        l.e(o4, "fragmentStateManager");
        C0695p k4 = o4.k();
        l.d(k4, "fragmentStateManager.fragment");
        d o5 = o(k4);
        d.a aVar = null;
        d.a j4 = o5 != null ? o5.j() : null;
        d p4 = p(k4);
        if (p4 != null) {
            aVar = p4.j();
        }
        int i4 = j4 == null ? -1 : e.f10023a[j4.ordinal()];
        return (i4 == -1 || i4 == 1) ? aVar : j4;
    }

    public final ViewGroup t() {
        return this.f9991a;
    }

    public final boolean w() {
        return !this.f9992b.isEmpty();
    }

    public final void x() {
        C0695p pVar;
        Object obj;
        synchronized (this.f9992b) {
            try {
                A();
                List list = this.f9992b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    pVar = null;
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    d dVar = (d) obj;
                    d.b.a aVar = d.b.f10015e;
                    View view = dVar.i().f10144L;
                    l.d(view, "operation.fragment.mView");
                    d.b a4 = aVar.a(view);
                    d.b h4 = dVar.h();
                    d.b bVar = d.b.VISIBLE;
                    if (h4 == bVar && a4 != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) obj;
                if (dVar2 != null) {
                    pVar = dVar2.i();
                }
                this.f9995e = pVar != null ? pVar.e0() : false;
                C0673n nVar = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(C0566b bVar) {
        l.e(bVar, "backEvent");
        if (I.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + bVar.a());
        }
        ArrayList arrayList = new ArrayList();
        for (d g4 : this.f9993c) {
            C0743t.p(arrayList, g4.g());
        }
        List I4 = C0746w.I(C0746w.L(arrayList));
        int size = I4.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((b) I4.get(i4)).e(bVar, this.f9991a);
        }
    }

    public final void z(List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) list.get(i4)).q();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0743t.p(arrayList, ((d) it.next()).g());
        }
        List I4 = C0746w.I(C0746w.L(arrayList));
        int size2 = I4.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((b) I4.get(i5)).g(this.f9991a);
        }
    }
}
