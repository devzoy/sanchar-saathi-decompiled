package Y2;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final f f3765a = new f();

    public ByteBuffer a(Object obj) {
        return e.f3764a.a(new JSONArray().put(g.a(obj)));
    }

    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        return e.f3764a.a(new JSONArray().put(str).put(g.a(str2)).put(g.a(obj)).put(g.a(str3)));
    }

    public ByteBuffer c(i iVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", iVar.f3766a);
            jSONObject.put("args", g.a(iVar.f3767b));
            return e.f3764a.a(jSONObject);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    public ByteBuffer d(String str, String str2, Object obj) {
        return e.f3764a.a(new JSONArray().put(str).put(g.a(str2)).put(g.a(obj)));
    }

    public i e(ByteBuffer byteBuffer) {
        try {
            Object b4 = e.f3764a.b(byteBuffer);
            if (b4 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) b4;
                Object obj = jSONObject.get("method");
                Object g4 = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new i((String) obj, g4);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + b4);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    public Object f(ByteBuffer byteBuffer) {
        try {
            Object b4 = e.f3764a.b(byteBuffer);
            if (b4 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) b4;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g4 = g(jSONArray.opt(1));
                    Object g5 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g4 == null || (g4 instanceof String))) {
                        throw new d((String) obj, (String) g4, g5);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + b4);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    public Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
