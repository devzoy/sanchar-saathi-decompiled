package p;

import I.b;
import S.C;
import X.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import h.j;
import java.lang.ref.WeakReference;

/* renamed from: p.x  reason: case insensitive filesystem */
public class C0856x {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f11620a;

    /* renamed from: b  reason: collision with root package name */
    public d0 f11621b;

    /* renamed from: c  reason: collision with root package name */
    public d0 f11622c;

    /* renamed from: d  reason: collision with root package name */
    public d0 f11623d;

    /* renamed from: e  reason: collision with root package name */
    public d0 f11624e;

    /* renamed from: f  reason: collision with root package name */
    public d0 f11625f;

    /* renamed from: g  reason: collision with root package name */
    public d0 f11626g;

    /* renamed from: h  reason: collision with root package name */
    public d0 f11627h;

    /* renamed from: i  reason: collision with root package name */
    public final C0858z f11628i;

    /* renamed from: j  reason: collision with root package name */
    public int f11629j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f11630k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f11631l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11632m;

    /* renamed from: p.x$a */
    public class a extends b.C0023b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11633a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f11634b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f11635c;

        public a(int i4, int i5, WeakReference weakReference) {
            this.f11633a = i4;
            this.f11634b = i5;
            this.f11635c = weakReference;
        }

        public void h(int i4) {
        }

