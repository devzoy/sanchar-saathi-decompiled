package X1;

import M.a;
import S.C;
import S.C0317h;
import S.O;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

public abstract class b extends c {

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3472d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f3473e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public int f3474f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f3475g;

    public b() {
    }

    public static int L(int i4) {
        if (i4 == 0) {
            return 8388659;
        }
        return i4;
    }

    public void F(CoordinatorLayout coordinatorLayout, View view, int i4) {
        View G4 = G(coordinatorLayout.q(view));
        if (G4 != null) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
            Rect rect = this.f3472d;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, G4.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + G4.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            O lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C.u(coordinatorLayout) && !C.u(view)) {
                rect.left += lastWindowInsets.j();
                rect.right -= lastWindowInsets.k();
            }
            Rect rect2 = this.f3473e;
            C0317h.a(L(eVar.f4946c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i4);
            int H4 = H(G4);
            view.layout(rect2.left, rect2.top - H4, rect2.right, rect2.bottom - H4);
            this.f3474f = rect2.top - G4.getBottom();
            return;
        }
        super.F(coordinatorLayout, view, i4);
        this.f3474f = 0;
    }

    public abstract View G(List list);

    public final int H(View view) {
        if (this.f3475g == 0) {
            return 0;
        }
        float I4 = I(view);
        int i4 = this.f3475g;
        return a.b((int) (I4 * ((float) i4)), 0, i4);
    }

    public abstract float I(View view);

    public int J(View view) {
        return view.getMeasuredHeight();
    }

    public final int K() {
        return this.f3474f;
    }

    public final void M(int i4) {
        this.f3475g = i4;
    }

    public boolean N() {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
        View G4;
        O lastWindowInsets;
        int i8 = view.getLayoutParams().height;
        if ((i8 != -1 && i8 != -2) || (G4 = G(coordinatorLayout.q(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i6);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C.u(G4) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int J4 = size + J(G4);
        int measuredHeight = G4.getMeasuredHeight();
        if (N()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            J4 -= measuredHeight;
        }
        coordinatorLayout.H(view, i4, i5, View.MeasureSpec.makeMeasureSpec(J4, i8 == -1 ? 1073741824 : Integer.MIN_VALUE), i7);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
