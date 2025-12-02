package com.google.android.material.timepicker;

import S.C;
import S.C0310a;
import T.m;
import V1.e;
import V1.g;
import V1.i;
import V1.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import i2.c;
import j.C0754a;
import java.util.Arrays;

class ClockFaceView extends b implements ClockHandView.c {

    /* renamed from: C  reason: collision with root package name */
    public final ClockHandView f8227C;

    /* renamed from: D  reason: collision with root package name */
    public final Rect f8228D;

    /* renamed from: E  reason: collision with root package name */
    public final RectF f8229E;

    /* renamed from: F  reason: collision with root package name */
    public final SparseArray f8230F;

    /* renamed from: G  reason: collision with root package name */
    public final C0310a f8231G;

    /* renamed from: H  reason: collision with root package name */
    public final int[] f8232H;

    /* renamed from: I  reason: collision with root package name */
    public final float[] f8233I;

    /* renamed from: J  reason: collision with root package name */
    public final int f8234J;

    /* renamed from: K  reason: collision with root package name */
    public String[] f8235K;

    /* renamed from: L  reason: collision with root package name */
    public float f8236L;

    /* renamed from: M  reason: collision with root package name */
    public final ColorStateList f8237M;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.v(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f8227C.g()) - ClockFaceView.this.f8234J);
            return true;
        }
    }

    public class b extends C0310a {
        public b() {
        }

        public void g(View view, m mVar) {
            super.g(view, mVar);
            int intValue = ((Integer) view.getTag(e.f3068m)).intValue();
            if (intValue > 0) {
                mVar.z0((View) ClockFaceView.this.f8230F.get(intValue - 1));
            }
            mVar.f0(m.f.a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, V1.a.f2984s);
    }

    public final void C() {
        RectF d4 = this.f8227C.d();
        for (int i4 = 0; i4 < this.f8230F.size(); i4++) {
            TextView textView = (TextView) this.f8230F.get(i4);
            if (textView != null) {
                textView.getDrawingRect(this.f8228D);
                this.f8228D.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f8228D);
                this.f8229E.set(this.f8228D);
                textView.getPaint().setShader(D(d4, this.f8229E));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient D(RectF rectF, RectF rectF2) {
        if (!RectF.intersects(rectF, rectF2)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f8229E.left, rectF.centerY() - this.f8229E.top, rectF.width() * 0.5f, this.f8232H, this.f8233I, Shader.TileMode.CLAMP);
    }

    public void E(String[] strArr, int i4) {
        this.f8235K = strArr;
        F(i4);
    }

    public final void F(int i4) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f8230F.size();
        for (int i5 = 0; i5 < Math.max(this.f8235K.length, size); i5++) {
            TextView textView = (TextView) this.f8230F.get(i5);
            if (i5 >= this.f8235K.length) {
                removeView(textView);
                this.f8230F.remove(i5);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(g.f3088f, this, false);
                    this.f8230F.put(i5, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f8235K[i5]);
                textView.setTag(e.f3068m, Integer.valueOf(i5));
                C.g0(textView, this.f8231G);
                textView.setTextColor(this.f8237M);
                if (i4 != 0) {
                    textView.setContentDescription(getResources().getString(i4, new Object[]{this.f8235K[i5]}));
                }
            }
        }
    }

    public void a(float f4, boolean z4) {
        if (Math.abs(this.f8236L - f4) > 0.001f) {
            this.f8236L = f4;
            C();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m.C0(accessibilityNodeInfo).e0(m.e.a(1, this.f8235K.length, false, 1));
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        C();
    }

    public void v(int i4) {
        if (i4 != u()) {
            super.v(i4);
            this.f8227C.j(u());
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f8228D = new Rect();
        this.f8229E = new RectF();
        this.f8230F = new SparseArray();
        this.f8233I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3181J0, i4, i.f3133n);
        Resources resources = getResources();
        ColorStateList a4 = c.a(context, obtainStyledAttributes, j.f3191L0);
        this.f8237M = a4;
        LayoutInflater.from(context).inflate(g.f3089g, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(e.f3063h);
        this.f8227C = clockHandView;
        this.f8234J = resources.getDimensionPixelSize(V1.c.f3017g);
        int colorForState = a4.getColorForState(new int[]{16842913}, a4.getDefaultColor());
        this.f8232H = new int[]{colorForState, colorForState, a4.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = C0754a.a(context, V1.b.f2993b).getDefaultColor();
        ColorStateList a5 = c.a(context, obtainStyledAttributes, j.f3186K0);
        setBackgroundColor(a5 != null ? a5.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f8231G = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        E(strArr, 0);
    }
}
