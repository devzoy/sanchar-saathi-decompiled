package w1;

import R1.b;
import android.os.SystemClock;
import z1.C1021d;
import z1.C1023f;
import z1.C1033p;
import z1.C1034q;

public final class F implements b {

    /* renamed from: a  reason: collision with root package name */
    public final C0972e f12528a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12529b;

    /* renamed from: c  reason: collision with root package name */
    public final C0969b f12530c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12531d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12532e;

    public F(C0972e eVar, int i4, C0969b bVar, long j4, long j5, String str, String str2) {
        this.f12528a = eVar;
        this.f12529b = i4;
        this.f12530c = bVar;
        this.f12531d = j4;
        this.f12532e = j5;
    }

    public static F b(C0972e eVar, int i4, C0969b bVar) {
        boolean z4;
        if (!eVar.v()) {
            return null;
        }
        C1034q a4 = C1033p.b().a();
        if (a4 == null) {
            z4 = true;
        } else if (!a4.g()) {
            return null;
        } else {
            z4 = a4.h();
            C0989w r4 = eVar.r(bVar);
            if (r4 != null) {
                if (!(r4.t() instanceof C1021d)) {
                    return null;
                }
                C1021d dVar = (C1021d) r4.t();
                if (dVar.I() && !dVar.j()) {
                    C1023f c4 = c(r4, dVar, i4);
                    if (c4 == null) {
                        return null;
                    }
                    r4.D();
                    z4 = c4.i();
                }
            }
        }
        return new F(eVar, i4, bVar, z4 ? System.currentTimeMillis() : 0, z4 ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    public static C1023f c(C0989w wVar, C1021d dVar, int i4) {
        int[] e4;
        int[] g4;
        C1023f G4 = dVar.G();
        if (G4 == null || !G4.h() || ((e4 = G4.e()) != null ? !D1.b.a(e4, i4) : !((g4 = G4.g()) == null || !D1.b.a(g4, i4))) || wVar.C() >= G4.d()) {
            return null;
        }
        return G4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(R1.f r26) {
        /*
            r25 = this;
            r0 = r25
            w1.e r1 = r0.f12528a
            boolean r2 = r1.v()
            if (r2 != 0) goto L_0x000c
            goto L_0x00f1
        L_0x000c:
            z1.p r2 = z1.C1033p.b()
            z1.q r2 = r2.a()
            if (r2 == 0) goto L_0x001c
            boolean r3 = r2.g()
            if (r3 == 0) goto L_0x00f1
        L_0x001c:
            w1.b r3 = r0.f12530c
            w1.w r3 = r1.r(r3)
            if (r3 == 0) goto L_0x00f1
            v1.a$f r4 = r3.t()
            boolean r4 = r4 instanceof z1.C1021d
            if (r4 == 0) goto L_0x00f1
            v1.a$f r4 = r3.t()
            z1.d r4 = (z1.C1021d) r4
            long r5 = r0.f12531d
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r10 = 1
            r11 = 0
            if (r9 <= 0) goto L_0x003e
            r12 = r10
            goto L_0x003f
        L_0x003e:
            r12 = r11
        L_0x003f:
            int r23 = r4.y()
            r13 = 100
            if (r2 == 0) goto L_0x0083
            boolean r14 = r2.h()
            r12 = r12 & r14
            int r14 = r2.d()
            int r15 = r2.e()
            int r2 = r2.i()
            boolean r16 = r4.I()
            if (r16 == 0) goto L_0x007f
            boolean r16 = r4.j()
            if (r16 != 0) goto L_0x007f
            int r12 = r0.f12529b
            z1.f r3 = c(r3, r4, r12)
            if (r3 == 0) goto L_0x00f1
            boolean r4 = r3.i()
            if (r4 == 0) goto L_0x0075
            if (r9 <= 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r10 = r11
        L_0x0076:
            int r3 = r3.d()
            r9 = r3
            r12 = r10
            r3 = r2
        L_0x007d:
            r2 = r14
            goto L_0x0088
        L_0x007f:
            r3 = r2
            r2 = r14
            r9 = r15
            goto L_0x0088
        L_0x0083:
            r14 = 5000(0x1388, float:7.006E-42)
            r3 = r11
            r9 = r13
            goto L_0x007d
        L_0x0088:
            boolean r4 = r26.i()
            r10 = -1
            if (r4 == 0) goto L_0x0093
            r15 = r11
            r16 = r15
            goto L_0x00c3
        L_0x0093:
            boolean r4 = r26.g()
            if (r4 == 0) goto L_0x009d
            r16 = r10
            r15 = r13
            goto L_0x00c3
        L_0x009d:
            java.lang.Exception r4 = r26.e()
            boolean r11 = r4 instanceof v1.C0948b
            if (r11 == 0) goto L_0x00c0
            v1.b r4 = (v1.C0948b) r4
            com.google.android.gms.common.api.Status r4 = r4.a()
            int r11 = r4.e()
            u1.a r4 = r4.d()
            if (r4 != 0) goto L_0x00b9
        L_0x00b5:
            r16 = r10
        L_0x00b7:
            r15 = r11
            goto L_0x00c3
        L_0x00b9:
            int r4 = r4.d()
            r16 = r4
            goto L_0x00b7
        L_0x00c0:
            r11 = 101(0x65, float:1.42E-43)
            goto L_0x00b5
        L_0x00c3:
            if (r12 == 0) goto L_0x00d8
            long r7 = r0.f12532e
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = android.os.SystemClock.elapsedRealtime()
            long r12 = r12 - r7
            int r4 = (int) r12
            r24 = r4
            r17 = r5
            r19 = r10
            goto L_0x00de
        L_0x00d8:
            r17 = r7
            r19 = r17
            r24 = r10
        L_0x00de:
            int r14 = r0.f12529b
            z1.m r4 = new z1.m
            r21 = 0
            r22 = 0
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r19, r21, r22, r23, r24)
            long r5 = (long) r2
            r2 = r4
            r4 = r5
            r6 = r9
            r1.y(r2, r3, r4, r6)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.F.a(R1.f):void");
    }
}
