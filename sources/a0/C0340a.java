package a0;

import Q0.i;
import S.C;
import S.C0310a;
import T.m;
import T.n;
import T.o;
import a0.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import v.h;

/* renamed from: a0.a  reason: case insensitive filesystem */
public abstract class C0340a extends C0310a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f3890n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final b.a f3891o = new C0076a();

    /* renamed from: p  reason: collision with root package name */
    public static final b.C0077b f3892p = new b();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3893d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f3894e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f3895f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f3896g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f3897h;

    /* renamed from: i  reason: collision with root package name */
    public final View f3898i;

    /* renamed from: j  reason: collision with root package name */
    public c f3899j;

    /* renamed from: k  reason: collision with root package name */
    public int f3900k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f3901l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f3902m = Integer.MIN_VALUE;

    /* renamed from: a0.a$a  reason: collision with other inner class name */
    public class C0076a implements b.a {
        /* renamed from: b */
        public void a(m mVar, Rect rect) {
            mVar.j(rect);
        }
    }

    /* renamed from: a0.a$b */
    public class b implements b.C0077b {
        /* renamed from: c */
        public m a(h hVar, int i4) {
            return (m) hVar.p(i4);
        }

        /* renamed from: d */
        public int b(h hVar) {
            return hVar.o();
        }
    }

    /* renamed from: a0.a$c */
    public class c extends n {
        public c() {
        }

        public m b(int i4) {
            return m.T(C0340a.this.H(i4));
        }

        public m d(int i4) {
            int i5 = i4 == 2 ? C0340a.this.f3900k : C0340a.this.f3901l;
            if (i5 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i5);
        }

        public boolean f(int i4, int i5, Bundle bundle) {
            return C0340a.this.P(i4, i5, bundle);
        }
    }

    public C0340a(View view) {
        if (view != null) {
            this.f3898i = view;
            this.f3897h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C.v(view) == 0) {
                C.q0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public static Rect D(View view, int i4, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i4 == 17) {
            rect.set(width, 0, width, height);
        } else if (i4 == 33) {
            rect.set(0, height, width, height);
        } else if (i4 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i4 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    public static int F(int i4) {
        if (i4 == 19) {
            return 33;
        }
        if (i4 != 21) {
            return i4 != 22 ? 130 : 66;
        }
        return 17;
    }

    public final int A() {
        return this.f3901l;
    }

    public abstract int B(float f4, float f5);

    public abstract void C(List list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f3898i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f3898i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean G(int i4, Rect rect) {
        m mVar;
        h y4 = y();
        int i5 = this.f3901l;
        int i6 = Integer.MIN_VALUE;
        m mVar2 = i5 == Integer.MIN_VALUE ? null : (m) y4.h(i5);
        if (i4 == 1 || i4 == 2) {
            mVar = (m) b.d(y4, f3892p, f3891o, mVar2, i4, C.x(this.f3898i) == 1, false);
        } else if (i4 == 17 || i4 == 33 || i4 == 66 || i4 == 130) {
            Rect rect2 = new Rect();
            int i7 = this.f3901l;
            if (i7 != Integer.MIN_VALUE) {
                z(i7, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f3898i, i4, rect2);
            }
            mVar = (m) b.c(y4, f3892p, f3891o, mVar2, rect2, i4);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (mVar != null) {
            i6 = y4.m(y4.l(mVar));
        }
        return T(i6);
    }

    public m H(int i4) {
        return i4 == -1 ? u() : t(i4);
    }

    public final void I(boolean z4, int i4, Rect rect) {
        int i5 = this.f3901l;
        if (i5 != Integer.MIN_VALUE) {
            o(i5);
        }
        if (z4) {
            G(i4, rect);
        }
    }

    public abstract boolean J(int i4, int i5, Bundle bundle);

    public void K(AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i4, AccessibilityEvent accessibilityEvent) {
    }

    public abstract void M(m mVar);

    public abstract void N(int i4, m mVar);

    public abstract void O(int i4, boolean z4);

    public boolean P(int i4, int i5, Bundle bundle) {
        return i4 != -1 ? Q(i4, i5, bundle) : R(i5, bundle);
    }

    public final boolean Q(int i4, int i5, Bundle bundle) {
        return i5 != 1 ? i5 != 2 ? i5 != 64 ? i5 != 128 ? J(i4, i5, bundle) : n(i4) : S(i4) : o(i4) : T(i4);
    }

    public final boolean R(int i4, Bundle bundle) {
        return C.W(this.f3898i, i4, bundle);
    }

    public final boolean S(int i4) {
        int i5;
        if (!this.f3897h.isEnabled() || !this.f3897h.isTouchExplorationEnabled() || (i5 = this.f3900k) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            n(i5);
        }
        this.f3900k = i4;
        this.f3898i.invalidate();
        U(i4, 32768);
        return true;
    }

    public final boolean T(int i4) {
        int i5;
        if ((!this.f3898i.isFocused() && !this.f3898i.requestFocus()) || (i5 = this.f3901l) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            o(i5);
        }
        if (i4 == Integer.MIN_VALUE) {
            return false;
        }
        this.f3901l = i4;
        O(i4, true);
        U(i4, 8);
        return true;
    }

    public final boolean U(int i4, int i5) {
        ViewParent parent;
        if (i4 == Integer.MIN_VALUE || !this.f3897h.isEnabled() || (parent = this.f3898i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f3898i, q(i4, i5));
    }

    public final void V(int i4) {
        int i5 = this.f3902m;
        if (i5 != i4) {
            this.f3902m = i4;
            U(i4, 128);
            U(i5, 256);
        }
    }

    public n b(View view) {
        if (this.f3899j == null) {
            this.f3899j = new c();
        }
        return this.f3899j;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    public void g(View view, m mVar) {
        super.g(view, mVar);
        M(mVar);
    }

    public final boolean n(int i4) {
        if (this.f3900k != i4) {
            return false;
        }
        this.f3900k = Integer.MIN_VALUE;
        this.f3898i.invalidate();
        U(i4, 65536);
        return true;
    }

    public final boolean o(int i4) {
        if (this.f3901l != i4) {
            return false;
        }
        this.f3901l = Integer.MIN_VALUE;
        O(i4, false);
        U(i4, 8);
        return true;
    }

    public final boolean p() {
        int i4 = this.f3901l;
        return i4 != Integer.MIN_VALUE && J(i4, 16, (Bundle) null);
    }

    public final AccessibilityEvent q(int i4, int i5) {
        return i4 != -1 ? r(i4, i5) : s(i5);
    }

    public final AccessibilityEvent r(int i4, int i5) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i5);
        m H4 = H(i4);
        obtain.getText().add(H4.w());
        obtain.setContentDescription(H4.q());
        obtain.setScrollable(H4.N());
        obtain.setPassword(H4.M());
        obtain.setEnabled(H4.G());
        obtain.setChecked(H4.D());
        L(i4, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H4.n());
            o.c(obtain, this.f3898i, i4);
            obtain.setPackageName(this.f3898i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    public final AccessibilityEvent s(int i4) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        this.f3898i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public final m t(int i4) {
        m S3 = m.S();
        S3.i0(true);
        S3.k0(true);
        S3.c0("android.view.View");
        Rect rect = f3890n;
        S3.Y(rect);
        S3.Z(rect);
        S3.r0(this.f3898i);
        N(i4, S3);
        if (S3.w() == null && S3.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        S3.j(this.f3894e);
        if (!this.f3894e.equals(rect)) {
            int h4 = S3.h();
            if ((h4 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((h4 & 128) == 0) {
                S3.p0(this.f3898i.getContext().getPackageName());
                S3.w0(this.f3898i, i4);
                if (this.f3900k == i4) {
                    S3.X(true);
                    S3.a(128);
                } else {
                    S3.X(false);
                    S3.a(64);
                }
                boolean z4 = this.f3901l == i4;
                if (z4) {
                    S3.a(2);
                } else if (S3.H()) {
                    S3.a(1);
                }
                S3.l0(z4);
                this.f3898i.getLocationOnScreen(this.f3896g);
                S3.k(this.f3893d);
                if (this.f3893d.equals(rect)) {
                    S3.j(this.f3893d);
                    if (S3.f2798b != -1) {
                        m S4 = m.S();
                        for (int i5 = S3.f2798b; i5 != -1; i5 = S4.f2798b) {
                            S4.s0(this.f3898i, -1);
                            S4.Y(f3890n);
                            N(i5, S4);
                            S4.j(this.f3894e);
                            Rect rect2 = this.f3893d;
                            Rect rect3 = this.f3894e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        S4.W();
                    }
                    this.f3893d.offset(this.f3896g[0] - this.f3898i.getScrollX(), this.f3896g[1] - this.f3898i.getScrollY());
                }
                if (this.f3898i.getLocalVisibleRect(this.f3895f)) {
                    this.f3895f.offset(this.f3896g[0] - this.f3898i.getScrollX(), this.f3896g[1] - this.f3898i.getScrollY());
                    if (this.f3893d.intersect(this.f3895f)) {
                        S3.Z(this.f3893d);
                        if (E(this.f3893d)) {
                            S3.A0(true);
                        }
                    }
                }
                return S3;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public final m u() {
        m U3 = m.U(this.f3898i);
        C.U(this.f3898i, U3);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (U3.m() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                U3.c(this.f3898i, ((Integer) arrayList.get(i4)).intValue());
            }
            return U3;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f3897h.isEnabled() || !this.f3897h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B4 = B(motionEvent.getX(), motionEvent.getY());
            V(B4);
            return B4 != Integer.MIN_VALUE;
        } else if (action != 10 || this.f3902m == Integer.MIN_VALUE) {
            return false;
        } else {
            V(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i4 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case i.f2380c:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F4 = F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z4 = false;
                        while (i4 < repeatCount && G(F4, (Rect) null)) {
                            i4++;
                            z4 = true;
                        }
                        return z4;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return G(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return G(1, (Rect) null);
            }
            return false;
        }
    }

    public final int x() {
        return this.f3900k;
    }

    public final h y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h hVar = new h();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            hVar.n(((Integer) arrayList.get(i4)).intValue(), t(((Integer) arrayList.get(i4)).intValue()));
        }
        return hVar;
    }

    public final void z(int i4, Rect rect) {
        H(i4).j(rect);
    }
}
