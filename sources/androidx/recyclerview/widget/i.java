package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.o f6012a;

    /* renamed from: b  reason: collision with root package name */
    public int f6013b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f6014c;

    public static class a extends i {
        public a(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.f6012a.T(view) + ((RecyclerView.p) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f6012a.S(view) + pVar.leftMargin + pVar.rightMargin;
        }

        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f6012a.R(view) + pVar.topMargin + pVar.bottomMargin;
        }

        public int g(View view) {
            return this.f6012a.Q(view) - ((RecyclerView.p) view.getLayoutParams()).leftMargin;
        }

        public int h() {
            return this.f6012a.o0();
        }

        public int i() {
            return this.f6012a.o0() - this.f6012a.f0();
        }

        public int j() {
            return this.f6012a.f0();
        }

        public int k() {
            return this.f6012a.p0();
        }

        public int l() {
            return this.f6012a.X();
        }

        public int m() {
            return this.f6012a.e0();
        }

        public int n() {
            return (this.f6012a.o0() - this.f6012a.e0()) - this.f6012a.f0();
        }

        public int p(View view) {
            this.f6012a.n0(view, true, this.f6014c);
            return this.f6014c.right;
        }

        public int q(View view) {
            this.f6012a.n0(view, true, this.f6014c);
            return this.f6014c.left;
        }

        public void r(int i4) {
            this.f6012a.C0(i4);
        }
    }

    public static class b extends i {
        public b(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.f6012a.O(view) + ((RecyclerView.p) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f6012a.R(view) + pVar.topMargin + pVar.bottomMargin;
        }

        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f6012a.S(view) + pVar.leftMargin + pVar.rightMargin;
        }

        public int g(View view) {
            return this.f6012a.U(view) - ((RecyclerView.p) view.getLayoutParams()).topMargin;
        }

        public int h() {
            return this.f6012a.W();
        }

        public int i() {
            return this.f6012a.W() - this.f6012a.d0();
        }

        public int j() {
            return this.f6012a.d0();
        }

        public int k() {
            return this.f6012a.X();
        }

        public int l() {
            return this.f6012a.p0();
        }

        public int m() {
            return this.f6012a.g0();
        }

        public int n() {
            return (this.f6012a.W() - this.f6012a.g0()) - this.f6012a.d0();
        }

        public int p(View view) {
            this.f6012a.n0(view, true, this.f6014c);
            return this.f6014c.bottom;
        }

        public int q(View view) {
            this.f6012a.n0(view, true, this.f6014c);
            return this.f6014c.top;
        }

        public void r(int i4) {
            this.f6012a.D0(i4);
        }
    }

    public /* synthetic */ i(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static i a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static i b(RecyclerView.o oVar, int i4) {
        if (i4 == 0) {
            return a(oVar);
        }
        if (i4 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f6013b) {
            return 0;
        }
        return n() - this.f6013b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i4);

    public void s() {
        this.f6013b = n();
    }

    public i(RecyclerView.o oVar) {
        this.f6013b = Integer.MIN_VALUE;
        this.f6014c = new Rect();
        this.f6012a = oVar;
    }
}
