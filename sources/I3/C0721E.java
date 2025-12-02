package i3;

import h3.C0666g;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import v3.l;

/* renamed from: i3.E  reason: case insensitive filesystem */
public abstract class C0721E extends C0720D {
    public static Map g() {
        C0749z zVar = C0749z.f10305e;
        l.c(zVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return zVar;
    }

    public static Object h(Map map, Object obj) {
        l.e(map, "<this>");
        return C0719C.a(map, obj);
    }

    public static Map i(C0666g... gVarArr) {
        l.e(gVarArr, "pairs");
        return gVarArr.length > 0 ? r(gVarArr, new LinkedHashMap(C0720D.d(gVarArr.length))) : g();
    }

    public static Map j(C0666g... gVarArr) {
        l.e(gVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0720D.d(gVarArr.length));
        n(linkedHashMap, gVarArr);
        return linkedHashMap;
    }

    public static final Map k(Map map) {
        l.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C0720D.f(map) : g();
    }

    public static Map l(Map map, C0666g gVar) {
        l.e(map, "<this>");
        l.e(gVar, "pair");
        if (map.isEmpty()) {
            return C0720D.e(gVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(gVar.c(), gVar.d());
        return linkedHashMap;
    }

    public static final void m(Map map, Iterable iterable) {
        l.e(map, "<this>");
        l.e(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C0666g gVar = (C0666g) it.next();
            map.put(gVar.a(), gVar.b());
        }
    }

    public static final void n(Map map, C0666g[] gVarArr) {
        l.e(map, "<this>");
        l.e(gVarArr, "pairs");
        for (C0666g gVar : gVarArr) {
            map.put(gVar.a(), gVar.b());
        }
    }

    public static Map o(Iterable iterable) {
        l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return k(p(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return g();
        }
        if (size != 1) {
            return p(iterable, new LinkedHashMap(C0720D.d(collection.size())));
        }
        return C0720D.e((C0666g) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map p(Iterable iterable, Map map) {
        l.e(iterable, "<this>");
        l.e(map, "destination");
        m(map, iterable);
        return map;
    }

    public static Map q(Map map) {
        l.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? s(map) : C0720D.f(map) : g();
    }

    public static final Map r(C0666g[] gVarArr, Map map) {
        l.e(gVarArr, "<this>");
        l.e(map, "destination");
        n(map, gVarArr);
        return map;
    }

    public static Map s(Map map) {
        l.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
