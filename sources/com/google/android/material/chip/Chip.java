package com.google.android.material.chip;

import S.C;
import S.C0310a;
import T.m;
import V1.h;
import V1.i;
import V1.j;
import a0.C0340a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.a;
import i2.d;
import i2.f;
import j2.C0761b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import l2.k;
import l2.n;
import p.C0839f;

public class Chip extends C0839f implements a.C0128a, n {

    /* renamed from: v  reason: collision with root package name */
    public static final int f7752v = i.f3128i;

    /* renamed from: w  reason: collision with root package name */
    public static final Rect f7753w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f7754x = {16842913};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f7755y = {16842911};

    /* renamed from: f  reason: collision with root package name */
    public a f7756f;

    /* renamed from: g  reason: collision with root package name */
    public InsetDrawable f7757g;

    /* renamed from: h  reason: collision with root package name */
    public RippleDrawable f7758h;

    /* renamed from: i  reason: collision with root package name */
    public View.OnClickListener f7759i;

    /* renamed from: j  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f7760j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7761k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7762l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7763m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7764n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7765o;

    /* renamed from: p  reason: collision with root package name */
    public int f7766p;

    /* renamed from: q  reason: collision with root package name */
    public int f7767q;

    /* renamed from: r  reason: collision with root package name */
    public final c f7768r;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f7769s;

    /* renamed from: t  reason: collision with root package name */
    public final RectF f7770t;

    /* renamed from: u  reason: collision with root package name */
    public final f f7771u;

    public class a extends f {
        public a() {
        }

        public void a(int i4) {
        }

