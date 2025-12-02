package b1;

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

/* renamed from: b1.a  reason: case insensitive filesystem */
public abstract class C0390a implements C1007a {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f6241d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f6242e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f6243f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f6244g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f6245a;

    /* renamed from: b  reason: collision with root package name */
    public volatile e f6246b;

    /* renamed from: c  reason: collision with root package name */
    public volatile i f6247c;

    /* renamed from: b1.a$b */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(C0390a aVar, e eVar, e eVar2);

        public abstract boolean b(C0390a aVar, Object obj, Object obj2);

        public abstract boolean c(C0390a aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* renamed from: b1.a$c */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final c f6248c;

        /* renamed from: d  reason: collision with root package name */
        public static final c f6249d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f6250a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f6251b;

        static {
            if (C0390a.f6241d) {
                f6249d = null;
                f6248c = null;
                return;
            }
            f6249d = new c(false, (Throwable) null);
            f6248c = new c(true, (Throwable) null);
        }

        public c(boolean z4, Throwable th) {
            this.f6250a = z4;
            this.f6251b = th;
        }
    }

    /* renamed from: b1.a$d */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        public static final d f6252b = new d(new C0112a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f6253a;

        /* renamed from: b1.a$d$a  reason: collision with other inner class name */
        public class C0112a extends Throwable {
            public C0112a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f6253a = (Throwable) C0390a.e(th);
        }
    }

    /* renamed from: b1.a$e */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f6254d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f6255a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f6256b;

        /* renamed from: c  reason: collision with root package name */
        public e f6257c;

