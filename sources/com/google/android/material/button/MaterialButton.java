package com.google.android.material.button;

import S.C;
import V1.i;
import X.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import j.C0754a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l2.k;
import l2.n;
import p.C0838e;

public class MaterialButton extends C0838e implements Checkable, n {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f7714r = {16842911};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f7715s = {16842912};

    /* renamed from: t  reason: collision with root package name */
    public static final int f7716t = i.f3126g;

    /* renamed from: e  reason: collision with root package name */
    public final Y1.a f7717e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet f7718f;

    /* renamed from: g  reason: collision with root package name */
    public b f7719g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f7720h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f7721i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f7722j;

    /* renamed from: k  reason: collision with root package name */
    public int f7723k;

    /* renamed from: l  reason: collision with root package name */
    public int f7724l;

    /* renamed from: m  reason: collision with root package name */
    public int f7725m;

    /* renamed from: n  reason: collision with root package name */
    public int f7726n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7727o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7728p;

    /* renamed from: q  reason: collision with root package name */
    public int f7729q;

    public interface a {
        void a(MaterialButton materialButton, boolean z4);
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z4);
    }

    public static class c extends Z.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public boolean f7730g;

        public static class a implements Parcelable.ClassLoaderCreator {
            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            /* renamed from: c */
            public c[] newArray(int i4) {
                return new c[i4];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final void c(Parcel parcel) {
            boolean z4 = true;
            if (parcel.readInt() != 1) {
                z4 = false;
            }
            this.f7730g = z4;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f7730g ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            c(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, V1.a.f2981p);
    }

    private String getA11yClassName() {
        return (b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public void a(a aVar) {
        this.f7718f.add(aVar);
    }

    public boolean b() {
        Y1.a aVar = this.f7717e;
        return aVar != null && aVar.p();
    }

    public final boolean c() {
        int i4 = this.f7729q;
        return i4 == 3 || i4 == 4;
    }

    public final boolean d() {
        int i4 = this.f7729q;
        return i4 == 1 || i4 == 2;
    }

    public final boolean e() {
        int i4 = this.f7729q;
        return i4 == 16 || i4 == 32;
    }

    public final boolean f() {
        return C.x(this) == 1;
    }

    public final boolean g() {
        Y1.a aVar = this.f7717e;
        return aVar != null && !aVar.o();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (g()) {
            return this.f7717e.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f7722j;
    }

    public int getIconGravity() {
        return this.f7729q;
    }

    public int getIconPadding() {
        return this.f7726n;
    }

    public int getIconSize() {
        return this.f7723k;
    }

    public ColorStateList getIconTint() {
        return this.f7721i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f7720h;
    }

    public int getInsetBottom() {
        return this.f7717e.c();
    }

    public int getInsetTop() {
        return this.f7717e.d();
    }

    public ColorStateList getRippleColor() {
        if (g()) {
            return this.f7717e.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (g()) {
            return this.f7717e.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (g()) {
            return this.f7717e.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (g()) {
            return this.f7717e.k();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return g() ? this.f7717e.l() : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return g() ? this.f7717e.m() : super.getSupportBackgroundTintMode();
    }

    public void h(a aVar) {
        this.f7718f.remove(aVar);
    }

    public final void i() {
        if (d()) {
            h.h(this, this.f7722j, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (c()) {
            h.h(this, (Drawable) null, (Drawable) null, this.f7722j, (Drawable) null);
        } else if (e()) {
            h.h(this, (Drawable) null, this.f7722j, (Drawable) null, (Drawable) null);
        }
    }

    public boolean isChecked() {
        return this.f7727o;
    }

    public final void j(boolean z4) {
        Drawable drawable = this.f7722j;
        if (drawable != null) {
            Drawable mutate = K.a.l(drawable).mutate();
            this.f7722j = mutate;
            K.a.i(mutate, this.f7721i);
            PorterDuff.Mode mode = this.f7720h;
            if (mode != null) {
                K.a.j(this.f7722j, mode);
            }
            int i4 = this.f7723k;
            if (i4 == 0) {
                i4 = this.f7722j.getIntrinsicWidth();
            }
            int i5 = this.f7723k;
            if (i5 == 0) {
                i5 = this.f7722j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f7722j;
            int i6 = this.f7724l;
            int i7 = this.f7725m;
            drawable2.setBounds(i6, i7, i4 + i6, i5 + i7);
        }
        if (z4) {
            i();
            return;
        }
        Drawable[] a4 = h.a(this);
        Drawable drawable3 = a4[0];
        Drawable drawable4 = a4[1];
        Drawable drawable5 = a4[2];
        if ((d() && drawable3 != this.f7722j) || ((c() && drawable5 != this.f7722j) || (e() && drawable4 != this.f7722j))) {
            i();
        }
    }

    public final void k(int i4, int i5) {
        if (this.f7722j != null && getLayout() != null) {
            if (d() || c()) {
                this.f7725m = 0;
                int i6 = this.f7729q;
                boolean z4 = true;
                if (i6 == 1 || i6 == 3) {
                    this.f7724l = 0;
                    j(false);
                    return;
                }
                int i7 = this.f7723k;
                if (i7 == 0) {
                    i7 = this.f7722j.getIntrinsicWidth();
                }
                int textWidth = (((((i4 - getTextWidth()) - C.A(this)) - i7) - this.f7726n) - C.B(this)) / 2;
                boolean f4 = f();
                if (this.f7729q != 4) {
                    z4 = false;
                }
                if (f4 != z4) {
                    textWidth = -textWidth;
                }
                if (this.f7724l != textWidth) {
                    this.f7724l = textWidth;
                    j(false);
                }
            } else if (e()) {
                this.f7724l = 0;
                if (this.f7729q == 16) {
                    this.f7725m = 0;
                    j(false);
                    return;
                }
                int i8 = this.f7723k;
                if (i8 == 0) {
                    i8 = this.f7722j.getIntrinsicHeight();
                }
                int textHeight = (((((i5 - getTextHeight()) - getPaddingTop()) - i8) - this.f7726n) - getPaddingBottom()) / 2;
                if (this.f7725m != textHeight) {
                    this.f7725m = textHeight;
                    j(false);
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            l2.h.f(this, this.f7717e.f());
        }
    }

    public int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (b()) {
            View.mergeDrawableStates(onCreateDrawableState, f7714r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f7715s);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f7730g);
    }

    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f7730g = this.f7727o;
        return cVar;
    }

    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        k(i4, i5);
    }

    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        k(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i4) {
        if (g()) {
            this.f7717e.r(i4);
        } else {
            super.setBackgroundColor(i4);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!g()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f7717e.s();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i4) {
        setBackgroundDrawable(i4 != 0 ? C0754a.b(getContext(), i4) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z4) {
        if (g()) {
            this.f7717e.t(z4);
        }
    }

    public void setChecked(boolean z4) {
        if (b() && isEnabled() && this.f7727o != z4) {
            this.f7727o = z4;
            refreshDrawableState();
            if (!this.f7728p) {
                this.f7728p = true;
                Iterator it = this.f7718f.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(this, this.f7727o);
                }
                this.f7728p = false;
            }
        }
    }

    public void setCornerRadius(int i4) {
        if (g()) {
            this.f7717e.u(i4);
        }
    }

    public void setCornerRadiusResource(int i4) {
        if (g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i4));
        }
    }

    public void setElevation(float f4) {
        super.setElevation(f4);
        if (g()) {
            this.f7717e.f().T(f4);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f7722j != drawable) {
            this.f7722j = drawable;
            j(true);
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i4) {
        if (this.f7729q != i4) {
            this.f7729q = i4;
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i4) {
        if (this.f7726n != i4) {
            this.f7726n = i4;
            setCompoundDrawablePadding(i4);
        }
    }

    public void setIconResource(int i4) {
        setIcon(i4 != 0 ? C0754a.b(getContext(), i4) : null);
    }

    public void setIconSize(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f7723k != i4) {
            this.f7723k = i4;
            j(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f7721i != colorStateList) {
            this.f7721i = colorStateList;
            j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f7720h != mode) {
            this.f7720h = mode;
            j(false);
        }
    }

    public void setIconTintResource(int i4) {
        setIconTint(C0754a.a(getContext(), i4));
    }

    public void setInsetBottom(int i4) {
        this.f7717e.v(i4);
    }

    public void setInsetTop(int i4) {
        this.f7717e.w(i4);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f7719g = bVar;
    }

    public void setPressed(boolean z4) {
        b bVar = this.f7719g;
        if (bVar != null) {
            bVar.a(this, z4);
        }
        super.setPressed(z4);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (g()) {
            this.f7717e.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i4) {
        if (g()) {
            setRippleColor(C0754a.a(getContext(), i4));
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        if (g()) {
            this.f7717e.y(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z4) {
        if (g()) {
            this.f7717e.z(z4);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (g()) {
            this.f7717e.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i4) {
        if (g()) {
            setStrokeColor(C0754a.a(getContext(), i4));
        }
    }

    public void setStrokeWidth(int i4) {
        if (g()) {
            this.f7717e.B(i4);
        }
    }

    public void setStrokeWidthResource(int i4) {
        if (g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i4));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (g()) {
            this.f7717e.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (g()) {
            this.f7717e.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f7727o);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f7716t
            android.content.Context r9 = o2.C0822a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f7718f = r9
            r9 = 0
            r8.f7727o = r9
            r8.f7728p = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = V1.j.f3187K1
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = g2.i.h(r0, r1, r2, r3, r4, r5)
            int r1 = V1.j.f3246X1
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f7726n = r1
            int r1 = V1.j.f3259a2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = g2.j.e(r1, r2)
            r8.f7720h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = V1.j.f3254Z1
            android.content.res.ColorStateList r1 = i2.c.a(r1, r0, r2)
            r8.f7721i = r1
            android.content.Context r1 = r8.getContext()
            int r2 = V1.j.f3238V1
            android.graphics.drawable.Drawable r1 = i2.c.d(r1, r0, r2)
            r8.f7722j = r1
            int r1 = V1.j.f3242W1
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f7729q = r1
            int r1 = V1.j.f3250Y1
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f7723k = r1
            l2.k$b r10 = l2.k.e(r7, r10, r11, r6)
            l2.k r10 = r10.m()
            Y1.a r11 = new Y1.a
            r11.<init>(r8, r10)
            r8.f7717e = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.f7726n
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f7722j
            if (r10 == 0) goto L_0x0084
            r9 = r2
        L_0x0084:
            r8.j(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
