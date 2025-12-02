package B3;

import i3.C0737n;
import i3.C0738o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v3.l;

public abstract class g extends f {
    public static List c(b bVar) {
        l.e(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return C0738o.h();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C0737n.d(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