        public e(Runnable runnable, Executor executor) {
            this.f6255a = runnable;
            this.f6256b = executor;
        }
    }

    /* renamed from: b1.a$f */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f6258a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f6259b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f6260c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f6261d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f6262e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f6258a = atomicReferenceFieldUpdater;
            this.f6259b = atomicReferenceFieldUpdater2;
            this.f6260c = atomicReferenceFieldUpdater3;
            this.f6261d = atomicReferenceFieldUpdater4;
            this.f6262e = atomicReferenceFieldUpdater5;
        }

        public boolean a(C0390a aVar, e eVar, e eVar2) {
            return w.b.a(this.f6261d, aVar, eVar, eVar2);
        }

        public boolean b(C0390a aVar, Object obj, Object obj2) {
            return w.b.a(this.f6262e, aVar, obj, obj2);
        }

        public boolean c(C0390a aVar, i iVar, i iVar2) {
            return w.b.a(this.f6260c, aVar, iVar, iVar2);
        }

        public void d(i iVar, i iVar2) {
            this.f6259b.lazySet(iVar, iVar2);
        }

        public void e(i iVar, Thread thread) {
            this.f6258a.lazySet(iVar, thread);
        }
    }

    /* renamed from: b1.a$g */
    public static final class g implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final C0390a f6263e;

        /* renamed from: f  reason: collision with root package name */
        public final C1007a f6264f;

        public g(C0390a aVar, C1007a aVar2) {
            this.f6263e = aVar;
            this.f6264f = aVar2;
        }

        public void run() {
            if (this.f6263e.f6245a == this) {
                if (C0390a.f6243f.b(this.f6263e, this, C0390a.j(this.f6264f))) {
                    C0390a.g(this.f6263e);
                }
            }
        }
    }

    /* renamed from: b1.a$h */
    public static final class h extends b {
        public h() {
            super();
        }

        public boolean a(C0390a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6246b != eVar) {
                        return false;
                    }
                    aVar.f6246b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean b(C0390a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6245a != obj) {
                        return false;
                    }
                    aVar.f6245a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean c(C0390a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6247c != iVar) {
                        return false;
                    }
                    aVar.f6247c = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void d(i iVar, i iVar2) {
            iVar.f6267b = iVar2;
        }

        public void e(i iVar, Thread thread) {
            iVar.f6266a = thread;
        }
    }

    /* renamed from: b1.a$i */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        public static final i f6265c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f6266a;

        /* renamed from: b  reason: collision with root package name */
        public volatile i f6267b;

        public i(boolean z4) {
        }

        public void a(i iVar) {
            C0390a.f6243f.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f6266a;
            if (thread != null) {
                this.f6266a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            C0390a.f6243f.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: b1.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: b1.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: b1.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: b1.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<b1.a$i> r2 = b1.C0390a.i.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            f6241d = r3
            java.lang.Class<b1.a> r3 = b1.C0390a.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            f6242e = r4
            b1.a$f r4 = new b1.a$f     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<b1.a$e> r2 = b1.C0390a.e.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            b1.a$h r4 = new b1.a$h
            r4.<init>()
        L_0x004a:
            f6243f = r4
            if (r0 == 0) goto L_0x0057
            java.util.logging.Logger r1 = f6242e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0057:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f6244g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0390a.<clinit>():void");
    }

    private void b(StringBuilder sb) {
        try {
            Object k4 = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(k4));
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

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void g(C0390a aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.c();
            e f4 = aVar.f(eVar);
            while (true) {
                if (f4 != null) {
                    eVar = f4.f6257c;
                    Runnable runnable = f4.f6255a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        aVar = gVar.f6263e;
                        if (aVar.f6245a == gVar) {
                            if (f6243f.b(aVar, gVar, j(gVar.f6264f))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        h(runnable, f4.f6256b);
                    }
                    f4 = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            Logger logger = f6242e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e4);
        }
    }

    private Object i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f6251b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f6253a);
        } else if (obj == f6244g) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object j(C1007a aVar) {
        if (aVar instanceof C0390a) {
            Object obj = ((C0390a) aVar).f6245a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f6250a ? cVar.f6251b != null ? new c(false, cVar.f6251b) : c.f6249d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f6241d) && isCancelled) {
            return c.f6249d;
        }
        try {
            Object k4 = k(aVar);
            return k4 == null ? f6244g : k4;
        } catch (ExecutionException e4) {
            return new d(e4.getCause());
        } catch (CancellationException e5) {
            if (isCancelled) {
                return new c(false, e5);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e5));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static Object k(Future future) {
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

    private void n() {
        i iVar;
        do {
            iVar = this.f6247c;
        } while (!f6243f.c(this, iVar, i.f6265c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f6267b;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f6246b;
        if (eVar != e.f6254d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f6257c = eVar;
                if (!f6243f.a(this, eVar, eVar2)) {
                    eVar = this.f6246b;
                } else {
                    return;
                }
            } while (eVar != e.f6254d);
        }
        h(runnable, executor);
    }

    public void c() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, y2.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6245a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof b1.C0390a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f6241d
            if (r3 == 0) goto L_0x001f
            b1.a$c r3 = new b1.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            b1.a$c r3 = b1.C0390a.c.f6248c
            goto L_0x0026
        L_0x0024:
            b1.a$c r3 = b1.C0390a.c.f6249d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            b1.a$b r6 = f6243f
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.l()
        L_0x0035:
            g(r4)
            boolean r4 = r0 instanceof b1.C0390a.g
            if (r4 == 0) goto L_0x0062
            b1.a$g r0 = (b1.C0390a.g) r0
            y2.a r0 = r0.f6264f
            boolean r4 = r0 instanceof b1.C0390a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            b1.a r4 = (b1.C0390a) r4
            java.lang.Object r0 = r4.f6245a
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof b1.C0390a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f6245a
            boolean r6 = r0 instanceof b1.C0390a.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0390a.cancel(boolean):boolean");
    }

    public final e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f6246b;
        } while (!f6243f.a(this, eVar2, e.f6254d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f6257c;
            eVar5.f6257c = eVar4;
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
            Object obj = this.f6245a;
            if ((obj != null) && (!(obj instanceof g))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                i iVar = this.f6247c;
                if (iVar != i.f6265c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f6243f.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f6245a;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.f6247c;
                        }
                    } while (iVar != i.f6265c);
                }
                return i(this.f6245a);
            }
            while (nanos > 0) {
                Object obj3 = this.f6245a;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
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

    public final boolean isCancelled() {
        return this.f6245a instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.f6245a;
        return (!(obj instanceof g)) & (obj != null);
    }

    public void l() {
    }

    public String m() {
        Object obj = this.f6245a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f6264f) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final void o(i iVar) {
        iVar.f6266a = null;
        while (true) {
            i iVar2 = this.f6247c;
            if (iVar2 != i.f6265c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f6267b;
                    if (iVar2.f6266a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f6267b = iVar4;
                        if (iVar3.f6266a == null) {
                        }
                    } else if (!f6243f.c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean p(Object obj) {
        if (obj == null) {
            obj = f6244g;
        }
        if (!f6243f.b(this, (Object) null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    public boolean q(Throwable th) {
        if (!f6243f.b(this, (Object) null, new d((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    public boolean r(C1007a aVar) {
        g gVar;
        d dVar;
        e(aVar);
        Object obj = this.f6245a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f6243f.b(this, (Object) null, j(aVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            gVar = new g(this, aVar);
            if (f6243f.b(this, (Object) null, gVar)) {
                try {
                    aVar.a(gVar, C0391b.INSTANCE);
                } catch (Throwable unused) {
                    dVar = d.f6252b;
                }
                return true;
            }
            obj = this.f6245a;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f6250a);
        }
        return false;
        f6243f.b(this, gVar, dVar);
        return true;
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
                str = m();
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
        if (!Thread.interrupted()) {
            Object obj2 = this.f6245a;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f6247c;
            if (iVar != i.f6265c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f6243f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6245a;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f6247c;
                } while (iVar != i.f6265c);
            }
            return i(this.f6245a);
        }
        throw new InterruptedException();
    }
}
