package i3;

import h3.C0666g;
import j3.d;
import java.util.Collections;
import java.util.Map;
import v3.l;

/* renamed from: i3.D  reason: case insensitive filesystem */
public abstract class C0720D extends C0719C {
    public static Map b(Map map) {
        l.e(map, "builder");
        return ((d) map).k();
    }

    public static Map c() {
        return new d();
    }

    public static int d(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((((float) i4) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map e(C0666g gVar) {
        l.e(gVar, "pair");
        Map singletonMap = Collections.singletonMap(gVar.c(), gVar.d());
        l.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final Map f(Map map) {
        l.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        l.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
