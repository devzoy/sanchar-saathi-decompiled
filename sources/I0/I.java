package i0;

import G.o;
import G.r;
import S.C0321l;
import S.C0324o;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.H;
import d.C0566b;
import d.p;
import d.q;
import f.C0611a;
import f.C0612b;
import f.C0613c;
import f.C0616f;
import g.C0631a;
import h0.C0651b;
import i0.Q;
import j0.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class I {

    /* renamed from: U  reason: collision with root package name */
    public static boolean f9819U = false;

    /* renamed from: V  reason: collision with root package name */
    public static boolean f9820V = true;

    /* renamed from: A  reason: collision with root package name */
    public C0695p f9821A;

    /* renamed from: B  reason: collision with root package name */
    public C0704z f9822B = null;

    /* renamed from: C  reason: collision with root package name */
    public C0704z f9823C = new d();

    /* renamed from: D  reason: collision with root package name */
    public a0 f9824D = null;

    /* renamed from: E  reason: collision with root package name */
    public a0 f9825E = new e();

    /* renamed from: F  reason: collision with root package name */
    public C0613c f9826F;

    /* renamed from: G  reason: collision with root package name */
    public C0613c f9827G;

    /* renamed from: H  reason: collision with root package name */
    public C0613c f9828H;

    /* renamed from: I  reason: collision with root package name */
    public ArrayDeque f9829I = new ArrayDeque();

    /* renamed from: J  reason: collision with root package name */
    public boolean f9830J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f9831K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f9832L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f9833M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f9834N;

    /* renamed from: O  reason: collision with root package name */
    public ArrayList f9835O;

    /* renamed from: P  reason: collision with root package name */
    public ArrayList f9836P;

    /* renamed from: Q  reason: collision with root package name */
    public ArrayList f9837Q;

    /* renamed from: R  reason: collision with root package name */
    public L f9838R;

    /* renamed from: S  reason: collision with root package name */
    public c.C0176c f9839S;

    /* renamed from: T  reason: collision with root package name */
    public Runnable f9840T = new f();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f9841a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f9842b;

    /* renamed from: c  reason: collision with root package name */
    public final P f9843c = new P();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f9844d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f9845e;

    /* renamed from: f  reason: collision with root package name */
    public final B f9846f = new B(this);

    /* renamed from: g  reason: collision with root package name */
    public q f9847g;

    /* renamed from: h  reason: collision with root package name */
    public C0680a f9848h = null;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9849i = false;

    /* renamed from: j  reason: collision with root package name */
    public final p f9850j = new b(false);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f9851k = new AtomicInteger();

    /* renamed from: l  reason: collision with root package name */
    public final Map f9852l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final Map f9853m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    public final Map f9854n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f9855o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public final C f9856p = new C(this);

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList f9857q = new CopyOnWriteArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final R.a f9858r = new D(this);

    /* renamed from: s  reason: collision with root package name */
    public final R.a f9859s = new E(this);

    /* renamed from: t  reason: collision with root package name */
    public final R.a f9860t = new F(this);

    /* renamed from: u  reason: collision with root package name */
    public final R.a f9861u = new G(this);

    /* renamed from: v  reason: collision with root package name */
    public final C0324o f9862v = new c();

    /* renamed from: w  reason: collision with root package name */
    public int f9863w = -1;

    /* renamed from: x  reason: collision with root package name */
    public C0679A f9864x;

    /* renamed from: y  reason: collision with root package name */
    public C0701w f9865y;

    /* renamed from: z  reason: collision with root package name */
    public C0695p f9866z;

    public class a implements C0612b {
        public a() {
        }

        /* renamed from: b */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
            }
            k kVar = (k) I.this.f9829I.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = kVar.f9877e;
            int i5 = kVar.f9878f;
            C0695p i6 = I.this.f9843c.i(str);
            if (i6 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i6.J0(i5, strArr, iArr);
        }
    }

    public class b extends p {
        public b(boolean z4) {
            super(z4);
        }

        public void c() {
            if (I.I0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + I.f9820V + " fragment manager " + I.this);
            }
            if (I.f9820V) {
                I.this.o();
                I.this.f9848h = null;
            }
        }

        public void d() {
            if (I.I0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + I.f9820V + " fragment manager " + I.this);
            }
            I.this.E0();
        }

        public void e(C0566b bVar) {
            if (I.I0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + I.f9820V + " fragment manager " + I.this);
            }
            I i4 = I.this;
            if (i4.f9848h != null) {
                for (Z y4 : i4.u(new ArrayList(Collections.singletonList(I.this.f9848h)), 0, 1)) {
                    y4.y(bVar);
                }
                Iterator it = I.this.f9855o.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
        }

        public void f(C0566b bVar) {
            if (I.I0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + I.f9820V + " fragment manager " + I.this);
            }
            if (I.f9820V) {
                I.this.X();
                I.this.g1();
            }
        }
    }

    public class c implements C0324o {
        public c() {
        }

        public boolean a(MenuItem menuItem) {
            return I.this.J(menuItem);
        }

        public void b(Menu menu) {
            I.this.K(menu);
        }

        public void c(Menu menu, MenuInflater menuInflater) {
            I.this.C(menu, menuInflater);
        }

        public void d(Menu menu) {
            I.this.O(menu);
        }
    }

    public class d extends C0704z {
        public d() {
        }

        public C0695p a(ClassLoader classLoader, String str) {
            return I.this.v0().f(I.this.v0().o(), str, (Bundle) null);
        }
    }

    public class e implements a0 {
        public e() {
        }

        public Z a(ViewGroup viewGroup) {
            return new C0685f(viewGroup);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        public void run() {
            I.this.a0(true);
        }
    }

    public class g implements M {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C0695p f9873c;

        public g(C0695p pVar) {
            this.f9873c = pVar;
        }

        public void a(I i4, C0695p pVar) {
            this.f9873c.n0(pVar);
        }
    }

    public class h implements C0612b {
        public h() {
        }

        /* renamed from: b */
        public void a(C0611a aVar) {
            k kVar = (k) I.this.f9829I.pollLast();
            if (kVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = kVar.f9877e;
            int i4 = kVar.f9878f;
            C0695p i5 = I.this.f9843c.i(str);
            if (i5 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i5.k0(i4, aVar.c(), aVar.a());
        }
    }

    public class i implements C0612b {
        public i() {
        }

        /* renamed from: b */
        public void a(C0611a aVar) {
            k kVar = (k) I.this.f9829I.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = kVar.f9877e;
            int i4 = kVar.f9878f;
            C0695p i5 = I.this.f9843c.i(str);
            if (i5 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i5.k0(i4, aVar.c(), aVar.a());
        }
    }

    public static class j extends C0631a {
        /* renamed from: d */
        public Intent a(Context context, C0616f fVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a4 = fVar.a();
            if (!(a4 == null || (bundleExtra = a4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a4.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    fVar = new C0616f.a(fVar.e()).b((Intent) null).c(fVar.d(), fVar.c()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", fVar);
            if (I.I0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public C0611a c(int i4, Intent intent) {
            return new C0611a(i4, intent);
        }
    }

    public interface l {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    public class m implements l {

        /* renamed from: a  reason: collision with root package name */
        public final String f9879a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9880b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9881c;

        public m(String str, int i4, int i5) {
            this.f9879a = str;
            this.f9880b = i4;
            this.f9881c = i5;
        }

        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            C0695p pVar = I.this.f9821A;
            if (pVar != null && this.f9880b < 0 && this.f9879a == null && pVar.s().b1()) {
                return false;
            }
            return I.this.e1(arrayList, arrayList2, this.f9879a, this.f9880b, this.f9881c);
        }
    }

    public class n implements l {
        public n() {
        }

        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            boolean f12 = I.this.f1(arrayList, arrayList2);
            I i4 = I.this;
            i4.f9849i = true;
            if (!i4.f9855o.isEmpty() && arrayList.size() > 0) {
                ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(I.this.n0((C0680a) it.next()));
                }
                Iterator it2 = I.this.f9855o.iterator();
                while (it2.hasNext()) {
                    android.support.v4.media.session.b.a(it2.next());
                    Iterator it3 = linkedHashSet.iterator();
                    if (it3.hasNext()) {
                        C0695p pVar = (C0695p) it3.next();
                        throw null;
                    }
                }
            }
            return f12;
        }
    }

    public static C0695p C0(View view) {
        Object tag = view.getTag(C0651b.f9586a);
        if (tag instanceof C0695p) {
            return (C0695p) tag;
        }
        return null;
    }

    public static boolean I0(int i4) {
        return f9819U || Log.isLoggable("FragmentManager", i4);
    }

    public static void c0(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        while (i4 < i5) {
            C0680a aVar = (C0680a) arrayList.get(i4);
            if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                aVar.p(-1);
                aVar.u();
            } else {
                aVar.p(1);
                aVar.t();
            }
            i4++;
        }
    }

    public static I k0(View view) {
        C0699u uVar;
        C0695p l02 = l0(view);
        if (l02 == null) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    uVar = null;
                    break;
                } else if (context instanceof C0699u) {
                    uVar = (C0699u) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (uVar != null) {
                return uVar.T();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (l02.a0()) {
            return l02.s();
        } else {
            throw new IllegalStateException("The Fragment " + l02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    public static C0695p l0(View view) {
        while (view != null) {
            C0695p C02 = C0(view);
            if (C02 != null) {
                return C02;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static int l1(int i4) {
        int i5 = 4097;
        if (i4 == 4097) {
            return 8194;
        }
        if (i4 != 8194) {
            i5 = 8197;
            if (i4 == 8197) {
                return 4100;
            }
            if (i4 == 4099) {
                return 4099;
            }
            if (i4 != 4100) {
                return 0;
            }
        }
        return i5;
    }

    public boolean A(MenuItem menuItem) {
        if (this.f9863w < 1) {
            return false;
        }
        for (C0695p pVar : this.f9843c.o()) {
            if (pVar != null && pVar.T0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public a0 A0() {
        a0 a0Var = this.f9824D;
        if (a0Var != null) {
            return a0Var;
        }
        C0695p pVar = this.f9866z;
        return pVar != null ? pVar.f10184w.A0() : this.f9825E;
    }

    public void B() {
        this.f9831K = false;
        this.f9832L = false;
        this.f9838R.n(false);
        S(1);
    }

    public c.C0176c B0() {
        return this.f9839S;
    }

    public boolean C(Menu menu, MenuInflater menuInflater) {
        if (this.f9863w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (C0695p pVar : this.f9843c.o()) {
            if (pVar != null && M0(pVar) && pVar.V0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(pVar);
                z4 = true;
            }
        }
        if (this.f9845e != null) {
            for (int i4 = 0; i4 < this.f9845e.size(); i4++) {
                C0695p pVar2 = (C0695p) this.f9845e.get(i4);
                if (arrayList == null || !arrayList.contains(pVar2)) {
                    pVar2.v0();
                }
            }
        }
        this.f9845e = arrayList;
        return z4;
    }

    public void D() {
        this.f9833M = true;
        a0(true);
        X();
        s();
        S(-1);
        C0679A a4 = this.f9864x;
        if (a4 instanceof H.d) {
            ((H.d) a4).e(this.f9859s);
        }
        C0679A a5 = this.f9864x;
        if (a5 instanceof H.c) {
            ((H.c) a5).s(this.f9858r);
        }
        C0679A a6 = this.f9864x;
        if (a6 instanceof G.n) {
            ((G.n) a6).w(this.f9860t);
        }
        C0679A a7 = this.f9864x;
        if (a7 instanceof o) {
            ((o) a7).m(this.f9861u);
        }
        C0679A a8 = this.f9864x;
        if ((a8 instanceof C0321l) && this.f9866z == null) {
            ((C0321l) a8).r(this.f9862v);
        }
        this.f9864x = null;
        this.f9865y = null;
        this.f9866z = null;
        if (this.f9847g != null) {
            this.f9850j.h();
            this.f9847g = null;
        }
        C0613c cVar = this.f9826F;
        if (cVar != null) {
            cVar.c();
            this.f9827G.c();
            this.f9828H.c();
        }
    }

    public H D0(C0695p pVar) {
        return this.f9838R.k(pVar);
    }

    public void E() {
        S(1);
    }

    public void E0() {
        a0(true);
        if (f9820V && this.f9848h != null) {
            if (!this.f9855o.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(n0(this.f9848h));
                Iterator it = this.f9855o.iterator();
                while (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        C0695p pVar = (C0695p) it2.next();
                        throw null;
                    }
                }
            }
            Iterator it3 = this.f9848h.f9928c.iterator();
            while (it3.hasNext()) {
                C0695p pVar2 = ((Q.a) it3.next()).f9946b;
                if (pVar2 != null) {
                    pVar2.f10177p = false;
                }
            }
            for (Z f4 : u(new ArrayList(Collections.singletonList(this.f9848h)), 0, 1)) {
                f4.f();
            }
            this.f9848h = null;
            v1();
            if (I0(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f9850j.g() + " for  FragmentManager " + this);
            }
        } else if (this.f9850j.g()) {
            if (I0(3)) {
                Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
            }
            b1();
        } else {
            if (I0(3)) {
                Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
            }
            this.f9847g.k();
        }
    }

    public void F(boolean z4) {
        if (z4 && (this.f9864x instanceof H.d)) {
            u1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (C0695p pVar : this.f9843c.o()) {
            if (pVar != null) {
                pVar.b1();
                if (z4) {
                    pVar.f10186y.F(true);
                }
            }
        }
    }

    public void F0(C0695p pVar) {
        if (I0(2)) {
            Log.v("FragmentManager", "hide: " + pVar);
        }
        if (!pVar.f10136D) {
            pVar.f10136D = true;
            pVar.f10150R = true ^ pVar.f10150R;
            r1(pVar);
        }
    }

    public void G(boolean z4, boolean z5) {
        if (z5 && (this.f9864x instanceof G.n)) {
            u1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (C0695p pVar : this.f9843c.o()) {
            if (pVar != null) {
                pVar.c1(z4);
                if (z5) {
                    pVar.f10186y.G(z4, true);
                }
            }
        }
    }

    public void G0(C0695p pVar) {
        if (pVar.f10175n && J0(pVar)) {
            this.f9830J = true;
        }
    }

    public void H(C0695p pVar) {
        Iterator it = this.f9857q.iterator();
        while (it.hasNext()) {
            ((M) it.next()).a(this, pVar);
        }
    }

    public boolean H0() {
        return this.f9833M;
    }

    public void I() {
        for (C0695p pVar : this.f9843c.l()) {
            if (pVar != null) {
                pVar.z0(pVar.b0());
                pVar.f10186y.I();
            }
        }
    }

    public boolean J(MenuItem menuItem) {
        if (this.f9863w < 1) {
            return false;
        }
        for (C0695p pVar : this.f9843c.o()) {
            if (pVar != null && pVar.d1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J0(C0695p pVar) {
        return (pVar.f10140H && pVar.f10141I) || pVar.f10186y.p();
    }

    public void K(Menu menu) {
        if (this.f9863w >= 1) {
            for (C0695p pVar : this.f9843c.o()) {
                if (pVar != null) {
                    pVar.e1(menu);
                }
            }
        }
    }

    public final boolean K0() {
        C0695p pVar = this.f9866z;
        if (pVar == null) {
            return true;
        }
        return pVar.a0() && this.f9866z.H().K0();
    }

    public final void L(C0695p pVar) {
        if (pVar != null && pVar.equals(f0(pVar.f10169h))) {
            pVar.i1();
        }
    }

    public boolean L0(C0695p pVar) {
        if (pVar == null) {
            return false;
        }
        return pVar.b0();
    }

    public void M() {
        S(5);
    }

    public boolean M0(C0695p pVar) {
        if (pVar == null) {
            return true;
        }
        return pVar.d0();
    }

    public void N(boolean z4, boolean z5) {
        if (z5 && (this.f9864x instanceof o)) {
            u1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (C0695p pVar : this.f9843c.o()) {
            if (pVar != null) {
                pVar.g1(z4);
                if (z5) {
                    pVar.f10186y.N(z4, true);
                }
            }
        }
    }

    public boolean N0(C0695p pVar) {
        if (pVar == null) {
            return true;
        }
        I i4 = pVar.f10184w;
        return pVar.equals(i4.z0()) && N0(i4.f9866z);
    }

    public boolean O(Menu menu) {
        boolean z4 = false;
        if (this.f9863w < 1) {
            return false;
        }
        for (C0695p pVar : this.f9843c.o()) {
            if (pVar != null && M0(pVar) && pVar.h1(menu)) {
                z4 = true;
            }
        }
        return z4;
    }

    public boolean O0(int i4) {
        return this.f9863w >= i4;
    }

    public void P() {
        v1();
        L(this.f9821A);
    }

    public boolean P0() {
        return this.f9831K || this.f9832L;
    }

    public void Q() {
        this.f9831K = false;
        this.f9832L = false;
        this.f9838R.n(false);
        S(7);
    }

    public void R() {
        this.f9831K = false;
        this.f9832L = false;
        this.f9838R.n(false);
        S(5);
    }

    public final /* synthetic */ void R0(Configuration configuration) {
        if (K0()) {
            z(configuration, false);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void S(int i4) {
        try {
            this.f9842b = true;
            this.f9843c.d(i4);
            W0(i4, false);
            for (Z q4 : t()) {
                q4.q();
            }
            this.f9842b = false;
            a0(true);
        } catch (Throwable th) {
            this.f9842b = false;
            throw th;
        }
    }

    public final /* synthetic */ void S0(Integer num) {
        if (K0() && num.intValue() == 80) {
            F(false);
        }
    }

    public void T() {
        this.f9832L = true;
        this.f9838R.n(true);
        S(4);
    }

    public final /* synthetic */ void T0(G.f fVar) {
        if (K0()) {
            G(fVar.a(), false);
        }
    }

    public void U() {
        S(2);
    }

    public final /* synthetic */ void U0(r rVar) {
        if (K0()) {
            N(rVar.a(), false);
        }
    }

    public final void V() {
        if (this.f9834N) {
            this.f9834N = false;
            t1();
        }
    }

    public void V0(C0695p pVar, Intent intent, int i4, Bundle bundle) {
        if (this.f9826F != null) {
            this.f9829I.addLast(new k(pVar.f10169h, i4));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f9826F.a(intent);
            return;
        }
        this.f9864x.A(pVar, intent, i4, bundle);
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f9843c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f9845e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(((C0695p) this.f9845e.get(i4)).toString());
            }
        }
        int size2 = this.f9844d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size2; i5++) {
                C0680a aVar = (C0680a) this.f9844d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.r(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f9851k.get());
        synchronized (this.f9841a) {
            try {
                int size3 = this.f9841a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size3; i6++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
                        printWriter.print(": ");
                        printWriter.println((l) this.f9841a.get(i6));
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f9864x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f9865y);
        if (this.f9866z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f9866z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f9863w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f9831K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f9832L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f9833M);
        if (this.f9830J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f9830J);
        }
    }

    public void W0(int i4, boolean z4) {
        C0679A a4;
        if (this.f9864x == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z4 || i4 != this.f9863w) {
            this.f9863w = i4;
            this.f9843c.t();
            t1();
            if (this.f9830J && (a4 = this.f9864x) != null && this.f9863w == 7) {
                a4.B();
                this.f9830J = false;
            }
        }
    }

    public final void X() {
        for (Z q4 : t()) {
            q4.q();
        }
    }

    public void X0() {
        if (this.f9864x != null) {
            this.f9831K = false;
            this.f9832L = false;
            this.f9838R.n(false);
            for (C0695p pVar : this.f9843c.o()) {
                if (pVar != null) {
                    pVar.i0();
                }
            }
        }
    }

    public void Y(l lVar, boolean z4) {
        if (!z4) {
            if (this.f9864x != null) {
                q();
            } else if (this.f9833M) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f9841a) {
            try {
                if (this.f9864x != null) {
                    this.f9841a.add(lVar);
                    n1();
                } else if (!z4) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Y0(C0702x xVar) {
        View view;
        for (O o4 : this.f9843c.k()) {
            C0695p k4 = o4.k();
            if (k4.f10134B == xVar.getId() && (view = k4.f10144L) != null && view.getParent() == null) {
                k4.f10143K = xVar;
                o4.b();
            }
        }
    }

    public final void Z(boolean z4) {
        if (this.f9842b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f9864x == null) {
            if (this.f9833M) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f9864x.v().getLooper()) {
            if (!z4) {
                q();
            }
            if (this.f9835O == null) {
                this.f9835O = new ArrayList();
                this.f9836P = new ArrayList();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public void Z0(O o4) {
        C0695p k4 = o4.k();
        if (!k4.f10145M) {
            return;
        }
        if (this.f9842b) {
            this.f9834N = true;
            return;
        }
        k4.f10145M = false;
        o4.m();
    }

    public boolean a0(boolean z4) {
        Z(z4);
        boolean z5 = false;
        while (o0(this.f9835O, this.f9836P)) {
            z5 = true;
            this.f9842b = true;
            try {
                i1(this.f9835O, this.f9836P);
            } finally {
                r();
            }
        }
        v1();
        V();
        this.f9843c.b();
        return z5;
    }

    public void a1(int i4, int i5, boolean z4) {
        if (i4 >= 0) {
            Y(new m((String) null, i4, i5), z4);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i4);
    }

    public void b0(l lVar, boolean z4) {
        if (!z4 || (this.f9864x != null && !this.f9833M)) {
            Z(z4);
            if (lVar.a(this.f9835O, this.f9836P)) {
                this.f9842b = true;
                try {
                    i1(this.f9835O, this.f9836P);
                } finally {
                    r();
                }
            }
            v1();
            V();
            this.f9843c.b();
        }
    }

    public boolean b1() {
        return d1((String) null, -1, 0);
    }

    public boolean c1(int i4, int i5) {
        if (i4 >= 0) {
            return d1((String) null, i4, i5);
        }
        throw new IllegalArgumentException("Bad id: " + i4);
    }

    public final void d0(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        boolean z4 = ((C0680a) arrayList.get(i4)).f9943r;
        ArrayList arrayList3 = this.f9837Q;
        if (arrayList3 == null) {
            this.f9837Q = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f9837Q.addAll(this.f9843c.o());
        C0695p z02 = z0();
        boolean z5 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0680a aVar = (C0680a) arrayList.get(i6);
            z02 = !((Boolean) arrayList2.get(i6)).booleanValue() ? aVar.v(this.f9837Q, z02) : aVar.y(this.f9837Q, z02);
            z5 = z5 || aVar.f9934i;
        }
        this.f9837Q.clear();
        if (!z4 && this.f9863w >= 1) {
            for (int i7 = i4; i7 < i5; i7++) {
                Iterator it = ((C0680a) arrayList.get(i7)).f9928c.iterator();
                while (it.hasNext()) {
                    C0695p pVar = ((Q.a) it.next()).f9946b;
                    if (!(pVar == null || pVar.f10184w == null)) {
                        this.f9843c.r(v(pVar));
                    }
                }
            }
        }
        c0(arrayList, arrayList2, i4, i5);
        boolean booleanValue = ((Boolean) arrayList2.get(i5 - 1)).booleanValue();
        if (z5 && !this.f9855o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(n0((C0680a) it2.next()));
            }
            if (this.f9848h == null) {
                Iterator it3 = this.f9855o.iterator();
                while (it3.hasNext()) {
                    android.support.v4.media.session.b.a(it3.next());
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        C0695p pVar2 = (C0695p) it4.next();
                        throw null;
                    }
                }
                Iterator it5 = this.f9855o.iterator();
                while (it5.hasNext()) {
                    android.support.v4.media.session.b.a(it5.next());
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        C0695p pVar3 = (C0695p) it6.next();
                        throw null;
                    }
                }
            }
        }
        for (int i8 = i4; i8 < i5; i8++) {
            C0680a aVar2 = (C0680a) arrayList.get(i8);
            if (booleanValue) {
                for (int size = aVar2.f9928c.size() - 1; size >= 0; size--) {
                    C0695p pVar4 = ((Q.a) aVar2.f9928c.get(size)).f9946b;
                    if (pVar4 != null) {
                        v(pVar4).m();
                    }
                }
            } else {
                Iterator it7 = aVar2.f9928c.iterator();
                while (it7.hasNext()) {
                    C0695p pVar5 = ((Q.a) it7.next()).f9946b;
                    if (pVar5 != null) {
                        v(pVar5).m();
                    }
                }
            }
        }
        W0(this.f9863w, true);
        for (Z z6 : u(arrayList, i4, i5)) {
            z6.B(booleanValue);
            z6.x();
            z6.n();
        }
        while (i4 < i5) {
            C0680a aVar3 = (C0680a) arrayList.get(i4);
            if (((Boolean) arrayList2.get(i4)).booleanValue() && aVar3.f10026v >= 0) {
                aVar3.f10026v = -1;
            }
            aVar3.x();
            i4++;
        }
        if (z5) {
            j1();
        }
    }

    public final boolean d1(String str, int i4, int i5) {
        a0(false);
        Z(true);
        C0695p pVar = this.f9821A;
        if (pVar != null && i4 < 0 && str == null && pVar.s().b1()) {
            return true;
        }
        boolean e12 = e1(this.f9835O, this.f9836P, str, i4, i5);
        if (e12) {
            this.f9842b = true;
            try {
                i1(this.f9835O, this.f9836P);
            } finally {
                r();
            }
        }
        v1();
        V();
        this.f9843c.b();
        return e12;
    }

    public boolean e0() {
        boolean a02 = a0(true);
        m0();
        return a02;
    }

    public boolean e1(ArrayList arrayList, ArrayList arrayList2, String str, int i4, int i5) {
        int g02 = g0(str, i4, (i5 & 1) != 0);
        if (g02 < 0) {
            return false;
        }
        for (int size = this.f9844d.size() - 1; size >= g02; size--) {
            arrayList.add((C0680a) this.f9844d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public C0695p f0(String str) {
        return this.f9843c.f(str);
    }

    public boolean f1(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f9844d;
        C0680a aVar = (C0680a) arrayList3.get(arrayList3.size() - 1);
        this.f9848h = aVar;
        Iterator it = aVar.f9928c.iterator();
        while (it.hasNext()) {
            C0695p pVar = ((Q.a) it.next()).f9946b;
            if (pVar != null) {
                pVar.f10177p = true;
            }
        }
        return e1(arrayList, arrayList2, (String) null, -1, 0);
    }

    public final int g0(String str, int i4, boolean z4) {
        if (this.f9844d.isEmpty()) {
            return -1;
        }
        if (str != null || i4 >= 0) {
            int size = this.f9844d.size() - 1;
            while (size >= 0) {
                C0680a aVar = (C0680a) this.f9844d.get(size);
                if ((str != null && str.equals(aVar.w())) || (i4 >= 0 && i4 == aVar.f10026v)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z4) {
                while (size > 0) {
                    C0680a aVar2 = (C0680a) this.f9844d.get(size - 1);
                    if ((str == null || !str.equals(aVar2.w())) && (i4 < 0 || i4 != aVar2.f10026v)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f9844d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z4) {
            return 0;
        } else {
            return this.f9844d.size() - 1;
        }
    }

    public void g1() {
        Y(new n(), false);
    }

    public void h(C0680a aVar) {
        this.f9844d.add(aVar);
    }

    public C0695p h0(int i4) {
        return this.f9843c.g(i4);
    }

    public void h1(C0695p pVar) {
        if (I0(2)) {
            Log.v("FragmentManager", "remove: " + pVar + " nesting=" + pVar.f10183v);
        }
        boolean c02 = pVar.c0();
        if (!pVar.f10137E || !c02) {
            this.f9843c.u(pVar);
            if (J0(pVar)) {
                this.f9830J = true;
            }
            pVar.f10176o = true;
            r1(pVar);
        }
    }

    public O i(C0695p pVar) {
        String str = pVar.f10153U;
        if (str != null) {
            j0.c.f(pVar, str);
        }
        if (I0(2)) {
            Log.v("FragmentManager", "add: " + pVar);
        }
        O v4 = v(pVar);
        pVar.f10184w = this;
        this.f9843c.r(v4);
        if (!pVar.f10137E) {
            this.f9843c.a(pVar);
            pVar.f10176o = false;
            if (pVar.f10144L == null) {
                pVar.f10150R = false;
            }
            if (J0(pVar)) {
                this.f9830J = true;
            }
        }
        return v4;
    }

    public C0695p i0(String str) {
        return this.f9843c.h(str);
    }

    public final void i1(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i4 = 0;
                int i5 = 0;
                while (i4 < size) {
                    if (!((C0680a) arrayList.get(i4)).f9943r) {
                        if (i5 != i4) {
                            d0(arrayList, arrayList2, i5, i4);
                        }
                        i5 = i4 + 1;
                        if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                            while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((C0680a) arrayList.get(i5)).f9943r) {
                                i5++;
                            }
                        }
                        d0(arrayList, arrayList2, i4, i5);
                        i4 = i5 - 1;
                    }
                    i4++;
                }
                if (i5 != size) {
                    d0(arrayList, arrayList2, i5, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public void j(M m4) {
        this.f9857q.add(m4);
    }

    public C0695p j0(String str) {
        return this.f9843c.i(str);
    }

    public final void j1() {
        if (this.f9855o.size() > 0) {
            android.support.v4.media.session.b.a(this.f9855o.get(0));
            throw null;
        }
    }

    public int k() {
        return this.f9851k.getAndIncrement();
    }

    public void k1(Parcelable parcelable) {
        O o4;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String next : bundle3.keySet()) {
                if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                    bundle2.setClassLoader(this.f9864x.o().getClassLoader());
                    this.f9853m.put(next.substring(7), bundle2);
                }
            }
            HashMap hashMap = new HashMap();
            for (String next2 : bundle3.keySet()) {
                if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                    bundle.setClassLoader(this.f9864x.o().getClassLoader());
                    hashMap.put(next2.substring(9), bundle);
                }
            }
            this.f9843c.x(hashMap);
            K k4 = (K) bundle3.getParcelable("state");
            if (k4 != null) {
                this.f9843c.v();
                Iterator it = k4.f9884e.iterator();
                while (it.hasNext()) {
                    Bundle B4 = this.f9843c.B((String) it.next(), (Bundle) null);
                    if (B4 != null) {
                        C0695p g4 = this.f9838R.g(((N) B4.getParcelable("state")).f9901f);
                        if (g4 != null) {
                            if (I0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + g4);
                            }
                            o4 = new O(this.f9856p, this.f9843c, g4, B4);
                        } else {
                            o4 = new O(this.f9856p, this.f9843c, this.f9864x.o().getClassLoader(), t0(), B4);
                        }
                        C0695p k5 = o4.k();
                        k5.f10163d = B4;
                        k5.f10184w = this;
                        if (I0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k5.f10169h + "): " + k5);
                        }
                        o4.o(this.f9864x.o().getClassLoader());
                        this.f9843c.r(o4);
                        o4.s(this.f9863w);
                    }
                }
                for (C0695p pVar : this.f9838R.j()) {
                    if (!this.f9843c.c(pVar.f10169h)) {
                        if (I0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + pVar + " that was not found in the set of active Fragments " + k4.f9884e);
                        }
                        this.f9838R.m(pVar);
                        pVar.f10184w = this;
                        O o5 = new O(this.f9856p, this.f9843c, pVar);
                        o5.s(1);
                        o5.m();
                        pVar.f10176o = true;
                        o5.m();
                    }
                }
                this.f9843c.w(k4.f9885f);
                if (k4.f9886g != null) {
                    this.f9844d = new ArrayList(k4.f9886g.length);
                    int i4 = 0;
                    while (true) {
                        C0681b[] bVarArr = k4.f9886g;
                        if (i4 >= bVarArr.length) {
                            break;
                        }
                        C0680a c4 = bVarArr[i4].c(this);
                        if (I0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i4 + " (index " + c4.f10026v + "): " + c4);
                            PrintWriter printWriter = new PrintWriter(new W("FragmentManager"));
                            c4.s("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f9844d.add(c4);
                        i4++;
                    }
                } else {
                    this.f9844d = new ArrayList();
                }
                this.f9851k.set(k4.f9887h);
                String str = k4.f9888i;
                if (str != null) {
                    C0695p f02 = f0(str);
                    this.f9821A = f02;
                    L(f02);
                }
                ArrayList arrayList = k4.f9889j;
                if (arrayList != null) {
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        this.f9852l.put((String) arrayList.get(i5), (C0682c) k4.f9890k.get(i5));
                    }
                }
                this.f9829I = new ArrayDeque(k4.f9891l);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: d.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: i0.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: i0.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: i0.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(i0.C0679A r4, i0.C0701w r5, i0.C0695p r6) {
        /*
            r3 = this;
            i0.A r0 = r3.f9864x
            if (r0 != 0) goto L_0x016c
            r3.f9864x = r4
            r3.f9865y = r5
            r3.f9866z = r6
            if (r6 == 0) goto L_0x0015
            i0.I$g r5 = new i0.I$g
            r5.<init>(r6)
            r3.j(r5)
            goto L_0x001f
        L_0x0015:
            boolean r5 = r4 instanceof i0.M
            if (r5 == 0) goto L_0x001f
            r5 = r4
            i0.M r5 = (i0.M) r5
            r3.j(r5)
        L_0x001f:
            i0.p r5 = r3.f9866z
            if (r5 == 0) goto L_0x0026
            r3.v1()
        L_0x0026:
            boolean r5 = r4 instanceof d.s
            if (r5 == 0) goto L_0x003b
            r5 = r4
            d.s r5 = (d.s) r5
            d.q r0 = r5.k()
            r3.f9847g = r0
            if (r6 == 0) goto L_0x0036
            r5 = r6
        L_0x0036:
            d.p r1 = r3.f9850j
            r0.h(r5, r1)
        L_0x003b:
            if (r6 == 0) goto L_0x0046
            i0.I r4 = r6.f10184w
            i0.L r4 = r4.q0(r6)
            r3.f9838R = r4
            goto L_0x005f
        L_0x0046:
            boolean r5 = r4 instanceof androidx.lifecycle.I
            if (r5 == 0) goto L_0x0057
            androidx.lifecycle.I r4 = (androidx.lifecycle.I) r4
            androidx.lifecycle.H r4 = r4.t()
            i0.L r4 = i0.L.i(r4)
            r3.f9838R = r4
            goto L_0x005f
        L_0x0057:
            i0.L r4 = new i0.L
            r5 = 0
            r4.<init>(r5)
            r3.f9838R = r4
        L_0x005f:
            i0.L r4 = r3.f9838R
            boolean r5 = r3.P0()
            r4.n(r5)
            i0.P r4 = r3.f9843c
            i0.L r5 = r3.f9838R
            r4.A(r5)
            i0.A r4 = r3.f9864x
            boolean r5 = r4 instanceof x0.C1000f
            if (r5 == 0) goto L_0x0090
            if (r6 != 0) goto L_0x0090
            x0.f r4 = (x0.C1000f) r4
            x0.d r4 = r4.l()
            i0.H r5 = new i0.H
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.h(r0, r5)
            android.os.Bundle r4 = r4.b(r0)
            if (r4 == 0) goto L_0x0090
            r3.k1(r4)
        L_0x0090:
            i0.A r4 = r3.f9864x
            boolean r5 = r4 instanceof f.C0615e
            if (r5 == 0) goto L_0x0128
            f.e r4 = (f.C0615e) r4
            f.d r4 = r4.p()
            if (r6 == 0) goto L_0x00b2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.f10169h
            r5.append(r0)
            java.lang.String r0 = ":"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r5 = ""
        L_0x00b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FragmentManager:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartActivityForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            g.c r1 = new g.c
            r1.<init>()
            i0.I$h r2 = new i0.I$h
            r2.<init>()
            f.c r0 = r4.i(r0, r1, r2)
            r3.f9826F = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartIntentSenderForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            i0.I$j r1 = new i0.I$j
            r1.<init>()
            i0.I$i r2 = new i0.I$i
            r2.<init>()
            f.c r0 = r4.i(r0, r1, r2)
            r3.f9827G = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "RequestPermissions"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            g.b r0 = new g.b
            r0.<init>()
            i0.I$a r1 = new i0.I$a
            r1.<init>()
            f.c r4 = r4.i(r5, r0, r1)
            r3.f9828H = r4
        L_0x0128:
            i0.A r4 = r3.f9864x
            boolean r5 = r4 instanceof H.c
            if (r5 == 0) goto L_0x0135
            H.c r4 = (H.c) r4
            R.a r5 = r3.f9858r
            r4.h(r5)
        L_0x0135:
            i0.A r4 = r3.f9864x
            boolean r5 = r4 instanceof H.d
            if (r5 == 0) goto L_0x0142
            H.d r4 = (H.d) r4
            R.a r5 = r3.f9859s
            r4.d(r5)
        L_0x0142:
            i0.A r4 = r3.f9864x
            boolean r5 = r4 instanceof G.n
            if (r5 == 0) goto L_0x014f
            G.n r4 = (G.n) r4
            R.a r5 = r3.f9860t
            r4.c(r5)
        L_0x014f:
            i0.A r4 = r3.f9864x
            boolean r5 = r4 instanceof G.o
            if (r5 == 0) goto L_0x015c
            G.o r4 = (G.o) r4
            R.a r5 = r3.f9861u
            r4.g(r5)
        L_0x015c:
            i0.A r4 = r3.f9864x
            boolean r5 = r4 instanceof S.C0321l
            if (r5 == 0) goto L_0x016b
            if (r6 != 0) goto L_0x016b
            S.l r4 = (S.C0321l) r4
            S.o r5 = r3.f9862v
            r4.u(r5)
        L_0x016b:
            return
        L_0x016c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.I.l(i0.A, i0.w, i0.p):void");
    }

    public void m(C0695p pVar) {
        if (I0(2)) {
            Log.v("FragmentManager", "attach: " + pVar);
        }
        if (pVar.f10137E) {
            pVar.f10137E = false;
            if (!pVar.f10175n) {
                this.f9843c.a(pVar);
                if (I0(2)) {
                    Log.v("FragmentManager", "add from attach: " + pVar);
                }
                if (J0(pVar)) {
                    this.f9830J = true;
                }
            }
        }
    }

    public final void m0() {
        for (Z r4 : t()) {
            r4.r();
        }
    }

    /* renamed from: m1 */
    public Bundle Q0() {
        C0681b[] bVarArr;
        Bundle bundle = new Bundle();
        m0();
        X();
        a0(true);
        this.f9831K = true;
        this.f9838R.n(true);
        ArrayList y4 = this.f9843c.y();
        HashMap m4 = this.f9843c.m();
        if (!m4.isEmpty()) {
            ArrayList z4 = this.f9843c.z();
            int size = this.f9844d.size();
            if (size > 0) {
                bVarArr = new C0681b[size];
                for (int i4 = 0; i4 < size; i4++) {
                    bVarArr[i4] = new C0681b((C0680a) this.f9844d.get(i4));
                    if (I0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f9844d.get(i4));
                    }
                }
            } else {
                bVarArr = null;
            }
            K k4 = new K();
            k4.f9884e = y4;
            k4.f9885f = z4;
            k4.f9886g = bVarArr;
            k4.f9887h = this.f9851k.get();
            C0695p pVar = this.f9821A;
            if (pVar != null) {
                k4.f9888i = pVar.f10169h;
            }
            k4.f9889j.addAll(this.f9852l.keySet());
            k4.f9890k.addAll(this.f9852l.values());
            k4.f9891l = new ArrayList(this.f9829I);
            bundle.putParcelable("state", k4);
            for (String str : this.f9853m.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f9853m.get(str));
            }
            for (String str2 : m4.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) m4.get(str2));
            }
        } else if (I0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public Q n() {
        return new C0680a(this);
    }

    public Set n0(C0680a aVar) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < aVar.f9928c.size(); i4++) {
            C0695p pVar = ((Q.a) aVar.f9928c.get(i4)).f9946b;
            if (pVar != null && aVar.f9934i) {
                hashSet.add(pVar);
            }
        }
        return hashSet;
    }

    public void n1() {
        synchronized (this.f9841a) {
            try {
                if (this.f9841a.size() == 1) {
                    this.f9864x.v().removeCallbacks(this.f9840T);
                    this.f9864x.v().post(this.f9840T);
                    v1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o() {
        C0680a aVar = this.f9848h;
        if (aVar != null) {
            aVar.f10025u = false;
            aVar.f();
            e0();
            Iterator it = this.f9855o.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
    }

    public final boolean o0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f9841a) {
            if (this.f9841a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f9841a.size();
                boolean z4 = false;
                for (int i4 = 0; i4 < size; i4++) {
                    z4 |= ((l) this.f9841a.get(i4)).a(arrayList, arrayList2);
                }
                return z4;
            } finally {
                this.f9841a.clear();
                this.f9864x.v().removeCallbacks(this.f9840T);
            }
        }
    }

    public void o1(C0695p pVar, boolean z4) {
        ViewGroup s02 = s0(pVar);
        if (s02 != null && (s02 instanceof C0702x)) {
            ((C0702x) s02).setDrawDisappearingViewsLast(!z4);
        }
    }

    public boolean p() {
        boolean z4 = false;
        for (C0695p pVar : this.f9843c.l()) {
            if (pVar != null) {
                z4 = J0(pVar);
                continue;
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public int p0() {
        return this.f9844d.size() + (this.f9848h != null ? 1 : 0);
    }

    public void p1(C0695p pVar, C0380g.b bVar) {
        if (!pVar.equals(f0(pVar.f10169h)) || !(pVar.f10185x == null || pVar.f10184w == this)) {
            throw new IllegalArgumentException("Fragment " + pVar + " is not an active fragment of FragmentManager " + this);
        }
        pVar.f10154V = bVar;
    }

    public final void q() {
        if (P0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final L q0(C0695p pVar) {
        return this.f9838R.h(pVar);
    }

    public void q1(C0695p pVar) {
        if (pVar == null || (pVar.equals(f0(pVar.f10169h)) && (pVar.f10185x == null || pVar.f10184w == this))) {
            C0695p pVar2 = this.f9821A;
            this.f9821A = pVar;
            L(pVar2);
            L(this.f9821A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + pVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void r() {
        this.f9842b = false;
        this.f9836P.clear();
        this.f9835O.clear();
    }

    public C0701w r0() {
        return this.f9865y;
    }

    public final void r1(C0695p pVar) {
        ViewGroup s02 = s0(pVar);
        if (s02 != null && pVar.v() + pVar.y() + pVar.J() + pVar.K() > 0) {
            if (s02.getTag(C0651b.f9588c) == null) {
                s02.setTag(C0651b.f9588c, pVar);
            }
            ((C0695p) s02.getTag(C0651b.f9588c)).z1(pVar.I());
        }
    }

    public final void s() {
        C0679A a4 = this.f9864x;
        if (a4 instanceof androidx.lifecycle.I ? this.f9843c.p().l() : a4.o() instanceof Activity ? !((Activity) this.f9864x.o()).isChangingConfigurations() : true) {
            for (C0682c cVar : this.f9852l.values()) {
                for (String e4 : cVar.f10042e) {
                    this.f9843c.p().e(e4, false);
                }
            }
        }
    }

    public final ViewGroup s0(C0695p pVar) {
        ViewGroup viewGroup = pVar.f10143K;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (pVar.f10134B > 0 && this.f9865y.j()) {
            View i4 = this.f9865y.i(pVar.f10134B);
            if (i4 instanceof ViewGroup) {
                return (ViewGroup) i4;
            }
        }
        return null;
    }

    public void s1(C0695p pVar) {
        if (I0(2)) {
            Log.v("FragmentManager", "show: " + pVar);
        }
        if (pVar.f10136D) {
            pVar.f10136D = false;
            pVar.f10150R = !pVar.f10150R;
        }
    }

    public final Set t() {
        HashSet hashSet = new HashSet();
        for (O k4 : this.f9843c.k()) {
            ViewGroup viewGroup = k4.k().f10143K;
            if (viewGroup != null) {
                hashSet.add(Z.v(viewGroup, A0()));
            }
        }
        return hashSet;
    }

    public C0704z t0() {
        C0704z zVar = this.f9822B;
        if (zVar != null) {
            return zVar;
        }
        C0695p pVar = this.f9866z;
        return pVar != null ? pVar.f10184w.t0() : this.f9823C;
    }

    public final void t1() {
        for (O Z02 : this.f9843c.k()) {
            Z0(Z02);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0695p pVar = this.f9866z;
        if (pVar != null) {
            sb.append(pVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f9866z)));
            sb.append("}");
        } else {
            C0679A a4 = this.f9864x;
            if (a4 != null) {
                sb.append(a4.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f9864x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public Set u(ArrayList arrayList, int i4, int i5) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i4 < i5) {
            Iterator it = ((C0680a) arrayList.get(i4)).f9928c.iterator();
            while (it.hasNext()) {
                C0695p pVar = ((Q.a) it.next()).f9946b;
                if (!(pVar == null || (viewGroup = pVar.f10143K) == null)) {
                    hashSet.add(Z.u(viewGroup, this));
                }
            }
            i4++;
        }
        return hashSet;
    }

    public List u0() {
        return this.f9843c.o();
    }

    public final void u1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new W("FragmentManager"));
        C0679A a4 = this.f9864x;
        if (a4 != null) {
            try {
                a4.x("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e4) {
                Log.e("FragmentManager", "Failed dumping state", e4);
            }
        } else {
            try {
                W("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e5) {
                Log.e("FragmentManager", "Failed dumping state", e5);
            }
        }
        throw runtimeException;
    }

    public O v(C0695p pVar) {
        O n4 = this.f9843c.n(pVar.f10169h);
        if (n4 != null) {
            return n4;
        }
        O o4 = new O(this.f9856p, this.f9843c, pVar);
        o4.o(this.f9864x.o().getClassLoader());
        o4.s(this.f9863w);
        return o4;
    }

    public C0679A v0() {
        return this.f9864x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (p0() <= 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (N0(r4.f9866z) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (I0(3) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        android.util.Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + r4 + " enabled state is " + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        r4.f9850j.j(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v1() {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.f9841a
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.f9841a     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0034 }
            r2 = 3
            r3 = 1
            if (r1 != 0) goto L_0x0038
            d.p r1 = r4.f9850j     // Catch:{ all -> 0x0034 }
            r1.j(r3)     // Catch:{ all -> 0x0034 }
            boolean r1 = I0(r2)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0036
            java.lang.String r1 = "FragmentManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "FragmentManager "
            r2.append(r3)     // Catch:{ all -> 0x0034 }
            r2.append(r4)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = " enabling OnBackPressedCallback, caused by non-empty pending actions"
            r2.append(r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0034 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0036
        L_0x0034:
            r1 = move-exception
            goto L_0x0073
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            int r0 = r4.p0()
            if (r0 <= 0) goto L_0x0048
            i0.p r0 = r4.f9866z
            boolean r0 = r4.N0(r0)
            if (r0 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            boolean r0 = I0(r2)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OnBackPressedCallback for FragmentManager "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " enabled state is "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L_0x006d:
            d.p r0 = r4.f9850j
            r0.j(r3)
            return
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.I.v1():void");
    }

    public void w(C0695p pVar) {
        if (I0(2)) {
            Log.v("FragmentManager", "detach: " + pVar);
        }
        if (!pVar.f10137E) {
            pVar.f10137E = true;
            if (pVar.f10175n) {
                if (I0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + pVar);
                }
                this.f9843c.u(pVar);
                if (J0(pVar)) {
                    this.f9830J = true;
                }
                r1(pVar);
            }
        }
    }

    public LayoutInflater.Factory2 w0() {
        return this.f9846f;
    }

    public void x() {
        this.f9831K = false;
        this.f9832L = false;
        this.f9838R.n(false);
        S(4);
    }

    public C x0() {
        return this.f9856p;
    }

    public void y() {
        this.f9831K = false;
        this.f9832L = false;
        this.f9838R.n(false);
        S(0);
    }

    public C0695p y0() {
        return this.f9866z;
    }

    public void z(Configuration configuration, boolean z4) {
        if (z4 && (this.f9864x instanceof H.c)) {
            u1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (C0695p pVar : this.f9843c.o()) {
            if (pVar != null) {
                pVar.S0(configuration);
                if (z4) {
                    pVar.f10186y.z(configuration, true);
                }
            }
        }
    }

    public C0695p z0() {
        return this.f9821A;
    }

    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public String f9877e;

        /* renamed from: f  reason: collision with root package name */
        public int f9878f;

        public class a implements Parcelable.Creator {
            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            /* renamed from: b */
            public k[] newArray(int i4) {
                return new k[i4];
            }
        }

        public k(String str, int i4) {
            this.f9877e = str;
            this.f9878f = i4;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f9877e);
            parcel.writeInt(this.f9878f);
        }

        public k(Parcel parcel) {
            this.f9877e = parcel.readString();
            this.f9878f = parcel.readInt();
        }
    }
}
