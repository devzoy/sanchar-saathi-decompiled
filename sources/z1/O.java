package z1;

import K1.r;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

public final class O extends r {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1021d f12882b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O(C1021d dVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(dVar);
        this.f12882b = dVar;
    }

    public static final void a(Message message) {
        P p4 = (P) message.obj;
        if (p4 != null) {
            p4.c();
        }
    }

    public static final boolean b(Message message) {
        int i4 = message.what;
        return i4 == 2 || i4 == 1 || i4 == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            z1.d r0 = r8.f12882b
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f12923D
            int r1 = r1.get()
            int r2 = r9.arg1
            if (r1 == r2) goto L_0x0016
            boolean r0 = b(r9)
            if (r0 == 0) goto L_0x0015
            a(r9)
        L_0x0015:
            return
        L_0x0016:
            int r1 = r9.what
            r2 = 4
            r3 = 1
            r4 = 5
            if (r1 == r3) goto L_0x002c
            r5 = 7
            if (r1 == r5) goto L_0x002c
            if (r1 != r2) goto L_0x0028
            boolean r1 = r0.s()
            if (r1 == 0) goto L_0x002c
        L_0x0028:
            int r1 = r9.what
            if (r1 != r4) goto L_0x0032
        L_0x002c:
            boolean r1 = r0.j()
            if (r1 == 0) goto L_0x0106
        L_0x0032:
            int r1 = r9.what
            r5 = 8
            r6 = 3
            r7 = 0
            if (r1 != r2) goto L_0x006e
            u1.a r1 = new u1.a
            int r9 = r9.arg2
            r1.<init>(r9)
            r0.f0(r1)
            boolean r9 = r0.Y()
            if (r9 == 0) goto L_0x0055
            boolean r9 = r0.g0()
            if (r9 == 0) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            r0.V(r6, r7)
            return
        L_0x0055:
            u1.a r9 = r0.e0()
            if (r9 == 0) goto L_0x0060
            u1.a r9 = r0.e0()
            goto L_0x0065
        L_0x0060:
            u1.a r9 = new u1.a
            r9.<init>(r5)
        L_0x0065:
            z1.d$c r1 = r0.f12939p
            r1.a(r9)
            r0.K(r9)
            return
        L_0x006e:
            if (r1 != r4) goto L_0x0089
            u1.a r9 = r0.e0()
            if (r9 == 0) goto L_0x007b
            u1.a r9 = r0.e0()
            goto L_0x0080
        L_0x007b:
            u1.a r9 = new u1.a
            r9.<init>(r5)
        L_0x0080:
            z1.d$c r1 = r0.f12939p
            r1.a(r9)
            r0.K(r9)
            return
        L_0x0089:
            if (r1 != r6) goto L_0x00a4
            java.lang.Object r1 = r9.obj
            boolean r2 = r1 instanceof android.app.PendingIntent
            if (r2 == 0) goto L_0x0094
            r7 = r1
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
        L_0x0094:
            u1.a r1 = new u1.a
            int r9 = r9.arg2
            r1.<init>(r9, r7)
            z1.d$c r9 = r0.f12939p
            r9.a(r1)
            r0.K(r1)
            return
        L_0x00a4:
            r2 = 6
            if (r1 != r2) goto L_0x00c2
            r0.V(r4, r7)
            z1.d$a r1 = r0.c0()
            if (r1 == 0) goto L_0x00b9
            int r1 = r9.arg2
            z1.d$a r2 = r0.c0()
            r2.onConnectionSuspended(r1)
        L_0x00b9:
            int r9 = r9.arg2
            r0.L(r9)
            r0.W(r4, r3, r7)
            return
        L_0x00c2:
            r2 = 2
            if (r1 != r2) goto L_0x00d0
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x00cc
            goto L_0x00d0
        L_0x00cc:
            a(r9)
            return
        L_0x00d0:
            boolean r0 = b(r9)
            if (r0 == 0) goto L_0x00de
            java.lang.Object r9 = r9.obj
            z1.P r9 = (z1.P) r9
            r9.b()
            return
        L_0x00de:
            int r9 = r9.what
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 34
            r1.<init>(r0)
            java.lang.String r0 = "Don't know how to handle message: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r9, r0)
            return
        L_0x0106:
            a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.O.handleMessage(android.os.Message):void");
    }
}
