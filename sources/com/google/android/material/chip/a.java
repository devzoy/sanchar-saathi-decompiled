package com.google.android.material.chip;

import W1.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import b2.C0393a;
import d2.C0574a;
import g2.g;
import g2.i;
import g2.j;
import i2.d;
import j.C0754a;
import j2.C0761b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l2.g;

public class a extends g implements Drawable.Callback, g.b {

    /* renamed from: K0  reason: collision with root package name */
    public static final int[] f7787K0 = {16842910};

    /* renamed from: L0  reason: collision with root package name */
    public static final ShapeDrawable f7788L0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A  reason: collision with root package name */
    public ColorStateList f7789A;

    /* renamed from: A0  reason: collision with root package name */
    public ColorStateList f7790A0;

    /* renamed from: B  reason: collision with root package name */
    public ColorStateList f7791B;

    /* renamed from: B0  reason: collision with root package name */
    public PorterDuff.Mode f7792B0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: C  reason: collision with root package name */
    public float f7793C;

    /* renamed from: C0  reason: collision with root package name */
    public int[] f7794C0;

    /* renamed from: D  reason: collision with root package name */
    public float f7795D = -1.0f;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f7796D0;

    /* renamed from: E  reason: collision with root package name */
    public ColorStateList f7797E;

    /* renamed from: E0  reason: collision with root package name */
    public ColorStateList f7798E0;

    /* renamed from: F  reason: collision with root package name */
    public float f7799F;

    /* renamed from: F0  reason: collision with root package name */
    public WeakReference f7800F0 = new WeakReference((Object) null);

    /* renamed from: G  reason: collision with root package name */
    public ColorStateList f7801G;

    /* renamed from: G0  reason: collision with root package name */
    public TextUtils.TruncateAt f7802G0;

    /* renamed from: H  reason: collision with root package name */
    public CharSequence f7803H;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f7804H0;

    /* renamed from: I  reason: collision with root package name */
    public boolean f7805I;

    /* renamed from: I0  reason: collision with root package name */
    public int f7806I0;

    /* renamed from: J  reason: collision with root package name */
    public Drawable f7807J;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f7808J0;

    /* renamed from: K  reason: collision with root package name */
    public ColorStateList f7809K;

    /* renamed from: L  reason: collision with root package name */
    public float f7810L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f7811M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f7812N;

    /* renamed from: O  reason: collision with root package name */
    public Drawable f7813O;

    /* renamed from: P  reason: collision with root package name */
    public Drawable f7814P;

    /* renamed from: Q  reason: collision with root package name */
    public ColorStateList f7815Q;

    /* renamed from: R  reason: collision with root package name */
    public float f7816R;

    /* renamed from: S  reason: collision with root package name */
    public CharSequence f7817S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f7818T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f7819U;

    /* renamed from: V  reason: collision with root package name */
    public Drawable f7820V;

    /* renamed from: W  reason: collision with root package name */
    public ColorStateList f7821W;

    /* renamed from: X  reason: collision with root package name */
    public c f7822X;

    /* renamed from: Y  reason: collision with root package name */
    public c f7823Y;

    /* renamed from: Z  reason: collision with root package name */
    public float f7824Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f7825a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f7826b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f7827c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f7828d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f7829e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f7830f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f7831g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Context f7832h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Paint f7833i0 = new Paint(1);

    /* renamed from: j0  reason: collision with root package name */
    public final Paint f7834j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Paint.FontMetrics f7835k0 = new Paint.FontMetrics();

    /* renamed from: l0  reason: collision with root package name */
    public final RectF f7836l0 = new RectF();

    /* renamed from: m0  reason: collision with root package name */
    public final PointF f7837m0 = new PointF();

    /* renamed from: n0  reason: collision with root package name */
    public final Path f7838n0 = new Path();

    /* renamed from: o0  reason: collision with root package name */
    public final g2.g f7839o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f7840p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f7841q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f7842r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f7843s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f7844t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f7845u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f7846v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f7847w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f7848x0 = 255;

    /* renamed from: y0  reason: collision with root package name */
    public ColorFilter f7849y0;

