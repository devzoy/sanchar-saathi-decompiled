package i0;

import S.C;
import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.I;
import h0.C0651b;
import i0.Z;
import j0.c;

public class O {

    /* renamed from: a  reason: collision with root package name */
    public final C f9914a;

    /* renamed from: b  reason: collision with root package name */
    public final P f9915b;

    /* renamed from: c  reason: collision with root package name */
    public final C0695p f9916c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9917d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f9918e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f9919c;

        public a(View view) {
            this.f9919c = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f9919c.removeOnAttachStateChangeListener(this);
            C.d0(this.f9919c);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9921a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.g$b[] r0 = androidx.lifecycle.C0380g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9921a = r0
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C0380g.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9921a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C0380g.b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9921a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C0380g.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9921a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C0380g.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.O.b.<clinit>():void");
        }
    }

    public O(C c4, P p4, C0695p pVar) {
        this.f9914a = c4;
        this.f9915b = p4;
        this.f9916c = pVar;
    }

    public void a() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f9916c);
        }
        Bundle bundle = this.f9916c.f10163d;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f9916c.Q0(bundle2);
        this.f9914a.a(this.f9916c, bundle2, false);
    }

    public void b() {
        C0695p l02 = I.l0(this.f9916c.f10143K);
        C0695p G4 = this.f9916c.G();
        if (l02 != null && !l02.equals(G4)) {
            C0695p pVar = this.f9916c;
            c.j(pVar, l02, pVar.f10134B);
        }
        int j4 = this.f9915b.j(this.f9916c);
        C0695p pVar2 = this.f9916c;
        pVar2.f10143K.addView(pVar2.f10144L, j4);
    }

    public void c() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f9916c);
        }
        C0695p pVar = this.f9916c;
        C0695p pVar2 = pVar.f10171j;
        O o4 = null;
        if (pVar2 != null) {
            O n4 = this.f9915b.n(pVar2.f10169h);
            if (n4 != null) {
                C0695p pVar3 = this.f9916c;
                pVar3.f10172k = pVar3.f10171j.f10169h;
                pVar3.f10171j = null;
                o4 = n4;
            } else {
                throw new IllegalStateException("Fragment " + this.f9916c + " declared target fragment " + this.f9916c.f10171j + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = pVar.f10172k;
            if (str != null && (o4 = this.f9915b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f9916c + " declared target fragment " + this.f9916c.f10172k + " that does not belong to this FragmentManager!");
            }
        }
        if (o4 != null) {
            o4.m();
        }
        C0695p pVar4 = this.f9916c;
        pVar4.f10185x = pVar4.f10184w.v0();
        C0695p pVar5 = this.f9916c;
        pVar5.f10187z = pVar5.f10184w.y0();
        this.f9914a.g(this.f9916c, false);
        this.f9916c.R0();
        this.f9914a.b(this.f9916c, false);
    }

    public int d() {
        C0695p pVar = this.f9916c;
        if (pVar.f10184w == null) {
            return pVar.f10161c;
        }
        int i4 = this.f9918e;
        int i5 = b.f9921a[pVar.f10154V.ordinal()];
        if (i5 != 1) {
            i4 = i5 != 2 ? i5 != 3 ? i5 != 4 ? Math.min(i4, -1) : Math.min(i4, 0) : Math.min(i4, 1) : Math.min(i4, 5);
        }
        C0695p pVar2 = this.f9916c;
        if (pVar2.f10179r) {
            if (pVar2.f10180s) {
                i4 = Math.max(this.f9918e, 2);
                View view = this.f9916c.f10144L;
                if (view != null && view.getParent() == null) {
                    i4 = Math.min(i4, 2);
                }
            } else {
                i4 = this.f9918e < 4 ? Math.min(i4, pVar2.f10161c) : Math.min(i4, 1);
            }
        }
        if (!this.f9916c.f10175n) {
            i4 = Math.min(i4, 1);
        }
        C0695p pVar3 = this.f9916c;
        ViewGroup viewGroup = pVar3.f10143K;
        Z.d.a s4 = viewGroup != null ? Z.u(viewGroup, pVar3.H()).s(this) : null;
        if (s4 == Z.d.a.ADDING) {
            i4 = Math.min(i4, 6);
        } else if (s4 == Z.d.a.REMOVING) {
            i4 = Math.max(i4, 3);
        } else {
            C0695p pVar4 = this.f9916c;
            if (pVar4.f10176o) {
                i4 = pVar4.c0() ? Math.min(i4, 1) : Math.min(i4, -1);
            }
        }
        C0695p pVar5 = this.f9916c;
        if (pVar5.f10145M && pVar5.f10161c < 5) {
            i4 = Math.min(i4, 4);
        }
        C0695p pVar6 = this.f9916c;
        if (pVar6.f10177p && pVar6.f10143K != null) {
            i4 = Math.max(i4, 3);
        }
        if (I.I0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i4 + " for " + this.f9916c);
        }
        return i4;
    }

    public void e() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f9916c);
        }
        Bundle bundle = this.f9916c.f10163d;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        C0695p pVar = this.f9916c;
        if (!pVar.f10152T) {
            this.f9914a.h(pVar, bundle2, false);
            this.f9916c.U0(bundle2);
            this.f9914a.c(this.f9916c, bundle2, false);
            return;
        }
        pVar.f10161c = 1;
        pVar.s1();
    }

    public void f() {
        String str;
        if (!this.f9916c.f10179r) {
            if (I.I0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f9916c);
            }
            Bundle bundle = this.f9916c.f10163d;
            ViewGroup viewGroup = null;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater a12 = this.f9916c.a1(bundle2);
            C0695p pVar = this.f9916c;
            ViewGroup viewGroup2 = pVar.f10143K;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i4 = pVar.f10134B;
                if (i4 != 0) {
                    if (i4 != -1) {
                        viewGroup = (ViewGroup) pVar.f10184w.r0().i(this.f9916c.f10134B);
                        if (viewGroup == null) {
                            C0695p pVar2 = this.f9916c;
                            if (!pVar2.f10181t) {
                                try {
                                    str = pVar2.N().getResourceName(this.f9916c.f10134B);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f9916c.f10134B) + " (" + str + ") for fragment " + this.f9916c);
                            }
                        } else if (!(viewGroup instanceof C0702x)) {
                            c.i(this.f9916c, viewGroup);
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f9916c + " for a container view with no id");
                    }
                }
            }
            C0695p pVar3 = this.f9916c;
            pVar3.f10143K = viewGroup;
            pVar3.W0(a12, viewGroup, bundle2);
            if (this.f9916c.f10144L != null) {
                if (I.I0(3)) {
                    Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f9916c);
                }
                this.f9916c.f10144L.setSaveFromParentEnabled(false);
                C0695p pVar4 = this.f9916c;
                pVar4.f10144L.setTag(C0651b.f9586a, pVar4);
                if (viewGroup != null) {
                    b();
                }
                C0695p pVar5 = this.f9916c;
                if (pVar5.f10136D) {
                    pVar5.f10144L.setVisibility(8);
                }
                if (this.f9916c.f10144L.isAttachedToWindow()) {
                    C.d0(this.f9916c.f10144L);
                } else {
                    View view = this.f9916c.f10144L;
                    view.addOnAttachStateChangeListener(new a(view));
                }
                this.f9916c.n1();
                C c4 = this.f9914a;
                C0695p pVar6 = this.f9916c;
                c4.m(pVar6, pVar6.f10144L, bundle2, false);
                int visibility = this.f9916c.f10144L.getVisibility();
                this.f9916c.A1(this.f9916c.f10144L.getAlpha());
                C0695p pVar7 = this.f9916c;
                if (pVar7.f10143K != null && visibility == 0) {
                    View findFocus = pVar7.f10144L.findFocus();
                    if (findFocus != null) {
                        this.f9916c.x1(findFocus);
                        if (I.I0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f9916c);
                        }
                    }
                    this.f9916c.f10144L.setAlpha(0.0f);
                }
            }
            this.f9916c.f10161c = 2;
        }
    }

    public void g() {
        C0695p f4;
        if (I.I0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f9916c);
        }
        C0695p pVar = this.f9916c;
        boolean z4 = true;
        boolean z5 = pVar.f10176o && !pVar.c0();
        if (z5) {
            C0695p pVar2 = this.f9916c;
            if (!pVar2.f10178q) {
                this.f9915b.B(pVar2.f10169h, (Bundle) null);
            }
        }
        if (z5 || this.f9915b.p().o(this.f9916c)) {
            C0679A a4 = this.f9916c.f10185x;
            if (a4 instanceof I) {
                z4 = this.f9915b.p().l();
            } else if (a4.o() instanceof Activity) {
                z4 = true ^ ((Activity) a4.o()).isChangingConfigurations();
            }
            if ((z5 && !this.f9916c.f10178q) || z4) {
                this.f9915b.p().d(this.f9916c, false);
            }
            this.f9916c.X0();
            this.f9914a.d(this.f9916c, false);
            for (O o4 : this.f9915b.k()) {
                if (o4 != null) {
                    C0695p k4 = o4.k();
                    if (this.f9916c.f10169h.equals(k4.f10172k)) {
                        k4.f10171j = this.f9916c;
                        k4.f10172k = null;
                    }
                }
            }
            C0695p pVar3 = this.f9916c;
            String str = pVar3.f10172k;
            if (str != null) {
                pVar3.f10171j = this.f9915b.f(str);
            }
            this.f9915b.s(this);
            return;
        }
        String str2 = this.f9916c.f10172k;
        if (!(str2 == null || (f4 = this.f9915b.f(str2)) == null || !f4.f10138F)) {
            this.f9916c.f10171j = f4;
        }
        this.f9916c.f10161c = 0;
    }

    public void h() {
        View view;
        if (I.I0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f9916c);
        }
        C0695p pVar = this.f9916c;
        ViewGroup viewGroup = pVar.f10143K;
        if (!(viewGroup == null || (view = pVar.f10144L) == null)) {
            viewGroup.removeView(view);
        }
        this.f9916c.Y0();
        this.f9914a.n(this.f9916c, false);
        C0695p pVar2 = this.f9916c;
        pVar2.f10143K = null;
        pVar2.f10144L = null;
        pVar2.f10156X = null;
        pVar2.f10157Y.j((Object) null);
        this.f9916c.f10180s = false;
    }

    public void i() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f9916c);
        }
        this.f9916c.Z0();
        this.f9914a.e(this.f9916c, false);
        C0695p pVar = this.f9916c;
        pVar.f10161c = -1;
        pVar.f10185x = null;
        pVar.f10187z = null;
        pVar.f10184w = null;
        if ((pVar.f10176o && !pVar.c0()) || this.f9915b.p().o(this.f9916c)) {
            if (I.I0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f9916c);
            }
            this.f9916c.Y();
        }
    }

    public void j() {
        C0695p pVar = this.f9916c;
        if (pVar.f10179r && pVar.f10180s && !pVar.f10182u) {
            if (I.I0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f9916c);
            }
            Bundle bundle = this.f9916c.f10163d;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            C0695p pVar2 = this.f9916c;
            pVar2.W0(pVar2.a1(bundle2), (ViewGroup) null, bundle2);
            View view = this.f9916c.f10144L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                C0695p pVar3 = this.f9916c;
                pVar3.f10144L.setTag(C0651b.f9586a, pVar3);
                C0695p pVar4 = this.f9916c;
                if (pVar4.f10136D) {
                    pVar4.f10144L.setVisibility(8);
                }
                this.f9916c.n1();
                C c4 = this.f9914a;
                C0695p pVar5 = this.f9916c;
                c4.m(pVar5, pVar5.f10144L, bundle2, false);
                this.f9916c.f10161c = 2;
            }
        }
    }

    public C0695p k() {
        return this.f9916c;
    }

    public final boolean l(View view) {
        if (view == this.f9916c.f10144L) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f9916c.f10144L) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f9917d) {
            try {
                this.f9917d = true;
                boolean z4 = false;
                while (true) {
                    int d4 = d();
                    C0695p pVar = this.f9916c;
                    int i4 = pVar.f10161c;
                    if (d4 != i4) {
                        if (d4 <= i4) {
                            switch (i4 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    if (pVar.f10178q && this.f9915b.q(pVar.f10169h) == null) {
                                        this.f9915b.B(this.f9916c.f10169h, q());
                                    }
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f9916c.f10161c = 1;
                                    break;
                                case 2:
                                    pVar.f10180s = false;
                                    pVar.f10161c = 2;
                                    break;
                                case 3:
                                    if (I.I0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f9916c);
                                    }
                                    C0695p pVar2 = this.f9916c;
                                    if (pVar2.f10178q) {
                                        this.f9915b.B(pVar2.f10169h, q());
                                    } else if (pVar2.f10144L != null && pVar2.f10165e == null) {
                                        r();
                                    }
                                    C0695p pVar3 = this.f9916c;
                                    if (!(pVar3.f10144L == null || (viewGroup2 = pVar3.f10143K) == null)) {
                                        Z.u(viewGroup2, pVar3.H()).l(this);
                                    }
                                    this.f9916c.f10161c = 3;
                                    break;
                                case 4:
                                    u();
                                    break;
                                case 5:
                                    pVar.f10161c = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            switch (i4 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(pVar.f10144L == null || (viewGroup3 = pVar.f10143K) == null)) {
                                        Z.u(viewGroup3, pVar.H()).j(Z.d.b.k(this.f9916c.f10144L.getVisibility()), this);
                                    }
                                    this.f9916c.f10161c = 4;
                                    break;
                                case 5:
                                    t();
                                    break;
                                case 6:
                                    pVar.f10161c = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                        z4 = true;
                    } else {
                        if (!z4 && i4 == -1 && pVar.f10176o && !pVar.c0() && !this.f9916c.f10178q) {
                            if (I.I0(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f9916c);
                            }
                            this.f9915b.p().d(this.f9916c, true);
                            this.f9915b.s(this);
                            if (I.I0(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f9916c);
                            }
                            this.f9916c.Y();
                        }
                        C0695p pVar4 = this.f9916c;
                        if (pVar4.f10150R) {
                            if (!(pVar4.f10144L == null || (viewGroup = pVar4.f10143K) == null)) {
                                Z u4 = Z.u(viewGroup, pVar4.H());
                                if (this.f9916c.f10136D) {
                                    u4.k(this);
                                } else {
                                    u4.m(this);
                                }
                            }
                            C0695p pVar5 = this.f9916c;
                            I i5 = pVar5.f10184w;
                            if (i5 != null) {
                                i5.G0(pVar5);
                            }
                            C0695p pVar6 = this.f9916c;
                            pVar6.f10150R = false;
                            pVar6.z0(pVar6.f10136D);
                            this.f9916c.f10186y.I();
                        }
                        this.f9917d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f9917d = false;
                throw th;
            }
        } else if (I.I0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
        }
    }

    public void n() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f9916c);
        }
        this.f9916c.f1();
        this.f9914a.f(this.f9916c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f9916c.f10163d;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (this.f9916c.f10163d.getBundle("savedInstanceState") == null) {
                this.f9916c.f10163d.putBundle("savedInstanceState", new Bundle());
            }
            try {
                C0695p pVar = this.f9916c;
                pVar.f10165e = pVar.f10163d.getSparseParcelableArray("viewState");
                C0695p pVar2 = this.f9916c;
                pVar2.f10167f = pVar2.f10163d.getBundle("viewRegistryState");
                N n4 = (N) this.f9916c.f10163d.getParcelable("state");
                if (n4 != null) {
                    C0695p pVar3 = this.f9916c;
                    pVar3.f10172k = n4.f9911p;
                    pVar3.f10173l = n4.f9912q;
                    Boolean bool = pVar3.f10168g;
                    if (bool != null) {
                        pVar3.f10146N = bool.booleanValue();
                        this.f9916c.f10168g = null;
                    } else {
                        pVar3.f10146N = n4.f9913r;
                    }
                }
                C0695p pVar4 = this.f9916c;
                if (!pVar4.f10146N) {
                    pVar4.f10145M = true;
                }
            } catch (BadParcelableException e4) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e4);
            }
        }
    }

    public void p() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f9916c);
        }
        View B4 = this.f9916c.B();
        if (B4 != null && l(B4)) {
            boolean requestFocus = B4.requestFocus();
            if (I.I0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(B4);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f9916c);
                sb.append(" resulting in focused view ");
                sb.append(this.f9916c.f10144L.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f9916c.x1((View) null);
        this.f9916c.j1();
        this.f9914a.i(this.f9916c, false);
        this.f9915b.B(this.f9916c.f10169h, (Bundle) null);
        C0695p pVar = this.f9916c;
        pVar.f10163d = null;
        pVar.f10165e = null;
        pVar.f10167f = null;
    }

    public Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        C0695p pVar = this.f9916c;
        if (pVar.f10161c == -1 && (bundle = pVar.f10163d) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new N(this.f9916c));
        if (this.f9916c.f10161c > -1) {
            Bundle bundle3 = new Bundle();
            this.f9916c.k1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f9914a.j(this.f9916c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f9916c.f10159a0.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle m12 = this.f9916c.f10186y.Q0();
            if (!m12.isEmpty()) {
                bundle2.putBundle("childFragmentManager", m12);
            }
            if (this.f9916c.f10144L != null) {
                r();
            }
            SparseArray sparseArray = this.f9916c.f10165e;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f9916c.f10167f;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f9916c.f10170i;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void r() {
        if (this.f9916c.f10144L != null) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + this.f9916c + " with view " + this.f9916c.f10144L);
            }
            SparseArray sparseArray = new SparseArray();
            this.f9916c.f10144L.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f9916c.f10165e = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f9916c.f10156X.f(bundle);
            if (!bundle.isEmpty()) {
                this.f9916c.f10167f = bundle;
            }
        }
    }

    public void s(int i4) {
        this.f9918e = i4;
    }

    public void t() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f9916c);
        }
        this.f9916c.l1();
        this.f9914a.k(this.f9916c, false);
    }

    public void u() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f9916c);
        }
        this.f9916c.m1();
        this.f9914a.l(this.f9916c, false);
    }

    public O(C c4, P p4, ClassLoader classLoader, C0704z zVar, Bundle bundle) {
        this.f9914a = c4;
        this.f9915b = p4;
        C0695p a4 = ((N) bundle.getParcelable("state")).a(zVar, classLoader);
        this.f9916c = a4;
        a4.f10163d = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a4.w1(bundle2);
        if (I.I0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a4);
        }
    }

    public O(C c4, P p4, C0695p pVar, Bundle bundle) {
        this.f9914a = c4;
        this.f9915b = p4;
        this.f9916c = pVar;
        pVar.f10165e = null;
        pVar.f10167f = null;
        pVar.f10183v = 0;
        pVar.f10180s = false;
        pVar.f10175n = false;
        C0695p pVar2 = pVar.f10171j;
        pVar.f10172k = pVar2 != null ? pVar2.f10169h : null;
        pVar.f10171j = null;
        pVar.f10163d = bundle;
        pVar.f10170i = bundle.getBundle("arguments");
    }
}
