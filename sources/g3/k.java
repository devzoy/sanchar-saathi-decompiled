package G3;

import l3.e;
import n3.d;
import u3.p;
import u3.q;

public abstract /* synthetic */ class k {

    public static final class a extends d {

        /* renamed from: h  reason: collision with root package name */
        public Object f1286h;

        /* renamed from: i  reason: collision with root package name */
        public /* synthetic */ Object f1287i;

        /* renamed from: j  reason: collision with root package name */
        public int f1288j;

        public a(e eVar) {
            super(eVar);
        }

        public final Object o(Object obj) {
            this.f1287i = obj;
            this.f1288j |= Integer.MIN_VALUE;
            return k.c((e) null, (q) null, (Throwable) null, this);
        }
    }

    public static final class b implements d {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f1289e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q f1290f;

        public static final class a extends d {

            /* renamed from: h  reason: collision with root package name */
            public /* synthetic */ Object f1291h;

            /* renamed from: i  reason: collision with root package name */
            public int f1292i;

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ b f1293j;

            /* renamed from: k  reason: collision with root package name */
            public Object f1294k;

            /* renamed from: l  reason: collision with root package name */
            public Object f1295l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, e eVar) {
                super(eVar);
                this.f1293j = bVar;
            }

            public final Object o(Object obj) {
                this.f1291h = obj;
                this.f1292i |= Integer.MIN_VALUE;
                return this.f1293j.c((e) null, this);
            }
        }

        public b(d dVar, q qVar) {
            this.f1289e = dVar;
            this.f1290f = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object c(G3.e r9, l3.e r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof G3.k.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r10
                G3.k$b$a r0 = (G3.k.b.a) r0
                int r1 = r0.f1292i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f1292i = r1
                goto L_0x0018
            L_0x0013:
                G3.k$b$a r0 = new G3.k$b$a
                r0.<init>(r8, r10)
            L_0x0018:
                java.lang.Object r10 = r0.f1291h
                java.lang.Object r1 = m3.C0795c.c()
                int r2 = r0.f1292i
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0054
                if (r2 == r5) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r9 = r0.f1294k
                H3.n r9 = (H3.n) r9
                h3.C0668i.b(r10)     // Catch:{ all -> 0x0034 }
                goto L_0x0088
            L_0x0034:
                r10 = move-exception
                goto L_0x0092
            L_0x0036:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L_0x003e:
                java.lang.Object r9 = r0.f1294k
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                h3.C0668i.b(r10)
                goto L_0x00ac
            L_0x0046:
                java.lang.Object r9 = r0.f1295l
                G3.e r9 = (G3.e) r9
                java.lang.Object r2 = r0.f1294k
                G3.k$b r2 = (G3.k.b) r2
                h3.C0668i.b(r10)     // Catch:{ all -> 0x0052 }
                goto L_0x0067
            L_0x0052:
                r9 = move-exception
                goto L_0x0098
            L_0x0054:
                h3.C0668i.b(r10)
                G3.d r10 = r8.f1289e     // Catch:{ all -> 0x0096 }
                r0.f1294k = r8     // Catch:{ all -> 0x0096 }
                r0.f1295l = r9     // Catch:{ all -> 0x0096 }
                r0.f1292i = r5     // Catch:{ all -> 0x0096 }
                java.lang.Object r10 = r10.c(r9, r0)     // Catch:{ all -> 0x0096 }
                if (r10 != r1) goto L_0x0066
                return r1
            L_0x0066:
                r2 = r8
            L_0x0067:
                H3.n r10 = new H3.n
                l3.i r4 = r0.a()
                r10.<init>(r9, r4)
                u3.q r9 = r2.f1290f     // Catch:{ all -> 0x008e }
                r0.f1294k = r10     // Catch:{ all -> 0x008e }
                r0.f1295l = r6     // Catch:{ all -> 0x008e }
                r0.f1292i = r3     // Catch:{ all -> 0x008e }
                r2 = 6
                v3.k.a(r2)     // Catch:{ all -> 0x008e }
                java.lang.Object r9 = r9.f(r10, r6, r0)     // Catch:{ all -> 0x008e }
                r0 = 7
                v3.k.a(r0)     // Catch:{ all -> 0x008e }
                if (r9 != r1) goto L_0x0087
                return r1
            L_0x0087:
                r9 = r10
            L_0x0088:
                r9.p()
                h3.n r9 = h3.C0673n.f9639a
                return r9
            L_0x008e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L_0x0092:
                r9.p()
                throw r10
            L_0x0096:
                r9 = move-exception
                r2 = r8
            L_0x0098:
                G3.v r10 = new G3.v
                r10.<init>(r9)
                u3.q r2 = r2.f1290f
                r0.f1294k = r9
                r0.f1295l = r6
                r0.f1292i = r4
                java.lang.Object r10 = G3.k.c(r10, r2, r9, r0)
                if (r10 != r1) goto L_0x00ac
                return r1
            L_0x00ac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: G3.k.b.c(G3.e, l3.e):java.lang.Object");
        }
    }

    public static final class c implements d {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ p f1296e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ d f1297f;

        public static final class a extends d {

            /* renamed from: h  reason: collision with root package name */
            public /* synthetic */ Object f1298h;

            /* renamed from: i  reason: collision with root package name */
            public int f1299i;

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ c f1300j;

            /* renamed from: k  reason: collision with root package name */
            public Object f1301k;

            /* renamed from: l  reason: collision with root package name */
            public Object f1302l;

            /* renamed from: m  reason: collision with root package name */
            public Object f1303m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(c cVar, e eVar) {
                super(eVar);
                this.f1300j = cVar;
            }

            public final Object o(Object obj) {
                this.f1298h = obj;
                this.f1299i |= Integer.MIN_VALUE;
                return this.f1300j.c((e) null, this);
            }
        }

        public c(p pVar, d dVar) {
            this.f1296e = pVar;
            this.f1297f = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0082 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object c(G3.e r7, l3.e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof G3.k.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                G3.k$c$a r0 = (G3.k.c.a) r0
                int r1 = r0.f1299i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f1299i = r1
                goto L_0x0018
            L_0x0013:
                G3.k$c$a r0 = new G3.k$c$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f1298h
                java.lang.Object r1 = m3.C0795c.c()
                int r2 = r0.f1299i
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                h3.C0668i.b(r8)
                goto L_0x0083
            L_0x002c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0034:
                java.lang.Object r7 = r0.f1303m
                H3.n r7 = (H3.n) r7
                java.lang.Object r2 = r0.f1302l
                G3.e r2 = (G3.e) r2
                java.lang.Object r4 = r0.f1301k
                G3.k$c r4 = (G3.k.c) r4
                h3.C0668i.b(r8)     // Catch:{ all -> 0x0044 }
                goto L_0x006e
            L_0x0044:
                r8 = move-exception
                goto L_0x008a
            L_0x0046:
                h3.C0668i.b(r8)
                H3.n r8 = new H3.n
                l3.i r2 = r0.a()
                r8.<init>(r7, r2)
                u3.p r2 = r6.f1296e     // Catch:{ all -> 0x0086 }
                r0.f1301k = r6     // Catch:{ all -> 0x0086 }
                r0.f1302l = r7     // Catch:{ all -> 0x0086 }
                r0.f1303m = r8     // Catch:{ all -> 0x0086 }
                r0.f1299i = r4     // Catch:{ all -> 0x0086 }
                r4 = 6
                v3.k.a(r4)     // Catch:{ all -> 0x0086 }
                java.lang.Object r2 = r2.g(r8, r0)     // Catch:{ all -> 0x0086 }
                r4 = 7
                v3.k.a(r4)     // Catch:{ all -> 0x0086 }
                if (r2 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r4 = r6
                r2 = r7
                r7 = r8
            L_0x006e:
                r7.p()
                G3.d r7 = r4.f1297f
                r8 = 0
                r0.f1301k = r8
                r0.f1302l = r8
                r0.f1303m = r8
                r0.f1299i = r3
                java.lang.Object r7 = r7.c(r2, r0)
                if (r7 != r1) goto L_0x0083
                return r1
            L_0x0083:
                h3.n r7 = h3.C0673n.f9639a
                return r7
            L_0x0086:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x008a:
                r7.p()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: G3.k.c.c(G3.e, l3.e):java.lang.Object");
        }
    }

    public static final void b(e eVar) {
        if (eVar instanceof v) {
            throw ((v) eVar).f1347e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(G3.e r4, u3.q r5, java.lang.Throwable r6, l3.e r7) {
        /*
            boolean r0 = r7 instanceof G3.k.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            G3.k$a r0 = (G3.k.a) r0
            int r1 = r0.f1288j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1288j = r1
            goto L_0x0018
        L_0x0013:
            G3.k$a r0 = new G3.k$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f1287i
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f1288j
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r4 = r0.f1286h
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            h3.C0668i.b(r7)     // Catch:{ all -> 0x002e }
            goto L_0x0046
        L_0x002e:
            r4 = move-exception
            goto L_0x0049
        L_0x0030:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0038:
            h3.C0668i.b(r7)
            r0.f1286h = r6     // Catch:{ all -> 0x002e }
            r0.f1288j = r3     // Catch:{ all -> 0x002e }
            java.lang.Object r4 = r5.f(r4, r6, r0)     // Catch:{ all -> 0x002e }
            if (r4 != r1) goto L_0x0046
            return r1
        L_0x0046:
            h3.n r4 = h3.C0673n.f9639a
            return r4
        L_0x0049:
            if (r6 == 0) goto L_0x0050
            if (r6 == r4) goto L_0x0050
            h3.C0660a.a(r4, r6)
        L_0x0050:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.k.c(G3.e, u3.q, java.lang.Throwable, l3.e):java.lang.Object");
    }

    public static final d d(d dVar, q qVar) {
        return new b(dVar, qVar);
    }

    public static final d e(d dVar, p pVar) {
        return new c(pVar, dVar);
    }
}
