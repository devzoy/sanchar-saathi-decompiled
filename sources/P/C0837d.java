package p;

import S.C;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import h.j;

/* renamed from: p.d  reason: case insensitive filesystem */
public class C0837d {

    /* renamed from: a  reason: collision with root package name */
    public final View f11521a;

    /* renamed from: b  reason: collision with root package name */
    public final C0842i f11522b;

    /* renamed from: c  reason: collision with root package name */
    public int f11523c = -1;

    /* renamed from: d  reason: collision with root package name */
    public d0 f11524d;

    /* renamed from: e  reason: collision with root package name */
    public d0 f11525e;

    /* renamed from: f  reason: collision with root package name */
    public d0 f11526f;

    public C0837d(View view) {
        this.f11521a = view;
        this.f11522b = C0842i.b();
    }

    public final boolean a(Drawable drawable) {
        if (this.f11526f == null) {
            this.f11526f = new d0();
        }
        d0 d0Var = this.f11526f;
        d0Var.a();
        ColorStateList p4 = C.p(this.f11521a);
        if (p4 != null) {
            d0Var.f11530d = true;
            d0Var.f11527a = p4;
        }
        PorterDuff.Mode q4 = C.q(this.f11521a);
        if (q4 != null) {
            d0Var.f11529c = true;
            d0Var.f11528b = q4;
        }
        if (!d0Var.f11530d && !d0Var.f11529c) {
            return false;
        }
        C0842i.i(drawable, d0Var, this.f11521a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f11521a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            d0 d0Var = this.f11525e;
            if (d0Var != null) {
                C0842i.i(background, d0Var, this.f11521a.getDrawableState());
                return;
            }
            d0 d0Var2 = this.f11524d;
            if (d0Var2 != null) {
                C0842i.i(background, d0Var2, this.f11521a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        d0 d0Var = this.f11525e;
        if (d0Var != null) {
            return d0Var.f11527a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        d0 d0Var = this.f11525e;
        if (d0Var != null) {
            return d0Var.f11528b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i4) {
        f0 v4 = f0.v(this.f11521a.getContext(), attributeSet, j.f9408P3, i4, 0);
        View view = this.f11521a;
        C.e0(view, view.getContext(), j.f9408P3, attributeSet, v4.r(), i4, 0);
        try {
            if (v4.s(j.f9413Q3)) {
                this.f11523c = v4.n(j.f9413Q3, -1);
                ColorStateList f4 = this.f11522b.f(this.f11521a.getContext(), this.f11523c);
                if (f4 != null) {
                    h(f4);
                }
            }
            if (v4.s(j.R3)) {
                C.k0(this.f11521a, v4.c(j.R3));
            }
            if (v4.s(j.S3)) {
                C.l0(this.f11521a, K.d(v4.k(j.S3, -1), (PorterDuff.Mode) null));
            }
            v4.w();
        } catch (Throwable th) {
            v4.w();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.f11523c = -1;
        h((ColorStateList) null);
        b();
    }

    public void g(int i4) {
        this.f11523c = i4;
        C0842i iVar = this.f11522b;
        h(iVar != null ? iVar.f(this.f11521a.getContext(), i4) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f11524d == null) {
                this.f11524d = new d0();
            }
            d0 d0Var = this.f11524d;
            d0Var.f11527a = colorStateList;
            d0Var.f11530d = true;
        } else {
            this.f11524d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f11525e == null) {
            this.f11525e = new d0();
        }
        d0 d0Var = this.f11525e;
        d0Var.f11527a = colorStateList;
        d0Var.f11530d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f11525e == null) {
            this.f11525e = new d0();
        }
        d0 d0Var = this.f11525e;
        d0Var.f11528b = mode;
        d0Var.f11529c = true;
        b();
    }

    public final boolean k() {
        return this.f11524d != null;
    }
}
