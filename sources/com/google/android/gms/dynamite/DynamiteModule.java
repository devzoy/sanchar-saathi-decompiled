package com.google.android.gms.dynamite;

import G1.d;
import G1.f;
import G1.g;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import net.sqlcipher.database.SQLiteDatabase;
import u1.e;
import z1.C1031n;
import z1.C1032o;

public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    public static final b f6678b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final b f6679c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final b f6680d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final b f6681e = new e();

    /* renamed from: f  reason: collision with root package name */
    public static final b f6682f = new f();

    /* renamed from: g  reason: collision with root package name */
    public static final b f6683g = new g();

    /* renamed from: h  reason: collision with root package name */
    public static Boolean f6684h = null;

    /* renamed from: i  reason: collision with root package name */
    public static String f6685i = null;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f6686j = false;

    /* renamed from: k  reason: collision with root package name */
    public static int f6687k = -1;

    /* renamed from: l  reason: collision with root package name */
    public static Boolean f6688l;

    /* renamed from: m  reason: collision with root package name */
    public static final ThreadLocal f6689m = new ThreadLocal();

    /* renamed from: n  reason: collision with root package name */
    public static final ThreadLocal f6690n = new d();

    /* renamed from: o  reason: collision with root package name */
    public static final b.a f6691o = new a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f6692p = new h();

    /* renamed from: q  reason: collision with root package name */
    public static f f6693q;

    /* renamed from: r  reason: collision with root package name */
    public static g f6694r;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6695a;

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public /* synthetic */ a(String str, Throwable th, byte[] bArr) {
            super(str, th);
        }

        public /* synthetic */ a(String str, byte[] bArr) {
            super(str);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z4);

            int b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public static class C0126b {

            /* renamed from: a  reason: collision with root package name */
            public int f6696a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f6697b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f6698c = 0;
        }

        C0126b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        C1032o.f(context);
        this.f6695a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C1031n.a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e4) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e4.getMessage())));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x02be A[Catch:{ all -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02d5 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02e4 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule c(android.content.Context r29, com.google.android.gms.dynamite.DynamiteModule.b r30, java.lang.String r31) {
        /*
            r1 = r29
            r2 = r30
            r3 = r31
            java.lang.String r0 = " and remote module "
            java.lang.String r4 = ":"
            java.lang.String r5 = "Considering local module "
            java.lang.String r6 = "VersionPolicy returned invalid code:"
            java.lang.String r7 = "."
            java.lang.String r8 = " and remote version is "
            java.lang.String r9 = " found. Local version is "
            java.lang.String r10 = "No acceptable module "
            java.lang.String r11 = "Failed to load remote module: "
            android.content.Context r12 = r29.getApplicationContext()
            r13 = 0
            if (r12 == 0) goto L_0x0385
            java.lang.ThreadLocal r14 = f6689m
            java.lang.Object r15 = r14.get()
            G1.e r15 = (G1.e) r15
            r16 = r7
            G1.e r7 = new G1.e
            r7.<init>(r13)
            r14.set(r7)
            java.lang.ThreadLocal r13 = f6690n
            java.lang.Object r17 = r13.get()
            r18 = r8
            r8 = r17
            java.lang.Long r8 = (java.lang.Long) r8
            long r19 = r8.longValue()
            r21 = 0
            long r23 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00c1 }
            r17 = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x00c1 }
            r13.set(r9)     // Catch:{ all -> 0x00c1 }
            com.google.android.gms.dynamite.DynamiteModule$b$a r9 = f6691o     // Catch:{ all -> 0x00c1 }
            com.google.android.gms.dynamite.DynamiteModule$b$b r9 = r2.a(r1, r3, r9)     // Catch:{ all -> 0x00c1 }
            r23 = r10
            java.lang.String r10 = "DynamiteModule"
            r24 = r6
            int r6 = r9.f6696a     // Catch:{ all -> 0x00c1 }
            int r2 = r9.f6697b     // Catch:{ all -> 0x00c1 }
            java.lang.String r25 = java.lang.String.valueOf(r31)     // Catch:{ all -> 0x00c1 }
            int r25 = r25.length()     // Catch:{ all -> 0x00c1 }
            int r25 = r25 + 26
            java.lang.String r26 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c1 }
            int r26 = r26.length()     // Catch:{ all -> 0x00c1 }
            int r25 = r25 + r26
            int r25 = r25 + 19
            java.lang.String r26 = java.lang.String.valueOf(r31)     // Catch:{ all -> 0x00c1 }
            int r26 = r26.length()     // Catch:{ all -> 0x00c1 }
            int r25 = r25 + r26
            r26 = r11
            r11 = 1
            int r25 = r25 + 1
            java.lang.String r27 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00c1 }
            int r27 = r27.length()     // Catch:{ all -> 0x00c1 }
            int r11 = r25 + r27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r1.<init>(r11)     // Catch:{ all -> 0x00c1 }
            r1.append(r5)     // Catch:{ all -> 0x00c1 }
            r1.append(r3)     // Catch:{ all -> 0x00c1 }
            r1.append(r4)     // Catch:{ all -> 0x00c1 }
            r1.append(r6)     // Catch:{ all -> 0x00c1 }
            r1.append(r0)     // Catch:{ all -> 0x00c1 }
            r1.append(r3)     // Catch:{ all -> 0x00c1 }
            r1.append(r4)     // Catch:{ all -> 0x00c1 }
            r1.append(r2)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c1 }
            android.util.Log.i(r10, r0)     // Catch:{ all -> 0x00c1 }
            int r0 = r9.f6698c     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0318
            r1 = -1
            if (r0 != r1) goto L_0x00bf
            int r0 = r9.f6696a     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0318
            r0 = r1
        L_0x00bf:
            r2 = 1
            goto L_0x00c4
        L_0x00c1:
            r0 = move-exception
            goto L_0x0369
        L_0x00c4:
            if (r0 != r2) goto L_0x00ca
            int r2 = r9.f6697b     // Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x0318
        L_0x00ca:
            if (r0 != r1) goto L_0x00e6
            com.google.android.gms.dynamite.DynamiteModule r0 = h(r12, r3)     // Catch:{ all -> 0x00c1 }
            int r1 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r1 != 0) goto L_0x00d8
            r13.remove()
            goto L_0x00db
        L_0x00d8:
            r13.set(r8)
        L_0x00db:
            android.database.Cursor r1 = r7.f1267a
            if (r1 == 0) goto L_0x00e2
            r1.close()
        L_0x00e2:
            r14.set(r15)
            return r0
        L_0x00e6:
            r2 = 1
            if (r0 != r2) goto L_0x02f6
            r2 = 0
            int r0 = r9.f6697b     // Catch:{ a -> 0x0293 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            boolean r5 = e(r29)     // Catch:{ all -> 0x026e }
            if (r5 == 0) goto L_0x0270
            java.lang.Boolean r5 = f6684h     // Catch:{ all -> 0x026e }
            monitor-exit(r4)     // Catch:{ all -> 0x026e }
            if (r5 == 0) goto L_0x0265
            boolean r4 = r5.booleanValue()     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r5 = 2
            if (r4 == 0) goto L_0x01c5
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r6 = "Selected remote version of "
            java.lang.String r10 = ", version >= "
            java.lang.String r11 = java.lang.String.valueOf(r31)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            int r11 = r11.length()     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            int r11 = r11 + 40
            java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            int r13 = r13.length()     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            int r11 = r11 + r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r13.<init>(r11)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r13.append(r6)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r13.append(r3)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r13.append(r10)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r13.append(r0)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            java.lang.String r6 = r13.toString()     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            android.util.Log.i(r4, r6)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            G1.g r6 = f6694r     // Catch:{ all -> 0x01c2 }
            monitor-exit(r4)     // Catch:{ all -> 0x01c2 }
            if (r6 == 0) goto L_0x01b9
            java.lang.Object r4 = r14.get()     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            G1.e r4 = (G1.e) r4     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            if (r4 == 0) goto L_0x01b0
            android.database.Cursor r10 = r4.f1267a     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            if (r10 == 0) goto L_0x01b0
            android.content.Context r10 = r29.getApplicationContext()     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            android.database.Cursor r4 = r4.f1267a     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r11 = 0
            F1.b.K(r11)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r11 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r11)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            int r13 = f6687k     // Catch:{ all -> 0x01ad }
            if (r13 < r5) goto L_0x015a
            r28 = 1
            goto L_0x015c
        L_0x015a:
            r28 = r2
        L_0x015c:
            monitor-exit(r11)     // Catch:{ all -> 0x01ad }
            if (r28 == 0) goto L_0x0182
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r11 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r5, r11)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            F1.a r5 = F1.b.K(r10)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            F1.a r4 = F1.b.K(r4)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            F1.a r0 = r6.K(r5, r3, r0, r4)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            goto L_0x0195
        L_0x0173:
            r0 = move-exception
            r4 = r29
            goto L_0x027b
        L_0x0178:
            r0 = move-exception
            r4 = r29
            goto L_0x0289
        L_0x017d:
            r0 = move-exception
            r4 = r29
            goto L_0x028a
        L_0x0182:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r11 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r5, r11)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            F1.a r5 = F1.b.K(r10)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            F1.a r4 = F1.b.K(r4)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            F1.a r0 = r6.J(r5, r3, r0, r4)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
        L_0x0195:
            java.lang.Object r0 = F1.b.J(r0)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            if (r0 == 0) goto L_0x01a4
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r4.<init>(r0)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            goto L_0x02d1
        L_0x01a4:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            java.lang.String r4 = "Failed to get module context"
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            throw r0     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
        L_0x01ad:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01ad }
            throw r0     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
        L_0x01b0:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            java.lang.String r4 = "No result cursor"
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            throw r0     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
        L_0x01b9:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            java.lang.String r4 = "DynamiteLoaderV2 was not cached."
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            throw r0     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
        L_0x01c2:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01c2 }
            throw r0     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
        L_0x01c5:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r6 = "Selected remote version of "
            java.lang.String r10 = ", version >= "
            java.lang.String r11 = java.lang.String.valueOf(r31)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            int r11 = r11.length()     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            int r11 = r11 + 40
            java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            int r13 = r13.length()     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            int r11 = r11 + r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r13.<init>(r11)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r13.append(r6)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r13.append(r3)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r13.append(r10)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r13.append(r0)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            java.lang.String r6 = r13.toString()     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            android.util.Log.i(r4, r6)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            G1.f r4 = j(r29)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            if (r4 == 0) goto L_0x025c
            int r6 = r4.N()     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r10 = 3
            if (r6 < r10) goto L_0x0223
            java.lang.Object r5 = r14.get()     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            G1.e r5 = (G1.e) r5     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            if (r5 == 0) goto L_0x021a
            F1.a r6 = F1.b.K(r29)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            android.database.Cursor r5 = r5.f1267a     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            F1.a r5 = F1.b.K(r5)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            F1.a r0 = r4.P(r6, r3, r0, r5)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            goto L_0x0244
        L_0x021a:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            java.lang.String r4 = "No cached result cursor holder"
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            throw r0     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
        L_0x0223:
            if (r6 != r5) goto L_0x0235
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r6 = "IDynamite loader version = 2"
            android.util.Log.w(r5, r6)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            F1.a r5 = F1.b.K(r29)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            F1.a r0 = r4.L(r5, r3, r0)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            goto L_0x0244
        L_0x0235:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r6 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r5, r6)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            F1.a r5 = F1.b.K(r29)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            F1.a r0 = r4.J(r5, r3, r0)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
        L_0x0244:
            java.lang.Object r0 = F1.b.J(r0)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            if (r0 == 0) goto L_0x0253
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            r4.<init>(r0)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            goto L_0x02d1
        L_0x0253:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            java.lang.String r4 = "Failed to load remote module."
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            throw r0     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
        L_0x025c:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            java.lang.String r4 = "Failed to create IDynamiteLoader."
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            throw r0     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
        L_0x0265:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            java.lang.String r4 = "Failed to determine which loading route to use."
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
            throw r0     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
        L_0x026e:
            r0 = move-exception
            goto L_0x0279
        L_0x0270:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x026e }
            java.lang.String r5 = "Remote loading disabled"
            r6 = 0
            r0.<init>(r5, r6)     // Catch:{ all -> 0x026e }
            throw r0     // Catch:{ all -> 0x026e }
        L_0x0279:
            monitor-exit(r4)     // Catch:{ all -> 0x026e }
            throw r0     // Catch:{ RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173 }
        L_0x027b:
            D1.d.a(r4, r0)     // Catch:{ a -> 0x0287 }
            com.google.android.gms.dynamite.DynamiteModule$a r5 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x0287 }
            java.lang.String r6 = "Failed to load remote module."
            r10 = 0
            r5.<init>(r6, r0, r10)     // Catch:{ a -> 0x0287 }
            throw r5     // Catch:{ a -> 0x0287 }
        L_0x0287:
            r0 = move-exception
            goto L_0x0296
        L_0x0289:
            throw r0     // Catch:{ a -> 0x0287 }
        L_0x028a:
            com.google.android.gms.dynamite.DynamiteModule$a r5 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x0287 }
            java.lang.String r6 = "Failed to load remote module."
            r10 = 0
            r5.<init>(r6, r0, r10)     // Catch:{ a -> 0x0287 }
            throw r5     // Catch:{ a -> 0x0287 }
        L_0x0293:
            r0 = move-exception
            r4 = r29
        L_0x0296:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r6 = r0.getMessage()     // Catch:{ all -> 0x00c1 }
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c1 }
            int r10 = r10.length()     // Catch:{ all -> 0x00c1 }
            int r10 = r10 + 30
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r11.<init>(r10)     // Catch:{ all -> 0x00c1 }
            r10 = r26
            r11.append(r10)     // Catch:{ all -> 0x00c1 }
            r11.append(r6)     // Catch:{ all -> 0x00c1 }
            java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x00c1 }
            android.util.Log.w(r5, r6)     // Catch:{ all -> 0x00c1 }
            int r5 = r9.f6696a     // Catch:{ all -> 0x00c1 }
            if (r5 == 0) goto L_0x02ed
            com.google.android.gms.dynamite.i r6 = new com.google.android.gms.dynamite.i     // Catch:{ all -> 0x00c1 }
            r6.<init>(r5, r2)     // Catch:{ all -> 0x00c1 }
            r2 = r30
            com.google.android.gms.dynamite.DynamiteModule$b$b r2 = r2.a(r4, r3, r6)     // Catch:{ all -> 0x00c1 }
            int r2 = r2.f6698c     // Catch:{ all -> 0x00c1 }
            if (r2 != r1) goto L_0x02ed
            com.google.android.gms.dynamite.DynamiteModule r4 = h(r12, r3)     // Catch:{ all -> 0x00c1 }
        L_0x02d1:
            int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x02db
            java.lang.ThreadLocal r0 = f6690n
            r0.remove()
            goto L_0x02e0
        L_0x02db:
            java.lang.ThreadLocal r0 = f6690n
            r0.set(r8)
        L_0x02e0:
            android.database.Cursor r0 = r7.f1267a
            if (r0 == 0) goto L_0x02e7
            r0.close()
        L_0x02e7:
            java.lang.ThreadLocal r0 = f6689m
            r0.set(r15)
            return r4
        L_0x02ed:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x00c1 }
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x02f6:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00c1 }
            int r2 = r2.length()     // Catch:{ all -> 0x00c1 }
            int r2 = r2 + 36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r3.<init>(r2)     // Catch:{ all -> 0x00c1 }
            r2 = r24
            r3.append(r2)     // Catch:{ all -> 0x00c1 }
            r3.append(r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00c1 }
            r2 = 0
            r1.<init>(r0, r2)     // Catch:{ all -> 0x00c1 }
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x0318:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00c1 }
            int r1 = r9.f6696a     // Catch:{ all -> 0x00c1 }
            int r2 = r9.f6697b     // Catch:{ all -> 0x00c1 }
            java.lang.String r4 = java.lang.String.valueOf(r31)     // Catch:{ all -> 0x00c1 }
            int r4 = r4.length()     // Catch:{ all -> 0x00c1 }
            int r4 = r4 + 46
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c1 }
            int r5 = r5.length()     // Catch:{ all -> 0x00c1 }
            int r4 = r4 + r5
            int r4 = r4 + 23
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00c1 }
            int r5 = r5.length()     // Catch:{ all -> 0x00c1 }
            int r4 = r4 + r5
            r5 = 1
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r5.<init>(r4)     // Catch:{ all -> 0x00c1 }
            r4 = r23
            r5.append(r4)     // Catch:{ all -> 0x00c1 }
            r5.append(r3)     // Catch:{ all -> 0x00c1 }
            r3 = r17
            r5.append(r3)     // Catch:{ all -> 0x00c1 }
            r5.append(r1)     // Catch:{ all -> 0x00c1 }
            r1 = r18
            r5.append(r1)     // Catch:{ all -> 0x00c1 }
            r5.append(r2)     // Catch:{ all -> 0x00c1 }
            r1 = r16
            r5.append(r1)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x00c1 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00c1 }
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x0369:
            int r1 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r1 != 0) goto L_0x0373
            java.lang.ThreadLocal r1 = f6690n
            r1.remove()
            goto L_0x0378
        L_0x0373:
            java.lang.ThreadLocal r1 = f6690n
            r1.set(r8)
        L_0x0378:
            android.database.Cursor r1 = r7.f1267a
            if (r1 == 0) goto L_0x037f
            r1.close()
        L_0x037f:
            java.lang.ThreadLocal r1 = f6689m
            r1.set(r15)
            throw r0
        L_0x0385:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r1 = "null application Context"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x0060=Splitter:B:33:0x0060, B:18:0x0042=Splitter:B:18:0x0042, B:52:0x00a4=Splitter:B:52:0x00a4} */
    public static int d(android.content.Context r12, java.lang.String r13, boolean r14) {
        /*
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r1 = "Failed to load module via V2: "
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r2 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r2)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r3 = f6684h     // Catch:{ all -> 0x004f }
            r4 = 0
            r5 = 0
            if (r3 != 0) goto L_0x00e6
            android.content.Context r3 = r12.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00c2, IllegalAccessException -> 0x00c0, NoSuchFieldException -> 0x00be }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00c2, IllegalAccessException -> 0x00c0, NoSuchFieldException -> 0x00be }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r6 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r6 = r6.getName()     // Catch:{ ClassNotFoundException -> 0x00c2, IllegalAccessException -> 0x00c0, NoSuchFieldException -> 0x00be }
            java.lang.Class r3 = r3.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x00c2, IllegalAccessException -> 0x00c0, NoSuchFieldException -> 0x00be }
            java.lang.String r6 = "sClassLoader"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r6)     // Catch:{ ClassNotFoundException -> 0x00c2, IllegalAccessException -> 0x00c0, NoSuchFieldException -> 0x00be }
            java.lang.Class r6 = r3.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00c2, IllegalAccessException -> 0x00c0, NoSuchFieldException -> 0x00be }
            monitor-enter(r6)     // Catch:{ ClassNotFoundException -> 0x00c2, IllegalAccessException -> 0x00c0, NoSuchFieldException -> 0x00be }
            java.lang.Object r7 = r3.get(r4)     // Catch:{ all -> 0x003a }
            java.lang.ClassLoader r7 = (java.lang.ClassLoader) r7     // Catch:{ all -> 0x003a }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x003a }
            if (r7 != r8) goto L_0x003d
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x003a }
            goto L_0x00ba
        L_0x003a:
            r3 = move-exception
            goto L_0x00bc
        L_0x003d:
            if (r7 == 0) goto L_0x0046
            i(r7)     // Catch:{ a -> 0x0042 }
        L_0x0042:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x003a }
            goto L_0x00ba
        L_0x0046:
            boolean r7 = e(r12)     // Catch:{ all -> 0x003a }
            if (r7 != 0) goto L_0x0052
            monitor-exit(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            return r5
        L_0x004f:
            r13 = move-exception
            goto L_0x01e6
        L_0x0052:
            boolean r7 = f6686j     // Catch:{ all -> 0x003a }
            if (r7 != 0) goto L_0x00b1
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x003a }
            boolean r8 = r7.equals(r4)     // Catch:{ all -> 0x003a }
            if (r8 == 0) goto L_0x005f
            goto L_0x00b1
        L_0x005f:
            r8 = 1
            int r8 = f(r12, r13, r14, r8)     // Catch:{ a -> 0x00a7 }
            java.lang.String r9 = f6685i     // Catch:{ a -> 0x00a7 }
            if (r9 == 0) goto L_0x00a4
            boolean r9 = r9.isEmpty()     // Catch:{ a -> 0x00a7 }
            if (r9 == 0) goto L_0x006f
            goto L_0x00a4
        L_0x006f:
            java.lang.ClassLoader r9 = G1.b.a()     // Catch:{ a -> 0x00a7 }
            if (r9 == 0) goto L_0x0076
            goto L_0x0099
        L_0x0076:
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x00a7 }
            r10 = 29
            if (r9 < r10) goto L_0x008b
            dalvik.system.DelegateLastClassLoader r9 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x00a7 }
            java.lang.String r10 = f6685i     // Catch:{ a -> 0x00a7 }
            z1.C1032o.f(r10)     // Catch:{ a -> 0x00a7 }
            java.lang.ClassLoader r11 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x00a7 }
            r9.<init>(r10, r11)     // Catch:{ a -> 0x00a7 }
            goto L_0x0099
        L_0x008b:
            G1.c r9 = new G1.c     // Catch:{ a -> 0x00a7 }
            java.lang.String r10 = f6685i     // Catch:{ a -> 0x00a7 }
            z1.C1032o.f(r10)     // Catch:{ a -> 0x00a7 }
            java.lang.ClassLoader r11 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x00a7 }
            r9.<init>(r10, r11)     // Catch:{ a -> 0x00a7 }
        L_0x0099:
            i(r9)     // Catch:{ a -> 0x00a7 }
            r3.set(r4, r9)     // Catch:{ a -> 0x00a7 }
            f6684h = r7     // Catch:{ a -> 0x00a7 }
            monitor-exit(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            return r8
        L_0x00a4:
            monitor-exit(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            return r8
        L_0x00a7:
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x003a }
            r3.set(r4, r7)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x003a }
            goto L_0x00ba
        L_0x00b1:
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x003a }
            r3.set(r4, r7)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x003a }
        L_0x00ba:
            monitor-exit(r6)     // Catch:{ all -> 0x003a }
            goto L_0x00e4
        L_0x00bc:
            monitor-exit(r6)     // Catch:{ all -> 0x003a }
            throw r3     // Catch:{ ClassNotFoundException -> 0x00c2, IllegalAccessException -> 0x00c0, NoSuchFieldException -> 0x00be }
        L_0x00be:
            r3 = move-exception
            goto L_0x00c3
        L_0x00c0:
            r3 = move-exception
            goto L_0x00c3
        L_0x00c2:
            r3 = move-exception
        L_0x00c3:
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004f }
            int r7 = r3.length()     // Catch:{ all -> 0x004f }
            int r7 = r7 + 30
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            r8.<init>(r7)     // Catch:{ all -> 0x004f }
            r8.append(r1)     // Catch:{ all -> 0x004f }
            r8.append(r3)     // Catch:{ all -> 0x004f }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x004f }
            android.util.Log.w(r6, r1)     // Catch:{ all -> 0x004f }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004f }
            r3 = r1
        L_0x00e4:
            f6684h = r3     // Catch:{ all -> 0x004f }
        L_0x00e6:
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            boolean r1 = r3.booleanValue()     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x0119
            int r12 = f(r12, r13, r14, r5)     // Catch:{ a -> 0x00f5 }
            return r12
        L_0x00f2:
            r13 = move-exception
            goto L_0x01e8
        L_0x00f5:
            r13 = move-exception
            java.lang.String r14 = "DynamiteModule"
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x00f2 }
            int r1 = r1.length()     // Catch:{ all -> 0x00f2 }
            int r1 = r1 + 42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r2.<init>(r1)     // Catch:{ all -> 0x00f2 }
            r2.append(r0)     // Catch:{ all -> 0x00f2 }
            r2.append(r13)     // Catch:{ all -> 0x00f2 }
            java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x00f2 }
            android.util.Log.w(r14, r13)     // Catch:{ all -> 0x00f2 }
            return r5
        L_0x0119:
            java.lang.String r0 = "Failed to retrieve remote module version: "
            G1.f r6 = j(r12)     // Catch:{ all -> 0x00f2 }
            if (r6 != 0) goto L_0x0123
            goto L_0x01dd
        L_0x0123:
            int r1 = r6.N()     // Catch:{ RemoteException -> 0x013e }
            r2 = 3
            if (r1 < r2) goto L_0x0190
            java.lang.ThreadLocal r1 = f6689m     // Catch:{ RemoteException -> 0x013e }
            java.lang.Object r1 = r1.get()     // Catch:{ RemoteException -> 0x013e }
            G1.e r1 = (G1.e) r1     // Catch:{ RemoteException -> 0x013e }
            if (r1 == 0) goto L_0x0141
            android.database.Cursor r1 = r1.f1267a     // Catch:{ RemoteException -> 0x013e }
            if (r1 == 0) goto L_0x0141
            int r5 = r1.getInt(r5)     // Catch:{ RemoteException -> 0x013e }
            goto L_0x01dd
        L_0x013e:
            r13 = move-exception
            goto L_0x01b5
        L_0x0141:
            F1.a r7 = F1.b.K(r12)     // Catch:{ RemoteException -> 0x013e }
            java.lang.ThreadLocal r1 = f6690n     // Catch:{ RemoteException -> 0x013e }
            java.lang.Object r1 = r1.get()     // Catch:{ RemoteException -> 0x013e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ RemoteException -> 0x013e }
            long r10 = r1.longValue()     // Catch:{ RemoteException -> 0x013e }
            r8 = r13
            r9 = r14
            F1.a r13 = r6.O(r7, r8, r9, r10)     // Catch:{ RemoteException -> 0x013e }
            java.lang.Object r13 = F1.b.J(r13)     // Catch:{ RemoteException -> 0x013e }
            android.database.Cursor r13 = (android.database.Cursor) r13     // Catch:{ RemoteException -> 0x013e }
            if (r13 == 0) goto L_0x017f
            boolean r14 = r13.moveToFirst()     // Catch:{ RemoteException -> 0x0175, all -> 0x0173 }
            if (r14 != 0) goto L_0x0166
            goto L_0x017f
        L_0x0166:
            int r14 = r13.getInt(r5)     // Catch:{ RemoteException -> 0x0175, all -> 0x0173 }
            if (r14 <= 0) goto L_0x0177
            boolean r0 = g(r13)     // Catch:{ RemoteException -> 0x0175, all -> 0x0173 }
            if (r0 == 0) goto L_0x0177
            goto L_0x0178
        L_0x0173:
            r14 = move-exception
            goto L_0x018c
        L_0x0175:
            r14 = move-exception
            goto L_0x018e
        L_0x0177:
            r4 = r13
        L_0x0178:
            if (r4 == 0) goto L_0x017d
            r4.close()     // Catch:{ all -> 0x00f2 }
        L_0x017d:
            r5 = r14
            goto L_0x01dd
        L_0x017f:
            java.lang.String r14 = "DynamiteModule"
            java.lang.String r1 = "Failed to retrieve remote module version."
            android.util.Log.w(r14, r1)     // Catch:{ RemoteException -> 0x0175, all -> 0x0173 }
            if (r13 == 0) goto L_0x01dd
            r13.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x01dd
        L_0x018c:
            r4 = r13
            goto L_0x01e0
        L_0x018e:
            r4 = r13
            goto L_0x01b6
        L_0x0190:
            r2 = 2
            if (r1 != r2) goto L_0x01a3
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r2 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r1, r2)     // Catch:{ RemoteException -> 0x013e }
            F1.a r1 = F1.b.K(r12)     // Catch:{ RemoteException -> 0x013e }
            int r5 = r6.M(r1, r13, r14)     // Catch:{ RemoteException -> 0x013e }
            goto L_0x01dd
        L_0x01a3:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r2 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r2)     // Catch:{ RemoteException -> 0x013e }
            F1.a r1 = F1.b.K(r12)     // Catch:{ RemoteException -> 0x013e }
            int r5 = r6.K(r1, r13, r14)     // Catch:{ RemoteException -> 0x013e }
            goto L_0x01dd
        L_0x01b3:
            r14 = r13
            goto L_0x01e0
        L_0x01b5:
            r14 = r13
        L_0x01b6:
            java.lang.String r13 = "DynamiteModule"
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x01de }
            java.lang.String r1 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x01de }
            int r1 = r1.length()     // Catch:{ all -> 0x01de }
            int r1 = r1 + 42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r2.<init>(r1)     // Catch:{ all -> 0x01de }
            r2.append(r0)     // Catch:{ all -> 0x01de }
            r2.append(r14)     // Catch:{ all -> 0x01de }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01de }
            android.util.Log.w(r13, r14)     // Catch:{ all -> 0x01de }
            if (r4 == 0) goto L_0x01dd
            r4.close()     // Catch:{ all -> 0x00f2 }
        L_0x01dd:
            return r5
        L_0x01de:
            r13 = move-exception
            goto L_0x01b3
        L_0x01e0:
            if (r4 == 0) goto L_0x01e5
            r4.close()     // Catch:{ all -> 0x00f2 }
        L_0x01e5:
            throw r14     // Catch:{ all -> 0x00f2 }
        L_0x01e6:
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            throw r13     // Catch:{ all -> 0x00f2 }
        L_0x01e8:
            D1.d.a(r12, r13)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f6688l)) {
            return true;
        }
        boolean z4 = false;
        if (f6688l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != D1.g.e() ? 0 : SQLiteDatabase.CREATE_IF_NECESSARY);
            if (e.e().g(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z4 = true;
            }
            f6688l = Boolean.valueOf(z4);
            if (z4 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f6686j = true;
            }
        }
        if (!z4) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f0 A[SYNTHETIC, Splitter:B:61:0x00f0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int f(android.content.Context r15, java.lang.String r16, boolean r17, boolean r18) {
        /*
            java.lang.String r1 = "V2 version check failed: "
            r2 = 0
            java.lang.ThreadLocal r0 = f6690n     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            long r3 = r0.longValue()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r0 = "api_force_staging"
            java.lang.String r5 = "api"
            r6 = 1
            r7 = r17
            if (r6 == r7) goto L_0x0019
            r0 = r5
        L_0x0019:
            android.net.Uri$Builder r5 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r7 = "content"
            android.net.Uri$Builder r5 = r5.scheme(r7)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r7 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r5 = r5.authority(r7)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.net.Uri$Builder r0 = r5.path(r0)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5 = r16
            android.net.Uri$Builder r0 = r0.appendPath(r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r5 = "requestStartUptime"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r5, r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.net.Uri r8 = r0.build()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.content.ContentResolver r0 = r15.getContentResolver()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.content.ContentProviderClient r3 = r0.acquireUnstableContentProviderClient(r8)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r4 = 2
            r5 = 0
            if (r3 != 0) goto L_0x0051
        L_0x004e:
            r9 = r2
            goto L_0x00ee
        L_0x0051:
            r11 = 0
            r12 = 0
            r9 = 0
            r10 = 0
            r7 = r3
            android.database.Cursor r7 = r7.query(r8, r9, r10, r11, r12)     // Catch:{ RemoteException -> 0x005c, all -> 0x00de }
            if (r7 != 0) goto L_0x0066
        L_0x005c:
            r3.release()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            goto L_0x004e
        L_0x0060:
            r0 = move-exception
            goto L_0x0185
        L_0x0063:
            r0 = move-exception
            goto L_0x015c
        L_0x0066:
            int r0 = r7.getCount()     // Catch:{ all -> 0x009c }
            int r8 = r7.getColumnCount()     // Catch:{ all -> 0x009c }
            android.database.MatrixCursor r9 = new android.database.MatrixCursor     // Catch:{ all -> 0x009c }
            java.lang.String[] r10 = r7.getColumnNames()     // Catch:{ all -> 0x009c }
            r9.<init>(r10, r0)     // Catch:{ all -> 0x009c }
            r10 = r5
        L_0x0078:
            if (r10 >= r0) goto L_0x00d7
            boolean r11 = r7.moveToPosition(r10)     // Catch:{ all -> 0x009c }
            if (r11 == 0) goto L_0x00cf
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x009c }
            r12 = r5
        L_0x0083:
            if (r12 >= r8) goto L_0x00c9
            int r13 = r7.getType(r12)     // Catch:{ all -> 0x009c }
            if (r13 == 0) goto L_0x00c4
            if (r13 == r6) goto L_0x00b9
            if (r13 == r4) goto L_0x00ae
            r14 = 3
            if (r13 == r14) goto L_0x00a7
            r14 = 4
            if (r13 != r14) goto L_0x009f
            byte[] r13 = r7.getBlob(r12)     // Catch:{ all -> 0x009c }
            r11[r12] = r13     // Catch:{ all -> 0x009c }
            goto L_0x00c6
        L_0x009c:
            r0 = move-exception
            r8 = r0
            goto L_0x00e0
        L_0x009f:
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch:{ all -> 0x009c }
            java.lang.String r8 = "Unknown column type"
            r0.<init>(r8)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x00a7:
            java.lang.String r13 = r7.getString(r12)     // Catch:{ all -> 0x009c }
            r11[r12] = r13     // Catch:{ all -> 0x009c }
            goto L_0x00c6
        L_0x00ae:
            double r13 = r7.getDouble(r12)     // Catch:{ all -> 0x009c }
            java.lang.Double r13 = java.lang.Double.valueOf(r13)     // Catch:{ all -> 0x009c }
            r11[r12] = r13     // Catch:{ all -> 0x009c }
            goto L_0x00c6
        L_0x00b9:
            long r13 = r7.getLong(r12)     // Catch:{ all -> 0x009c }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x009c }
            r11[r12] = r13     // Catch:{ all -> 0x009c }
            goto L_0x00c6
        L_0x00c4:
            r11[r12] = r2     // Catch:{ all -> 0x009c }
        L_0x00c6:
            int r12 = r12 + 1
            goto L_0x0083
        L_0x00c9:
            r9.addRow(r11)     // Catch:{ all -> 0x009c }
            int r10 = r10 + 1
            goto L_0x0078
        L_0x00cf:
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch:{ all -> 0x009c }
            java.lang.String r8 = "Cursor read incomplete (ContentProvider dead?)"
            r0.<init>(r8)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x00d7:
            r7.close()     // Catch:{ RemoteException -> 0x005c, all -> 0x00de }
            r3.release()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            goto L_0x00ee
        L_0x00de:
            r0 = move-exception
            goto L_0x00ea
        L_0x00e0:
            r7.close()     // Catch:{ all -> 0x00e4 }
            goto L_0x00e9
        L_0x00e4:
            r0 = move-exception
            r7 = r0
            r8.addSuppressed(r7)     // Catch:{ RemoteException -> 0x005c, all -> 0x00de }
        L_0x00e9:
            throw r8     // Catch:{ RemoteException -> 0x005c, all -> 0x00de }
        L_0x00ea:
            r3.release()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            throw r0     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
        L_0x00ee:
            if (r9 == 0) goto L_0x014d
            boolean r0 = r9.moveToFirst()     // Catch:{ Exception -> 0x0143 }
            if (r0 == 0) goto L_0x014d
            int r0 = r9.getInt(r5)     // Catch:{ Exception -> 0x0143 }
            if (r0 <= 0) goto L_0x0134
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r3 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r3)     // Catch:{ Exception -> 0x0143 }
            java.lang.String r4 = r9.getString(r4)     // Catch:{ all -> 0x0114 }
            f6685i = r4     // Catch:{ all -> 0x0114 }
            java.lang.String r4 = "loaderVersion"
            int r4 = r9.getColumnIndex(r4)     // Catch:{ all -> 0x0114 }
            if (r4 < 0) goto L_0x0116
            int r4 = r9.getInt(r4)     // Catch:{ all -> 0x0114 }
            f6687k = r4     // Catch:{ all -> 0x0114 }
            goto L_0x0116
        L_0x0114:
            r0 = move-exception
            goto L_0x0132
        L_0x0116:
            java.lang.String r4 = "disableStandaloneDynamiteLoader2"
            int r4 = r9.getColumnIndex(r4)     // Catch:{ all -> 0x0114 }
            if (r4 < 0) goto L_0x0129
            int r4 = r9.getInt(r4)     // Catch:{ all -> 0x0114 }
            if (r4 == 0) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r6 = r5
        L_0x0126:
            f6686j = r6     // Catch:{ all -> 0x0114 }
            r5 = r6
        L_0x0129:
            monitor-exit(r3)     // Catch:{ all -> 0x0114 }
            boolean r3 = g(r9)     // Catch:{ Exception -> 0x0143 }
            if (r3 == 0) goto L_0x0134
            r9 = r2
            goto L_0x0134
        L_0x0132:
            monitor-exit(r3)     // Catch:{ all -> 0x0114 }
            throw r0     // Catch:{ Exception -> 0x0143 }
        L_0x0134:
            if (r18 == 0) goto L_0x0147
            if (r5 != 0) goto L_0x0139
            goto L_0x0147
        L_0x0139:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0143 }
            java.lang.String r3 = "forcing fallback to container DynamiteLoader impl"
            r0.<init>(r3, r2)     // Catch:{ Exception -> 0x0143 }
            throw r0     // Catch:{ Exception -> 0x0143 }
        L_0x0141:
            r0 = move-exception
            goto L_0x0145
        L_0x0143:
            r0 = move-exception
            goto L_0x015d
        L_0x0145:
            r2 = r9
            goto L_0x0185
        L_0x0147:
            if (r9 == 0) goto L_0x014c
            r9.close()
        L_0x014c:
            return r0
        L_0x014d:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r3 = "Failed to retrieve remote module version."
            android.util.Log.w(r0, r3)     // Catch:{ Exception -> 0x0143 }
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0143 }
            java.lang.String r3 = "Failed to connect to dynamite module ContentResolver."
            r0.<init>(r3, r2)     // Catch:{ Exception -> 0x0143 }
            throw r0     // Catch:{ Exception -> 0x0143 }
        L_0x015c:
            r9 = r2
        L_0x015d:
            boolean r3 = r0 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x0141 }
            if (r3 != 0) goto L_0x0184
            com.google.android.gms.dynamite.DynamiteModule$a r3 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x0141 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0141 }
            int r5 = r5.length()     // Catch:{ all -> 0x0141 }
            int r5 = r5 + 25
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r6.<init>(r5)     // Catch:{ all -> 0x0141 }
            r6.append(r1)     // Catch:{ all -> 0x0141 }
            r6.append(r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0141 }
            r3.<init>(r1, r0, r2)     // Catch:{ all -> 0x0141 }
            throw r3     // Catch:{ all -> 0x0141 }
        L_0x0184:
            throw r0     // Catch:{ all -> 0x0141 }
        L_0x0185:
            if (r2 == 0) goto L_0x018a
            r2.close()
        L_0x018a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static boolean g(Cursor cursor) {
        G1.e eVar = (G1.e) f6689m.get();
        if (eVar == null || eVar.f1267a != null) {
            return false;
        }
        eVar.f1267a = cursor;
        return true;
    }

    public static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    public static void i(ClassLoader classLoader) {
        g gVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor((Class[]) null).newInstance((Object[]) null);
            if (iBinder == null) {
                gVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
            }
            f6694r = gVar;
        } catch (ClassNotFoundException e4) {
            e = e4;
            throw new a("Failed to instantiate dynamite loader", e, (byte[]) null);
        } catch (IllegalAccessException e5) {
            e = e5;
            throw new a("Failed to instantiate dynamite loader", e, (byte[]) null);
        } catch (InstantiationException e6) {
            e = e6;
            throw new a("Failed to instantiate dynamite loader", e, (byte[]) null);
        } catch (InvocationTargetException e7) {
            e = e7;
            throw new a("Failed to instantiate dynamite loader", e, (byte[]) null);
        } catch (NoSuchMethodException e8) {
            e = e8;
            throw new a("Failed to instantiate dynamite loader", e, (byte[]) null);
        }
    }

    public static f j(Context context) {
        f fVar;
        synchronized (DynamiteModule.class) {
            f fVar2 = f6693q;
            if (fVar2 != null) {
                return fVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
                }
                if (fVar != null) {
                    f6693q = fVar;
                    return fVar;
                }
            } catch (Exception e4) {
                String message = e4.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
        }
        return null;
    }

    public IBinder b(String str) {
        try {
            return (IBinder) this.f6695a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e4, (byte[]) null);
        }
    }
}
