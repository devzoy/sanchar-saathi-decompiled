package i;

import S.C;
import S.K;
import S.L;
import S.M;
import S.N;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import h.C0645a;
import h.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import n.C0796a;
import n.b;
import n.g;
import n.h;
import p.C0830E;

public class j extends C0674a implements ActionBarOverlayLayout.d {

    /* renamed from: D  reason: collision with root package name */
    public static final Interpolator f9765D = new AccelerateInterpolator();

    /* renamed from: E  reason: collision with root package name */
    public static final Interpolator f9766E = new DecelerateInterpolator();

    /* renamed from: A  reason: collision with root package name */
    public final L f9767A = new a();

    /* renamed from: B  reason: collision with root package name */
    public final L f9768B = new b();

    /* renamed from: C  reason: collision with root package name */
    public final N f9769C = new c();

    /* renamed from: a  reason: collision with root package name */
    public Context f9770a;

    /* renamed from: b  reason: collision with root package name */
    public Context f9771b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f9772c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarOverlayLayout f9773d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContainer f9774e;

    /* renamed from: f  reason: collision with root package name */
    public C0830E f9775f;

    /* renamed from: g  reason: collision with root package name */
    public ActionBarContextView f9776g;

    /* renamed from: h  reason: collision with root package name */
    public View f9777h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f9778i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public int f9779j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9780k;

    /* renamed from: l  reason: collision with root package name */
    public d f9781l;

    /* renamed from: m  reason: collision with root package name */
    public n.b f9782m;

    /* renamed from: n  reason: collision with root package name */
    public b.a f9783n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9784o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f9785p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public boolean f9786q;

    /* renamed from: r  reason: collision with root package name */
    public int f9787r = 0;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9788s = true;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9789t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9790u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9791v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f9792w = true;

    /* renamed from: x  reason: collision with root package name */
    public h f9793x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f9794y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f9795z;

    public class a extends M {
        public a() {
        }

        public void b(View view) {
            View view2;
            j jVar = j.this;
            if (jVar.f9788s && (view2 = jVar.f9777h) != null) {
                view2.setTranslationY(0.0f);
                j.this.f9774e.setTranslationY(0.0f);
            }
            j.this.f9774e.setVisibility(8);
            j.this.f9774e.setTransitioning(false);
            j jVar2 = j.this;
            jVar2.f9793x = null;
            jVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = j.this.f9773d;
            if (actionBarOverlayLayout != null) {
                C.d0(actionBarOverlayLayout);
            }
        }
    }

    public class b extends M {
        public b() {
        }

        public void b(View view) {
            j jVar = j.this;
            jVar.f9793x = null;
            jVar.f9774e.requestLayout();
        }
    }

    public class c implements N {
        public c() {
        }

        public void a(View view) {
            ((View) j.this.f9774e.getParent()).invalidate();
        }
    }

    public class d extends n.b implements e.a {

        /* renamed from: e  reason: collision with root package name */
        public final Context f9799e;

        /* renamed from: f  reason: collision with root package name */
        public final e f9800f;

        /* renamed from: g  reason: collision with root package name */
        public b.a f9801g;

        /* renamed from: h  reason: collision with root package name */
        public WeakReference f9802h;

        public d(Context context, b.a aVar) {
            this.f9799e = context;
            this.f9801g = aVar;
            e S3 = new e(context).S(1);
            this.f9800f = S3;
            S3.R(this);
        }

        public boolean a(e eVar, MenuItem menuItem) {
            b.a aVar = this.f9801g;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        public void b(e eVar) {
            if (this.f9801g != null) {
                k();
                j.this.f9776g.l();
            }
        }

        public void c() {
            j jVar = j.this;
            if (jVar.f9781l == this) {
                if (!j.w(jVar.f9789t, jVar.f9790u, false)) {
                    j jVar2 = j.this;
                    jVar2.f9782m = this;
                    jVar2.f9783n = this.f9801g;
                } else {
                    this.f9801g.c(this);
                }
                this.f9801g = null;
                j.this.v(false);
                j.this.f9776g.g();
                j.this.f9775f.l().sendAccessibilityEvent(32);
                j jVar3 = j.this;
                jVar3.f9773d.setHideOnContentScrollEnabled(jVar3.f9795z);
                j.this.f9781l = null;
            }
        }

        public View d() {
            WeakReference weakReference = this.f9802h;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f9800f;
        }

        public MenuInflater f() {
            return new g(this.f9799e);
        }

        public CharSequence g() {
            return j.this.f9776g.getSubtitle();
        }

        public CharSequence i() {
            return j.this.f9776g.getTitle();
        }

        public void k() {
            if (j.this.f9781l == this) {
                this.f9800f.d0();
                try {
                    this.f9801g.d(this, this.f9800f);
                } finally {
                    this.f9800f.c0();
                }
            }
        }

        public boolean l() {
            return j.this.f9776g.j();
        }

        public void m(View view) {
            j.this.f9776g.setCustomView(view);
            this.f9802h = new WeakReference(view);
        }

        public void n(int i4) {
            o(j.this.f9770a.getResources().getString(i4));
        }

        public void o(CharSequence charSequence) {
            j.this.f9776g.setSubtitle(charSequence);
        }

        public void q(int i4) {
            r(j.this.f9770a.getResources().getString(i4));
        }

        public void r(CharSequence charSequence) {
            j.this.f9776g.setTitle(charSequence);
        }

        public void s(boolean z4) {
            super.s(z4);
            j.this.f9776g.setTitleOptional(z4);
        }

        public boolean t() {
            this.f9800f.d0();
            try {
                return this.f9801g.a(this, this.f9800f);
            } finally {
                this.f9800f.c0();
            }
        }
    }

