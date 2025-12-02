package R;

public abstract class g {
    public static void a(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int b(int i4) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    public static Object c(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object d(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }
}
