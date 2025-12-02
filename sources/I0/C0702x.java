package i0;

import S.C;
import S.O;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import h0.C0652c;
import java.util.ArrayList;
import java.util.List;
import v3.l;

/* renamed from: i0.x  reason: case insensitive filesystem */
public final class C0702x extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public final List f10232c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List f10233d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f10234e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10235f = true;

    /* renamed from: i0.x$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10236a = new a();

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            l.e(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            l.e(view, "v");
            l.e(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            l.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0702x(Context context, AttributeSet attributeSet, I i4) {
        super(context, attributeSet);
        String str;
        l.e(context, "context");
        l.e(attributeSet, "attrs");
        l.e(i4, "fm");
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = C0652c.f9593e;
        l.d(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C0652c.f9594f) : classAttribute;
        String string = obtainStyledAttributes.getString(C0652c.f9595g);
        obtainStyledAttributes.recycle();
        int id = getId();
        C0695p h02 = i4.h0(id);
        if (classAttribute != null && h02 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            C0695p a4 = i4.t0().a(context.getClassLoader(), classAttribute);
            l.d(a4, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a4.f10133A = id;
            a4.f10134B = id;
            a4.f10135C = string;
            a4.f10184w = i4;
            a4.f10185x = i4.v0();
            a4.B0(context, attributeSet, (Bundle) null);
            i4.n().o(true).c(this, a4, string).i();
        }
        i4.Y0(this);
    }

    public final void a(View view) {
        if (this.f10233d.contains(view)) {
            this.f10232c.add(view);
        }
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        l.e(view, "child");
        if (I.C0(view) != null) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        O o4;
        l.e(windowInsets, "insets");
        O v4 = O.v(windowInsets);
        l.d(v4, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f10234e;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f10236a;
            l.b(onApplyWindowInsetsListener);
            o4 = O.v(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            o4 = C.T(this, v4);
        }
        l.d(o4, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!o4.o()) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C.f(getChildAt(i4), o4);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        l.e(canvas, "canvas");
        if (this.f10235f) {
            for (View drawChild : this.f10232c) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j4) {
        l.e(canvas, "canvas");
        l.e(view, "child");
        if (!this.f10235f || this.f10232c.isEmpty() || !this.f10232c.contains(view)) {
            return super.drawChild(canvas, view, j4);
        }
        return false;
    }

    public void endViewTransition(View view) {
        l.e(view, "view");
        this.f10233d.remove(view);
        if (this.f10232c.remove(view)) {
            this.f10235f = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends C0695p> F getFragment() {
        return I.k0(this).h0(getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        l.e(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                l.d(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeView(View view) {
        l.e(view, "view");
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i4) {
        View childAt = getChildAt(i4);
        l.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i4);
    }

    public void removeViewInLayout(View view) {
        l.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            l.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i4, i5);
    }

    public void removeViewsInLayout(int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            l.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i4, i5);
    }

    public final void setDrawDisappearingViewsLast(boolean z4) {
        this.f10235f = z4;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        l.e(onApplyWindowInsetsListener, "listener");
        this.f10234e = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        l.e(view, "view");
        if (view.getParent() == this) {
            this.f10233d.add(view);
        }
        super.startViewTransition(view);
    }
}
