package R1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import z1.C1032o;

public final class t extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2584a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final q f2585b = new q();

    /* renamed from: c  reason: collision with root package name */
    public boolean f2586c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f2587d;

    /* renamed from: e  reason: collision with root package name */
    public Object f2588e;

    /* renamed from: f  reason: collision with root package name */
    public Exception f2589f;

    public final f a(b bVar) {
        this.f2585b.a(new k(h.f2563a, bVar));
        s();
        return this;
    }

    public final f b(Executor executor, b bVar) {
        this.f2585b.a(new k(executor, bVar));
        s();
        return this;
    }

    public final f c(c cVar) {
        j(h.f2563a, cVar);
        return this;
    }

    public final f d(d dVar) {
        k(h.f2563a, dVar);
        return this;
    }

    public final Exception e() {
        Exception exc;
        synchronized (this.f2584a) {
            exc = this.f2589f;
        }
        return exc;
    }

    public final Object f() {
        Object obj;
        synchronized (this.f2584a) {
            try {
                p();
                r();
                Exception exc = this.f2589f;
                if (exc == null) {
                    obj = this.f2588e;
                } else {
                    throw new e(exc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean g() {
        return this.f2587d;
    }

    public final boolean h() {
        boolean z4;
        synchronized (this.f2584a) {
            z4 = this.f2586c;
        }
        return z4;
    }

    public final boolean i() {
        boolean z4;
        synchronized (this.f2584a) {
            try {
                z4 = false;
                if (this.f2586c && !this.f2587d && this.f2589f == null) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    public final f j(Executor executor, c cVar) {
        this.f2585b.a(new m(executor, cVar));
        s();
        return this;
    }

    public final f k(Executor executor, d dVar) {
        this.f2585b.a(new o(executor, dVar));
        s();
        return this;
    }

    public final void l(Object obj) {
        synchronized (this.f2584a) {
            q();
            this.f2586c = true;
            this.f2588e = obj;
        }
        this.f2585b.b(this);
    }

    public final boolean m(Object obj) {
        synchronized (this.f2584a) {
            try {
                if (this.f2586c) {
                    return false;
                }
                this.f2586c = true;
                this.f2588e = obj;
                this.f2585b.b(this);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void n(Exception exc) {
        C1032o.g(exc, "Exception must not be null");
        synchronized (this.f2584a) {
            q();
            this.f2586c = true;
            this.f2589f = exc;
        }
        this.f2585b.b(this);
    }

    public final boolean o(Exception exc) {
        C1032o.g(exc, "Exception must not be null");
        synchronized (this.f2584a) {
            try {
                if (this.f2586c) {
                    return false;
                }
                this.f2586c = true;
                this.f2589f = exc;
                this.f2585b.b(this);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void p() {
        C1032o.i(this.f2586c, "Task is not yet complete");
    }

    public final void q() {
        if (this.f2586c) {
            throw a.a(this);
        }
    }

    public final void r() {
        if (this.f2587d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void s() {
        synchronized (this.f2584a) {
            try {
                if (this.f2586c) {
                    this.f2585b.b(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
