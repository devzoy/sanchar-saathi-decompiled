package X1;

import S.C;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class a extends c {

    /* renamed from: d  reason: collision with root package name */
    public Runnable f3462d;

    /* renamed from: e  reason: collision with root package name */
    public OverScroller f3463e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3464f;

    /* renamed from: g  reason: collision with root package name */
    public int f3465g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f3466h;

    /* renamed from: i  reason: collision with root package name */
    public int f3467i = -1;

    /* renamed from: j  reason: collision with root package name */
    public VelocityTracker f3468j;

    /* renamed from: X1.a$a  reason: collision with other inner class name */
    public class C0065a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final CoordinatorLayout f3469e;

        /* renamed from: f  reason: collision with root package name */
        public final View f3470f;

        public C0065a(CoordinatorLayout coordinatorLayout, View view) {
            this.f3469e = coordinatorLayout;
            this.f3470f = view;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f3470f != null && (overScroller = a.this.f3463e) != null) {
                if (overScroller.computeScrollOffset()) {
                    a aVar = a.this;
                    aVar.O(this.f3469e, this.f3470f, aVar.f3463e.getCurrY());
                    C.Y(this.f3470f, this);
                    return;
                }
                a.this.M(this.f3469e, this.f3470f);
            }
        }
    }

    public a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = r2
            goto L_0x001c
        L_0x001b:
            r12 = r3
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f3465g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f3466h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f3465g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f3466h
            int r7 = r1 - r0
            r11.f3466h = r0
            int r8 = r11.J(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.N(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = r3
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f3468j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f3468j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f3468j
            int r4 = r11.f3465g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.K(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.I(r6, r7, r8, r9, r10)
            r12 = r2
            goto L_0x0073
        L_0x0072:
            r12 = r3
        L_0x0073:
            r11.f3464f = r3
            r11.f3465g = r1
            android.view.VelocityTracker r13 = r11.f3468j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f3468j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f3468j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f3464f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = r3
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract boolean G(View view);

    public final void H() {
        if (this.f3468j == null) {
            this.f3468j = VelocityTracker.obtain();
        }
    }

    public final boolean I(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, float f4) {
        View view2 = view;
        Runnable runnable = this.f3462d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f3462d = null;
        }
        if (this.f3463e == null) {
            this.f3463e = new OverScroller(view.getContext());
        }
        this.f3463e.fling(0, E(), 0, Math.round(f4), 0, 0, i4, i5);
        if (this.f3463e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C0065a aVar = new C0065a(coordinatorLayout, view);
            this.f3462d = aVar;
            C.Y(view, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        M(coordinatorLayout, view);
        return false;
    }

    public abstract int J(View view);

    public abstract int K(View view);

    public abstract int L();

    public abstract void M(CoordinatorLayout coordinatorLayout, View view);

    public final int N(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        return P(coordinatorLayout, view, L() - i4, i5, i6);
    }

    public int O(CoordinatorLayout coordinatorLayout, View view, int i4) {
        return P(coordinatorLayout, view, i4, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public abstract int P(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6);

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f3467i < 0) {
            this.f3467i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f3464f) {
            int i4 = this.f3465g;
            if (i4 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i4)) == -1) {
                return false;
            }
            int y4 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y4 - this.f3466h) > this.f3467i) {
                this.f3466h = y4;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f3465g = -1;
            int x4 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            boolean z4 = G(view) && coordinatorLayout.z(view, x4, y5);
            this.f3464f = z4;
            if (z4) {
                this.f3466h = y5;
                this.f3465g = motionEvent.getPointerId(0);
                H();
                OverScroller overScroller = this.f3463e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f3463e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f3468j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
