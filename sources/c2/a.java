package C2;

import com.google.gson.internal.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class f530a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f531b;

    /* renamed from: c  reason: collision with root package name */
    public final int f532c;

    public a() {
        Type d4 = d(getClass());
        this.f531b = d4;
        this.f530a = b.k(d4);
        this.f532c = d4.hashCode();
    }

    public static a a(Class cls) {
        return new a(cls);
    }

    public static a b(Type type) {
        return new a(type);
    }

    public static Type d(Class cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final Class c() {
        return this.f530a;
    }

    public final Type e() {
        return this.f531b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f531b, ((a) obj).f531b);
    }

    public final int hashCode() {
        return this.f532c;
    }

    public final String toString() {
        return b.u(this.f531b);
    }

    public a(Type type) {
        Type b4 = b.b((Type) com.google.gson.internal.a.b(type));
        this.f531b = b4;
        this.f530a = b.k(b4);
        this.f532c = b4.hashCode();
    }
}
