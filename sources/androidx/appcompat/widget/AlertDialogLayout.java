package androidx.appcompat.widget;

import S.C;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.b;
import h.f;

public class AlertDialogLayout extends b {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int B(View view) {
        int y4 = C.y(view);
        if (y4 > 0) {
            return y4;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return B(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public final void A(View view, int i4, int i5, int i6, int i7) {
        view.layout(i4, i5, i6 + i4, i7 + i5);
    }

    public final boolean C(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i4;
        int i11 = i5;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == f.f9268O) {
                    view = childAt;
                } else if (id == f.f9279k) {
                    view2 = childAt;
                } else if ((id != f.f9281m && id != f.f9283o) || view3 != null) {
                    return false;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i4);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i10, 0);
            paddingTop += view.getMeasuredHeight();
            i6 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i6 = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            i8 = B(view2);
            i7 = view2.getMeasuredHeight() - i8;
            paddingTop += i8;
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (view3 != null) {
            view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i9 = view3.getMeasuredHeight();
            paddingTop += i9;
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        } else {
            i9 = 0;
        }
        int i13 = size - paddingTop;
        if (view2 != null) {
            int i14 = paddingTop - i8;
            int min = Math.min(i13, i7);
            if (min > 0) {
                i13 -= min;
                i8 += min;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
            paddingTop = i14 + view2.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        }
        if (view3 != null && i13 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(i9 + i13, mode));
            paddingTop = (paddingTop - i9) + view3.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                i15 = Math.max(i15, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i15 + getPaddingLeft() + getPaddingRight(), i10, i6), View.resolveSizeAndState(paddingTop, i11, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        l(childCount, i11);
        return true;
    }

    public final void l(int i4, int i5) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i6 = 0; i6 < i4; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                b.a aVar = (b.a) childAt.getLayoutParams();
                if (aVar.width == -1) {
                    int i7 = aVar.height;
                    aVar.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i5, 0);
                    aVar.height = i7;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r21 - r19
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r0 = r17.getMeasuredHeight()
            int r10 = r17.getChildCount()
            int r1 = r17.getGravity()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r1 & r3
            r1 = 16
            if (r2 == r1) goto L_0x0040
            r1 = 80
            if (r2 == r1) goto L_0x0035
            int r0 = r17.getPaddingTop()
            goto L_0x004b
        L_0x0035:
            int r1 = r17.getPaddingTop()
            int r1 = r1 + r22
            int r1 = r1 - r20
            int r0 = r1 - r0
            goto L_0x004b
        L_0x0040:
            int r1 = r17.getPaddingTop()
            int r2 = r22 - r20
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r0 = r1 + r2
        L_0x004b:
            android.graphics.drawable.Drawable r1 = r17.getDividerDrawable()
            r2 = 0
            if (r1 != 0) goto L_0x0054
            r12 = r2
            goto L_0x0059
        L_0x0054:
            int r1 = r1.getIntrinsicHeight()
            r12 = r1
        L_0x0059:
            r13 = r2
        L_0x005a:
            if (r13 >= r10) goto L_0x00c0
            android.view.View r1 = r6.getChildAt(r13)
            if (r1 == 0) goto L_0x00bd
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x00bd
            int r4 = r1.getMeasuredWidth()
            int r14 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r15 = r2
            androidx.appcompat.widget.b$a r15 = (androidx.appcompat.widget.b.a) r15
            int r2 = r15.f4664b
            if (r2 >= 0) goto L_0x007e
            r2 = r11
        L_0x007e:
            int r3 = S.C.x(r17)
            int r2 = S.C0317h.b(r2, r3)
            r2 = r2 & 7
            r3 = 1
            if (r2 == r3) goto L_0x0098
            r3 = 5
            if (r2 == r3) goto L_0x0092
            int r2 = r15.leftMargin
            int r2 = r2 + r7
            goto L_0x00a3
        L_0x0092:
            int r2 = r8 - r4
            int r3 = r15.rightMargin
        L_0x0096:
            int r2 = r2 - r3
            goto L_0x00a3
        L_0x0098:
            int r2 = r9 - r4
            int r2 = r2 / 2
            int r2 = r2 + r7
            int r3 = r15.leftMargin
            int r2 = r2 + r3
            int r3 = r15.rightMargin
            goto L_0x0096
        L_0x00a3:
            boolean r3 = r6.t(r13)
            if (r3 == 0) goto L_0x00aa
            int r0 = r0 + r12
        L_0x00aa:
            int r3 = r15.topMargin
            int r16 = r0 + r3
            r0 = r17
            r3 = r16
            r5 = r14
            r0.A(r1, r2, r3, r4, r5)
            int r0 = r15.bottomMargin
            int r14 = r14 + r0
            int r16 = r16 + r14
            r0 = r16
        L_0x00bd:
            int r13 = r13 + 1
            goto L_0x005a
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i4, int i5) {
        if (!C(i4, i5)) {
            super.onMeasure(i4, i5);
        }
    }
}
