package P2;

import Y2.b;
import g3.C0641e;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public class c implements Y2.b, f {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f2244a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f2245b;

    /* renamed from: c  reason: collision with root package name */
    public Map f2246c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2247d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f2248e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f2249f;

    /* renamed from: g  reason: collision with root package name */
    public int f2250g;

    /* renamed from: h  reason: collision with root package name */
    public final d f2251h;

    /* renamed from: i  reason: collision with root package name */
    public WeakHashMap f2252i;

    /* renamed from: j  reason: collision with root package name */
    public i f2253j;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f2254a;

        /* renamed from: b  reason: collision with root package name */
        public int f2255b;

        /* renamed from: c  reason: collision with root package name */
        public long f2256c;

        public b(ByteBuffer byteBuffer, int i4, long j4) {
            this.f2254a = byteBuffer;
            this.f2255b = i4;
            this.f2256c = j4;
        }
    }

    /* renamed from: P2.c$c  reason: collision with other inner class name */
    public static class C0048c implements d {

        /* renamed from: a  reason: collision with root package name */
        public final ExecutorService f2257a;

        public C0048c(ExecutorService executorService) {
            this.f2257a = executorService;
        }

        public void a(Runnable runnable) {
            this.f2257a.execute(runnable);
        }
    }

    public interface d {
        void a(Runnable runnable);
    }

    public static class e implements i {

        /* renamed from: a  reason: collision with root package name */
        public ExecutorService f2258a = M2.a.e().b();

        public d a(b.d dVar) {
            return dVar.a() ? new h(this.f2258a) : new C0048c(this.f2258a);
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final b.a f2259a;

        /* renamed from: b  reason: collision with root package name */
        public final d f2260b;

        public f(b.a aVar, d dVar) {
            this.f2259a = aVar;
            this.f2260b = dVar;
        }
    }

    public static class g implements b.C0071b {

        /* renamed from: a  reason: collision with root package name */
        public final FlutterJNI f2261a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2262b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicBoolean f2263c = new AtomicBoolean(false);

        public g(FlutterJNI flutterJNI, int i4) {
            this.f2261a = flutterJNI;
            this.f2262b = i4;
        }

        public void a(ByteBuffer byteBuffer) {
            if (this.f2263c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            } else if (byteBuffer == null) {
                this.f2261a.invokePlatformMessageEmptyResponseCallback(this.f2262b);
            } else {
                this.f2261a.invokePlatformMessageResponseCallback(this.f2262b, byteBuffer, byteBuffer.position());
            }
        }
    }

    public static class h implements d {

        /* renamed from: a  reason: collision with root package name */
        public final ExecutorService f2264a;

        /* renamed from: b  reason: collision with root package name */
        public final ConcurrentLinkedQueue f2265b = new ConcurrentLinkedQueue();

        /* renamed from: c  reason: collision with root package name */
        public final AtomicBoolean f2266c = new AtomicBoolean(false);

        public h(ExecutorService executorService) {
            this.f2264a = executorService;
        }

        public void a(Runnable runnable) {
            this.f2265b.add(runnable);
            this.f2264a.execute(new d(this));
        }

        /* renamed from: d */
        public final void f() {
            if (this.f2266c.compareAndSet(false, true)) {
                try {
                    Runnable runnable = (Runnable) this.f2265b.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                } finally {
                    this.f2266c.set(false);
                    if (!this.f2265b.isEmpty()) {
                        this.f2264a.execute(new e(this));
                    }
                }
            }
        }
    }

    public interface i {
        d a(b.d dVar);
    }

    public static class j implements b.c {
        public j() {
        }
    }

    public c(FlutterJNI flutterJNI, i iVar) {
        this.f2245b = new HashMap();
        this.f2246c = new HashMap();
        this.f2247d = new Object();
        this.f2248e = new AtomicBoolean(false);
        this.f2249f = new HashMap();
        this.f2250g = 1;
        this.f2251h = new g();
        this.f2252i = new WeakHashMap();
        this.f2244a = flutterJNI;
        this.f2253j = iVar;
    }

    public static void k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() != null) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
            return;
        }
        throw error;
    }

    public b.c a(b.d dVar) {
        d a4 = this.f2253j.a(dVar);
        j jVar = new j();
        this.f2252i.put(jVar, a4);
        return jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        if (r10.hasNext() == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        r11 = (P2.c.b) r10.next();
        j(r9, (P2.c.f) r8.f2245b.get(r9), r11.f2254a, r11.f2255b, r11.f2256c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r9, Y2.b.a r10, Y2.b.c r11) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x002a
            java.lang.String r10 = "DartMessenger"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Removing handler for channel '"
            r11.append(r0)
            r11.append(r9)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            M2.b.f(r10, r11)
            java.lang.Object r0 = r8.f2247d
            monitor-enter(r0)
            java.util.Map r10 = r8.f2245b     // Catch:{ all -> 0x0027 }
            r10.remove(r9)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r9
        L_0x002a:
            if (r11 == 0) goto L_0x003f
            java.util.WeakHashMap r0 = r8.f2252i
            java.lang.Object r11 = r0.get(r11)
            P2.c$d r11 = (P2.c.d) r11
            if (r11 == 0) goto L_0x0037
            goto L_0x0040
        L_0x0037:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue)."
            r9.<init>(r10)
            throw r9
        L_0x003f:
            r11 = 0
        L_0x0040:
            java.lang.String r0 = "DartMessenger"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting handler for channel '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            M2.b.f(r0, r1)
            java.lang.Object r0 = r8.f2247d
            monitor-enter(r0)
            java.util.Map r1 = r8.f2245b     // Catch:{ all -> 0x0074 }
            P2.c$f r2 = new P2.c$f     // Catch:{ all -> 0x0074 }
            r2.<init>(r10, r11)     // Catch:{ all -> 0x0074 }
            r1.put(r9, r2)     // Catch:{ all -> 0x0074 }
            java.util.Map r10 = r8.f2246c     // Catch:{ all -> 0x0074 }
            java.lang.Object r10 = r10.remove(r9)     // Catch:{ all -> 0x0074 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0074 }
            if (r10 != 0) goto L_0x0076
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            return
        L_0x0074:
            r9 = move-exception
            goto L_0x009d
        L_0x0076:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            java.util.Iterator r10 = r10.iterator()
        L_0x007b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009c
            java.lang.Object r11 = r10.next()
            P2.c$b r11 = (P2.c.b) r11
            java.util.Map r0 = r8.f2245b
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            P2.c$f r3 = (P2.c.f) r3
            java.nio.ByteBuffer r4 = r11.f2254a
            int r5 = r11.f2255b
            long r6 = r11.f2256c
            r1 = r8
            r2 = r9
            r1.j(r2, r3, r4, r5, r6)
            goto L_0x007b
        L_0x009c:
            return
        L_0x009d:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.c.b(java.lang.String, Y2.b$a, Y2.b$c):void");
    }

    public void c(String str, ByteBuffer byteBuffer, b.C0071b bVar) {
        C0641e g4 = C0641e.g("DartMessenger#send on " + str);
        try {
            M2.b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i4 = this.f2250g;
            this.f2250g = i4 + 1;
            if (bVar != null) {
                this.f2249f.put(Integer.valueOf(i4), bVar);
            }
            if (byteBuffer == null) {
                this.f2244a.dispatchEmptyPlatformMessage(str, i4);
            } else {
                this.f2244a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i4);
            }
            if (g4 != null) {
                g4.close();
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void e(String str, b.a aVar) {
        b(str, aVar, (b.c) null);
    }

    public void f(String str, ByteBuffer byteBuffer) {
        M2.b.f("DartMessenger", "Sending message over channel '" + str + "'");
        c(str, byteBuffer, (b.C0071b) null);
    }

    public void g(int i4, ByteBuffer byteBuffer) {
        M2.b.f("DartMessenger", "Received message reply from Dart.");
        b.C0071b bVar = (b.C0071b) this.f2249f.remove(Integer.valueOf(i4));
        if (bVar != null) {
            try {
                M2.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                bVar.a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Exception e4) {
                M2.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e4);
            } catch (Error e5) {
                k(e5);
            }
        }
    }

    public void h(String str, ByteBuffer byteBuffer, int i4, long j4) {
        f fVar;
        boolean z4;
        M2.b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f2247d) {
            try {
                fVar = (f) this.f2245b.get(str);
                z4 = this.f2248e.get() && fVar == null;
                if (z4) {
                    if (!this.f2246c.containsKey(str)) {
                        this.f2246c.put(str, new LinkedList());
                    }
                    ((List) this.f2246c.get(str)).add(new b(byteBuffer, i4, j4));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z4) {
            j(str, fVar, byteBuffer, i4, j4);
        }
    }

    public final void j(String str, f fVar, ByteBuffer byteBuffer, int i4, long j4) {
        f fVar2 = fVar;
        d dVar = fVar2 != null ? fVar2.f2260b : null;
        C0641e.c("PlatformChannel ScheduleHandler on " + str, i4);
        b bVar = new b(this, str, i4, fVar, byteBuffer, j4);
        if (dVar == null) {
            dVar = this.f2251h;
        }
        dVar.a(bVar);
    }

    public final void l(f fVar, ByteBuffer byteBuffer, int i4) {
        if (fVar != null) {
            try {
                M2.b.f("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f2259a.a(byteBuffer, new g(this.f2244a, i4));
            } catch (Exception e4) {
                M2.b.c("DartMessenger", "Uncaught exception in binary message listener", e4);
                this.f2244a.invokePlatformMessageEmptyResponseCallback(i4);
            } catch (Error e5) {
                k(e5);
            }
        } else {
            M2.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.f2244a.invokePlatformMessageEmptyResponseCallback(i4);
        }
    }

    public final /* synthetic */ void m(String str, int i4, f fVar, ByteBuffer byteBuffer, long j4) {
        C0641e g4;
        C0641e.f("PlatformChannel ScheduleHandler on " + str, i4);
        try {
            g4 = C0641e.g("DartMessenger#handleMessageFromDart on " + str);
            l(fVar, byteBuffer, i4);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
            if (g4 != null) {
                g4.close();
            }
            this.f2244a.cleanupMessageData(j4);
            return;
        } catch (Throwable th) {
            this.f2244a.cleanupMessageData(j4);
            throw th;
        }
        throw th;
    }

    public c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }
}
