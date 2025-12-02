package I3;

import D3.I0;
import l3.i;
import v3.l;

public final class N {

    /* renamed from: a  reason: collision with root package name */
    public final i f1539a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f1540b;

    /* renamed from: c  reason: collision with root package name */
    public final I0[] f1541c;

    /* renamed from: d  reason: collision with root package name */
    public int f1542d;

    public N(i iVar, int i4) {
        this.f1539a = iVar;
        this.f1540b = new Object[i4];
        this.f1541c = new I0[i4];
    }

    public final void a(I0 i02, Object obj) {
        Object[] objArr = this.f1540b;
        int i4 = this.f1542d;
        objArr[i4] = obj;
        I0[] i0Arr = this.f1541c;
        this.f1542d = i4 + 1;
        l.c(i02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        i0Arr[i4] = i02;
    }

    public final void b(i iVar) {
        int length = this.f1541c.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                I0 i02 = this.f1541c[length];
                l.b(i02);
                i02.m(iVar, this.f1540b[length]);
                if (i4 >= 0) {
                    length = i4;
                } else {
                    return;
                }
            }
        }
    }
}
