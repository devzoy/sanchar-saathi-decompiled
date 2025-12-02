package D3;

import K3.h;
import h3.C0660a;
import l3.e;
import v3.l;

public abstract class T extends h {

    /* renamed from: g  reason: collision with root package name */
    public int f801g;

    public T(int i4) {
        this.f801g = i4;
    }

    public abstract void c(Object obj, Throwable th);

    public abstract e d();

    public Throwable e(Object obj) {
        C0271z zVar = obj instanceof C0271z ? (C0271z) obj : null;
        if (zVar != null) {
            return zVar.f872a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C0660a.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            l.b(th);
            H.a(d().a(), new L("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object h();

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r4.T0() != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        if (r4.T0() != false) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            K3.i r0 = r10.f1751f
            l3.e r1 = r10.d()     // Catch:{ all -> 0x0023 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            v3.l.c(r1, r2)     // Catch:{ all -> 0x0023 }
            I3.j r1 = (I3.C0281j) r1     // Catch:{ all -> 0x0023 }
            l3.e r2 = r1.f1554i     // Catch:{ all -> 0x0023 }
            java.lang.Object r1 = r1.f1556k     // Catch:{ all -> 0x0023 }
            l3.i r3 = r2.a()     // Catch:{ all -> 0x0023 }
            java.lang.Object r1 = I3.J.c(r3, r1)     // Catch:{ all -> 0x0023 }
            I3.F r4 = I3.J.f1532a     // Catch:{ all -> 0x0023 }
            r5 = 0
            if (r1 == r4) goto L_0x0026
            D3.L0 r4 = D3.E.g(r2, r3, r1)     // Catch:{ all -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r1 = move-exception
            goto L_0x00b9
        L_0x0026:
            r4 = r5
        L_0x0027:
            l3.i r6 = r2.a()     // Catch:{ all -> 0x0046 }
            java.lang.Object r7 = r10.h()     // Catch:{ all -> 0x0046 }
            java.lang.Throwable r8 = r10.e(r7)     // Catch:{ all -> 0x0046 }
            if (r8 != 0) goto L_0x0048
            int r9 = r10.f801g     // Catch:{ all -> 0x0046 }
            boolean r9 = D3.U.b(r9)     // Catch:{ all -> 0x0046 }
            if (r9 == 0) goto L_0x0048
            D3.p0$b r9 = D3.p0.f838b     // Catch:{ all -> 0x0046 }
            l3.i$b r6 = r6.d(r9)     // Catch:{ all -> 0x0046 }
            D3.p0 r6 = (D3.p0) r6     // Catch:{ all -> 0x0046 }
            goto L_0x0049
        L_0x0046:
            r2 = move-exception
            goto L_0x00ad
        L_0x0048:
            r6 = r5
        L_0x0049:
            if (r6 == 0) goto L_0x0066
            boolean r9 = r6.b()     // Catch:{ all -> 0x0046 }
            if (r9 != 0) goto L_0x0066
            java.util.concurrent.CancellationException r6 = r6.z()     // Catch:{ all -> 0x0046 }
            r10.c(r7, r6)     // Catch:{ all -> 0x0046 }
            h3.h$a r7 = h3.C0667h.f9633e     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = h3.C0668i.a(r6)     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = h3.C0667h.a(r6)     // Catch:{ all -> 0x0046 }
            r2.q(r6)     // Catch:{ all -> 0x0046 }
            goto L_0x0083
        L_0x0066:
            if (r8 == 0) goto L_0x0076
            h3.h$a r6 = h3.C0667h.f9633e     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = h3.C0668i.a(r8)     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = h3.C0667h.a(r6)     // Catch:{ all -> 0x0046 }
            r2.q(r6)     // Catch:{ all -> 0x0046 }
            goto L_0x0083
        L_0x0076:
            h3.h$a r6 = h3.C0667h.f9633e     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = r10.f(r7)     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = h3.C0667h.a(r6)     // Catch:{ all -> 0x0046 }
            r2.q(r6)     // Catch:{ all -> 0x0046 }
        L_0x0083:
            h3.n r2 = h3.C0673n.f9639a     // Catch:{ all -> 0x0046 }
            if (r4 == 0) goto L_0x008d
            boolean r2 = r4.T0()     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x0090
        L_0x008d:
            I3.J.a(r3, r1)     // Catch:{ all -> 0x0023 }
        L_0x0090:
            r0.a()     // Catch:{ all -> 0x009a }
            h3.n r0 = h3.C0673n.f9639a     // Catch:{ all -> 0x009a }
            java.lang.Object r0 = h3.C0667h.a(r0)     // Catch:{ all -> 0x009a }
            goto L_0x00a5
        L_0x009a:
            r0 = move-exception
            h3.h$a r1 = h3.C0667h.f9633e
            java.lang.Object r0 = h3.C0668i.a(r0)
            java.lang.Object r0 = h3.C0667h.a(r0)
        L_0x00a5:
            java.lang.Throwable r0 = h3.C0667h.b(r0)
            r10.g(r5, r0)
            goto L_0x00d7
        L_0x00ad:
            if (r4 == 0) goto L_0x00b5
            boolean r4 = r4.T0()     // Catch:{ all -> 0x0023 }
            if (r4 == 0) goto L_0x00b8
        L_0x00b5:
            I3.J.a(r3, r1)     // Catch:{ all -> 0x0023 }
        L_0x00b8:
            throw r2     // Catch:{ all -> 0x0023 }
        L_0x00b9:
            h3.h$a r2 = h3.C0667h.f9633e     // Catch:{ all -> 0x00c5 }
            r0.a()     // Catch:{ all -> 0x00c5 }
            h3.n r0 = h3.C0673n.f9639a     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = h3.C0667h.a(r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x00d0
        L_0x00c5:
            r0 = move-exception
            h3.h$a r2 = h3.C0667h.f9633e
            java.lang.Object r0 = h3.C0668i.a(r0)
            java.lang.Object r0 = h3.C0667h.a(r0)
        L_0x00d0:
            java.lang.Throwable r0 = h3.C0667h.b(r0)
            r10.g(r1, r0)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.T.run():void");
    }
}
