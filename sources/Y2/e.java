package Y2;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final e f3764a = new e();

    public ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a4 = g.a(obj);
        return a4 instanceof String ? q.f3784b.a(JSONObject.quote((String) a4)) : q.f3784b.a(a4.toString());
    }

    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(q.f3784b.b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }
}
