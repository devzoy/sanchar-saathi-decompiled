package com.google.android.gms.internal.clearcut;

import E1.d;
import O1.b;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.clearcut.J1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import t1.C0926a;

public final class V1 implements C0926a.b {

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f6907b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    public static final C0448o f6908c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0448o f6909d = new C0448o(b.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:sampling_").h("LogSampling__");

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap f6910e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f6911f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public static Boolean f6912g = null;

    /* renamed from: h  reason: collision with root package name */
    public static Long f6913h = null;

    /* renamed from: i  reason: collision with root package name */
    public static final C0418e f6914i;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6915a;

    static {
        C0448o h4 = new C0448o(b.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:samplingrules_").h("LogSamplingRules__");
        f6908c = h4;
        f6914i = h4.e("enable_log_sampling_rules", false);
    }

    public V1(Context context) {
        this.f6915a = context;
        if (context != null) {
            C0418e.b(context);
        }
    }

    public static long b(String str, long j4) {
        if (str == null || str.isEmpty()) {
            return Q1.c(ByteBuffer.allocate(8).putLong(j4).array());
        }
        byte[] bytes = str.getBytes(f6907b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j4);
        return Q1.c(allocate.array());
    }

    public static J1.b c(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        int i4 = 0;
        if (indexOf >= 0) {
            i4 = indexOf + 1;
            str2 = str.substring(0, indexOf);
        } else {
            str2 = "";
        }
        int indexOf2 = str.indexOf(47, i4);
        if (indexOf2 <= 0) {
            Log.e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i4, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return (J1.b) J1.b.z().q(str2).r(parseLong).s(parseLong2).p();
            }
            StringBuilder sb = new StringBuilder(72);
            sb.append("negative values not supported: ");
            sb.append(parseLong);
            sb.append("/");
            sb.append(parseLong2);
            Log.e("LogSamplerImpl", sb.toString());
            return null;
        } catch (NumberFormatException e4) {
            Log.e("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e4);
            return null;
        }
    }

    public static boolean d(long j4, long j5, long j6) {
        if (j5 < 0 || j6 <= 0) {
            return true;
        }
        return ((j4 > 0 ? 1 : (j4 == 0 ? 0 : -1)) >= 0 ? j4 % j6 : (((Long.MAX_VALUE % j6) + 1) + ((j4 & Long.MAX_VALUE) % j6)) % j6) < j5;
    }

    public static boolean e(Context context) {
        if (f6912g == null) {
            f6912g = Boolean.valueOf(d.a(context).a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f6912g.booleanValue();
    }

    public static long f(Context context) {
        if (f6913h == null) {
            long j4 = 0;
            if (context == null) {
                return 0;
            }
            if (e(context)) {
                j4 = Z1.a(context.getContentResolver(), "android_id", 0);
            }
            f6913h = Long.valueOf(j4);
        }
        return f6913h.longValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(t1.C0931f r13) {
        /*
            r12 = this;
            com.google.android.gms.internal.clearcut.X1 r0 = r13.f12069e
            java.lang.String r1 = r0.f6985k
            int r0 = r0.f6981g
            com.google.android.gms.internal.clearcut.M1 r13 = r13.f12077m
            r2 = 0
            if (r13 == 0) goto L_0x000e
            int r13 = r13.f6836j
            goto L_0x000f
        L_0x000e:
            r13 = r2
        L_0x000f:
            com.google.android.gms.internal.clearcut.e r3 = f6914i
            java.lang.Object r3 = r3.a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 != 0) goto L_0x0077
            if (r1 == 0) goto L_0x0027
            boolean r13 = r1.isEmpty()
            if (r13 != 0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            if (r0 < 0) goto L_0x002e
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x002f
        L_0x002e:
            r1 = r4
        L_0x002f:
            if (r1 == 0) goto L_0x00fb
            android.content.Context r13 = r12.f6915a
            if (r13 == 0) goto L_0x0056
            boolean r13 = e(r13)
            if (r13 != 0) goto L_0x003c
            goto L_0x0056
        L_0x003c:
            java.util.HashMap r13 = f6911f
            java.lang.Object r0 = r13.get(r1)
            com.google.android.gms.internal.clearcut.e r0 = (com.google.android.gms.internal.clearcut.C0418e) r0
            if (r0 != 0) goto L_0x004f
            com.google.android.gms.internal.clearcut.o r0 = f6909d
            com.google.android.gms.internal.clearcut.e r0 = r0.b(r1, r4)
            r13.put(r1, r0)
        L_0x004f:
            java.lang.Object r13 = r0.a()
            r4 = r13
            java.lang.String r4 = (java.lang.String) r4
        L_0x0056:
            com.google.android.gms.internal.clearcut.J1$b r13 = c(r4)
            if (r13 == 0) goto L_0x00fb
            java.lang.String r0 = r13.w()
            android.content.Context r1 = r12.f6915a
            long r1 = f(r1)
            long r3 = b(r0, r1)
            long r5 = r13.x()
            long r7 = r13.y()
            boolean r13 = d(r3, r5, r7)
            return r13
        L_0x0077:
            if (r1 == 0) goto L_0x0080
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x0080
            goto L_0x0088
        L_0x0080:
            if (r0 < 0) goto L_0x0087
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x0088
        L_0x0087:
            r1 = r4
        L_0x0088:
            if (r1 == 0) goto L_0x00fb
            android.content.Context r0 = r12.f6915a
            if (r0 != 0) goto L_0x0093
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00bc
        L_0x0093:
            java.util.concurrent.ConcurrentHashMap r0 = f6910e
            java.lang.Object r3 = r0.get(r1)
            com.google.android.gms.internal.clearcut.e r3 = (com.google.android.gms.internal.clearcut.C0418e) r3
            if (r3 != 0) goto L_0x00b2
            com.google.android.gms.internal.clearcut.o r3 = f6908c
            com.google.android.gms.internal.clearcut.J1 r4 = com.google.android.gms.internal.clearcut.J1.s()
            com.google.android.gms.internal.clearcut.n r5 = com.google.android.gms.internal.clearcut.W1.f6975a
            com.google.android.gms.internal.clearcut.e r3 = r3.a(r1, r4, r5)
            java.lang.Object r0 = r0.putIfAbsent(r1, r3)
            com.google.android.gms.internal.clearcut.e r0 = (com.google.android.gms.internal.clearcut.C0418e) r0
            if (r0 == 0) goto L_0x00b2
            r3 = r0
        L_0x00b2:
            java.lang.Object r0 = r3.a()
            com.google.android.gms.internal.clearcut.J1 r0 = (com.google.android.gms.internal.clearcut.J1) r0
            java.util.List r0 = r0.r()
        L_0x00bc:
            java.util.Iterator r0 = r0.iterator()
        L_0x00c0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.clearcut.J1$b r1 = (com.google.android.gms.internal.clearcut.J1.b) r1
            boolean r3 = r1.v()
            if (r3 == 0) goto L_0x00de
            int r3 = r1.r()
            if (r3 == 0) goto L_0x00de
            int r3 = r1.r()
            if (r3 != r13) goto L_0x00c0
        L_0x00de:
            java.lang.String r3 = r1.w()
            android.content.Context r4 = r12.f6915a
            long r4 = f(r4)
            long r6 = b(r3, r4)
            long r8 = r1.x()
            long r10 = r1.y()
            boolean r1 = d(r6, r8, r10)
            if (r1 != 0) goto L_0x00c0
            return r2
        L_0x00fb:
            r13 = 1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.V1.a(t1.f):boolean");
    }
}
