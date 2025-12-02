package com.google.android.material.transformation;

import W1.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: b  reason: collision with root package name */
    public final d f8286b = new d(75, 150);

    /* renamed from: c  reason: collision with root package name */
    public final d f8287c = new d(0, 150);

    public FabTransformationScrimBehavior() {
    }

    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.D(coordinatorLayout, view, motionEvent);
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
