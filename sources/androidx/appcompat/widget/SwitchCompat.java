package androidx.appcompat.widget;

import S.C;
import X.h;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import h.C0645a;
import h.j;
import j.C0754a;
import m.C0784a;
import p.C0856x;
import p.K;
import p.b0;
import p.f0;
import p.i0;

public class SwitchCompat extends CompoundButton {

    /* renamed from: P  reason: collision with root package name */
    public static final Property f4525P = new a(Float.class, "thumbPos");

    /* renamed from: Q  reason: collision with root package name */
    public static final int[] f4526Q = {16842912};

    /* renamed from: A  reason: collision with root package name */
    public int f4527A;

    /* renamed from: B  reason: collision with root package name */
    public int f4528B;

    /* renamed from: C  reason: collision with root package name */
    public int f4529C;

    /* renamed from: D  reason: collision with root package name */
    public int f4530D;

    /* renamed from: E  reason: collision with root package name */
    public int f4531E;

    /* renamed from: F  reason: collision with root package name */
    public int f4532F;

    /* renamed from: G  reason: collision with root package name */
    public int f4533G;

    /* renamed from: H  reason: collision with root package name */
    public final TextPaint f4534H;

    /* renamed from: I  reason: collision with root package name */
    public ColorStateList f4535I;

    /* renamed from: J  reason: collision with root package name */
    public Layout f4536J;

    /* renamed from: K  reason: collision with root package name */
    public Layout f4537K;

    /* renamed from: L  reason: collision with root package name */
    public TransformationMethod f4538L;

    /* renamed from: M  reason: collision with root package name */
    public ObjectAnimator f4539M;

    /* renamed from: N  reason: collision with root package name */
    public final C0856x f4540N;

    /* renamed from: O  reason: collision with root package name */
    public final Rect f4541O;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f4542c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f4543d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f4544e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4545f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4546g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f4547h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f4548i;

    /* renamed from: j  reason: collision with root package name */
    public PorterDuff.Mode f4549j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4550k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4551l;

    /* renamed from: m  reason: collision with root package name */
    public int f4552m;

    /* renamed from: n  reason: collision with root package name */
    public int f4553n;

    /* renamed from: o  reason: collision with root package name */
    public int f4554o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4555p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f4556q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f4557r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4558s;

    /* renamed from: t  reason: collision with root package name */
    public int f4559t;

    /* renamed from: u  reason: collision with root package name */
    public int f4560u;

    /* renamed from: v  reason: collision with root package name */
    public float f4561v;

    /* renamed from: w  reason: collision with root package name */
    public float f4562w;

    /* renamed from: x  reason: collision with root package name */
    public VelocityTracker f4563x;

    /* renamed from: y  reason: collision with root package name */
    public int f4564y;

