package com.google.android.material.bottomappbar;

import S.C;
import V1.i;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

public abstract class BottomAppBar extends Toolbar {

    /* renamed from: Q  reason: collision with root package name */
    public static final int f7647Q = i.f3125f;

    public static /* synthetic */ void O(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ View P(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        public final Rect f7648e = new Rect();

        /* renamed from: f  reason: collision with root package name */
        public WeakReference f7649f;

        /* renamed from: g  reason: collision with root package name */
        public int f7650g;

        /* renamed from: h  reason: collision with root package name */
        public final View.OnLayoutChangeListener f7651h = new a();

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                b.a(Behavior.this.f7649f.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
            b.a(view);
            return K(coordinatorLayout, (BottomAppBar) null, view2, view3, i4, i5);
        }

        public boolean J(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i4) {
            this.f7649f = new WeakReference(bottomAppBar);
            View P4 = BottomAppBar.P(bottomAppBar);
            if (P4 != null && !C.M(P4)) {
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) P4.getLayoutParams();
                eVar.f4947d = 49;
                this.f7650g = eVar.bottomMargin;
                BottomAppBar.O(bottomAppBar);
            }
            coordinatorLayout.G(bottomAppBar, i4);
            return super.l(coordinatorLayout, bottomAppBar, i4);
        }

        public boolean K(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i4, int i5) {
            throw null;
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            b.a(view);
            return J(coordinatorLayout, (BottomAppBar) null, i4);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
