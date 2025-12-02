package S;

import android.view.View;
import android.view.ViewParent;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f2704a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f2705b;

    /* renamed from: c  reason: collision with root package name */
    public final View f2706c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2707d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f2708e;

    public r(View view) {
        this.f2706c = view;
    }

    public boolean a(float f4, float f5, boolean z4) {
        ViewParent h4;
        if (!l() || (h4 = h(0)) == null) {
            return false;
        }
        return I.a(h4, this.f2706c, f4, f5, z4);
    }

    public boolean b(float f4, float f5) {
        ViewParent h4;
        if (!l() || (h4 = h(0)) == null) {
            return false;
        }
        return I.b(h4, this.f2706c, f4, f5);
    }

    public boolean c(int i4, int i5, int[] iArr, int[] iArr2) {
        return d(i4, i5, iArr, iArr2, 0);
    }

    public boolean d(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        ViewParent h4;
        int i7;
        int i8;
        if (!l() || (h4 = h(i6)) == null) {
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (iArr2 != null) {
                this.f2706c.getLocationInWindow(iArr2);
                i8 = iArr2[0];
                i7 = iArr2[1];
            } else {
                i8 = 0;
                i7 = 0;
            }
            if (iArr == null) {
                iArr = i();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            I.c(h4, this.f2706c, i4, i5, iArr, i6);
            if (iArr2 != null) {
                this.f2706c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i8;
                iArr2[1] = iArr2[1] - i7;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public void e(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        g(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    public boolean f(int i4, int i5, int i6, int i7, int[] iArr) {
        return g(i4, i5, i6, i7, iArr, 0, (int[]) null);
    }

    public final boolean g(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent h4;
        int i9;
        int i10;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!l() || (h4 = h(i8)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f2706c.getLocationInWindow(iArr4);
            i10 = iArr4[0];
            i9 = iArr4[1];
        } else {
            i10 = 0;
            i9 = 0;
        }
        if (iArr2 == null) {
            int[] i11 = i();
            i11[0] = 0;
            i11[1] = 0;
            iArr3 = i11;
        } else {
            iArr3 = iArr2;
        }
        I.d(h4, this.f2706c, i4, i5, i6, i7, i8, iArr3);
        if (iArr4 != null) {
            this.f2706c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i10;
            iArr4[1] = iArr4[1] - i9;
        }
        return true;
    }

    public final ViewParent h(int i4) {
        if (i4 == 0) {
            return this.f2704a;
        }
        if (i4 != 1) {
            return null;
        }
        return this.f2705b;
    }

    public final int[] i() {
        if (this.f2708e == null) {
            this.f2708e = new int[2];
        }
        return this.f2708e;
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i4) {
        return h(i4) != null;
    }

    public boolean l() {
        return this.f2707d;
    }

    public void m(boolean z4) {
        if (this.f2707d) {
            C.y0(this.f2706c);
        }
        this.f2707d = z4;
    }

    public final void n(int i4, ViewParent viewParent) {
        if (i4 == 0) {
            this.f2704a = viewParent;
        } else if (i4 == 1) {
            this.f2705b = viewParent;
        }
    }

    public boolean o(int i4) {
        return p(i4, 0);
    }

    public boolean p(int i4, int i5) {
        if (k(i5)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f2706c;
        for (ViewParent parent = this.f2706c.getParent(); parent != null; parent = parent.getParent()) {
            if (I.f(parent, view, this.f2706c, i4, i5)) {
                n(i5, parent);
                I.e(parent, view, this.f2706c, i4, i5);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i4) {
        ViewParent h4 = h(i4);
        if (h4 != null) {
            I.g(h4, this.f2706c, i4);
            n(i4, (ViewParent) null);
        }
    }
}
