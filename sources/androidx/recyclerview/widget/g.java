package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class g extends RecyclerView.y {

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f6003i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f6004j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    public PointF f6005k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f6006l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6007m = false;

    /* renamed from: n  reason: collision with root package name */
    public float f6008n;

    /* renamed from: o  reason: collision with root package name */
    public int f6009o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f6010p = 0;

    public g(Context context) {
        this.f6006l = context.getResources().getDisplayMetrics();
    }

    public final float A() {
        if (!this.f6007m) {
            this.f6008n = v(this.f6006l);
            this.f6007m = true;
        }
        return this.f6008n;
    }

    public int B() {
        PointF pointF = this.f6005k;
        if (pointF != null) {
            float f4 = pointF.y;
            if (f4 != 0.0f) {
                return f4 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public void C(RecyclerView.y.a aVar) {
        PointF a4 = a(f());
        if (a4 == null || (a4.x == 0.0f && a4.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a4);
        this.f6005k = a4;
        this.f6009o = (int) (a4.x * 10000.0f);
        this.f6010p = (int) (a4.y * 10000.0f);
        aVar.d((int) (((float) this.f6009o) * 1.2f), (int) (((float) this.f6010p) * 1.2f), (int) (((float) x(10000)) * 1.2f), this.f6003i);
    }

    public void l(int i4, int i5, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f6009o = y(this.f6009o, i4);
        int y4 = y(this.f6010p, i5);
        this.f6010p = y4;
        if (this.f6009o == 0 && y4 == 0) {
            C(aVar);
        }
    }

    public void m() {
    }

    public void n() {
        this.f6010p = 0;
        this.f6009o = 0;
        this.f6005k = null;
    }

    public void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        int t4 = t(view, z());
        int u4 = u(view, B());
        int w4 = w((int) Math.sqrt((double) ((t4 * t4) + (u4 * u4))));
        if (w4 > 0) {
            aVar.d(-t4, -u4, w4, this.f6004j);
        }
    }

    public int s(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == -1) {
            return i6 - i4;
        }
        if (i8 == 0) {
            int i9 = i6 - i4;
            if (i9 > 0) {
                return i9;
            }
            int i10 = i7 - i5;
            if (i10 < 0) {
                return i10;
            }
            return 0;
        } else if (i8 == 1) {
            return i7 - i5;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int t(View view, int i4) {
        RecyclerView.o e4 = e();
        if (e4 == null || !e4.k()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e4.Q(view) - pVar.leftMargin, e4.T(view) + pVar.rightMargin, e4.e0(), e4.o0() - e4.f0(), i4);
    }

    public int u(View view, int i4) {
        RecyclerView.o e4 = e();
        if (e4 == null || !e4.l()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e4.U(view) - pVar.topMargin, e4.O(view) + pVar.bottomMargin, e4.g0(), e4.W() - e4.d0(), i4);
    }

    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int w(int i4) {
        return (int) Math.ceil(((double) x(i4)) / 0.3356d);
    }

    public int x(int i4) {
        return (int) Math.ceil((double) (((float) Math.abs(i4)) * A()));
    }

    public final int y(int i4, int i5) {
        int i6 = i4 - i5;
        if (i4 * i6 <= 0) {
            return 0;
        }
        return i6;
    }

    public int z() {
        PointF pointF = this.f6005k;
        if (pointF != null) {
            float f4 = pointF.x;
            if (f4 != 0.0f) {
                return f4 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
