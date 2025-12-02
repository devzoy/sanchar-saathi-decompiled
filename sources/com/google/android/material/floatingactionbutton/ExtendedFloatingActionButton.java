package com.google.android.material.floatingactionbutton;

import V1.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

public abstract class ExtendedFloatingActionButton extends MaterialButton {

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7971a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7972b;

        public ExtendedFloatingActionButtonBehavior() {
            this.f7971a = false;
            this.f7972b = true;
        }

        public static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean G(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (!F(view)) {
                return false;
            }
            J(view, extendedFloatingActionButton);
            return false;
        }

        public boolean H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i4) {
            List q4 = coordinatorLayout.q(extendedFloatingActionButton);
            int size = q4.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = (View) q4.get(i5);
                if (F(view) && J(view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.G(extendedFloatingActionButton, i4);
            return true;
        }

        public final boolean I(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        public final boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!I(view, extendedFloatingActionButton)) {
                return false;
            }
            throw null;
        }

        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            b.a(view);
            return E(coordinatorLayout, (ExtendedFloatingActionButton) null, rect);
        }

        public void g(CoordinatorLayout.e eVar) {
            if (eVar.f4951h == 0) {
                eVar.f4951h = 80;
            }
        }

        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            b.a(view);
            return G(coordinatorLayout, (ExtendedFloatingActionButton) null, view2);
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            b.a(view);
            return H(coordinatorLayout, (ExtendedFloatingActionButton) null, i4);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3273d1);
            this.f7971a = obtainStyledAttributes.getBoolean(j.f3278e1, false);
            this.f7972b = obtainStyledAttributes.getBoolean(j.f3283f1, true);
            obtainStyledAttributes.recycle();
        }
    }
}
