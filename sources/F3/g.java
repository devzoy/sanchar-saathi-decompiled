package F3;

import u3.l;

public abstract class g {
    public static final d a(int i4, a aVar, l lVar) {
        d bVar;
        if (i4 == -2) {
            bVar = aVar == a.SUSPEND ? new b(d.f1075c.a(), lVar) : new o(1, aVar, lVar);
        } else if (i4 != -1) {
            if (i4 != 0) {
                return i4 != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new b(i4, lVar) : new o(i4, aVar, lVar) : new b(Integer.MAX_VALUE, lVar);
            }
            bVar = aVar == a.SUSPEND ? new b(0, lVar) : new o(1, aVar, lVar);
        } else if (aVar == a.SUSPEND) {
            return new o(1, a.DROP_OLDEST, lVar);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        return bVar;
    }

    public static /* synthetic */ d b(int i4, a aVar, l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        return a(i4, aVar, lVar);
    }
}
