package D3;

import java.util.concurrent.locks.LockSupport;
import l3.i;
import v3.l;

/* renamed from: D3.e  reason: case insensitive filesystem */
public final class C0240e extends C0232a {

    /* renamed from: h  reason: collision with root package name */
    public final Thread f818h;

    /* renamed from: i  reason: collision with root package name */
    public final Z f819i;

    public C0240e(i iVar, Thread thread, Z z4) {
        super(iVar, true, true);
        this.f818h = thread;
        this.f819i = z4;
    }

    public void P(Object obj) {
        if (!l.a(Thread.currentThread(), this.f818h)) {
            Thread thread = this.f818h;
            C0236c.a();
            LockSupport.unpark(thread);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: D3.z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object T0() {
        /*
            r6 = this;
            D3.C0236c.a()
            D3.Z r0 = r6.f819i     // Catch:{ all -> 0x000e }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0010
            D3.Z.T(r0, r2, r1, r3)     // Catch:{ all -> 0x000e }
            goto L_0x0010
        L_0x000e:
            r0 = move-exception
            goto L_0x0063
        L_0x0010:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0052
            D3.Z r0 = r6.f819i     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0021
            long r4 = r0.W()     // Catch:{ all -> 0x001f }
            goto L_0x0026
        L_0x001f:
            r0 = move-exception
            goto L_0x005b
        L_0x0021:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0026:
            boolean r0 = r6.D()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0033
            D3.C0236c.a()     // Catch:{ all -> 0x001f }
            java.util.concurrent.locks.LockSupport.parkNanos(r6, r4)     // Catch:{ all -> 0x001f }
            goto L_0x0010
        L_0x0033:
            D3.Z r0 = r6.f819i     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x003a
            D3.Z.O(r0, r2, r1, r3)     // Catch:{ all -> 0x000e }
        L_0x003a:
            D3.C0236c.a()
            java.lang.Object r0 = r6.k0()
            java.lang.Object r0 = D3.x0.h(r0)
            boolean r1 = r0 instanceof D3.C0271z
            if (r1 == 0) goto L_0x004c
            r3 = r0
            D3.z r3 = (D3.C0271z) r3
        L_0x004c:
            if (r3 != 0) goto L_0x004f
            return r0
        L_0x004f:
            java.lang.Throwable r0 = r3.f872a
            throw r0
        L_0x0052:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ all -> 0x001f }
            r0.<init>()     // Catch:{ all -> 0x001f }
            r6.S(r0)     // Catch:{ all -> 0x001f }
            throw r0     // Catch:{ all -> 0x001f }
        L_0x005b:
            D3.Z r4 = r6.f819i     // Catch:{ all -> 0x000e }
            if (r4 == 0) goto L_0x0062
            D3.Z.O(r4, r2, r1, r3)     // Catch:{ all -> 0x000e }
        L_0x0062:
            throw r0     // Catch:{ all -> 0x000e }
        L_0x0063:
            D3.C0236c.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.C0240e.T0():java.lang.Object");
    }

    public boolean p0() {
        return true;
    }
}
