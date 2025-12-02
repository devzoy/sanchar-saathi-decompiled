package androidx.datastore.preferences.protobuf;

public abstract class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f5165a = 100;

    public abstract void a(Object obj, int i4, int i5);

    public abstract void b(Object obj, int i4, long j4);

    public abstract void c(Object obj, int i4, Object obj2);

    public abstract void d(Object obj, int i4, C0355g gVar);

    public abstract void e(Object obj, int i4, long j4);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(java.lang.Object r3, androidx.datastore.preferences.protobuf.e0 r4, int r5) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.r()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.m(r3, r4, r5)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.m0.l(java.lang.Object, androidx.datastore.preferences.protobuf.e0, int):void");
    }

    public final boolean m(Object obj, e0 e0Var, int i4) {
        int e4 = e0Var.e();
        int a4 = r0.a(e4);
        int b4 = r0.b(e4);
        if (b4 == 0) {
            e(obj, a4, e0Var.I());
            return true;
        } else if (b4 == 1) {
            b(obj, a4, e0Var.h());
            return true;
        } else if (b4 == 2) {
            d(obj, a4, e0Var.w());
            return true;
        } else if (b4 == 3) {
            Object n4 = n();
            int c4 = r0.c(a4, 4);
            int i5 = i4 + 1;
            if (i5 < f5165a) {
                l(n4, e0Var, i5);
                if (c4 == e0Var.e()) {
                    c(obj, a4, r(n4));
                    return true;
                }
                throw C0373z.b();
            }
            throw C0373z.i();
        } else if (b4 == 4) {
            return false;
        } else {
            if (b4 == 5) {
                a(obj, a4, e0Var.p());
                return true;
            }
            throw C0373z.e();
        }
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(e0 e0Var);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, s0 s0Var);

    public abstract void t(Object obj, s0 s0Var);
}
