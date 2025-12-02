package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map f8504a;

    /* renamed from: b  reason: collision with root package name */
    public final B2.b f8505b = B2.b.a();

    public class a implements h {
        public a() {
        }

        public Object a() {
            return new ConcurrentHashMap();
        }
    }

    public class b implements h {
        public b() {
        }

        public Object a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.c$c  reason: collision with other inner class name */
    public class C0140c implements h {
        public C0140c() {
        }

        public Object a() {
            return new LinkedHashMap();
        }
    }

    public class d implements h {
        public d() {
        }

        public Object a() {
            return new g();
        }
    }

    public class e implements h {

        /* renamed from: a  reason: collision with root package name */
        public final l f8510a = l.b();

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Class f8511b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Type f8512c;

        public e(Class cls, Type type) {
            this.f8511b = cls;
            this.f8512c = type;
        }

        public Object a() {
            try {
                return this.f8510a.c(this.f8511b);
            } catch (Exception e4) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f8512c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e4);
            }
        }
    }

    public class f implements h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Constructor f8514a;

        public f(Constructor constructor) {
            this.f8514a = constructor;
        }

        public Object a() {
            try {
                return this.f8514a.newInstance((Object[]) null);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Failed to invoke " + this.f8514a + " with no args", e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to invoke " + this.f8514a + " with no args", e5.getTargetException());
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            }
        }
    }

    public class g implements h {
        public g() {
        }

        public Object a() {
            return new TreeSet();
        }
    }

    public class h implements h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Type f8517a;

        public h(Type type) {
            this.f8517a = type;
        }

        public Object a() {
            Type type = this.f8517a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new com.google.gson.i("Invalid EnumSet type: " + this.f8517a.toString());
            }
            throw new com.google.gson.i("Invalid EnumSet type: " + this.f8517a.toString());
        }
    }

    public class i implements h {
        public i() {
        }

        public Object a() {
            return new LinkedHashSet();
        }
    }

    public class j implements h {
        public j() {
        }

        public Object a() {
            return new ArrayDeque();
        }
    }

    public class k implements h {
        public k() {
        }

        public Object a() {
            return new ArrayList();
        }
    }

    public class l implements h {
        public l() {
        }

        public Object a() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map map) {
        this.f8504a = map;
    }

    public h a(C2.a aVar) {
        Type e4 = aVar.e();
        Class c4 = aVar.c();
        android.support.v4.media.session.b.a(this.f8504a.get(e4));
        android.support.v4.media.session.b.a(this.f8504a.get(c4));
        h b4 = b(c4);
        if (b4 != null) {
            return b4;
        }
        h c5 = c(e4, c4);
        return c5 != null ? c5 : d(e4, c4);
    }

    public final h b(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor((Class[]) null);
            if (!declaredConstructor.isAccessible()) {
                this.f8505b.b(declaredConstructor);
            }
            return new f(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final h c(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new g() : EnumSet.class.isAssignableFrom(cls) ? new h(type) : Set.class.isAssignableFrom(cls) ? new i() : Queue.class.isAssignableFrom(cls) ? new j() : new k();
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new l();
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new a();
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new b();
        }
        if (type instanceof ParameterizedType) {
            if (!String.class.isAssignableFrom(C2.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) {
                return new C0140c();
            }
        }
        return new d();
    }

    public final h d(Type type, Class cls) {
        return new e(cls, type);
    }

    public String toString() {
        return this.f8504a.toString();
    }
}
