package G3;

import F3.s;
import h3.C0673n;
import l3.e;
import m3.C0795c;
import n3.d;

public abstract /* synthetic */ class h {

    public static final class a extends d {

        /* renamed from: h  reason: collision with root package name */
        public Object f1280h;

        /* renamed from: i  reason: collision with root package name */
        public Object f1281i;

        /* renamed from: j  reason: collision with root package name */
        public Object f1282j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1283k;

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ Object f1284l;

        /* renamed from: m  reason: collision with root package name */
        public int f1285m;

        public a(e eVar) {
            super(eVar);
        }

        public final Object o(Object obj) {
            this.f1284l = obj;
            this.f1285m |= Integer.MIN_VALUE;
            return h.c((e) null, (s) null, false, this);
        }
    }

    public static final Object b(e eVar, s sVar, e eVar2) {
        Object c4 = c(eVar, sVar, true, eVar2);
        return c4 == C0795c.c() ? c4 : C0673n.f9639a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r8 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        F3.k.a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        throw r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[Catch:{ all -> 0x009e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073 A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(G3.e r6, F3.s r7, boolean r8, l3.e r9) {
        /*
            boolean r0 = r9 instanceof G3.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            G3.h$a r0 = (G3.h.a) r0
            int r1 = r0.f1285m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1285m = r1
            goto L_0x0018
        L_0x0013:
            G3.h$a r0 = new G3.h$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f1284l
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f1285m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            boolean r8 = r0.f1283k
            java.lang.Object r6 = r0.f1282j
            F3.f r6 = (F3.f) r6
            java.lang.Object r7 = r0.f1281i
            F3.s r7 = (F3.s) r7
            java.lang.Object r2 = r0.f1280h
            G3.e r2 = (G3.e) r2
            h3.C0668i.b(r9)     // Catch:{ all -> 0x003c }
        L_0x0039:
            r9 = r6
            r6 = r2
            goto L_0x0062
        L_0x003c:
            r6 = move-exception
            goto L_0x009d
        L_0x003e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0046:
            boolean r8 = r0.f1283k
            java.lang.Object r6 = r0.f1282j
            F3.f r6 = (F3.f) r6
            java.lang.Object r7 = r0.f1281i
            F3.s r7 = (F3.s) r7
            java.lang.Object r2 = r0.f1280h
            G3.e r2 = (G3.e) r2
            h3.C0668i.b(r9)     // Catch:{ all -> 0x003c }
            goto L_0x0077
        L_0x0058:
            h3.C0668i.b(r9)
            G3.f.h(r6)
            F3.f r9 = r7.iterator()     // Catch:{ all -> 0x003c }
        L_0x0062:
            r0.f1280h = r6     // Catch:{ all -> 0x003c }
            r0.f1281i = r7     // Catch:{ all -> 0x003c }
            r0.f1282j = r9     // Catch:{ all -> 0x003c }
            r0.f1283k = r8     // Catch:{ all -> 0x003c }
            r0.f1285m = r4     // Catch:{ all -> 0x003c }
            java.lang.Object r2 = r9.a(r0)     // Catch:{ all -> 0x003c }
            if (r2 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L_0x0077:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x003c }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x0094
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x003c }
            r0.f1280h = r2     // Catch:{ all -> 0x003c }
            r0.f1281i = r7     // Catch:{ all -> 0x003c }
            r0.f1282j = r6     // Catch:{ all -> 0x003c }
            r0.f1283k = r8     // Catch:{ all -> 0x003c }
            r0.f1285m = r3     // Catch:{ all -> 0x003c }
            java.lang.Object r9 = r2.b(r9, r0)     // Catch:{ all -> 0x003c }
            if (r9 != r1) goto L_0x0039
            return r1
        L_0x0094:
            if (r8 == 0) goto L_0x009a
            r6 = 0
            F3.k.a(r7, r6)
        L_0x009a:
            h3.n r6 = h3.C0673n.f9639a
            return r6
        L_0x009d:
            throw r6     // Catch:{ all -> 0x009e }
        L_0x009e:
            r9 = move-exception
            if (r8 == 0) goto L_0x00a4
            F3.k.a(r7, r6)
        L_0x00a4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.h.c(G3.e, F3.s, boolean, l3.e):java.lang.Object");
    }
}
