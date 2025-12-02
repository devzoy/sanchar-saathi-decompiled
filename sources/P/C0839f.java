package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import h.C0645a;
import j.C0754a;

/* renamed from: p.f  reason: case insensitive filesystem */
public class C0839f extends CheckBox {

    /* renamed from: c  reason: collision with root package name */
    public final C0841h f11534c;

    /* renamed from: d  reason: collision with root package name */
    public final C0837d f11535d;

    /* renamed from: e  reason: collision with root package name */
    public final C0856x f11536e;

    public C0839f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9181o);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0837d dVar = this.f11535d;
        if (dVar != null) {
            dVar.b();
        }
        C0856x xVar = this.f11536e;
        if (xVar != null) {
            xVar.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0841h hVar = this.f11534c;
        return hVar != null ? hVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0837d dVar = this.f11535d;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0837d dVar = this.f11535d;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0841h hVar = this.f11534c;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0841h hVar = this.f11534c;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0837d dVar = this.f11535d;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0837d dVar = this.f11535d;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0841h hVar = this.f11534c;
        if (hVar != null) {
            hVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0837d dVar = this.f11535d;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0837d dVar = this.f11535d;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0841h hVar = this.f11534c;
        if (hVar != null) {
            hVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0841h hVar = this.f11534c;
        if (hVar != null) {
            hVar.h(mode);
        }
    }

    public C0839f(Context context, AttributeSet attributeSet, int i4) {
        super(c0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        C0841h hVar = new C0841h(this);
        this.f11534c = hVar;
        hVar.e(attributeSet, i4);
        C0837d dVar = new C0837d(this);
        this.f11535d = dVar;
        dVar.e(attributeSet, i4);
        C0856x xVar = new C0856x(this);
        this.f11536e = xVar;
        xVar.m(attributeSet, i4);
    }

    public void setButtonDrawable(int i4) {
        setButtonDrawable(C0754a.b(getContext(), i4));
    }
}
