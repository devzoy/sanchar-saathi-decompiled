package O3;

import h3.C0673n;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import v3.l;

public abstract class f implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2097e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2098f;

    /* renamed from: g  reason: collision with root package name */
    public int f2099g;

    /* renamed from: h  reason: collision with root package name */
    public final ReentrantLock f2100h = B.b();

    public static final class a implements x {

        /* renamed from: e  reason: collision with root package name */
        public final f f2101e;

        /* renamed from: f  reason: collision with root package name */
        public long f2102f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2103g;

        public a(f fVar, long j4) {
            l.e(fVar, "fileHandle");
            this.f2101e = fVar;
            this.f2102f = j4;
        }

        public void I(C0298b bVar, long j4) {
            l.e(bVar, "source");
            if (!this.f2103g) {
                this.f2101e.x(this.f2102f, bVar, j4);
                this.f2102f += j4;
                return;
            }
            throw new IllegalStateException("closed");
        }

        public void close() {
            if (!this.f2103g) {
                this.f2103g = true;
                ReentrantLock g4 = this.f2101e.g();
                g4.lock();
                try {
                    f fVar = this.f2101e;
                    fVar.f2099g = fVar.f2099g - 1;
                    if (this.f2101e.f2099g == 0) {
                        if (this.f2101e.f2098f) {
                            C0673n nVar = C0673n.f9639a;
                            g4.unlock();
                            this.f2101e.h();
                        }
                    }
                } finally {
                    g4.unlock();
                }
            }
        }

        public void flush() {
            if (!this.f2103g) {
                this.f2101e.i();
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    public static final class b implements y {

        /* renamed from: e  reason: collision with root package name */
        public final f f2104e;

        /* renamed from: f  reason: collision with root package name */
        public long f2105f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2106g;

        public b(f fVar, long j4) {
            l.e(fVar, "fileHandle");
            this.f2104e = fVar;
            this.f2105f = j4;
        }

        public void close() {
            if (!this.f2106g) {
                this.f2106g = true;
                ReentrantLock g4 = this.f2104e.g();
                g4.lock();
                try {
                    f fVar = this.f2104e;
                    fVar.f2099g = fVar.f2099g - 1;
                    if (this.f2104e.f2099g == 0) {
                        if (this.f2104e.f2098f) {
                            C0673n nVar = C0673n.f9639a;
                            g4.unlock();
                            this.f2104e.h();
                        }
                    }
                } finally {
                    g4.unlock();
                }
            }
        }

        public long v(C0298b bVar, long j4) {
            l.e(bVar, "sink");
            if (!this.f2106g) {
                long d4 = this.f2104e.m(this.f2105f, bVar, j4);
                if (d4 != -1) {
                    this.f2105f += d4;
                }
                return d4;
            }
            throw new IllegalStateException("closed");
        }
    }

    public f(boolean z4) {
        this.f2097e = z4;
    }

    public static /* synthetic */ x s(f fVar, long j4, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                j4 = 0;
            }
            return fVar.r(j4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
    }

    public final void close() {
        ReentrantLock reentrantLock = this.f2100h;
        reentrantLock.lock();
        try {
            if (!this.f2098f) {
                this.f2098f = true;
                if (this.f2099g != 0) {
                    reentrantLock.unlock();
                    return;
                }
                C0673n nVar = C0673n.f9639a;
                reentrantLock.unlock();
                h();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void flush() {
        if (this.f2097e) {
            ReentrantLock reentrantLock = this.f2100h;
            reentrantLock.lock();
            try {
                if (!this.f2098f) {
                    C0673n nVar = C0673n.f9639a;
                    reentrantLock.unlock();
                    i();
                    return;
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } else {
            throw new IllegalStateException("file handle is read-only");
        }
    }

    public final ReentrantLock g() {
        return this.f2100h;
    }

    public abstract void h();

    public abstract void i();

    public abstract int j(long j4, byte[] bArr, int i4, int i5);

    public abstract long k();

    public abstract void l(long j4, byte[] bArr, int i4, int i5);

    public final long m(long j4, C0298b bVar, long j5) {
        C0298b bVar2 = bVar;
        long j6 = j5;
        if (j6 >= 0) {
            long j7 = j6 + j4;
            long j8 = j4;
            while (true) {
                if (j8 >= j7) {
                    break;
                }
                u L4 = bVar2.L(1);
                byte[] bArr = L4.f2140a;
                int i4 = L4.f2142c;
                int j9 = j(j8, bArr, i4, (int) Math.min(j7 - j8, (long) (8192 - i4)));
                if (j9 == -1) {
                    if (L4.f2141b == L4.f2142c) {
                        bVar2.f2082e = L4.b();
                        v.b(L4);
                    }
                    if (j4 == j8) {
                        return -1;
                    }
                } else {
                    L4.f2142c += j9;
                    long j10 = (long) j9;
                    j8 += j10;
                    bVar2.F(bVar.H() + j10);
                }
            }
            return j8 - j4;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
    }

    /* JADX INFO: finally extract failed */
    public final x r(long j4) {
        if (this.f2097e) {
            ReentrantLock reentrantLock = this.f2100h;
            reentrantLock.lock();
            try {
                if (!this.f2098f) {
                    this.f2099g++;
                    reentrantLock.unlock();
                    return new a(this, j4);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } else {
            throw new IllegalStateException("file handle is read-only");
        }
    }

    /* JADX INFO: finally extract failed */
    public final long t() {
        ReentrantLock reentrantLock = this.f2100h;
        reentrantLock.lock();
        try {
            if (!this.f2098f) {
                C0673n nVar = C0673n.f9639a;
                reentrantLock.unlock();
                return k();
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final y w(long j4) {
        ReentrantLock reentrantLock = this.f2100h;
        reentrantLock.lock();
        try {
            if (!this.f2098f) {
                this.f2099g++;
                reentrantLock.unlock();
                return new b(this, j4);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void x(long j4, C0298b bVar, long j5) {
        C0297a.b(bVar.H(), 0, j5);
        long j6 = j5 + j4;
        while (j4 < j6) {
            u uVar = bVar.f2082e;
            l.b(uVar);
            int min = (int) Math.min(j6 - j4, (long) (uVar.f2142c - uVar.f2141b));
            l(j4, uVar.f2140a, uVar.f2141b, min);
            uVar.f2141b += min;
            long j7 = (long) min;
            j4 += j7;
            bVar.F(bVar.H() - j7);
            if (uVar.f2141b == uVar.f2142c) {
                bVar.f2082e = uVar.b();
                v.b(uVar);
            }
        }
    }
}
