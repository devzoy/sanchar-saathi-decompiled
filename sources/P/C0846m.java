package p;

import S.C;
import X.e;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import h.j;
import j.C0754a;

/* renamed from: p.m  reason: case insensitive filesystem */
public class C0846m {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f11565a;

    /* renamed from: b  reason: collision with root package name */
    public d0 f11566b;

    /* renamed from: c  reason: collision with root package name */
    public d0 f11567c;

    /* renamed from: d  reason: collision with root package name */
    public d0 f11568d;

    public C0846m(ImageView imageView) {
        this.f11565a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.f11568d == null) {
            this.f11568d = new d0();
        }
        d0 d0Var = this.f11568d;
        d0Var.a();
        ColorStateList a4 = e.a(this.f11565a);
        if (a4 != null) {
            d0Var.f11530d = true;
            d0Var.f11527a = a4;
        }
        PorterDuff.Mode b4 = e.b(this.f11565a);
        if (b4 != null) {
            d0Var.f11529c = true;
            d0Var.f11528b = b4;
        }
        if (!d0Var.f11530d && !d0Var.f11529c) {
            return false;
        }
        C0842i.i(drawable, d0Var, this.f11565a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable drawable = this.f11565a.getDrawable();
        if (drawable != null) {
            K.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!j() || !a(drawable)) {
            d0 d0Var = this.f11567c;
            if (d0Var != null) {
                C0842i.i(drawable, d0Var, this.f11565a.getDrawableState());
                return;
            }
            d0 d0Var2 = this.f11566b;
            if (d0Var2 != null) {
                C0842i.i(drawable, d0Var2, this.f11565a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        d0 d0Var = this.f11567c;
        if (d0Var != null) {
            return d0Var.f11527a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        d0 d0Var = this.f11567c;
        if (d0Var != null) {
            return d0Var.f11528b;
        }
        return null;
    }

    public boolean e() {
        return !(this.f11565a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i4) {
        int n4;
        f0 v4 = f0.v(this.f11565a.getContext(), attributeSet, j.f9414R, i4, 0);
        ImageView imageView = this.f11565a;
        C.e0(imageView, imageView.getContext(), j.f9414R, attributeSet, v4.r(), i4, 0);
        try {
            Drawable drawable = this.f11565a.getDrawable();
            if (!(drawable != null || (n4 = v4.n(j.f9418S, -1)) == -1 || (drawable = C0754a.b(this.f11565a.getContext(), n4)) == null)) {
                this.f11565a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                K.b(drawable);
            }
            if (v4.s(j.f9422T)) {
                e.c(this.f11565a, v4.c(j.f9422T));
            }
            if (v4.s(j.f9426U)) {
                e.d(this.f11565a, K.d(v4.k(j.f9426U, -1), (PorterDuff.Mode) null));
            }
            v4.w();
        } catch (Throwable th) {
            v4.w();
            throw th;
        }
    }

    public void g(int i4) {
        if (i4 != 0) {
            Drawable b4 = C0754a.b(this.f11565a.getContext(), i4);
            if (b4 != null) {
                K.b(b4);
            }
            this.f11565a.setImageDrawable(b4);
        } else {
            this.f11565a.setImageDrawable((Drawable) null);
        }
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f11567c == null) {
            this.f11567c = new d0();
        }
        d0 d0Var = this.f11567c;
        d0Var.f11527a = colorStateList;
        d0Var.f11530d = true;
        b();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f11567c == null) {
            this.f11567c = new d0();
        }
        d0 d0Var = this.f11567c;
        d0Var.f11528b = mode;
        d0Var.f11529c = true;
        b();
    }

    public final boolean j() {
        return this.f11566b != null;
    }
}
