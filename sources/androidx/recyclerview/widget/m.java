package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class m extends RecyclerView.l {

    /* renamed from: g  reason: collision with root package name */
    public boolean f6022g = true;

    public final void A(RecyclerView.C c4) {
        I(c4);
        h(c4);
    }

    public final void B(RecyclerView.C c4) {
        J(c4);
    }

    public final void C(RecyclerView.C c4, boolean z4) {
        K(c4, z4);
        h(c4);
    }

    public final void D(RecyclerView.C c4, boolean z4) {
        L(c4, z4);
    }

    public final void E(RecyclerView.C c4) {
        M(c4);
        h(c4);
    }

    public final void F(RecyclerView.C c4) {
        N(c4);
    }

    public final void G(RecyclerView.C c4) {
        O(c4);
        h(c4);
    }

    public final void H(RecyclerView.C c4) {
        P(c4);
    }

    public void I(RecyclerView.C c4) {
    }

    public void J(RecyclerView.C c4) {
    }

    public void K(RecyclerView.C c4, boolean z4) {
    }

    public void L(RecyclerView.C c4, boolean z4) {
    }

    public void M(RecyclerView.C c4) {
    }

    public void N(RecyclerView.C c4) {
    }

    public void O(RecyclerView.C c4) {
    }

    public void P(RecyclerView.C c4) {
    }

    public boolean a(RecyclerView.C c4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i4;
        int i5;
        if (bVar == null || ((i4 = bVar.f5738a) == (i5 = bVar2.f5738a) && bVar.f5739b == bVar2.f5739b)) {
            return w(c4);
        }
        return y(c4, i4, bVar.f5739b, i5, bVar2.f5739b);
    }

    public boolean b(RecyclerView.C c4, RecyclerView.C c5, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i4;
        int i5;
        int i6 = bVar.f5738a;
        int i7 = bVar.f5739b;
        if (c5.J()) {
            int i8 = bVar.f5738a;
            i4 = bVar.f5739b;
            i5 = i8;
        } else {
            i5 = bVar2.f5738a;
            i4 = bVar2.f5739b;
        }
        return x(c4, c5, i6, i7, i5, i4);
    }

    public boolean c(RecyclerView.C c4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i4 = bVar.f5738a;
        int i5 = bVar.f5739b;
        View view = c4.f5707a;
        int left = bVar2 == null ? view.getLeft() : bVar2.f5738a;
        int top = bVar2 == null ? view.getTop() : bVar2.f5739b;
        if (c4.v() || (i4 == left && i5 == top)) {
            return z(c4);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(c4, i4, i5, left, top);
    }

    public boolean d(RecyclerView.C c4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i4 = bVar.f5738a;
        int i5 = bVar2.f5738a;
        if (i4 == i5 && bVar.f5739b == bVar2.f5739b) {
            E(c4);
            return false;
        }
        return y(c4, i4, bVar.f5739b, i5, bVar2.f5739b);
    }

    public boolean f(RecyclerView.C c4) {
        return !this.f6022g || c4.t();
    }

    public abstract boolean w(RecyclerView.C c4);

    public abstract boolean x(RecyclerView.C c4, RecyclerView.C c5, int i4, int i5, int i6, int i7);

    public abstract boolean y(RecyclerView.C c4, int i4, int i5, int i6, int i7);

    public abstract boolean z(RecyclerView.C c4);
}
