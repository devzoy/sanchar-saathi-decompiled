package com.google.android.material.bottomsheet;

import S.C;
import S.O;
import T.m;
import T.p;
import V1.h;
import V1.i;
import a0.c;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g2.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l2.k;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: R  reason: collision with root package name */
    public static final int f7653R = i.f3122c;

    /* renamed from: A  reason: collision with root package name */
    public a0.c f7654A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f7655B;

    /* renamed from: C  reason: collision with root package name */
    public int f7656C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f7657D;

    /* renamed from: E  reason: collision with root package name */
    public int f7658E;

    /* renamed from: F  reason: collision with root package name */
    public int f7659F;

    /* renamed from: G  reason: collision with root package name */
    public int f7660G;

    /* renamed from: H  reason: collision with root package name */
    public WeakReference f7661H;

    /* renamed from: I  reason: collision with root package name */
    public WeakReference f7662I;

    /* renamed from: J  reason: collision with root package name */
    public final ArrayList f7663J = new ArrayList();

    /* renamed from: K  reason: collision with root package name */
    public VelocityTracker f7664K;

    /* renamed from: L  reason: collision with root package name */
    public int f7665L;

    /* renamed from: M  reason: collision with root package name */
    public int f7666M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f7667N;

    /* renamed from: O  reason: collision with root package name */
    public Map f7668O;

    /* renamed from: P  reason: collision with root package name */
    public int f7669P = -1;

    /* renamed from: Q  reason: collision with root package name */
    public final c.C0078c f7670Q = new d();

    /* renamed from: a  reason: collision with root package name */
    public int f7671a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7672b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7673c = false;

    /* renamed from: d  reason: collision with root package name */
    public float f7674d;

    /* renamed from: e  reason: collision with root package name */
    public int f7675e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7676f;

    /* renamed from: g  reason: collision with root package name */
    public int f7677g;

    /* renamed from: h  reason: collision with root package name */
    public int f7678h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7679i;

    /* renamed from: j  reason: collision with root package name */
    public l2.g f7680j;

    /* renamed from: k  reason: collision with root package name */
    public int f7681k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7682l;

    /* renamed from: m  reason: collision with root package name */
    public k f7683m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7684n;

    /* renamed from: o  reason: collision with root package name */
    public g f7685o = null;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f7686p;

    /* renamed from: q  reason: collision with root package name */
    public int f7687q;

    /* renamed from: r  reason: collision with root package name */
    public int f7688r;

    /* renamed from: s  reason: collision with root package name */
    public int f7689s;

    /* renamed from: t  reason: collision with root package name */
    public float f7690t = 0.5f;

    /* renamed from: u  reason: collision with root package name */
    public int f7691u;

    /* renamed from: v  reason: collision with root package name */
    public float f7692v = -1.0f;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7693w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f7694x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f7695y = true;

    /* renamed from: z  reason: collision with root package name */
    public int f7696z = 4;

    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ View f7697e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7698f;

        public a(View view, int i4) {
            this.f7697e = view;
            this.f7698f = i4;
        }

        public void run() {
            BottomSheetBehavior.this.o0(this.f7697e, this.f7698f);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f7680j != null) {
                BottomSheetBehavior.this.f7680j.V(floatValue);
            }
        }
    }

    public class c implements j.c {
        public c() {
        }

        public O a(View view, O o4, j.d dVar) {
            int unused = BottomSheetBehavior.this.f7681k = o4.g().f1594d;
            BottomSheetBehavior.this.v0(false);
            return o4;
        }
    }

    public class d extends c.C0078c {
        public d() {
        }

        public int a(View view, int i4, int i5) {
            return view.getLeft();
        }

        public int b(View view, int i4, int i5) {
            int V3 = BottomSheetBehavior.this.V();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return M.a.b(i4, V3, bottomSheetBehavior.f7693w ? bottomSheetBehavior.f7660G : bottomSheetBehavior.f7691u);
        }

        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f7693w ? bottomSheetBehavior.f7660G : bottomSheetBehavior.f7691u;
        }

        public void j(int i4) {
            if (i4 == 1 && BottomSheetBehavior.this.f7695y) {
                BottomSheetBehavior.this.m0(1);
            }
        }

        public void k(View view, int i4, int i5, int i6, int i7) {
            BottomSheetBehavior.this.T(i5);
        }

        public void l(View view, float f4, float f5) {
            int i4;
            int i5;
            int i6 = 6;
            if (f5 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.f7693w || !bottomSheetBehavior.q0(view, f5)) {
                    if (f5 == 0.0f || Math.abs(f4) > Math.abs(f5)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.f7672b) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i7 = bottomSheetBehavior2.f7689s;
                            if (top < i7) {
                                if (top < Math.abs(top - bottomSheetBehavior2.f7691u)) {
                                    i4 = BottomSheetBehavior.this.f7687q;
                                } else {
                                    i4 = BottomSheetBehavior.this.f7689s;
                                }
                            } else if (Math.abs(top - i7) < Math.abs(top - BottomSheetBehavior.this.f7691u)) {
                                i4 = BottomSheetBehavior.this.f7689s;
                            } else {
                                i5 = BottomSheetBehavior.this.f7691u;
                            }
                            BottomSheetBehavior.this.r0(view, i6, i4, true);
                        } else if (Math.abs(top - BottomSheetBehavior.this.f7688r) < Math.abs(top - BottomSheetBehavior.this.f7691u)) {
                            i4 = BottomSheetBehavior.this.f7688r;
                        } else {
                            i5 = BottomSheetBehavior.this.f7691u;
                        }
                    } else if (BottomSheetBehavior.this.f7672b) {
                        i5 = BottomSheetBehavior.this.f7691u;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.f7689s) < Math.abs(top2 - BottomSheetBehavior.this.f7691u)) {
                            i4 = BottomSheetBehavior.this.f7689s;
                            BottomSheetBehavior.this.r0(view, i6, i4, true);
                        }
                        i5 = BottomSheetBehavior.this.f7691u;
                    }
                    i6 = 4;
                    BottomSheetBehavior.this.r0(view, i6, i4, true);
                } else if ((Math.abs(f4) < Math.abs(f5) && f5 > 500.0f) || n(view)) {
                    i4 = BottomSheetBehavior.this.f7660G;
                    i6 = 5;
                    BottomSheetBehavior.this.r0(view, i6, i4, true);
                } else if (BottomSheetBehavior.this.f7672b) {
                    i4 = BottomSheetBehavior.this.f7688r;
                } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.f7687q) < Math.abs(view.getTop() - BottomSheetBehavior.this.f7689s)) {
                    i4 = BottomSheetBehavior.this.f7687q;
                } else {
                    i4 = BottomSheetBehavior.this.f7689s;
                    BottomSheetBehavior.this.r0(view, i6, i4, true);
                }
            } else if (BottomSheetBehavior.this.f7672b) {
                i4 = BottomSheetBehavior.this.f7688r;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                int i8 = bottomSheetBehavior3.f7689s;
                if (top3 > i8) {
                    i4 = i8;
                    BottomSheetBehavior.this.r0(view, i6, i4, true);
                }
                i4 = bottomSheetBehavior3.f7687q;
            }
            i6 = 3;
            BottomSheetBehavior.this.r0(view, i6, i4, true);
        }

        public boolean m(View view, int i4) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i5 = bottomSheetBehavior.f7696z;
            if (i5 == 1 || bottomSheetBehavior.f7667N) {
                return false;
            }
            if (i5 == 3 && bottomSheetBehavior.f7665L == i4) {
                WeakReference weakReference = bottomSheetBehavior.f7662I;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference weakReference2 = BottomSheetBehavior.this.f7661H;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f7660G + bottomSheetBehavior.V()) / 2;
        }
    }

    public class e implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7703a;

        public e(int i4) {
            this.f7703a = i4;
        }

        public boolean a(View view, p.a aVar) {
            BottomSheetBehavior.this.l0(this.f7703a);
            return true;
        }
    }

    public class g implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final View f7710e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f7711f;

        /* renamed from: g  reason: collision with root package name */
        public int f7712g;

        public g(View view, int i4) {
            this.f7710e = view;
            this.f7712g = i4;
        }

        public void run() {
            a0.c cVar = BottomSheetBehavior.this.f7654A;
            if (cVar == null || !cVar.k(true)) {
                BottomSheetBehavior.this.m0(this.f7712g);
            } else {
                C.Y(this.f7710e, this);
            }
            this.f7711f = false;
        }
    }

    public BottomSheetBehavior() {
    }

    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
        this.f7656C = 0;
        this.f7657D = false;
        return (i4 & 2) != 0;
    }

    public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
        int i5;
        int i6;
        int i7 = 3;
        if (view.getTop() == V()) {
            m0(3);
            return;
        }
        WeakReference weakReference = this.f7662I;
        if (weakReference != null && view2 == weakReference.get() && this.f7657D) {
            if (this.f7656C > 0) {
                if (this.f7672b) {
                    i5 = this.f7688r;
                } else {
                    int top = view.getTop();
                    int i8 = this.f7689s;
                    if (top > i8) {
                        i7 = 6;
                        i5 = i8;
                    } else {
                        i5 = this.f7687q;
                    }
                }
            } else if (!this.f7693w || !q0(view, W())) {
                if (this.f7656C == 0) {
                    int top2 = view.getTop();
                    if (!this.f7672b) {
                        int i9 = this.f7689s;
                        if (top2 < i9) {
                            if (top2 < Math.abs(top2 - this.f7691u)) {
                                i5 = this.f7687q;
                            } else {
                                i5 = this.f7689s;
                            }
                        } else if (Math.abs(top2 - i9) < Math.abs(top2 - this.f7691u)) {
                            i5 = this.f7689s;
                        } else {
                            i6 = this.f7691u;
                        }
                        i7 = 6;
                    } else if (Math.abs(top2 - this.f7688r) < Math.abs(top2 - this.f7691u)) {
                        i5 = this.f7688r;
                    } else {
                        i6 = this.f7691u;
                    }
                } else if (this.f7672b) {
                    i6 = this.f7691u;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - this.f7689s) < Math.abs(top3 - this.f7691u)) {
                        i5 = this.f7689s;
                        i7 = 6;
                    } else {
                        i6 = this.f7691u;
                    }
                }
                i7 = 4;
            } else {
                i5 = this.f7660G;
                i7 = 5;
            }
            r0(view, i7, i5, false);
            this.f7657D = false;
        }
    }

    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7696z == 1 && actionMasked == 0) {
            return true;
        }
        a0.c cVar = this.f7654A;
        if (cVar != null) {
            cVar.z(motionEvent);
        }
        if (actionMasked == 0) {
            Z();
        }
        if (this.f7664K == null) {
            this.f7664K = VelocityTracker.obtain();
        }
        this.f7664K.addMovement(motionEvent);
        if (this.f7654A != null && actionMasked == 2 && !this.f7655B && Math.abs(((float) this.f7666M) - motionEvent.getY()) > ((float) this.f7654A.u())) {
            this.f7654A.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f7655B;
    }

    public final int L(View view, int i4, int i5) {
        return C.b(view, view.getResources().getString(i4), P(i5));
    }

    public final void M() {
        int O4 = O();
        if (this.f7672b) {
            this.f7691u = Math.max(this.f7660G - O4, this.f7688r);
        } else {
            this.f7691u = this.f7660G - O4;
        }
    }

    public final void N() {
        this.f7689s = (int) (((float) this.f7660G) * (1.0f - this.f7690t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = r3.f7681k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int O() {
        /*
            r3 = this;
            boolean r0 = r3.f7676f
            if (r0 == 0) goto L_0x001a
            int r0 = r3.f7677g
            int r1 = r3.f7660G
            int r2 = r3.f7659F
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.f7658E
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L_0x001a:
            boolean r0 = r3.f7682l
            if (r0 != 0) goto L_0x002c
            int r0 = r3.f7681k
            if (r0 <= 0) goto L_0x002c
            int r1 = r3.f7675e
            int r2 = r3.f7678h
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x002c:
            int r0 = r3.f7675e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.O():int");
    }

    public final p P(int i4) {
        return new e(i4);
    }

    public final void Q(Context context, AttributeSet attributeSet, boolean z4) {
        R(context, attributeSet, z4, (ColorStateList) null);
    }

    public final void R(Context context, AttributeSet attributeSet, boolean z4, ColorStateList colorStateList) {
        if (this.f7679i) {
            this.f7683m = k.e(context, attributeSet, V1.a.f2967b, f7653R).m();
            l2.g gVar = new l2.g(this.f7683m);
            this.f7680j = gVar;
            gVar.K(context);
            if (!z4 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f7680j.setTint(typedValue.data);
                return;
            }
            this.f7680j.U(colorStateList);
        }
    }

    public final void S() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f7686p = ofFloat;
        ofFloat.setDuration(500);
        this.f7686p.addUpdateListener(new b());
    }

    public void T(int i4) {
        if (((View) this.f7661H.get()) != null && !this.f7663J.isEmpty()) {
            int i5 = this.f7691u;
            if (i4 <= i5 && i5 != V()) {
                V();
            }
            if (this.f7663J.size() > 0) {
                android.support.v4.media.session.b.a(this.f7663J.get(0));
                throw null;
            }
        }
    }

    public View U(View view) {
        if (C.N(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View U3 = U(viewGroup.getChildAt(i4));
            if (U3 != null) {
                return U3;
            }
        }
        return null;
    }

    public int V() {
        return this.f7672b ? this.f7688r : this.f7687q;
    }

    public final float W() {
        VelocityTracker velocityTracker = this.f7664K;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f7674d);
        return this.f7664K.getYVelocity(this.f7665L);
    }

    public boolean X() {
        return this.f7682l;
    }

    public final void Y(View view, m.a aVar, int i4) {
        C.c0(view, aVar, (CharSequence) null, P(i4));
    }

    public final void Z() {
        this.f7665L = -1;
        VelocityTracker velocityTracker = this.f7664K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7664K = null;
        }
    }

    public final void a0(f fVar) {
        int i4 = this.f7671a;
        if (i4 != 0) {
            if (i4 == -1 || (i4 & 1) == 1) {
                this.f7675e = fVar.f7706h;
            }
            if (i4 == -1 || (i4 & 2) == 2) {
                this.f7672b = fVar.f7707i;
            }
            if (i4 == -1 || (i4 & 4) == 4) {
                this.f7693w = fVar.f7708j;
            }
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f7694x = fVar.f7709k;
            }
        }
    }

    public void b0(boolean z4) {
        this.f7695y = z4;
    }

    public void c0(int i4) {
        if (i4 >= 0) {
            this.f7687q = i4;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void d0(boolean z4) {
        if (this.f7672b != z4) {
            this.f7672b = z4;
            if (this.f7661H != null) {
                M();
            }
            m0((!this.f7672b || this.f7696z != 6) ? this.f7696z : 3);
            s0();
        }
    }

    public void e0(boolean z4) {
        this.f7682l = z4;
    }

    public void f0(float f4) {
        if (f4 <= 0.0f || f4 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f7690t = f4;
        if (this.f7661H != null) {
            N();
        }
    }

    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.f7661H = null;
        this.f7654A = null;
    }

    public void g0(boolean z4) {
        if (this.f7693w != z4) {
            this.f7693w = z4;
            if (!z4 && this.f7696z == 5) {
                l0(4);
            }
            s0();
        }
    }

    public void h0(int i4) {
        i0(i4, false);
    }

    public final void i0(int i4, boolean z4) {
        if (i4 == -1) {
            if (!this.f7676f) {
                this.f7676f = true;
            } else {
                return;
            }
        } else if (this.f7676f || this.f7675e != i4) {
            this.f7676f = false;
            this.f7675e = Math.max(0, i4);
        } else {
            return;
        }
        v0(z4);
    }

    public void j() {
        super.j();
        this.f7661H = null;
        this.f7654A = null;
    }

    public void j0(int i4) {
        this.f7671a = i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r9.f7695y
            if (r0 != 0) goto L_0x000e
            goto L_0x00d2
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.Z()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.f7664K
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f7664K = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.f7664K
            r3.addMovement(r12)
            r3 = 0
            r4 = 2
            r5 = -1
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.f7667N = r1
            r9.f7665L = r5
            boolean r11 = r9.f7655B
            if (r11 == 0) goto L_0x007f
            r9.f7655B = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f7666M = r7
            int r7 = r9.f7696z
            if (r7 == r4) goto L_0x006e
            java.lang.ref.WeakReference r7 = r9.f7662I
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.f7666M
            boolean r7 = r10.z(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f7665L = r7
            r9.f7667N = r2
        L_0x006e:
            int r7 = r9.f7665L
            if (r7 != r5) goto L_0x007c
            int r5 = r9.f7666M
            boolean r11 = r10.z(r11, r6, r5)
            if (r11 != 0) goto L_0x007c
            r11 = r2
            goto L_0x007d
        L_0x007c:
            r11 = r1
        L_0x007d:
            r9.f7655B = r11
        L_0x007f:
            boolean r11 = r9.f7655B
            if (r11 != 0) goto L_0x008e
            a0.c r11 = r9.f7654A
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.G(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference r11 = r9.f7662I
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r4) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r11 = r9.f7655B
            if (r11 != 0) goto L_0x00d1
            int r11 = r9.f7696z
            if (r11 == r2) goto L_0x00d1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.z(r3, r11, r0)
            if (r10 != 0) goto L_0x00d1
            a0.c r10 = r9.f7654A
            if (r10 == 0) goto L_0x00d1
            int r10 = r9.f7666M
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            a0.c r11 = r9.f7654A
            int r11 = r11.u()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d1
            r1 = r2
        L_0x00d1:
            return r1
        L_0x00d2:
            r9.f7655B = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public void k0(boolean z4) {
        this.f7694x = z4;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        l2.g gVar;
        if (C.u(coordinatorLayout) && !C.u(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f7661H == null) {
            this.f7677g = coordinatorLayout.getResources().getDimensionPixelSize(V1.c.f3011a);
            n0(view);
            this.f7661H = new WeakReference(view);
            if (this.f7679i && (gVar = this.f7680j) != null) {
                C.j0(view, gVar);
            }
            l2.g gVar2 = this.f7680j;
            if (gVar2 != null) {
                float f4 = this.f7692v;
                if (f4 == -1.0f) {
                    f4 = C.t(view);
                }
                gVar2.T(f4);
                boolean z4 = this.f7696z == 3;
                this.f7684n = z4;
                this.f7680j.V(z4 ? 0.0f : 1.0f);
            }
            s0();
            if (C.v(view) == 0) {
                C.q0(view, 1);
            }
        }
        if (this.f7654A == null) {
            this.f7654A = a0.c.m(coordinatorLayout, this.f7670Q);
        }
        int top = view.getTop();
        coordinatorLayout.G(view, i4);
        this.f7659F = coordinatorLayout.getWidth();
        this.f7660G = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f7658E = height;
        this.f7688r = Math.max(0, this.f7660G - height);
        N();
        M();
        int i5 = this.f7696z;
        if (i5 == 3) {
            C.S(view, V());
        } else if (i5 == 6) {
            C.S(view, this.f7689s);
        } else if (this.f7693w && i5 == 5) {
            C.S(view, this.f7660G);
        } else if (i5 == 4) {
            C.S(view, this.f7691u);
        } else if (i5 == 1 || i5 == 2) {
            C.S(view, top - view.getTop());
        }
        this.f7662I = new WeakReference(U(view));
        return true;
    }

    public void l0(int i4) {
        if (i4 != this.f7696z) {
            if (this.f7661H != null) {
                p0(i4);
            } else if (i4 == 4 || i4 == 3 || i4 == 6 || (this.f7693w && i4 == 5)) {
                this.f7696z = i4;
            }
        }
    }

    public void m0(int i4) {
        if (this.f7696z != i4) {
            this.f7696z = i4;
            WeakReference weakReference = this.f7661H;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i4 == 3) {
                    u0(true);
                } else if (i4 == 6 || i4 == 5 || i4 == 4) {
                    u0(false);
                }
                t0(i4);
                if (this.f7663J.size() <= 0) {
                    s0();
                } else {
                    android.support.v4.media.session.b.a(this.f7663J.get(0));
                    throw null;
                }
            }
        }
    }

    public final void n0(View view) {
        if (Build.VERSION.SDK_INT >= 29 && !X() && !this.f7676f) {
            j.a(view, new c());
        }
    }

    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f4, float f5) {
        WeakReference weakReference = this.f7662I;
        if (weakReference == null || view2 != weakReference.get()) {
            return false;
        }
        return this.f7696z != 3 || super.o(coordinatorLayout, view, view2, f4, f5);
    }

    public void o0(View view, int i4) {
        int i5;
        int i6;
        if (i4 == 4) {
            i5 = this.f7691u;
        } else if (i4 == 6) {
            i5 = this.f7689s;
            if (this.f7672b && i5 <= (i6 = this.f7688r)) {
                i4 = 3;
                i5 = i6;
            }
        } else if (i4 == 3) {
            i5 = V();
        } else if (!this.f7693w || i4 != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i4);
        } else {
            i5 = this.f7660G;
        }
        r0(view, i4, i5, false);
    }

    public final void p0(int i4) {
        View view = (View) this.f7661H.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C.L(view)) {
                o0(view, i4);
            } else {
                view.post(new a(view, i4));
            }
        }
    }

    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i6) {
        if (i6 != 1) {
            WeakReference weakReference = this.f7662I;
            if (view2 == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = view.getTop();
                int i7 = top - i5;
                if (i5 > 0) {
                    if (i7 < V()) {
                        int V3 = top - V();
                        iArr[1] = V3;
                        C.S(view, -V3);
                        m0(3);
                    } else if (this.f7695y) {
                        iArr[1] = i5;
                        C.S(view, -i5);
                        m0(1);
                    } else {
                        return;
                    }
                } else if (i5 < 0 && !view2.canScrollVertically(-1)) {
                    int i8 = this.f7691u;
                    if (i7 > i8 && !this.f7693w) {
                        int i9 = top - i8;
                        iArr[1] = i9;
                        C.S(view, -i9);
                        m0(4);
                    } else if (this.f7695y) {
                        iArr[1] = i5;
                        C.S(view, -i5);
                        m0(1);
                    } else {
                        return;
                    }
                }
                T(view.getTop());
                this.f7656C = i5;
                this.f7657D = true;
            }
        }
    }

    public boolean q0(View view, float f4) {
        if (this.f7694x) {
            return true;
        }
        if (view.getTop() < this.f7691u) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f4 * 0.1f)) - ((float) this.f7691u)) / ((float) O()) > 0.5f;
    }

    public void r0(View view, int i4, int i5, boolean z4) {
        a0.c cVar = this.f7654A;
        if (cVar == null || (!z4 ? !cVar.H(view, view.getLeft(), i5) : !cVar.F(view.getLeft(), i5))) {
            m0(i4);
            return;
        }
        m0(2);
        t0(i4);
        if (this.f7685o == null) {
            this.f7685o = new g(view, i4);
        }
        if (!this.f7685o.f7711f) {
            g gVar = this.f7685o;
            gVar.f7712g = i4;
            C.Y(view, gVar);
            boolean unused = this.f7685o.f7711f = true;
            return;
        }
        this.f7685o.f7712g = i4;
    }

    public final void s0() {
        View view;
        WeakReference weakReference = this.f7661H;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C.a0(view, 524288);
            C.a0(view, 262144);
            C.a0(view, 1048576);
            int i4 = this.f7669P;
            if (i4 != -1) {
                C.a0(view, i4);
            }
            int i5 = 6;
            if (this.f7696z != 6) {
                this.f7669P = L(view, h.f3104a, 6);
            }
            if (this.f7693w && this.f7696z != 5) {
                Y(view, m.a.f2842y, 5);
            }
            int i6 = this.f7696z;
            if (i6 == 3) {
                if (this.f7672b) {
                    i5 = 4;
                }
                Y(view, m.a.f2841x, i5);
            } else if (i6 == 4) {
                if (this.f7672b) {
                    i5 = 3;
                }
                Y(view, m.a.f2840w, i5);
            } else if (i6 == 6) {
                Y(view, m.a.f2841x, 4);
                Y(view, m.a.f2840w, 3);
            }
        }
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
    }

    public final void t0(int i4) {
        ValueAnimator valueAnimator;
        if (i4 != 2) {
            boolean z4 = i4 == 3;
            if (this.f7684n != z4) {
                this.f7684n = z4;
                if (this.f7680j != null && (valueAnimator = this.f7686p) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f7686p.reverse();
                        return;
                    }
                    float f4 = z4 ? 0.0f : 1.0f;
                    this.f7686p.setFloatValues(new float[]{1.0f - f4, f4});
                    this.f7686p.start();
                }
            }
        }
    }

    public final void u0(boolean z4) {
        Map map;
        WeakReference weakReference = this.f7661H;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z4) {
                    if (this.f7668O == null) {
                        this.f7668O = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = coordinatorLayout.getChildAt(i4);
                    if (childAt != this.f7661H.get()) {
                        if (z4) {
                            this.f7668O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f7673c) {
                                C.q0(childAt, 4);
                            }
                        } else if (this.f7673c && (map = this.f7668O) != null && map.containsKey(childAt)) {
                            C.q0(childAt, ((Integer) this.f7668O.get(childAt)).intValue());
                        }
                    }
                }
                if (!z4) {
                    this.f7668O = null;
                } else if (this.f7673c) {
                    ((View) this.f7661H.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void v0(boolean z4) {
        View view;
        if (this.f7661H != null) {
            M();
            if (this.f7696z == 4 && (view = (View) this.f7661H.get()) != null) {
                if (z4) {
                    p0(this.f7696z);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, view, fVar.a());
        a0(fVar);
        int i4 = fVar.f7705g;
        if (i4 == 1 || i4 == 2) {
            this.f7696z = 4;
        } else {
            this.f7696z = i4;
        }
    }

    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new f(super.y(coordinatorLayout, view), this);
    }

    public static class f extends Z.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public final int f7705g;

        /* renamed from: h  reason: collision with root package name */
        public int f7706h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f7707i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f7708j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f7709k;

        public static class a implements Parcelable.ClassLoaderCreator {
            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            /* renamed from: c */
            public f[] newArray(int i4) {
                return new f[i4];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7705g = parcel.readInt();
            this.f7706h = parcel.readInt();
            boolean z4 = false;
            this.f7707i = parcel.readInt() == 1;
            this.f7708j = parcel.readInt() == 1;
            this.f7709k = parcel.readInt() == 1 ? true : z4;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f7705g);
            parcel.writeInt(this.f7706h);
            parcel.writeInt(this.f7707i ? 1 : 0);
            parcel.writeInt(this.f7708j ? 1 : 0);
            parcel.writeInt(this.f7709k ? 1 : 0);
        }

        public f(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f7705g = bottomSheetBehavior.f7696z;
            this.f7706h = bottomSheetBehavior.f7675e;
            this.f7707i = bottomSheetBehavior.f7672b;
            this.f7708j = bottomSheetBehavior.f7693w;
            this.f7709k = bottomSheetBehavior.f7694x;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i4;
        this.f7678h = context.getResources().getDimensionPixelSize(V1.c.f3004G);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V1.j.f3366w);
        this.f7679i = obtainStyledAttributes.hasValue(V1.j.f3175I);
        boolean hasValue = obtainStyledAttributes.hasValue(V1.j.f3376y);
        if (hasValue) {
            R(context, attributeSet, hasValue, i2.c.a(context, obtainStyledAttributes, V1.j.f3376y));
        } else {
            Q(context, attributeSet, hasValue);
        }
        S();
        this.f7692v = obtainStyledAttributes.getDimension(V1.j.f3371x, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(V1.j.f3155E);
        if (peekValue == null || (i4 = peekValue.data) != -1) {
            h0(obtainStyledAttributes.getDimensionPixelSize(V1.j.f3155E, -1));
        } else {
            h0(i4);
        }
        g0(obtainStyledAttributes.getBoolean(V1.j.f3150D, false));
        e0(obtainStyledAttributes.getBoolean(V1.j.f3170H, false));
        d0(obtainStyledAttributes.getBoolean(V1.j.f3140B, true));
        k0(obtainStyledAttributes.getBoolean(V1.j.f3165G, false));
        b0(obtainStyledAttributes.getBoolean(V1.j.f3381z, true));
        j0(obtainStyledAttributes.getInt(V1.j.f3160F, 0));
        f0(obtainStyledAttributes.getFloat(V1.j.f3145C, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(V1.j.f3135A);
        if (peekValue2 == null || peekValue2.type != 16) {
            c0(obtainStyledAttributes.getDimensionPixelOffset(V1.j.f3135A, 0));
        } else {
            c0(peekValue2.data);
        }
        obtainStyledAttributes.recycle();
        this.f7674d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
