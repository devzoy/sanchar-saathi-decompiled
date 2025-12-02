package G3;

import l3.e;
import n3.d;
import v3.w;

public abstract /* synthetic */ class m {

    public static final class a implements e {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ w f1327e;

        public a(w wVar) {
            this.f1327e = wVar;
        }

        public Object b(Object obj, e eVar) {
            this.f1327e.f12469e = obj;
            throw new H3.a(this);
        }
    }

    public static final class b extends d {

        /* renamed from: h  reason: collision with root package name */
        public Object f1328h;

        /* renamed from: i  reason: collision with root package name */
        public Object f1329i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f1330j;

        /* renamed from: k  reason: collision with root package name */
        public int f1331k;

        public b(e eVar) {
            super(eVar);
        }

        public final Object o(Object obj) {
            this.f1330j = obj;
            this.f1331k |= Integer.MIN_VALUE;
            return f.i((d) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(G3.d r4, l3.e r5) {
        /*
            boolean r0 = r5 instanceof G3.m.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            G3.m$b r0 = (G3.m.b) r0
            int r1 = r0.f1331k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1331k = r1
            goto L_0x0018
        L_0x0013:
            G3.m$b r0 = new G3.m$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f1330j
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f1331k
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.f1329i
            G3.m$a r4 = (G3.m.a) r4
            java.lang.Object r0 = r0.f1328h
            v3.w r0 = (v3.w) r0
            h3.C0668i.b(r5)     // Catch:{ a -> 0x0031 }
            goto L_0x005e
        L_0x0031:
            r5 = move-exception
            goto L_0x005b
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            h3.C0668i.b(r5)
            v3.w r5 = new v3.w
            r5.<init>()
            G3.m$a r2 = new G3.m$a
            r2.<init>(r5)
            r0.f1328h = r5     // Catch:{ a -> 0x0057 }
            r0.f1329i = r2     // Catch:{ a -> 0x0057 }
            r0.f1331k = r3     // Catch:{ a -> 0x0057 }
            java.lang.Object r4 = r4.c(r2, r0)     // Catch:{ a -> 0x0057 }
            if (r4 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r0 = r5
            goto L_0x005e
        L_0x0057:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005b:
            H3.j.a(r5, r4)
        L_0x005e:
            java.lang.Object r4 = r0.f12469e
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.m.a(G3.d, l3.e):java.lang.Object");
    }
}
