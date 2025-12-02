package z1;

import C1.b;
import K1.r;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class c0 extends C1026i {

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f12910g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Context f12911h;

    /* renamed from: i  reason: collision with root package name */
    public volatile Handler f12912i;

    /* renamed from: j  reason: collision with root package name */
    public final b0 f12913j;

    /* renamed from: k  reason: collision with root package name */
    public final b f12914k;

    /* renamed from: l  reason: collision with root package name */
    public final long f12915l;

    /* renamed from: m  reason: collision with root package name */
    public final long f12916m;

    /* renamed from: n  reason: collision with root package name */
    public volatile Executor f12917n;

    public c0(Context context, Looper looper, Executor executor) {
        b0 b0Var = new b0(this, (byte[]) null);
        this.f12913j = b0Var;
        this.f12911h = context.getApplicationContext();
        this.f12912i = new r(looper, b0Var);
        this.f12914k = b.a();
        this.f12915l = 5000;
        this.f12916m = 300000;
        this.f12917n = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final u1.C0941a c(z1.Z r6, android.content.ServiceConnection r7, java.lang.String r8, java.util.concurrent.Executor r9) {
        /*
            r5 = this;
            java.lang.String r0 = "ServiceConnection must not be null"
            z1.C1032o.g(r7, r0)
            java.util.HashMap r0 = r5.f12910g
            java.lang.String r1 = "Trying to bind a GmsServiceConnection that was already connected before.  config="
            monitor-enter(r0)
            java.lang.Object r2 = r0.get(r6)     // Catch:{ all -> 0x0015 }
            z1.a0 r2 = (z1.a0) r2     // Catch:{ all -> 0x0015 }
            if (r9 != 0) goto L_0x0018
            java.util.concurrent.Executor r9 = r5.f12917n     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r6 = move-exception
            goto L_0x008a
        L_0x0018:
            if (r2 != 0) goto L_0x002a
            z1.a0 r2 = new z1.a0     // Catch:{ all -> 0x0015 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0015 }
            r2.b(r7, r7, r8)     // Catch:{ all -> 0x0015 }
            u1.a r7 = r2.j(r8, r9)     // Catch:{ all -> 0x0015 }
            r0.put(r6, r2)     // Catch:{ all -> 0x0015 }
            goto L_0x0057
        L_0x002a:
            android.os.Handler r3 = r5.f12912i     // Catch:{ all -> 0x0015 }
            r4 = 0
            r3.removeMessages(r4, r6)     // Catch:{ all -> 0x0015 }
            boolean r3 = r2.f(r7)     // Catch:{ all -> 0x0015 }
            if (r3 != 0) goto L_0x006b
            r2.b(r7, r7, r8)     // Catch:{ all -> 0x0015 }
            int r6 = r2.e()     // Catch:{ all -> 0x0015 }
            r1 = 1
            r3 = 0
            if (r6 == r1) goto L_0x004b
            r7 = 2
            if (r6 == r7) goto L_0x0046
        L_0x0044:
            r7 = r3
            goto L_0x0057
        L_0x0046:
            u1.a r7 = r2.j(r8, r9)     // Catch:{ all -> 0x0015 }
            goto L_0x0057
        L_0x004b:
            android.content.ComponentName r6 = r2.i()     // Catch:{ all -> 0x0015 }
            android.os.IBinder r8 = r2.h()     // Catch:{ all -> 0x0015 }
            r7.onServiceConnected(r6, r8)     // Catch:{ all -> 0x0015 }
            goto L_0x0044
        L_0x0057:
            boolean r6 = r2.d()     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x0061
            u1.a r6 = u1.C0941a.f12304i     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return r6
        L_0x0061:
            if (r7 != 0) goto L_0x0069
            u1.a r7 = new u1.a     // Catch:{ all -> 0x0015 }
            r6 = -1
            r7.<init>(r6)     // Catch:{ all -> 0x0015 }
        L_0x0069:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return r7
        L_0x006b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0015 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0015 }
            int r8 = r6.length()     // Catch:{ all -> 0x0015 }
            int r8 = r8 + 81
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0015 }
            r9.<init>(r8)     // Catch:{ all -> 0x0015 }
            r9.append(r1)     // Catch:{ all -> 0x0015 }
            r9.append(r6)     // Catch:{ all -> 0x0015 }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x0015 }
            r7.<init>(r6)     // Catch:{ all -> 0x0015 }
            throw r7     // Catch:{ all -> 0x0015 }
        L_0x008a:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.c0.c(z1.Z, android.content.ServiceConnection, java.lang.String, java.util.concurrent.Executor):u1.a");
    }

    public final void e(Z z4, ServiceConnection serviceConnection, String str) {
        C1032o.g(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f12910g;
        synchronized (hashMap) {
            try {
                a0 a0Var = (a0) hashMap.get(z4);
                if (a0Var == null) {
                    String obj = z4.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                } else if (a0Var.f(serviceConnection)) {
                    a0Var.c(serviceConnection, str);
                    if (a0Var.g()) {
                        this.f12912i.sendMessageDelayed(this.f12912i.obtainMessage(0, z4), this.f12915l);
                    }
                } else {
                    String obj2 = z4.toString();
                    StringBuilder sb2 = new StringBuilder(obj2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(obj2);
                    throw new IllegalStateException(sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ HashMap f() {
        return this.f12910g;
    }

    public final /* synthetic */ Context g() {
        return this.f12911h;
    }

    public final /* synthetic */ Handler h() {
        return this.f12912i;
    }

    public final /* synthetic */ b i() {
        return this.f12914k;
    }

    public final /* synthetic */ long j() {
        return this.f12916m;
    }
}
