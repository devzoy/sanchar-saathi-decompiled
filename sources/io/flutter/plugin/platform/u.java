package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

public class u extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f10600c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f10601d = new Rect();

    public u(Context context) {
        super(context);
    }

    public static int a(int i4) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), Integer.MIN_VALUE);
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f10600c.set(i4, i5, i6, i7);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f10600c, layoutParams.x, layoutParams.y, this.f10601d);
            Rect rect = this.f10601d;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void onMeasure(int i4, int i5) {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            getChildAt(i6).measure(a(i4), a(i5));
        }
        super.onMeasure(i4, i5);
    }
}
