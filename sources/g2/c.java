package g2;

import S.C;
import S.C0320k;
import V1.e;
import V1.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    public int f9120c;

    /* renamed from: d  reason: collision with root package name */
    public int f9121d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9122e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f9123f;

    public c(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        d(context, attributeSet);
    }

    public static int a(int i4, int i5, int i6) {
        return i5 != Integer.MIN_VALUE ? i5 != 1073741824 ? i6 : i4 : Math.min(i6, i4);
    }

    public int b(View view) {
        Object tag = view.getTag(e.f3045B);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    public boolean c() {
        return this.f9122e;
    }

    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j.f3303j1, 0, 0);
        this.f9120c = obtainStyledAttributes.getDimensionPixelSize(j.f3313l1, 0);
        this.f9121d = obtainStyledAttributes.getDimensionPixelSize(j.f3308k1, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f9121d;
    }

    public int getLineSpacing() {
        return this.f9120c;
    }

    public int getRowCount() {
        return this.f9123f;
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (getChildCount() == 0) {
            this.f9123f = 0;
            return;
        }
        this.f9123f = 1;
        boolean z5 = C.x(this) == 1;
        int paddingRight = z5 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z5 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i10 = (i6 - i4) - paddingLeft;
        int i11 = paddingRight;
        int i12 = paddingTop;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(e.f3045B, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i8 = C0320k.b(marginLayoutParams);
                    i9 = C0320k.a(marginLayoutParams);
                } else {
                    i9 = 0;
                    i8 = 0;
                }
                int measuredWidth = i11 + i8 + childAt.getMeasuredWidth();
                if (!this.f9122e && measuredWidth > i10) {
                    i12 = this.f9120c + paddingTop;
                    this.f9123f++;
                    i11 = paddingRight;
                }
                childAt.setTag(e.f3045B, Integer.valueOf(this.f9123f - 1));
                int i14 = i11 + i8;
                int measuredWidth2 = childAt.getMeasuredWidth() + i14;
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                if (z5) {
                    childAt.layout(i10 - measuredWidth2, i12, (i10 - i11) - i8, measuredHeight);
                } else {
                    childAt.layout(i14, i12, measuredWidth2, measuredHeight);
                }
                i11 += i8 + i9 + childAt.getMeasuredWidth() + this.f9121d;
                paddingTop = measuredHeight;
            }
        }
    }

    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        int i9 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i9 - getPaddingRight();
        int i10 = paddingTop;
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                int i13 = i4;
                int i14 = i5;
            } else {
                measureChild(childAt, i4, i5);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = marginLayoutParams.leftMargin;
                    i6 = marginLayoutParams.rightMargin;
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                int i15 = paddingLeft;
                if (paddingLeft + i7 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    i8 = i15;
                } else {
                    i8 = getPaddingLeft();
                    i10 = this.f9120c + paddingTop;
                }
                int measuredWidth = i8 + i7 + childAt.getMeasuredWidth();
                int measuredHeight = i10 + childAt.getMeasuredHeight();
                if (measuredWidth > i11) {
                    i11 = measuredWidth;
                }
                paddingLeft = i8 + i7 + i6 + childAt.getMeasuredWidth() + this.f9121d;
                if (i12 == getChildCount() - 1) {
                    i11 += i6;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i11 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i4) {
        this.f9121d = i4;
    }

    public void setLineSpacing(int i4) {
        this.f9120c = i4;
    }

    public void setSingleLine(boolean z4) {
        this.f9122e = z4;
    }
}
