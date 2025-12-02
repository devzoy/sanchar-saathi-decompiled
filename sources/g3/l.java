package G3;

import h3.C0673n;
import l3.e;
import m3.C0795c;
import u3.p;
import v3.t;

public abstract /* synthetic */ class l {

    public static final class a implements d {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f1304e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ p f1305f;

        public a(d dVar, p pVar) {
            this.f1304e = dVar;
            this.f1305f = pVar;
        }

        public Object c(e eVar, e eVar2) {
            Object c4 = this.f1304e.c(new b(new t(), eVar, this.f1305f), eVar2);
            return c4 == C0795c.c() ? c4 : C0673n.f9639a;
        }
    }

    public static final class b implements e {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ t f1306e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e f1307f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ p f1308g;

        public static final class a extends n3.d {

            /* renamed from: h  reason: collision with root package name */
            public Object f1309h;

            /* renamed from: i  reason: collision with root package name */
            public Object f1310i;

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1311j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ b f1312k;

            /* renamed from: l  reason: collision with root package name */
            public int f1313l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, e eVar) {
                super(eVar);
                this.f1312k = bVar;
            }

            public final Object o(Object obj) {
                this.f1311j = obj;
                this.f1313l |= Integer.MIN_VALUE;
                return this.f1312k.b((Object) null, this);
            }
        }

        public b(t tVar, e eVar, p pVar) {
            this.f1306e = tVar;
            this.f1307f = eVar;
            this.f1308g = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(java.lang.Object r7, l3.e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof G3.l.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                G3.l$b$a r0 = (G3.l.b.a) r0
                int r1 = r0.f1313l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f1313l = r1
                goto L_0x0018
            L_0x0013:
                G3.l$b$a r0 = new G3.l$b$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f1311j
                java.lang.Object r1 = m3.C0795c.c()
                int r2 = r0.f1313l
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0045
                if (r2 == r5) goto L_0x0041
                if (r2 == r4) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                h3.C0668i.b(r8)
                goto L_0x0088
            L_0x002f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0037:
                java.lang.Object r7 = r0.f1310i
                java.lang.Object r2 = r0.f1309h
                G3.l$b r2 = (G3.l.b) r2
                h3.C0668i.b(r8)
                goto L_0x006c
            L_0x0041:
                h3.C0668i.b(r8)
                goto L_0x0059
            L_0x0045:
                h3.C0668i.b(r8)
                v3.t r8 = r6.f1306e
                boolean r8 = r8.f12466e
                if (r8 == 0) goto L_0x005c
                G3.e r8 = r6.f1307f
                r0.f1313l = r5
                java.lang.Object r7 = r8.b(r7, r0)
                if (r7 != r1) goto L_0x0059
                return r1
            L_0x0059:
                h3.n r7 = h3.C0673n.f9639a
                return r7
            L_0x005c:
                u3.p r8 = r6.f1308g
                r0.f1309h = r6
                r0.f1310i = r7
                r0.f1313l = r4
                java.lang.Object r8 = r8.g(r7, r0)
                if (r8 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r2 = r6
            L_0x006c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x008b
                v3.t r8 = r2.f1306e
                r8.f12466e = r5
                G3.e r8 = r2.f1307f
                r2 = 0
                r0.f1309h = r2
                r0.f1310i = r2
                r0.f1313l = r3
                java.lang.Object r7 = r8.b(r7, r0)
                if (r7 != r1) goto L_0x0088
                return r1
            L_0x0088:
                h3.n r7 = h3.C0673n.f9639a
                return r7
            L_0x008b:
                h3.n r7 = h3.C0673n.f9639a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: G3.l.b.b(java.lang.Object, l3.e):java.lang.Object");
        }
    }

    public static final class c implements d {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f1314e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ p f1315f;

        public static final class a extends n3.d {

            /* renamed from: h  reason: collision with root package name */
            public /* synthetic */ Object f1316h;

            /* renamed from: i  reason: collision with root package name */
            public int f1317i;

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ c f1318j;

            /* renamed from: k  reason: collision with root package name */
            public Object f1319k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(c cVar, e eVar) {
                super(eVar);
                this.f1318j = cVar;
            }

            public final Object o(Object obj) {
                this.f1316h = obj;
                this.f1317i |= Integer.MIN_VALUE;
                return this.f1318j.c((e) null, this);
            }
        }

        public c(d dVar, p pVar) {
            this.f1314e = dVar;
            this.f1315f = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object c(G3.e r6, l3.e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof G3.l.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                G3.l$c$a r0 = (G3.l.c.a) r0
                int r1 = r0.f1317i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f1317i = r1
                goto L_0x0018
            L_0x0013:
                G3.l$c$a r0 = new G3.l$c$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f1316h
                java.lang.Object r1 = m3.C0795c.c()
                int r2 = r0.f1317i
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r6 = r0.f1319k
                G3.l$d r6 = (G3.l.d) r6
                h3.C0668i.b(r7)     // Catch:{ a -> 0x002d }
                goto L_0x0053
            L_0x002d:
                r7 = move-exception
                goto L_0x0050
            L_0x002f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0037:
                h3.C0668i.b(r7)
                G3.d r7 = r5.f1314e
                G3.l$d r2 = new G3.l$d
                u3.p r4 = r5.f1315f
                r2.<init>(r4, r6)
                r0.f1319k = r2     // Catch:{ a -> 0x004e }
                r0.f1317i = r3     // Catch:{ a -> 0x004e }
                java.lang.Object r6 = r7.c(r2, r0)     // Catch:{ a -> 0x004e }
                if (r6 != r1) goto L_0x0053
                return r1
            L_0x004e:
                r7 = move-exception
                r6 = r2
            L_0x0050:
                H3.j.a(r7, r6)
            L_0x0053:
                h3.n r6 = h3.C0673n.f9639a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: G3.l.c.c(G3.e, l3.e):java.lang.Object");
        }
    }

    public static final class d implements e {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ p f1320e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e f1321f;

        public static final class a extends n3.d {

            /* renamed from: h  reason: collision with root package name */
            public Object f1322h;

            /* renamed from: i  reason: collision with root package name */
            public /* synthetic */ Object f1323i;

            /* renamed from: j  reason: collision with root package name */
            public int f1324j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ d f1325k;

            /* renamed from: l  reason: collision with root package name */
            public Object f1326l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(d dVar, e eVar) {
                super(eVar);
                this.f1325k = dVar;
            }

            public final Object o(Object obj) {
                this.f1323i = obj;
                this.f1324j |= Integer.MIN_VALUE;
                return this.f1325k.b((Object) null, this);
            }
        }

        public d(p pVar, e eVar) {
            this.f1320e = pVar;
            this.f1321f = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object b(java.lang.Object r8, l3.e r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof G3.l.d.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                G3.l$d$a r0 = (G3.l.d.a) r0
                int r1 = r0.f1324j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f1324j = r1
                goto L_0x0018
            L_0x0013:
                G3.l$d$a r0 = new G3.l$d$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f1323i
                java.lang.Object r1 = m3.C0795c.c()
                int r2 = r0.f1324j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r8 = r0.f1322h
                G3.l$d r8 = (G3.l.d) r8
                h3.C0668i.b(r9)
                goto L_0x007c
            L_0x0030:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0038:
                java.lang.Object r8 = r0.f1326l
                java.lang.Object r2 = r0.f1322h
                G3.l$d r2 = (G3.l.d) r2
                h3.C0668i.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L_0x0063
            L_0x0046:
                h3.C0668i.b(r9)
                u3.p r9 = r7.f1320e
                r0.f1322h = r7
                r0.f1326l = r8
                r0.f1324j = r4
                r2 = 6
                v3.k.a(r2)
                java.lang.Object r9 = r9.g(r8, r0)
                r2 = 7
                v3.k.a(r2)
                if (r9 != r1) goto L_0x0060
                return r1
            L_0x0060:
                r2 = r9
                r9 = r8
                r8 = r7
            L_0x0063:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x007b
                G3.e r2 = r8.f1321f
                r0.f1322h = r8
                r5 = 0
                r0.f1326l = r5
                r0.f1324j = r3
                java.lang.Object r9 = r2.b(r9, r0)
                if (r9 != r1) goto L_0x007c
                return r1
            L_0x007b:
                r4 = 0
            L_0x007c:
                if (r4 == 0) goto L_0x0081
                h3.n r8 = h3.C0673n.f9639a
                return r8
            L_0x0081:
                H3.a r9 = new H3.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: G3.l.d.b(java.lang.Object, l3.e):java.lang.Object");
        }
    }

    public static final d a(d dVar, p pVar) {
        return new a(dVar, pVar);
    }

    public static final d b(d dVar, p pVar) {
        return new c(dVar, pVar);
    }
}
