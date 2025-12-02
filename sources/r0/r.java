package R0;

import Q0.e;
import Q0.i;
import Z0.m;
import Z0.u;
import a1.w;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import c1.C0403b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import y2.C1007a;

public class r implements C0303e, Y0.a {

    /* renamed from: o  reason: collision with root package name */
    public static final String f2529o = i.i("Processor");

    /* renamed from: c  reason: collision with root package name */
    public PowerManager.WakeLock f2530c;

    /* renamed from: d  reason: collision with root package name */
    public Context f2531d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.work.a f2532e;

    /* renamed from: f  reason: collision with root package name */
    public C0403b f2533f;

    /* renamed from: g  reason: collision with root package name */
    public WorkDatabase f2534g;

    /* renamed from: h  reason: collision with root package name */
    public Map f2535h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public Map f2536i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public Map f2537j;

    /* renamed from: k  reason: collision with root package name */
    public List f2538k;

    /* renamed from: l  reason: collision with root package name */
    public Set f2539l;

    /* renamed from: m  reason: collision with root package name */
    public final List f2540m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f2541n;

    public static class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public C0303e f2542e;

        /* renamed from: f  reason: collision with root package name */
        public final m f2543f;

        /* renamed from: g  reason: collision with root package name */
        public C1007a f2544g;

        public a(C0303e eVar, m mVar, C1007a aVar) {
            this.f2542e = eVar;
            this.f2543f = mVar;
            this.f2544g = aVar;
        }

        public void run() {
            boolean z4;
            try {
                z4 = ((Boolean) this.f2544g.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z4 = true;
            }
            this.f2542e.d(this.f2543f, z4);
        }
    }

    public r(Context context, androidx.work.a aVar, C0403b bVar, WorkDatabase workDatabase, List list) {
        this.f2531d = context;
        this.f2532e = aVar;
        this.f2533f = bVar;
        this.f2534g = workDatabase;
        this.f2538k = list;
        this.f2539l = new HashSet();
        this.f2540m = new ArrayList();
        this.f2530c = null;
        this.f2541n = new Object();
        this.f2537j = new HashMap();
    }

