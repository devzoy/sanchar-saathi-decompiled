package G3;

import D3.p0;
import F3.a;
import H3.h;
import H3.k;
import l3.i;
import v3.g;
import v3.l;

public abstract /* synthetic */ class j {
    public static final d a(d dVar, int i4, a aVar) {
        if (i4 < 0 && i4 != -2 && i4 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i4).toString());
        } else if (i4 != -1 || aVar == a.SUSPEND) {
            if (i4 == -1) {
                aVar = a.DROP_OLDEST;
                i4 = 0;
            }
            int i5 = i4;
            a aVar2 = aVar;
            return dVar instanceof k ? k.a.a((k) dVar, (i) null, i5, aVar2, 1, (Object) null) : new h(dVar, (i) null, i5, aVar2, 2, (g) null);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
    }

    public static /* synthetic */ d b(d dVar, int i4, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = -2;
        }
        if ((i5 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        return f.a(dVar, i4, aVar);
    }

    public static final void c(i iVar) {
        if (iVar.d(p0.f838b) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + iVar).toString());
        }
    }

    public static final d d(d dVar) {
        return b(dVar, -1, (a) null, 2, (Object) null);
    }

    public static final d e(d dVar, i iVar) {
        c(iVar);
        return l.a(iVar, l3.j.f11131e) ? dVar : dVar instanceof k ? k.a.a((k) dVar, iVar, 0, (a) null, 6, (Object) null) : new h(dVar, iVar, 0, (a) null, 12, (g) null);
    }
}
