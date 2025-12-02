package com.google.android.material.snackbar;

import S.C;
import V1.a;
import V1.c;
import V1.e;
import V1.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b2.C0393a;
import m2.C0791a;

public class SnackbarContentLayout extends LinearLayout implements C0791a {

    /* renamed from: c  reason: collision with root package name */
    public TextView f8056c;

    /* renamed from: d  reason: collision with root package name */
    public Button f8057d;

    /* renamed from: e  reason: collision with root package name */
    public int f8058e;

    /* renamed from: f  reason: collision with root package name */
    public int f8059f;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3184J3);
        this.f8058e = obtainStyledAttributes.getDimensionPixelSize(j.f3189K3, -1);
        this.f8059f = obtainStyledAttributes.getDimensionPixelSize(j.R3, -1);
        obtainStyledAttributes.recycle();
    }

    public static void d(View view, int i4, int i5) {
        if (C.O(view)) {
            C.u0(view, C.B(view), i4, C.A(view), i5);
        } else {
            view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), i5);
        }
    }

    public void a(int i4, int i5) {
        this.f8056c.setAlpha(0.0f);
        long j4 = (long) i5;
        long j5 = (long) i4;
        this.f8056c.animate().alpha(1.0f).setDuration(j4).setStartDelay(j5).start();
        if (this.f8057d.getVisibility() == 0) {
            this.f8057d.setAlpha(0.0f);
            this.f8057d.animate().alpha(1.0f).setDuration(j4).setStartDelay(j5).start();
        }
    }

    public void b(int i4, int i5) {
        this.f8056c.setAlpha(1.0f);
        long j4 = (long) i5;
        long j5 = (long) i4;
        this.f8056c.animate().alpha(0.0f).setDuration(j4).setStartDelay(j5).start();
        if (this.f8057d.getVisibility() == 0) {
            this.f8057d.setAlpha(1.0f);
            this.f8057d.animate().alpha(0.0f).setDuration(j4).setStartDelay(j5).start();
        }
    }

    public void c(float f4) {
        if (f4 != 1.0f) {
            this.f8057d.setTextColor(C0393a.f(C0393a.c(this, a.f2976k), this.f8057d.getCurrentTextColor(), f4));
        }
    }

    public final boolean e(int i4, int i5, int i6) {
        boolean z4;
        if (i4 != getOrientation()) {
            setOrientation(i4);
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f8056c.getPaddingTop() == i5 && this.f8056c.getPaddingBottom() == i6) {
            return z4;
        }
        d(this.f8056c, i5, i6);
        return true;
    }

    public Button getActionView() {
        return this.f8057d;
    }

    public TextView getMessageView() {
        return this.f8056c;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f8056c = (TextView) findViewById(e.f3048E);
        this.f8057d = (Button) findViewById(e.f3047D);
    }

    public void onMeasure(int i4, int i5) {
        int i6;
        super.onMeasure(i4, i5);
        if (this.f8058e > 0 && getMeasuredWidth() > (i6 = this.f8058e)) {
            i4 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            super.onMeasure(i4, i5);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.f3014d);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.f3013c);
        boolean z4 = this.f8056c.getLayout().getLineCount() > 1;
        if (!z4 || this.f8059f <= 0 || this.f8057d.getMeasuredWidth() <= this.f8059f) {
            if (!z4) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i4, i5);
    }

    public void setMaxInlineActionWidth(int i4) {
        this.f8059f = i4;
    }
}
