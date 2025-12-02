package S;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: S.u  reason: case insensitive filesystem */
public class C0329u {

    /* renamed from: a  reason: collision with root package name */
    public int f2709a;

    /* renamed from: b  reason: collision with root package name */
    public int f2710b;

    public C0329u(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f2709a | this.f2710b;
    }

    public void b(View view, View view2, int i4) {
        c(view, view2, i4, 0);
    }

    public void c(View view, View view2, int i4, int i5) {
        if (i5 == 1) {
            this.f2710b = i4;
        } else {
            this.f2709a = i4;
        }
    }

    public void d(View view, int i4) {
        if (i4 == 1) {
            this.f2710b = 0;
        } else {
            this.f2709a = 0;
        }
    }
}
