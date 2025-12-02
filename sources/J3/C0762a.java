package j3;

import i3.C0729f;
import java.util.Map;
import v3.l;

/* renamed from: j3.a  reason: case insensitive filesystem */
public abstract class C0762a extends C0729f {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return t((Map.Entry) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return v((Map.Entry) obj);
    }

    public final boolean t(Map.Entry entry) {
        l.e(entry, "element");
        return u(entry);
    }

    public abstract boolean u(Map.Entry entry);

    public abstract /* bridge */ boolean v(Map.Entry entry);
}
