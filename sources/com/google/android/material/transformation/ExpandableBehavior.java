package com.google.android.material.transformation;

import S.C;
import android.content.Context;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f2.C0621a;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public int f8281a = 0;

    public ExpandableBehavior() {
    }

    public C0621a E(CoordinatorLayout coordinatorLayout, View view) {
        List q4 = coordinatorLayout.q(view);
        int size = q4.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) q4.get(i4);
            if (e(coordinatorLayout, view, view2)) {
                b.a(view2);
                return null;
            }
        }
        return null;
    }

    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b.a(view2);
        throw null;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        if (C.M(view)) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
