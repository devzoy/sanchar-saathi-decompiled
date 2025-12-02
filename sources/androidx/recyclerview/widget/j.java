package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class j extends n {

    /* renamed from: d  reason: collision with root package name */
    public i f6015d;

    /* renamed from: e  reason: collision with root package name */
    public i f6016e;

    public class a extends g {
        public a(Context context) {
            super(context);
        }

        public void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            j jVar = j.this;
            int[] c4 = jVar.c(jVar.f6023a.getLayoutManager(), view);
            int i4 = c4[0];
            int i5 = c4[1];
            int w4 = w(Math.max(Math.abs(i4), Math.abs(i5)));
            if (w4 > 0) {
                aVar.d(i4, i5, w4, this.f6004j);
            }
        }

        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        public int x(int i4) {
            return Math.min(100, super.x(i4));
        }
    }

    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.k()) {
            iArr[0] = l(oVar, view, n(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.l()) {
            iArr[1] = l(oVar, view, p(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public g e(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.y.b)) {
            return null;
        }
        return new a(this.f6023a.getContext());
    }

    public View g(RecyclerView.o oVar) {
        if (oVar.l()) {
            return m(oVar, p(oVar));
        }
        if (oVar.k()) {
            return m(oVar, n(oVar));
        }
        return null;
    }

    public int h(RecyclerView.o oVar, int i4, int i5) {
        i o4;
        int Y3 = oVar.Y();
        if (Y3 == 0 || (o4 = o(oVar)) == null) {
            return -1;
        }
        int J4 = oVar.J();
        View view = null;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i8 = 0; i8 < J4; i8++) {
            View I4 = oVar.I(i8);
            if (I4 != null) {
                int l4 = l(oVar, I4, o4);
                if (l4 <= 0 && l4 > i7) {
                    view2 = I4;
                    i7 = l4;
                }
                if (l4 >= 0 && l4 < i6) {
                    view = I4;
                    i6 = l4;
                }
            }
        }
        boolean q4 = q(oVar, i4, i5);
        if (q4 && view != null) {
            return oVar.h0(view);
        }
        if (!q4 && view2 != null) {
            return oVar.h0(view2);
        }
        if (q4) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int h02 = oVar.h0(view) + (r(oVar) == q4 ? -1 : 1);
        if (h02 < 0 || h02 >= Y3) {
            return -1;
        }
        return h02;
    }

    public final int l(RecyclerView.o oVar, View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    public final View m(RecyclerView.o oVar, i iVar) {
        int J4 = oVar.J();
        View view = null;
        if (J4 == 0) {
            return null;
        }
        int m4 = iVar.m() + (iVar.n() / 2);
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < J4; i5++) {
            View I4 = oVar.I(i5);
            int abs = Math.abs((iVar.g(I4) + (iVar.e(I4) / 2)) - m4);
            if (abs < i4) {
                view = I4;
                i4 = abs;
            }
        }
        return view;
    }

    public final i n(RecyclerView.o oVar) {
        i iVar = this.f6016e;
        if (iVar == null || iVar.f6012a != oVar) {
            this.f6016e = i.a(oVar);
        }
        return this.f6016e;
    }

    public final i o(RecyclerView.o oVar) {
        if (oVar.l()) {
            return p(oVar);
        }
        if (oVar.k()) {
            return n(oVar);
        }
        return null;
    }

    public final i p(RecyclerView.o oVar) {
        i iVar = this.f6015d;
        if (iVar == null || iVar.f6012a != oVar) {
            this.f6015d = i.c(oVar);
        }
        return this.f6015d;
    }

    public final boolean q(RecyclerView.o oVar, int i4, int i5) {
        return oVar.k() ? i4 > 0 : i5 > 0;
    }

    public final boolean r(RecyclerView.o oVar) {
        PointF a4;
        int Y3 = oVar.Y();
        if (!(oVar instanceof RecyclerView.y.b) || (a4 = ((RecyclerView.y.b) oVar).a(Y3 - 1)) == null) {
            return false;
        }
        return a4.x < 0.0f || a4.y < 0.0f;
    }
}
