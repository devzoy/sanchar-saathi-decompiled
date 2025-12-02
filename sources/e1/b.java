package E1;

import android.content.Context;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static Context f880a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f881b;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(android.content.Context r4) {
        /*
            java.lang.Class<E1.b> r0 = E1.b.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x0018 }
            android.content.Context r2 = f880a     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x001a
            java.lang.Boolean r3 = f881b     // Catch:{ all -> 0x0018 }
            if (r3 == 0) goto L_0x001a
            if (r2 == r1) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            boolean r4 = r3.booleanValue()     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            return r4
        L_0x0018:
            r4 = move-exception
            goto L_0x004e
        L_0x001a:
            r2 = 0
            f881b = r2     // Catch:{ all -> 0x0018 }
            boolean r2 = D1.g.c()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0032
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x0018 }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x0018 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0018 }
            f881b = r4     // Catch:{ all -> 0x0018 }
            goto L_0x0044
        L_0x0032:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0040 }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0040 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0040 }
            f881b = r4     // Catch:{ ClassNotFoundException -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0018 }
            f881b = r4     // Catch:{ all -> 0x0018 }
        L_0x0044:
            f880a = r1     // Catch:{ all -> 0x0018 }
            java.lang.Boolean r4 = f881b     // Catch:{ all -> 0x0018 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            return r4
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.b.a(android.content.Context):boolean");
    }
}
