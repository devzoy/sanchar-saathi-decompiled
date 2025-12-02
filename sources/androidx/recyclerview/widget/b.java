package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final C0099b f5887a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5888b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List f5889c = new ArrayList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f5890a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f5891b;

        public void a(int i4) {
            if (i4 >= 64) {
                a aVar = this.f5891b;
                if (aVar != null) {
                    aVar.a(i4 - 64);
                    return;
                }
                return;
            }
            this.f5890a &= ~(1 << i4);
        }

        public int b(int i4) {
            a aVar = this.f5891b;
            return aVar == null ? i4 >= 64 ? Long.bitCount(this.f5890a) : Long.bitCount(this.f5890a & ((1 << i4) - 1)) : i4 < 64 ? Long.bitCount(this.f5890a & ((1 << i4) - 1)) : aVar.b(i4 - 64) + Long.bitCount(this.f5890a);
        }

        public final void c() {
            if (this.f5891b == null) {
                this.f5891b = new a();
            }
        }

        public boolean d(int i4) {
            if (i4 < 64) {
                return (this.f5890a & (1 << i4)) != 0;
            }
            c();
            return this.f5891b.d(i4 - 64);
        }

        public void e(int i4, boolean z4) {
            if (i4 >= 64) {
                c();
                this.f5891b.e(i4 - 64, z4);
                return;
            }
            long j4 = this.f5890a;
            boolean z5 = (Long.MIN_VALUE & j4) != 0;
            long j5 = (1 << i4) - 1;
            this.f5890a = ((j4 & (~j5)) << 1) | (j4 & j5);
            if (z4) {
                h(i4);
            } else {
                a(i4);
            }
            if (z5 || this.f5891b != null) {
                c();
                this.f5891b.e(0, z5);
            }
        }

        public boolean f(int i4) {
            if (i4 >= 64) {
                c();
                return this.f5891b.f(i4 - 64);
            }
            long j4 = 1 << i4;
            long j5 = this.f5890a;
            boolean z4 = (j5 & j4) != 0;
            long j6 = j5 & (~j4);
            this.f5890a = j6;
            long j7 = j4 - 1;
            this.f5890a = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
            a aVar = this.f5891b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f5891b.f(0);
            }
            return z4;
        }

        public void g() {
            this.f5890a = 0;
            a aVar = this.f5891b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i4) {
            if (i4 >= 64) {
                c();
                this.f5891b.h(i4 - 64);
                return;
            }
            this.f5890a |= 1 << i4;
        }

        public String toString() {
            if (this.f5891b == null) {
                return Long.toBinaryString(this.f5890a);
            }
            return this.f5891b.toString() + "xx" + Long.toBinaryString(this.f5890a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    public interface C0099b {
        View a(int i4);

        void b(View view);

        RecyclerView.C c(View view);

        void d(int i4);

        void e(View view);

        void f(View view, int i4);

        int g();

        void h(int i4);

        void i();

        void j(View view, int i4, ViewGroup.LayoutParams layoutParams);

        int k(View view);
    }

    public b(C0099b bVar) {
        this.f5887a = bVar;
    }

    public void a(View view, int i4, boolean z4) {
        int g4 = i4 < 0 ? this.f5887a.g() : h(i4);
        this.f5888b.e(g4, z4);
        if (z4) {
            l(view);
        }
        this.f5887a.f(view, g4);
    }

    public void b(View view, boolean z4) {
        a(view, -1, z4);
    }

    public void c(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z4) {
        int g4 = i4 < 0 ? this.f5887a.g() : h(i4);
        this.f5888b.e(g4, z4);
        if (z4) {
            l(view);
        }
        this.f5887a.j(view, g4, layoutParams);
    }

    public void d(int i4) {
        int h4 = h(i4);
        this.f5888b.f(h4);
        this.f5887a.d(h4);
    }

    public View e(int i4) {
        int size = this.f5889c.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f5889c.get(i5);
            RecyclerView.C c4 = this.f5887a.c(view);
            if (c4.m() == i4 && !c4.t() && !c4.v()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i4) {
        return this.f5887a.a(h(i4));
    }

    public int g() {
        return this.f5887a.g() - this.f5889c.size();
    }

    public final int h(int i4) {
        if (i4 < 0) {
            return -1;
        }
        int g4 = this.f5887a.g();
        int i5 = i4;
        while (i5 < g4) {
            int b4 = i4 - (i5 - this.f5888b.b(i5));
            if (b4 == 0) {
                while (this.f5888b.d(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += b4;
        }
        return -1;
    }

    public View i(int i4) {
        return this.f5887a.a(i4);
    }

    public int j() {
        return this.f5887a.g();
    }

    public void k(View view) {
        int k4 = this.f5887a.k(view);
        if (k4 >= 0) {
            this.f5888b.h(k4);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void l(View view) {
        this.f5889c.add(view);
        this.f5887a.b(view);
    }

    public int m(View view) {
        int k4 = this.f5887a.k(view);
        if (k4 != -1 && !this.f5888b.d(k4)) {
            return k4 - this.f5888b.b(k4);
        }
        return -1;
    }

    public boolean n(View view) {
        return this.f5889c.contains(view);
    }

    public void o() {
        this.f5888b.g();
        for (int size = this.f5889c.size() - 1; size >= 0; size--) {
            this.f5887a.e((View) this.f5889c.get(size));
            this.f5889c.remove(size);
        }
        this.f5887a.i();
    }

    public void p(View view) {
        int k4 = this.f5887a.k(view);
        if (k4 >= 0) {
            if (this.f5888b.f(k4)) {
                t(view);
            }
            this.f5887a.h(k4);
        }
    }

    public void q(int i4) {
        int h4 = h(i4);
        View a4 = this.f5887a.a(h4);
        if (a4 != null) {
            if (this.f5888b.f(h4)) {
                t(a4);
            }
            this.f5887a.h(h4);
        }
    }

    public boolean r(View view) {
        int k4 = this.f5887a.k(view);
        if (k4 == -1) {
            t(view);
            return true;
        } else if (!this.f5888b.d(k4)) {
            return false;
        } else {
            this.f5888b.f(k4);
            t(view);
            this.f5887a.h(k4);
            return true;
        }
    }

    public void s(View view) {
        int k4 = this.f5887a.k(view);
        if (k4 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f5888b.d(k4)) {
            this.f5888b.a(k4);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f5889c.remove(view)) {
            return false;
        }
        this.f5887a.e(view);
        return true;
    }

    public String toString() {
        return this.f5888b.toString() + ", hidden list:" + this.f5889c.size();
    }
}
