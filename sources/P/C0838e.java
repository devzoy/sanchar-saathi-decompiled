package p;

import X.b;
import X.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import h.C0645a;

/* renamed from: p.e  reason: case insensitive filesystem */
public class C0838e extends Button implements b {

    /* renamed from: c  reason: collision with root package name */
    public final C0837d f11531c;

    /* renamed from: d  reason: collision with root package name */
    public final C0856x f11532d;

    public C0838e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9180n);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0837d dVar = this.f11531c;
        if (dVar != null) {
            dVar.b();
        }
        C0856x xVar = this.f11532d;
        if (xVar != null) {
            xVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f3438a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0856x xVar = this.f11532d;
        if (xVar != null) {
            return xVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f3438a) {
            return super.getAutoSizeMinTextSize();
        }
        C0856x xVar = this.f11532d;
        if (xVar != null) {
            return xVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f3438a) {
            return super.getAutoSizeStepGranularity();
        }
        C0856x xVar = this.f11532d;
        if (xVar != null) {
            return xVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f3438a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0856x xVar = this.f11532d;
        return xVar != null ? xVar.h() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (b.f3438a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0856x xVar = this.f11532d;
        if (xVar != null) {
            return xVar.i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0837d dVar = this.f11531c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0837d dVar = this.f11531c;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11532d.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11532d.k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        C0856x xVar = this.f11532d;
        if (xVar != null) {
            xVar.o(z4, i4, i5, i6, i7);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        C0856x xVar = this.f11532d;
        if (xVar != null && !b.f3438a && xVar.l()) {
            this.f11532d.c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (b.f3438a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        C0856x xVar = this.f11532d;
        if (xVar != null) {
            xVar.s(i4, i5, i6, i7);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (b.f3438a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        C0856x xVar = this.f11532d;
        if (xVar != null) {
            xVar.t(iArr, i4);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (b.f3438a) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        C0856x xVar = this.f11532d;
        if (xVar != null) {
            xVar.u(i4);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0837d dVar = this.f11531c;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0837d dVar = this.f11531c;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.o(this, callback));
    }

    public void setSupportAllCaps(boolean z4) {
        C0856x xVar = this.f11532d;
        if (xVar != null) {
            xVar.r(z4);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0837d dVar = this.f11531c;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0837d dVar = this.f11531c;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f11532d.v(colorStateList);
        this.f11532d.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f11532d.w(mode);
        this.f11532d.b();
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C0856x xVar = this.f11532d;
        if (xVar != null) {
            xVar.q(context, i4);
        }
    }

    public void setTextSize(int i4, float f4) {
        if (b.f3438a) {
            super.setTextSize(i4, f4);
            return;
        }
        C0856x xVar = this.f11532d;
        if (xVar != null) {
            xVar.z(i4, f4);
        }
    }

    public C0838e(Context context, AttributeSet attributeSet, int i4) {
        super(c0.b(context), attributeSet, i4);
        b0.a(this, getContext());
        C0837d dVar = new C0837d(this);
        this.f11531c = dVar;
        dVar.e(attributeSet, i4);
        C0856x xVar = new C0856x(this);
        this.f11532d = xVar;
        xVar.m(attributeSet, i4);
        xVar.b();
    }
}
