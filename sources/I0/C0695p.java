package i0;

import G.t;
import S.C0319j;
import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.A;
import androidx.lifecycle.C0379f;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.C0382i;
import androidx.lifecycle.C0384k;
import androidx.lifecycle.G;
import androidx.lifecycle.H;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import m0.C0785a;
import m0.C0786b;
import o0.C0814a;
import x0.C0998d;
import x0.C0999e;
import x0.C1000f;
import x0.C1001g;

/* renamed from: i0.p  reason: case insensitive filesystem */
public abstract class C0695p implements ComponentCallbacks, View.OnCreateContextMenuListener, C0384k, I, C0379f, C1000f {

    /* renamed from: f0  reason: collision with root package name */
    public static final Object f10132f0 = new Object();

    /* renamed from: A  reason: collision with root package name */
    public int f10133A;

    /* renamed from: B  reason: collision with root package name */
    public int f10134B;

    /* renamed from: C  reason: collision with root package name */
    public String f10135C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f10136D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f10137E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f10138F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f10139G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f10140H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f10141I = true;

    /* renamed from: J  reason: collision with root package name */
    public boolean f10142J;

    /* renamed from: K  reason: collision with root package name */
    public ViewGroup f10143K;

    /* renamed from: L  reason: collision with root package name */
    public View f10144L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f10145M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f10146N = true;

    /* renamed from: O  reason: collision with root package name */
    public g f10147O;

    /* renamed from: P  reason: collision with root package name */
    public Handler f10148P;

    /* renamed from: Q  reason: collision with root package name */
    public Runnable f10149Q = new a();

    /* renamed from: R  reason: collision with root package name */
    public boolean f10150R;

    /* renamed from: S  reason: collision with root package name */
    public LayoutInflater f10151S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f10152T;

    /* renamed from: U  reason: collision with root package name */
    public String f10153U;

    /* renamed from: V  reason: collision with root package name */
    public C0380g.b f10154V = C0380g.b.RESUMED;

    /* renamed from: W  reason: collision with root package name */
    public l f10155W;

    /* renamed from: X  reason: collision with root package name */
    public V f10156X;

    /* renamed from: Y  reason: collision with root package name */
    public r f10157Y = new r();

    /* renamed from: Z  reason: collision with root package name */
    public G.c f10158Z;

    /* renamed from: a0  reason: collision with root package name */
    public C0999e f10159a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f10160b0;

    /* renamed from: c  reason: collision with root package name */
    public int f10161c = -1;

    /* renamed from: c0  reason: collision with root package name */
    public final AtomicInteger f10162c0 = new AtomicInteger();

    /* renamed from: d  reason: collision with root package name */
    public Bundle f10163d;

    /* renamed from: d0  reason: collision with root package name */
    public final ArrayList f10164d0 = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public SparseArray f10165e;

    /* renamed from: e0  reason: collision with root package name */
    public final i f10166e0 = new b();

    /* renamed from: f  reason: collision with root package name */
    public Bundle f10167f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f10168g;

    /* renamed from: h  reason: collision with root package name */
    public String f10169h = UUID.randomUUID().toString();

    /* renamed from: i  reason: collision with root package name */
    public Bundle f10170i;

    /* renamed from: j  reason: collision with root package name */
    public C0695p f10171j;

    /* renamed from: k  reason: collision with root package name */
    public String f10172k = null;

    /* renamed from: l  reason: collision with root package name */
    public int f10173l;

    /* renamed from: m  reason: collision with root package name */
    public Boolean f10174m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10175n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10176o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10177p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10178q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10179r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10180s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10181t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10182u;

    /* renamed from: v  reason: collision with root package name */
    public int f10183v;

    /* renamed from: w  reason: collision with root package name */
    public I f10184w;

    /* renamed from: x  reason: collision with root package name */
    public C0679A f10185x;

    /* renamed from: y  reason: collision with root package name */
    public I f10186y = new J();

    /* renamed from: z  reason: collision with root package name */
    public C0695p f10187z;

