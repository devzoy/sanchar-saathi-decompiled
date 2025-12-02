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
import f2.C0621a;
import g2.k;
import java.util.List;
import l2.n;

public abstract class FloatingActionButton extends k implements C0621a, n {

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.E(coordinatorLayout, floatingActionButton, rect);
        }

        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.H(coordinatorLayout, floatingActionButton, view);
        }

        public /* bridge */ /* synthetic */ boolean I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i4) {
            return super.I(coordinatorLayout, floatingActionButton, i4);
        }

        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.e eVar) {
            super.g(eVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7973a;

        public BaseBehavior() {
            this.f7973a = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            throw null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            throw null;
        }

        public boolean H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (!F(view)) {
                return false;
            }
            K(view, floatingActionButton);
            return false;
        }

        public boolean I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i4) {
            List q4 = coordinatorLayout.q(floatingActionButton);
            int size = q4.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = (View) q4.get(i5);
                if (F(view) && K(view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.G(floatingActionButton, i4);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        public final boolean J(View view, FloatingActionButton floatingActionButton) {
            throw null;
        }

        public final boolean K(View view, FloatingActionButton floatingActionButton) {
            if (!J(view, floatingActionButton)) {
                return false;
            }
            throw null;
        }

        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            b.a(view);
            return E(coordinatorLayout, (FloatingActionButton) null, rect);
        }

        public void g(CoordinatorLayout.e eVar) {
            if (eVar.f4951h == 0) {
                eVar.f4951h = 80;
            }
        }

        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            b.a(view);
            return H(coordinatorLayout, (FloatingActionButton) null, view2);
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            b.a(view);
            return I(coordinatorLayout, (FloatingActionButton) null, i4);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3293h1);
            this.f7973a = obtainStyledAttributes.getBoolean(j.f3298i1, true);
            obtainStyledAttributes.recycle();
        }
    }
}
