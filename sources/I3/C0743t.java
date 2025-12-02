package i3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import v3.l;

/* renamed from: i3.t  reason: case insensitive filesystem */
public abstract class C0743t extends C0742s {
    public static boolean p(Collection collection, Iterable iterable) {
        l.e(collection, "<this>");
        l.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z4 = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z4 = true;
            }
        }
        return z4;
    }

    public static final boolean q(Iterable iterable, u3.l lVar, boolean z4) {
        Iterator it = iterable.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.i(it.next())).booleanValue() == z4) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    public static Object r(List list) {
        l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(C0738o.i(list));
    }

    public static boolean s(Iterable iterable, u3.l lVar) {
        l.e(iterable, "<this>");
        l.e(lVar, "predicate");
        return q(iterable, lVar, false);
    }
}
