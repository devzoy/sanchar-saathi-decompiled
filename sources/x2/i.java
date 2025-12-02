package X2;

import Y2.a;
import Y2.e;
import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Y2.a f3499a;

    public interface a {
        void a(boolean z4);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final KeyEvent f3500a;

        /* renamed from: b  reason: collision with root package name */
        public final Character f3501b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f3500a = keyEvent;
            this.f3501b = ch;
        }
    }

    public i(Y2.b bVar) {
        this.f3499a = new Y2.a(bVar, "flutter/keyevent", e.f3764a);
    }

    public static a.e b(a aVar) {
        return new h(aVar);
    }

    public static /* synthetic */ void d(a aVar, Object obj) {
        boolean z4 = false;
        if (obj != null) {
            try {
                z4 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e4) {
                M2.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e4);
            }
        }
        aVar.a(z4);
    }

    public final Map c(b bVar, boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z4 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f3500a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f3500a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f3500a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f3500a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f3500a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f3500a.getMetaState()));
        Character ch = bVar.f3501b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f3500a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f3500a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f3500a.getRepeatCount()));
        return hashMap;
    }

    public void e(b bVar, boolean z4, a aVar) {
        this.f3499a.d(c(bVar, z4), b(aVar));
    }
}
