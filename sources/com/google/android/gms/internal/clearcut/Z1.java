package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public abstract class Z1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f7001a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f7002b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f7003c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f7004d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f7005e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    public static HashMap f7006f;

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap f7007g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap f7008h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap f7009i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap f7010j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public static Object f7011k;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f7012l;

    /* renamed from: m  reason: collision with root package name */
    public static String[] f7013m = new String[0];

    public static long a(ContentResolver contentResolver, String str, long j4) {
        Object i4 = i(contentResolver);
        long j5 = 0;
        Long l4 = (Long) b(f7009i, str, 0L);
        if (l4 != null) {
            return l4.longValue();
        }
        String c4 = c(contentResolver, str, (String) null);
        if (c4 != null) {
            try {
                long parseLong = Long.parseLong(c4);
                l4 = Long.valueOf(parseLong);
                j5 = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        g(i4, f7009i, str, l4);
        return j5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object b(java.util.HashMap r2, java.lang.String r3, java.lang.Object r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.clearcut.Z1> r0 = com.google.android.gms.internal.clearcut.Z1.class
            monitor-enter(r0)
            boolean r1 = r2.containsKey(r3)     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0014
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0012 }
            if (r2 == 0) goto L_0x0010
            r4 = r2
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r4
        L_0x0012:
            r2 = move-exception
            goto L_0x0017
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            r2 = 0
            return r2
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Z1.b(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r12 = r12.query(f7001a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r13}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r12 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        if (r12.moveToFirst() != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        r14 = r12.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r14 == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r14.equals((java.lang.Object) null) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0089, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008b, code lost:
        f(r0, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008e, code lost:
        if (r14 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0090, code lost:
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0091, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        f(r0, r13, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0098, code lost:
        if (r12 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009a, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009e, code lost:
        if (r12 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a0, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a3, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(android.content.ContentResolver r12, java.lang.String r13, java.lang.String r14) {
        /*
            java.lang.Class<com.google.android.gms.internal.clearcut.Z1> r14 = com.google.android.gms.internal.clearcut.Z1.class
            monitor-enter(r14)
            e(r12)     // Catch:{ all -> 0x001e }
            java.lang.Object r0 = f7011k     // Catch:{ all -> 0x001e }
            java.util.HashMap r1 = f7006f     // Catch:{ all -> 0x001e }
            boolean r1 = r1.containsKey(r13)     // Catch:{ all -> 0x001e }
            r2 = 0
            if (r1 == 0) goto L_0x0021
            java.util.HashMap r12 = f7006f     // Catch:{ all -> 0x001e }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x001e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x001e }
            if (r12 == 0) goto L_0x001c
            r2 = r12
        L_0x001c:
            monitor-exit(r14)     // Catch:{ all -> 0x001e }
            return r2
        L_0x001e:
            r12 = move-exception
            goto L_0x00a4
        L_0x0021:
            java.lang.String[] r1 = f7013m     // Catch:{ all -> 0x001e }
            int r3 = r1.length     // Catch:{ all -> 0x001e }
            r4 = 0
        L_0x0025:
            r5 = 1
            if (r4 >= r3) goto L_0x0063
            r6 = r1[r4]     // Catch:{ all -> 0x001e }
            boolean r6 = r13.startsWith(r6)     // Catch:{ all -> 0x001e }
            if (r6 == 0) goto L_0x0060
            boolean r0 = f7012l     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x003c
            java.util.HashMap r0 = f7006f     // Catch:{ all -> 0x001e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x005e
        L_0x003c:
            java.lang.String[] r0 = f7013m     // Catch:{ all -> 0x001e }
            java.util.HashMap r1 = f7006f     // Catch:{ all -> 0x001e }
            java.util.Map r12 = d(r12, r0)     // Catch:{ all -> 0x001e }
            r1.putAll(r12)     // Catch:{ all -> 0x001e }
            f7012l = r5     // Catch:{ all -> 0x001e }
            java.util.HashMap r12 = f7006f     // Catch:{ all -> 0x001e }
            boolean r12 = r12.containsKey(r13)     // Catch:{ all -> 0x001e }
            if (r12 == 0) goto L_0x005e
            java.util.HashMap r12 = f7006f     // Catch:{ all -> 0x001e }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x001e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x001e }
            if (r12 == 0) goto L_0x005c
            r2 = r12
        L_0x005c:
            monitor-exit(r14)     // Catch:{ all -> 0x001e }
            return r2
        L_0x005e:
            monitor-exit(r14)     // Catch:{ all -> 0x001e }
            return r2
        L_0x0060:
            int r4 = r4 + 1
            goto L_0x0025
        L_0x0063:
            monitor-exit(r14)     // Catch:{ all -> 0x001e }
            android.net.Uri r7 = f7001a
            java.lang.String[] r10 = new java.lang.String[]{r13}
            r11 = 0
            r8 = 0
            r9 = 0
            r6 = r12
            android.database.Cursor r12 = r6.query(r7, r8, r9, r10, r11)
            if (r12 == 0) goto L_0x0095
            boolean r14 = r12.moveToFirst()     // Catch:{ all -> 0x0089 }
            if (r14 != 0) goto L_0x007b
            goto L_0x0095
        L_0x007b:
            java.lang.String r14 = r12.getString(r5)     // Catch:{ all -> 0x0089 }
            if (r14 == 0) goto L_0x008b
            boolean r1 = r14.equals(r2)     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x008b
            r14 = r2
            goto L_0x008b
        L_0x0089:
            r13 = move-exception
            goto L_0x009e
        L_0x008b:
            f(r0, r13, r14)     // Catch:{ all -> 0x0089 }
            if (r14 == 0) goto L_0x0091
            r2 = r14
        L_0x0091:
            r12.close()
            return r2
        L_0x0095:
            f(r0, r13, r2)     // Catch:{ all -> 0x0089 }
            if (r12 == 0) goto L_0x009d
            r12.close()
        L_0x009d:
            return r2
        L_0x009e:
            if (r12 == 0) goto L_0x00a3
            r12.close()
        L_0x00a3:
            throw r13
        L_0x00a4:
            monitor-exit(r14)     // Catch:{ all -> 0x001e }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Z1.c(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    public static Map d(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f7002b, (String[]) null, (String) null, strArr, (String) null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    public static void e(ContentResolver contentResolver) {
        if (f7006f == null) {
            f7005e.set(false);
            f7006f = new HashMap();
            f7011k = new Object();
            f7012l = false;
            contentResolver.registerContentObserver(f7001a, true, new a2((Handler) null));
        } else if (f7005e.getAndSet(false)) {
            f7006f.clear();
            f7007g.clear();
            f7008h.clear();
            f7009i.clear();
            f7010j.clear();
            f7011k = new Object();
            f7012l = false;
        }
    }

    public static void f(Object obj, String str, String str2) {
        synchronized (Z1.class) {
            try {
                if (obj == f7011k) {
                    f7006f.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (Z1.class) {
            try {
                if (obj == f7011k) {
                    hashMap.put(str, obj2);
                    f7006f.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean h(ContentResolver contentResolver, String str, boolean z4) {
        Object i4 = i(contentResolver);
        HashMap hashMap = f7007g;
        Boolean bool = (Boolean) b(hashMap, str, Boolean.valueOf(z4));
        if (bool != null) {
            return bool.booleanValue();
        }
        String c4 = c(contentResolver, str, (String) null);
        if (c4 != null && !c4.equals("")) {
            if (f7003c.matcher(c4).matches()) {
                bool = Boolean.TRUE;
                z4 = true;
            } else if (f7004d.matcher(c4).matches()) {
                bool = Boolean.FALSE;
                z4 = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + c4 + "\") as boolean");
            }
        }
        g(i4, hashMap, str, bool);
        return z4;
    }

    public static Object i(ContentResolver contentResolver) {
        Object obj;
        synchronized (Z1.class) {
            e(contentResolver);
            obj = f7011k;
        }
        return obj;
    }
}
