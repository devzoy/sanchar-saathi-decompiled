package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import o.C0813f;

public abstract class N implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public final float f11396c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11397d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11398e;

    /* renamed from: f  reason: collision with root package name */
    public final View f11399f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f11400g;

    /* renamed from: h  reason: collision with root package name */
    public Runnable f11401h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11402i;

    /* renamed from: j  reason: collision with root package name */
    public int f11403j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f11404k = new int[2];

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ViewParent parent = N.this.f11399f.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            N.this.e();
        }
    }

    public N(View view) {
        this.f11399f = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f11396c = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f11397d = tapTimeout;
        this.f11398e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f4, float f5, float f6) {
        float f7 = -f6;
        return f4 >= f7 && f5 >= f7 && f4 < ((float) (view.getRight() - view.getLeft())) + f6 && f5 < ((float) (view.getBottom() - view.getTop())) + f6;
    }

    public final void a() {
        Runnable runnable = this.f11401h;
        if (runnable != null) {
            this.f11399f.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f11400g;
        if (runnable2 != null) {
            this.f11399f.removeCallbacks(runnable2);
        }
    }

    public abstract C0813f b();

    public abstract boolean c();

    public boolean d() {
        C0813f b4 = b();
        if (b4 == null || !b4.c()) {
            return true;
        }
        b4.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f11399f;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f11402i = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        L l4;
        View view = this.f11399f;
        C0813f b4 = b();
        if (b4 == null || !b4.c() || (l4 = (L) b4.g()) == null || !l4.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(l4, obtainNoHistory);
        boolean e4 = l4.e(obtainNoHistory, this.f11403j);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e4 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f11399f
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f11403j
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f11396c
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f11403j = r6
            java.lang.Runnable r6 = r5.f11400g
            if (r6 != 0) goto L_0x0052
            p.N$a r6 = new p.N$a
            r6.<init>()
            r5.f11400g = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f11400g
            int r1 = r5.f11397d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f11401h
            if (r6 != 0) goto L_0x0065
            p.N$b r6 = new p.N$b
            r6.<init>()
            r5.f11401h = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f11401h
            int r1 = r5.f11398e
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.N.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f11404k;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f11404k;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z4;
        boolean z5 = this.f11402i;
        if (z5) {
            z4 = f(motionEvent) || !d();
        } else {
            z4 = g(motionEvent) && c();
            if (z4) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f11399f.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f11402i = z4;
        return z4 || z5;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f11402i = false;
        this.f11403j = -1;
        Runnable runnable = this.f11400g;
        if (runnable != null) {
            this.f11399f.removeCallbacks(runnable);
        }
    }
}
