package P3;

import O3.h;
import O3.r;
import i3.C0731h;
import java.io.IOException;
import java.util.Iterator;
import v3.l;

public abstract class b {
    public static final void a(h hVar, r rVar, boolean z4) {
        l.e(hVar, "<this>");
        l.e(rVar, "dir");
        C0731h hVar2 = new C0731h();
        r rVar2 = rVar;
        while (rVar2 != null && !hVar.g(rVar2)) {
            hVar2.addFirst(rVar2);
            rVar2 = rVar2.q();
        }
        if (!z4 || !hVar2.isEmpty()) {
            Iterator it = hVar2.iterator();
            while (it.hasNext()) {
                hVar.c((r) it.next());
            }
            return;
        }
        throw new IOException(rVar + " already exist.");
    }

    public static final boolean b(h hVar, r rVar) {
        l.e(hVar, "<this>");
        l.e(rVar, "path");
        return hVar.h(rVar) != null;
    }
}
