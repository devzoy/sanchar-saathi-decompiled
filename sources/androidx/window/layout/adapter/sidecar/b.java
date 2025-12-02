package androidx.window.layout.adapter.sidecar;

import H0.k;
import K0.j;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.a;
import h3.C0673n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import v3.g;
import v3.l;

public final class b implements L0.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f6069c = new a((g) null);

    /* renamed from: d  reason: collision with root package name */
    public static volatile b f6070d;

    /* renamed from: e  reason: collision with root package name */
    public static final ReentrantLock f6071e = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    public a f6072a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f6073b = new CopyOnWriteArrayList();

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final b a(Context context) {
            l.e(context, "context");
            if (b.f6070d == null) {
                ReentrantLock d4 = b.f6071e;
                d4.lock();
                try {
                    if (b.f6070d == null) {
                        b.f6070d = new b(b.f6069c.b(context));
                    }
                    C0673n nVar = C0673n.f9639a;
                    d4.unlock();
                } catch (Throwable th) {
                    d4.unlock();
                    throw th;
                }
            }
            b c4 = b.f6070d;
            l.b(c4);
            return c4;
        }

        public final a b(Context context) {
            l.e(context, "context");
            try {
                if (!c(SidecarCompat.f6057f.c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (!sidecarCompat.n()) {
                    return null;
                }
                return sidecarCompat;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean c(k kVar) {
            return kVar != null && kVar.compareTo(k.f1389j.a()) >= 0;
        }

        public a() {
        }
    }

    /* renamed from: androidx.window.layout.adapter.sidecar.b$b  reason: collision with other inner class name */
    public final class C0103b implements a.C0102a {
        public C0103b() {
        }

        public void a(Activity activity, j jVar) {
            l.e(activity, "activity");
            l.e(jVar, "newLayout");
            Iterator it = b.this.g().iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (l.a(cVar.d(), activity)) {
                    cVar.b(jVar);
                }
            }
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f6075a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f6076b;

        /* renamed from: c  reason: collision with root package name */
        public final R.a f6077c;

        /* renamed from: d  reason: collision with root package name */
        public j f6078d;

        public c(Activity activity, Executor executor, R.a aVar) {
            l.e(activity, "activity");
            l.e(executor, "executor");
            l.e(aVar, "callback");
            this.f6075a = activity;
            this.f6076b = executor;
            this.f6077c = aVar;
        }

        public static final void c(c cVar, j jVar) {
            l.e(cVar, "this$0");
            l.e(jVar, "$newLayoutInfo");
            cVar.f6077c.accept(jVar);
        }

        public final void b(j jVar) {
            l.e(jVar, "newLayoutInfo");
            this.f6078d = jVar;
            this.f6076b.execute(new N0.c(this, jVar));
        }

        public final Activity d() {
            return this.f6075a;
        }

        public final R.a e() {
            return this.f6077c;
        }

        public final j f() {
            return this.f6078d;
        }
    }

    public b(a aVar) {
        this.f6072a = aVar;
        a aVar2 = this.f6072a;
        if (aVar2 != null) {
            aVar2.a(new C0103b());
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [h3.n] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r6, java.util.concurrent.Executor r7, R.a r8) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            v3.l.e(r6, r0)
            java.lang.String r0 = "executor"
            v3.l.e(r7, r0)
            java.lang.String r0 = "callback"
            v3.l.e(r8, r0)
            boolean r0 = r6 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L_0x0017
            android.app.Activity r6 = (android.app.Activity) r6
            goto L_0x0018
        L_0x0017:
            r6 = r1
        L_0x0018:
            if (r6 == 0) goto L_0x0081
            java.util.concurrent.locks.ReentrantLock r0 = f6071e
            r0.lock()
            androidx.window.layout.adapter.sidecar.a r2 = r5.f6072a     // Catch:{ all -> 0x0033 }
            if (r2 != 0) goto L_0x0035
            K0.j r6 = new K0.j     // Catch:{ all -> 0x0033 }
            java.util.List r7 = i3.C0738o.h()     // Catch:{ all -> 0x0033 }
            r6.<init>(r7)     // Catch:{ all -> 0x0033 }
            r8.accept(r6)     // Catch:{ all -> 0x0033 }
            r0.unlock()
            return
        L_0x0033:
            r6 = move-exception
            goto L_0x007d
        L_0x0035:
            boolean r3 = r5.h(r6)     // Catch:{ all -> 0x0033 }
            androidx.window.layout.adapter.sidecar.b$c r4 = new androidx.window.layout.adapter.sidecar.b$c     // Catch:{ all -> 0x0033 }
            r4.<init>(r6, r7, r8)     // Catch:{ all -> 0x0033 }
            java.util.concurrent.CopyOnWriteArrayList r7 = r5.f6073b     // Catch:{ all -> 0x0033 }
            r7.add(r4)     // Catch:{ all -> 0x0033 }
            if (r3 != 0) goto L_0x0049
            r2.b(r6)     // Catch:{ all -> 0x0033 }
            goto L_0x0075
        L_0x0049:
            java.util.concurrent.CopyOnWriteArrayList r7 = r5.f6073b     // Catch:{ all -> 0x0033 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0033 }
        L_0x004f:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0067
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x0033 }
            r3 = r2
            androidx.window.layout.adapter.sidecar.b$c r3 = (androidx.window.layout.adapter.sidecar.b.c) r3     // Catch:{ all -> 0x0033 }
            android.app.Activity r3 = r3.d()     // Catch:{ all -> 0x0033 }
            boolean r3 = v3.l.a(r6, r3)     // Catch:{ all -> 0x0033 }
            if (r3 == 0) goto L_0x004f
            goto L_0x0068
        L_0x0067:
            r2 = r1
        L_0x0068:
            androidx.window.layout.adapter.sidecar.b$c r2 = (androidx.window.layout.adapter.sidecar.b.c) r2     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0070
            K0.j r1 = r2.f()     // Catch:{ all -> 0x0033 }
        L_0x0070:
            if (r1 == 0) goto L_0x0075
            r4.b(r1)     // Catch:{ all -> 0x0033 }
        L_0x0075:
            h3.n r6 = h3.C0673n.f9639a     // Catch:{ all -> 0x0033 }
            r0.unlock()
            h3.n r1 = h3.C0673n.f9639a
            goto L_0x0081
        L_0x007d:
            r0.unlock()
            throw r6
        L_0x0081:
            if (r1 != 0) goto L_0x008f
            K0.j r6 = new K0.j
            java.util.List r7 = i3.C0738o.h()
            r6.<init>(r7)
            r8.accept(r6)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.b.a(android.content.Context, java.util.concurrent.Executor, R.a):void");
    }

    public void b(R.a aVar) {
        l.e(aVar, "callback");
        synchronized (f6071e) {
            try {
                if (this.f6072a != null) {
                    ArrayList<c> arrayList = new ArrayList<>();
                    Iterator it = this.f6073b.iterator();
                    while (it.hasNext()) {
                        c cVar = (c) it.next();
                        if (cVar.e() == aVar) {
                            l.d(cVar, "callbackWrapper");
                            arrayList.add(cVar);
                        }
                    }
                    this.f6073b.removeAll(arrayList);
                    for (c d4 : arrayList) {
                        f(d4.d());
                    }
                    C0673n nVar = C0673n.f9639a;
                }
            } finally {
            }
        }
    }

    public final void f(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f6073b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            for (c d4 : copyOnWriteArrayList) {
                if (l.a(d4.d(), activity)) {
                    return;
                }
            }
        }
        a aVar = this.f6072a;
        if (aVar != null) {
            aVar.c(activity);
        }
    }

    public final CopyOnWriteArrayList g() {
        return this.f6073b;
    }

    public final boolean h(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f6073b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (c d4 : copyOnWriteArrayList) {
            if (l.a(d4.d(), activity)) {
                return true;
            }
        }
        return false;
    }
}
