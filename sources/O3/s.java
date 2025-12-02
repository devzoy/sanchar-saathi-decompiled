package O3;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import v3.l;

public final class s implements c {

    /* renamed from: e  reason: collision with root package name */
    public final x f2131e;

    /* renamed from: f  reason: collision with root package name */
    public final C0298b f2132f = new C0298b();

    /* renamed from: g  reason: collision with root package name */
    public boolean f2133g;

    public s(x xVar) {
        l.e(xVar, "sink");
        this.f2131e = xVar;
    }

    public OutputStream E() {
        return new a(this);
    }

    public void I(C0298b bVar, long j4) {
        l.e(bVar, "source");
        if (!this.f2133g) {
            this.f2132f.I(bVar, j4);
            b();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public c b() {
        if (!this.f2133g) {
            long g4 = this.f2132f.g();
            if (g4 > 0) {
                this.f2131e.I(this.f2132f, g4);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void close() {
        if (!this.f2133g) {
            try {
                if (this.f2132f.H() > 0) {
                    x xVar = this.f2131e;
                    C0298b bVar = this.f2132f;
                    xVar.I(bVar, bVar.H());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f2131e.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f2133g = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        if (!this.f2133g) {
            if (this.f2132f.H() > 0) {
                x xVar = this.f2131e;
                C0298b bVar = this.f2132f;
                xVar.I(bVar, bVar.H());
            }
            this.f2131e.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f2133g;
    }

    public String toString() {
        return "buffer(" + this.f2131e + ')';
    }

    public int write(ByteBuffer byteBuffer) {
        l.e(byteBuffer, "source");
        if (!this.f2133g) {
            int write = this.f2132f.write(byteBuffer);
            b();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public static final class a extends OutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ s f2134e;

        public a(s sVar) {
            this.f2134e = sVar;
        }

        public void close() {
            this.f2134e.close();
        }

        public void flush() {
            s sVar = this.f2134e;
            if (!sVar.f2133g) {
                sVar.flush();
            }
        }

        public String toString() {
            return this.f2134e + ".outputStream()";
        }

        public void write(int i4) {
            s sVar = this.f2134e;
            if (!sVar.f2133g) {
                sVar.f2132f.P((byte) i4);
                this.f2134e.b();
                return;
            }
            throw new IOException("closed");
        }

        public void write(byte[] bArr, int i4, int i5) {
            l.e(bArr, "data");
            s sVar = this.f2134e;
            if (!sVar.f2133g) {
                sVar.f2132f.N(bArr, i4, i5);
                this.f2134e.b();
                return;
            }
            throw new IOException("closed");
        }
    }
}
