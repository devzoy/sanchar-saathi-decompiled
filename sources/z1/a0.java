package z1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class a0 implements ServiceConnection, d0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f12902a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f12903b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12904c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f12905d;

    /* renamed from: e  reason: collision with root package name */
    public final Z f12906e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f12907f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c0 f12908g;

    public a0(c0 c0Var, Z z4) {
        Objects.requireNonNull(c0Var);
        this.f12908g = c0Var;
        this.f12906e = z4;
    }

    public final void a(String str) {
        Z z4 = this.f12906e;
        c0 c0Var = this.f12908g;
        c0Var.h().removeMessages(1, z4);
        c0Var.i().b(c0Var.g(), this);
        this.f12904c = false;
        this.f12903b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f12902a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.f12902a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.f12904c;
    }

    public final int e() {
        return this.f12903b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f12902a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.f12902a.isEmpty();
    }

    public final IBinder h() {
        return this.f12905d;
    }

    public final ComponentName i() {
        return this.f12907f;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ u1.C0941a j(java.lang.String r11, java.util.concurrent.Executor r12) {
        /*
            r10 = this;
            z1.c0 r0 = r10.f12908g     // Catch:{ L -> 0x0062 }
            android.content.Context r0 = r0.g()     // Catch:{ L -> 0x0062 }
            z1.Z r1 = r10.f12906e     // Catch:{ L -> 0x0062 }
            android.content.Intent r5 = z1.N.a(r0, r1)     // Catch:{ L -> 0x0062 }
            r0 = 3
            r10.f12903b = r0
            android.os.StrictMode$VmPolicy r0 = D1.l.a()
            z1.c0 r1 = r10.f12908g     // Catch:{ all -> 0x0046 }
            C1.b r2 = r1.i()     // Catch:{ all -> 0x0046 }
            android.content.Context r3 = r1.g()     // Catch:{ all -> 0x0046 }
            z1.Z r9 = r10.f12906e     // Catch:{ all -> 0x0046 }
            r7 = 4225(0x1081, float:5.92E-42)
            r4 = r11
            r6 = r10
            r8 = r12
            boolean r11 = r2.c(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0046 }
            r10.f12904c = r11     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x0048
            android.os.Handler r11 = r1.h()     // Catch:{ all -> 0x0046 }
            r12 = 1
            android.os.Message r11 = r11.obtainMessage(r12, r9)     // Catch:{ all -> 0x0046 }
            android.os.Handler r12 = r1.h()     // Catch:{ all -> 0x0046 }
            long r1 = r1.j()     // Catch:{ all -> 0x0046 }
            r12.sendMessageDelayed(r11, r1)     // Catch:{ all -> 0x0046 }
            u1.a r11 = u1.C0941a.f12304i     // Catch:{ all -> 0x0046 }
        L_0x0042:
            android.os.StrictMode.setVmPolicy(r0)
            goto L_0x0065
        L_0x0046:
            r11 = move-exception
            goto L_0x005e
        L_0x0048:
            r11 = 2
            r10.f12903b = r11     // Catch:{ all -> 0x0046 }
            C1.b r11 = r1.i()     // Catch:{ IllegalArgumentException -> 0x0056 }
            android.content.Context r12 = r1.g()     // Catch:{ IllegalArgumentException -> 0x0056 }
            r11.b(r12, r10)     // Catch:{ IllegalArgumentException -> 0x0056 }
        L_0x0056:
            u1.a r11 = new u1.a     // Catch:{ all -> 0x0046 }
            r12 = 16
            r11.<init>(r12)     // Catch:{ all -> 0x0046 }
            goto L_0x0042
        L_0x005e:
            android.os.StrictMode.setVmPolicy(r0)
            throw r11
        L_0x0062:
            r11 = move-exception
            u1.a r11 = r11.f12880e
        L_0x0065:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a0.j(java.lang.String, java.util.concurrent.Executor):u1.a");
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c0 c0Var = this.f12908g;
        synchronized (c0Var.f()) {
            try {
                c0Var.h().removeMessages(1, this.f12906e);
                this.f12905d = iBinder;
                this.f12907f = componentName;
                for (ServiceConnection onServiceConnected : this.f12902a.values()) {
                    onServiceConnected.onServiceConnected(componentName, iBinder);
                }
                this.f12903b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        c0 c0Var = this.f12908g;
        synchronized (c0Var.f()) {
            try {
                c0Var.h().removeMessages(1, this.f12906e);
                this.f12905d = null;
                this.f12907f = componentName;
                for (ServiceConnection onServiceDisconnected : this.f12902a.values()) {
                    onServiceDisconnected.onServiceDisconnected(componentName);
                }
                this.f12903b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
