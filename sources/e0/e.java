package e0;

import M3.c;
import O3.h;
import O3.r;
import c0.n;
import c0.x;
import n3.d;
import u3.p;
import u3.q;
import v3.l;

public final class e implements x {

    /* renamed from: a  reason: collision with root package name */
    public final h f8729a;

    /* renamed from: b  reason: collision with root package name */
    public final r f8730b;

    /* renamed from: c  reason: collision with root package name */
    public final c f8731c;

    /* renamed from: d  reason: collision with root package name */
    public final n f8732d;

    /* renamed from: e  reason: collision with root package name */
    public final u3.a f8733e;

    /* renamed from: f  reason: collision with root package name */
    public final C0586a f8734f = new C0586a(false);

    /* renamed from: g  reason: collision with root package name */
    public final M3.a f8735g = c.b(false, 1, (Object) null);

    public static final class a extends d {

        /* renamed from: h  reason: collision with root package name */
        public Object f8736h;

        /* renamed from: i  reason: collision with root package name */
        public Object f8737i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f8738j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f8739k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ e f8740l;

        /* renamed from: m  reason: collision with root package name */
        public int f8741m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, l3.e eVar2) {
            super(eVar2);
            this.f8740l = eVar;
        }

        public final Object o(Object obj) {
            this.f8739k = obj;
            this.f8741m |= Integer.MIN_VALUE;
            return this.f8740l.d((q) null, this);
        }
    }

    public static final class b extends d {

        /* renamed from: h  reason: collision with root package name */
        public Object f8742h;

        /* renamed from: i  reason: collision with root package name */
        public Object f8743i;

        /* renamed from: j  reason: collision with root package name */
        public Object f8744j;

        /* renamed from: k  reason: collision with root package name */
        public Object f8745k;

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ Object f8746l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ e f8747m;

        /* renamed from: n  reason: collision with root package name */
        public int f8748n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, l3.e eVar2) {
            super(eVar2);
            this.f8747m = eVar;
        }

        public final Object o(Object obj) {
            this.f8746l = obj;
            this.f8748n |= Integer.MIN_VALUE;
            return this.f8747m.c((p) null, this);
        }
    }

    public e(h hVar, r rVar, c cVar, n nVar, u3.a aVar) {
        l.e(hVar, "fileSystem");
        l.e(rVar, "path");
        l.e(cVar, "serializer");
        l.e(nVar, "coordinator");
        l.e(aVar, "onClose");
        this.f8729a = hVar;
        this.f8730b = rVar;
        this.f8731c = cVar;
        this.f8732d = nVar;
        this.f8733e = aVar;
    }

    public n a() {
        return this.f8732d;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x010f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf A[SYNTHETIC, Splitter:B:39:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef A[SYNTHETIC, Splitter:B:51:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(u3.p r10, l3.e r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof e0.e.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            e0.e$b r0 = (e0.e.b) r0
            int r1 = r0.f8748n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8748n = r1
            goto L_0x0018
        L_0x0013:
            e0.e$b r0 = new e0.e$b
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f8746l
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f8748n
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0060
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r10 = r0.f8745k
            c0.b r10 = (c0.C0400b) r10
            java.lang.Object r1 = r0.f8744j
            O3.r r1 = (O3.r) r1
            java.lang.Object r2 = r0.f8743i
            M3.a r2 = (M3.a) r2
            java.lang.Object r0 = r0.f8742h
            e0.e r0 = (e0.e) r0
            h3.C0668i.b(r11)     // Catch:{ all -> 0x003f }
            goto L_0x00c5
        L_0x003f:
            r11 = move-exception
            goto L_0x00f6
        L_0x0042:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004a:
            java.lang.Object r10 = r0.f8745k
            M3.a r10 = (M3.a) r10
            java.lang.Object r2 = r0.f8744j
            O3.r r2 = (O3.r) r2
            java.lang.Object r5 = r0.f8743i
            u3.p r5 = (u3.p) r5
            java.lang.Object r7 = r0.f8742h
            e0.e r7 = (e0.e) r7
            h3.C0668i.b(r11)
            r11 = r10
            r10 = r5
            goto L_0x0087
        L_0x0060:
            h3.C0668i.b(r11)
            r9.f()
            O3.r r11 = r9.f8730b
            O3.r r2 = r11.q()
            if (r2 == 0) goto L_0x0114
            O3.h r11 = r9.f8729a
            r11.b(r2, r3)
            M3.a r11 = r9.f8735g
            r0.f8742h = r9
            r0.f8743i = r10
            r0.f8744j = r2
            r0.f8745k = r11
            r0.f8748n = r5
            java.lang.Object r5 = r11.b(r6, r0)
            if (r5 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r7 = r9
        L_0x0087:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r5.<init>()     // Catch:{ all -> 0x00ff }
            O3.r r8 = r7.f8730b     // Catch:{ all -> 0x00ff }
            java.lang.String r8 = r8.n()     // Catch:{ all -> 0x00ff }
            r5.append(r8)     // Catch:{ all -> 0x00ff }
            java.lang.String r8 = ".tmp"
            r5.append(r8)     // Catch:{ all -> 0x00ff }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00ff }
            O3.r r2 = r2.t(r5)     // Catch:{ all -> 0x00ff }
            O3.h r5 = r7.f8729a     // Catch:{ IOException -> 0x0101 }
            r5.f(r2, r3)     // Catch:{ IOException -> 0x0101 }
            e0.g r3 = new e0.g     // Catch:{ IOException -> 0x0101 }
            O3.h r5 = r7.f8729a     // Catch:{ IOException -> 0x0101 }
            e0.c r8 = r7.f8731c     // Catch:{ IOException -> 0x0101 }
            r3.<init>(r5, r2, r8)     // Catch:{ IOException -> 0x0101 }
            r0.f8742h = r7     // Catch:{ all -> 0x00f0 }
            r0.f8743i = r11     // Catch:{ all -> 0x00f0 }
            r0.f8744j = r2     // Catch:{ all -> 0x00f0 }
            r0.f8745k = r3     // Catch:{ all -> 0x00f0 }
            r0.f8748n = r4     // Catch:{ all -> 0x00f0 }
            java.lang.Object r10 = r10.g(r3, r0)     // Catch:{ all -> 0x00f0 }
            if (r10 != r1) goto L_0x00c1
            return r1
        L_0x00c1:
            r1 = r2
            r10 = r3
            r0 = r7
            r2 = r11
        L_0x00c5:
            h3.n r11 = h3.C0673n.f9639a     // Catch:{ all -> 0x003f }
            r10.close()     // Catch:{ all -> 0x00cc }
            r10 = r6
            goto L_0x00cd
        L_0x00cc:
            r10 = move-exception
        L_0x00cd:
            if (r10 != 0) goto L_0x00ef
            O3.h r10 = r0.f8729a     // Catch:{ IOException -> 0x00e2 }
            boolean r10 = r10.g(r1)     // Catch:{ IOException -> 0x00e2 }
            if (r10 == 0) goto L_0x00e7
            O3.h r10 = r0.f8729a     // Catch:{ IOException -> 0x00e2 }
            O3.r r11 = r0.f8730b     // Catch:{ IOException -> 0x00e2 }
            r10.a(r1, r11)     // Catch:{ IOException -> 0x00e2 }
            goto L_0x00e7
        L_0x00df:
            r10 = move-exception
            r11 = r2
            goto L_0x0110
        L_0x00e2:
            r10 = move-exception
            r7 = r0
            r11 = r2
            r2 = r1
            goto L_0x0102
        L_0x00e7:
            h3.n r10 = h3.C0673n.f9639a     // Catch:{ all -> 0x00df }
            r2.a(r6)
            h3.n r10 = h3.C0673n.f9639a
            return r10
        L_0x00ef:
            throw r10     // Catch:{ IOException -> 0x00e2 }
        L_0x00f0:
            r10 = move-exception
            r1 = r2
            r0 = r7
            r2 = r11
            r11 = r10
            r10 = r3
        L_0x00f6:
            r10.close()     // Catch:{ all -> 0x00fa }
            goto L_0x00fe
        L_0x00fa:
            r10 = move-exception
            h3.C0660a.a(r11, r10)     // Catch:{ IOException -> 0x00e2 }
        L_0x00fe:
            throw r11     // Catch:{ IOException -> 0x00e2 }
        L_0x00ff:
            r10 = move-exception
            goto L_0x0110
        L_0x0101:
            r10 = move-exception
        L_0x0102:
            O3.h r0 = r7.f8729a     // Catch:{ all -> 0x00ff }
            boolean r0 = r0.g(r2)     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x010f
            O3.h r0 = r7.f8729a     // Catch:{ IOException -> 0x010f }
            r0.e(r2)     // Catch:{ IOException -> 0x010f }
        L_0x010f:
            throw r10     // Catch:{ all -> 0x00ff }
        L_0x0110:
            r11.a(r6)
            throw r10
        L_0x0114:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "must have a parent path"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.e.c(u3.p, l3.e):java.lang.Object");
    }

    public void close() {
        this.f8734f.b(true);
        this.f8733e.c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        h3.C0660a.a(r11, r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:31:0x007d, B:36:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d A[SYNTHETIC, Splitter:B:31:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(u3.q r10, l3.e r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof e0.e.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            e0.e$a r0 = (e0.e.a) r0
            int r1 = r0.f8741m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8741m = r1
            goto L_0x0018
        L_0x0013:
            e0.e$a r0 = new e0.e$a
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f8739k
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f8741m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            boolean r10 = r0.f8738j
            java.lang.Object r1 = r0.f8737i
            c0.b r1 = (c0.C0400b) r1
            java.lang.Object r0 = r0.f8736h
            e0.e r0 = (e0.e) r0
            h3.C0668i.b(r11)     // Catch:{ all -> 0x0034 }
            goto L_0x006d
        L_0x0034:
            r11 = move-exception
            goto L_0x0086
        L_0x0036:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003e:
            h3.C0668i.b(r11)
            r9.f()
            M3.a r11 = r9.f8735g
            boolean r11 = M3.a.C0036a.a(r11, r4, r3, r4)
            e0.b r2 = new e0.b     // Catch:{ all -> 0x008f }
            O3.h r5 = r9.f8729a     // Catch:{ all -> 0x008f }
            O3.r r6 = r9.f8730b     // Catch:{ all -> 0x008f }
            e0.c r7 = r9.f8731c     // Catch:{ all -> 0x008f }
            r2.<init>(r5, r6, r7)     // Catch:{ all -> 0x008f }
            java.lang.Boolean r5 = n3.b.a(r11)     // Catch:{ all -> 0x0080 }
            r0.f8736h = r9     // Catch:{ all -> 0x0080 }
            r0.f8737i = r2     // Catch:{ all -> 0x0080 }
            r0.f8738j = r11     // Catch:{ all -> 0x0080 }
            r0.f8741m = r3     // Catch:{ all -> 0x0080 }
            java.lang.Object r10 = r10.f(r2, r5, r0)     // Catch:{ all -> 0x0080 }
            if (r10 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x006d:
            r1.close()     // Catch:{ all -> 0x0072 }
            r1 = r4
            goto L_0x0073
        L_0x0072:
            r1 = move-exception
        L_0x0073:
            if (r1 != 0) goto L_0x007d
            if (r10 == 0) goto L_0x007c
            M3.a r10 = r0.f8735g
            M3.a.C0036a.b(r10, r4, r3, r4)
        L_0x007c:
            return r11
        L_0x007d:
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r11 = move-exception
            goto L_0x0094
        L_0x0080:
            r10 = move-exception
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x0086:
            r1.close()     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r1 = move-exception
            h3.C0660a.a(r11, r1)     // Catch:{ all -> 0x007e }
        L_0x008e:
            throw r11     // Catch:{ all -> 0x007e }
        L_0x008f:
            r10 = move-exception
            r0 = r9
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x0094:
            if (r10 == 0) goto L_0x009b
            M3.a r10 = r0.f8735g
            M3.a.C0036a.b(r10, r4, r3, r4)
        L_0x009b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.e.d(u3.q, l3.e):java.lang.Object");
    }

    public final void f() {
        if (this.f8734f.a()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }
}