    public j(Activity activity, boolean z4) {
        this.f9772c = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (!z4) {
            this.f9777h = decorView.findViewById(16908290);
        }
    }

    public static boolean w(boolean z4, boolean z5, boolean z6) {
        if (z6) {
            return true;
        }
        return !z4 && !z5;
    }

    public final C0830E A(View view) {
        if (view instanceof C0830E) {
            return (C0830E) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public int B() {
        return this.f9775f.r();
    }

    public final void C() {
        if (this.f9791v) {
            this.f9791v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f9773d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    public final void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.f9284p);
        this.f9773d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f9775f = A(view.findViewById(f.f9269a));
        this.f9776g = (ActionBarContextView) view.findViewById(f.f9274f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.f9271c);
        this.f9774e = actionBarContainer;
        C0830E e4 = this.f9775f;
        if (e4 == null || this.f9776g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f9770a = e4.a();
        boolean z4 = (this.f9775f.p() & 4) != 0;
        if (z4) {
            this.f9780k = true;
        }
        C0796a b4 = C0796a.b(this.f9770a);
        J(b4.a() || z4);
        H(b4.e());
        TypedArray obtainStyledAttributes = this.f9770a.obtainStyledAttributes((AttributeSet) null, h.j.f9450a, C0645a.f9169c, 0);
        if (obtainStyledAttributes.getBoolean(h.j.f9500k, false)) {
            I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(h.j.f9490i, 0);
        if (dimensionPixelSize != 0) {
            G((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void E(boolean z4) {
        F(z4 ? 4 : 0, 4);
    }

    public void F(int i4, int i5) {
        int p4 = this.f9775f.p();
        if ((i5 & 4) != 0) {
            this.f9780k = true;
        }
        this.f9775f.o((i4 & i5) | ((~i5) & p4));
    }

    public void G(float f4) {
        C.n0(this.f9774e, f4);
    }

    public final void H(boolean z4) {
        this.f9786q = z4;
        if (!z4) {
            this.f9775f.k((androidx.appcompat.widget.c) null);
            this.f9774e.setTabContainer((androidx.appcompat.widget.c) null);
        } else {
            this.f9774e.setTabContainer((androidx.appcompat.widget.c) null);
            this.f9775f.k((androidx.appcompat.widget.c) null);
        }
        boolean z5 = false;
        boolean z6 = B() == 2;
        this.f9775f.v(!this.f9786q && z6);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9773d;
        if (!this.f9786q && z6) {
            z5 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z5);
    }

    public void I(boolean z4) {
        if (!z4 || this.f9773d.w()) {
            this.f9795z = z4;
            this.f9773d.setHideOnContentScrollEnabled(z4);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void J(boolean z4) {
        this.f9775f.m(z4);
    }

    public final boolean K() {
        return C.M(this.f9774e);
    }

    public final void L() {
        if (!this.f9791v) {
            this.f9791v = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f9773d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            M(false);
        }
    }

    public final void M(boolean z4) {
        if (w(this.f9789t, this.f9790u, this.f9791v)) {
            if (!this.f9792w) {
                this.f9792w = true;
                z(z4);
            }
        } else if (this.f9792w) {
            this.f9792w = false;
            y(z4);
        }
    }

    public void a() {
        if (this.f9790u) {
            this.f9790u = false;
            M(true);
        }
    }

    public void b() {
        h hVar = this.f9793x;
        if (hVar != null) {
            hVar.a();
            this.f9793x = null;
        }
    }

    public void c(int i4) {
        this.f9787r = i4;
    }

    public void d() {
    }

    public void e(boolean z4) {
        this.f9788s = z4;
    }

    public void f() {
        if (!this.f9790u) {
            this.f9790u = true;
            M(true);
        }
    }

    public boolean h() {
        C0830E e4 = this.f9775f;
        if (e4 == null || !e4.n()) {
            return false;
        }
        this.f9775f.collapseActionView();
        return true;
    }

    public void i(boolean z4) {
        if (z4 != this.f9784o) {
            this.f9784o = z4;
            if (this.f9785p.size() > 0) {
                android.support.v4.media.session.b.a(this.f9785p.get(0));
                throw null;
            }
        }
    }

    public int j() {
        return this.f9775f.p();
    }

    public Context k() {
        if (this.f9771b == null) {
            TypedValue typedValue = new TypedValue();
            this.f9770a.getTheme().resolveAttribute(C0645a.f9171e, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                this.f9771b = new ContextThemeWrapper(this.f9770a, i4);
            } else {
                this.f9771b = this.f9770a;
            }
        }
        return this.f9771b;
    }

    public void m(Configuration configuration) {
        H(C0796a.b(this.f9770a).e());
    }

    public boolean o(int i4, KeyEvent keyEvent) {
        Menu e4;
        d dVar = this.f9781l;
        if (dVar == null || (e4 = dVar.e()) == null) {
            return false;
        }
        boolean z4 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z4 = false;
        }
        e4.setQwertyMode(z4);
        return e4.performShortcut(i4, keyEvent, 0);
    }

    public void r(boolean z4) {
        if (!this.f9780k) {
            E(z4);
        }
    }

    public void s(boolean z4) {
        h hVar;
        this.f9794y = z4;
        if (!z4 && (hVar = this.f9793x) != null) {
            hVar.a();
        }
    }

    public void t(CharSequence charSequence) {
        this.f9775f.setWindowTitle(charSequence);
    }

    public n.b u(b.a aVar) {
        d dVar = this.f9781l;
        if (dVar != null) {
            dVar.c();
        }
        this.f9773d.setHideOnContentScrollEnabled(false);
        this.f9776g.k();
        d dVar2 = new d(this.f9776g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f9781l = dVar2;
        dVar2.k();
        this.f9776g.h(dVar2);
        v(true);
        this.f9776g.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void v(boolean z4) {
        K k4;
        K k5;
        if (z4) {
            L();
        } else {
            C();
        }
        if (K()) {
            if (z4) {
                k4 = this.f9775f.s(4, 100);
                k5 = this.f9776g.f(0, 200);
            } else {
                k5 = this.f9775f.s(0, 200);
                k4 = this.f9776g.f(8, 100);
            }
            h hVar = new h();
            hVar.d(k4, k5);
            hVar.h();
        } else if (z4) {
            this.f9775f.j(4);
            this.f9776g.setVisibility(0);
        } else {
            this.f9775f.j(0);
            this.f9776g.setVisibility(8);
        }
    }

    public void x() {
        b.a aVar = this.f9783n;
        if (aVar != null) {
            aVar.c(this.f9782m);
            this.f9782m = null;
            this.f9783n = null;
        }
    }

    public void y(boolean z4) {
        View view;
        h hVar = this.f9793x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f9787r != 0 || (!this.f9794y && !z4)) {
            this.f9767A.b((View) null);
            return;
        }
        this.f9774e.setAlpha(1.0f);
        this.f9774e.setTransitioning(true);
        h hVar2 = new h();
        float f4 = (float) (-this.f9774e.getHeight());
        if (z4) {
            int[] iArr = {0, 0};
            this.f9774e.getLocationInWindow(iArr);
            f4 -= (float) iArr[1];
        }
        K m4 = C.d(this.f9774e).m(f4);
        m4.k(this.f9769C);
        hVar2.c(m4);
        if (this.f9788s && (view = this.f9777h) != null) {
            hVar2.c(C.d(view).m(f4));
        }
        hVar2.f(f9765D);
        hVar2.e(250);
        hVar2.g(this.f9767A);
        this.f9793x = hVar2;
        hVar2.h();
    }

    public void z(boolean z4) {
        View view;
        View view2;
        h hVar = this.f9793x;
        if (hVar != null) {
            hVar.a();
        }
        this.f9774e.setVisibility(0);
        if (this.f9787r != 0 || (!this.f9794y && !z4)) {
            this.f9774e.setAlpha(1.0f);
            this.f9774e.setTranslationY(0.0f);
            if (this.f9788s && (view = this.f9777h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f9768B.b((View) null);
        } else {
            this.f9774e.setTranslationY(0.0f);
            float f4 = (float) (-this.f9774e.getHeight());
            if (z4) {
                int[] iArr = {0, 0};
                this.f9774e.getLocationInWindow(iArr);
                f4 -= (float) iArr[1];
            }
            this.f9774e.setTranslationY(f4);
            h hVar2 = new h();
            K m4 = C.d(this.f9774e).m(0.0f);
            m4.k(this.f9769C);
            hVar2.c(m4);
            if (this.f9788s && (view2 = this.f9777h) != null) {
                view2.setTranslationY(f4);
                hVar2.c(C.d(this.f9777h).m(0.0f));
            }
            hVar2.f(f9766E);
            hVar2.e(250);
            hVar2.g(this.f9768B);
            this.f9793x = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9773d;
        if (actionBarOverlayLayout != null) {
            C.d0(actionBarOverlayLayout);
        }
    }

    public j(Dialog dialog) {
        D(dialog.getWindow().getDecorView());
    }
}
