package H3;

import G3.d;
import l3.i;
import l3.j;

public interface k extends d {

    public static final class a {
        public static /* synthetic */ d a(k kVar, i iVar, int i4, F3.a aVar, int i5, Object obj) {
            if (obj == null) {
                if ((i5 & 1) != 0) {
                    iVar = j.f11131e;
                }
                if ((i5 & 2) != 0) {
                    i4 = -3;
                }
                if ((i5 & 4) != 0) {
                    aVar = F3.a.SUSPEND;
                }
                return kVar.a(iVar, i4, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    d a(i iVar, int i4, F3.a aVar);
}
