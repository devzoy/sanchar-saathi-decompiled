package G1;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static ClassLoader f1265a;

    /* renamed from: b  reason: collision with root package name */
    public static Thread f1266b;

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00af, code lost:
        if (r2 == null) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.ClassLoader a() {
        /*
            java.lang.Class<G1.b> r0 = G1.b.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = f1265a     // Catch:{ all -> 0x00b2 }
            if (r1 != 0) goto L_0x00e9
            java.lang.String r1 = "Failed to get thread context classloader "
            java.lang.Thread r2 = f1266b     // Catch:{ all -> 0x00b2 }
            r3 = 0
            if (r2 != 0) goto L_0x00b6
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00b2 }
            java.lang.Thread r2 = r2.getThread()     // Catch:{ all -> 0x00b2 }
            java.lang.ThreadGroup r2 = r2.getThreadGroup()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = "Failed to enumerate thread/threadgroup "
            if (r2 != 0) goto L_0x0021
            r2 = r3
            goto L_0x00ad
        L_0x0021:
            java.lang.Class<java.lang.Void> r5 = java.lang.Void.class
            monitor-enter(r5)     // Catch:{ all -> 0x00b2 }
            int r6 = r2.activeGroupCount()     // Catch:{ SecurityException -> 0x0046 }
            java.lang.ThreadGroup[] r7 = new java.lang.ThreadGroup[r6]     // Catch:{ SecurityException -> 0x0046 }
            r2.enumerate(r7)     // Catch:{ SecurityException -> 0x0046 }
            r8 = 0
            r9 = r8
        L_0x002f:
            if (r9 >= r6) goto L_0x0048
            r10 = r7[r9]     // Catch:{ SecurityException -> 0x0046 }
            java.lang.String r11 = "dynamiteLoader"
            java.lang.String r12 = r10.getName()     // Catch:{ SecurityException -> 0x0046 }
            boolean r11 = r11.equals(r12)     // Catch:{ SecurityException -> 0x0046 }
            if (r11 == 0) goto L_0x0040
            goto L_0x0049
        L_0x0040:
            int r9 = r9 + 1
            goto L_0x002f
        L_0x0043:
            r1 = move-exception
            goto L_0x00b4
        L_0x0046:
            r2 = move-exception
            goto L_0x0087
        L_0x0048:
            r10 = r3
        L_0x0049:
            if (r10 != 0) goto L_0x0052
            java.lang.ThreadGroup r10 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x0046 }
            java.lang.String r6 = "dynamiteLoader"
            r10.<init>(r2, r6)     // Catch:{ SecurityException -> 0x0046 }
        L_0x0052:
            int r2 = r10.activeCount()     // Catch:{ SecurityException -> 0x0046 }
            java.lang.Thread[] r6 = new java.lang.Thread[r2]     // Catch:{ SecurityException -> 0x0046 }
            r10.enumerate(r6)     // Catch:{ SecurityException -> 0x0046 }
        L_0x005b:
            if (r8 >= r2) goto L_0x006f
            r7 = r6[r8]     // Catch:{ SecurityException -> 0x0046 }
            java.lang.String r9 = "GmsDynamite"
            java.lang.String r11 = r7.getName()     // Catch:{ SecurityException -> 0x0046 }
            boolean r9 = r9.equals(r11)     // Catch:{ SecurityException -> 0x0046 }
            if (r9 == 0) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            int r8 = r8 + 1
            goto L_0x005b
        L_0x006f:
            r7 = r3
        L_0x0070:
            if (r7 != 0) goto L_0x00ab
            G1.a r2 = new G1.a     // Catch:{ SecurityException -> 0x0084 }
            java.lang.String r6 = "GmsDynamite"
            r2.<init>(r10, r6)     // Catch:{ SecurityException -> 0x0084 }
            r2.setContextClassLoader(r3)     // Catch:{ SecurityException -> 0x0081 }
            r2.start()     // Catch:{ SecurityException -> 0x0081 }
            r7 = r2
            goto L_0x00ab
        L_0x0081:
            r6 = move-exception
            r7 = r2
            goto L_0x0089
        L_0x0084:
            r2 = move-exception
            r6 = r2
            goto L_0x0089
        L_0x0087:
            r6 = r2
            r7 = r3
        L_0x0089:
            java.lang.String r2 = "DynamiteLoaderV2CL"
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0043 }
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0043 }
            int r8 = r8.length()     // Catch:{ all -> 0x0043 }
            int r8 = r8 + 39
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0043 }
            r9.<init>(r8)     // Catch:{ all -> 0x0043 }
            r9.append(r4)     // Catch:{ all -> 0x0043 }
            r9.append(r6)     // Catch:{ all -> 0x0043 }
            java.lang.String r4 = r9.toString()     // Catch:{ all -> 0x0043 }
            android.util.Log.w(r2, r4)     // Catch:{ all -> 0x0043 }
        L_0x00ab:
            monitor-exit(r5)     // Catch:{ all -> 0x0043 }
            r2 = r7
        L_0x00ad:
            f1266b = r2     // Catch:{ all -> 0x00b2 }
            if (r2 != 0) goto L_0x00b6
            goto L_0x00e4
        L_0x00b2:
            r1 = move-exception
            goto L_0x00ed
        L_0x00b4:
            monitor-exit(r5)     // Catch:{ all -> 0x0043 }
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b6:
            monitor-enter(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.Thread r4 = f1266b     // Catch:{ SecurityException -> 0x00c0 }
            java.lang.ClassLoader r3 = r4.getContextClassLoader()     // Catch:{ SecurityException -> 0x00c0 }
            goto L_0x00e3
        L_0x00be:
            r1 = move-exception
            goto L_0x00e7
        L_0x00c0:
            r4 = move-exception
            java.lang.String r5 = "DynamiteLoaderV2CL"
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00be }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00be }
            int r6 = r6.length()     // Catch:{ all -> 0x00be }
            int r6 = r6 + 41
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r7.<init>(r6)     // Catch:{ all -> 0x00be }
            r7.append(r1)     // Catch:{ all -> 0x00be }
            r7.append(r4)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x00be }
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x00be }
        L_0x00e3:
            monitor-exit(r2)     // Catch:{ all -> 0x00be }
        L_0x00e4:
            f1265a = r3     // Catch:{ all -> 0x00b2 }
            goto L_0x00e9
        L_0x00e7:
            monitor-exit(r2)     // Catch:{ all -> 0x00be }
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00e9:
            java.lang.ClassLoader r1 = f1265a     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)
            return r1
        L_0x00ed:
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.b.a():java.lang.ClassLoader");
    }
}
