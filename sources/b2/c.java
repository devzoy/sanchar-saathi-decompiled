package B2;

import com.google.gson.i;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static Class f252d;

    /* renamed from: b  reason: collision with root package name */
    public final Object f253b = d();

    /* renamed from: c  reason: collision with root package name */
    public final Field f254c = c();

    public static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f252d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public void b(AccessibleObject accessibleObject) {
        if (!e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e4) {
                throw new i("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e4);
            }
        }
    }

    public boolean e(AccessibleObject accessibleObject) {
        if (this.f253b == null || this.f254c == null) {
            return false;
        }
        try {
            Long l4 = (Long) f252d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f253b, new Object[]{this.f254c});
            l4.longValue();
            f252d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f253b, new Object[]{accessibleObject, l4, Boolean.TRUE});
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
