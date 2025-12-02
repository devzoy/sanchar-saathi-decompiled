package androidx.appcompat.widget;

import S.C;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import h.f;
import h.j;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public boolean f4439c;

    /* renamed from: d  reason: collision with root package name */
    public int f4440d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f4441e = 0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f9400O0);
        C.e0(this, context, j.f9400O0, attributeSet, obtainStyledAttributes, 0, 0);
        this.f4439c = obtainStyledAttributes.getBoolean(j.f9405P0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z4) {
        setOrientation(z4 ? 1 : 0);
        setGravity(z4 ? 5 : 80);
        View findViewById = findViewById(f.f9259F);
        if (findViewById != null) {
            findViewById.setVisibility(z4 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public final int a(int i4) {
        int childCount = getChildCount();
        while (i4 < childCount) {
            if (getChildAt(i4).getVisibility() == 0) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public final boolean b() {
        return getOrientation() == 1;
    }

    public int getMinimumHeight() {
        return Math.max(this.f4441e, super.getMinimumHeight());
    }

    public void onMeasure(int i4, int i5) {
        boolean z4;
        int i6;
        int size = View.MeasureSpec.getSize(i4);
        int i7 = 0;
        if (this.f4439c) {
            if (size > this.f4440d && b()) {
                setStacked(false);
            }
            this.f4440d = size;
        }
        if (b() || View.MeasureSpec.getMode(i4) != 1073741824) {
            i6 = i4;
            z4 = false;
        } else {
            i6 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        }
        super.onMeasure(i6, i5);
        if (this.f4439c && !b() && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i4, i5);
        }
        int a4 = a(0);
        if (a4 >= 0) {
            View childAt = getChildAt(a4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int a5 = a(a4 + 1);
                if (a5 >= 0) {
                    paddingTop += getChildAt(a5).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i7 = paddingTop;
            } else {
                i7 = paddingTop + getPaddingBottom();
            }
        }
        if (C.y(this) != i7) {
            setMinimumHeight(i7);
        }
    }

    public void setAllowStacking(boolean z4) {
        if (this.f4439c != z4) {
            this.f4439c = z4;
            if (!z4 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
