package G3;

import H3.b;
import H3.k;
import H3.m;
import I3.F;
import h3.C0673n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l3.e;
import l3.i;
import n3.d;

public final class s extends b implements n, d, k {

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1334i = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: h  reason: collision with root package name */
    public int f1335h;

    public static final class a extends d {

        /* renamed from: h  reason: collision with root package name */
        public Object f1336h;

        /* renamed from: i  reason: collision with root package name */
        public Object f1337i;

        /* renamed from: j  reason: collision with root package name */
        public Object f1338j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1339k;

        /* renamed from: l  reason: collision with root package name */
        public Object f1340l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f1341m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ s f1342n;

        /* renamed from: o  reason: collision with root package name */
        public int f1343o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(s sVar, e eVar) {
            super(eVar);
            this.f1342n = sVar;
        }

        public final Object o(Object obj) {
            this.f1341m = obj;
            this.f1343o |= Integer.MIN_VALUE;
            return this.f1342n.c((e) null, this);
        }
    }

    public s(Object obj) {
        this._state = obj;
    }

    public d a(i iVar, int i4, F3.a aVar) {
        return t.d(this, iVar, i4, aVar);
    }

    public Object b(Object obj, e eVar) {
        setValue(obj);
        return C0673n.f9639a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: G3.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: G3.s} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a8 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bb A[Catch:{ all -> 0x0042 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(G3.e r11, l3.e r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof G3.s.a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            G3.s$a r0 = (G3.s.a) r0
            int r1 = r0.f1343o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1343o = r1
            goto L_0x0018
        L_0x0013:
            G3.s$a r0 = new G3.s$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f1341m
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f1343o
            r3 = 0
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x0075
            r11 = 1
            if (r2 == r11) goto L_0x0063
            if (r2 == r5) goto L_0x004d
            if (r2 != r4) goto L_0x0045
            java.lang.Object r11 = r0.f1340l
            java.lang.Object r2 = r0.f1339k
            D3.p0 r2 = (D3.p0) r2
            java.lang.Object r6 = r0.f1338j
            G3.u r6 = (G3.u) r6
            java.lang.Object r7 = r0.f1337i
            G3.e r7 = (G3.e) r7
            java.lang.Object r8 = r0.f1336h
            G3.s r8 = (G3.s) r8
            h3.C0668i.b(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x008f
        L_0x0042:
            r11 = move-exception
            goto L_0x00d6
        L_0x0045:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004d:
            java.lang.Object r11 = r0.f1340l
            java.lang.Object r2 = r0.f1339k
            D3.p0 r2 = (D3.p0) r2
            java.lang.Object r6 = r0.f1338j
            G3.u r6 = (G3.u) r6
            java.lang.Object r7 = r0.f1337i
            G3.e r7 = (G3.e) r7
            java.lang.Object r8 = r0.f1336h
            G3.s r8 = (G3.s) r8
            h3.C0668i.b(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x00bd
        L_0x0063:
            java.lang.Object r11 = r0.f1338j
            r6 = r11
            G3.u r6 = (G3.u) r6
            java.lang.Object r11 = r0.f1337i
            G3.e r11 = (G3.e) r11
            java.lang.Object r2 = r0.f1336h
            r8 = r2
            G3.s r8 = (G3.s) r8
            h3.C0668i.b(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x0080
        L_0x0075:
            h3.C0668i.b(r12)
            H3.d r12 = r10.d()
            G3.u r12 = (G3.u) r12
            r8 = r10
            r6 = r12
        L_0x0080:
            l3.i r12 = r0.a()     // Catch:{ all -> 0x0042 }
            D3.p0$b r2 = D3.p0.f838b     // Catch:{ all -> 0x0042 }
            l3.i$b r12 = r12.d(r2)     // Catch:{ all -> 0x0042 }
            D3.p0 r12 = (D3.p0) r12     // Catch:{ all -> 0x0042 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x008f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f1334i     // Catch:{ all -> 0x0042 }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x009a
            D3.t0.d(r2)     // Catch:{ all -> 0x0042 }
        L_0x009a:
            if (r11 == 0) goto L_0x00a2
            boolean r9 = v3.l.a(r11, r12)     // Catch:{ all -> 0x0042 }
            if (r9 != 0) goto L_0x00bd
        L_0x00a2:
            I3.F r11 = H3.m.f1460a     // Catch:{ all -> 0x0042 }
            if (r12 != r11) goto L_0x00a8
            r11 = r3
            goto L_0x00a9
        L_0x00a8:
            r11 = r12
        L_0x00a9:
            r0.f1336h = r8     // Catch:{ all -> 0x0042 }
            r0.f1337i = r7     // Catch:{ all -> 0x0042 }
            r0.f1338j = r6     // Catch:{ all -> 0x0042 }
            r0.f1339k = r2     // Catch:{ all -> 0x0042 }
            r0.f1340l = r12     // Catch:{ all -> 0x0042 }
            r0.f1343o = r5     // Catch:{ all -> 0x0042 }
            java.lang.Object r11 = r7.b(r11, r0)     // Catch:{ all -> 0x0042 }
            if (r11 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            r11 = r12
        L_0x00bd:
            boolean r12 = r6.h()     // Catch:{ all -> 0x0042 }
            if (r12 != 0) goto L_0x008f
            r0.f1336h = r8     // Catch:{ all -> 0x0042 }
            r0.f1337i = r7     // Catch:{ all -> 0x0042 }
            r0.f1338j = r6     // Catch:{ all -> 0x0042 }
            r0.f1339k = r2     // Catch:{ all -> 0x0042 }
            r0.f1340l = r11     // Catch:{ all -> 0x0042 }
            r0.f1343o = r4     // Catch:{ all -> 0x0042 }
            java.lang.Object r12 = r6.e(r0)     // Catch:{ all -> 0x0042 }
            if (r12 != r1) goto L_0x008f
            return r1
        L_0x00d6:
            r8.h(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.s.c(G3.e, l3.e):java.lang.Object");
    }

    public boolean e(Object obj, Object obj2) {
        if (obj == null) {
            obj = m.f1460a;
        }
        if (obj2 == null) {
            obj2 = m.f1460a;
        }
        return l(obj, obj2);
    }

    public Object getValue() {
        F f4 = m.f1460a;
        Object obj = f1334i.get(this);
        if (obj == f4) {
            return null;
        }
        return obj;
    }

    /* renamed from: j */
    public u f() {
        return new u();
    }

    /* renamed from: k */
    public u[] g(int i4) {
        return new u[i4];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r8 = (G3.u[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        if (r8 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        r1 = r8.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        if (r2 >= r1) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        r4 = r8[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        if (r4 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
        r4.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r8 = r6.f1335h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0044, code lost:
        if (r8 != r7) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0046, code lost:
        r6.f1335h = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0049, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7 = i();
        r1 = h3.C0673n.f9639a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0053, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0054, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 1
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f1334i     // Catch:{ all -> 0x0013 }
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0013 }
            r3 = 0
            if (r7 == 0) goto L_0x0015
            boolean r7 = v3.l.a(r2, r7)     // Catch:{ all -> 0x0013 }
            if (r7 != 0) goto L_0x0015
            monitor-exit(r6)
            return r3
        L_0x0013:
            r7 = move-exception
            goto L_0x0060
        L_0x0015:
            boolean r7 = v3.l.a(r2, r8)     // Catch:{ all -> 0x0013 }
            if (r7 == 0) goto L_0x001d
            monitor-exit(r6)
            return r0
        L_0x001d:
            r1.set(r6, r8)     // Catch:{ all -> 0x0013 }
            int r7 = r6.f1335h     // Catch:{ all -> 0x0013 }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x005a
            int r7 = r7 + r0
            r6.f1335h = r7     // Catch:{ all -> 0x0013 }
            H3.d[] r8 = r6.i()     // Catch:{ all -> 0x0013 }
            h3.n r1 = h3.C0673n.f9639a     // Catch:{ all -> 0x0013 }
            monitor-exit(r6)
        L_0x0030:
            G3.u[] r8 = (G3.u[]) r8
            if (r8 == 0) goto L_0x0041
            int r1 = r8.length
            r2 = r3
        L_0x0036:
            if (r2 >= r1) goto L_0x0041
            r4 = r8[r2]
            if (r4 == 0) goto L_0x003f
            r4.g()
        L_0x003f:
            int r2 = r2 + r0
            goto L_0x0036
        L_0x0041:
            monitor-enter(r6)
            int r8 = r6.f1335h     // Catch:{ all -> 0x004b }
            if (r8 != r7) goto L_0x004d
            int r7 = r7 + r0
            r6.f1335h = r7     // Catch:{ all -> 0x004b }
            monitor-exit(r6)
            return r0
        L_0x004b:
            r7 = move-exception
            goto L_0x0058
        L_0x004d:
            H3.d[] r7 = r6.i()     // Catch:{ all -> 0x004b }
            h3.n r1 = h3.C0673n.f9639a     // Catch:{ all -> 0x004b }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x0030
        L_0x0058:
            monitor-exit(r6)
            throw r7
        L_0x005a:
            int r7 = r7 + 2
            r6.f1335h = r7     // Catch:{ all -> 0x0013 }
            monitor-exit(r6)
            return r0
        L_0x0060:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.s.l(java.lang.Object, java.lang.Object):boolean");
    }

    public void setValue(Object obj) {
        if (obj == null) {
            obj = m.f1460a;
        }
        l((Object) null, obj);
    }
}