    /* renamed from: i0.p$a */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            C0695p.this.D1();
        }
    }

    /* renamed from: i0.p$b */
    public class b extends i {
        public b() {
            super((a) null);
        }

        public void a() {
            C0695p.this.f10159a0.c();
            A.a(C0695p.this);
            Bundle bundle = C0695p.this.f10163d;
            C0695p.this.f10159a0.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* renamed from: i0.p$c */
    public class c implements Runnable {
        public c() {
        }

        public void run() {
            C0695p.this.f(false);
        }
    }

    /* renamed from: i0.p$d */
    public class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Z f10191e;

        public d(Z z4) {
            this.f10191e = z4;
        }

        public void run() {
            if (this.f10191e.w()) {
                this.f10191e.n();
            }
        }
    }

    /* renamed from: i0.p$e */
    public class e extends C0701w {
        public e() {
        }

        public View i(int i4) {
            View view = C0695p.this.f10144L;
            if (view != null) {
                return view.findViewById(i4);
            }
            throw new IllegalStateException("Fragment " + C0695p.this + " does not have a view");
        }

        public boolean j() {
            return C0695p.this.f10144L != null;
        }
    }

    /* renamed from: i0.p$f */
    public class f implements C0382i {
        public f() {
        }

        public void d(C0384k kVar, C0380g.a aVar) {
            View view;
            if (aVar == C0380g.a.ON_STOP && (view = C0695p.this.f10144L) != null) {
                view.cancelPendingInputEvents();
            }
        }
    }

    /* renamed from: i0.p$g */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public View f10195a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10196b;

        /* renamed from: c  reason: collision with root package name */
        public int f10197c;

        /* renamed from: d  reason: collision with root package name */
        public int f10198d;

        /* renamed from: e  reason: collision with root package name */
        public int f10199e;

        /* renamed from: f  reason: collision with root package name */
        public int f10200f;

        /* renamed from: g  reason: collision with root package name */
        public int f10201g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList f10202h;

        /* renamed from: i  reason: collision with root package name */
        public ArrayList f10203i;

        /* renamed from: j  reason: collision with root package name */
        public Object f10204j = null;

        /* renamed from: k  reason: collision with root package name */
        public Object f10205k;

        /* renamed from: l  reason: collision with root package name */
        public Object f10206l;

        /* renamed from: m  reason: collision with root package name */
        public Object f10207m;

        /* renamed from: n  reason: collision with root package name */
        public Object f10208n;

        /* renamed from: o  reason: collision with root package name */
        public Object f10209o;

        /* renamed from: p  reason: collision with root package name */
        public Boolean f10210p;

        /* renamed from: q  reason: collision with root package name */
        public Boolean f10211q;

        /* renamed from: r  reason: collision with root package name */
        public float f10212r;

        /* renamed from: s  reason: collision with root package name */
        public View f10213s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f10214t;

        public g() {
            Object obj = C0695p.f10132f0;
            this.f10205k = obj;
            this.f10206l = null;
            this.f10207m = obj;
            this.f10208n = null;
            this.f10209o = obj;
            this.f10212r = 1.0f;
            this.f10213s = null;
        }
    }

    /* renamed from: i0.p$h */
    public static class h extends RuntimeException {
        public h(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: i0.p$i */
    public static abstract class i {
        public i() {
        }

        public abstract void a();

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    public C0695p() {
        X();
    }

    public static C0695p Z(Context context, String str, Bundle bundle) {
        try {
            C0695p pVar = (C0695p) C0704z.d(context.getClassLoader(), str).getConstructor((Class[]) null).newInstance((Object[]) null);
            if (bundle != null) {
                bundle.setClassLoader(pVar.getClass().getClassLoader());
                pVar.w1(bundle);
            }
            return pVar;
        } catch (InstantiationException e4) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (IllegalAccessException e5) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (NoSuchMethodException e6) {
            throw new h("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e6);
        } catch (InvocationTargetException e7) {
            throw new h("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e7);
        }
    }

    public t A() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public void A0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f10142J = true;
    }

    public void A1(float f4) {
        i().f10212r = f4;
    }

    public View B() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return null;
        }
        return gVar.f10213s;
    }

    public void B0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f10142J = true;
        C0679A a4 = this.f10185x;
        Activity n4 = a4 == null ? null : a4.n();
        if (n4 != null) {
            this.f10142J = false;
            A0(n4, attributeSet, bundle);
        }
    }

    public void B1(ArrayList arrayList, ArrayList arrayList2) {
        i();
        g gVar = this.f10147O;
        gVar.f10202h = arrayList;
        gVar.f10203i = arrayList2;
    }

    public final Object C() {
        C0679A a4 = this.f10185x;
        if (a4 == null) {
            return null;
        }
        return a4.y();
    }

    public void C0(boolean z4) {
    }

    public void C1(Intent intent, int i4, Bundle bundle) {
        if (this.f10185x != null) {
            H().V0(this, intent, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public LayoutInflater D(Bundle bundle) {
        C0679A a4 = this.f10185x;
        if (a4 != null) {
            LayoutInflater z4 = a4.z();
            C0319j.a(z4, this.f10186y.w0());
            return z4;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public boolean D0(MenuItem menuItem) {
        return false;
    }

    public void D1() {
        if (this.f10147O != null && i().f10214t) {
            if (this.f10185x == null) {
                i().f10214t = false;
            } else if (Looper.myLooper() != this.f10185x.v().getLooper()) {
                this.f10185x.v().postAtFrontOfQueue(new c());
            } else {
                f(true);
            }
        }
    }

    public final int E() {
        C0380g.b bVar = this.f10154V;
        return (bVar == C0380g.b.INITIALIZED || this.f10187z == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f10187z.E());
    }

    public void E0(Menu menu) {
    }

    public int F() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return 0;
        }
        return gVar.f10201g;
    }

    public void F0() {
        this.f10142J = true;
    }

    public final C0695p G() {
        return this.f10187z;
    }

    public void G0(boolean z4) {
    }

    public final I H() {
        I i4 = this.f10184w;
        if (i4 != null) {
            return i4;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void H0(Menu menu) {
    }

    public boolean I() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return false;
        }
        return gVar.f10196b;
    }

    public void I0(boolean z4) {
    }

    public int J() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return 0;
        }
        return gVar.f10199e;
    }

    public void J0(int i4, String[] strArr, int[] iArr) {
    }

    public int K() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return 0;
        }
        return gVar.f10200f;
    }

    public void K0() {
        this.f10142J = true;
    }

    public float L() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f10212r;
    }

    public void L0(Bundle bundle) {
    }

    public Object M() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f10207m;
        return obj == f10132f0 ? z() : obj;
    }

    public void M0() {
        this.f10142J = true;
    }

    public final Resources N() {
        return q1().getResources();
    }

    public void N0() {
        this.f10142J = true;
    }

    public Object O() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f10205k;
        return obj == f10132f0 ? w() : obj;
    }

    public void O0(View view, Bundle bundle) {
    }

    public Object P() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return null;
        }
        return gVar.f10208n;
    }

    public void P0(Bundle bundle) {
        this.f10142J = true;
    }

    public Object Q() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f10209o;
        return obj == f10132f0 ? P() : obj;
    }

    public void Q0(Bundle bundle) {
        this.f10186y.X0();
        this.f10161c = 3;
        this.f10142J = false;
        j0(bundle);
        if (this.f10142J) {
            t1();
            this.f10186y.x();
            return;
        }
        throw new b0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f10202h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList R() {
        /*
            r1 = this;
            i0.p$g r0 = r1.f10147O
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList r0 = r0.f10202h
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C0695p.R():java.util.ArrayList");
    }

    public void R0() {
        Iterator it = this.f10164d0.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
        this.f10164d0.clear();
        this.f10186y.l(this.f10185x, g(), this);
        this.f10161c = 0;
        this.f10142J = false;
        m0(this.f10185x.o());
        if (this.f10142J) {
            this.f10184w.H(this);
            this.f10186y.y();
            return;
        }
        throw new b0("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f10203i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList S() {
        /*
            r1 = this;
            i0.p$g r0 = r1.f10147O
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList r0 = r0.f10203i
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C0695p.S():java.util.ArrayList");
    }

    public void S0(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public final String T(int i4) {
        return N().getString(i4);
    }

    public boolean T0(MenuItem menuItem) {
        if (this.f10136D) {
            return false;
        }
        if (o0(menuItem)) {
            return true;
        }
        return this.f10186y.A(menuItem);
    }

    public final C0695p U(boolean z4) {
        String str;
        if (z4) {
            j0.c.h(this);
        }
        C0695p pVar = this.f10171j;
        if (pVar != null) {
            return pVar;
        }
        I i4 = this.f10184w;
        if (i4 == null || (str = this.f10172k) == null) {
            return null;
        }
        return i4.f0(str);
    }

    public void U0(Bundle bundle) {
        this.f10186y.X0();
        this.f10161c = 1;
        this.f10142J = false;
        this.f10155W.a(new f());
        p0(bundle);
        this.f10152T = true;
        if (this.f10142J) {
            this.f10155W.h(C0380g.a.ON_CREATE);
            return;
        }
        throw new b0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public View V() {
        return this.f10144L;
    }

    public boolean V0(Menu menu, MenuInflater menuInflater) {
        boolean z4 = false;
        if (this.f10136D) {
            return false;
        }
        if (this.f10140H && this.f10141I) {
            s0(menu, menuInflater);
            z4 = true;
        }
        return z4 | this.f10186y.C(menu, menuInflater);
    }

    public p W() {
        return this.f10157Y;
    }

    public void W0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f10186y.X0();
        this.f10182u = true;
        this.f10156X = new V(this, t(), new C0694o(this));
        View t02 = t0(layoutInflater, viewGroup, bundle);
        this.f10144L = t02;
        if (t02 != null) {
            this.f10156X.c();
            if (I.I0(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f10144L + " for Fragment " + this);
            }
            J.a(this.f10144L, this.f10156X);
            K.a(this.f10144L, this.f10156X);
            C1001g.a(this.f10144L, this.f10156X);
            this.f10157Y.j(this.f10156X);
        } else if (!this.f10156X.d()) {
            this.f10156X = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final void X() {
        this.f10155W = new l(this);
        this.f10159a0 = C0999e.a(this);
        this.f10158Z = null;
        if (!this.f10164d0.contains(this.f10166e0)) {
            o1(this.f10166e0);
        }
    }

    public void X0() {
        this.f10186y.D();
        this.f10155W.h(C0380g.a.ON_DESTROY);
        this.f10161c = 0;
        this.f10142J = false;
        this.f10152T = false;
        u0();
        if (!this.f10142J) {
            throw new b0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void Y() {
        X();
        this.f10153U = this.f10169h;
        this.f10169h = UUID.randomUUID().toString();
        this.f10175n = false;
        this.f10176o = false;
        this.f10179r = false;
        this.f10180s = false;
        this.f10181t = false;
        this.f10183v = 0;
        this.f10184w = null;
        this.f10186y = new J();
        this.f10185x = null;
        this.f10133A = 0;
        this.f10134B = 0;
        this.f10135C = null;
        this.f10136D = false;
        this.f10137E = false;
    }

    public void Y0() {
        this.f10186y.E();
        if (this.f10144L != null && this.f10156X.b().b().f(C0380g.b.CREATED)) {
            this.f10156X.a(C0380g.a.ON_DESTROY);
        }
        this.f10161c = 1;
        this.f10142J = false;
        w0();
        if (this.f10142J) {
            C0814a.b(this).c();
            this.f10182u = false;
            return;
        }
        throw new b0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void Z0() {
        this.f10161c = -1;
        this.f10142J = false;
        x0();
        this.f10151S = null;
        if (!this.f10142J) {
            throw new b0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f10186y.H0()) {
            this.f10186y.D();
            this.f10186y = new J();
        }
    }

    public final boolean a0() {
        return this.f10185x != null && this.f10175n;
    }

    public LayoutInflater a1(Bundle bundle) {
        LayoutInflater y02 = y0(bundle);
        this.f10151S = y02;
        return y02;
    }

    public C0380g b() {
        return this.f10155W;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f10184w;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b0() {
        /*
            r2 = this;
            boolean r0 = r2.f10136D
            if (r0 != 0) goto L_0x0013
            i0.I r0 = r2.f10184w
            if (r0 == 0) goto L_0x0011
            i0.p r1 = r2.f10187z
            boolean r0 = r0.L0(r1)
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C0695p.b0():boolean");
    }

    public void b1() {
        onLowMemory();
    }

    public final boolean c0() {
        return this.f10183v > 0;
    }

    public void c1(boolean z4) {
        C0(z4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f10184w;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d0() {
        /*
            r2 = this;
            boolean r0 = r2.f10141I
            if (r0 == 0) goto L_0x0012
            i0.I r0 = r2.f10184w
            if (r0 == 0) goto L_0x0010
            i0.p r1 = r2.f10187z
            boolean r0 = r0.M0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C0695p.d0():boolean");
    }

    public boolean d1(MenuItem menuItem) {
        if (this.f10136D) {
            return false;
        }
        if (!this.f10140H || !this.f10141I || !D0(menuItem)) {
            return this.f10186y.J(menuItem);
        }
        return true;
    }

    public boolean e0() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return false;
        }
        return gVar.f10214t;
    }

    public void e1(Menu menu) {
        if (!this.f10136D) {
            if (this.f10140H && this.f10141I) {
                E0(menu);
            }
            this.f10186y.K(menu);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(boolean z4) {
        ViewGroup viewGroup;
        I i4;
        g gVar = this.f10147O;
        if (gVar != null) {
            gVar.f10214t = false;
        }
        if (this.f10144L != null && (viewGroup = this.f10143K) != null && (i4 = this.f10184w) != null) {
            Z u4 = Z.u(viewGroup, i4);
            u4.x();
            if (z4) {
                this.f10185x.v().post(new d(u4));
            } else {
                u4.n();
            }
            Handler handler = this.f10148P;
            if (handler != null) {
                handler.removeCallbacks(this.f10149Q);
                this.f10148P = null;
            }
        }
    }

    public final boolean f0() {
        return this.f10176o;
    }

    public void f1() {
        this.f10186y.M();
        if (this.f10144L != null) {
            this.f10156X.a(C0380g.a.ON_PAUSE);
        }
        this.f10155W.h(C0380g.a.ON_PAUSE);
        this.f10161c = 6;
        this.f10142J = false;
        F0();
        if (!this.f10142J) {
            throw new b0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public C0701w g() {
        return new e();
    }

    public final boolean g0() {
        I i4 = this.f10184w;
        if (i4 == null) {
            return false;
        }
        return i4.P0();
    }

    public void g1(boolean z4) {
        G0(z4);
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f10133A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f10134B));
        printWriter.print(" mTag=");
        printWriter.println(this.f10135C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f10161c);
        printWriter.print(" mWho=");
        printWriter.print(this.f10169h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f10183v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f10175n);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f10176o);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f10179r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f10180s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f10136D);
        printWriter.print(" mDetached=");
        printWriter.print(this.f10137E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f10141I);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f10140H);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f10138F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f10146N);
        if (this.f10184w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f10184w);
        }
        if (this.f10185x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f10185x);
        }
        if (this.f10187z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f10187z);
        }
        if (this.f10170i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f10170i);
        }
        if (this.f10163d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f10163d);
        }
        if (this.f10165e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f10165e);
        }
        if (this.f10167f != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f10167f);
        }
        C0695p U3 = U(false);
        if (U3 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(U3);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f10173l);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(I());
        if (v() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(v());
        }
        if (y() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(y());
        }
        if (J() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(J());
        }
        if (K() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(K());
        }
        if (this.f10143K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f10143K);
        }
        if (this.f10144L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f10144L);
        }
        if (q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(q());
        }
        if (u() != null) {
            C0814a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f10186y + ":");
        I i4 = this.f10186y;
        i4.W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final /* synthetic */ void h0() {
        this.f10156X.e(this.f10167f);
        this.f10167f = null;
    }

    public boolean h1(Menu menu) {
        boolean z4 = false;
        if (this.f10136D) {
            return false;
        }
        if (this.f10140H && this.f10141I) {
            H0(menu);
            z4 = true;
        }
        return z4 | this.f10186y.O(menu);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final g i() {
        if (this.f10147O == null) {
            this.f10147O = new g();
        }
        return this.f10147O;
    }

    public void i0() {
        this.f10186y.X0();
    }

    public void i1() {
        boolean N02 = this.f10184w.N0(this);
        Boolean bool = this.f10174m;
        if (bool == null || bool.booleanValue() != N02) {
            this.f10174m = Boolean.valueOf(N02);
            I0(N02);
            this.f10186y.P();
        }
    }

    public C0695p j(String str) {
        return str.equals(this.f10169h) ? this : this.f10186y.j0(str);
    }

    public void j0(Bundle bundle) {
        this.f10142J = true;
    }

    public void j1() {
        this.f10186y.X0();
        this.f10186y.a0(true);
        this.f10161c = 7;
        this.f10142J = false;
        K0();
        if (this.f10142J) {
            l lVar = this.f10155W;
            C0380g.a aVar = C0380g.a.ON_RESUME;
            lVar.h(aVar);
            if (this.f10144L != null) {
                this.f10156X.a(aVar);
            }
            this.f10186y.Q();
            return;
        }
        throw new b0("Fragment " + this + " did not call through to super.onResume()");
    }

    public void k0(int i4, int i5, Intent intent) {
        if (I.I0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i4 + " resultCode: " + i5 + " data: " + intent);
        }
    }

    public void k1(Bundle bundle) {
        L0(bundle);
    }

    public final C0998d l() {
        return this.f10159a0.b();
    }

    public void l0(Activity activity) {
        this.f10142J = true;
    }

    public void l1() {
        this.f10186y.X0();
        this.f10186y.a0(true);
        this.f10161c = 5;
        this.f10142J = false;
        M0();
        if (this.f10142J) {
            l lVar = this.f10155W;
            C0380g.a aVar = C0380g.a.ON_START;
            lVar.h(aVar);
            if (this.f10144L != null) {
                this.f10156X.a(aVar);
            }
            this.f10186y.R();
            return;
        }
        throw new b0("Fragment " + this + " did not call through to super.onStart()");
    }

    public final C0699u m() {
        C0679A a4 = this.f10185x;
        if (a4 == null) {
            return null;
        }
        return (C0699u) a4.n();
    }

    public void m0(Context context) {
        this.f10142J = true;
        C0679A a4 = this.f10185x;
        Activity n4 = a4 == null ? null : a4.n();
        if (n4 != null) {
            this.f10142J = false;
            l0(n4);
        }
    }

    public void m1() {
        this.f10186y.T();
        if (this.f10144L != null) {
            this.f10156X.a(C0380g.a.ON_STOP);
        }
        this.f10155W.h(C0380g.a.ON_STOP);
        this.f10161c = 4;
        this.f10142J = false;
        N0();
        if (!this.f10142J) {
            throw new b0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public boolean n() {
        Boolean bool;
        g gVar = this.f10147O;
        if (gVar == null || (bool = gVar.f10211q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void n0(C0695p pVar) {
    }

    public void n1() {
        Bundle bundle = this.f10163d;
        O0(this.f10144L, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f10186y.U();
    }

    public C0785a o() {
        Application application;
        Context applicationContext = q1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && I.I0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + q1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0786b bVar = new C0786b();
        if (application != null) {
            bVar.b(G.a.f5357e, application);
        }
        bVar.b(A.f5337a, this);
        bVar.b(A.f5338b, this);
        if (r() != null) {
            bVar.b(A.f5339c, r());
        }
        return bVar;
    }

    public boolean o0(MenuItem menuItem) {
        return false;
    }

    public final void o1(i iVar) {
        if (this.f10161c >= 0) {
            iVar.a();
        } else {
            this.f10164d0.add(iVar);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f10142J = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        p1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f10142J = true;
    }

    public boolean p() {
        Boolean bool;
        g gVar = this.f10147O;
        if (gVar == null || (bool = gVar.f10210p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void p0(Bundle bundle) {
        this.f10142J = true;
        s1();
        if (!this.f10186y.O0(1)) {
            this.f10186y.B();
        }
    }

    public final C0699u p1() {
        C0699u m4 = m();
        if (m4 != null) {
            return m4;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public View q() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return null;
        }
        return gVar.f10195a;
    }

    public Animation q0(int i4, boolean z4, int i5) {
        return null;
    }

    public final Context q1() {
        Context u4 = u();
        if (u4 != null) {
            return u4;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final Bundle r() {
        return this.f10170i;
    }

    public Animator r0(int i4, boolean z4, int i5) {
        return null;
    }

    public final View r1() {
        View V3 = V();
        if (V3 != null) {
            return V3;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final I s() {
        if (this.f10185x != null) {
            return this.f10186y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void s0(Menu menu, MenuInflater menuInflater) {
    }

    public void s1() {
        Bundle bundle;
        Bundle bundle2 = this.f10163d;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.f10186y.k1(bundle);
            this.f10186y.B();
        }
    }

    public void startActivityForResult(Intent intent, int i4) {
        C1(intent, i4, (Bundle) null);
    }

    public H t() {
        if (this.f10184w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (E() != C0380g.b.INITIALIZED.ordinal()) {
            return this.f10184w.D0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public View t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4 = this.f10160b0;
        if (i4 != 0) {
            return layoutInflater.inflate(i4, viewGroup, false);
        }
        return null;
    }

    public final void t1() {
        if (I.I0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f10144L != null) {
            Bundle bundle = this.f10163d;
            u1(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.f10163d = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f10169h);
        if (this.f10133A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f10133A));
        }
        if (this.f10135C != null) {
            sb.append(" tag=");
            sb.append(this.f10135C);
        }
        sb.append(")");
        return sb.toString();
    }

    public Context u() {
        C0679A a4 = this.f10185x;
        if (a4 == null) {
            return null;
        }
        return a4.o();
    }

    public void u0() {
        this.f10142J = true;
    }

    public final void u1(Bundle bundle) {
        SparseArray sparseArray = this.f10165e;
        if (sparseArray != null) {
            this.f10144L.restoreHierarchyState(sparseArray);
            this.f10165e = null;
        }
        this.f10142J = false;
        P0(bundle);
        if (!this.f10142J) {
            throw new b0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f10144L != null) {
            this.f10156X.a(C0380g.a.ON_CREATE);
        }
    }

    public int v() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return 0;
        }
        return gVar.f10197c;
    }

    public void v0() {
    }

    public void v1(int i4, int i5, int i6, int i7) {
        if (this.f10147O != null || i4 != 0 || i5 != 0 || i6 != 0 || i7 != 0) {
            i().f10197c = i4;
            i().f10198d = i5;
            i().f10199e = i6;
            i().f10200f = i7;
        }
    }

    public Object w() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return null;
        }
        return gVar.f10204j;
    }

    public void w0() {
        this.f10142J = true;
    }

    public void w1(Bundle bundle) {
        if (this.f10184w == null || !g0()) {
            this.f10170i = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public t x() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public void x0() {
        this.f10142J = true;
    }

    public void x1(View view) {
        i().f10213s = view;
    }

    public int y() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return 0;
        }
        return gVar.f10198d;
    }

    public LayoutInflater y0(Bundle bundle) {
        return D(bundle);
    }

    public void y1(int i4) {
        if (this.f10147O != null || i4 != 0) {
            i();
            this.f10147O.f10201g = i4;
        }
    }

    public Object z() {
        g gVar = this.f10147O;
        if (gVar == null) {
            return null;
        }
        return gVar.f10206l;
    }

    public void z0(boolean z4) {
    }

    public void z1(boolean z4) {
        if (this.f10147O != null) {
            i().f10196b = z4;
        }
    }
}
