package P3;

import O3.C0298b;
import O3.i;
import O3.y;
import java.io.IOException;
import v3.l;

public final class f extends i {

    /* renamed from: f  reason: collision with root package name */
    public final long f2279f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2280g;

    /* renamed from: h  reason: collision with root package name */
    public long f2281h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(y yVar, long j4, boolean z4) {
        super(yVar);
        l.e(yVar, "delegate");
        this.f2279f = j4;
        this.f2280g = z4;
    }

    public final void b(C0298b bVar, long j4) {
        C0298b bVar2 = new C0298b();
        bVar2.O(bVar);
        bVar.I(bVar2, j4);
        bVar2.b();
    }

    public long v(C0298b bVar, long j4) {
        l.e(bVar, "sink");
        long j5 = this.f2281h;
        long j6 = this.f2279f;
        if (j5 > j6) {
            j4 = 0;
        } else if (this.f2280g) {
            long j7 = j6 - j5;
            if (j7 == 0) {
                return -1;
            }
            j4 = Math.min(j4, j7);
        }
        long v4 = super.v(bVar, j4);
        int i4 = (v4 > -1 ? 1 : (v4 == -1 ? 0 : -1));
        if (i4 != 0) {
            this.f2281h += v4;
        }
        long j8 = this.f2281h;
        long j9 = this.f2279f;
        if ((j8 >= j9 || i4 != 0) && j8 <= j9) {
            return v4;
        }
        if (v4 > 0 && j8 > j9) {
            b(bVar, bVar.H() - (this.f2281h - this.f2279f));
        }
        throw new IOException("expected " + this.f2279f + " bytes but got " + this.f2281h);
    }
}