    /* renamed from: z0  reason: collision with root package name */
    public PorterDuffColorFilter f7850z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0128a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        K(context);
        this.f7832h0 = context;
        g2.g gVar = new g2.g(this);
        this.f7839o0 = gVar;
        this.f7803H = "";
        gVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f7834j0 = null;
        int[] iArr = f7787K0;
        setState(iArr);
        g2(iArr);
        this.f7804H0 = true;
        if (C0761b.f10903a) {
            f7788L0.setTint(-1);
        }
    }

    public static boolean i1(int[] iArr, int i4) {
        if (iArr == null) {
            return false;
        }
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    public static boolean m1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean n1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f10264a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean o1(i2.d r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.f10264a
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.o1(i2.d):boolean");
    }

    public static a q0(Context context, AttributeSet attributeSet, int i4, int i5) {
        a aVar = new a(context, attributeSet, i4, i5);
        aVar.p1(attributeSet, i4, i5);
        return aVar;
    }

    public Drawable A0() {
        return this.f7820V;
    }

    public void A1(ColorStateList colorStateList) {
        if (this.f7791B != colorStateList) {
            this.f7791B = colorStateList;
            onStateChange(getState());
        }
    }

    public void A2(int i4) {
        z2(new d(this.f7832h0, i4));
    }

    public ColorStateList B0() {
        return this.f7821W;
    }

    public void B1(int i4) {
        A1(C0754a.a(this.f7832h0, i4));
    }

    public void B2(float f4) {
        if (this.f7828d0 != f4) {
            this.f7828d0 = f4;
            invalidateSelf();
            q1();
        }
    }

    public ColorStateList C0() {
        return this.f7791B;
    }

    public void C1(float f4) {
        if (this.f7795D != f4) {
            this.f7795D = f4;
            setShapeAppearanceModel(B().w(f4));
        }
    }

    public void C2(int i4) {
        B2(this.f7832h0.getResources().getDimension(i4));
    }

    public float D0() {
        return this.f7808J0 ? D() : this.f7795D;
    }

    public void D1(int i4) {
        C1(this.f7832h0.getResources().getDimension(i4));
    }

    public void D2(float f4) {
        if (this.f7827c0 != f4) {
            this.f7827c0 = f4;
            invalidateSelf();
            q1();
        }
    }

    public float E0() {
        return this.f7831g0;
    }

    public void E1(float f4) {
        if (this.f7831g0 != f4) {
            this.f7831g0 = f4;
            invalidateSelf();
            q1();
        }
    }

    public void E2(int i4) {
        D2(this.f7832h0.getResources().getDimension(i4));
    }

    public Drawable F0() {
        Drawable drawable = this.f7807J;
        if (drawable != null) {
            return K.a.k(drawable);
        }
        return null;
    }

    public void F1(int i4) {
        E1(this.f7832h0.getResources().getDimension(i4));
    }

    public void F2(boolean z4) {
        if (this.f7796D0 != z4) {
            this.f7796D0 = z4;
            L2();
            onStateChange(getState());
        }
    }

    public float G0() {
        return this.f7810L;
    }

    public void G1(Drawable drawable) {
        Drawable F02 = F0();
        if (F02 != drawable) {
            float h02 = h0();
            this.f7807J = drawable != null ? K.a.l(drawable).mutate() : null;
            float h03 = h0();
            K2(F02);
            if (I2()) {
                f0(this.f7807J);
            }
            invalidateSelf();
            if (h02 != h03) {
                q1();
            }
        }
    }

    public boolean G2() {
        return this.f7804H0;
    }

    public ColorStateList H0() {
        return this.f7809K;
    }

    public void H1(int i4) {
        G1(C0754a.b(this.f7832h0, i4));
    }

    public final boolean H2() {
        return this.f7819U && this.f7820V != null && this.f7846v0;
    }

    public float I0() {
        return this.f7793C;
    }

    public void I1(float f4) {
        if (this.f7810L != f4) {
            float h02 = h0();
            this.f7810L = f4;
            float h03 = h0();
            invalidateSelf();
            if (h02 != h03) {
                q1();
            }
        }
    }

    public final boolean I2() {
        return this.f7805I && this.f7807J != null;
    }

    public float J0() {
        return this.f7824Z;
    }

    public void J1(int i4) {
        I1(this.f7832h0.getResources().getDimension(i4));
    }

    public final boolean J2() {
        return this.f7812N && this.f7813O != null;
    }

    public ColorStateList K0() {
        return this.f7797E;
    }

    public void K1(ColorStateList colorStateList) {
        this.f7811M = true;
        if (this.f7809K != colorStateList) {
            this.f7809K = colorStateList;
            if (I2()) {
                K.a.i(this.f7807J, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public float L0() {
        return this.f7799F;
    }

    public void L1(int i4) {
        K1(C0754a.a(this.f7832h0, i4));
    }

    public final void L2() {
        this.f7798E0 = this.f7796D0 ? C0761b.a(this.f7801G) : null;
    }

    public Drawable M0() {
        Drawable drawable = this.f7813O;
        if (drawable != null) {
            return K.a.k(drawable);
        }
        return null;
    }

    public void M1(int i4) {
        N1(this.f7832h0.getResources().getBoolean(i4));
    }

    public final void M2() {
        this.f7814P = new RippleDrawable(C0761b.a(a1()), this.f7813O, f7788L0);
    }

    public CharSequence N0() {
        return this.f7817S;
    }

    public void N1(boolean z4) {
        if (this.f7805I != z4) {
            boolean I22 = I2();
            this.f7805I = z4;
            boolean I23 = I2();
            if (I22 != I23) {
                if (I23) {
                    f0(this.f7807J);
                } else {
                    K2(this.f7807J);
                }
                invalidateSelf();
                q1();
            }
        }
    }

    public float O0() {
        return this.f7830f0;
    }

    public void O1(float f4) {
        if (this.f7793C != f4) {
            this.f7793C = f4;
            invalidateSelf();
            q1();
        }
    }

    public float P0() {
        return this.f7816R;
    }

    public void P1(int i4) {
        O1(this.f7832h0.getResources().getDimension(i4));
    }

    public float Q0() {
        return this.f7829e0;
    }

    public void Q1(float f4) {
        if (this.f7824Z != f4) {
            this.f7824Z = f4;
            invalidateSelf();
            q1();
        }
    }

    public int[] R0() {
        return this.f7794C0;
    }

    public void R1(int i4) {
        Q1(this.f7832h0.getResources().getDimension(i4));
    }

    public ColorStateList S0() {
        return this.f7815Q;
    }

    public void S1(ColorStateList colorStateList) {
        if (this.f7797E != colorStateList) {
            this.f7797E = colorStateList;
            if (this.f7808J0) {
                a0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void T0(RectF rectF) {
        k0(getBounds(), rectF);
    }

    public void T1(int i4) {
        S1(C0754a.a(this.f7832h0, i4));
    }

    public final float U0() {
        Drawable drawable = this.f7846v0 ? this.f7820V : this.f7807J;
        float f4 = this.f7810L;
        if (f4 <= 0.0f && drawable != null) {
            f4 = (float) Math.ceil((double) j.b(this.f7832h0, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f4) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f4;
    }

    public void U1(float f4) {
        if (this.f7799F != f4) {
            this.f7799F = f4;
            this.f7833i0.setStrokeWidth(f4);
            if (this.f7808J0) {
                super.b0(f4);
            }
            invalidateSelf();
        }
    }

    public final float V0() {
        Drawable drawable = this.f7846v0 ? this.f7820V : this.f7807J;
        float f4 = this.f7810L;
        return (f4 > 0.0f || drawable == null) ? f4 : (float) drawable.getIntrinsicWidth();
    }

    public void V1(int i4) {
        U1(this.f7832h0.getResources().getDimension(i4));
    }

    public TextUtils.TruncateAt W0() {
        return this.f7802G0;
    }

    public final void W1(ColorStateList colorStateList) {
        if (this.f7789A != colorStateList) {
            this.f7789A = colorStateList;
            onStateChange(getState());
        }
    }

    public c X0() {
        return this.f7823Y;
    }

    public void X1(Drawable drawable) {
        Drawable M02 = M0();
        if (M02 != drawable) {
            float l02 = l0();
            this.f7813O = drawable != null ? K.a.l(drawable).mutate() : null;
            if (C0761b.f10903a) {
                M2();
            }
            float l03 = l0();
            K2(M02);
            if (J2()) {
                f0(this.f7813O);
            }
            invalidateSelf();
            if (l02 != l03) {
                q1();
            }
        }
    }

    public float Y0() {
        return this.f7826b0;
    }

    public void Y1(CharSequence charSequence) {
        if (this.f7817S != charSequence) {
            this.f7817S = Q.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float Z0() {
        return this.f7825a0;
    }

    public void Z1(float f4) {
        if (this.f7830f0 != f4) {
            this.f7830f0 = f4;
            invalidateSelf();
            if (J2()) {
                q1();
            }
        }
    }

    public void a() {
        q1();
        invalidateSelf();
    }

    public ColorStateList a1() {
        return this.f7801G;
    }

    public void a2(int i4) {
        Z1(this.f7832h0.getResources().getDimension(i4));
    }

    public c b1() {
        return this.f7822X;
    }

    public void b2(int i4) {
        X1(C0754a.b(this.f7832h0, i4));
    }

    public CharSequence c1() {
        return this.f7803H;
    }

    public void c2(float f4) {
        if (this.f7816R != f4) {
            this.f7816R = f4;
            invalidateSelf();
            if (J2()) {
                q1();
            }
        }
    }

    public d d1() {
        return this.f7839o0.d();
    }

    public void d2(int i4) {
        c2(this.f7832h0.getResources().getDimension(i4));
    }

    public void draw(Canvas canvas) {
        int i4;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i5 = this.f7848x0;
            if (i5 < 255) {
                i4 = Z1.a.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i5);
            } else {
                i4 = 0;
            }
            v0(canvas, bounds);
            s0(canvas, bounds);
            if (this.f7808J0) {
                super.draw(canvas);
            }
            u0(canvas, bounds);
            x0(canvas, bounds);
            t0(canvas, bounds);
            r0(canvas, bounds);
            if (this.f7804H0) {
                z0(canvas, bounds);
            }
            w0(canvas, bounds);
            y0(canvas, bounds);
            if (this.f7848x0 < 255) {
                canvas.restoreToCount(i4);
            }
        }
    }

    public float e1() {
        return this.f7828d0;
    }

    public void e2(float f4) {
        if (this.f7829e0 != f4) {
            this.f7829e0 = f4;
            invalidateSelf();
            if (J2()) {
                q1();
            }
        }
    }

    public final void f0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            K.a.g(drawable, K.a.b(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f7813O) {
                if (drawable.isStateful()) {
                    drawable.setState(R0());
                }
                K.a.i(drawable, this.f7815Q);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f7807J;
            if (drawable == drawable2 && this.f7811M) {
                K.a.i(drawable2, this.f7809K);
            }
        }
    }

    public float f1() {
        return this.f7827c0;
    }

    public void f2(int i4) {
        e2(this.f7832h0.getResources().getDimension(i4));
    }

    public final void g0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (I2() || H2()) {
            float f4 = this.f7824Z + this.f7825a0;
            float V02 = V0();
            if (K.a.b(this) == 0) {
                float f5 = ((float) rect.left) + f4;
                rectF.left = f5;
                rectF.right = f5 + V02;
            } else {
                float f6 = ((float) rect.right) - f4;
                rectF.right = f6;
                rectF.left = f6 - V02;
            }
            float U02 = U0();
            float exactCenterY = rect.exactCenterY() - (U02 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + U02;
        }
    }

    public final ColorFilter g1() {
        ColorFilter colorFilter = this.f7849y0;
        return colorFilter != null ? colorFilter : this.f7850z0;
    }

    public boolean g2(int[] iArr) {
        if (Arrays.equals(this.f7794C0, iArr)) {
            return false;
        }
        this.f7794C0 = iArr;
        if (J2()) {
            return r1(getState(), iArr);
        }
        return false;
    }

    public int getAlpha() {
        return this.f7848x0;
    }

    public ColorFilter getColorFilter() {
        return this.f7849y0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f7793C;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f7824Z + h0() + this.f7827c0 + this.f7839o0.f(c1().toString()) + this.f7828d0 + l0() + this.f7831g0), this.f7806I0);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f7808J0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f7795D);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f7795D);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public float h0() {
        if (I2() || H2()) {
            return this.f7825a0 + V0() + this.f7826b0;
        }
        return 0.0f;
    }

    public boolean h1() {
        return this.f7796D0;
    }

    public void h2(ColorStateList colorStateList) {
        if (this.f7815Q != colorStateList) {
            this.f7815Q = colorStateList;
            if (J2()) {
                K.a.i(this.f7813O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void i0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (J2()) {
            float f4 = this.f7831g0 + this.f7830f0 + this.f7816R + this.f7829e0 + this.f7828d0;
            if (K.a.b(this) == 0) {
                rectF.right = ((float) rect.right) - f4;
            } else {
                rectF.left = ((float) rect.left) + f4;
            }
        }
    }

    public void i2(int i4) {
        h2(C0754a.a(this.f7832h0, i4));
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m1(this.f7789A) || m1(this.f7791B) || m1(this.f7797E) || (this.f7796D0 && m1(this.f7798E0)) || o1(this.f7839o0.d()) || p0() || n1(this.f7807J) || n1(this.f7820V) || m1(this.f7790A0);
    }

    public final void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f4 = this.f7831g0 + this.f7830f0;
            if (K.a.b(this) == 0) {
                float f5 = ((float) rect.right) - f4;
                rectF.right = f5;
                rectF.left = f5 - this.f7816R;
            } else {
                float f6 = ((float) rect.left) + f4;
                rectF.left = f6;
                rectF.right = f6 + this.f7816R;
            }
            float exactCenterY = rect.exactCenterY();
            float f7 = this.f7816R;
            float f8 = exactCenterY - (f7 / 2.0f);
            rectF.top = f8;
            rectF.bottom = f8 + f7;
        }
    }

    public boolean j1() {
        return this.f7818T;
    }

    public void j2(boolean z4) {
        if (this.f7812N != z4) {
            boolean J22 = J2();
            this.f7812N = z4;
            boolean J23 = J2();
            if (J22 != J23) {
                if (J23) {
                    f0(this.f7813O);
                } else {
                    K2(this.f7813O);
                }
                invalidateSelf();
                q1();
            }
        }
    }

    public final void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f4 = this.f7831g0 + this.f7830f0 + this.f7816R + this.f7829e0 + this.f7828d0;
            if (K.a.b(this) == 0) {
                float f5 = (float) rect.right;
                rectF.right = f5;
                rectF.left = f5 - f4;
            } else {
                int i4 = rect.left;
                rectF.left = (float) i4;
                rectF.right = ((float) i4) + f4;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public boolean k1() {
        return n1(this.f7813O);
    }

    public void k2(C0128a aVar) {
        this.f7800F0 = new WeakReference(aVar);
    }

    public float l0() {
        if (J2()) {
            return this.f7829e0 + this.f7816R + this.f7830f0;
        }
        return 0.0f;
    }

    public boolean l1() {
        return this.f7812N;
    }

    public void l2(TextUtils.TruncateAt truncateAt) {
        this.f7802G0 = truncateAt;
    }

    public final void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f7803H != null) {
            float h02 = this.f7824Z + h0() + this.f7827c0;
            float l02 = this.f7831g0 + l0() + this.f7828d0;
            if (K.a.b(this) == 0) {
                rectF.left = ((float) rect.left) + h02;
                rectF.right = ((float) rect.right) - l02;
            } else {
                rectF.left = ((float) rect.left) + l02;
                rectF.right = ((float) rect.right) - h02;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public void m2(c cVar) {
        this.f7823Y = cVar;
    }

    public final float n0() {
        this.f7839o0.e().getFontMetrics(this.f7835k0);
        Paint.FontMetrics fontMetrics = this.f7835k0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void n2(int i4) {
        m2(c.c(this.f7832h0, i4));
    }

    public Paint.Align o0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f7803H != null) {
            float h02 = this.f7824Z + h0() + this.f7827c0;
            if (K.a.b(this) == 0) {
                pointF.x = ((float) rect.left) + h02;
            } else {
                pointF.x = ((float) rect.right) - h02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - n0();
        }
        return align;
    }

    public void o2(float f4) {
        if (this.f7826b0 != f4) {
            float h02 = h0();
            this.f7826b0 = f4;
            float h03 = h0();
            invalidateSelf();
            if (h02 != h03) {
                q1();
            }
        }
    }

    public boolean onLayoutDirectionChanged(int i4) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i4);
        if (I2()) {
            onLayoutDirectionChanged |= K.a.g(this.f7807J, i4);
        }
        if (H2()) {
            onLayoutDirectionChanged |= K.a.g(this.f7820V, i4);
        }
        if (J2()) {
            onLayoutDirectionChanged |= K.a.g(this.f7813O, i4);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i4) {
        boolean onLevelChange = super.onLevelChange(i4);
        if (I2()) {
            onLevelChange |= this.f7807J.setLevel(i4);
        }
        if (H2()) {
            onLevelChange |= this.f7820V.setLevel(i4);
        }
        if (J2()) {
            onLevelChange |= this.f7813O.setLevel(i4);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f7808J0) {
            super.onStateChange(iArr);
        }
        return r1(iArr, R0());
    }

    public final boolean p0() {
        return this.f7819U && this.f7820V != null && this.f7818T;
    }

    public final void p1(AttributeSet attributeSet, int i4, int i5) {
        TypedArray h4 = i.h(this.f7832h0, attributeSet, V1.j.f3190L, i4, i5, new int[0]);
        this.f7808J0 = h4.hasValue(V1.j.f3367w0);
        W1(i2.c.a(this.f7832h0, h4, V1.j.f3302j0));
        A1(i2.c.a(this.f7832h0, h4, V1.j.f3240W));
        O1(h4.getDimension(V1.j.f3277e0, 0.0f));
        if (h4.hasValue(V1.j.f3244X)) {
            C1(h4.getDimension(V1.j.f3244X, 0.0f));
        }
        S1(i2.c.a(this.f7832h0, h4, V1.j.f3292h0));
        U1(h4.getDimension(V1.j.f3297i0, 0.0f));
        t2(i2.c.a(this.f7832h0, h4, V1.j.f3362v0));
        y2(h4.getText(V1.j.f3215Q));
        d f4 = i2.c.f(this.f7832h0, h4, V1.j.f3195M);
        f4.f10277n = h4.getDimension(V1.j.f3200N, f4.f10277n);
        z2(f4);
        int i6 = h4.getInt(V1.j.f3205O, 0);
        if (i6 == 1) {
            l2(TextUtils.TruncateAt.START);
        } else if (i6 == 2) {
            l2(TextUtils.TruncateAt.MIDDLE);
        } else if (i6 == 3) {
            l2(TextUtils.TruncateAt.END);
        }
        N1(h4.getBoolean(V1.j.f3272d0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            N1(h4.getBoolean(V1.j.f3257a0, false));
        }
        G1(i2.c.d(this.f7832h0, h4, V1.j.f3252Z));
        if (h4.hasValue(V1.j.f3267c0)) {
            K1(i2.c.a(this.f7832h0, h4, V1.j.f3267c0));
        }
        I1(h4.getDimension(V1.j.f3262b0, -1.0f));
        j2(h4.getBoolean(V1.j.f3337q0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            j2(h4.getBoolean(V1.j.f3312l0, false));
        }
        X1(i2.c.d(this.f7832h0, h4, V1.j.f3307k0));
        h2(i2.c.a(this.f7832h0, h4, V1.j.f3332p0));
        c2(h4.getDimension(V1.j.f3322n0, 0.0f));
        s1(h4.getBoolean(V1.j.f3220R, false));
        z1(h4.getBoolean(V1.j.f3236V, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            z1(h4.getBoolean(V1.j.f3228T, false));
        }
        u1(i2.c.d(this.f7832h0, h4, V1.j.f3224S));
        if (h4.hasValue(V1.j.f3232U)) {
            w1(i2.c.a(this.f7832h0, h4, V1.j.f3232U));
        }
        w2(c.b(this.f7832h0, h4, V1.j.f3372x0));
        m2(c.b(this.f7832h0, h4, V1.j.f3347s0));
        Q1(h4.getDimension(V1.j.f3287g0, 0.0f));
        q2(h4.getDimension(V1.j.f3357u0, 0.0f));
        o2(h4.getDimension(V1.j.f3352t0, 0.0f));
        D2(h4.getDimension(V1.j.f3382z0, 0.0f));
        B2(h4.getDimension(V1.j.f3377y0, 0.0f));
        e2(h4.getDimension(V1.j.f3327o0, 0.0f));
        Z1(h4.getDimension(V1.j.f3317m0, 0.0f));
        E1(h4.getDimension(V1.j.f3248Y, 0.0f));
        s2(h4.getDimensionPixelSize(V1.j.f3210P, Integer.MAX_VALUE));
        h4.recycle();
    }

    public void p2(int i4) {
        o2(this.f7832h0.getResources().getDimension(i4));
    }

    public void q1() {
        C0128a aVar = (C0128a) this.f7800F0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void q2(float f4) {
        if (this.f7825a0 != f4) {
            float h02 = h0();
            this.f7825a0 = f4;
            float h03 = h0();
            invalidateSelf();
            if (h02 != h03) {
                q1();
            }
        }
    }

    public final void r0(Canvas canvas, Rect rect) {
        if (H2()) {
            g0(rect, this.f7836l0);
            RectF rectF = this.f7836l0;
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas.translate(f4, f5);
            this.f7820V.setBounds(0, 0, (int) this.f7836l0.width(), (int) this.f7836l0.height());
            this.f7820V.draw(canvas);
            canvas.translate(-f4, -f5);
        }
    }

    public final boolean r1(int[] iArr, int[] iArr2) {
        boolean z4;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f7789A;
        int l4 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f7840p0) : 0);
        boolean z5 = true;
        if (this.f7840p0 != l4) {
            this.f7840p0 = l4;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f7791B;
        int l5 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f7841q0) : 0);
        if (this.f7841q0 != l5) {
            this.f7841q0 = l5;
            onStateChange = true;
        }
        int e4 = C0393a.e(l4, l5);
        if ((this.f7842r0 != e4) || (x() == null)) {
            this.f7842r0 = e4;
            U(ColorStateList.valueOf(e4));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f7797E;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f7843s0) : 0;
        if (this.f7843s0 != colorForState) {
            this.f7843s0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f7798E0 == null || !C0761b.b(iArr)) ? 0 : this.f7798E0.getColorForState(iArr, this.f7844t0);
        if (this.f7844t0 != colorForState2) {
            this.f7844t0 = colorForState2;
            if (this.f7796D0) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f7839o0.d() == null || this.f7839o0.d().f10264a == null) ? 0 : this.f7839o0.d().f10264a.getColorForState(iArr, this.f7845u0);
        if (this.f7845u0 != colorForState3) {
            this.f7845u0 = colorForState3;
            onStateChange = true;
        }
        boolean z6 = i1(getState(), 16842912) && this.f7818T;
        if (this.f7846v0 == z6 || this.f7820V == null) {
            z4 = false;
        } else {
            float h02 = h0();
            this.f7846v0 = z6;
            if (h02 != h0()) {
                onStateChange = true;
                z4 = true;
            } else {
                z4 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f7790A0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f7847w0) : 0;
        if (this.f7847w0 != colorForState4) {
            this.f7847w0 = colorForState4;
            this.f7850z0 = C0574a.a(this, this.f7790A0, this.f7792B0);
        } else {
            z5 = onStateChange;
        }
        if (n1(this.f7807J)) {
            z5 |= this.f7807J.setState(iArr);
        }
        if (n1(this.f7820V)) {
            z5 |= this.f7820V.setState(iArr);
        }
        if (n1(this.f7813O)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z5 |= this.f7813O.setState(iArr3);
        }
        if (C0761b.f10903a && n1(this.f7814P)) {
            z5 |= this.f7814P.setState(iArr2);
        }
        if (z5) {
            invalidateSelf();
        }
        if (z4) {
            q1();
        }
        return z5;
    }

    public void r2(int i4) {
        q2(this.f7832h0.getResources().getDimension(i4));
    }

    public final void s0(Canvas canvas, Rect rect) {
        if (!this.f7808J0) {
            this.f7833i0.setColor(this.f7841q0);
            this.f7833i0.setStyle(Paint.Style.FILL);
            this.f7833i0.setColorFilter(g1());
            this.f7836l0.set(rect);
            canvas.drawRoundRect(this.f7836l0, D0(), D0(), this.f7833i0);
        }
    }

    public void s1(boolean z4) {
        if (this.f7818T != z4) {
            this.f7818T = z4;
            float h02 = h0();
            if (!z4 && this.f7846v0) {
                this.f7846v0 = false;
            }
            float h03 = h0();
            invalidateSelf();
            if (h02 != h03) {
                q1();
            }
        }
    }

    public void s2(int i4) {
        this.f7806I0 = i4;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    public void setAlpha(int i4) {
        if (this.f7848x0 != i4) {
            this.f7848x0 = i4;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f7849y0 != colorFilter) {
            this.f7849y0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f7790A0 != colorStateList) {
            this.f7790A0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f7792B0 != mode) {
            this.f7792B0 = mode;
            this.f7850z0 = C0574a.a(this, this.f7790A0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        if (I2()) {
            visible |= this.f7807J.setVisible(z4, z5);
        }
        if (H2()) {
            visible |= this.f7820V.setVisible(z4, z5);
        }
        if (J2()) {
            visible |= this.f7813O.setVisible(z4, z5);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t0(Canvas canvas, Rect rect) {
        if (I2()) {
            g0(rect, this.f7836l0);
            RectF rectF = this.f7836l0;
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas.translate(f4, f5);
            this.f7807J.setBounds(0, 0, (int) this.f7836l0.width(), (int) this.f7836l0.height());
            this.f7807J.draw(canvas);
            canvas.translate(-f4, -f5);
        }
    }

    public void t1(int i4) {
        s1(this.f7832h0.getResources().getBoolean(i4));
    }

    public void t2(ColorStateList colorStateList) {
        if (this.f7801G != colorStateList) {
            this.f7801G = colorStateList;
            L2();
            onStateChange(getState());
        }
    }

    public final void u0(Canvas canvas, Rect rect) {
        if (this.f7799F > 0.0f && !this.f7808J0) {
            this.f7833i0.setColor(this.f7843s0);
            this.f7833i0.setStyle(Paint.Style.STROKE);
            if (!this.f7808J0) {
                this.f7833i0.setColorFilter(g1());
            }
            RectF rectF = this.f7836l0;
            float f4 = this.f7799F;
            rectF.set(((float) rect.left) + (f4 / 2.0f), ((float) rect.top) + (f4 / 2.0f), ((float) rect.right) - (f4 / 2.0f), ((float) rect.bottom) - (f4 / 2.0f));
            float f5 = this.f7795D - (this.f7799F / 2.0f);
            canvas.drawRoundRect(this.f7836l0, f5, f5, this.f7833i0);
        }
    }

    public void u1(Drawable drawable) {
        if (this.f7820V != drawable) {
            float h02 = h0();
            this.f7820V = drawable;
            float h03 = h0();
            K2(this.f7820V);
            f0(this.f7820V);
            invalidateSelf();
            if (h02 != h03) {
                q1();
            }
        }
    }

    public void u2(int i4) {
        t2(C0754a.a(this.f7832h0, i4));
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v0(Canvas canvas, Rect rect) {
        if (!this.f7808J0) {
            this.f7833i0.setColor(this.f7840p0);
            this.f7833i0.setStyle(Paint.Style.FILL);
            this.f7836l0.set(rect);
            canvas.drawRoundRect(this.f7836l0, D0(), D0(), this.f7833i0);
        }
    }

    public void v1(int i4) {
        u1(C0754a.b(this.f7832h0, i4));
    }

    public void v2(boolean z4) {
        this.f7804H0 = z4;
    }

    public final void w0(Canvas canvas, Rect rect) {
        if (J2()) {
            j0(rect, this.f7836l0);
            RectF rectF = this.f7836l0;
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas.translate(f4, f5);
            this.f7813O.setBounds(0, 0, (int) this.f7836l0.width(), (int) this.f7836l0.height());
            if (C0761b.f10903a) {
                this.f7814P.setBounds(this.f7813O.getBounds());
                this.f7814P.jumpToCurrentState();
                this.f7814P.draw(canvas);
            } else {
                this.f7813O.draw(canvas);
            }
            canvas.translate(-f4, -f5);
        }
    }

    public void w1(ColorStateList colorStateList) {
        if (this.f7821W != colorStateList) {
            this.f7821W = colorStateList;
            if (p0()) {
                K.a.i(this.f7820V, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void w2(c cVar) {
        this.f7822X = cVar;
    }

    public final void x0(Canvas canvas, Rect rect) {
        this.f7833i0.setColor(this.f7844t0);
        this.f7833i0.setStyle(Paint.Style.FILL);
        this.f7836l0.set(rect);
        if (!this.f7808J0) {
            canvas.drawRoundRect(this.f7836l0, D0(), D0(), this.f7833i0);
            return;
        }
        h(new RectF(rect), this.f7838n0);
        super.p(canvas, this.f7833i0, this.f7838n0, u());
    }

    public void x1(int i4) {
        w1(C0754a.a(this.f7832h0, i4));
    }

    public void x2(int i4) {
        w2(c.c(this.f7832h0, i4));
    }

    public final void y0(Canvas canvas, Rect rect) {
        Paint paint = this.f7834j0;
        if (paint != null) {
            paint.setColor(J.a.d(-16777216, 127));
            canvas.drawRect(rect, this.f7834j0);
            if (I2() || H2()) {
                g0(rect, this.f7836l0);
                canvas.drawRect(this.f7836l0, this.f7834j0);
            }
            if (this.f7803H != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f7834j0);
            }
            if (J2()) {
                j0(rect, this.f7836l0);
                canvas.drawRect(this.f7836l0, this.f7834j0);
            }
            this.f7834j0.setColor(J.a.d(-65536, 127));
            i0(rect, this.f7836l0);
            canvas.drawRect(this.f7836l0, this.f7834j0);
            this.f7834j0.setColor(J.a.d(-16711936, 127));
            k0(rect, this.f7836l0);
            canvas.drawRect(this.f7836l0, this.f7834j0);
        }
    }

    public void y1(int i4) {
        z1(this.f7832h0.getResources().getBoolean(i4));
    }

    public void y2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f7803H, charSequence)) {
            this.f7803H = charSequence;
            this.f7839o0.i(true);
            invalidateSelf();
            q1();
        }
    }

    public final void z0(Canvas canvas, Rect rect) {
        if (this.f7803H != null) {
            Paint.Align o02 = o0(rect, this.f7837m0);
            m0(rect, this.f7836l0);
            if (this.f7839o0.d() != null) {
                this.f7839o0.e().drawableState = getState();
                this.f7839o0.j(this.f7832h0);
            }
            this.f7839o0.e().setTextAlign(o02);
            int i4 = 0;
            boolean z4 = Math.round(this.f7839o0.f(c1().toString())) > Math.round(this.f7836l0.width());
            if (z4) {
                i4 = canvas.save();
                canvas.clipRect(this.f7836l0);
            }
            CharSequence charSequence = this.f7803H;
            if (z4 && this.f7802G0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f7839o0.e(), this.f7836l0.width(), this.f7802G0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f7837m0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f7839o0.e());
            if (z4) {
                canvas.restoreToCount(i4);
            }
        }
    }

    public void z1(boolean z4) {
        if (this.f7819U != z4) {
            boolean H22 = H2();
            this.f7819U = z4;
            boolean H23 = H2();
            if (H22 != H23) {
                if (H23) {
                    f0(this.f7820V);
                } else {
                    K2(this.f7820V);
                }
                invalidateSelf();
                q1();
            }
        }
    }

    public void z2(d dVar) {
        this.f7839o0.h(dVar, this.f7832h0);
    }
}
