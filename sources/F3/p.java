package F3;

import D3.C0254l;
import D3.E;
import D3.I;
import D3.K;
import h3.C0667h;
import h3.C0673n;
import l3.e;
import l3.i;
import l3.j;
import n3.d;
import u3.l;
import v3.m;

public abstract class p {

    public static final class a extends d {

        /* renamed from: h  reason: collision with root package name */
        public Object f1086h;

        /* renamed from: i  reason: collision with root package name */
        public Object f1087i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f1088j;

        /* renamed from: k  reason: collision with root package name */
        public int f1089k;

        public a(e eVar) {
            super(eVar);
        }

        public final Object o(Object obj) {
            this.f1088j = obj;
            this.f1089k |= Integer.MIN_VALUE;
            return p.a((r) null, (u3.a) null, this);
        }
    }

    public static final class b extends m implements l {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ C0254l f1090f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C0254l lVar) {
            super(1);
            this.f1090f = lVar;
        }

        public final void a(Throwable th) {
            C0254l lVar = this.f1090f;
            C0667h.a aVar = C0667h.f9633e;
            lVar.q(C0667h.a(C0673n.f9639a));
        }

        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return C0673n.f9639a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: u3.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(F3.r r4, u3.a r5, l3.e r6) {
        /*
            boolean r0 = r6 instanceof F3.p.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            F3.p$a r0 = (F3.p.a) r0
            int r1 = r0.f1089k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1089k = r1
            goto L_0x0018
        L_0x0013:
            F3.p$a r0 = new F3.p$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f1088j
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f1089k
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.f1087i
            r5 = r4
            u3.a r5 = (u3.a) r5
            java.lang.Object r4 = r0.f1086h
            F3.r r4 = (F3.r) r4
            h3.C0668i.b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x0075
        L_0x0032:
            r4 = move-exception
            goto L_0x007b
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            h3.C0668i.b(r6)
            l3.i r6 = r0.a()
            D3.p0$b r2 = D3.p0.f838b
            l3.i$b r6 = r6.d(r2)
            if (r6 != r4) goto L_0x007f
            r0.f1086h = r4     // Catch:{ all -> 0x0032 }
            r0.f1087i = r5     // Catch:{ all -> 0x0032 }
            r0.f1089k = r3     // Catch:{ all -> 0x0032 }
            D3.m r6 = new D3.m     // Catch:{ all -> 0x0032 }
            l3.e r2 = m3.C0794b.b(r0)     // Catch:{ all -> 0x0032 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0032 }
            r6.A()     // Catch:{ all -> 0x0032 }
            F3.p$b r2 = new F3.p$b     // Catch:{ all -> 0x0032 }
            r2.<init>(r6)     // Catch:{ all -> 0x0032 }
            r4.A(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r6.x()     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = m3.C0795c.c()     // Catch:{ all -> 0x0032 }
            if (r4 != r6) goto L_0x0072
            n3.h.c(r0)     // Catch:{ all -> 0x0032 }
        L_0x0072:
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r5.c()
            h3.n r4 = h3.C0673n.f9639a
            return r4
        L_0x007b:
            r5.c()
            throw r4
        L_0x007f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.p.a(F3.r, u3.a, l3.e):java.lang.Object");
    }

    public static final s b(I i4, i iVar, int i5, a aVar, K k4, l lVar, u3.p pVar) {
        q qVar = new q(E.d(i4, iVar), g.b(i5, aVar, (l) null, 4, (Object) null));
        if (lVar != null) {
            qVar.j(lVar);
        }
        qVar.S0(k4, qVar, pVar);
        return qVar;
    }

    public static /* synthetic */ s c(I i4, i iVar, int i5, a aVar, K k4, l lVar, u3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            iVar = j.f11131e;
        }
        i iVar2 = iVar;
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        int i7 = i5;
        if ((i6 & 4) != 0) {
            aVar = a.SUSPEND;
        }
        a aVar2 = aVar;
        if ((i6 & 8) != 0) {
            k4 = K.DEFAULT;
        }
        K k5 = k4;
        if ((i6 & 16) != 0) {
            lVar = null;
        }
        return b(i4, iVar2, i7, aVar2, k5, lVar, pVar);
    }
}
