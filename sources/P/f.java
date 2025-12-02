package P;

import P.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import v.g;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final v.e f2172a = new v.e(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f2173b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2174c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final g f2175d = new g();

    public class a implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2176a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f2177b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e f2178c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f2179d;

        public a(String str, Context context, e eVar, int i4) {
            this.f2176a = str;
            this.f2177b = context;
            this.f2178c = eVar;
            this.f2179d = i4;
        }

        /* renamed from: a */
        public e call() {
            return f.c(this.f2176a, this.f2177b, this.f2178c, this.f2179d);
        }
    }

    public class b implements R.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f2180a;

        public b(a aVar) {
            this.f2180a = aVar;
        }

        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f2180a.b(eVar);
        }
    }

    public class c implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2181a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f2182b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e f2183c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f2184d;

        public c(String str, Context context, e eVar, int i4) {
            this.f2181a = str;
            this.f2182b = context;
            this.f2183c = eVar;
            this.f2184d = i4;
        }

        /* renamed from: a */
        public e call() {
            try {
                return f.c(this.f2181a, this.f2182b, this.f2183c, this.f2184d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements R.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2185a;

        public d(String str) {
            this.f2185a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
            if (r0 >= r2.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            ((R.a) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(P.f.e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = P.f.f2174c
                monitor-enter(r0)
                v.g r1 = P.f.f2175d     // Catch:{ all -> 0x0011 }
                java.lang.String r2 = r4.f2185a     // Catch:{ all -> 0x0011 }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0011 }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0011 }
                if (r2 != 0) goto L_0x0013
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x0011:
                r5 = move-exception
                goto L_0x002d
            L_0x0013:
                java.lang.String r3 = r4.f2185a     // Catch:{ all -> 0x0011 }
                r1.remove(r3)     // Catch:{ all -> 0x0011 }
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                r0 = 0
            L_0x001a:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002c
                java.lang.Object r1 = r2.get(r0)
                R.a r1 = (R.a) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: P.f.d.accept(P.f$e):void");
        }
    }

    public static String a(e eVar, int i4) {
        return eVar.d() + "-" + i4;
    }

    public static int b(g.a aVar) {
        int i4 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b4 = aVar.b();
        if (!(b4 == null || b4.length == 0)) {
            int length = b4.length;
            i4 = 0;
            int i5 = 0;
            while (i5 < length) {
                int b5 = b4[i5].b();
                if (b5 == 0) {
                    i5++;
                } else if (b5 < 0) {
                    return -3;
                } else {
                    return b5;
                }
            }
        }
        return i4;
    }

    public static e c(String str, Context context, e eVar, int i4) {
        v.e eVar2 = f2172a;
        Typeface typeface = (Typeface) eVar2.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a e4 = d.e(context, eVar, (CancellationSignal) null);
            int b4 = b(e4);
            if (b4 != 0) {
                return new e(b4);
            }
            Typeface b5 = J.c.b(context, (CancellationSignal) null, e4.b(), i4);
            if (b5 == null) {
                return new e(-3);
            }
            eVar2.d(str, b5);
            return new e(b5);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r9 = new P.f.c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r8 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r8 = f2173b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        P.h.b(r8, r9, new P.f.d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface d(android.content.Context r5, P.e r6, int r7, java.util.concurrent.Executor r8, P.a r9) {
        /*
            java.lang.String r0 = a(r6, r7)
            v.e r1 = f2172a
            java.lang.Object r1 = r1.c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            P.f$e r5 = new P.f$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.b(r5)
            return r1
        L_0x0017:
            P.f$b r1 = new P.f$b
            r1.<init>(r9)
            java.lang.Object r9 = f2174c
            monitor-enter(r9)
            v.g r2 = f2175d     // Catch:{ all -> 0x002f }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x002f }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x002f }
            r4 = 0
            if (r3 == 0) goto L_0x0031
            r3.add(r1)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            return r4
        L_0x002f:
            r5 = move-exception
            goto L_0x004f
        L_0x0031:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            r3.<init>()     // Catch:{ all -> 0x002f }
            r3.add(r1)     // Catch:{ all -> 0x002f }
            r2.put(r0, r3)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            P.f$c r9 = new P.f$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0046
            java.util.concurrent.ExecutorService r8 = f2173b
        L_0x0046:
            P.f$d r5 = new P.f$d
            r5.<init>(r0)
            P.h.b(r8, r9, r5)
            return r4
        L_0x004f:
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P.f.d(android.content.Context, P.e, int, java.util.concurrent.Executor, P.a):android.graphics.Typeface");
    }

    public static Typeface e(Context context, e eVar, a aVar, int i4, int i5) {
        String a4 = a(eVar, i4);
        Typeface typeface = (Typeface) f2172a.c(a4);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        } else if (i5 == -1) {
            e c4 = c(a4, context, eVar, i4);
            aVar.b(c4);
            return c4.f2186a;
        } else {
            try {
                e eVar2 = (e) h.c(f2173b, new a(a4, context, eVar, i4), i5);
                aVar.b(eVar2);
                return eVar2.f2186a;
            } catch (InterruptedException unused) {
                aVar.b(new e(-3));
                return null;
            }
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f2186a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2187b;

        public e(int i4) {
            this.f2186a = null;
            this.f2187b = i4;
        }

        public boolean a() {
            return this.f2187b == 0;
        }

        public e(Typeface typeface) {
            this.f2186a = typeface;
            this.f2187b = 0;
        }
    }
}
