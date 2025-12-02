package c0;

import G3.d;
import G3.f;
import h3.C0668i;
import h3.C0673n;
import l3.e;
import m3.C0795c;
import n3.k;
import u3.l;
import u3.p;

public final class u implements n {

    /* renamed from: a  reason: collision with root package name */
    public final String f6484a;

    /* renamed from: b  reason: collision with root package name */
    public final M3.a f6485b = M3.c.b(false, 1, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public final C0399a f6486c = new C0399a(0);

    /* renamed from: d  reason: collision with root package name */
    public final d f6487d = f.j(new c((e) null));

    public static final class a extends n3.d {

        /* renamed from: h  reason: collision with root package name */
        public Object f6488h;

        /* renamed from: i  reason: collision with root package name */
        public Object f6489i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f6490j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ u f6491k;

        /* renamed from: l  reason: collision with root package name */
        public int f6492l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u uVar, e eVar) {
            super(eVar);
            this.f6491k = uVar;
        }

        public final Object o(Object obj) {
            this.f6490j = obj;
            this.f6492l |= Integer.MIN_VALUE;
            return this.f6491k.d((l) null, this);
        }
    }

    public static final class b extends n3.d {

        /* renamed from: h  reason: collision with root package name */
        public Object f6493h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f6494i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f6495j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ u f6496k;

        /* renamed from: l  reason: collision with root package name */
        public int f6497l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(u uVar, e eVar) {
            super(eVar);
            this.f6496k = uVar;
        }

        public final Object o(Object obj) {
            this.f6495j = obj;
            this.f6497l |= Integer.MIN_VALUE;
            return this.f6496k.b((p) null, this);
        }
    }

    public static final class c extends k implements p {

        /* renamed from: i  reason: collision with root package name */
        public int f6498i;

        public c(e eVar) {
            super(2, eVar);
        }

        public final e j(Object obj, e eVar) {
            return new c(eVar);
        }

        public final Object o(Object obj) {
            C0795c.c();
            if (this.f6498i == 0) {
                C0668i.b(obj);
                return C0673n.f9639a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: s */
        public final Object g(G3.e eVar, e eVar2) {
            return ((c) j(eVar, eVar2)).o(C0673n.f9639a);
        }
    }

    public u(String str) {
        v3.l.e(str, "filePath");
        this.f6484a = str;
    }

    public Object a(e eVar) {
        return n3.b.c(this.f6486c.b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(u3.p r7, l3.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof c0.u.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            c0.u$b r0 = (c0.u.b) r0
            int r1 = r0.f6497l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6497l = r1
            goto L_0x0018
        L_0x0013:
            c0.u$b r0 = new c0.u$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f6495j
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f6497l
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            boolean r7 = r0.f6494i
            java.lang.Object r0 = r0.f6493h
            M3.a r0 = (M3.a) r0
            h3.C0668i.b(r8)     // Catch:{ all -> 0x0030 }
            goto L_0x0057
        L_0x0030:
            r8 = move-exception
            goto L_0x0061
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            h3.C0668i.b(r8)
            M3.a r8 = r6.f6485b
            boolean r2 = r8.c(r4)
            java.lang.Boolean r5 = n3.b.a(r2)     // Catch:{ all -> 0x005d }
            r0.f6493h = r8     // Catch:{ all -> 0x005d }
            r0.f6494i = r2     // Catch:{ all -> 0x005d }
            r0.f6497l = r3     // Catch:{ all -> 0x005d }
            java.lang.Object r7 = r7.g(r5, r0)     // Catch:{ all -> 0x005d }
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r8
            r8 = r7
            r7 = r2
        L_0x0057:
            if (r7 == 0) goto L_0x005c
            r0.a(r4)
        L_0x005c:
            return r8
        L_0x005d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L_0x0061:
            if (r7 == 0) goto L_0x0066
            r0.a(r4)
        L_0x0066:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.u.b(u3.p, l3.e):java.lang.Object");
    }

    public d c() {
        return this.f6487d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(u3.l r8, l3.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof c0.u.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            c0.u$a r0 = (c0.u.a) r0
            int r1 = r0.f6492l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6492l = r1
            goto L_0x0018
        L_0x0013:
            c0.u$a r0 = new c0.u$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f6490j
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f6492l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r8 = r0.f6488h
            M3.a r8 = (M3.a) r8
            h3.C0668i.b(r9)     // Catch:{ all -> 0x0031 }
            goto L_0x006b
        L_0x0031:
            r9 = move-exception
            goto L_0x0073
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.f6489i
            M3.a r8 = (M3.a) r8
            java.lang.Object r2 = r0.f6488h
            u3.l r2 = (u3.l) r2
            h3.C0668i.b(r9)
            r9 = r8
            r8 = r2
            goto L_0x005b
        L_0x0049:
            h3.C0668i.b(r9)
            M3.a r9 = r7.f6485b
            r0.f6488h = r8
            r0.f6489i = r9
            r0.f6492l = r4
            java.lang.Object r2 = r9.b(r5, r0)
            if (r2 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r0.f6488h = r9     // Catch:{ all -> 0x006f }
            r0.f6489i = r5     // Catch:{ all -> 0x006f }
            r0.f6492l = r3     // Catch:{ all -> 0x006f }
            java.lang.Object r8 = r8.i(r0)     // Catch:{ all -> 0x006f }
            if (r8 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x006b:
            r8.a(r5)
            return r9
        L_0x006f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0073:
            r8.a(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.u.d(u3.l, l3.e):java.lang.Object");
    }

    public Object e(e eVar) {
        return n3.b.c(this.f6486c.d());
    }
}
