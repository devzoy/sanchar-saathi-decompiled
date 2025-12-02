package n1;

/* renamed from: n1.a  reason: case insensitive filesystem */
public abstract class C0800a {
    public static Long a(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }
}
