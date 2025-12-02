package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.b;
import androidx.datastore.preferences.protobuf.r0;
import java.util.List;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: androidx.datastore.preferences.protobuf.i  reason: case insensitive filesystem */
public final class C0357i implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public final C0356h f5129a;

    /* renamed from: b  reason: collision with root package name */
    public int f5130b;

    /* renamed from: c  reason: collision with root package name */
    public int f5131c;

    /* renamed from: d  reason: collision with root package name */
    public int f5132d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5133a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.r0$b[] r0 = androidx.datastore.preferences.protobuf.r0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5133a = r0
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f5133a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0357i.a.<clinit>():void");
        }
    }

    public C0357i(C0356h hVar) {
        C0356h hVar2 = (C0356h) C0372y.b(hVar, "input");
        this.f5129a = hVar2;
        hVar2.f5107d = this;
    }

    public static C0357i O(C0356h hVar) {
        C0357i iVar = hVar.f5107d;
        return iVar != null ? iVar : new C0357i(hVar);
    }

    public void A(List list, f0 f0Var, C0363o oVar) {
        int C4;
        if (r0.b(this.f5130b) == 3) {
            int i4 = this.f5130b;
            do {
                list.add(S(f0Var, oVar));
                if (!this.f5129a.f() && this.f5132d == 0) {
                    C4 = this.f5129a.C();
                } else {
                    return;
                }
            } while (C4 == i4);
            this.f5132d = C4;
            return;
        }
        throw C0373z.e();
    }

    public boolean B() {
        int i4;
        if (this.f5129a.f() || (i4 = this.f5130b) == this.f5131c) {
            return false;
        }
        return this.f5129a.F(i4);
    }

    public int C() {
        X(5);
        return this.f5129a.w();
    }

    public void D(List list) {
        int C4;
        if (r0.b(this.f5130b) == 2) {
            do {
                list.add(w());
                if (!this.f5129a.f()) {
                    C4 = this.f5129a.C();
                } else {
                    return;
                }
            } while (C4 == this.f5130b);
            this.f5132d = C4;
            return;
        }
        throw C0373z.e();
    }

    public void E(List list) {
        int C4;
        if (list instanceof C0360l) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 1) {
                this.f5129a.p();
                throw null;
            } else if (b4 != 2) {
                throw C0373z.e();
            } else {
                Z(this.f5129a.D());
                this.f5129a.e();
                this.f5129a.p();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 1) {
                do {
                    list.add(Double.valueOf(this.f5129a.p()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else if (b5 == 2) {
                int D4 = this.f5129a.D();
                Z(D4);
                int e4 = this.f5129a.e() + D4;
                do {
                    list.add(Double.valueOf(this.f5129a.p()));
                } while (this.f5129a.e() < e4);
            } else {
                throw C0373z.e();
            }
        }
    }

    public void F(List list, f0 f0Var, C0363o oVar) {
        int C4;
        if (r0.b(this.f5130b) == 2) {
            int i4 = this.f5130b;
            do {
                list.add(T(f0Var, oVar));
                if (!this.f5129a.f() && this.f5132d == 0) {
                    C4 = this.f5129a.C();
                } else {
                    return;
                }
            } while (C4 == i4);
            this.f5132d = C4;
            return;
        }
        throw C0373z.e();
    }

    public void G(List list) {
        int C4;
        if (list instanceof G) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 0) {
                this.f5129a.v();
                throw null;
            } else if (b4 != 2) {
                throw C0373z.e();
            } else {
                this.f5129a.D();
                this.f5129a.e();
                this.f5129a.v();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 0) {
                do {
                    list.add(Long.valueOf(this.f5129a.v()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else if (b5 == 2) {
                int e4 = this.f5129a.e() + this.f5129a.D();
                do {
                    list.add(Long.valueOf(this.f5129a.v()));
                } while (this.f5129a.e() < e4);
                W(e4);
            } else {
                throw C0373z.e();
            }
        }
    }

    public void H(List list) {
        int C4;
        if (list instanceof G) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 1) {
                this.f5129a.x();
                throw null;
            } else if (b4 != 2) {
                throw C0373z.e();
            } else {
                Z(this.f5129a.D());
                this.f5129a.e();
                this.f5129a.x();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 1) {
                do {
                    list.add(Long.valueOf(this.f5129a.x()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else if (b5 == 2) {
                int D4 = this.f5129a.D();
                Z(D4);
                int e4 = this.f5129a.e() + D4;
                do {
                    list.add(Long.valueOf(this.f5129a.x()));
                } while (this.f5129a.e() < e4);
            } else {
                throw C0373z.e();
            }
        }
    }

    public long I() {
        X(0);
        return this.f5129a.v();
    }

    public String J() {
        X(2);
        return this.f5129a.B();
    }

    public void K(Object obj, f0 f0Var, C0363o oVar) {
        X(2);
        Q(obj, f0Var, oVar);
    }

    public void L(List list) {
        int C4;
        if (list instanceof G) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 1) {
                this.f5129a.s();
                throw null;
            } else if (b4 != 2) {
                throw C0373z.e();
            } else {
                Z(this.f5129a.D());
                this.f5129a.e();
                this.f5129a.s();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 1) {
                do {
                    list.add(Long.valueOf(this.f5129a.s()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else if (b5 == 2) {
                int D4 = this.f5129a.D();
                Z(D4);
                int e4 = this.f5129a.e() + D4;
                do {
                    list.add(Long.valueOf(this.f5129a.s()));
                } while (this.f5129a.e() < e4);
            } else {
                throw C0373z.e();
            }
        }
    }

    public void M(List list) {
        int C4;
        if (list instanceof C0371x) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 0) {
                this.f5129a.u();
                throw null;
            } else if (b4 != 2) {
                throw C0373z.e();
            } else {
                this.f5129a.D();
                this.f5129a.e();
                this.f5129a.u();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5129a.u()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else if (b5 == 2) {
                int e4 = this.f5129a.e() + this.f5129a.D();
                do {
                    list.add(Integer.valueOf(this.f5129a.u()));
                } while (this.f5129a.e() < e4);
                W(e4);
            } else {
                throw C0373z.e();
            }
        }
    }

    public void N(List list) {
        int C4;
        if (list instanceof C0371x) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 0) {
                this.f5129a.q();
                throw null;
            } else if (b4 != 2) {
                throw C0373z.e();
            } else {
                this.f5129a.D();
                this.f5129a.e();
                this.f5129a.q();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5129a.q()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else if (b5 == 2) {
                int e4 = this.f5129a.e() + this.f5129a.D();
                do {
                    list.add(Integer.valueOf(this.f5129a.q()));
                } while (this.f5129a.e() < e4);
                W(e4);
            } else {
                throw C0373z.e();
            }
        }
    }

    public final void P(Object obj, f0 f0Var, C0363o oVar) {
        int i4 = this.f5131c;
        this.f5131c = r0.c(r0.a(this.f5130b), 4);
        try {
            f0Var.f(obj, this, oVar);
            if (this.f5130b != this.f5131c) {
                throw C0373z.h();
            }
        } finally {
            this.f5131c = i4;
        }
    }

    public final void Q(Object obj, f0 f0Var, C0363o oVar) {
        int D4 = this.f5129a.D();
        C0356h hVar = this.f5129a;
        if (hVar.f5104a < hVar.f5105b) {
            int m4 = hVar.m(D4);
            this.f5129a.f5104a++;
            f0Var.f(obj, this, oVar);
            this.f5129a.a(0);
            C0356h hVar2 = this.f5129a;
            hVar2.f5104a--;
            hVar2.l(m4);
            return;
        }
        throw C0373z.i();
    }

    public final Object R(r0.b bVar, Class cls, C0363o oVar) {
        switch (a.f5133a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(q());
            case 2:
                return w();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(c());
            case 5:
                return Integer.valueOf(p());
            case 6:
                return Long.valueOf(h());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(z());
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                return Long.valueOf(I());
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                return U(cls, oVar);
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                return Integer.valueOf(C());
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                return Long.valueOf(t());
            case 13:
                return Integer.valueOf(j());
            case 14:
                return Long.valueOf(l());
            case 15:
                return J();
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                return Integer.valueOf(y());
            case 17:
                return Long.valueOf(f());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final Object S(f0 f0Var, C0363o oVar) {
        Object d4 = f0Var.d();
        P(d4, f0Var, oVar);
        f0Var.h(d4);
        return d4;
    }

    public final Object T(f0 f0Var, C0363o oVar) {
        Object d4 = f0Var.d();
        Q(d4, f0Var, oVar);
        f0Var.h(d4);
        return d4;
    }

    public Object U(Class cls, C0363o oVar) {
        X(2);
        return T(b0.a().c(cls), oVar);
    }

    public void V(List list, boolean z4) {
        int C4;
        int C5;
        if (r0.b(this.f5130b) != 2) {
            throw C0373z.e();
        } else if (!(list instanceof C) || z4) {
            do {
                list.add(z4 ? J() : o());
                if (!this.f5129a.f()) {
                    C4 = this.f5129a.C();
                } else {
                    return;
                }
            } while (C4 == this.f5130b);
            this.f5132d = C4;
        } else {
            C c4 = (C) list;
            do {
                c4.o(w());
                if (!this.f5129a.f()) {
                    C5 = this.f5129a.C();
                } else {
                    return;
                }
            } while (C5 == this.f5130b);
            this.f5132d = C5;
        }
    }

    public final void W(int i4) {
        if (this.f5129a.e() != i4) {
            throw C0373z.m();
        }
    }

    public final void X(int i4) {
        if (r0.b(this.f5130b) != i4) {
            throw C0373z.e();
        }
    }

    public final void Y(int i4) {
        if ((i4 & 3) != 0) {
            throw C0373z.h();
        }
    }

    public final void Z(int i4) {
        if ((i4 & 7) != 0) {
            throw C0373z.h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (B() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        throw new androidx.datastore.preferences.protobuf.C0373z(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.Map r8, androidx.datastore.preferences.protobuf.I.a r9, androidx.datastore.preferences.protobuf.C0363o r10) {
        /*
            r7 = this;
            r0 = 2
            r7.X(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f5129a
            int r1 = r1.D()
            androidx.datastore.preferences.protobuf.h r2 = r7.f5129a
            int r1 = r2.m(r1)
            java.lang.Object r2 = r9.f5040b
            java.lang.Object r3 = r9.f5042d
        L_0x0014:
            int r4 = r7.r()     // Catch:{ all -> 0x003a }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005e
            androidx.datastore.preferences.protobuf.h r5 = r7.f5129a     // Catch:{ all -> 0x003a }
            boolean r5 = r5.f()     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0026
            goto L_0x005e
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0049
            if (r4 == r0) goto L_0x003c
            boolean r4 = r7.B()     // Catch:{ a -> 0x0051 }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            androidx.datastore.preferences.protobuf.z r4 = new androidx.datastore.preferences.protobuf.z     // Catch:{ a -> 0x0051 }
            r4.<init>((java.lang.String) r6)     // Catch:{ a -> 0x0051 }
            throw r4     // Catch:{ a -> 0x0051 }
        L_0x003a:
            r8 = move-exception
            goto L_0x0067
        L_0x003c:
            androidx.datastore.preferences.protobuf.r0$b r4 = r9.f5041c     // Catch:{ a -> 0x0051 }
            java.lang.Object r5 = r9.f5042d     // Catch:{ a -> 0x0051 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x0051 }
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch:{ a -> 0x0051 }
            goto L_0x0014
        L_0x0049:
            androidx.datastore.preferences.protobuf.r0$b r4 = r9.f5039a     // Catch:{ a -> 0x0051 }
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch:{ a -> 0x0051 }
            goto L_0x0014
        L_0x0051:
            boolean r4 = r7.B()     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x0058
            goto L_0x0014
        L_0x0058:
            androidx.datastore.preferences.protobuf.z r8 = new androidx.datastore.preferences.protobuf.z     // Catch:{ all -> 0x003a }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x003a }
            throw r8     // Catch:{ all -> 0x003a }
        L_0x005e:
            r8.put(r2, r3)     // Catch:{ all -> 0x003a }
            androidx.datastore.preferences.protobuf.h r8 = r7.f5129a
            r8.l(r1)
            return
        L_0x0067:
            androidx.datastore.preferences.protobuf.h r9 = r7.f5129a
            r9.l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0357i.a(java.util.Map, androidx.datastore.preferences.protobuf.I$a, androidx.datastore.preferences.protobuf.o):void");
    }

    public void b(List list) {
        int C4;
        if (list instanceof C0371x) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 0) {
                this.f5129a.y();
                throw null;
            } else if (b4 != 2) {
                throw C0373z.e();
            } else {
                this.f5129a.D();
                this.f5129a.e();
                this.f5129a.y();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5129a.y()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else if (b5 == 2) {
                int e4 = this.f5129a.e() + this.f5129a.D();
                do {
                    list.add(Integer.valueOf(this.f5129a.y()));
                } while (this.f5129a.e() < e4);
                W(e4);
            } else {
                throw C0373z.e();
            }
        }
    }

    public int c() {
        X(0);
        return this.f5129a.q();
    }

    public void d(Object obj, f0 f0Var, C0363o oVar) {
        X(3);
        P(obj, f0Var, oVar);
    }

    public int e() {
        return this.f5130b;
    }

    public long f() {
        X(0);
        return this.f5129a.E();
    }

    public void g(List list) {
        int C4;
        if (list instanceof C0371x) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 2) {
                Y(this.f5129a.D());
                this.f5129a.e();
                this.f5129a.r();
                throw null;
            } else if (b4 != 5) {
                throw C0373z.e();
            } else {
                this.f5129a.r();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 2) {
                int D4 = this.f5129a.D();
                Y(D4);
                int e4 = this.f5129a.e() + D4;
                do {
                    list.add(Integer.valueOf(this.f5129a.r()));
                } while (this.f5129a.e() < e4);
            } else if (b5 == 5) {
                do {
                    list.add(Integer.valueOf(this.f5129a.r()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else {
                throw C0373z.e();
            }
        }
    }

    public long h() {
        X(1);
        return this.f5129a.s();
    }

    public void i(List list) {
        int C4;
        if (list instanceof C0371x) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 2) {
                Y(this.f5129a.D());
                this.f5129a.e();
                this.f5129a.w();
                throw null;
            } else if (b4 != 5) {
                throw C0373z.e();
            } else {
                this.f5129a.w();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 2) {
                int D4 = this.f5129a.D();
                Y(D4);
                int e4 = this.f5129a.e() + D4;
                do {
                    list.add(Integer.valueOf(this.f5129a.w()));
                } while (this.f5129a.e() < e4);
            } else if (b5 == 5) {
                do {
                    list.add(Integer.valueOf(this.f5129a.w()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else {
                throw C0373z.e();
            }
        }
    }

    public int j() {
        X(0);
        return this.f5129a.y();
    }

    public void k(List list) {
        int C4;
        if (list instanceof G) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 0) {
                this.f5129a.z();
                throw null;
            } else if (b4 != 2) {
                throw C0373z.e();
            } else {
                this.f5129a.D();
                this.f5129a.e();
                this.f5129a.z();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 0) {
                do {
                    list.add(Long.valueOf(this.f5129a.z()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else if (b5 == 2) {
                int e4 = this.f5129a.e() + this.f5129a.D();
                do {
                    list.add(Long.valueOf(this.f5129a.z()));
                } while (this.f5129a.e() < e4);
                W(e4);
            } else {
                throw C0373z.e();
            }
        }
    }

    public long l() {
        X(0);
        return this.f5129a.z();
    }

    public void m(List list) {
        int C4;
        if (list instanceof C0371x) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 0) {
                this.f5129a.D();
                throw null;
            } else if (b4 != 2) {
                throw C0373z.e();
            } else {
                this.f5129a.D();
                this.f5129a.e();
                this.f5129a.D();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5129a.D()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else if (b5 == 2) {
                int e4 = this.f5129a.e() + this.f5129a.D();
                do {
                    list.add(Integer.valueOf(this.f5129a.D()));
                } while (this.f5129a.e() < e4);
                W(e4);
            } else {
                throw C0373z.e();
            }
        }
    }

    public void n(List list) {
        int C4;
        if (list instanceof C0353e) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 0) {
                this.f5129a.n();
                throw null;
            } else if (b4 != 2) {
                throw C0373z.e();
            } else {
                this.f5129a.D();
                this.f5129a.e();
                this.f5129a.n();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f5129a.n()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else if (b5 == 2) {
                int e4 = this.f5129a.e() + this.f5129a.D();
                do {
                    list.add(Boolean.valueOf(this.f5129a.n()));
                } while (this.f5129a.e() < e4);
                W(e4);
            } else {
                throw C0373z.e();
            }
        }
    }

    public String o() {
        X(2);
        return this.f5129a.A();
    }

    public int p() {
        X(5);
        return this.f5129a.r();
    }

    public boolean q() {
        X(0);
        return this.f5129a.n();
    }

    public int r() {
        int i4 = this.f5132d;
        if (i4 != 0) {
            this.f5130b = i4;
            this.f5132d = 0;
        } else {
            this.f5130b = this.f5129a.C();
        }
        int i5 = this.f5130b;
        if (i5 == 0 || i5 == this.f5131c) {
            return Integer.MAX_VALUE;
        }
        return r0.a(i5);
    }

    public double readDouble() {
        X(1);
        return this.f5129a.p();
    }

    public float readFloat() {
        X(5);
        return this.f5129a.t();
    }

    public void s(List list) {
        V(list, false);
    }

    public long t() {
        X(1);
        return this.f5129a.x();
    }

    public void u(List list) {
        int C4;
        if (list instanceof G) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 0) {
                this.f5129a.E();
                throw null;
            } else if (b4 != 2) {
                throw C0373z.e();
            } else {
                this.f5129a.D();
                this.f5129a.e();
                this.f5129a.E();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 0) {
                do {
                    list.add(Long.valueOf(this.f5129a.E()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else if (b5 == 2) {
                int e4 = this.f5129a.e() + this.f5129a.D();
                do {
                    list.add(Long.valueOf(this.f5129a.E()));
                } while (this.f5129a.e() < e4);
                W(e4);
            } else {
                throw C0373z.e();
            }
        }
    }

    public void v(List list) {
        V(list, true);
    }

    public C0355g w() {
        X(2);
        return this.f5129a.o();
    }

    public void x(List list) {
        int C4;
        if (list instanceof C0368u) {
            b.a(list);
            int b4 = r0.b(this.f5130b);
            if (b4 == 2) {
                Y(this.f5129a.D());
                this.f5129a.e();
                this.f5129a.t();
                throw null;
            } else if (b4 != 5) {
                throw C0373z.e();
            } else {
                this.f5129a.t();
                throw null;
            }
        } else {
            int b5 = r0.b(this.f5130b);
            if (b5 == 2) {
                int D4 = this.f5129a.D();
                Y(D4);
                int e4 = this.f5129a.e() + D4;
                do {
                    list.add(Float.valueOf(this.f5129a.t()));
                } while (this.f5129a.e() < e4);
            } else if (b5 == 5) {
                do {
                    list.add(Float.valueOf(this.f5129a.t()));
                    if (!this.f5129a.f()) {
                        C4 = this.f5129a.C();
                    } else {
                        return;
                    }
                } while (C4 == this.f5130b);
                this.f5132d = C4;
            } else {
                throw C0373z.e();
            }
        }
    }

    public int y() {
        X(0);
        return this.f5129a.D();
    }

    public int z() {
        X(0);
        return this.f5129a.u();
    }
}
