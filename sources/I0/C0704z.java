package i0;

import i0.C0695p;
import v.g;

/* renamed from: i0.z  reason: case insensitive filesystem */
public abstract class C0704z {

    /* renamed from: a  reason: collision with root package name */
    public static final g f10238a = new g();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return C0695p.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) {
        g gVar = f10238a;
        g gVar2 = (g) gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new g();
            gVar.put(classLoader, gVar2);
        }
        Class cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e4) {
            throw new C0695p.h("Unable to instantiate fragment " + str + ": make sure class name exists", e4);
        } catch (ClassCastException e5) {
            throw new C0695p.h("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e5);
        }
    }

    public abstract C0695p a(ClassLoader classLoader, String str);
}
