package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class l {

    public class a extends l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f8553a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f8554b;

        public a(Method method, Object obj) {
            this.f8553a = method;
            this.f8554b = obj;
        }

        public Object c(Class cls) {
            l.a(cls);
            return this.f8553a.invoke(this.f8554b, new Object[]{cls});
        }
    }

    public class b extends l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f8555a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f8556b;

        public b(Method method, int i4) {
            this.f8555a = method;
            this.f8556b = i4;
        }

        public Object c(Class cls) {
            l.a(cls);
            return this.f8555a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f8556b)});
        }
    }

    public class c extends l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f8557a;

        public c(Method method) {
            this.f8557a = method;
        }

        public Object c(Class cls) {
            l.a(cls);
            return this.f8557a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    public class d extends l {
        public Object c(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    public static void a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static l b() {
        Class<ObjectStreamClass> cls = ObjectStreamClass.class;
        Class<Class> cls2 = Class.class;
        try {
            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls3.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls3.getMethod("allocateInstance", new Class[]{cls2}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getConstructorId", new Class[]{cls2});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = cls.getDeclaredMethod("newInstance", new Class[]{cls2, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls2, cls2});
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                } catch (Exception unused3) {
                    return new d();
                }
            }
        }
    }

    public abstract Object c(Class cls);
}