        public void b(Typeface typeface, boolean z4) {
            Chip chip = Chip.this;
            chip.setText(chip.f7756f.G2() ? Chip.this.f7756f.c1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        public void getOutline(View view, Outline outline) {
            if (Chip.this.f7756f != null) {
                Chip.this.f7756f.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class c extends C0340a {
        public c(Chip chip) {
            super(chip);
        }

        public int B(float f4, float f5) {
            return (!Chip.this.n() || !Chip.this.getCloseIconTouchBounds().contains(f4, f5)) ? 0 : 1;
        }

        public void C(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f7759i != null) {
                list.add(1);
            }
        }

        public boolean J(int i4, int i5, Bundle bundle) {
            if (i5 != 16) {
                return false;
            }
            if (i4 == 0) {
                return Chip.this.performClick();
            }
            if (i4 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        public void M(m mVar) {
            mVar.a0(Chip.this.r());
            mVar.d0(Chip.this.isClickable());
            if (Chip.this.r() || Chip.this.isClickable()) {
                mVar.c0(Chip.this.r() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                mVar.c0("android.view.View");
            }
            mVar.y0(Chip.this.getText());
        }

        public void N(int i4, m mVar) {
            CharSequence charSequence = "";
            if (i4 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    mVar.g0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i5 = h.f3111h;
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    mVar.g0(context.getString(i5, new Object[]{charSequence}).trim());
                }
                mVar.Y(Chip.this.getCloseIconTouchBoundsInt());
                mVar.b(m.a.f2826i);
                mVar.i0(Chip.this.isEnabled());
                return;
            }
            mVar.g0(charSequence);
            mVar.Y(Chip.f7753w);
        }

        public void O(int i4, boolean z4) {
            if (i4 == 1) {
                boolean unused = Chip.this.f7764n = z4;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, V1.a.f2970e);
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f7770t.setEmpty();
        if (n() && this.f7759i != null) {
            this.f7756f.T0(this.f7770t);
        }
        return this.f7770t;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f7769s.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f7769s;
    }

    private d getTextAppearance() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z4) {
        if (this.f7763m != z4) {
            this.f7763m = z4;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z4) {
        if (this.f7762l != z4) {
            this.f7762l = z4;
            refreshDrawableState();
        }
    }

    public final void A() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f7756f) != null) {
            int E02 = (int) (aVar.E0() + this.f7756f.e1() + this.f7756f.l0());
            int J02 = (int) (this.f7756f.J0() + this.f7756f.f1() + this.f7756f.h0());
            if (this.f7757g != null) {
                Rect rect = new Rect();
                this.f7757g.getPadding(rect);
                J02 += rect.left;
                E02 += rect.right;
            }
            C.u0(this, J02, getPaddingTop(), E02, getPaddingBottom());
        }
    }

    public final void B() {
        TextPaint paint = getPaint();
        a aVar = this.f7756f;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.j(getContext(), paint, this.f7771u);
        }
    }

    public final void C(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    public void a() {
        k(this.f7767q);
        requestLayout();
        invalidateOutline();
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m(motionEvent) || this.f7768r.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f7768r.w(keyEvent) || this.f7768r.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f7756f;
        if ((aVar == null || !aVar.k1()) ? false : this.f7756f.g2(j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f7757g;
        return insetDrawable == null ? this.f7756f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.A0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.B0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return Math.max(0.0f, aVar.D0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f7756f;
    }

    public float getChipEndPadding() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.E0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.F0();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.G0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.S0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f7768r.A() == 1 || this.f7768r.x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public W1.c getHideMotionSpec() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f7756f.B();
    }

    public W1.c getShowMotionSpec() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.e1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f7756f;
        if (aVar != null) {
            return aVar.f1();
        }
        return 0.0f;
    }

    public final void i(a aVar) {
        aVar.k2(this);
    }

    public final int[] j() {
        int isEnabled = isEnabled();
        if (this.f7764n) {
            isEnabled++;
        }
        if (this.f7763m) {
            isEnabled++;
        }
        if (this.f7762l) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i4 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i4 = 1;
        }
        if (this.f7764n) {
            iArr[i4] = 16842908;
            i4++;
        }
        if (this.f7763m) {
            iArr[i4] = 16843623;
            i4++;
        }
        if (this.f7762l) {
            iArr[i4] = 16842919;
            i4++;
        }
        if (isChecked()) {
            iArr[i4] = 16842913;
        }
        return iArr;
    }

    public boolean k(int i4) {
        this.f7767q = i4;
        int i5 = 0;
        if (!v()) {
            if (this.f7757g != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int max = Math.max(0, i4 - this.f7756f.getIntrinsicHeight());
        int max2 = Math.max(0, i4 - this.f7756f.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i6 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i5 = max / 2;
            }
            if (this.f7757g != null) {
                Rect rect = new Rect();
                this.f7757g.getPadding(rect);
                if (rect.top == i5 && rect.bottom == i5 && rect.left == i6 && rect.right == i6) {
                    y();
                    return true;
                }
            }
            if (getMinHeight() != i4) {
                setMinHeight(i4);
            }
            if (getMinWidth() != i4) {
                setMinWidth(i4);
            }
            q(i6, i5, i6, i5);
            y();
            return true;
        }
        if (this.f7757g != null) {
            u();
        } else {
            y();
        }
        return false;
    }

    public final void l() {
        if (getBackgroundDrawable() == this.f7757g && this.f7756f.getCallback() == null) {
            this.f7756f.setCallback(this.f7757g);
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        Class<C0340a> cls = C0340a.class;
        if (motionEvent.getAction() != 10) {
            return false;
        }
        try {
            Field declaredField = cls.getDeclaredField("m");
            declaredField.setAccessible(true);
            if (((Integer) declaredField.get(this.f7768r)).intValue() == Integer.MIN_VALUE) {
                return false;
            }
            Method declaredMethod = cls.getDeclaredMethod("V", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f7768r, new Object[]{Integer.MIN_VALUE});
            return true;
        } catch (NoSuchMethodException e4) {
            Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            return false;
        } catch (IllegalAccessException e5) {
            Log.e("Chip", "Unable to send Accessibility Exit event", e5);
            return false;
        } catch (InvocationTargetException e6) {
            Log.e("Chip", "Unable to send Accessibility Exit event", e6);
            return false;
        } catch (NoSuchFieldException e7) {
            Log.e("Chip", "Unable to send Accessibility Exit event", e7);
            return false;
        }
    }

    public final boolean n() {
        a aVar = this.f7756f;
        return (aVar == null || aVar.M0() == null) ? false : true;
    }

    public final void o(Context context, AttributeSet attributeSet, int i4) {
        TypedArray h4 = g2.i.h(context, attributeSet, j.f3190L, i4, f7752v, new int[0]);
        this.f7765o = h4.getBoolean(j.f3342r0, false);
        this.f7767q = (int) Math.ceil((double) h4.getDimension(j.f3282f0, (float) Math.ceil((double) g2.j.b(getContext(), 48))));
        h4.recycle();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l2.h.f(this, this.f7756f);
    }

    public int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f7754x);
        }
        if (r()) {
            View.mergeDrawableStates(onCreateDrawableState, f7755y);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z4, int i4, Rect rect) {
        super.onFocusChanged(z4, i4, rect);
        this.f7768r.I(z4, i4, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (r() || isClickable()) {
            accessibilityNodeInfo.setClassName(r() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            m.C0(accessibilityNodeInfo).f0(m.f.a(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.o(this) : -1, 1, false, isChecked()));
        }
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i4) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        if (this.f7766p != i4) {
            this.f7766p = i4;
            A();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x002c
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0035
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f7762l
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x002a
            r5.setCloseIconPressed(r3)
        L_0x002a:
            r0 = r2
            goto L_0x0041
        L_0x002c:
            boolean r0 = r5.f7762l
            if (r0 == 0) goto L_0x0035
            r5.t()
            r0 = r2
            goto L_0x0036
        L_0x0035:
            r0 = r3
        L_0x0036:
            r5.setCloseIconPressed(r3)
            goto L_0x0041
        L_0x003a:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r2)
            goto L_0x002a
        L_0x0040:
            r0 = r3
        L_0x0041:
            if (r0 != 0) goto L_0x004b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r2 = r3
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        setOutlineProvider(new b());
    }

    public final void q(int i4, int i5, int i6, int i7) {
        this.f7757g = new InsetDrawable(this.f7756f, i4, i5, i6, i7);
    }

    public boolean r() {
        a aVar = this.f7756f;
        return aVar != null && aVar.j1();
    }

    public boolean s() {
        a aVar = this.f7756f;
        return aVar != null && aVar.l1();
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7758h) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i4) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7758h) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i4) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.s1(z4);
        }
    }

