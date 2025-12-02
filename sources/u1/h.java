package u1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import z1.C1032o;

public class h {

    /* renamed from: b  reason: collision with root package name */
    public static h f12325b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f12326a;

    public h(Context context) {
        this.f12326a = context.getApplicationContext();
    }

    public static h a(Context context) {
        C1032o.f(context);
        synchronized (h.class) {
            try {
                if (f12325b == null) {
                    x.a(context);
                    f12325b = new h(context);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f12325b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e A[Catch:{ IllegalArgumentException -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009c A[Catch:{ IllegalArgumentException -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean b(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            r0 = 1
            r1 = 0
            if (r10 != 0) goto L_0x0005
            return r1
        L_0x0005:
            if (r11 == 0) goto L_0x0028
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x001b
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0028
        L_0x001b:
            android.content.pm.ApplicationInfo r11 = r10.applicationInfo
            if (r11 != 0) goto L_0x0021
        L_0x001f:
            r11 = r1
            goto L_0x0028
        L_0x0021:
            int r11 = r11.flags
            r11 = r11 & 129(0x81, float:1.81E-43)
            if (r11 == 0) goto L_0x001f
            r11 = r0
        L_0x0028:
            if (r11 == 0) goto L_0x002d
            K1.k r2 = u1.w.f12339c     // Catch:{ IllegalArgumentException -> 0x00a4 }
            goto L_0x002f
        L_0x002d:
            K1.k r2 = u1.w.f12338b     // Catch:{ IllegalArgumentException -> 0x00a4 }
        L_0x002f:
            java.lang.Object r3 = D1.a.f727a     // Catch:{ IllegalArgumentException -> 0x00a4 }
            K1.w.a(r0)     // Catch:{ IllegalArgumentException -> 0x00a4 }
            android.content.pm.SigningInfo r3 = r10.signingInfo     // Catch:{ IllegalArgumentException -> 0x00a4 }
            if (r3 == 0) goto L_0x0064
            boolean r4 = r3.hasMultipleSigners()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            if (r4 != 0) goto L_0x0064
            android.content.pm.Signature[] r4 = r3.getSigningCertificateHistory()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            if (r4 != 0) goto L_0x0045
            goto L_0x0064
        L_0x0045:
            K1.o r4 = K1.k.f1693f     // Catch:{ IllegalArgumentException -> 0x00a4 }
            K1.g r4 = new K1.g     // Catch:{ IllegalArgumentException -> 0x00a4 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            android.content.pm.Signature[] r3 = r3.getSigningCertificateHistory()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            int r5 = r3.length     // Catch:{ IllegalArgumentException -> 0x00a4 }
            r6 = r1
        L_0x0052:
            if (r6 >= r5) goto L_0x005f
            r7 = r3[r6]     // Catch:{ IllegalArgumentException -> 0x00a4 }
            byte[] r7 = r7.toByteArray()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            r4.b(r7)     // Catch:{ IllegalArgumentException -> 0x00a4 }
            int r6 = r6 + r0
            goto L_0x0052
        L_0x005f:
            K1.k r3 = r4.c()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            goto L_0x0068
        L_0x0064:
            K1.k r3 = K1.k.y()     // Catch:{ IllegalArgumentException -> 0x00a4 }
        L_0x0068:
            boolean r4 = r3.isEmpty()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            if (r4 != 0) goto L_0x009c
            K1.k r3 = r3.w()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            int r4 = r3.size()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            r5 = r1
        L_0x0077:
            if (r5 >= r4) goto L_0x009a
            java.lang.Object r6 = r3.get(r5)     // Catch:{ IllegalArgumentException -> 0x00a4 }
            byte[] r6 = (byte[]) r6     // Catch:{ IllegalArgumentException -> 0x00a4 }
            K1.o r7 = r2.listIterator(r1)     // Catch:{ IllegalArgumentException -> 0x00a4 }
        L_0x0083:
            boolean r8 = r7.hasNext()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            int r9 = r5 + 1
            if (r8 == 0) goto L_0x0098
            java.lang.Object r8 = r7.next()     // Catch:{ IllegalArgumentException -> 0x00a4 }
            byte[] r8 = (byte[]) r8     // Catch:{ IllegalArgumentException -> 0x00a4 }
            boolean r8 = java.util.Arrays.equals(r6, r8)     // Catch:{ IllegalArgumentException -> 0x00a4 }
            if (r8 == 0) goto L_0x0083
            goto L_0x009b
        L_0x0098:
            r5 = r9
            goto L_0x0077
        L_0x009a:
            r0 = r1
        L_0x009b:
            return r0
        L_0x009c:
            java.lang.String r2 = "Unable to obtain package certificate history."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00a4 }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x00a4 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x00a4 }
        L_0x00a4:
            java.lang.String r2 = "GoogleSignatureVerifier"
            java.lang.String r3 = "package info is not set correctly"
            android.util.Log.i(r2, r3)
            if (r11 == 0) goto L_0x00b4
            u1.t[] r11 = u1.w.f12337a
            u1.t r10 = c(r10, r11)
            goto L_0x00c0
        L_0x00b4:
            u1.t[] r11 = u1.w.f12337a
            r11 = r11[r1]
            u1.t[] r11 = new u1.t[]{r11}
            u1.t r10 = c(r10, r11)
        L_0x00c0:
            if (r10 == 0) goto L_0x00c3
            return r0
        L_0x00c3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.h.b(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static t c(PackageInfo packageInfo, t... tVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            u uVar = new u(packageInfo.signatures[0].toByteArray());
            for (int i4 = 0; i4 < tVarArr.length; i4++) {
                if (tVarArr[i4].equals(uVar)) {
                    return tVarArr[i4];
                }
            }
        }
        return null;
    }
}
