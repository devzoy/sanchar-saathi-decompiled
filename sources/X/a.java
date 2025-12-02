package X;

import S.C;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a implements View.OnTouchListener {

    /* renamed from: t  reason: collision with root package name */
    public static final int f3408t = ViewConfiguration.getTapTimeout();

    /* renamed from: c  reason: collision with root package name */
    public final C0064a f3409c = new C0064a();

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f3410d = new AccelerateInterpolator();

    /* renamed from: e  reason: collision with root package name */
    public final View f3411e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f3412f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f3413g = {0.0f, 0.0f};

    /* renamed from: h  reason: collision with root package name */
    public float[] f3414h = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i  reason: collision with root package name */
    public int f3415i;

    /* renamed from: j  reason: collision with root package name */
    public int f3416j;

    /* renamed from: k  reason: collision with root package name */
    public float[] f3417k = {0.0f, 0.0f};

    /* renamed from: l  reason: collision with root package name */
    public float[] f3418l = {0.0f, 0.0f};

    /* renamed from: m  reason: collision with root package name */
    public float[] f3419m = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: n  reason: collision with root package name */
    public boolean f3420n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3421o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3422p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3423q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3424r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3425s;

    /* renamed from: X.a$a  reason: collision with other inner class name */
    public static class C0064a {

        /* renamed from: a  reason: collision with root package name */
        public int f3426a;

        /* renamed from: b  reason: collision with root package name */
        public int f3427b;

        /* renamed from: c  reason: collision with root package name */
        public float f3428c;

        /* renamed from: d  reason: collision with root package name */
        public float f3429d;

        /* renamed from: e  reason: collision with root package name */
        public long f3430e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f3431f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f3432g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f3433h = 0;

        /* renamed from: i  reason: collision with root package name */
        public long f3434i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f3435j;

        /* renamed from: k  reason: collision with root package name */
        public int f3436k;

        public void a() {
            if (this.f3431f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g4 = g(e(currentAnimationTimeMillis));
                this.f3431f = currentAnimationTimeMillis;
                float f4 = ((float) (currentAnimationTimeMillis - this.f3431f)) * g4;
                this.f3432g = (int) (this.f3428c * f4);
                this.f3433h = (int) (f4 * this.f3429d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f3432g;
        }

        public int c() {
            return this.f3433h;
        }

        public int d() {
            float f4 = this.f3428c;
            return (int) (f4 / Math.abs(f4));
        }

        public final float e(long j4) {
            long j5 = this.f3430e;
            if (j4 < j5) {
                return 0.0f;
            }
            long j6 = this.f3434i;
            if (j6 < 0 || j4 < j6) {
                return a.e(((float) (j4 - j5)) / ((float) this.f3426a), 0.0f, 1.0f) * 0.5f;
            }
            float f4 = this.f3435j;
            return (1.0f - f4) + (f4 * a.e(((float) (j4 - j6)) / ((float) this.f3436k), 0.0f, 1.0f));
        }

        public int f() {
            float f4 = this.f3429d;
            return (int) (f4 / Math.abs(f4));
        }

        public final float g(float f4) {
            return (-4.0f * f4 * f4) + (f4 * 4.0f);
        }

        public boolean h() {
            return this.f3434i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3434i + ((long) this.f3436k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3436k = a.f((int) (currentAnimationTimeMillis - this.f3430e), 0, this.f3427b);
            this.f3435j = e(currentAnimationTimeMillis);
            this.f3434i = currentAnimationTimeMillis;
        }

        public void j(int i4) {
            this.f3427b = i4;
        }

        public void k(int i4) {
            this.f3426a = i4;
        }

        public void l(float f4, float f5) {
            this.f3428c = f4;
            this.f3429d = f5;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3430e = currentAnimationTimeMillis;
            this.f3434i = -1;
            this.f3431f = currentAnimationTimeMillis;
            this.f3435j = 0.5f;
            this.f3432g = 0;
            this.f3433h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.f3423q) {
                if (aVar.f3421o) {
                    aVar.f3421o = false;
                    aVar.f3409c.m();
                }
                C0064a aVar2 = a.this.f3409c;
                if (aVar2.h() || !a.this.u()) {
                    a.this.f3423q = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.f3422p) {
                    aVar3.f3422p = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                C.Y(a.this.f3411e, this);
            }
        }
    }

    public a(View view) {
        this.f3411e = view;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = (float) ((int) ((1575.0f * f4) + 0.5f));
        o(f5, f5);
        float f6 = (float) ((int) ((f4 * 315.0f) + 0.5f));
        p(f6, f6);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f3408t);
        r(500);
        q(500);
    }

    public static float e(float f4, float f5, float f6) {
        return f4 > f6 ? f6 : f4 < f5 ? f5 : f4;
    }

    public static int f(int i4, int i5, int i6) {
        return i4 > i6 ? i6 : i4 < i5 ? i5 : i4;
    }

    public abstract boolean a(int i4);

    public abstract boolean b(int i4);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3411e.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i4, float f4, float f5, float f6) {
        float h4 = h(this.f3413g[i4], f5, this.f3414h[i4], f4);
        int i5 = (h4 > 0.0f ? 1 : (h4 == 0.0f ? 0 : -1));
        if (i5 == 0) {
            return 0.0f;
        }
        float f7 = this.f3417k[i4];
        float f8 = this.f3418l[i4];
        float f9 = this.f3419m[i4];
        float f10 = f7 * f6;
        return i5 > 0 ? e(h4 * f10, f8, f9) : -e((-h4) * f10, f8, f9);
    }

    public final float g(float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        int i4 = this.f3415i;
        if (i4 == 0 || i4 == 1) {
            if (f4 < f5) {
                return f4 >= 0.0f ? 1.0f - (f4 / f5) : (!this.f3423q || i4 != 1) ? 0.0f : 1.0f;
            }
        } else if (i4 == 2 && f4 < 0.0f) {
            return f4 / (-f5);
        }
    }

    public final float h(float f4, float f5, float f6, float f7) {
        float f8;
        float e4 = e(f4 * f5, 0.0f, f6);
        float g4 = g(f5 - f7, e4) - g(f7, e4);
        if (g4 < 0.0f) {
            f8 = -this.f3410d.getInterpolation(-g4);
        } else if (g4 <= 0.0f) {
            return 0.0f;
        } else {
            f8 = this.f3410d.getInterpolation(g4);
        }
        return e(f8, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f3421o) {
            this.f3423q = false;
        } else {
            this.f3409c.i();
        }
    }

    public abstract void j(int i4, int i5);

    public a k(int i4) {
        this.f3416j = i4;
        return this;
    }

    public a l(int i4) {
        this.f3415i = i4;
        return this;
    }

    public a m(boolean z4) {
        if (this.f3424r && !z4) {
            i();
        }
        this.f3424r = z4;
        return this;
    }

    public a n(float f4, float f5) {
        float[] fArr = this.f3414h;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    public a o(float f4, float f5) {
        float[] fArr = this.f3419m;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3424r
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.f3422p = r2
            r5.f3420n = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3411e
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3411e
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            X.a$a r7 = r5.f3409c
            r7.l(r0, r6)
            boolean r6 = r5.f3423q
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.f3425s
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f3423q
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f4, float f5) {
        float[] fArr = this.f3418l;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    public a q(int i4) {
        this.f3409c.j(i4);
        return this;
    }

    public a r(int i4) {
        this.f3409c.k(i4);
        return this;
    }

    public a s(float f4, float f5) {
        float[] fArr = this.f3413g;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    public a t(float f4, float f5) {
        float[] fArr = this.f3417k;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0064a aVar = this.f3409c;
        int f4 = aVar.f();
        int d4 = aVar.d();
        return (f4 != 0 && b(f4)) || (d4 != 0 && a(d4));
    }

    public final void v() {
        int i4;
        if (this.f3412f == null) {
            this.f3412f = new b();
        }
        this.f3423q = true;
        this.f3421o = true;
        if (this.f3420n || (i4 = this.f3416j) <= 0) {
            this.f3412f.run();
        } else {
            C.Z(this.f3411e, this.f3412f, (long) i4);
        }
        this.f3420n = true;
    }
}
