package com.google.android.material.timepicker;

import S.C;
import V1.e;
import V1.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import l2.g;
import l2.i;

public abstract class b extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    public int f8270A;

    /* renamed from: B  reason: collision with root package name */
    public g f8271B;

    /* renamed from: z  reason: collision with root package name */
    public final Runnable f8272z = new a();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b.this.x();
        }
    }

    public b(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        LayoutInflater.from(context).inflate(V1.g.f3090h, this);
        C.j0(this, t());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3320m3, i4, 0);
        this.f8270A = obtainStyledAttributes.getDimensionPixelSize(j.f3325n3, 0);
        obtainStyledAttributes.recycle();
    }

    public static boolean w(View view) {
        return "skip".equals(view.getTag());
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (view.getId() == -1) {
            view.setId(C.i());
        }
        y();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        x();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        y();
    }

    public void setBackgroundColor(int i4) {
        this.f8271B.U(ColorStateList.valueOf(i4));
    }

    public final Drawable t() {
        g gVar = new g();
        this.f8271B = gVar;
        gVar.S(new i(0.5f));
        this.f8271B.U(ColorStateList.valueOf(-1));
        return this.f8271B;
    }

    public int u() {
        return this.f8270A;
    }

    public void v(int i4) {
        this.f8270A = i4;
        x();
    }

    public void x() {
        int childCount = getChildCount();
        int i4 = 1;
        for (int i5 = 0; i5 < childCount; i5++) {
            if (w(getChildAt(i5))) {
                i4++;
            }
        }
        c cVar = new c();
        cVar.g(this);
        float f4 = 0.0f;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getId() != e.f3057b && !w(childAt)) {
                cVar.h(childAt.getId(), e.f3057b, this.f8270A, f4);
                f4 += 360.0f / ((float) (childCount - i4));
            }
        }
        cVar.c(this);
    }

    public final void y() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f8272z);
            handler.post(this.f8272z);
        }
    }
}
