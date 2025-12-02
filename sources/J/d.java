package J;

import I.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class d extends h {

    /* renamed from: b  reason: collision with root package name */
    public static Class f1598b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor f1599c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f1600d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Method f1601e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1602f = false;

    public static boolean g(Object obj, String str, int i4, boolean z4) {
        i();
        try {
            return ((Boolean) f1600d.invoke(obj, new Object[]{str, Integer.valueOf(i4), Boolean.valueOf(z4)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static Typeface h(Object obj) {
        i();
        try {
            Object newInstance = Array.newInstance(f1598b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1601e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void i() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f1602f) {
            f1602f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e4) {
                Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
                method2 = null;
                cls = null;
                method = null;
            }
            f1599c = constructor;
            f1598b = cls;
            f1600d = method;
            f1601e = method2;
        }
    }

    private static Object j() {
        i();
        try {
            return f1599c.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public Typeface a(Context context, a.c cVar, Resources resources, int i4) {
        Object j4 = j();
        a.d[] a4 = cVar.a();
        int length = a4.length;
        int i5 = 0;
        while (i5 < length) {
            a.d dVar = a4[i5];
            File d4 = i.d(context);
            if (d4 == null) {
                return null;
            }
            try {
                if (!i.b(d4, resources, dVar.b())) {
                    d4.delete();
                    return null;
                } else if (!g(j4, d4.getPath(), dVar.e(), dVar.f())) {
                    return null;
                } else {
                    d4.delete();
                    i5++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                d4.delete();
            }
        }
        return h(j4);
    }
}
