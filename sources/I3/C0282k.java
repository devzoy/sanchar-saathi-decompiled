package I3;

import l3.e;
import u3.l;

/* renamed from: I3.k  reason: case insensitive filesystem */
public abstract class C0282k {

    /* renamed from: a  reason: collision with root package name */
    public static final F f1557a = new F("UNDEFINED");

    /* renamed from: b  reason: collision with root package name */
    public static final F f1558b = new F("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (r8.T0() != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a3, code lost:
        if (r8.T0() != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(l3.e r6, java.lang.Object r7, u3.l r8) {
        /*
            boolean r0 = r6 instanceof I3.C0281j
            if (r0 == 0) goto L_0x00b2
            I3.j r6 = (I3.C0281j) r6
            java.lang.Object r8 = D3.D.c(r7, r8)
            D3.F r0 = r6.f1553h
            l3.i r1 = r6.a()
            boolean r0 = r0.L(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f1555j = r8
            r6.f801g = r1
            D3.F r7 = r6.f1553h
            l3.i r8 = r6.a()
            r7.K(r8, r6)
            goto L_0x00b5
        L_0x0026:
            D3.J0 r0 = D3.J0.f784a
            D3.Z r0 = r0.b()
            boolean r2 = r0.U()
            if (r2 == 0) goto L_0x003b
            r6.f1555j = r8
            r6.f801g = r1
            r0.Q(r6)
            goto L_0x00b5
        L_0x003b:
            r0.S(r1)
            r2 = 0
            l3.i r3 = r6.a()     // Catch:{ all -> 0x0068 }
            D3.p0$b r4 = D3.p0.f838b     // Catch:{ all -> 0x0068 }
            l3.i$b r3 = r3.d(r4)     // Catch:{ all -> 0x0068 }
            D3.p0 r3 = (D3.p0) r3     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x006a
            boolean r4 = r3.b()     // Catch:{ all -> 0x0068 }
            if (r4 != 0) goto L_0x006a
            java.util.concurrent.CancellationException r7 = r3.z()     // Catch:{ all -> 0x0068 }
            r6.c(r8, r7)     // Catch:{ all -> 0x0068 }
            h3.h$a r8 = h3.C0667h.f9633e     // Catch:{ all -> 0x0068 }
            java.lang.Object r7 = h3.C0668i.a(r7)     // Catch:{ all -> 0x0068 }
            java.lang.Object r7 = h3.C0667h.a(r7)     // Catch:{ all -> 0x0068 }
            r6.q(r7)     // Catch:{ all -> 0x0068 }
            goto L_0x0092
        L_0x0068:
            r7 = move-exception
            goto L_0x00a9
        L_0x006a:
            l3.e r8 = r6.f1554i     // Catch:{ all -> 0x0068 }
            java.lang.Object r3 = r6.f1556k     // Catch:{ all -> 0x0068 }
            l3.i r4 = r8.a()     // Catch:{ all -> 0x0068 }
            java.lang.Object r3 = I3.J.c(r4, r3)     // Catch:{ all -> 0x0068 }
            I3.F r5 = I3.J.f1532a     // Catch:{ all -> 0x0068 }
            if (r3 == r5) goto L_0x007f
            D3.L0 r8 = D3.E.g(r8, r4, r3)     // Catch:{ all -> 0x0068 }
            goto L_0x0080
        L_0x007f:
            r8 = r2
        L_0x0080:
            l3.e r5 = r6.f1554i     // Catch:{ all -> 0x009c }
            r5.q(r7)     // Catch:{ all -> 0x009c }
            h3.n r7 = h3.C0673n.f9639a     // Catch:{ all -> 0x009c }
            if (r8 == 0) goto L_0x008f
            boolean r7 = r8.T0()     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0092
        L_0x008f:
            I3.J.a(r4, r3)     // Catch:{ all -> 0x0068 }
        L_0x0092:
            boolean r7 = r0.X()     // Catch:{ all -> 0x0068 }
            if (r7 != 0) goto L_0x0092
        L_0x0098:
            r0.N(r1)
            goto L_0x00b5
        L_0x009c:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a5
            boolean r8 = r8.T0()     // Catch:{ all -> 0x0068 }
            if (r8 == 0) goto L_0x00a8
        L_0x00a5:
            I3.J.a(r4, r3)     // Catch:{ all -> 0x0068 }
        L_0x00a8:
            throw r7     // Catch:{ all -> 0x0068 }
        L_0x00a9:
            r6.g(r7, r2)     // Catch:{ all -> 0x00ad }
            goto L_0x0098
        L_0x00ad:
            r6 = move-exception
            r0.N(r1)
            throw r6
        L_0x00b2:
            r6.q(r7)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.C0282k.b(l3.e, java.lang.Object, u3.l):void");
    }

    public static /* synthetic */ void c(e eVar, Object obj, l lVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        b(eVar, obj, lVar);
    }
}
