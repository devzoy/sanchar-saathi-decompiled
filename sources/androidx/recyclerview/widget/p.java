package androidx.recyclerview.widget;

import R.e;
import androidx.recyclerview.widget.RecyclerView;
import v.d;
import v.g;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public final g f6035a = new g();

    /* renamed from: b  reason: collision with root package name */
    public final d f6036b = new d();

    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static R.d f6037d = new e(20);

        /* renamed from: a  reason: collision with root package name */
        public int f6038a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.l.b f6039b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.l.b f6040c;

        public static void a() {
            do {
            } while (f6037d.b() != null);
        }

        public static a b() {
            a aVar = (a) f6037d.b();
            return aVar == null ? new a() : aVar;
        }

        public static void c(a aVar) {
            aVar.f6038a = 0;
            aVar.f6039b = null;
            aVar.f6040c = null;
            f6037d.a(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.C c4);

        void b(RecyclerView.C c4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void c(RecyclerView.C c4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void d(RecyclerView.C c4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);
    }

    public void a(RecyclerView.C c4, RecyclerView.l.b bVar) {
        a aVar = (a) this.f6035a.get(c4);
        if (aVar == null) {
            aVar = a.b();
            this.f6035a.put(c4, aVar);
        }
        aVar.f6038a |= 2;
        aVar.f6039b = bVar;
    }

    public void b(RecyclerView.C c4) {
        a aVar = (a) this.f6035a.get(c4);
        if (aVar == null) {
            aVar = a.b();
            this.f6035a.put(c4, aVar);
        }
        aVar.f6038a |= 1;
    }

    public void c(long j4, RecyclerView.C c4) {
        this.f6036b.m(j4, c4);
    }

    public void d(RecyclerView.C c4, RecyclerView.l.b bVar) {
        a aVar = (a) this.f6035a.get(c4);
        if (aVar == null) {
            aVar = a.b();
            this.f6035a.put(c4, aVar);
        }
        aVar.f6040c = bVar;
        aVar.f6038a |= 8;
    }

    public void e(RecyclerView.C c4, RecyclerView.l.b bVar) {
        a aVar = (a) this.f6035a.get(c4);
        if (aVar == null) {
            aVar = a.b();
            this.f6035a.put(c4, aVar);
        }
        aVar.f6039b = bVar;
        aVar.f6038a |= 4;
    }

    public void f() {
        this.f6035a.clear();
        this.f6036b.a();
    }

    public RecyclerView.C g(long j4) {
        return (RecyclerView.C) this.f6036b.g(j4);
    }

    public boolean h(RecyclerView.C c4) {
        a aVar = (a) this.f6035a.get(c4);
        return (aVar == null || (aVar.f6038a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.C c4) {
        a aVar = (a) this.f6035a.get(c4);
        return (aVar == null || (aVar.f6038a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.C c4) {
        p(c4);
    }

    public final RecyclerView.l.b l(RecyclerView.C c4, int i4) {
        a aVar;
        RecyclerView.l.b bVar;
        int f4 = this.f6035a.f(c4);
        if (f4 >= 0 && (aVar = (a) this.f6035a.m(f4)) != null) {
            int i5 = aVar.f6038a;
            if ((i5 & i4) != 0) {
                int i6 = (~i4) & i5;
                aVar.f6038a = i6;
                if (i4 == 4) {
                    bVar = aVar.f6039b;
                } else if (i4 == 8) {
                    bVar = aVar.f6040c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i6 & 12) == 0) {
                    this.f6035a.k(f4);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    public RecyclerView.l.b m(RecyclerView.C c4) {
        return l(c4, 8);
    }

    public RecyclerView.l.b n(RecyclerView.C c4) {
        return l(c4, 4);
    }

    public void o(b bVar) {
        for (int size = this.f6035a.size() - 1; size >= 0; size--) {
            RecyclerView.C c4 = (RecyclerView.C) this.f6035a.i(size);
            a aVar = (a) this.f6035a.k(size);
            int i4 = aVar.f6038a;
            if ((i4 & 3) == 3) {
                bVar.a(c4);
            } else if ((i4 & 1) != 0) {
                RecyclerView.l.b bVar2 = aVar.f6039b;
                if (bVar2 == null) {
                    bVar.a(c4);
                } else {
                    bVar.c(c4, bVar2, aVar.f6040c);
                }
            } else if ((i4 & 14) == 14) {
                bVar.b(c4, aVar.f6039b, aVar.f6040c);
            } else if ((i4 & 12) == 12) {
                bVar.d(c4, aVar.f6039b, aVar.f6040c);
            } else if ((i4 & 4) != 0) {
                bVar.c(c4, aVar.f6039b, (RecyclerView.l.b) null);
            } else if ((i4 & 8) != 0) {
                bVar.b(c4, aVar.f6039b, aVar.f6040c);
            }
            a.c(aVar);
        }
    }

    public void p(RecyclerView.C c4) {
        a aVar = (a) this.f6035a.get(c4);
        if (aVar != null) {
            aVar.f6038a &= -2;
        }
    }

    public void q(RecyclerView.C c4) {
        int p4 = this.f6036b.p() - 1;
        while (true) {
            if (p4 < 0) {
                break;
            } else if (c4 == this.f6036b.q(p4)) {
                this.f6036b.o(p4);
                break;
            } else {
                p4--;
            }
        }
        a aVar = (a) this.f6035a.remove(c4);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
