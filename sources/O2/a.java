package O2;

import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f2046b;

    /* renamed from: a  reason: collision with root package name */
    public final Map f2047a = new HashMap();

    public static a b() {
        if (f2046b == null) {
            f2046b = new a();
        }
        return f2046b;
    }

    public io.flutter.embedding.engine.a a(String str) {
        return (io.flutter.embedding.engine.a) this.f2047a.get(str);
    }

    public void c(String str, io.flutter.embedding.engine.a aVar) {
        if (aVar != null) {
            this.f2047a.put(str, aVar);
        } else {
            this.f2047a.remove(str);
        }
    }

    public void d(String str) {
        c(str, (io.flutter.embedding.engine.a) null);
    }
}
