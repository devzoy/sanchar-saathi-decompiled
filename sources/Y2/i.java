package Y2;

import java.util.Map;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f3766a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3767b;

    public i(String str, Object obj) {
        this.f3766a = str;
        this.f3767b = obj;
    }

    public Object a(String str) {
        Object obj = this.f3767b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public Object b() {
        return this.f3767b;
    }
}
