package w;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import y2.C1007a;

/* renamed from: w.a  reason: case insensitive filesystem */
public abstract class C0958a implements C1007a {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f12472d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f12473e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f12474f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f12475g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f12476a;

    /* renamed from: b  reason: collision with root package name */
    public volatile e f12477b;

    /* renamed from: c  reason: collision with root package name */
    public volatile h f12478c;

    /* renamed from: w.a$b */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(C0958a aVar, e eVar, e eVar2);

        public abstract boolean b(C0958a aVar, Object obj, Object obj2);

        public abstract boolean c(C0958a aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* renamed from: w.a$c */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final c f12479c;

        /* renamed from: d  reason: collision with root package name */
        public static final c f12480d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f12481a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f12482b;

        static {
            if (C0958a.f12472d) {
                f12480d = null;
                f12479c = null;
                return;
            }
            f12480d = new c(false, (Throwable) null);
            f12479c = new c(true, (Throwable) null);
        }

        public c(boolean z4, Throwable th) {
            this.f12481a = z4;
            this.f12482b = th;
        }
    }

    /* renamed from: w.a$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f12483a;
    }

    /* renamed from: w.a$e */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f12484d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f12485a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f12486b;

        /* renamed from: c  reason: collision with root package name */
        public e f12487c;

        public e(Runnable runnable, Executor executor) {
            this.f12485a = runnable;
            this.f12486b = executor;
        }
    }

    /* renamed from: w.a$f */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f12488a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f12489b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f12490c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f12491d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f12492e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f12488a = atomicReferenceFieldUpdater;
            this.f12489b = atomicReferenceFieldUpdater2;
            this.f12490c = atomicReferenceFieldUpdater3;
            this.f12491d = atomicReferenceFieldUpdater4;
            this.f12492e = atomicReferenceFieldUpdater5;
        }

        public boolean a(C0958a aVar, e eVar, e eVar2) {
            return b.a(this.f12491d, aVar, eVar, eVar2);
        }

        public boolean b(C0958a aVar, Object obj, Object obj2) {
            return b.a(this.f12492e, aVar, obj, obj2);
        }

        public boolean c(C0958a aVar, h hVar, h hVar2) {
            return b.a(this.f12490c, aVar, hVar, hVar2);
        }

        public void d(h hVar, h hVar2) {
            this.f12489b.lazySet(hVar, hVar2);
        }

        public void e(h hVar, Thread thread) {
            this.f12488a.lazySet(hVar, thread);
        }
    }

    /* renamed from: w.a$g */
    public static final class g extends b {
        public g() {
            super();
        }

        public boolean a(C0958a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f12477b != eVar) {
                        return false;
                    }
                    aVar.f12477b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean b(C0958a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f12476a != obj) {
                        return false;
                    }
                    aVar.f12476a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean c(C0958a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f12478c != hVar) {
                        return false;
                    }
                    aVar.f12478c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void d(h hVar, h hVar2) {
            hVar.f12495b = hVar2;
        }

        public void e(h hVar, Thread thread) {
            hVar.f12494a = thread;
        }
    }

    /* renamed from: w.a$h */
    public static final class h {

        /* renamed from: c  reason: collision with root package name */
        public static final h f12493c = new h(false);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f12494a;

        /* renamed from: b  reason: collision with root package name */
        public volatile h f12495b;

        public h(boolean z4) {
        }

        public void a(h hVar) {
            C0958a.f12474f.d(this, hVar);
        }

        public void b() {
            Thread thread = this.f12494a;
            if (thread != null) {
                this.f12494a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            C0958a.f12474f.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: w.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: w.a$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: w.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: w.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<w.a$h> r2 = w.C0958a.h.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            f12472d = r3
            java.lang.Class<w.a> r3 = w.C0958a.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            f12473e = r4
            w.a$f r4 = new w.a$f     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<w.a$e> r2 = w.C0958a.e.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            w.a$g r4 = new w.a$g
            r4.<init>()
        L_0x004a:
            f12474f = r4
            if (r0 == 0) goto L_0x0057
            java.util.logging.Logger r1 = f12473e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0057:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f12475g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C0958a.<clinit>():void");
    }

    public static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void g(C0958a aVar) {
        aVar.m();
        aVar.c();
        e f4 = aVar.f((e) null);
        while (f4 != null) {
            e eVar = f4.f12487c;
            h(f4.f12485a, f4.f12486b);
            f4 = eVar;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            Logger logger = f12473e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e4);
        }
    }

    public static Object j(Future future) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f12477b;
        if (eVar != e.f12484d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f12487c = eVar;
                if (!f12474f.a(this, eVar, eVar2)) {
                    eVar = this.f12477b;
                } else {
                    return;
                }
            } while (eVar != e.f12484d);
        }
        h(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object j4 = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(p(j4));
            sb.append("]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e5.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public void c() {
    }

    public final boolean cancel(boolean z4) {
        Object obj = this.f12476a;
        if (obj == null) {
            if (f12474f.b(this, obj, f12472d ? new c(z4, new CancellationException("Future.cancel() was called.")) : z4 ? c.f12479c : c.f12480d)) {
                if (z4) {
                    k();
                }
                g(this);
                return true;
            }
        }
        return false;
    }

    public final e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f12477b;
        } while (!f12474f.a(this, eVar2, e.f12484d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f12487c;
            eVar5.f12487c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    public final Object get(long j4, TimeUnit timeUnit) {
        long j5 = j4;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j5);
        if (!Thread.interrupted()) {
            Object obj = this.f12476a;
            if (obj != null) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.f12478c;
                if (hVar != h.f12493c) {
                    h hVar2 = new h();
                    do {
                        hVar2.a(hVar);
                        if (f12474f.c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f12476a;
                                    if (obj2 != null) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    n(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            n(hVar2);
                        } else {
                            hVar = this.f12478c;
                        }
                    } while (hVar != h.f12493c);
                }
                return i(this.f12476a);
            }
            while (nanos > 0) {
                Object obj3 = this.f12476a;
                if (obj3 != null) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j6 = -nanos;
                long convert = timeUnit2.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit2.toNanos(convert);
                int i4 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z4 = i4 == 0 || nanos2 > 1000;
                if (i4 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z4) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z4) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final Object i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f12482b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f12483a);
        } else if (obj == f12475g) {
            return null;
        } else {
            return obj;
        }
    }

    public final boolean isCancelled() {
        return this.f12476a instanceof c;
    }

    public final boolean isDone() {
        return this.f12476a != null;
    }

    public void k() {
    }

    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void m() {
        h hVar;
        do {
            hVar = this.f12478c;
        } while (!f12474f.c(this, hVar, h.f12493c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f12495b;
        }
    }

    public final void n(h hVar) {
        hVar.f12494a = null;
        while (true) {
            h hVar2 = this.f12478c;
            if (hVar2 != h.f12493c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f12495b;
                    if (hVar2.f12494a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f12495b = hVar4;
                        if (hVar3.f12494a == null) {
                        }
                    } else if (!f12474f.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean o(Object obj) {
        if (obj == null) {
            obj = f12475g;
        }
        if (!f12474f.b(this, (Object) null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    public final String p(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = l();
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        boolean z4;
        if (!Thread.interrupted()) {
            Object obj2 = this.f12476a;
            if (obj2 != null) {
                return i(obj2);
            }
            h hVar = this.f12478c;
            if (hVar != h.f12493c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f12474f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f12476a;
                                if (obj != null) {
                                    z4 = true;
                                    continue;
                                } else {
                                    z4 = false;
                                    continue;
                                }
                            } else {
                                n(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!z4);
                        return i(obj);
                    }
                    hVar = this.f12478c;
                } while (hVar != h.f12493c);
            }
            return i(this.f12476a);
        }
        throw new InterruptedException();
    }
}
