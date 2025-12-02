package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import h.C0645a;
import j.C0754a;

public class r extends RadioButton {

    /* renamed from: c  reason: collision with root package name */
    public final C0841h f11579c;

    /* renamed from: d  reason: collision with root package name */
    public final C0837d f11580d;

    /* renamed from: e  reason: collision with root package name */
    public final C0856x f11581e;

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9158C);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0837d dVar = this.f11580d;
        if (dVar != null) {
            dVar.b();
        }
        C0856x xVar = this.f11581e;
        if (xVar != null) {
            xVar.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0841h hVar = this.f11579c;
        return hVar != null ? hVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0837d dVar = this.f11580d;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0837d dVar = this.f11580d;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0841h hVar = this.f11579c;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0841h hVar = this.f11579c;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0837d dVar = this.f11580d;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0837d dVar = this.f11580d;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0841h hVar = this.f11579c;
        if (hVar != null) {
            hVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0837d dVar = this.f11580d;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0837d dVar = this.f11580d;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0841h hVar = this.f11579c;
        if (hVar != null) {
            hVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0841h hVar = this.f11579c;
        if (hVar != null) {
            hVar.h(mode);
        }
    }

    public r(Context context, AttributeSet attributeSet, int i4) {
        super(c0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        C0841h hVar = new C0841h(this);
        this.f11579c = hVar;
        hVar.e(attributeSet, i4);
        C0837d dVar = new C0837d(this);
        this.f11580d = dVar;
        dVar.e(attributeSet, i4);
        C0856x xVar = new C0856x(this);
        this.f11581e = xVar;
        xVar.m(attributeSet, i4);
    }

    public void setButtonDrawable(int i4) {
        setButtonDrawable(C0754a.b(getContext(), i4));
    }
}
