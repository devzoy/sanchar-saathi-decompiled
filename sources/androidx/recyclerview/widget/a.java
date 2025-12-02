package androidx.recyclerview.widget;

import R.d;
import R.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;

public class a implements h.a {

    /* renamed from: a  reason: collision with root package name */
    public d f5875a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5876b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f5877c;

    /* renamed from: d  reason: collision with root package name */
    public final C0098a f5878d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f5879e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5880f;

    /* renamed from: g  reason: collision with root package name */
    public final h f5881g;

    /* renamed from: h  reason: collision with root package name */
    public int f5882h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    public interface C0098a {
        void a(int i4, int i5);

        void b(b bVar);

        RecyclerView.C c(int i4);

        void d(int i4, int i5);

        void e(int i4, int i5);

        void f(int i4, int i5);

        void g(b bVar);

        void h(int i4, int i5, Object obj);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f5883a;

        /* renamed from: b  reason: collision with root package name */
        public int f5884b;

        /* renamed from: c  reason: collision with root package name */
        public Object f5885c;

        /* renamed from: d  reason: collision with root package name */
        public int f5886d;

        public b(int i4, int i5, int i6, Object obj) {
            this.f5883a = i4;
            this.f5884b = i5;
            this.f5886d = i6;
            this.f5885c = obj;
        }

        public String a() {
            int i4 = this.f5883a;
            return i4 != 1 ? i4 != 2 ? i4 != 4 ? i4 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i4 = this.f5883a;
            if (i4 != bVar.f5883a) {
                return false;
            }
            if (i4 == 8 && Math.abs(this.f5886d - this.f5884b) == 1 && this.f5886d == bVar.f5884b && this.f5884b == bVar.f5886d) {
                return true;
            }
            if (this.f5886d != bVar.f5886d || this.f5884b != bVar.f5884b) {
                return false;
            }
            Object obj2 = this.f5885c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f5885c)) {
                    return false;
                }
            } else if (bVar.f5885c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f5883a * 31) + this.f5884b) * 31) + this.f5886d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f5884b + "c:" + this.f5886d + ",p:" + this.f5885c + "]";
        }
    }

    public a(C0098a aVar) {
        this(aVar, false);
    }

    public void a(b bVar) {
        if (!this.f5880f) {
            bVar.f5885c = null;
            this.f5875a.a(bVar);
        }
    }

    public b b(int i4, int i5, int i6, Object obj) {
        b bVar = (b) this.f5875a.b();
        if (bVar == null) {
            return new b(i4, i5, i6, obj);
        }
        bVar.f5883a = i4;
        bVar.f5884b = i5;
        bVar.f5886d = i6;
        bVar.f5885c = obj;
        return bVar;
    }

    public final void c(b bVar) {
        r(bVar);
    }

    public final void d(b bVar) {
        r(bVar);
    }

    public int e(int i4) {
        int size = this.f5876b.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) this.f5876b.get(i5);
            int i6 = bVar.f5883a;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i7 = bVar.f5884b;
                    if (i7 <= i4) {
                        int i8 = bVar.f5886d;
                        if (i7 + i8 > i4) {
                            return -1;
                        }
                        i4 -= i8;
                    } else {
                        continue;
                    }
                } else if (i6 == 8) {
                    int i9 = bVar.f5884b;
                    if (i9 == i4) {
                        i4 = bVar.f5886d;
                    } else {
                        if (i9 < i4) {
                            i4--;
                        }
                        if (bVar.f5886d <= i4) {
                            i4++;
                        }
                    }
                }
            } else if (bVar.f5884b <= i4) {
                i4 += bVar.f5886d;
            }
        }
        return i4;
    }

    public final void f(b bVar) {
        char c4;
        boolean z4;
        boolean z5;
        int i4 = bVar.f5884b;
        int i5 = bVar.f5886d + i4;
        char c5 = 65535;
        int i6 = i4;
        int i7 = 0;
        while (i6 < i5) {
            if (this.f5878d.c(i6) != null || h(i6)) {
                if (c5 == 0) {
                    k(b(2, i4, i7, (Object) null));
                    z5 = true;
                } else {
                    z5 = false;
                }
                c4 = 1;
            } else {
                if (c5 == 1) {
                    r(b(2, i4, i7, (Object) null));
                    z4 = true;
                } else {
                    z4 = false;
                }
                c4 = 0;
            }
            if (z4) {
                i6 -= i7;
                i5 -= i7;
                i7 = 1;
            } else {
                i7++;
            }
            i6++;
            c5 = c4;
        }
        if (i7 != bVar.f5886d) {
            a(bVar);
            bVar = b(2, i4, i7, (Object) null);
        }
        if (c5 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    public final void g(b bVar) {
        int i4 = bVar.f5884b;
        int i5 = bVar.f5886d + i4;
        int i6 = 0;
        boolean z4 = true;
        int i7 = i4;
        while (i4 < i5) {
            if (this.f5878d.c(i4) != null || h(i4)) {
                if (!z4) {
                    k(b(4, i7, i6, bVar.f5885c));
                    i7 = i4;
                    i6 = 0;
                }
                z4 = true;
            } else {
                if (z4) {
                    r(b(4, i7, i6, bVar.f5885c));
                    i7 = i4;
                    i6 = 0;
                }
                z4 = false;
            }
            i6++;
            i4++;
        }
        if (i6 != bVar.f5886d) {
            Object obj = bVar.f5885c;
            a(bVar);
            bVar = b(4, i7, i6, obj);
        }
        if (!z4) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    public final boolean h(int i4) {
        int size = this.f5877c.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) this.f5877c.get(i5);
            int i6 = bVar.f5883a;
            if (i6 == 8) {
                if (n(bVar.f5886d, i5 + 1) == i4) {
                    return true;
                }
            } else if (i6 == 1) {
                int i7 = bVar.f5884b;
                int i8 = bVar.f5886d + i7;
                while (i7 < i8) {
                    if (n(i7, i5 + 1) == i4) {
                        return true;
                    }
                    i7++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void i() {
        int size = this.f5877c.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f5878d.b((b) this.f5877c.get(i4));
        }
        t(this.f5877c);
        this.f5882h = 0;
    }

    public void j() {
        i();
        int size = this.f5876b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) this.f5876b.get(i4);
            int i5 = bVar.f5883a;
            if (i5 == 1) {
                this.f5878d.b(bVar);
                this.f5878d.e(bVar.f5884b, bVar.f5886d);
            } else if (i5 == 2) {
                this.f5878d.b(bVar);
                this.f5878d.f(bVar.f5884b, bVar.f5886d);
            } else if (i5 == 4) {
                this.f5878d.b(bVar);
                this.f5878d.h(bVar.f5884b, bVar.f5886d, bVar.f5885c);
            } else if (i5 == 8) {
                this.f5878d.b(bVar);
                this.f5878d.a(bVar.f5884b, bVar.f5886d);
            }
            Runnable runnable = this.f5879e;
            if (runnable != null) {
                runnable.run();
            }
        }
        t(this.f5876b);
        this.f5882h = 0;
    }

    public final void k(b bVar) {
        int i4;
        int i5 = bVar.f5883a;
        if (i5 == 1 || i5 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v4 = v(bVar.f5884b, i5);
        int i6 = bVar.f5884b;
        int i7 = bVar.f5883a;
        if (i7 == 2) {
            i4 = 0;
        } else if (i7 == 4) {
            i4 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i8 = 1;
        for (int i9 = 1; i9 < bVar.f5886d; i9++) {
            int v5 = v(bVar.f5884b + (i4 * i9), bVar.f5883a);
            int i10 = bVar.f5883a;
            if (i10 == 2 ? v5 != v4 : !(i10 == 4 && v5 == v4 + 1)) {
                b b4 = b(i10, v4, i8, bVar.f5885c);
                l(b4, i6);
                a(b4);
                if (bVar.f5883a == 4) {
                    i6 += i8;
                }
                i8 = 1;
                v4 = v5;
            } else {
                i8++;
            }
        }
        Object obj = bVar.f5885c;
        a(bVar);
        if (i8 > 0) {
            b b5 = b(bVar.f5883a, v4, i8, obj);
            l(b5, i6);
            a(b5);
        }
    }

    public void l(b bVar, int i4) {
        this.f5878d.g(bVar);
        int i5 = bVar.f5883a;
        if (i5 == 2) {
            this.f5878d.f(i4, bVar.f5886d);
        } else if (i5 == 4) {
            this.f5878d.h(i4, bVar.f5886d, bVar.f5885c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public int m(int i4) {
        return n(i4, 0);
    }

    public int n(int i4, int i5) {
        int size = this.f5877c.size();
        while (i5 < size) {
            b bVar = (b) this.f5877c.get(i5);
            int i6 = bVar.f5883a;
            if (i6 == 8) {
                int i7 = bVar.f5884b;
                if (i7 == i4) {
                    i4 = bVar.f5886d;
                } else {
                    if (i7 < i4) {
                        i4--;
                    }
                    if (bVar.f5886d <= i4) {
                        i4++;
                    }
                }
            } else {
                int i8 = bVar.f5884b;
                if (i8 > i4) {
                    continue;
                } else if (i6 == 2) {
                    int i9 = bVar.f5886d;
                    if (i4 < i8 + i9) {
                        return -1;
                    }
                    i4 -= i9;
                } else if (i6 == 1) {
                    i4 += bVar.f5886d;
                }
            }
            i5++;
        }
        return i4;
    }

    public boolean o(int i4) {
        return (i4 & this.f5882h) != 0;
    }

    public boolean p() {
        return this.f5876b.size() > 0;
    }

    public boolean q() {
        return !this.f5877c.isEmpty() && !this.f5876b.isEmpty();
    }

    public final void r(b bVar) {
        this.f5877c.add(bVar);
        int i4 = bVar.f5883a;
        if (i4 == 1) {
            this.f5878d.e(bVar.f5884b, bVar.f5886d);
        } else if (i4 == 2) {
            this.f5878d.d(bVar.f5884b, bVar.f5886d);
        } else if (i4 == 4) {
            this.f5878d.h(bVar.f5884b, bVar.f5886d, bVar.f5885c);
        } else if (i4 == 8) {
            this.f5878d.a(bVar.f5884b, bVar.f5886d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void s() {
        this.f5881g.b(this.f5876b);
        int size = this.f5876b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) this.f5876b.get(i4);
            int i5 = bVar.f5883a;
            if (i5 == 1) {
                c(bVar);
            } else if (i5 == 2) {
                f(bVar);
            } else if (i5 == 4) {
                g(bVar);
            } else if (i5 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f5879e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f5876b.clear();
    }

    public void t(List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            a((b) list.get(i4));
        }
        list.clear();
    }

    public void u() {
        t(this.f5876b);
        t(this.f5877c);
        this.f5882h = 0;
    }

    public final int v(int i4, int i5) {
        int i6;
        int i7;
        for (int size = this.f5877c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f5877c.get(size);
            int i8 = bVar.f5883a;
            if (i8 == 8) {
                int i9 = bVar.f5884b;
                int i10 = bVar.f5886d;
                if (i9 < i10) {
                    i7 = i9;
                    i6 = i10;
                } else {
                    i6 = i9;
                    i7 = i10;
                }
                if (i4 < i7 || i4 > i6) {
                    if (i4 < i9) {
                        if (i5 == 1) {
                            bVar.f5884b = i9 + 1;
                            bVar.f5886d = i10 + 1;
                        } else if (i5 == 2) {
                            bVar.f5884b = i9 - 1;
                            bVar.f5886d = i10 - 1;
                        }
                    }
                } else if (i7 == i9) {
                    if (i5 == 1) {
                        bVar.f5886d = i10 + 1;
                    } else if (i5 == 2) {
                        bVar.f5886d = i10 - 1;
                    }
                    i4++;
                } else {
                    if (i5 == 1) {
                        bVar.f5884b = i9 + 1;
                    } else if (i5 == 2) {
                        bVar.f5884b = i9 - 1;
                    }
                    i4--;
                }
            } else {
                int i11 = bVar.f5884b;
                if (i11 <= i4) {
                    if (i8 == 1) {
                        i4 -= bVar.f5886d;
                    } else if (i8 == 2) {
                        i4 += bVar.f5886d;
                    }
                } else if (i5 == 1) {
                    bVar.f5884b = i11 + 1;
                } else if (i5 == 2) {
                    bVar.f5884b = i11 - 1;
                }
            }
        }
        for (int size2 = this.f5877c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f5877c.get(size2);
            if (bVar2.f5883a == 8) {
                int i12 = bVar2.f5886d;
                if (i12 == bVar2.f5884b || i12 < 0) {
                    this.f5877c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f5886d <= 0) {
                this.f5877c.remove(size2);
                a(bVar2);
            }
        }
        return i4;
    }

    public a(C0098a aVar, boolean z4) {
        this.f5875a = new e(30);
        this.f5876b = new ArrayList();
        this.f5877c = new ArrayList();
        this.f5882h = 0;
        this.f5878d = aVar;
        this.f5880f = z4;
        this.f5881g = new h(this);
    }
}
