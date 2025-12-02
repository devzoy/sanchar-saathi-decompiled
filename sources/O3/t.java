package O3;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import v3.l;

public final class t implements d {

    /* renamed from: e  reason: collision with root package name */
    public final y f2135e;

    /* renamed from: f  reason: collision with root package name */
    public final C0298b f2136f = new C0298b();

    /* renamed from: g  reason: collision with root package name */
    public boolean f2137g;

    public t(y yVar) {
        l.e(yVar, "source");
        this.f2135e = yVar;
    }

    public void A(long j4) {
        if (!b(j4)) {
            throw new EOFException();
        }
    }

    public InputStream G() {
        return new a(this);
    }

    public String a(long j4) {
        A(j4);
        return this.f2136f.a(j4);
    }

    public boolean b(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        } else if (!this.f2137g) {
            while (this.f2136f.H() < j4) {
                if (this.f2135e.v(this.f2136f, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public void close() {
        if (!this.f2137g) {
            this.f2137g = true;
            this.f2135e.close();
            this.f2136f.b();
        }
    }

    public boolean isOpen() {
        return !this.f2137g;
    }

    public int n() {
        A(4);
        return this.f2136f.n();
    }

    public C0298b o() {
        return this.f2136f;
    }

    public boolean p() {
        if (!this.f2137g) {
            return this.f2136f.p() && this.f2135e.v(this.f2136f, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public short q() {
        A(2);
        return this.f2136f.q();
    }

    public int read(ByteBuffer byteBuffer) {
        l.e(byteBuffer, "sink");
        if (this.f2136f.H() == 0 && this.f2135e.v(this.f2136f, 8192) == -1) {
            return -1;
        }
        return this.f2136f.read(byteBuffer);
    }

    public byte readByte() {
        A(1);
        return this.f2136f.readByte();
    }

    public void skip(long j4) {
        if (!this.f2137g) {
            while (j4 > 0) {
                if (this.f2136f.H() == 0 && this.f2135e.v(this.f2136f, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j4, this.f2136f.H());
                this.f2136f.skip(min);
                j4 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f2135e + ')';
    }

    public long u() {
        A(8);
        return this.f2136f.u();
    }

    public long v(C0298b bVar, long j4) {
        l.e(bVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        } else if (this.f2137g) {
            throw new IllegalStateException("closed");
        } else if (this.f2136f.H() == 0 && this.f2135e.v(this.f2136f, 8192) == -1) {
            return -1;
        } else {
            return this.f2136f.v(bVar, Math.min(j4, this.f2136f.H()));
        }
    }

    public static final class a extends InputStream {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ t f2138e;

        public a(t tVar) {
            this.f2138e = tVar;
        }

        public int available() {
            t tVar = this.f2138e;
            if (!tVar.f2137g) {
                return (int) Math.min(tVar.f2136f.H(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f2138e.close();
        }

        public int read() {
            t tVar = this.f2138e;
            if (!tVar.f2137g) {
                if (tVar.f2136f.H() == 0) {
                    t tVar2 = this.f2138e;
                    if (tVar2.f2135e.v(tVar2.f2136f, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f2138e.f2136f.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f2138e + ".inputStream()";
        }

        public int read(byte[] bArr, int i4, int i5) {
            l.e(bArr, "data");
            if (!this.f2138e.f2137g) {
                C0297a.b((long) bArr.length, (long) i4, (long) i5);
                if (this.f2138e.f2136f.H() == 0) {
                    t tVar = this.f2138e;
                    if (tVar.f2135e.v(tVar.f2136f, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f2138e.f2136f.read(bArr, i4, i5);
            }
            throw new IOException("closed");
        }
    }
}
