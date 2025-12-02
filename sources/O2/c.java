package O2;

import io.flutter.embedding.engine.b;
import java.util.HashMap;
import java.util.Map;

public class c {

    /* renamed from: b  reason: collision with root package name */
    public static volatile c f2070b;

    /* renamed from: a  reason: collision with root package name */
    public final Map f2071a = new HashMap();

    public static c b() {
        if (f2070b == null) {
            synchronized (c.class) {
                try {
                    if (f2070b == null) {
                        f2070b = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2070b;
    }

    public b a(String str) {
        return (b) this.f2071a.get(str);
    }
}
