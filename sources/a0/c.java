package a0;

import S.C;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public class c {

    /* renamed from: x  reason: collision with root package name */
    public static final Interpolator f3908x = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f3909a;

    /* renamed from: b  reason: collision with root package name */
    public int f3910b;

    /* renamed from: c  reason: collision with root package name */
    public int f3911c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f3912d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f3913e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f3914f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f3915g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f3916h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f3917i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f3918j;

    /* renamed from: k  reason: collision with root package name */
    public int f3919k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f3920l;

    /* renamed from: m  reason: collision with root package name */
    public float f3921m;

    /* renamed from: n  reason: collision with root package name */
    public float f3922n;

    /* renamed from: o  reason: collision with root package name */
    public int f3923o;

    /* renamed from: p  reason: collision with root package name */
    public final int f3924p;

    /* renamed from: q  reason: collision with root package name */
    public int f3925q;

    /* renamed from: r  reason: collision with root package name */
    public OverScroller f3926r;

    /* renamed from: s  reason: collision with root package name */
    public final C0078c f3927s;

    /* renamed from: t  reason: collision with root package name */
    public View f3928t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3929u;

    /* renamed from: v  reason: collision with root package name */
    public final ViewGroup f3930v;

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f3931w = new b();

    public class a implements Interpolator {
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            c.this.E(0);
        }
    }

    /* renamed from: a0.c$c  reason: collision with other inner class name */
    public static abstract class C0078c {
        public abstract int a(View view, int i4, int i5);

        public abstract int b(View view, int i4, int i5);

        public int c(int i4) {
            return i4;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i4, int i5) {
        }

        public boolean g(int i4) {
            return false;
        }

        public void h(int i4, int i5) {
        }

        public void i(View view, int i4) {
        }

        public abstract void j(int i4);

        public abstract void k(View view, int i4, int i5, int i6, int i7);

        public abstract void l(View view, float f4, float f5);

        public abstract boolean m(View view, int i4);
    }

    public c(Context context, ViewGroup viewGroup, C0078c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f3930v = viewGroup;
            this.f3927s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i4 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f3924p = i4;
            this.f3923o = i4;
            this.f3910b = viewConfiguration.getScaledTouchSlop();
            this.f3921m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3922n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3926r = new OverScroller(context, f3908x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public static c l(ViewGroup viewGroup, float f4, C0078c cVar) {
        c m4 = m(viewGroup, cVar);
        m4.f3910b = (int) (((float) m4.f3910b) * (1.0f / f4));
        return m4;
    }

    public static c m(ViewGroup viewGroup, C0078c cVar) {
        return new c(viewGroup.getContext(), viewGroup, cVar);
    }

    public final void A() {
        this.f3920l.computeCurrentVelocity(1000, this.f3921m);
        n(e(this.f3920l.getXVelocity(this.f3911c), this.f3922n, this.f3921m), e(this.f3920l.getYVelocity(this.f3911c), this.f3922n, this.f3921m));
    }

    public final void B(float f4, float f5, int i4) {
        boolean c4 = c(f4, f5, i4, 1);
        if (c(f5, f4, i4, 4)) {
            c4 |= true;
        }
        if (c(f4, f5, i4, 2)) {
            c4 |= true;
        }
        if (c(f5, f4, i4, 8)) {
            c4 |= true;
        }
        if (c4) {
            int[] iArr = this.f3917i;
            iArr[i4] = iArr[i4] | c4;
            this.f3927s.f(c4 ? 1 : 0, i4);
        }
    }

    public final void C(float f4, float f5, int i4) {
        q(i4);
        float[] fArr = this.f3912d;
        this.f3914f[i4] = f4;
        fArr[i4] = f4;
        float[] fArr2 = this.f3913e;
        this.f3915g[i4] = f5;
        fArr2[i4] = f5;
        this.f3916h[i4] = t((int) f4, (int) f5);
        this.f3919k |= 1 << i4;
    }

    public final void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            int pointerId = motionEvent.getPointerId(i4);
            if (x(pointerId)) {
                float x4 = motionEvent.getX(i4);
                float y4 = motionEvent.getY(i4);
                this.f3914f[pointerId] = x4;
                this.f3915g[pointerId] = y4;
            }
        }
    }

    public void E(int i4) {
        this.f3930v.removeCallbacks(this.f3931w);
        if (this.f3909a != i4) {
            this.f3909a = i4;
            this.f3927s.j(i4);
            if (this.f3909a == 0) {
                this.f3928t = null;
            }
        }
    }

    public boolean F(int i4, int i5) {
        if (this.f3929u) {
            return s(i4, i5, (int) this.f3920l.getXVelocity(this.f3911c), (int) this.f3920l.getYVelocity(this.f3911c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean G(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f3920l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f3920l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f3920l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.h(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.C(r7, r1, r2)
            int r3 = r0.f3909a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f3916h
            r1 = r1[r2]
            int r3 = r0.f3925q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            a0.c$c r4 = r0.f3927s
            r1 = r1 & r3
            r4.h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.r(r3, r1)
            android.view.View r3 = r0.f3928t
            if (r1 != r3) goto L_0x0031
            r0.I(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f3912d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f3913e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.x(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f3912d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f3913e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.r(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = r6
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            a0.c$c r14 = r0.f3927s
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            a0.c$c r5 = r0.f3927s
            int r5 = r5.b(r7, r15, r14)
            a0.c$c r14 = r0.f3927s
            int r14 = r14.d(r7)
            a0.c$c r15 = r0.f3927s
            int r15 = r15.e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.B(r9, r10, r4)
            int r5 = r0.f3909a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.I(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.D(r17)
            goto L_0x0031
        L_0x00ff:
            r16.a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.C(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.r(r2, r3)
            android.view.View r3 = r0.f3928t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f3909a
            if (r3 != r4) goto L_0x0125
            r0.I(r2, r1)
        L_0x0125:
            int[] r2 = r0.f3916h
            r2 = r2[r1]
            int r3 = r0.f3925q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            a0.c$c r4 = r0.f3927s
            r2 = r2 & r3
            r4.h(r2, r1)
        L_0x0135:
            int r1 = r0.f3909a
            if (r1 != r6) goto L_0x013a
            r5 = r6
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i4, int i5) {
        this.f3928t = view;
        this.f3911c = -1;
        boolean s4 = s(i4, i5, 0, 0);
        if (!s4 && this.f3909a == 0 && this.f3928t != null) {
            this.f3928t = null;
        }
        return s4;
    }

    public boolean I(View view, int i4) {
        if (view == this.f3928t && this.f3911c == i4) {
            return true;
        }
        if (view == null || !this.f3927s.m(view, i4)) {
            return false;
        }
        this.f3911c = i4;
        b(view, i4);
        return true;
    }

    public void a() {
        this.f3911c = -1;
        g();
        VelocityTracker velocityTracker = this.f3920l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3920l = null;
        }
    }

    public void b(View view, int i4) {
        if (view.getParent() == this.f3930v) {
            this.f3928t = view;
            this.f3911c = i4;
            this.f3927s.i(view, i4);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f3930v + ")");
    }

    public final boolean c(float f4, float f5, int i4, int i5) {
        float abs = Math.abs(f4);
        float abs2 = Math.abs(f5);
        if ((this.f3916h[i4] & i5) != i5 || (this.f3925q & i5) == 0 || (this.f3918j[i4] & i5) == i5 || (this.f3917i[i4] & i5) == i5) {
            return false;
        }
        int i6 = this.f3910b;
        if (abs <= ((float) i6) && abs2 <= ((float) i6)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f3927s.g(i5)) {
            return (this.f3917i[i4] & i5) == 0 && abs > ((float) this.f3910b);
        }
        int[] iArr = this.f3918j;
        iArr[i4] = iArr[i4] | i5;
        return false;
    }

    public final boolean d(View view, float f4, float f5) {
        if (view == null) {
            return false;
        }
        boolean z4 = this.f3927s.d(view) > 0;
        boolean z5 = this.f3927s.e(view) > 0;
        if (!z4 || !z5) {
            return z4 ? Math.abs(f4) > ((float) this.f3910b) : z5 && Math.abs(f5) > ((float) this.f3910b);
        }
        int i4 = this.f3910b;
        return (f4 * f4) + (f5 * f5) > ((float) (i4 * i4));
    }

    public final float e(float f4, float f5, float f6) {
        float abs = Math.abs(f4);
        if (abs < f5) {
            return 0.0f;
        }
        return abs > f6 ? f4 > 0.0f ? f6 : -f6 : f4;
    }

    public final int f(int i4, int i5, int i6) {
        int abs = Math.abs(i4);
        if (abs < i5) {
            return 0;
        }
        return abs > i6 ? i4 > 0 ? i6 : -i6 : i4;
    }

    public final void g() {
        float[] fArr = this.f3912d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3913e, 0.0f);
            Arrays.fill(this.f3914f, 0.0f);
            Arrays.fill(this.f3915g, 0.0f);
            Arrays.fill(this.f3916h, 0);
            Arrays.fill(this.f3917i, 0);
            Arrays.fill(this.f3918j, 0);
            this.f3919k = 0;
        }
    }

    public final void h(int i4) {
        if (this.f3912d != null && w(i4)) {
            this.f3912d[i4] = 0.0f;
            this.f3913e[i4] = 0.0f;
            this.f3914f[i4] = 0.0f;
            this.f3915g[i4] = 0.0f;
            this.f3916h[i4] = 0;
            this.f3917i[i4] = 0;
            this.f3918j[i4] = 0;
            this.f3919k = (~(1 << i4)) & this.f3919k;
        }
    }

    public final int i(int i4, int i5, int i6) {
        if (i4 == 0) {
            return 0;
        }
        int width = this.f3930v.getWidth();
        float f4 = (float) (width / 2);
        float o4 = f4 + (o(Math.min(1.0f, ((float) Math.abs(i4)) / ((float) width))) * f4);
        int abs = Math.abs(i5);
        return Math.min(abs > 0 ? Math.round(Math.abs(o4 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i4)) / ((float) i6)) + 1.0f) * 256.0f), 600);
    }

    public final int j(View view, int i4, int i5, int i6, int i7) {
        float f4;
        float f5;
        float f6;
        float f7;
        int f8 = f(i6, (int) this.f3922n, (int) this.f3921m);
        int f9 = f(i7, (int) this.f3922n, (int) this.f3921m);
        int abs = Math.abs(i4);
        int abs2 = Math.abs(i5);
        int abs3 = Math.abs(f8);
        int abs4 = Math.abs(f9);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (f8 != 0) {
            f4 = (float) abs3;
            f5 = (float) i8;
        } else {
            f4 = (float) abs;
            f5 = (float) i9;
        }
        float f10 = f4 / f5;
        if (f9 != 0) {
            f6 = (float) abs4;
            f7 = (float) i8;
        } else {
            f6 = (float) abs2;
            f7 = (float) i9;
        }
        float f11 = f6 / f7;
        return (int) ((((float) i(i4, f8, this.f3927s.d(view))) * f10) + (((float) i(i5, f9, this.f3927s.e(view))) * f11));
    }

    public boolean k(boolean z4) {
        if (this.f3909a == 2) {
            boolean computeScrollOffset = this.f3926r.computeScrollOffset();
            int currX = this.f3926r.getCurrX();
            int currY = this.f3926r.getCurrY();
            int left = currX - this.f3928t.getLeft();
            int top = currY - this.f3928t.getTop();
            if (left != 0) {
                C.R(this.f3928t, left);
            }
            if (top != 0) {
                C.S(this.f3928t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f3927s.k(this.f3928t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f3926r.getFinalX() && currY == this.f3926r.getFinalY()) {
                this.f3926r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z4) {
                    this.f3930v.post(this.f3931w);
                } else {
                    E(0);
                }
            }
        }
        return this.f3909a == 2;
    }

    public final void n(float f4, float f5) {
        this.f3929u = true;
        this.f3927s.l(this.f3928t, f4, f5);
        this.f3929u = false;
        if (this.f3909a == 1) {
            E(0);
        }
    }

    public final float o(float f4) {
        return (float) Math.sin((double) ((f4 - 0.5f) * 0.47123894f));
    }

    public final void p(int i4, int i5, int i6, int i7) {
        int left = this.f3928t.getLeft();
        int top = this.f3928t.getTop();
        if (i6 != 0) {
            i4 = this.f3927s.a(this.f3928t, i4, i6);
            C.R(this.f3928t, i4 - left);
        }
        int i8 = i4;
        if (i7 != 0) {
            i5 = this.f3927s.b(this.f3928t, i5, i7);
            C.S(this.f3928t, i5 - top);
        }
        int i9 = i5;
        if (i6 != 0 || i7 != 0) {
            this.f3927s.k(this.f3928t, i8, i9, i8 - left, i9 - top);
        }
    }

    public final void q(int i4) {
        float[] fArr = this.f3912d;
        if (fArr == null || fArr.length <= i4) {
            int i5 = i4 + 1;
            float[] fArr2 = new float[i5];
            float[] fArr3 = new float[i5];
            float[] fArr4 = new float[i5];
            float[] fArr5 = new float[i5];
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3913e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3914f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3915g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3916h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3917i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3918j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3912d = fArr2;
            this.f3913e = fArr3;
            this.f3914f = fArr4;
            this.f3915g = fArr5;
            this.f3916h = iArr;
            this.f3917i = iArr2;
            this.f3918j = iArr3;
        }
    }

    public View r(int i4, int i5) {
        for (int childCount = this.f3930v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f3930v.getChildAt(this.f3927s.c(childCount));
            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean s(int i4, int i5, int i6, int i7) {
        int left = this.f3928t.getLeft();
        int top = this.f3928t.getTop();
        int i8 = i4 - left;
        int i9 = i5 - top;
        if (i8 == 0 && i9 == 0) {
            this.f3926r.abortAnimation();
            E(0);
            return false;
        }
        this.f3926r.startScroll(left, top, i8, i9, j(this.f3928t, i8, i9, i6, i7));
        E(2);
        return true;
    }

    public final int t(int i4, int i5) {
        int i6 = i4 < this.f3930v.getLeft() + this.f3923o ? 1 : 0;
        if (i5 < this.f3930v.getTop() + this.f3923o) {
            i6 |= 4;
        }
        if (i4 > this.f3930v.getRight() - this.f3923o) {
            i6 |= 2;
        }
        return i5 > this.f3930v.getBottom() - this.f3923o ? i6 | 8 : i6;
    }

    public int u() {
        return this.f3910b;
    }

    public boolean v(int i4, int i5) {
        return y(this.f3928t, i4, i5);
    }

    public boolean w(int i4) {
        return ((1 << i4) & this.f3919k) != 0;
    }

    public final boolean x(int i4) {
        if (w(i4)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i4 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean y(View view, int i4, int i5) {
        return view != null && i4 >= view.getLeft() && i4 < view.getRight() && i5 >= view.getTop() && i5 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3920l == null) {
            this.f3920l = VelocityTracker.obtain();
        }
        this.f3920l.addMovement(motionEvent);
        int i5 = 0;
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r4 = r((int) x4, (int) y4);
            C(x4, y4, pointerId);
            I(r4, pointerId);
            int i6 = this.f3916h[pointerId];
            int i7 = this.f3925q;
            if ((i6 & i7) != 0) {
                this.f3927s.h(i6 & i7, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f3909a == 1) {
                A();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f3909a == 1) {
                    n(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x5 = motionEvent.getX(actionIndex);
                float y5 = motionEvent.getY(actionIndex);
                C(x5, y5, pointerId2);
                if (this.f3909a == 0) {
                    I(r((int) x5, (int) y5), pointerId2);
                    int i8 = this.f3916h[pointerId2];
                    int i9 = this.f3925q;
                    if ((i8 & i9) != 0) {
                        this.f3927s.h(i8 & i9, pointerId2);
                    }
                } else if (v((int) x5, (int) y5)) {
                    I(this.f3928t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f3909a == 1 && pointerId3 == this.f3911c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i5 >= pointerCount) {
                            i4 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i5);
                        if (pointerId4 != this.f3911c) {
                            View r5 = r((int) motionEvent.getX(i5), (int) motionEvent.getY(i5));
                            View view = this.f3928t;
                            if (r5 == view && I(view, pointerId4)) {
                                i4 = this.f3911c;
                                break;
                            }
                        }
                        i5++;
                    }
                    if (i4 == -1) {
                        A();
                    }
                }
                h(pointerId3);
            }
        } else if (this.f3909a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i5 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i5);
                if (x(pointerId5)) {
                    float x6 = motionEvent.getX(i5);
                    float y6 = motionEvent.getY(i5);
                    float f4 = x6 - this.f3912d[pointerId5];
                    float f5 = y6 - this.f3913e[pointerId5];
                    B(f4, f5, pointerId5);
                    if (this.f3909a != 1) {
                        View r6 = r((int) x6, (int) y6);
                        if (d(r6, f4, f5) && I(r6, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i5++;
            }
            D(motionEvent);
        } else if (x(this.f3911c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3911c);
            float x7 = motionEvent.getX(findPointerIndex);
            float y7 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f3914f;
            int i10 = this.f3911c;
            int i11 = (int) (x7 - fArr[i10]);
            int i12 = (int) (y7 - this.f3915g[i10]);
            p(this.f3928t.getLeft() + i11, this.f3928t.getTop() + i12, i11, i12);
            D(motionEvent);
        }
    }
}