    /* renamed from: z  reason: collision with root package name */
    public float f4565z;

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f4565z);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f4) {
            switchCompat.setThumbPosition(f4.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9163H);
    }

    public static float f(float f4, float f5, float f6) {
        return f4 < f5 ? f5 : f4 > f6 ? f6 : f4;
    }

    private boolean getTargetCheckedState() {
        return this.f4565z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((i0.b(this) ? 1.0f - this.f4565z : this.f4565z) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f4547h;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f4541O;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f4542c;
        Rect c4 = drawable2 != null ? K.c(drawable2) : K.f11378c;
        return ((((this.f4527A - this.f4529C) - rect.left) - rect.right) - c4.left) - c4.right;
    }

    public final void a(boolean z4) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f4525P, new float[]{z4 ? 1.0f : 0.0f});
        this.f4539M = ofFloat;
        ofFloat.setDuration(250);
        this.f4539M.setAutoCancel(true);
        this.f4539M.start();
    }

    public final void b() {
        Drawable drawable = this.f4542c;
        if (drawable == null) {
            return;
        }
        if (this.f4545f || this.f4546g) {
            Drawable mutate = K.a.l(drawable).mutate();
            this.f4542c = mutate;
            if (this.f4545f) {
                K.a.i(mutate, this.f4543d);
            }
            if (this.f4546g) {
                K.a.j(this.f4542c, this.f4544e);
            }
            if (this.f4542c.isStateful()) {
                this.f4542c.setState(getDrawableState());
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f4547h;
        if (drawable == null) {
            return;
        }
        if (this.f4550k || this.f4551l) {
            Drawable mutate = K.a.l(drawable).mutate();
            this.f4547h = mutate;
            if (this.f4550k) {
                K.a.i(mutate, this.f4548i);
            }
            if (this.f4551l) {
                K.a.j(this.f4547h, this.f4549j);
            }
            if (this.f4547h.isStateful()) {
                this.f4547h.setState(getDrawableState());
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.f4539M;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void draw(Canvas canvas) {
        int i4;
        int i5;
        Rect rect = this.f4541O;
        int i6 = this.f4530D;
        int i7 = this.f4531E;
        int i8 = this.f4532F;
        int i9 = this.f4533G;
        int thumbOffset = getThumbOffset() + i6;
        Drawable drawable = this.f4542c;
        Rect c4 = drawable != null ? K.c(drawable) : K.f11378c;
        Drawable drawable2 = this.f4547h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i10 = rect.left;
            thumbOffset += i10;
            if (c4 != null) {
                int i11 = c4.left;
                if (i11 > i10) {
                    i6 += i11 - i10;
                }
                int i12 = c4.top;
                int i13 = rect.top;
                i4 = i12 > i13 ? (i12 - i13) + i7 : i7;
                int i14 = c4.right;
                int i15 = rect.right;
                if (i14 > i15) {
                    i8 -= i14 - i15;
                }
                int i16 = c4.bottom;
                int i17 = rect.bottom;
                if (i16 > i17) {
                    i5 = i9 - (i16 - i17);
                    this.f4547h.setBounds(i6, i4, i8, i5);
                }
            } else {
                i4 = i7;
            }
            i5 = i9;
            this.f4547h.setBounds(i6, i4, i8, i5);
        }
        Drawable drawable3 = this.f4542c;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i18 = thumbOffset - rect.left;
            int i19 = thumbOffset + this.f4529C + rect.right;
            this.f4542c.setBounds(i18, i7, i19, i9);
            Drawable background = getBackground();
            if (background != null) {
                K.a.f(background, i18, i7, i19, i9);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.f4542c;
        if (drawable != null) {
            K.a.e(drawable, f4, f5);
        }
        Drawable drawable2 = this.f4547h;
        if (drawable2 != null) {
            K.a.e(drawable2, f4, f5);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4542c;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f4547h;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final boolean g(float f4, float f5) {
        if (this.f4542c == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f4542c.getPadding(this.f4541O);
        int i4 = this.f4531E;
        int i5 = this.f4560u;
        int i6 = i4 - i5;
        int i7 = (this.f4530D + thumbOffset) - i5;
        Rect rect = this.f4541O;
        return f4 > ((float) i7) && f4 < ((float) ((((this.f4529C + i7) + rect.left) + rect.right) + i5)) && f5 > ((float) i6) && f5 < ((float) (this.f4533G + i5));
    }

    public int getCompoundPaddingLeft() {
        if (!i0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f4527A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f4554o : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (i0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f4527A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f4554o : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f4558s;
    }

    public boolean getSplitTrack() {
        return this.f4555p;
    }

    public int getSwitchMinWidth() {
        return this.f4553n;
    }

    public int getSwitchPadding() {
        return this.f4554o;
    }

    public CharSequence getTextOff() {
        return this.f4557r;
    }

    public CharSequence getTextOn() {
        return this.f4556q;
    }

    public Drawable getThumbDrawable() {
        return this.f4542c;
    }

    public int getThumbTextPadding() {
        return this.f4552m;
    }

    public ColorStateList getThumbTintList() {
        return this.f4543d;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f4544e;
    }

    public Drawable getTrackDrawable() {
        return this.f4547h;
    }

    public ColorStateList getTrackTintList() {
        return this.f4548i;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f4549j;
    }

    public final Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f4538L;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f4534H;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void i(Context context, int i4) {
        f0 t4 = f0.t(context, i4, j.f9441X2);
        ColorStateList c4 = t4.c(j.f9459b3);
        if (c4 != null) {
            this.f4535I = c4;
        } else {
            this.f4535I = getTextColors();
        }
        int f4 = t4.f(j.f9445Y2, 0);
        if (f4 != 0) {
            float f5 = (float) f4;
            if (f5 != this.f4534H.getTextSize()) {
                this.f4534H.setTextSize(f5);
                requestLayout();
            }
        }
        k(t4.k(j.f9449Z2, -1), t4.k(j.f9454a3, -1));
        if (t4.a(j.f9484g3, false)) {
            this.f4538L = new C0784a(getContext());
        } else {
            this.f4538L = null;
        }
        t4.w();
    }

    public void j(Typeface typeface, int i4) {
        float f4 = 0.0f;
        boolean z4 = false;
        if (i4 > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
            setSwitchTypeface(defaultFromStyle);
            int i5 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i4;
            TextPaint textPaint = this.f4534H;
            if ((i5 & 1) != 0) {
                z4 = true;
            }
            textPaint.setFakeBoldText(z4);
            TextPaint textPaint2 = this.f4534H;
            if ((i5 & 2) != 0) {
                f4 = -0.25f;
            }
            textPaint2.setTextSkewX(f4);
            return;
        }
        this.f4534H.setFakeBoldText(false);
        this.f4534H.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4542c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4547h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f4539M;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f4539M.end();
            this.f4539M = null;
        }
    }

    public final void k(int i4, int i5) {
        j(i4 != 1 ? i4 != 2 ? i4 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i5);
    }

    public final void l(MotionEvent motionEvent) {
        this.f4559t = 0;
        boolean z4 = true;
        boolean z5 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z5) {
            this.f4563x.computeCurrentVelocity(1000);
            float xVelocity = this.f4563x.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f4564y)) {
                z4 = getTargetCheckedState();
            } else if (!i0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z4 = false;
            }
        } else {
            z4 = isChecked;
        }
        if (z4 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z4);
        e(motionEvent);
    }

    public int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f4526Q);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        int i4;
        super.onDraw(canvas);
        Rect rect = this.f4541O;
        Drawable drawable = this.f4547h;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i5 = this.f4531E;
        int i6 = this.f4533G;
        int i7 = i5 + rect.top;
        int i8 = i6 - rect.bottom;
        Drawable drawable2 = this.f4542c;
        if (drawable != null) {
            if (!this.f4555p || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c4 = K.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c4.left;
                rect.right -= c4.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f4536J : this.f4537K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f4535I;
            if (colorStateList != null) {
                this.f4534H.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f4534H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i4 = bounds.left + bounds.right;
            } else {
                i4 = getWidth();
            }
            canvas.translate((float) ((i4 / 2) - (layout.getWidth() / 2)), (float) (((i7 + i8) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f4556q : this.f4557r;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        super.onLayout(z4, i4, i5, i6, i7);
        int i14 = 0;
        if (this.f4542c != null) {
            Rect rect = this.f4541O;
            Drawable drawable = this.f4547h;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c4 = K.c(this.f4542c);
            i8 = Math.max(0, c4.left - rect.left);
            i14 = Math.max(0, c4.right - rect.right);
        } else {
            i8 = 0;
        }
        if (i0.b(this)) {
            i10 = getPaddingLeft() + i8;
            i9 = ((this.f4527A + i10) - i8) - i14;
        } else {
            i9 = (getWidth() - getPaddingRight()) - i14;
            i10 = (i9 - this.f4527A) + i8 + i14;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i13 = this.f4528B;
            i12 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i13 / 2);
        } else if (gravity != 80) {
            i12 = getPaddingTop();
            i13 = this.f4528B;
        } else {
            i11 = getHeight() - getPaddingBottom();
            i12 = i11 - this.f4528B;
            this.f4530D = i10;
            this.f4531E = i12;
            this.f4533G = i11;
            this.f4532F = i9;
        }
        i11 = i13 + i12;
        this.f4530D = i10;
        this.f4531E = i12;
        this.f4533G = i11;
        this.f4532F = i9;
    }

    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        if (this.f4558s) {
            if (this.f4536J == null) {
                this.f4536J = h(this.f4556q);
            }
            if (this.f4537K == null) {
                this.f4537K = h(this.f4557r);
            }
        }
        Rect rect = this.f4541O;
        Drawable drawable = this.f4542c;
        int i8 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i7 = (this.f4542c.getIntrinsicWidth() - rect.left) - rect.right;
            i6 = this.f4542c.getIntrinsicHeight();
        } else {
            i7 = 0;
            i6 = 0;
        }
        this.f4529C = Math.max(this.f4558s ? Math.max(this.f4536J.getWidth(), this.f4537K.getWidth()) + (this.f4552m * 2) : 0, i7);
        Drawable drawable2 = this.f4547h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i8 = this.f4547h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.f4542c;
        if (drawable3 != null) {
            Rect c4 = K.c(drawable3);
            i9 = Math.max(i9, c4.left);
            i10 = Math.max(i10, c4.right);
        }
        int max = Math.max(this.f4553n, (this.f4529C * 2) + i9 + i10);
        int max2 = Math.max(i8, i6);
        this.f4527A = max;
        this.f4528B = max2;
        super.onMeasure(i4, i5);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f4556q : this.f4557r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f4563x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009d
            r2 = 2
            if (r0 == r1) goto L_0x0089
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x0089
            goto L_0x00b7
        L_0x0016:
            int r0 = r6.f4559t
            if (r0 == r1) goto L_0x0055
            if (r0 == r2) goto L_0x001e
            goto L_0x00b7
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f4561v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003b
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            r2 = r3
            goto L_0x003b
        L_0x0038:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L_0x003b:
            boolean r0 = p.i0.b(r6)
            if (r0 == 0) goto L_0x0042
            float r2 = -r2
        L_0x0042:
            float r0 = r6.f4565z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f4565z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0054
            r6.f4561v = r7
            r6.setThumbPosition(r0)
        L_0x0054:
            return r1
        L_0x0055:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f4561v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f4560u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007b
            float r4 = r6.f4562w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f4560u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
        L_0x007b:
            r6.f4559t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f4561v = r0
            r6.f4562w = r3
            return r1
        L_0x0089:
            int r0 = r6.f4559t
            if (r0 != r2) goto L_0x0094
            r6.l(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0094:
            r0 = 0
            r6.f4559t = r0
            android.view.VelocityTracker r0 = r6.f4563x
            r0.clear()
            goto L_0x00b7
        L_0x009d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b7
            boolean r3 = r6.g(r0, r2)
            if (r3 == 0) goto L_0x00b7
            r6.f4559t = r1
            r6.f4561v = r0
            r6.f4562w = r2
        L_0x00b7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z4) {
        super.setChecked(z4);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C.M(this)) {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.o(this, callback));
    }

    public void setShowText(boolean z4) {
        if (this.f4558s != z4) {
            this.f4558s = z4;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z4) {
        this.f4555p = z4;
        invalidate();
    }

    public void setSwitchMinWidth(int i4) {
        this.f4553n = i4;
        requestLayout();
    }

    public void setSwitchPadding(int i4) {
        this.f4554o = i4;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f4534H.getTypeface() != null && !this.f4534H.getTypeface().equals(typeface)) || (this.f4534H.getTypeface() == null && typeface != null)) {
            this.f4534H.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f4557r = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f4556q = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4542c;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f4542c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f4) {
        this.f4565z = f4;
        invalidate();
    }

    public void setThumbResource(int i4) {
        setThumbDrawable(C0754a.b(getContext(), i4));
    }

    public void setThumbTextPadding(int i4) {
        this.f4552m = i4;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f4543d = colorStateList;
        this.f4545f = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f4544e = mode;
        this.f4546g = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4547h;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f4547h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i4) {
        setTrackDrawable(C0754a.b(getContext(), i4));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f4548i = colorStateList;
        this.f4550k = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f4549j = mode;
        this.f4551l = true;
        c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4542c || drawable == this.f4547h;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4543d = null;
        this.f4544e = null;
        this.f4545f = false;
        this.f4546g = false;
        this.f4548i = null;
        this.f4549j = null;
        this.f4550k = false;
        this.f4551l = false;
        this.f4563x = VelocityTracker.obtain();
        this.f4541O = new Rect();
        b0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f4534H = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        f0 v4 = f0.v(context, attributeSet, j.f9372I2, i4, 0);
        C.e0(this, context, j.f9372I2, attributeSet, v4.r(), i4, 0);
        Drawable g4 = v4.g(j.f9387L2);
        this.f4542c = g4;
        if (g4 != null) {
            g4.setCallback(this);
        }
        Drawable g5 = v4.g(j.f9429U2);
        this.f4547h = g5;
        if (g5 != null) {
            g5.setCallback(this);
        }
        this.f4556q = v4.p(j.f9377J2);
        this.f4557r = v4.p(j.f9382K2);
        this.f4558s = v4.a(j.f9392M2, true);
        this.f4552m = v4.f(j.f9417R2, 0);
        this.f4553n = v4.f(j.f9402O2, 0);
        this.f4554o = v4.f(j.f9407P2, 0);
        this.f4555p = v4.a(j.f9397N2, false);
        ColorStateList c4 = v4.c(j.f9421S2);
        if (c4 != null) {
            this.f4543d = c4;
            this.f4545f = true;
        }
        PorterDuff.Mode d4 = K.d(v4.k(j.f9425T2, -1), (PorterDuff.Mode) null);
        if (this.f4544e != d4) {
            this.f4544e = d4;
            this.f4546g = true;
        }
        if (this.f4545f || this.f4546g) {
            b();
        }
        ColorStateList c5 = v4.c(j.f9433V2);
        if (c5 != null) {
            this.f4548i = c5;
            this.f4550k = true;
        }
        PorterDuff.Mode d5 = K.d(v4.k(j.f9437W2, -1), (PorterDuff.Mode) null);
        if (this.f4549j != d5) {
            this.f4549j = d5;
            this.f4551l = true;
        }
        if (this.f4550k || this.f4551l) {
            c();
        }
        int n4 = v4.n(j.f9412Q2, 0);
        if (n4 != 0) {
            i(context, n4);
        }
        C0856x xVar = new C0856x(this);
        this.f4540N = xVar;
        xVar.m(attributeSet, i4);
        v4.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4560u = viewConfiguration.getScaledTouchSlop();
        this.f4564y = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
