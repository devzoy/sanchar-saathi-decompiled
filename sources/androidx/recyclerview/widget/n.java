package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class n extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f6023a;

    /* renamed from: b  reason: collision with root package name */
    public Scroller f6024b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView.s f6025c = new a();

    public class a extends RecyclerView.s {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6026a = false;

        public a() {
        }

        public void a(RecyclerView recyclerView, int i4) {
            super.a(recyclerView, i4);
            if (i4 == 0 && this.f6026a) {
                this.f6026a = false;
                n.this.k();
            }
        }

        public void b(RecyclerView recyclerView, int i4, int i5) {
            if (i4 != 0 || i5 != 0) {
                this.f6026a = true;
            }
        }
    }

    public boolean a(int i4, int i5) {
        RecyclerView.o layoutManager = this.f6023a.getLayoutManager();
        if (layoutManager == null || this.f6023a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f6023a.getMinFlingVelocity();
        return (Math.abs(i5) > minFlingVelocity || Math.abs(i4) > minFlingVelocity) && j(layoutManager, i4, i5);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6023a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                f();
            }
            this.f6023a = recyclerView;
            if (recyclerView != null) {
                i();
                this.f6024b = new Scroller(this.f6023a.getContext(), new DecelerateInterpolator());
                k();
            }
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    public RecyclerView.y d(RecyclerView.o oVar) {
        return e(oVar);
    }

    public abstract g e(RecyclerView.o oVar);

    public final void f() {
        this.f6023a.X0(this.f6025c);
        this.f6023a.setOnFlingListener((RecyclerView.q) null);
    }

    public abstract View g(RecyclerView.o oVar);

    public abstract int h(RecyclerView.o oVar, int i4, int i5);

    public final void i() {
        if (this.f6023a.getOnFlingListener() == null) {
            this.f6023a.k(this.f6025c);
            this.f6023a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    public final boolean j(RecyclerView.o oVar, int i4, int i5) {
        RecyclerView.y d4;
        int h4;
        if (!(oVar instanceof RecyclerView.y.b) || (d4 = d(oVar)) == null || (h4 = h(oVar, i4, i5)) == -1) {
            return false;
        }
        d4.p(h4);
        oVar.J1(d4);
        return true;
    }

    public void k() {
        RecyclerView.o layoutManager;
        View g4;
        RecyclerView recyclerView = this.f6023a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (g4 = g(layoutManager)) != null) {
            int[] c4 = c(layoutManager, g4);
            int i4 = c4[0];
            if (i4 != 0 || c4[1] != 0) {
                this.f6023a.k1(i4, c4[1]);
            }
        }
    }
}
