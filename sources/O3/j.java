package O3;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import v3.l;

public final class j implements y {

    /* renamed from: e  reason: collision with root package name */
    public final d f2120e;

    /* renamed from: f  reason: collision with root package name */
    public final Inflater f2121f;

    /* renamed from: g  reason: collision with root package name */
    public int f2122g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2123h;

    public j(d dVar, Inflater inflater) {
        l.e(dVar, "source");
        l.e(inflater, "inflater");
        this.f2120e = dVar;
        this.f2121f = inflater;
    }

    public final long b(C0298b bVar, long j4) {
        l.e(bVar, "sink");
        int i4 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        } else if (this.f2123h) {
            throw new IllegalStateException("closed");
        } else if (i4 == 0) {
            return 0;
        } else {
            try {
                u L4 = bVar.L(1);
                c();
                int inflate = this.f2121f.inflate(L4.f2140a, L4.f2142c, (int) Math.min(j4, (long) (8192 - L4.f2142c)));
                d();
                if (inflate > 0) {
                    L4.f2142c += inflate;
                    long j5 = (long) inflate;
                    bVar.F(bVar.H() + j5);
                    return j5;
                }
                if (L4.f2141b == L4.f2142c) {
                    bVar.f2082e = L4.b();
                    v.b(L4);
                }
                return 0;
            } catch (DataFormatException e4) {
                throw new IOException(e4);
            }
        }
    }

    public final boolean c() {
        if (!this.f2121f.needsInput()) {
            return false;
        }
        if (this.f2120e.p()) {
            return true;
        }
        u uVar = this.f2120e.o().f2082e;
        l.b(uVar);
        int i4 = uVar.f2142c;
        int i5 = uVar.f2141b;
        int i6 = i4 - i5;
        this.f2122g = i6;
        this.f2121f.setInput(uVar.f2140a, i5, i6);
        return false;
    }

    public void close() {
        if (!this.f2123h) {
            this.f2121f.end();
            this.f2123h = true;
            this.f2120e.close();
        }
    }

    public final void d() {
        int i4 = this.f2122g;
        if (i4 != 0) {
            int remaining = i4 - this.f2121f.getRemaining();
            this.f2122g -= remaining;
            this.f2120e.skip((long) remaining);
        }
    }

    public long v(C0298b bVar, long j4) {
        l.e(bVar, "sink");
        do {
            long b4 = b(bVar, j4);
            if (b4 > 0) {
                return b4;
            }
            if (this.f2121f.finished() || this.f2121f.needsDictionary()) {
                return -1;
            }
        } while (!this.f2120e.p());
        throw new EOFException("source exhausted prematurely");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public j(y yVar, Inflater inflater) {
        this(o.b(yVar), inflater);
        l.e(yVar, "source");
        l.e(inflater, "inflater");
    }
}
