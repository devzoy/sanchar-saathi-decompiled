package androidx.lifecycle;

import java.util.LinkedHashMap;
import java.util.Map;
import v3.l;

public class H {

    /* renamed from: a  reason: collision with root package name */
    public final Map f5362a = new LinkedHashMap();

    public final void a() {
        for (F a4 : this.f5362a.values()) {
            a4.a();
        }
        this.f5362a.clear();
    }

    public final F b(String str) {
        l.e(str, "key");
        return (F) this.f5362a.get(str);
    }

    public final void c(String str, F f4) {
        l.e(str, "key");
        l.e(f4, "viewModel");
        F f5 = (F) this.f5362a.put(str, f4);
        if (f5 != null) {
            f5.a();
        }
    }
}
