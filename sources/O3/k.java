package O3;

import java.io.IOException;
import java.io.InputStream;
import v3.l;

public class k implements y {

    /* renamed from: e  reason: collision with root package name */
    public final InputStream f2124e;

    /* renamed from: f  reason: collision with root package name */
    public final z f2125f;

    public k(InputStream inputStream, z zVar) {
        l.e(inputStream, "input");
        l.e(zVar, "timeout");
        this.f2124e = inputStream;
        this.f2125f = zVar;
    }

    public void close() {
        this.f2124e.close();
    }

    public String toString() {
        return "source(" + this.f2124e + ')';
    }

    public long v(C0298b bVar, long j4) {
        l.e(bVar, "sink");
        int i4 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i4 == 0) {
            return 0;
        }
        if (i4 >= 0) {
            try {
                this.f2125f.a();
                u L4 = bVar.L(1);
                int read = this.f2124e.read(L4.f2140a, L4.f2142c, (int) Math.min(j4, (long) (8192 - L4.f2142c)));
                if (read != -1) {
                    L4.f2142c += read;
                    long j5 = (long) read;
                    bVar.F(bVar.H() + j5);
                    return j5;
                } else if (L4.f2141b != L4.f2142c) {
                    return -1;
                } else {
                    bVar.f2082e = L4.b();
                    v.b(L4);
                    return -1;
                }
            } catch (AssertionError e4) {
                if (o.c(e4)) {
                    throw new IOException(e4);
                }
                throw e4;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
    }
}
