package i3;

import j3.h;
import java.util.Collections;
import java.util.Set;
import v3.l;

/* renamed from: i3.F  reason: case insensitive filesystem */
public abstract class C0722F {
    public static Set a(Set set) {
        l.e(set, "builder");
        return ((h) set).t();
    }

    public static Set b() {
        return new h();
    }

    public static Set c(Object obj) {
        Set singleton = Collections.singleton(obj);
        l.d(singleton, "singleton(...)");
        return singleton;
    }
}
