package a1;

import Q0.i;
import Q0.l;
import R0.E;
import R0.o;
import R0.u;
import R0.x;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.List;

/* renamed from: a1.c  reason: case insensitive filesystem */
public class C0346c implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    public static final String f3959g = i.i("EnqueueRunnable");

    /* renamed from: e  reason: collision with root package name */
    public final x f3960e;

    /* renamed from: f  reason: collision with root package name */
    public final o f3961f;

    public C0346c(x xVar) {
        this(xVar, new o());
    }

    public static boolean b(x xVar) {
        boolean c4 = c(xVar.g(), xVar.f(), (String[]) x.l(xVar).toArray(new String[0]), xVar.d(), xVar.b());
        xVar.k();
        return c4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(R0.E r18, java.util.List r19, java.lang.String[] r20, java.lang.String r21, Q0.d r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            long r3 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r5 = r18.q()
            r7 = 0
            if (r0 == 0) goto L_0x0016
            int r8 = r0.length
            if (r8 <= 0) goto L_0x0016
            r8 = 1
            goto L_0x0017
        L_0x0016:
            r8 = r7
        L_0x0017:
            if (r8 == 0) goto L_0x0064
            int r9 = r0.length
            r10 = r7
            r12 = r10
            r13 = r12
            r11 = 1
        L_0x001e:
            if (r10 >= r9) goto L_0x0067
            r14 = r0[r10]
            Z0.v r15 = r5.J()
            Z0.u r15 = r15.m(r14)
            if (r15 != 0) goto L_0x004c
            Q0.i r0 = Q0.i.e()
            java.lang.String r1 = f3959g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Prerequisite "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " doesn't exist; not enqueuing"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.c(r1, r2)
            return r7
        L_0x004c:
            Q0.s r14 = r15.f3835b
            Q0.s r15 = Q0.s.SUCCEEDED
            if (r14 != r15) goto L_0x0054
            r15 = 1
            goto L_0x0055
        L_0x0054:
            r15 = r7
        L_0x0055:
            r11 = r11 & r15
            Q0.s r15 = Q0.s.FAILED
            if (r14 != r15) goto L_0x005c
            r13 = 1
            goto L_0x0061
        L_0x005c:
            Q0.s r15 = Q0.s.CANCELLED
            if (r14 != r15) goto L_0x0061
            r12 = 1
        L_0x0061:
            int r10 = r10 + 1
            goto L_0x001e
        L_0x0064:
            r12 = r7
            r13 = r12
            r11 = 1
        L_0x0067:
            boolean r9 = android.text.TextUtils.isEmpty(r21)
            if (r9 != 0) goto L_0x014e
            if (r8 != 0) goto L_0x014e
            Z0.v r10 = r5.J()
            java.util.List r10 = r10.h(r1)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L_0x014e
            Q0.d r14 = Q0.d.APPEND
            if (r2 == r14) goto L_0x0085
            Q0.d r14 = Q0.d.APPEND_OR_REPLACE
            if (r2 != r14) goto L_0x0088
        L_0x0085:
            r14 = r18
            goto L_0x00cd
        L_0x0088:
            Q0.d r14 = Q0.d.KEEP
            if (r2 != r14) goto L_0x00a7
            java.util.Iterator r2 = r10.iterator()
        L_0x0090:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00a7
            java.lang.Object r14 = r2.next()
            Z0.u$b r14 = (Z0.u.b) r14
            Q0.s r14 = r14.f3855b
            Q0.s r15 = Q0.s.ENQUEUED
            if (r14 == r15) goto L_0x00a6
            Q0.s r15 = Q0.s.RUNNING
            if (r14 != r15) goto L_0x0090
        L_0x00a6:
            return r7
        L_0x00a7:
            r14 = r18
            a1.b r2 = a1.C0345b.c(r1, r14, r7)
            r2.run()
            Z0.v r2 = r5.J()
            java.util.Iterator r10 = r10.iterator()
        L_0x00b8:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x00ca
            java.lang.Object r15 = r10.next()
            Z0.u$b r15 = (Z0.u.b) r15
            java.lang.String r15 = r15.f3854a
            r2.a(r15)
            goto L_0x00b8
        L_0x00ca:
            r6 = 1
            goto L_0x0151
        L_0x00cd:
            Z0.b r8 = r5.E()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00da:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x0114
            java.lang.Object r16 = r10.next()
            r6 = r16
            Z0.u$b r6 = (Z0.u.b) r6
            java.lang.String r7 = r6.f3854a
            boolean r7 = r8.b(r7)
            if (r7 != 0) goto L_0x010e
            Q0.s r7 = r6.f3855b
            r17 = r8
            Q0.s r8 = Q0.s.SUCCEEDED
            if (r7 != r8) goto L_0x00fa
            r8 = 1
            goto L_0x00fb
        L_0x00fa:
            r8 = 0
        L_0x00fb:
            r8 = r8 & r11
            Q0.s r11 = Q0.s.FAILED
            if (r7 != r11) goto L_0x0102
            r13 = 1
            goto L_0x0107
        L_0x0102:
            Q0.s r11 = Q0.s.CANCELLED
            if (r7 != r11) goto L_0x0107
            r12 = 1
        L_0x0107:
            java.lang.String r6 = r6.f3854a
            r15.add(r6)
            r11 = r8
            goto L_0x0110
        L_0x010e:
            r17 = r8
        L_0x0110:
            r8 = r17
            r7 = 0
            goto L_0x00da
        L_0x0114:
            Q0.d r6 = Q0.d.APPEND_OR_REPLACE
            if (r2 != r6) goto L_0x0140
            if (r12 != 0) goto L_0x011c
            if (r13 == 0) goto L_0x0140
        L_0x011c:
            Z0.v r2 = r5.J()
            java.util.List r6 = r2.h(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0128:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x013a
            java.lang.Object r7 = r6.next()
            Z0.u$b r7 = (Z0.u.b) r7
            java.lang.String r7 = r7.f3854a
            r2.a(r7)
            goto L_0x0128
        L_0x013a:
            java.util.List r15 = java.util.Collections.emptyList()
            r12 = 0
            r13 = 0
        L_0x0140:
            java.lang.Object[] r0 = r15.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x014b
            r8 = 1
            goto L_0x014c
        L_0x014b:
            r8 = 0
        L_0x014c:
            r6 = 0
            goto L_0x0151
        L_0x014e:
            r14 = r18
            goto L_0x014c
        L_0x0151:
            java.util.Iterator r2 = r19.iterator()
        L_0x0155:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01e2
            java.lang.Object r7 = r2.next()
            Q0.u r7 = (Q0.u) r7
            Z0.u r10 = r7.d()
            if (r8 == 0) goto L_0x017c
            if (r11 != 0) goto L_0x017c
            if (r13 == 0) goto L_0x0170
            Q0.s r15 = Q0.s.FAILED
            r10.f3835b = r15
            goto L_0x017e
        L_0x0170:
            if (r12 == 0) goto L_0x0177
            Q0.s r15 = Q0.s.CANCELLED
            r10.f3835b = r15
            goto L_0x017e
        L_0x0177:
            Q0.s r15 = Q0.s.BLOCKED
            r10.f3835b = r15
            goto L_0x017e
        L_0x017c:
            r10.f3847n = r3
        L_0x017e:
            Q0.s r15 = r10.f3835b
            r19 = r2
            Q0.s r2 = Q0.s.ENQUEUED
            if (r15 != r2) goto L_0x0187
            r6 = 1
        L_0x0187:
            Z0.v r2 = r5.J()
            java.util.List r15 = r18.o()
            Z0.u r10 = a1.d.a(r15, r10)
            r2.j(r10)
            if (r8 == 0) goto L_0x01b9
            int r2 = r0.length
            r10 = 0
        L_0x019a:
            if (r10 >= r2) goto L_0x01b9
            r15 = r0[r10]
            r17 = r0
            Z0.a r0 = new Z0.a
            r20 = r2
            java.lang.String r2 = r7.b()
            r0.<init>(r2, r15)
            Z0.b r2 = r5.E()
            r2.d(r0)
            int r10 = r10 + 1
            r2 = r20
            r0 = r17
            goto L_0x019a
        L_0x01b9:
            r17 = r0
            Z0.z r0 = r5.K()
            java.lang.String r2 = r7.b()
            java.util.Set r10 = r7.c()
            r0.b(r2, r10)
            if (r9 != 0) goto L_0x01dc
            Z0.o r0 = r5.H()
            Z0.n r2 = new Z0.n
            java.lang.String r7 = r7.b()
            r2.<init>(r1, r7)
            r0.a(r2)
        L_0x01dc:
            r2 = r19
            r0 = r17
            goto L_0x0155
        L_0x01e2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0346c.c(R0.E, java.util.List, java.lang.String[], java.lang.String, Q0.d):boolean");
    }

    public static boolean e(x xVar) {
        List<x> e4 = xVar.e();
        boolean z4 = false;
        if (e4 != null) {
            for (x xVar2 : e4) {
                if (!xVar2.j()) {
                    z4 |= e(xVar2);
                } else {
                    i e5 = i.e();
                    String str = f3959g;
                    e5.k(str, "Already enqueued work ids (" + TextUtils.join(", ", xVar2.c()) + ")");
                }
            }
        }
        return b(xVar) | z4;
    }

    public boolean a() {
        WorkDatabase q4 = this.f3960e.g().q();
        q4.e();
        try {
            boolean e4 = e(this.f3960e);
            q4.B();
            return e4;
        } finally {
            q4.i();
        }
    }

    public l d() {
        return this.f3961f;
    }

    public void f() {
        E g4 = this.f3960e.g();
        u.b(g4.j(), g4.q(), g4.o());
    }

    public void run() {
        try {
            if (!this.f3960e.h()) {
                if (a()) {
                    p.a(this.f3960e.g().i(), RescheduleReceiver.class, true);
                    f();
                }
                this.f3961f.a(l.f2390a);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + this.f3960e + ")");
        } catch (Throwable th) {
            this.f3961f.a(new l.b.a(th));
        }
    }

    public C0346c(x xVar, o oVar) {
        this.f3960e = xVar;
        this.f3961f = oVar;
    }
}
