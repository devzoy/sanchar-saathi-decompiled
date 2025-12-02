package u1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import java.util.concurrent.atomic.AtomicBoolean;
import z1.C1032o;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12322a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f12323b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicBoolean f12324c = new AtomicBoolean();

    public static String a(int i4) {
        return C0941a.j(i4);
    }

    public static Resources b(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(android.content.Context r10, int r11) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000c }
            int r2 = u1.i.f12327a     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r1 = f12324c
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            int r1 = z1.K.a(r10)
            if (r1 == 0) goto L_0x0037
            int r3 = f12322a
            if (r1 != r3) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x003d:
            boolean r1 = D1.f.c(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r1 = D1.f.f(r10)
            if (r1 != 0) goto L_0x004d
            r1 = r3
            goto L_0x004e
        L_0x004d:
            r1 = r4
        L_0x004e:
            if (r11 < 0) goto L_0x0052
            r5 = r3
            goto L_0x0053
        L_0x0052:
            r5 = r4
        L_0x0053:
            z1.C1032o.a(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L_0x007c
            java.lang.String r8 = "com.android.vending"
            r9 = 134225984(0x8002040, float:3.855651E-34)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x006c }
            goto L_0x007d
        L_0x006c:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0079:
            r3 = r7
            goto L_0x0152
        L_0x007c:
            r8 = 0
        L_0x007d:
            r9 = 134217792(0x8000040, float:3.8518893E-34)
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x0145 }
            u1.h.a(r10)
            boolean r10 = u1.h.b(r9, r3)
            if (r10 != 0) goto L_0x009b
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0079
        L_0x009b:
            if (r1 == 0) goto L_0x00b4
            z1.C1032o.f(r8)
            boolean r10 = u1.h.b(r8, r3)
            if (r10 != 0) goto L_0x00b4
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0079
        L_0x00b4:
            if (r1 == 0) goto L_0x00d4
            if (r8 == 0) goto L_0x00d4
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00d4
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0079
        L_0x00d4:
            int r10 = r9.versionCode
            int r10 = D1.i.a(r10)
            int r1 = D1.i.a(r11)
            if (r10 >= r1) goto L_0x0126
            int r10 = r9.versionCode
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r11)
            int r1 = r1 + 49
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r10)
            int r1 = r1 + r2
            int r1 = r1 + 11
            int r2 = r3.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "Google Play services out of date for "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = ".  Requires "
            r3.append(r1)
            r3.append(r11)
            java.lang.String r11 = " but found "
            r3.append(r11)
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L_0x0152
        L_0x0126:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x013e
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x012f }
            goto L_0x013e
        L_0x012f:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L_0x0152
        L_0x013e:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x0144
            r3 = 3
            goto L_0x0152
        L_0x0144:
            return r4
        L_0x0145:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0152:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.g.c(android.content.Context, int):int");
    }

    public static boolean d(Context context, int i4) {
        if (i4 == 18) {
            return true;
        }
        if (i4 == 1) {
            return g(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean e(Context context) {
        Object systemService = context.getSystemService("user");
        C1032o.f(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean f(int i4) {
        return i4 == 1 || i4 == 2 || i4 == 3 || i4 == 9;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r6.equals(r0)
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x0049 }
            android.content.pm.PackageInstaller r2 = r2.getPackageInstaller()     // Catch:{ Exception -> 0x0049 }
            java.util.List r2 = r2.getAllSessions()     // Catch:{ Exception -> 0x0049 }
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r2.next()
            android.content.pm.PackageInstaller$SessionInfo r3 = (android.content.pm.PackageInstaller.SessionInfo) r3
            java.lang.String r3 = r3.getAppPackageName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0017
            return r4
        L_0x002f:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r3 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r6 = r2.getApplicationInfo(r6, r3)     // Catch:{  }
            if (r0 == 0) goto L_0x003e
            boolean r5 = r6.enabled     // Catch:{  }
            return r5
        L_0x003e:
            boolean r6 = r6.enabled     // Catch:{  }
            if (r6 == 0) goto L_0x0049
            boolean r5 = e(r5)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            return r4
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.g.g(android.content.Context, java.lang.String):boolean");
    }
}
