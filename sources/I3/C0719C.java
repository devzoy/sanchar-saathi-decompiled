package i3;

import java.util.Map;
import java.util.NoSuchElementException;
import v3.l;

/* renamed from: i3.C  reason: case insensitive filesystem */
public abstract class C0719C {
    public static final Object a(Map map, Object obj) {
        l.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
