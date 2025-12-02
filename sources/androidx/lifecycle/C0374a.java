package androidx.lifecycle;

import androidx.lifecycle.C0380g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a  reason: case insensitive filesystem */
public final class C0374a {

    /* renamed from: c  reason: collision with root package name */
    public static C0374a f5363c = new C0374a();

    /* renamed from: a  reason: collision with root package name */
    public final Map f5364a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f5365b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    public static class C0092a {

        /* renamed from: a  reason: collision with root package name */
        public final Map f5366a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map f5367b;

        public C0092a(Map map) {
            this.f5367b = map;
            for (Map.Entry entry : map.entrySet()) {
                C0380g.a aVar = (C0380g.a) entry.getValue();
                List list = (List) this.f5366a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f5366a.put(aVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        public static void b(List list, C0384k kVar, C0380g.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(kVar, aVar, obj);
                }
            }
        }

        public void a(C0384k kVar, C0380g.a aVar, Object obj) {
            b((List) this.f5366a.get(aVar), kVar, aVar, obj);
            b((List) this.f5366a.get(C0380g.a.ON_ANY), kVar, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5368a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f5369b;

        public b(int i4, Method method) {
            this.f5368a = i4;
            this.f5369b = method;
            method.setAccessible(true);
        }

        public void a(C0384k kVar, C0380g.a aVar, Object obj) {
            try {
                int i4 = this.f5368a;
                if (i4 == 0) {
                    this.f5369b.invoke(obj, (Object[]) null);
                } else if (i4 == 1) {
                    this.f5369b.invoke(obj, new Object[]{kVar});
                } else if (i4 == 2) {
                    this.f5369b.invoke(obj, new Object[]{kVar, aVar});
                }
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to call observer method", e4.getCause());
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5368a == bVar.f5368a && this.f5369b.getName().equals(bVar.f5369b.getName());
        }

        public int hashCode() {
            return (this.f5368a * 31) + this.f5369b.getName().hashCode();
        }
    }

    public final C0092a a(Class cls, Method[] methodArr) {
        int i4;
        C0092a c4;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c4 = c(superclass)) == null)) {
            hashMap.putAll(c4.f5367b);
        }
        for (Class c5 : cls.getInterfaces()) {
            for (Map.Entry entry : c(c5).f5367b.entrySet()) {
                e(hashMap, (b) entry.getKey(), (C0380g.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z4 = false;
        for (Method method : methodArr) {
            t tVar = (t) method.getAnnotation(t.class);
            if (tVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i4 = 0;
                } else if (C0384k.class.isAssignableFrom(parameterTypes[0])) {
                    i4 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0380g.a value = tVar.value();
                if (parameterTypes.length > 1) {
                    if (!C0380g.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0380g.a.ON_ANY) {
                        i4 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i4, method), value, cls);
                    z4 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0092a aVar = new C0092a(hashMap);
        this.f5364a.put(cls, aVar);
        this.f5365b.put(cls, Boolean.valueOf(z4));
        return aVar;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e4) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
        }
    }

    public C0092a c(Class cls) {
        C0092a aVar = (C0092a) this.f5364a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f5365b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b4 = b(cls);
        for (Method annotation : b4) {
            if (((t) annotation.getAnnotation(t.class)) != null) {
                a(cls, b4);
                return true;
            }
        }
        this.f5365b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, b bVar, C0380g.a aVar, Class cls) {
        C0380g.a aVar2 = (C0380g.a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f5369b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }
}