    public void setCheckableResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.t1(i4);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        a aVar = this.f7756f;
        if (aVar == null) {
            this.f7761k = z4;
        } else if (aVar.j1()) {
            boolean isChecked = isChecked();
            super.setChecked(z4);
            if (isChecked != z4 && (onCheckedChangeListener = this.f7760j) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z4);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.u1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z4) {
        setCheckedIconVisible(z4);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i4) {
        setCheckedIconVisible(i4);
    }

    public void setCheckedIconResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.v1(i4);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.w1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.x1(i4);
        }
    }

    public void setCheckedIconVisible(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.y1(i4);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.A1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.B1(i4);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.C1(f4);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.D1(i4);
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f7756f;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f7756f = aVar;
            aVar.v2(false);
            i(this.f7756f);
            k(this.f7767q);
        }
    }

    public void setChipEndPadding(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.E1(f4);
        }
    }

    public void setChipEndPaddingResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.F1(i4);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.G1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z4) {
        setChipIconVisible(z4);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i4) {
        setChipIconVisible(i4);
    }

    public void setChipIconResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.H1(i4);
        }
    }

    public void setChipIconSize(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.I1(f4);
        }
    }

    public void setChipIconSizeResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.J1(i4);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.K1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.L1(i4);
        }
    }

    public void setChipIconVisible(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.M1(i4);
        }
    }

    public void setChipMinHeight(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.O1(f4);
        }
    }

    public void setChipMinHeightResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.P1(i4);
        }
    }

    public void setChipStartPadding(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.Q1(f4);
        }
    }

    public void setChipStartPaddingResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.R1(i4);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.S1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.T1(i4);
        }
    }

    public void setChipStrokeWidth(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.U1(f4);
        }
    }

    public void setChipStrokeWidthResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.V1(i4);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i4) {
        setText(getResources().getString(i4));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.X1(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.Y1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z4) {
        setCloseIconVisible(z4);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i4) {
        setCloseIconVisible(i4);
    }

    public void setCloseIconEndPadding(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.Z1(f4);
        }
    }

    public void setCloseIconEndPaddingResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.a2(i4);
        }
    }

    public void setCloseIconResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.b2(i4);
        }
        x();
    }

    public void setCloseIconSize(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.c2(f4);
        }
    }

    public void setCloseIconSizeResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.d2(i4);
        }
    }

    public void setCloseIconStartPadding(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.e2(f4);
        }
    }

    public void setCloseIconStartPaddingResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.f2(i4);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.h2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.i2(i4);
        }
    }

    public void setCloseIconVisible(int i4) {
        setCloseIconVisible(getResources().getBoolean(i4));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i6 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i6, i7);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i6 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i4, i5, i6, i7);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f4) {
        super.setElevation(f4);
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.T(f4);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f7756f != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f7756f;
                if (aVar != null) {
                    aVar.l2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        this.f7765o = z4;
        k(this.f7767q);
    }

    public void setGravity(int i4) {
        if (i4 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i4);
        }
    }

    public void setHideMotionSpec(W1.c cVar) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.m2(cVar);
        }
    }

    public void setHideMotionSpecResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.n2(i4);
        }
    }

    public void setIconEndPadding(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.o2(f4);
        }
    }

    public void setIconEndPaddingResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.p2(i4);
        }
    }

    public void setIconStartPadding(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.q2(f4);
        }
    }

    public void setIconStartPaddingResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.r2(i4);
        }
    }

    public void setLayoutDirection(int i4) {
        if (this.f7756f != null) {
            super.setLayoutDirection(i4);
        }
    }

    public void setLines(int i4) {
        if (i4 <= 1) {
            super.setLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i4) {
        if (i4 <= 1) {
            super.setMaxLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i4) {
        super.setMaxWidth(i4);
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.s2(i4);
        }
    }

    public void setMinLines(int i4) {
        if (i4 <= 1) {
            super.setMinLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7760j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f7759i = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.t2(colorStateList);
        }
        if (!this.f7756f.h1()) {
            z();
        }
    }

    public void setRippleColorResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.u2(i4);
            if (!this.f7756f.h1()) {
                z();
            }
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f7756f.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(W1.c cVar) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.w2(cVar);
        }
    }

    public void setShowMotionSpecResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.x2(i4);
        }
    }

    public void setSingleLine(boolean z4) {
        if (z4) {
            super.setSingleLine(z4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        a aVar = this.f7756f;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.G2() ? null : charSequence, bufferType);
            a aVar2 = this.f7756f;
            if (aVar2 != null) {
                aVar2.y2(charSequence);
            }
        }
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.z2(dVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i4) {
        setTextAppearance(getContext(), i4);
    }

    public void setTextEndPadding(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.B2(f4);
        }
    }

    public void setTextEndPaddingResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.C2(i4);
        }
    }

    public void setTextStartPadding(float f4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.D2(f4);
        }
    }

    public void setTextStartPaddingResource(int i4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.E2(i4);
        }
    }

    public boolean t() {
        boolean z4 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f7759i;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z4 = true;
        }
        this.f7768r.U(1, 1);
        return z4;
    }

    public final void u() {
        if (this.f7757g != null) {
            this.f7757g = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    public boolean v() {
        return this.f7765o;
    }

    public final void w(a aVar) {
        if (aVar != null) {
            aVar.k2((a.C0128a) null);
        }
    }

    public final void x() {
        if (!n() || !s() || this.f7759i == null) {
            C.g0(this, (C0310a) null);
        } else {
            C.g0(this, this.f7768r);
        }
    }

    public final void y() {
        if (C0761b.f10903a) {
            z();
            return;
        }
        this.f7756f.F2(true);
        C.j0(this, getBackgroundDrawable());
        A();
        l();
    }

    public final void z() {
        this.f7758h = new RippleDrawable(C0761b.a(this.f7756f.a1()), getBackgroundDrawable(), (Drawable) null);
        this.f7756f.F2(false);
        C.j0(this, this.f7758h);
        A();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f7752v
            android.content.Context r7 = o2.C0822a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f7769s = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f7770t = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f7771u = r7
            android.content.Context r0 = r6.getContext()
            r6.C(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.q0(r0, r8, r9, r4)
            r6.o(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = S.C.t(r6)
            r7.T(r1)
            int[] r2 = V1.j.f3190L
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = g2.i.h(r0, r1, r2, r3, r4, r5)
            int r9 = V1.j.f3367w0
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.f7768r = r8
            r6.x()
            if (r9 != 0) goto L_0x0059
            r6.p()
        L_0x0059:
            boolean r8 = r6.f7761k
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.c1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.W0()
            r6.setEllipsize(r7)
            r6.B()
            com.google.android.material.chip.a r7 = r6.f7756f
            boolean r7 = r7.G2()
            if (r7 != 0) goto L_0x007e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L_0x007e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.A()
            boolean r7 = r6.v()
            if (r7 == 0) goto L_0x0092
            int r7 = r6.f7767q
            r6.setMinHeight(r7)
        L_0x0092:
            int r7 = S.C.x(r6)
            r6.f7766p = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.j2(z4);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.z1(z4);
        }
    }

    public void setChipIconVisible(boolean z4) {
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.N1(z4);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.A2(i4);
        }
        B();
    }

    public void setTextAppearance(int i4) {
        super.setTextAppearance(i4);
        a aVar = this.f7756f;
        if (aVar != null) {
            aVar.A2(i4);
        }
        B();
    }
}
