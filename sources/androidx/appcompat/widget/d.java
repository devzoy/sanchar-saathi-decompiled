package androidx.appcompat.widget;

import S.C;
import S.K;
import S.M;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import h.C0645a;
import h.C0649e;
import h.f;
import h.h;
import h.j;
import j.C0754a;
import o.C0808a;
import p.C0830E;
import p.f0;

public class d implements C0830E {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f4665a;

    /* renamed from: b  reason: collision with root package name */
    public int f4666b;

    /* renamed from: c  reason: collision with root package name */
    public View f4667c;

    /* renamed from: d  reason: collision with root package name */
    public View f4668d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f4669e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f4670f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f4671g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4672h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f4673i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f4674j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f4675k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f4676l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4677m;

    /* renamed from: n  reason: collision with root package name */
    public a f4678n;

    /* renamed from: o  reason: collision with root package name */
    public int f4679o;

    /* renamed from: p  reason: collision with root package name */
    public int f4680p;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f4681q;

    public class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final C0808a f4682c;

        public a() {
            this.f4682c = new C0808a(d.this.f4665a.getContext(), 0, 16908332, 0, 0, d.this.f4673i);
        }

        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.f4676l;
            if (callback != null && dVar.f4677m) {
                callback.onMenuItemSelected(0, this.f4682c);
            }
        }
    }

    public class b extends M {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4684a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f4685b;

        public b(int i4) {
            this.f4685b = i4;
        }

        public void a(View view) {
            this.f4684a = true;
        }

        public void b(View view) {
            if (!this.f4684a) {
                d.this.f4665a.setVisibility(this.f4685b);
            }
        }

        public void c(View view) {
            d.this.f4665a.setVisibility(0);
        }
    }

    public d(Toolbar toolbar, boolean z4) {
        this(toolbar, z4, h.f9314a, C0649e.f9241n);
    }

    public void A(int i4) {
        B(i4 == 0 ? null : a().getString(i4));
    }

    public void B(CharSequence charSequence) {
        this.f4675k = charSequence;
        G();
    }

    public void C(Drawable drawable) {
        this.f4671g = drawable;
        H();
    }

    public void D(CharSequence charSequence) {
        this.f4674j = charSequence;
        if ((this.f4666b & 8) != 0) {
            this.f4665a.setSubtitle(charSequence);
        }
    }

    public void E(CharSequence charSequence) {
        this.f4672h = true;
        F(charSequence);
    }

    public final void F(CharSequence charSequence) {
        this.f4673i = charSequence;
        if ((this.f4666b & 8) != 0) {
            this.f4665a.setTitle(charSequence);
        }
    }

    public final void G() {
        if ((this.f4666b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f4675k)) {
            this.f4665a.setNavigationContentDescription(this.f4680p);
        } else {
            this.f4665a.setNavigationContentDescription(this.f4675k);
        }
    }

    public final void H() {
        if ((this.f4666b & 4) != 0) {
            Toolbar toolbar = this.f4665a;
            Drawable drawable = this.f4671g;
            if (drawable == null) {
                drawable = this.f4681q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f4665a.setNavigationIcon((Drawable) null);
    }

    public final void I() {
        Drawable drawable;
        int i4 = this.f4666b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) != 0) {
            drawable = this.f4670f;
            if (drawable == null) {
                drawable = this.f4669e;
            }
        } else {
            drawable = this.f4669e;
        }
        this.f4665a.setLogo(drawable);
    }

    public Context a() {
        return this.f4665a.getContext();
    }

    public void b(Menu menu, i.a aVar) {
        if (this.f4678n == null) {
            a aVar2 = new a(this.f4665a.getContext());
            this.f4678n = aVar2;
            aVar2.p(f.f9275g);
        }
        this.f4678n.k(aVar);
        this.f4665a.I((e) menu, this.f4678n);
    }

    public boolean c() {
        return this.f4665a.A();
    }

    public void collapseActionView() {
        this.f4665a.e();
    }

    public void d() {
        this.f4677m = true;
    }

    public boolean e() {
        return this.f4665a.z();
    }

    public boolean f() {
        return this.f4665a.w();
    }

    public boolean g() {
        return this.f4665a.N();
    }

    public CharSequence getTitle() {
        return this.f4665a.getTitle();
    }

    public boolean h() {
        return this.f4665a.d();
    }

    public void i() {
        this.f4665a.f();
    }

    public void j(int i4) {
        this.f4665a.setVisibility(i4);
    }

    public void k(c cVar) {
        Toolbar toolbar;
        View view = this.f4667c;
        if (view != null && view.getParent() == (toolbar = this.f4665a)) {
            toolbar.removeView(this.f4667c);
        }
        this.f4667c = cVar;
    }

    public ViewGroup l() {
        return this.f4665a;
    }

    public void m(boolean z4) {
    }

    public boolean n() {
        return this.f4665a.v();
    }

    public void o(int i4) {
        View view;
        int i5 = this.f4666b ^ i4;
        this.f4666b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i5 & 3) != 0) {
                I();
            }
            if ((i5 & 8) != 0) {
                if ((i4 & 8) != 0) {
                    this.f4665a.setTitle(this.f4673i);
                    this.f4665a.setSubtitle(this.f4674j);
                } else {
                    this.f4665a.setTitle((CharSequence) null);
                    this.f4665a.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) != 0 && (view = this.f4668d) != null) {
                if ((i4 & 16) != 0) {
                    this.f4665a.addView(view);
                } else {
                    this.f4665a.removeView(view);
                }
            }
        }
    }

    public int p() {
        return this.f4666b;
    }

    public void q(int i4) {
        z(i4 != 0 ? C0754a.b(a(), i4) : null);
    }

    public int r() {
        return this.f4679o;
    }

    public K s(int i4, long j4) {
        return C.d(this.f4665a).b(i4 == 0 ? 1.0f : 0.0f).f(j4).h(new b(i4));
    }

    public void setIcon(int i4) {
        setIcon(i4 != 0 ? C0754a.b(a(), i4) : null);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f4676l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f4672h) {
            F(charSequence);
        }
    }

    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void v(boolean z4) {
        this.f4665a.setCollapsible(z4);
    }

    public final int w() {
        if (this.f4665a.getNavigationIcon() == null) {
            return 11;
        }
        this.f4681q = this.f4665a.getNavigationIcon();
        return 15;
    }

    public void x(View view) {
        View view2 = this.f4668d;
        if (!(view2 == null || (this.f4666b & 16) == 0)) {
            this.f4665a.removeView(view2);
        }
        this.f4668d = view;
        if (view != null && (this.f4666b & 16) != 0) {
            this.f4665a.addView(view);
        }
    }

    public void y(int i4) {
        if (i4 != this.f4680p) {
            this.f4680p = i4;
            if (TextUtils.isEmpty(this.f4665a.getNavigationContentDescription())) {
                A(this.f4680p);
            }
        }
    }

    public void z(Drawable drawable) {
        this.f4670f = drawable;
        I();
    }

    public d(Toolbar toolbar, boolean z4, int i4, int i5) {
        Drawable drawable;
        this.f4679o = 0;
        this.f4680p = 0;
        this.f4665a = toolbar;
        this.f4673i = toolbar.getTitle();
        this.f4674j = toolbar.getSubtitle();
        this.f4672h = this.f4673i != null;
        this.f4671g = toolbar.getNavigationIcon();
        f0 v4 = f0.v(toolbar.getContext(), (AttributeSet) null, j.f9450a, C0645a.f9169c, 0);
        this.f4681q = v4.g(j.f9505l);
        if (z4) {
            CharSequence p4 = v4.p(j.f9535r);
            if (!TextUtils.isEmpty(p4)) {
                E(p4);
            }
            CharSequence p5 = v4.p(j.f9525p);
            if (!TextUtils.isEmpty(p5)) {
                D(p5);
            }
            Drawable g4 = v4.g(j.f9515n);
            if (g4 != null) {
                z(g4);
            }
            Drawable g5 = v4.g(j.f9510m);
            if (g5 != null) {
                setIcon(g5);
            }
            if (this.f4671g == null && (drawable = this.f4681q) != null) {
                C(drawable);
            }
            o(v4.k(j.f9485h, 0));
            int n4 = v4.n(j.f9480g, 0);
            if (n4 != 0) {
                x(LayoutInflater.from(this.f4665a.getContext()).inflate(n4, this.f4665a, false));
                o(this.f4666b | 16);
            }
            int m4 = v4.m(j.f9495j, 0);
            if (m4 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f4665a.getLayoutParams();
                layoutParams.height = m4;
                this.f4665a.setLayoutParams(layoutParams);
            }
            int e4 = v4.e(j.f9475f, -1);
            int e5 = v4.e(j.f9470e, -1);
            if (e4 >= 0 || e5 >= 0) {
                this.f4665a.H(Math.max(e4, 0), Math.max(e5, 0));
            }
            int n5 = v4.n(j.f9540s, 0);
            if (n5 != 0) {
                Toolbar toolbar2 = this.f4665a;
                toolbar2.K(toolbar2.getContext(), n5);
            }
            int n6 = v4.n(j.f9530q, 0);
            if (n6 != 0) {
                Toolbar toolbar3 = this.f4665a;
                toolbar3.J(toolbar3.getContext(), n6);
            }
            int n7 = v4.n(j.f9520o, 0);
            if (n7 != 0) {
                this.f4665a.setPopupTheme(n7);
            }
        } else {
            this.f4666b = w();
        }
        v4.w();
        y(i4);
        this.f4675k = this.f4665a.getNavigationContentDescription();
        this.f4665a.setNavigationOnClickListener(new a());
    }

    public void setIcon(Drawable drawable) {
        this.f4669e = drawable;
        I();
    }
}