        public void i(Typeface typeface) {
            int i4 = this.f11633a;
            if (i4 != -1) {
                typeface = Typeface.create(typeface, i4, (this.f11634b & 2) != 0);
            }
            C0856x.this.n(this.f11635c, typeface);
        }
    }

    public C0856x(TextView textView) {
        this.f11620a = textView;
        this.f11628i = new C0858z(textView);
    }

    public static d0 d(Context context, C0842i iVar, int i4) {
        ColorStateList f4 = iVar.f(context, i4);
        if (f4 == null) {
            return null;
        }
        d0 d0Var = new d0();
        d0Var.f11530d = true;
        d0Var.f11527a = f4;
        return d0Var;
    }

    public final void A(int i4, float f4) {
        this.f11628i.u(i4, f4);
    }

    public final void B(Context context, f0 f0Var) {
        String o4;
        this.f11629j = f0Var.k(j.f9454a3, this.f11629j);
        int k4 = f0Var.k(j.f9469d3, -1);
        this.f11630k = k4;
        if (k4 != -1) {
            this.f11629j &= 2;
        }
        boolean z4 = true;
        if (f0Var.s(j.f9464c3) || f0Var.s(j.f9474e3)) {
            this.f11631l = null;
            int i4 = f0Var.s(j.f9474e3) ? j.f9474e3 : j.f9464c3;
            int i5 = this.f11630k;
            int i6 = this.f11629j;
            if (!context.isRestricted()) {
                try {
                    Typeface j4 = f0Var.j(i4, this.f11629j, new a(i5, i6, new WeakReference(this.f11620a)));
                    if (j4 != null) {
                        if (this.f11630k != -1) {
                            this.f11631l = Typeface.create(Typeface.create(j4, 0), this.f11630k, (this.f11629j & 2) != 0);
                        } else {
                            this.f11631l = j4;
                        }
                    }
                    this.f11632m = this.f11631l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f11631l == null && (o4 = f0Var.o(i4)) != null) {
                if (this.f11630k != -1) {
                    Typeface create = Typeface.create(o4, 0);
                    int i7 = this.f11630k;
                    if ((this.f11629j & 2) == 0) {
                        z4 = false;
                    }
                    this.f11631l = Typeface.create(create, i7, z4);
                    return;
                }
                this.f11631l = Typeface.create(o4, this.f11629j);
            }
        } else if (f0Var.s(j.f9449Z2)) {
            this.f11632m = false;
            int k5 = f0Var.k(j.f9449Z2, 1);
            if (k5 == 1) {
                this.f11631l = Typeface.SANS_SERIF;
            } else if (k5 == 2) {
                this.f11631l = Typeface.SERIF;
            } else if (k5 == 3) {
                this.f11631l = Typeface.MONOSPACE;
            }
        }
    }

    public final void a(Drawable drawable, d0 d0Var) {
        if (drawable != null && d0Var != null) {
            C0842i.i(drawable, d0Var, this.f11620a.getDrawableState());
        }
    }

    public void b() {
        if (!(this.f11621b == null && this.f11622c == null && this.f11623d == null && this.f11624e == null)) {
            Drawable[] compoundDrawables = this.f11620a.getCompoundDrawables();
            a(compoundDrawables[0], this.f11621b);
            a(compoundDrawables[1], this.f11622c);
            a(compoundDrawables[2], this.f11623d);
            a(compoundDrawables[3], this.f11624e);
        }
        if (this.f11625f != null || this.f11626g != null) {
            Drawable[] compoundDrawablesRelative = this.f11620a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f11625f);
            a(compoundDrawablesRelative[2], this.f11626g);
        }
    }

    public void c() {
        this.f11628i.a();
    }

    public int e() {
        return this.f11628i.g();
    }

    public int f() {
        return this.f11628i.h();
    }

    public int g() {
        return this.f11628i.i();
    }

    public int[] h() {
        return this.f11628i.j();
    }

    public int i() {
        return this.f11628i.k();
    }

    public ColorStateList j() {
        d0 d0Var = this.f11627h;
        if (d0Var != null) {
            return d0Var.f11527a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        d0 d0Var = this.f11627h;
        if (d0Var != null) {
            return d0Var.f11528b;
        }
        return null;
    }

    public boolean l() {
        return this.f11628i.o();
    }

    public void m(AttributeSet attributeSet, int i4) {
        String str;
        String str2;
        boolean z4;
        boolean z5;
        AttributeSet attributeSet2 = attributeSet;
        int i5 = i4;
        Context context = this.f11620a.getContext();
        C0842i b4 = C0842i.b();
        f0 v4 = f0.v(context, attributeSet2, j.f9451a0, i5, 0);
        TextView textView = this.f11620a;
        C.e0(textView, textView.getContext(), j.f9451a0, attributeSet, v4.r(), i4, 0);
        int n4 = v4.n(j.f9456b0, -1);
        if (v4.s(j.f9471e0)) {
            this.f11621b = d(context, b4, v4.n(j.f9471e0, 0));
        }
        if (v4.s(j.f9461c0)) {
            this.f11622c = d(context, b4, v4.n(j.f9461c0, 0));
        }
        if (v4.s(j.f9476f0)) {
            this.f11623d = d(context, b4, v4.n(j.f9476f0, 0));
        }
        if (v4.s(j.f9466d0)) {
            this.f11624e = d(context, b4, v4.n(j.f9466d0, 0));
        }
        if (v4.s(j.f9481g0)) {
            this.f11625f = d(context, b4, v4.n(j.f9481g0, 0));
        }
        if (v4.s(j.f9486h0)) {
            this.f11626g = d(context, b4, v4.n(j.f9486h0, 0));
        }
        v4.w();
        boolean z6 = this.f11620a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z7 = true;
        if (n4 != -1) {
            f0 t4 = f0.t(context, n4, j.f9441X2);
            if (z6 || !t4.s(j.f9484g3)) {
                z5 = false;
                z4 = false;
            } else {
                z5 = t4.a(j.f9484g3, false);
                z4 = true;
            }
            B(context, t4);
            str2 = t4.s(j.f9489h3) ? t4.o(j.f9489h3) : null;
            str = t4.s(j.f9479f3) ? t4.o(j.f9479f3) : null;
            t4.w();
        } else {
            z5 = false;
            z4 = false;
            str2 = null;
            str = null;
        }
        f0 v5 = f0.v(context, attributeSet2, j.f9441X2, i5, 0);
        if (z6 || !v5.s(j.f9484g3)) {
            z7 = z4;
        } else {
            z5 = v5.a(j.f9484g3, false);
        }
        if (v5.s(j.f9489h3)) {
            str2 = v5.o(j.f9489h3);
        }
        if (v5.s(j.f9479f3)) {
            str = v5.o(j.f9479f3);
        }
        if (v5.s(j.f9445Y2) && v5.f(j.f9445Y2, -1) == 0) {
            this.f11620a.setTextSize(0, 0.0f);
        }
        B(context, v5);
        v5.w();
        if (!z6 && z7) {
            r(z5);
        }
        Typeface typeface = this.f11631l;
        if (typeface != null) {
            if (this.f11630k == -1) {
                this.f11620a.setTypeface(typeface, this.f11629j);
            } else {
                this.f11620a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.f11620a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            this.f11620a.setTextLocales(LocaleList.forLanguageTags(str2));
        }
        this.f11628i.p(attributeSet2, i5);
        if (X.b.f3438a && this.f11628i.k() != 0) {
            int[] j4 = this.f11628i.j();
            if (j4.length > 0) {
                if (((float) this.f11620a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f11620a.setAutoSizeTextTypeUniformWithConfiguration(this.f11628i.h(), this.f11628i.g(), this.f11628i.i(), 0);
                } else {
                    this.f11620a.setAutoSizeTextTypeUniformWithPresetSizes(j4, 0);
                }
            }
        }
        f0 u4 = f0.u(context, attributeSet2, j.f9491i0);
        int n5 = u4.n(j.f9531q0, -1);
        Drawable c4 = n5 != -1 ? b4.c(context, n5) : null;
        int n6 = u4.n(j.f9556v0, -1);
        Drawable c5 = n6 != -1 ? b4.c(context, n6) : null;
        int n7 = u4.n(j.f9536r0, -1);
        Drawable c6 = n7 != -1 ? b4.c(context, n7) : null;
        int n8 = u4.n(j.f9521o0, -1);
        Drawable c7 = n8 != -1 ? b4.c(context, n8) : null;
        int n9 = u4.n(j.f9541s0, -1);
        Drawable c8 = n9 != -1 ? b4.c(context, n9) : null;
        int n10 = u4.n(j.f9526p0, -1);
        x(c4, c5, c6, c7, c8, n10 != -1 ? b4.c(context, n10) : null);
        if (u4.s(j.f9546t0)) {
            h.f(this.f11620a, u4.c(j.f9546t0));
        }
        if (u4.s(j.f9551u0)) {
            h.g(this.f11620a, K.d(u4.k(j.f9551u0, -1), (PorterDuff.Mode) null));
        }
        int f4 = u4.f(j.f9561w0, -1);
        int f5 = u4.f(j.f9566x0, -1);
        int f6 = u4.f(j.f9571y0, -1);
        u4.w();
        if (f4 != -1) {
            h.i(this.f11620a, f4);
        }
        if (f5 != -1) {
            h.j(this.f11620a, f5);
        }
        if (f6 != -1) {
            h.k(this.f11620a, f6);
        }
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.f11632m) {
            this.f11631l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f11629j);
            }
        }
    }

    public void o(boolean z4, int i4, int i5, int i6, int i7) {
        if (!X.b.f3438a) {
            c();
        }
    }

    public void p() {
        b();
    }

    public void q(Context context, int i4) {
        String o4;
        f0 t4 = f0.t(context, i4, j.f9441X2);
        if (t4.s(j.f9484g3)) {
            r(t4.a(j.f9484g3, false));
        }
        if (t4.s(j.f9445Y2) && t4.f(j.f9445Y2, -1) == 0) {
            this.f11620a.setTextSize(0, 0.0f);
        }
        B(context, t4);
        if (t4.s(j.f9479f3) && (o4 = t4.o(j.f9479f3)) != null) {
            this.f11620a.setFontVariationSettings(o4);
        }
        t4.w();
        Typeface typeface = this.f11631l;
        if (typeface != null) {
            this.f11620a.setTypeface(typeface, this.f11629j);
        }
    }

    public void r(boolean z4) {
        this.f11620a.setAllCaps(z4);
    }

    public void s(int i4, int i5, int i6, int i7) {
        this.f11628i.q(i4, i5, i6, i7);
    }

    public void t(int[] iArr, int i4) {
        this.f11628i.r(iArr, i4);
    }

    public void u(int i4) {
        this.f11628i.s(i4);
    }

    public void v(ColorStateList colorStateList) {
        if (this.f11627h == null) {
            this.f11627h = new d0();
        }
        d0 d0Var = this.f11627h;
        d0Var.f11527a = colorStateList;
        d0Var.f11530d = colorStateList != null;
        y();
    }

    public void w(PorterDuff.Mode mode) {
        if (this.f11627h == null) {
            this.f11627h = new d0();
        }
        d0 d0Var = this.f11627h;
        d0Var.f11528b = mode;
        d0Var.f11529c = mode != null;
        y();
    }

    public final void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f11620a.getCompoundDrawablesRelative();
            TextView textView = this.f11620a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f11620a.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f11620a.getCompoundDrawables();
                TextView textView2 = this.f11620a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f11620a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
        }
    }

    public final void y() {
        d0 d0Var = this.f11627h;
        this.f11621b = d0Var;
        this.f11622c = d0Var;
        this.f11623d = d0Var;
        this.f11624e = d0Var;
        this.f11625f = d0Var;
        this.f11626g = d0Var;
    }

    public void z(int i4, float f4) {
        if (!X.b.f3438a && !l()) {
            A(i4, f4);
        }
    }
}
