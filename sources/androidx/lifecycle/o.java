package androidx.lifecycle;

import android.support.v4.media.session.b;
import i3.C0737n;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v3.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f5398a = new o();

    /* renamed from: b  reason: collision with root package name */
    public static final Map f5399b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final Map f5400c = new HashMap();

    public static final String c(String str) {
        l.e(str, "className");
        return C3.o.t(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    public static final C0382i f(Object obj) {
        l.e(obj, "object");
        boolean z4 = obj instanceof C0382i;
        boolean z5 = obj instanceof DefaultLifecycleObserver;
        if (z4 && z5) {
            return new C0376c((DefaultLifecycleObserver) obj, (C0382i) obj);
        }
        if (z5) {
            return new C0376c((DefaultLifecycleObserver) obj, (C0382i) null);
        }
        if (z4) {
            return (C0382i) obj;
        }
        Class<?> cls = obj.getClass();
        o oVar = f5398a;
        if (oVar.d(cls) != 2) {
            return new w(obj);
        }
        Object obj2 = f5400c.get(cls);
        l.b(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            oVar.a((Constructor) list.get(0), obj);
            return new E((C0378e) null);
        }
        int size = list.size();
        C0378e[] eVarArr = new C0378e[size];
        for (int i4 = 0; i4 < size; i4++) {
            f5398a.a((Constructor) list.get(i4), obj);
            eVarArr[i4] = null;
        }
        return new C0375b(eVarArr);
    }

    public final C0378e a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            l.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            b.a(newInstance);
            return null;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final Constructor b(Class cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            l.d(name, "fullPackage");
            if (name.length() != 0) {
                l.d(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                l.d(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            l.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c4 = c(canonicalName);
            if (name.length() != 0) {
                c4 = name + '.' + c4;
            }
            Class<?> cls2 = Class.forName(c4);
            l.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final int d(Class cls) {
        Map map = f5399b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g4 = g(cls);
        map.put(cls, Integer.valueOf(g4));
        return g4;
    }

    public final boolean e(Class cls) {
        return cls != null && C0383j.class.isAssignableFrom(cls);
    }

    public final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b4 = b(cls);
        if (b4 != null) {
            f5400c.put(cls, C0737n.d(b4));
            return 2;
        } else if (C0374a.f5363c.d(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            if (e(superclass)) {
                l.d(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                Object obj = f5400c.get(superclass);
                l.b(obj);
                arrayList = new ArrayList((Collection) obj);
            } else {
                arrayList = null;
            }
            Class[] interfaces = cls.getInterfaces();
            l.d(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (e(cls2)) {
                    l.d(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Object obj2 = f5400c.get(cls2);
                    l.b(obj2);
                    arrayList.addAll((Collection) obj2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f5400c.put(cls, arrayList);
            return 2;
        }
    }
}
