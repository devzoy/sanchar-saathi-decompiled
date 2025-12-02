package G3;

import F3.r;
import l3.e;
import l3.i;
import l3.j;
import n3.d;
import u3.p;
import v3.g;

public final class b extends c {

    /* renamed from: i  reason: collision with root package name */
    public final p f1274i;

    public static final class a extends d {

        /* renamed from: h  reason: collision with root package name */
        public Object f1275h;

        /* renamed from: i  reason: collision with root package name */
        public /* synthetic */ Object f1276i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ b f1277j;

        /* renamed from: k  reason: collision with root package name */
        public int f1278k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, e eVar) {
            super(eVar);
            this.f1277j = bVar;
        }

        public final Object o(Object obj) {
            this.f1276i = obj;
            this.f1278k |= Integer.MIN_VALUE;
            return this.f1277j.f((r) null, this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(p pVar, i iVar, int i4, F3.a aVar, int i5, g gVar) {
        this(pVar, (i5 & 2) != 0 ? j.f11131e : iVar, (i5 & 4) != 0 ? -2 : i4, (i5 & 8) != 0 ? F3.a.SUSPEND : aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(F3.r r5, l3.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof G3.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            G3.b$a r0 = (G3.b.a) r0
            int r1 = r0.f1278k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1278k = r1
            goto L_0x0018
        L_0x0013:
            G3.b$a r0 = new G3.b$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f1276i
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f1278k
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f1275h
            F3.r r5 = (F3.r) r5
            h3.C0668i.b(r6)
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            h3.C0668i.b(r6)
            r0.f1275h = r5
            r0.f1278k = r3
            java.lang.Object r6 = super.f(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            boolean r5 = r5.G()
            if (r5 == 0) goto L_0x004c
            h3.n r5 = h3.C0673n.f9639a
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.b.f(F3.r, l3.e):java.lang.Object");
    }

    public H3.e g(i iVar, int i4, F3.a aVar) {
        return new b(this.f1274i, iVar, i4, aVar);
    }

    public b(p pVar, i iVar, int i4, F3.a aVar) {
        super(pVar, iVar, i4, aVar);
        this.f1274i = pVar;
    }
}
