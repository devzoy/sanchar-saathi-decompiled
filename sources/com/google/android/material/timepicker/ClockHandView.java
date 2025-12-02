package com.google.android.material.timepicker;

import S.C;
import V1.i;
import V1.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

class ClockHandView extends View {

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f8240c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8241d;

    /* renamed from: e  reason: collision with root package name */
    public float f8242e;

    /* renamed from: f  reason: collision with root package name */
    public float f8243f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8244g;

    /* renamed from: h  reason: collision with root package name */
    public int f8245h;

    /* renamed from: i  reason: collision with root package name */
    public final List f8246i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8247j;

    /* renamed from: k  reason: collision with root package name */
    public final float f8248k;

    /* renamed from: l  reason: collision with root package name */
    public final Paint f8249l;

    /* renamed from: m  reason: collision with root package name */
    public final RectF f8250m;

    /* renamed from: n  reason: collision with root package name */
    public final int f8251n;

    /* renamed from: o  reason: collision with root package name */
    public float f8252o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8253p;

    /* renamed from: q  reason: collision with root package name */
    public double f8254q;

    /* renamed from: r  reason: collision with root package name */
    public int f8255r;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void a(float f4, boolean z4);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, V1.a.f2984s);
    }

    public void b(c cVar) {
        this.f8246i.add(cVar);
    }

    public final void c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f4 = (float) width;
        float f5 = (float) height;
        this.f8249l.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.f8255r) * ((float) Math.cos(this.f8254q))) + f4, (((float) this.f8255r) * ((float) Math.sin(this.f8254q))) + f5, (float) this.f8247j, this.f8249l);
        double sin = Math.sin(this.f8254q);
        double cos = Math.cos(this.f8254q);
        double d4 = (double) ((float) (this.f8255r - this.f8247j));
        float f6 = (float) (width + ((int) (cos * d4)));
        float f7 = (float) (height + ((int) (d4 * sin)));
        this.f8249l.setStrokeWidth((float) this.f8251n);
        canvas.drawLine(f4, f5, f6, f7, this.f8249l);
        canvas.drawCircle(f4, f5, this.f8248k, this.f8249l);
    }

    public RectF d() {
        return this.f8250m;
    }

    public final int e(float f4, float f5) {
        int degrees = (int) Math.toDegrees(Math.atan2((double) (f5 - ((float) (getHeight() / 2))), (double) (f4 - ((float) (getWidth() / 2)))));
        int i4 = degrees + 90;
        return i4 < 0 ? degrees + 450 : i4;
    }

    public float f() {
        return this.f8252o;
    }

    public int g() {
        return this.f8247j;
    }

    public final Pair h(float f4) {
        float f5 = f();
        if (Math.abs(f5 - f4) > 180.0f) {
            if (f5 > 180.0f && f4 < 180.0f) {
                f4 += 360.0f;
            }
            if (f5 < 180.0f && f4 > 180.0f) {
                f5 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(f5), Float.valueOf(f4));
    }

    public final boolean i(float f4, float f5, boolean z4, boolean z5, boolean z6) {
        float e4 = (float) e(f4, f5);
        boolean z7 = false;
        boolean z8 = f() != e4;
        if (z5 && z8) {
            return true;
        }
        if (!z8 && !z4) {
            return false;
        }
        if (z6 && this.f8241d) {
            z7 = true;
        }
        l(e4, z7);
        return true;
    }

    public void j(int i4) {
        this.f8255r = i4;
        invalidate();
    }

    public void k(float f4) {
        l(f4, false);
    }

    public void l(float f4, boolean z4) {
        ValueAnimator valueAnimator = this.f8240c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z4) {
            m(f4, false);
            return;
        }
        Pair h4 = h(f4);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) h4.first).floatValue(), ((Float) h4.second).floatValue()});
        this.f8240c = ofFloat;
        ofFloat.setDuration(200);
        this.f8240c.addUpdateListener(new a());
        this.f8240c.addListener(new b());
        this.f8240c.start();
    }

    public final void m(float f4, boolean z4) {
        float f5 = f4 % 360.0f;
        this.f8252o = f5;
        this.f8254q = Math.toRadians((double) (f5 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.f8255r) * ((float) Math.cos(this.f8254q)));
        float height = ((float) (getHeight() / 2)) + (((float) this.f8255r) * ((float) Math.sin(this.f8254q)));
        RectF rectF = this.f8250m;
        int i4 = this.f8247j;
        rectF.set(width - ((float) i4), height - ((float) i4), width + ((float) i4), height + ((float) i4));
        for (c a4 : this.f8246i) {
            a4.a(f5, z4);
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        k(f());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f8242e = x4;
            this.f8243f = y4;
            this.f8244g = true;
            this.f8253p = false;
            z5 = true;
            z6 = false;
            z4 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i4 = (int) (x4 - this.f8242e);
            int i5 = (int) (y4 - this.f8243f);
            this.f8244g = (i4 * i4) + (i5 * i5) > this.f8245h;
            z6 = this.f8253p;
            z4 = actionMasked == 1;
            z5 = false;
        } else {
            z6 = false;
            z5 = false;
            z4 = false;
        }
        this.f8253p |= i(x4, y4, z6, z5, z4);
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f8246i = new ArrayList();
        Paint paint = new Paint();
        this.f8249l = paint;
        this.f8250m = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3196M0, i4, i.f3133n);
        this.f8255r = obtainStyledAttributes.getDimensionPixelSize(j.f3206O0, 0);
        this.f8247j = obtainStyledAttributes.getDimensionPixelSize(j.f3211P0, 0);
        Resources resources = getResources();
        this.f8251n = resources.getDimensionPixelSize(V1.c.f3018h);
        this.f8248k = (float) resources.getDimensionPixelSize(V1.c.f3016f);
        int color = obtainStyledAttributes.getColor(j.f3201N0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.f8245h = ViewConfiguration.get(context).getScaledTouchSlop();
        C.q0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
