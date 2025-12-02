package z1;

import android.net.Uri;

public abstract class N {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f12881a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent a(android.content.Context r5, z1.Z r6) {
        /*
            java.lang.String r0 = "ServiceBindIntentUtils"
            java.lang.String r1 = r6.a()
            if (r1 != 0) goto L_0x0016
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.ComponentName r6 = r6.c()
            android.content.Intent r5 = r5.setComponent(r6)
            return r5
        L_0x0016:
            boolean r2 = r6.d()
            r3 = 0
            if (r2 == 0) goto L_0x00ad
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "serviceActionBundleKey"
            r2.putString(r4, r1)
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ RemoteException -> 0x003f, IllegalArgumentException -> 0x003d }
            android.net.Uri r4 = f12881a     // Catch:{ RemoteException -> 0x003f, IllegalArgumentException -> 0x003d }
            android.content.ContentProviderClient r5 = r5.acquireUnstableContentProviderClient(r4)     // Catch:{ RemoteException -> 0x003f, IllegalArgumentException -> 0x003d }
            if (r5 == 0) goto L_0x0046
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r2 = r5.call(r4, r3, r2)     // Catch:{ all -> 0x0041 }
            r5.release()     // Catch:{ RemoteException -> 0x003f, IllegalArgumentException -> 0x003d }
            goto L_0x005c
        L_0x003d:
            r5 = move-exception
            goto L_0x004e
        L_0x003f:
            r5 = move-exception
            goto L_0x004e
        L_0x0041:
            r2 = move-exception
            r5.release()     // Catch:{ RemoteException -> 0x003f, IllegalArgumentException -> 0x003d }
            throw r2     // Catch:{ RemoteException -> 0x003f, IllegalArgumentException -> 0x003d }
        L_0x0046:
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch:{ RemoteException -> 0x003f, IllegalArgumentException -> 0x003d }
            java.lang.String r2 = "Failed to acquire ContentProviderClient"
            r5.<init>(r2)     // Catch:{ RemoteException -> 0x003f, IllegalArgumentException -> 0x003d }
            throw r5     // Catch:{ RemoteException -> 0x003f, IllegalArgumentException -> 0x003d }
        L_0x004e:
            java.lang.String r2 = "Dynamic intent resolution failed: "
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r2.concat(r5)
            android.util.Log.w(r0, r5)
            r2 = r3
        L_0x005c:
            if (r2 != 0) goto L_0x005f
            goto L_0x0075
        L_0x005f:
            java.lang.String r5 = "serviceResponseIntentKey"
            android.os.Parcelable r5 = r2.getParcelable(r5)
            android.content.Intent r5 = (android.content.Intent) r5
            if (r5 == 0) goto L_0x006b
            r3 = r5
            goto L_0x0075
        L_0x006b:
            java.lang.String r5 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r5 = r2.getParcelable(r5)
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
            if (r5 != 0) goto L_0x0081
        L_0x0075:
            if (r3 != 0) goto L_0x00ad
            java.lang.String r5 = "Dynamic lookup for intent failed for action: "
            java.lang.String r5 = r5.concat(r1)
            android.util.Log.w(r0, r5)
            goto L_0x00ad
        L_0x0081:
            int r6 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r6 = r6 + 72
            r2.<init>(r6)
            java.lang.String r6 = "Dynamic lookup for intent failed for action "
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = " but has possible resolution"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.util.Log.w(r0, r6)
            z1.L r6 = new z1.L
            u1.a r0 = new u1.a
            r1 = 25
            r0.<init>(r1, r5)
            r6.<init>(r0)
            throw r6
        L_0x00ad:
            if (r3 != 0) goto L_0x00bd
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r1)
            java.lang.String r6 = r6.b()
            android.content.Intent r5 = r5.setPackage(r6)
            return r5
        L_0x00bd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.N.a(android.content.Context, z1.Z):android.content.Intent");
    }
}
