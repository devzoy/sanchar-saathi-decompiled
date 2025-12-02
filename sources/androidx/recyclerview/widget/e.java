package androidx.recyclerview.widget;

import O.g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class e implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public static final ThreadLocal f5979i = new ThreadLocal();

    /* renamed from: j  reason: collision with root package name */
    public static Comparator f5980j = new a();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f5981e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public long f5982f;

    /* renamed from: g  reason: collision with root package name */
    public long f5983g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f5984h = new ArrayList();

    public static class a implements Comparator {
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f5992d;
            if ((recyclerView == null) != (cVar2.f5992d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z4 = cVar.f5989a;
            if (z4 != cVar2.f5989a) {
                return z4 ? -1 : 1;
            }
            int i4 = cVar2.f5990b - cVar.f5990b;
            if (i4 != 0) {
                return i4;
            }
            int i5 = cVar.f5991c - cVar2.f5991c;
            if (i5 != 0) {
                return i5;
            }
            return 0;
        }
    }

    public static class b implements RecyclerView.o.c {

        /* renamed from: a  reason: collision with root package name */
        public int f5985a;

        /* renamed from: b  reason: collision with root package name */
        public int f5986b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f5987c;

        /* renamed from: d  reason: collision with root package name */
        public int f5988d;

        public void a(int i4, int i5) {
            if (i4 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i5 >= 0) {
                int i6 = this.f5988d;
                int i7 = i6 * 2;
                int[] iArr = this.f5987c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f5987c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i7 >= iArr.length) {
                    int[] iArr3 = new int[(i6 * 4)];
                    this.f5987c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f5987c;
                iArr4[i7] = i4;
                iArr4[i7 + 1] = i5;
                this.f5988d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public void b() {
            int[] iArr = this.f5987c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5988d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z4) {
            this.f5988d = 0;
            int[] iArr = this.f5987c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f5677o;
            if (recyclerView.f5675n != null && oVar != null && oVar.u0()) {
                if (z4) {
                    if (!recyclerView.f5659f.p()) {
                        oVar.p(recyclerView.f5675n.c(), this);
                    }
                } else if (!recyclerView.l0()) {
                    oVar.o(this.f5985a, this.f5986b, recyclerView.f5666i0, this);
                }
                int i4 = this.f5988d;
                if (i4 > oVar.f5755m) {
                    oVar.f5755m = i4;
                    oVar.f5756n = z4;
                    recyclerView.f5655d.K();
                }
            }
        }

        public boolean d(int i4) {
            if (this.f5987c != null) {
                int i5 = this.f5988d * 2;
                for (int i6 = 0; i6 < i5; i6 += 2) {
                    if (this.f5987c[i6] == i4) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i4, int i5) {
            this.f5985a = i4;
            this.f5986b = i5;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5989a;

        /* renamed from: b  reason: collision with root package name */
        public int f5990b;

        /* renamed from: c  reason: collision with root package name */
        public int f5991c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f5992d;

        /* renamed from: e  reason: collision with root package name */
        public int f5993e;

        public void a() {
            this.f5989a = false;
            this.f5990b = 0;
            this.f5991c = 0;
            this.f5992d = null;
            this.f5993e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i4) {
        int j4 = recyclerView.f5661g.j();
        for (int i5 = 0; i5 < j4; i5++) {
            RecyclerView.C f02 = RecyclerView.f0(recyclerView.f5661g.i(i5));
            if (f02.f5709c == i4 && !f02.t()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.f5981e.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f5981e.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView = (RecyclerView) this.f5981e.get(i5);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f5664h0.c(recyclerView, false);
                i4 += recyclerView.f5664h0.f5988d;
            }
        }
        this.f5984h.ensureCapacity(i4);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f5981e.get(i7);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f5664h0;
                int abs = Math.abs(bVar.f5985a) + Math.abs(bVar.f5986b);
                for (int i8 = 0; i8 < bVar.f5988d * 2; i8 += 2) {
                    if (i6 >= this.f5984h.size()) {
                        cVar = new c();
                        this.f5984h.add(cVar);
                    } else {
                        cVar = (c) this.f5984h.get(i6);
                    }
                    int[] iArr = bVar.f5987c;
                    int i9 = iArr[i8 + 1];
                    cVar.f5989a = i9 <= abs;
                    cVar.f5990b = abs;
                    cVar.f5991c = i9;
                    cVar.f5992d = recyclerView2;
                    cVar.f5993e = iArr[i8];
                    i6++;
                }
            }
        }
        Collections.sort(this.f5984h, f5980j);
    }

    public final void c(c cVar, long j4) {
        RecyclerView.C i4 = i(cVar.f5992d, cVar.f5993e, cVar.f5989a ? Long.MAX_VALUE : j4);
        if (i4 != null && i4.f5708b != null && i4.s() && !i4.t()) {
            h((RecyclerView) i4.f5708b.get(), j4);
        }
    }

    public final void d(long j4) {
        int i4 = 0;
        while (i4 < this.f5984h.size()) {
            c cVar = (c) this.f5984h.get(i4);
            if (cVar.f5992d != null) {
                c(cVar, j4);
                cVar.a();
                i4++;
            } else {
                return;
            }
        }
    }

    public void f(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.isAttachedToWindow() && this.f5982f == 0) {
            this.f5982f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f5664h0.e(i4, i5);
    }

    public void g(long j4) {
        b();
        d(j4);
    }

    public final void h(RecyclerView recyclerView, long j4) {
        if (recyclerView != null) {
            if (recyclerView.f5632E && recyclerView.f5661g.j() != 0) {
                recyclerView.T0();
            }
            b bVar = recyclerView.f5664h0;
            bVar.c(recyclerView, true);
            if (bVar.f5988d != 0) {
                try {
                    g.a("RV Nested Prefetch");
                    recyclerView.f5666i0.f(recyclerView.f5675n);
                    for (int i4 = 0; i4 < bVar.f5988d * 2; i4 += 2) {
                        i(recyclerView, bVar.f5987c[i4], j4);
                    }
                } finally {
                    g.b();
                }
            }
        }
    }

    public final RecyclerView.C i(RecyclerView recyclerView, int i4, long j4) {
        if (e(recyclerView, i4)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f5655d;
        try {
            recyclerView.F0();
            RecyclerView.C I4 = uVar.I(i4, false, j4);
            if (I4 != null) {
                if (!I4.s() || I4.t()) {
                    uVar.a(I4, false);
                } else {
                    uVar.B(I4.f5707a);
                }
            }
            return I4;
        } finally {
            recyclerView.H0(false);
        }
    }

    public void j(RecyclerView recyclerView) {
        this.f5981e.remove(recyclerView);
    }

    public void run() {
        try {
            g.a("RV Prefetch");
            if (!this.f5981e.isEmpty()) {
                int size = this.f5981e.size();
                long j4 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    RecyclerView recyclerView = (RecyclerView) this.f5981e.get(i4);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j4 = Math.max(recyclerView.getDrawingTime(), j4);
                    }
                }
                if (j4 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j4) + this.f5983g);
                    this.f5982f = 0;
                    g.b();
                }
            }
        } finally {
            this.f5982f = 0;
            g.b();
        }
    }
}
