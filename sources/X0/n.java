package X0;

import android.content.Context;
import c1.C0403b;
import v3.g;
import v3.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final h f3458a;

    /* renamed from: b  reason: collision with root package name */
    public final c f3459b;

    /* renamed from: c  reason: collision with root package name */
    public final h f3460c;

    /* renamed from: d  reason: collision with root package name */
    public final h f3461d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n(Context context, C0403b bVar) {
        this(context, bVar, (h) null, (c) null, (h) null, (h) null, 60, (g) null);
        l.e(context, "context");
        l.e(bVar, "taskExecutor");
    }

    public final h a() {
        return this.f3458a;
    }

    public final c b() {
        return this.f3459b;
    }

    public final h c() {
        return this.f3460c;
    }

    public final h d() {
        return this.f3461d;
    }

    public n(Context context, C0403b bVar, h hVar, c cVar, h hVar2, h hVar3) {
        l.e(context, "context");
        l.e(bVar, "taskExecutor");
        l.e(hVar, "batteryChargingTracker");
        l.e(cVar, "batteryNotLowTracker");
        l.e(hVar2, "networkStateTracker");
        l.e(hVar3, "storageNotLowTracker");
        this.f3458a = hVar;
        this.f3459b = cVar;
        this.f3460c = hVar2;
        this.f3461d = hVar3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ n(android.content.Context r8, c1.C0403b r9, X0.h r10, X0.c r11, X0.h r12, X0.h r13, int r14, v3.g r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L_0x0014
            X0.a r0 = new X0.a
            android.content.Context r3 = r8.getApplicationContext()
            v3.l.d(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L_0x0015
        L_0x0014:
            r3 = r10
        L_0x0015:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0027
            X0.c r0 = new X0.c
            android.content.Context r4 = r8.getApplicationContext()
            v3.l.d(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r11
        L_0x0028:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0039
            android.content.Context r0 = r8.getApplicationContext()
            v3.l.d(r0, r1)
            X0.h r0 = X0.k.a(r0, r9)
            r5 = r0
            goto L_0x003a
        L_0x0039:
            r5 = r12
        L_0x003a:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x004c
            X0.l r0 = new X0.l
            android.content.Context r6 = r8.getApplicationContext()
            v3.l.d(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            goto L_0x004d
        L_0x004c:
            r6 = r13
        L_0x004d:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.n.<init>(android.content.Context, c1.b, X0.h, X0.c, X0.h, X0.h, int, v3.g):void");
    }
}
