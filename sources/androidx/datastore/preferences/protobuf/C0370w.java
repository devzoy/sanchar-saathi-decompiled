package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0349a;
import androidx.datastore.preferences.protobuf.C0372y;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w  reason: case insensitive filesystem */
public abstract class C0370w extends C0349a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, C0370w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected n0 unknownFields = n0.c();

    /* renamed from: androidx.datastore.preferences.protobuf.w$a */
    public static abstract class a extends C0349a.C0088a {

        /* renamed from: e  reason: collision with root package name */
        public final C0370w f5318e;

        /* renamed from: f  reason: collision with root package name */
        public C0370w f5319f;

        public a(C0370w wVar) {
            this.f5318e = wVar;
            if (!wVar.C()) {
                this.f5319f = t();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public static void s(Object obj, Object obj2) {
            b0.a().d(obj).a(obj, obj2);
        }

        private C0370w t() {
            return this.f5318e.I();
        }

        public final C0370w m() {
            C0370w n4 = f();
            if (n4.A()) {
                return n4;
            }
            throw C0349a.C0088a.l(n4);
        }

        /* renamed from: n */
        public C0370w f() {
            if (!this.f5319f.C()) {
                return this.f5319f;
            }
            this.f5319f.D();
            return this.f5319f;
        }

        /* renamed from: o */
        public a clone() {
            a G4 = b().g();
            G4.f5319f = f();
            return G4;
        }

        public final void p() {
            if (!this.f5319f.C()) {
                q();
            }
        }

        public void q() {
            C0370w t4 = t();
            s(t4, this.f5319f);
            this.f5319f = t4;
        }

        /* renamed from: r */
        public C0370w b() {
            return this.f5318e;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$b */
    public static class b extends C0350b {

        /* renamed from: b  reason: collision with root package name */
        public final C0370w f5320b;

        public b(C0370w wVar) {
            this.f5320b = wVar;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static class c extends C0361m {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final boolean B(C0370w wVar, boolean z4) {
        byte byteValue = ((Byte) wVar.q(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean i4 = b0.a().d(wVar).i(wVar);
        if (z4) {
            wVar.r(d.SET_MEMOIZED_IS_INITIALIZED, i4 ? wVar : null);
        }
        return i4;
    }

    public static C0372y.b F(C0372y.b bVar) {
        int size = bVar.size();
        return bVar.k(size == 0 ? 10 : size * 2);
    }

    public static Object H(P p4, String str, Object[] objArr) {
        return new d0(p4, str, objArr);
    }

    public static C0370w J(C0370w wVar, InputStream inputStream) {
        return k(K(wVar, C0356h.g(inputStream), C0363o.b()));
    }

    public static C0370w K(C0370w wVar, C0356h hVar, C0363o oVar) {
        C0370w I4 = wVar.I();
        try {
            f0 d4 = b0.a().d(I4);
            d4.f(I4, C0357i.O(hVar), oVar);
            d4.h(I4);
            return I4;
        } catch (C0373z e4) {
            e = e4;
            if (e.a()) {
                e = new C0373z((IOException) e);
            }
            throw e.k(I4);
        } catch (l0 e5) {
            throw e5.a().k(I4);
        } catch (IOException e6) {
            if (e6.getCause() instanceof C0373z) {
                throw ((C0373z) e6.getCause());
            }
            throw new C0373z(e6).k(I4);
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof C0373z) {
                throw ((C0373z) e7.getCause());
            }
            throw e7;
        }
    }

    public static void L(Class cls, C0370w wVar) {
        wVar.E();
        defaultInstanceMap.put(cls, wVar);
    }

    public static C0370w k(C0370w wVar) {
        if (wVar == null || wVar.A()) {
            return wVar;
        }
        throw wVar.h().a().k(wVar);
    }

    public static C0372y.b t() {
        return c0.u();
    }

    public static C0370w u(Class cls) {
        C0370w wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (wVar == null) {
            wVar = ((C0370w) p0.i(cls)).b();
            if (wVar != null) {
                defaultInstanceMap.put(cls, wVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return wVar;
    }

    public static Object z(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public final boolean A() {
        return B(this, true);
    }

    public boolean C() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void D() {
        b0.a().d(this).h(this);
        E();
    }

    public void E() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: G */
    public final a g() {
        return (a) q(d.NEW_BUILDER);
    }

    public C0370w I() {
        return (C0370w) q(d.NEW_MUTABLE_INSTANCE);
    }

    public void M(int i4) {
        this.memoizedHashCode = i4;
    }

    public void N(int i4) {
        if (i4 >= 0) {
            this.memoizedSerializedSize = (i4 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i4);
    }

    public int a() {
        return d((f0) null);
    }

    public int d(f0 f0Var) {
        if (C()) {
            int o4 = o(f0Var);
            if (o4 >= 0) {
                return o4;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + o4);
        } else if (x() != Integer.MAX_VALUE) {
            return x();
        } else {
            int o5 = o(f0Var);
            N(o5);
            return o5;
        }
    }

    public void e(C0358j jVar) {
        b0.a().d(this).g(this, C0359k.P(jVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b0.a().d(this).b(this, (C0370w) obj);
        }
        return false;
    }

    public int hashCode() {
        if (C()) {
            return n();
        }
        if (y()) {
            M(n());
        }
        return w();
    }

    public Object j() {
        return q(d.BUILD_MESSAGE_INFO);
    }

    public void l() {
        this.memoizedHashCode = 0;
    }

    public void m() {
        N(Integer.MAX_VALUE);
    }

    public int n() {
        return b0.a().d(this).e(this);
    }

    public final int o(f0 f0Var) {
        return f0Var == null ? b0.a().d(this).j(this) : f0Var.j(this);
    }

    public final a p() {
        return (a) q(d.NEW_BUILDER);
    }

    public Object q(d dVar) {
        return s(dVar, (Object) null, (Object) null);
    }

    public Object r(d dVar, Object obj) {
        return s(dVar, obj, (Object) null);
    }

    public abstract Object s(d dVar, Object obj, Object obj2);

    public String toString() {
        return S.f(this, super.toString());
    }

    /* renamed from: v */
    public final C0370w b() {
        return (C0370w) q(d.GET_DEFAULT_INSTANCE);
    }

    public int w() {
        return this.memoizedHashCode;
    }

    public int x() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public boolean y() {
        return w() == 0;
    }
}
