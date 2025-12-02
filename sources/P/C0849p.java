package p;

import X.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import h.j;

/* renamed from: p.p  reason: case insensitive filesystem */
public class C0849p extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f11574b = false;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11575a;

    public C0849p(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        a(context, attributeSet, i4, i5);
    }

    public final void a(Context context, AttributeSet attributeSet, int i4, int i5) {
        f0 v4 = f0.v(context, attributeSet, j.f9458b2, i4, i5);
        if (v4.s(j.f9468d2)) {
            b(v4.a(j.f9468d2, false));
        }
        setBackgroundDrawable(v4.g(j.f9463c2));
        v4.w();
    }

    public final void b(boolean z4) {
        if (f11574b) {
            this.f11575a = z4;
        } else {
            g.a(this, z4);
        }
    }

    public void showAsDropDown(View view, int i4, int i5) {
        if (f11574b && this.f11575a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5);
    }

    public void update(View view, int i4, int i5, int i6, int i7) {
        if (f11574b && this.f11575a) {
            i5 -= view.getHeight();
        }
        super.update(view, i4, i5, i6, i7);
    }

    public void showAsDropDown(View view, int i4, int i5, int i6) {
        if (f11574b && this.f11575a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5, i6);
    }
}
