package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public int f7625a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f7626b = 2;

    /* renamed from: c  reason: collision with root package name */
    public int f7627c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f7628d;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f7628d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
        return i4 == 2;
    }

    public final void F(View view, int i4, long j4, TimeInterpolator timeInterpolator) {
        this.f7628d = view.animate().translationY((float) i4).setInterpolator(timeInterpolator).setDuration(j4).setListener(new a());
    }

    public void G(View view) {
        if (this.f7626b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f7628d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f7626b = 1;
            F(view, this.f7625a + this.f7627c, 175, W1.a.f3398c);
        }
    }

    public void H(View view) {
        if (this.f7626b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f7628d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f7626b = 2;
            F(view, 0, 225, W1.a.f3399d);
        }
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        this.f7625a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, view, i4);
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        if (i5 > 0) {
            G(view);
        } else if (i5 < 0) {
            H(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
