package androidx.work;

import Q0.g;
import androidx.work.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class OverwritingInputMerger extends g {
    public b b(List list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(((b) it.next()).h());
        }
        aVar.c(hashMap);
        return aVar.a();
    }
}
