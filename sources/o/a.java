package O;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2012a;

    /* renamed from: b  reason: collision with root package name */
    public C0041a f2013b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2014c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2015d;

    /* renamed from: O.a$a  reason: collision with other inner class name */
    public interface C0041a {
        void a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        if (r1 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001e, code lost:
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.f2015d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.f2015d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0035, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f2012a     // Catch:{ all -> 0x0007 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r0 = move-exception
            goto L_0x003a
        L_0x0009:
            r0 = 1
            r3.f2012a = r0     // Catch:{ all -> 0x0007 }
            r3.f2015d = r0     // Catch:{ all -> 0x0007 }
            O.a$a r0 = r3.f2013b     // Catch:{ all -> 0x0007 }
            java.lang.Object r1 = r3.f2014c     // Catch:{ all -> 0x0007 }
            monitor-exit(r3)     // Catch:{ all -> 0x0007 }
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0.a()     // Catch:{ all -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r0 = move-exception
            goto L_0x0024
        L_0x001c:
            if (r1 == 0) goto L_0x002f
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch:{ all -> 0x001a }
            r1.cancel()     // Catch:{ all -> 0x001a }
            goto L_0x002f
        L_0x0024:
            monitor-enter(r3)
            r3.f2015d = r2     // Catch:{ all -> 0x002c }
            r3.notifyAll()     // Catch:{ all -> 0x002c }
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r0
        L_0x002c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r0
        L_0x002f:
            monitor-enter(r3)
            r3.f2015d = r2     // Catch:{ all -> 0x0037 }
            r3.notifyAll()     // Catch:{ all -> 0x0037 }
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            throw r0
        L_0x003a:
            monitor-exit(r3)     // Catch:{ all -> 0x0007 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O.a.a():void");
    }

    public void b(C0041a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f2013b != aVar) {
                    this.f2013b = aVar;
                    if (this.f2012a) {
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void c() {
        while (this.f2015d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
