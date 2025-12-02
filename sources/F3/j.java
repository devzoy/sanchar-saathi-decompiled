package F3;

import D3.N0;
import I3.C;
import I3.x;
import java.util.concurrent.atomic.AtomicReferenceArray;
import l3.i;
import u3.l;

public final class j extends C {

    /* renamed from: i  reason: collision with root package name */
    public final b f1082i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReferenceArray f1083j = new AtomicReferenceArray(c.f1056b * 2);

    public j(long j4, j jVar, b bVar, int i4) {
        super(j4, jVar, i4);
        this.f1082i = bVar;
    }

    public final void A(int i4, Object obj) {
        this.f1083j.set((i4 * 2) + 1, obj);
    }

    public final void B(int i4, Object obj) {
        z(i4, obj);
    }

    public int n() {
        return c.f1056b;
    }

    public void o(int i4, Throwable th, i iVar) {
        l lVar;
        l lVar2;
        int i5 = c.f1056b;
        boolean z4 = i4 >= i5;
        if (z4) {
            i4 -= i5;
        }
        Object v4 = v(i4);
        while (true) {
            Object w4 = w(i4);
            if ((w4 instanceof N0) || (w4 instanceof u)) {
                if (r(i4, w4, z4 ? c.f1064j : c.f1065k)) {
                    s(i4);
                    x(i4, !z4);
                    if (z4 && (lVar = u().f1047f) != null) {
                        x.b(lVar, v4, iVar);
                        return;
                    }
                    return;
                }
            } else if (w4 == c.f1064j || w4 == c.f1065k) {
                s(i4);
            } else if (!(w4 == c.f1061g || w4 == c.f1060f)) {
                if (w4 != c.f1063i && w4 != c.f1058d && w4 != c.z()) {
                    throw new IllegalStateException(("unexpected state: " + w4).toString());
                }
                return;
            }
        }
        s(i4);
        if (z4 && (lVar2 = u().f1047f) != null) {
            x.b(lVar2, v4, iVar);
        }
    }

    public final boolean r(int i4, Object obj, Object obj2) {
        return i.a(this.f1083j, (i4 * 2) + 1, obj, obj2);
    }

    public final void s(int i4) {
        z(i4, (Object) null);
    }

    public final Object t(int i4, Object obj) {
        return this.f1083j.getAndSet((i4 * 2) + 1, obj);
    }

    public final b u() {
        b bVar = this.f1082i;
        v3.l.b(bVar);
        return bVar;
    }

    public final Object v(int i4) {
        return this.f1083j.get(i4 * 2);
    }

    public final Object w(int i4) {
        return this.f1083j.get((i4 * 2) + 1);
    }

    public final void x(int i4, boolean z4) {
        if (z4) {
            u().G0((this.f1526g * ((long) c.f1056b)) + ((long) i4));
        }
        p();
    }

    public final Object y(int i4) {
        Object v4 = v(i4);
        s(i4);
        return v4;
    }

    public final void z(int i4, Object obj) {
        this.f1083j.lazySet(i4 * 2, obj);
    }
}