    public static boolean i(String str, K k4) {
        if (k4 != null) {
            k4.g();
            i e4 = i.e();
            String str2 = f2529o;
            e4.a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        i e5 = i.e();
        String str3 = f2529o;
        e5.a(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public void a(String str) {
        synchronized (this.f2541n) {
            this.f2535h.remove(str);
            s();
        }
    }

    public void b(String str, e eVar) {
        synchronized (this.f2541n) {
            try {
                i e4 = i.e();
                String str2 = f2529o;
                e4.f(str2, "Moving WorkSpec (" + str + ") to the foreground");
                K k4 = (K) this.f2536i.remove(str);
                if (k4 != null) {
                    if (this.f2530c == null) {
                        PowerManager.WakeLock b4 = w.b(this.f2531d, "ProcessorForegroundLck");
                        this.f2530c = b4;
                        b4.acquire();
                    }
                    this.f2535h.put(str, k4);
                    H.a.m(this.f2531d, androidx.work.impl.foreground.a.f(this.f2531d, k4.d(), eVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(String str) {
        boolean containsKey;
        synchronized (this.f2541n) {
            containsKey = this.f2535h.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: d */
    public void l(m mVar, boolean z4) {
        synchronized (this.f2541n) {
            try {
                K k4 = (K) this.f2536i.get(mVar.b());
                if (k4 != null && mVar.equals(k4.d())) {
                    this.f2536i.remove(mVar.b());
                }
                i e4 = i.e();
                String str = f2529o;
                e4.a(str, getClass().getSimpleName() + " " + mVar.b() + " executed; reschedule = " + z4);
                for (C0303e d4 : this.f2540m) {
                    d4.d(mVar, z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(C0303e eVar) {
        synchronized (this.f2541n) {
            this.f2540m.add(eVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: R0.K} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Z0.u h(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2541n
            monitor-enter(r0)
            java.util.Map r1 = r2.f2535h     // Catch:{ all -> 0x0017 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x0017 }
            R0.K r1 = (R0.K) r1     // Catch:{ all -> 0x0017 }
            if (r1 != 0) goto L_0x0019
            java.util.Map r1 = r2.f2536i     // Catch:{ all -> 0x0017 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0017 }
            r1 = r3
            R0.K r1 = (R0.K) r1     // Catch:{ all -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            r3 = move-exception
            goto L_0x0024
        L_0x0019:
            if (r1 == 0) goto L_0x0021
            Z0.u r3 = r1.e()     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r3
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            r3 = 0
            return r3
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.r.h(java.lang.String):Z0.u");
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.f2541n) {
            contains = this.f2539l.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z4;
        synchronized (this.f2541n) {
            try {
                if (!this.f2536i.containsKey(str)) {
                    if (!this.f2535h.containsKey(str)) {
                        z4 = false;
                    }
                }
                z4 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    public final /* synthetic */ u m(ArrayList arrayList, String str) {
        arrayList.addAll(this.f2534g.K().d(str));
        return this.f2534g.J().m(str);
    }

    public void n(C0303e eVar) {
        synchronized (this.f2541n) {
            this.f2540m.remove(eVar);
        }
    }

    public final void o(m mVar, boolean z4) {
        this.f2533f.a().execute(new q(this, mVar, z4));
    }

    public boolean p(v vVar) {
        return q(vVar, (WorkerParameters.a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean q(R0.v r13, androidx.work.WorkerParameters.a r14) {
        /*
            r12 = this;
            Z0.m r0 = r13.a()
            java.lang.String r1 = r0.b()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            androidx.work.impl.WorkDatabase r2 = r12.f2534g
            R0.p r3 = new R0.p
            r3.<init>(r12, r9, r1)
            java.lang.Object r2 = r2.z(r3)
            r8 = r2
            Z0.u r8 = (Z0.u) r8
            r2 = 0
            if (r8 != 0) goto L_0x003c
            Q0.i r13 = Q0.i.e()
            java.lang.String r14 = f2529o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Didn't find WorkSpec for id "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r13.k(r14, r1)
            r12.o(r0, r2)
            return r2
        L_0x003c:
            java.lang.Object r10 = r12.f2541n
            monitor-enter(r10)
            boolean r3 = r12.k(r1)     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x0090
            java.util.Map r14 = r12.f2537j     // Catch:{ all -> 0x0088 }
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0088 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0088 }
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x0088 }
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x0088 }
            R0.v r1 = (R0.v) r1     // Catch:{ all -> 0x0088 }
            Z0.m r1 = r1.a()     // Catch:{ all -> 0x0088 }
            int r1 = r1.a()     // Catch:{ all -> 0x0088 }
            int r3 = r0.a()     // Catch:{ all -> 0x0088 }
            if (r1 != r3) goto L_0x008b
            r14.add(r13)     // Catch:{ all -> 0x0088 }
            Q0.i r13 = Q0.i.e()     // Catch:{ all -> 0x0088 }
            java.lang.String r14 = f2529o     // Catch:{ all -> 0x0088 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "Work "
            r1.append(r3)     // Catch:{ all -> 0x0088 }
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = " is already enqueued for processing"
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0088 }
            r13.a(r14, r0)     // Catch:{ all -> 0x0088 }
            goto L_0x008e
        L_0x0088:
            r13 = move-exception
            goto L_0x0115
        L_0x008b:
            r12.o(r0, r2)     // Catch:{ all -> 0x0088 }
        L_0x008e:
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x0090:
            int r3 = r8.d()     // Catch:{ all -> 0x0088 }
            int r4 = r0.a()     // Catch:{ all -> 0x0088 }
            if (r3 == r4) goto L_0x009f
            r12.o(r0, r2)     // Catch:{ all -> 0x0088 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x009f:
            R0.K$c r11 = new R0.K$c     // Catch:{ all -> 0x0088 }
            android.content.Context r3 = r12.f2531d     // Catch:{ all -> 0x0088 }
            androidx.work.a r4 = r12.f2532e     // Catch:{ all -> 0x0088 }
            c1.b r5 = r12.f2533f     // Catch:{ all -> 0x0088 }
            androidx.work.impl.WorkDatabase r7 = r12.f2534g     // Catch:{ all -> 0x0088 }
            r2 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0088 }
            java.util.List r2 = r12.f2538k     // Catch:{ all -> 0x0088 }
            R0.K$c r2 = r11.d(r2)     // Catch:{ all -> 0x0088 }
            R0.K$c r14 = r2.c(r14)     // Catch:{ all -> 0x0088 }
            R0.K r14 = r14.b()     // Catch:{ all -> 0x0088 }
            y2.a r2 = r14.c()     // Catch:{ all -> 0x0088 }
            R0.r$a r3 = new R0.r$a     // Catch:{ all -> 0x0088 }
            Z0.m r4 = r13.a()     // Catch:{ all -> 0x0088 }
            r3.<init>(r12, r4, r2)     // Catch:{ all -> 0x0088 }
            c1.b r4 = r12.f2533f     // Catch:{ all -> 0x0088 }
            java.util.concurrent.Executor r4 = r4.a()     // Catch:{ all -> 0x0088 }
            r2.a(r3, r4)     // Catch:{ all -> 0x0088 }
            java.util.Map r2 = r12.f2536i     // Catch:{ all -> 0x0088 }
            r2.put(r1, r14)     // Catch:{ all -> 0x0088 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0088 }
            r2.<init>()     // Catch:{ all -> 0x0088 }
            r2.add(r13)     // Catch:{ all -> 0x0088 }
            java.util.Map r13 = r12.f2537j     // Catch:{ all -> 0x0088 }
            r13.put(r1, r2)     // Catch:{ all -> 0x0088 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            c1.b r13 = r12.f2533f
            c1.a r13 = r13.b()
            r13.execute(r14)
            Q0.i r13 = Q0.i.e()
            java.lang.String r14 = f2529o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r12.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = ": processing "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.a(r14, r0)
            r13 = 1
            return r13
        L_0x0115:
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.r.q(R0.v, androidx.work.WorkerParameters$a):boolean");
    }

    public boolean r(String str) {
        K k4;
        boolean z4;
        synchronized (this.f2541n) {
            try {
                i e4 = i.e();
                String str2 = f2529o;
                e4.a(str2, "Processor cancelling " + str);
                this.f2539l.add(str);
                k4 = (K) this.f2535h.remove(str);
                z4 = k4 != null;
                if (k4 == null) {
                    k4 = (K) this.f2536i.remove(str);
                }
                if (k4 != null) {
                    this.f2537j.remove(str);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        boolean i4 = i(str, k4);
        if (z4) {
            s();
        }
        return i4;
    }

    public final void s() {
        synchronized (this.f2541n) {
            try {
                if (this.f2535h.isEmpty()) {
                    this.f2531d.startService(androidx.work.impl.foreground.a.g(this.f2531d));
                    PowerManager.WakeLock wakeLock = this.f2530c;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f2530c = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean t(v vVar) {
        K k4;
        String b4 = vVar.a().b();
        synchronized (this.f2541n) {
            try {
                i e4 = i.e();
                String str = f2529o;
                e4.a(str, "Processor stopping foreground work " + b4);
                k4 = (K) this.f2535h.remove(b4);
                if (k4 != null) {
                    this.f2537j.remove(b4);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return i(b4, k4);
    }

    public boolean u(v vVar) {
        String b4 = vVar.a().b();
        synchronized (this.f2541n) {
            try {
                K k4 = (K) this.f2536i.remove(b4);
                if (k4 == null) {
                    i e4 = i.e();
                    String str = f2529o;
                    e4.a(str, "WorkerWrapper could not be found for " + b4);
                    return false;
                }
                Set set = (Set) this.f2537j.get(b4);
                if (set != null) {
                    if (set.contains(vVar)) {
                        i e5 = i.e();
                        String str2 = f2529o;
                        e5.a(str2, "Processor stopping background work " + b4);
                        this.f2537j.remove(b4);
                        return i(b4, k4);
                    }
                }
                return false;
            } finally {
            }
        }
    }
}
