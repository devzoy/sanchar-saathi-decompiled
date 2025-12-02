package D3;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import v3.l;
import z3.e;

public final class N extends C0233a0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m  reason: collision with root package name */
    public static final N f795m;

    /* renamed from: n  reason: collision with root package name */
    public static final long f796n;

    static {
        Long l4;
        N n4 = new N();
        f795m = n4;
        Z.T(n4, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f796n = timeUnit.toNanos(l4.longValue());
    }

    public void Z() {
        debugStatus = 4;
        super.Z();
    }

    public Thread a0() {
        Thread thread = _thread;
        return thread == null ? l0() : thread;
    }

    public void e0(Runnable runnable) {
        if (m0()) {
            p0();
        }
        super.e0(runnable);
    }

    public final synchronized void k0() {
        if (n0()) {
            debugStatus = 3;
            i0();
            l.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread l0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean m0() {
        return debugStatus == 4;
    }

    public final boolean n0() {
        int i4 = debugStatus;
        return i4 == 2 || i4 == 3;
    }

    public final synchronized boolean o0() {
        if (n0()) {
            return false;
        }
        debugStatus = 1;
        l.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void p0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public void run() {
        J0.f784a.d(this);
        C0236c.a();
        try {
            if (o0()) {
                long j4 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long W3 = W();
                    if (W3 == Long.MAX_VALUE) {
                        C0236c.a();
                        long nanoTime = System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = f796n + nanoTime;
                        }
                        long j5 = j4 - nanoTime;
                        if (j5 <= 0) {
                            _thread = null;
                            k0();
                            C0236c.a();
                            if (!g0()) {
                                a0();
                                return;
                            }
                            return;
                        }
                        W3 = e.d(W3, j5);
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (W3 > 0) {
                        if (n0()) {
                            _thread = null;
                            k0();
                            C0236c.a();
                            if (!g0()) {
                                a0();
                                return;
                            }
                            return;
                        }
                        C0236c.a();
                        LockSupport.parkNanos(this, W3);
                    }
                }
            }
        } finally {
            _thread = null;
            k0();
            C0236c.a();
            if (!g0()) {
                a0();
            }
        }
    }
}
