package c0;

import D3.C0266u;
import D3.C0268w;
import D3.p0;
import M3.c;
import h3.C0673n;
import l3.e;
import m3.C0795c;
import n3.d;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public final M3.a f6467a = c.b(false, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final C0266u f6468b = C0268w.b((p0) null, 1, (Object) null);

    public static final class a extends d {

        /* renamed from: h  reason: collision with root package name */
        public Object f6469h;

        /* renamed from: i  reason: collision with root package name */
        public Object f6470i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f6471j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ s f6472k;

        /* renamed from: l  reason: collision with root package name */
        public int f6473l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(s sVar, e eVar) {
            super(eVar);
            this.f6472k = sVar;
        }

        public final Object o(Object obj) {
            this.f6471j = obj;
            this.f6473l |= Integer.MIN_VALUE;
            return this.f6472k.c(this);
        }
    }

    public final Object a(e eVar) {
        Object F4 = this.f6468b.F(eVar);
        return F4 == C0795c.c() ? F4 : C0673n.f9639a;
    }

    public abstract Object b(e eVar);

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c A[SYNTHETIC, Splitter:B:33:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(l3.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof c0.s.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            c0.s$a r0 = (c0.s.a) r0
            int r1 = r0.f6473l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6473l = r1
            goto L_0x0018
        L_0x0013:
            c0.s$a r0 = new c0.s$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f6471j
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f6473l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f6470i
            M3.a r1 = (M3.a) r1
            java.lang.Object r0 = r0.f6469h
            c0.s r0 = (c0.s) r0
            h3.C0668i.b(r7)     // Catch:{ all -> 0x0035 }
            goto L_0x008b
        L_0x0035:
            r7 = move-exception
            goto L_0x0096
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003f:
            java.lang.Object r2 = r0.f6470i
            M3.a r2 = (M3.a) r2
            java.lang.Object r4 = r0.f6469h
            c0.s r4 = (c0.s) r4
            h3.C0668i.b(r7)
            r7 = r2
            goto L_0x006a
        L_0x004c:
            h3.C0668i.b(r7)
            D3.u r7 = r6.f6468b
            boolean r7 = r7.D()
            if (r7 == 0) goto L_0x005a
            h3.n r7 = h3.C0673n.f9639a
            return r7
        L_0x005a:
            M3.a r7 = r6.f6467a
            r0.f6469h = r6
            r0.f6470i = r7
            r0.f6473l = r4
            java.lang.Object r2 = r7.b(r5, r0)
            if (r2 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r4 = r6
        L_0x006a:
            D3.u r2 = r4.f6468b     // Catch:{ all -> 0x0078 }
            boolean r2 = r2.D()     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x007c
            h3.n r0 = h3.C0673n.f9639a     // Catch:{ all -> 0x0078 }
            r7.a(r5)
            return r0
        L_0x0078:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L_0x0096
        L_0x007c:
            r0.f6469h = r4     // Catch:{ all -> 0x0078 }
            r0.f6470i = r7     // Catch:{ all -> 0x0078 }
            r0.f6473l = r3     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r4.b(r0)     // Catch:{ all -> 0x0078 }
            if (r0 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r1 = r7
            r0 = r4
        L_0x008b:
            D3.u r7 = r0.f6468b     // Catch:{ all -> 0x0035 }
            h3.n r0 = h3.C0673n.f9639a     // Catch:{ all -> 0x0035 }
            r7.t(r0)     // Catch:{ all -> 0x0035 }
            r1.a(r5)
            return r0
        L_0x0096:
            r1.a(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.s.c(l3.e):java.lang.Object");
    }
}
