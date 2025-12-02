package com.google.android.material.snackbar;

import V1.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import m2.C0791a;

public class Snackbar extends BaseTransientBottomBar {

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f8050A;

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f8051B;

    /* renamed from: y  reason: collision with root package name */
    public final AccessibilityManager f8052y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8053z;

    public static final class SnackbarLayout extends BaseTransientBottomBar.v {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void onMeasure(int i4, int i5) {
            super.onMeasure(i4, i5);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f8054c;

        public a(View.OnClickListener onClickListener) {
            this.f8054c = onClickListener;
        }

        public void onClick(View view) {
            this.f8054c.onClick(view);
            Snackbar.this.w(1);
        }
    }

    static {
        int i4 = V1.a.f2988w;
        f8050A = new int[]{i4};
        f8051B = new int[]{i4, V1.a.f2990y};
    }

    public Snackbar(Context context, ViewGroup viewGroup, View view, C0791a aVar) {
        super(context, viewGroup, view, aVar);
        this.f8052y = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static ViewGroup Y(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public static boolean Z(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f8051B);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar a0(View view, int i4, int i5) {
        return b0(view, view.getResources().getText(i4), i5);
    }

    public static Snackbar b0(View view, CharSequence charSequence, int i4) {
        return c0((Context) null, view, charSequence, i4);
    }

    public static Snackbar c0(Context context, View view, CharSequence charSequence, int i4) {
        ViewGroup Y3 = Y(view);
        if (Y3 != null) {
            if (context == null) {
                context = Y3.getContext();
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(Z(context) ? g.f3101s : g.f3084b, Y3, false);
            Snackbar snackbar = new Snackbar(context, Y3, snackbarContentLayout, snackbarContentLayout);
            snackbar.f0(charSequence);
            snackbar.M(i4);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public void Q() {
        super.Q();
    }

    public Snackbar d0(int i4, View.OnClickListener onClickListener) {
        return e0(y().getText(i4), onClickListener);
    }

    public Snackbar e0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f7999c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener((View.OnClickListener) null);
            this.f8053z = false;
        } else {
            this.f8053z = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new a(onClickListener));
        }
        return this;
    }

    public Snackbar f0(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f7999c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    public void v() {
        super.v();
    }

    public int z() {
        int z4 = super.z();
        if (z4 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f8052y.getRecommendedTimeoutMillis(z4, (this.f8053z ? 4 : 0) | 3);
        } else if (!this.f8053z || !this.f8052y.isTouchExplorationEnabled()) {
            return z4;
        } else {
            return -2;
        }
    }
}
