package g0;

import i3.C0746w;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import v3.l;

/* renamed from: g0.a  reason: case insensitive filesystem */
public abstract class C0634a {
    public static final Set a(Set set) {
        l.e(set, "set");
        Set unmodifiableSet = Collections.unmodifiableSet(C0746w.L(set));
        l.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
        return unmodifiableSet;
    }

    public static final Map b(Map map) {
        l.e(map, "map");
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        l.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }
}
