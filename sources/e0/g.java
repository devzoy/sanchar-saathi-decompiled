package e0;

import O3.h;
import O3.r;
import c0.C0398B;
import l3.e;
import n3.d;
import v3.l;

public final class g extends C0587b implements C0398B {

    public static final class a extends d {

        /* renamed from: h  reason: collision with root package name */
        public Object f8749h;

        /* renamed from: i  reason: collision with root package name */
        public Object f8750i;

        /* renamed from: j  reason: collision with root package name */
        public Object f8751j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f8752k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ g f8753l;

        /* renamed from: m  reason: collision with root package name */
        public int f8754m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar, e eVar) {
            super(eVar);
            this.f8753l = gVar;
        }

        public final Object o(Object obj) {
            this.f8752k = obj;
            this.f8754m |= Integer.MIN_VALUE;
            return this.f8753l.b((Object) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, r rVar, c cVar) {
        super(hVar, rVar, cVar);
        l.e(hVar, "fileSystem");
        l.e(rVar, "path");
        l.e(cVar, "serializer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: O3.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: O3.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: O3.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: O3.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: O3.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: O3.f} */
    /* JADX WARNING: type inference failed for: r1v1, types: [O3.f] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079 A[SYNTHETIC, Splitter:B:26:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0097 A[Catch:{ all -> 0x008b, all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4 A[SYNTHETIC, Splitter:B:47:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r9, l3.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof e0.g.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            e0.g$a r0 = (e0.g.a) r0
            int r1 = r0.f8754m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8754m = r1
            goto L_0x0018
        L_0x0013:
            e0.g$a r0 = new e0.g$a
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f8752k
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f8754m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r9 = r0.f8751j
            java.io.Closeable r9 = (java.io.Closeable) r9
            java.lang.Object r1 = r0.f8750i
            O3.f r1 = (O3.f) r1
            java.lang.Object r0 = r0.f8749h
            java.io.Closeable r0 = (java.io.Closeable) r0
            h3.C0668i.b(r10)     // Catch:{ all -> 0x0036 }
            goto L_0x0072
        L_0x0036:
            r10 = move-exception
            goto L_0x0085
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0040:
            h3.C0668i.b(r10)
            r8.f()
            O3.h r10 = r8.g()
            O3.r r2 = r8.h()
            O3.f r10 = r10.j(r2)
            r5 = 0
            O3.x r2 = O3.f.s(r10, r5, r3, r4)     // Catch:{ all -> 0x00a5 }
            O3.c r2 = O3.o.a(r2)     // Catch:{ all -> 0x00a5 }
            e0.c r5 = r8.i()     // Catch:{ all -> 0x0081 }
            r0.f8749h = r10     // Catch:{ all -> 0x0081 }
            r0.f8750i = r10     // Catch:{ all -> 0x0081 }
            r0.f8751j = r2     // Catch:{ all -> 0x0081 }
            r0.f8754m = r3     // Catch:{ all -> 0x0081 }
            java.lang.Object r9 = r5.c(r9, r2, r0)     // Catch:{ all -> 0x0081 }
            if (r9 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r0 = r10
            r1 = r0
            r9 = r2
        L_0x0072:
            r1.flush()     // Catch:{ all -> 0x0036 }
            h3.n r10 = h3.C0673n.f9639a     // Catch:{ all -> 0x0036 }
            if (r9 == 0) goto L_0x007f
            r9.close()     // Catch:{ all -> 0x007d }
            goto L_0x007f
        L_0x007d:
            r9 = move-exception
            goto L_0x0095
        L_0x007f:
            r9 = r4
            goto L_0x0095
        L_0x0081:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r2
        L_0x0085:
            if (r9 == 0) goto L_0x0093
            r9.close()     // Catch:{ all -> 0x008b }
            goto L_0x0093
        L_0x008b:
            r9 = move-exception
            h3.C0660a.a(r10, r9)     // Catch:{ all -> 0x0090 }
            goto L_0x0093
        L_0x0090:
            r9 = move-exception
            r10 = r0
            goto L_0x00a6
        L_0x0093:
            r9 = r10
            r10 = r4
        L_0x0095:
            if (r9 != 0) goto L_0x00a4
            v3.l.b(r10)     // Catch:{ all -> 0x0090 }
            h3.n r9 = h3.C0673n.f9639a     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x00b3
            r0.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00b3
        L_0x00a2:
            r4 = move-exception
            goto L_0x00b3
        L_0x00a4:
            throw r9     // Catch:{ all -> 0x0090 }
        L_0x00a5:
            r9 = move-exception
        L_0x00a6:
            if (r10 == 0) goto L_0x00b0
            r10.close()     // Catch:{ all -> 0x00ac }
            goto L_0x00b0
        L_0x00ac:
            r10 = move-exception
            h3.C0660a.a(r9, r10)
        L_0x00b0:
            r7 = r4
            r4 = r9
            r9 = r7
        L_0x00b3:
            if (r4 != 0) goto L_0x00bb
            v3.l.b(r9)
            h3.n r9 = h3.C0673n.f9639a
            return r9
        L_0x00bb:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.g.b(java.lang.Object, l3.e):java.lang.Object");
    }
}
