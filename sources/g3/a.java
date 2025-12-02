package G3;

import l3.e;
import n3.d;

public abstract class a implements d {

    /* renamed from: G3.a$a  reason: collision with other inner class name */
    public static final class C0018a extends d {

        /* renamed from: h  reason: collision with root package name */
        public Object f1270h;

        /* renamed from: i  reason: collision with root package name */
        public /* synthetic */ Object f1271i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ a f1272j;

        /* renamed from: k  reason: collision with root package name */
        public int f1273k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0018a(a aVar, e eVar) {
            super(eVar);
            this.f1272j = aVar;
        }

        public final Object o(Object obj) {
            this.f1271i = obj;
            this.f1273k |= Integer.MIN_VALUE;
            return this.f1272j.c((e) null, this);
        }
    }

    public abstract Object b(e eVar, e eVar2);

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(G3.e r6, l3.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof G3.a.C0018a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            G3.a$a r0 = (G3.a.C0018a) r0
            int r1 = r0.f1273k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1273k = r1
            goto L_0x0018
        L_0x0013:
            G3.a$a r0 = new G3.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f1271i
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f1273k
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f1270h
            H3.n r6 = (H3.n) r6
            h3.C0668i.b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            h3.C0668i.b(r7)
            H3.n r7 = new H3.n
            l3.i r2 = r0.a()
            r7.<init>(r6, r2)
            r0.f1270h = r7     // Catch:{ all -> 0x0055 }
            r0.f1273k = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.b(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.p()
            h3.n r6 = h3.C0673n.f9639a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.p()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.a.c(G3.e, l3.e):java.lang.Object");
    }
}
