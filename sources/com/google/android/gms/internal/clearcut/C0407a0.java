package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.a0  reason: case insensitive filesystem */
public abstract class C0407a0 extends C0451p {
    private static Map<Object, C0407a0> zzjr = new ConcurrentHashMap();
    protected Z0 zzjp = Z0.h();
    private int zzjq = -1;

    /* renamed from: com.google.android.gms.internal.clearcut.a0$a */
    public static abstract class a extends C0454q {

        /* renamed from: e  reason: collision with root package name */
        public final C0407a0 f7016e;

        /* renamed from: f  reason: collision with root package name */
        public C0407a0 f7017f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f7018g = false;

        public a(C0407a0 a0Var) {
            this.f7016e = a0Var;
            this.f7017f = (C0407a0) a0Var.k(c.f7023d, (Object) null, (Object) null);
        }

        public static void m(C0407a0 a0Var, C0407a0 a0Var2) {
            M0.a().d(a0Var).g(a0Var, a0Var2);
        }

        public /* synthetic */ Object clone() {
            a aVar = (a) this.f7016e.k(c.f7024e, (Object) null, (Object) null);
            aVar.k((C0407a0) i());
            return aVar;
        }

        public final /* synthetic */ B0 h() {
            return this.f7016e;
        }

        /* renamed from: l */
        public final a k(C0407a0 a0Var) {
            n();
            m(this.f7017f, a0Var);
            return this;
        }

        public void n() {
            if (this.f7018g) {
                C0407a0 a0Var = (C0407a0) this.f7017f.k(c.f7023d, (Object) null, (Object) null);
                m(a0Var, this.f7017f);
                this.f7017f = a0Var;
                this.f7018g = false;
            }
        }

        /* renamed from: o */
        public C0407a0 i() {
            if (this.f7018g) {
                return this.f7017f;
            }
            C0407a0 a0Var = this.f7017f;
            M0.a().d(a0Var).c(a0Var);
            this.f7018g = true;
            return this.f7017f;
        }

        public final C0407a0 p() {
            C0407a0 a0Var = (C0407a0) i();
            byte byteValue = ((Byte) a0Var.k(c.f7020a, (Object) null, (Object) null)).byteValue();
            boolean z4 = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z4 = false;
                } else {
                    z4 = M0.a().d(a0Var).j(a0Var);
                    a0Var.k(c.f7021b, z4 ? a0Var : null, (Object) null);
                }
            }
            if (z4) {
                return a0Var;
            }
            throw new X0(a0Var);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.a0$b */
    public static class b extends r {

        /* renamed from: b  reason: collision with root package name */
        public C0407a0 f7019b;

        public b(C0407a0 a0Var) {
            this.f7019b = a0Var;
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.clearcut.a0$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final int f7020a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f7021b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f7022c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f7023d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f7024e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f7025f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f7026g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ int[] f7027h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i  reason: collision with root package name */
        public static final int f7028i = 1;

        /* renamed from: j  reason: collision with root package name */
        public static final int f7029j = 2;

        /* renamed from: k  reason: collision with root package name */
        public static final /* synthetic */ int[] f7030k = {1, 2};

        /* renamed from: l  reason: collision with root package name */
        public static final int f7031l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static final int f7032m = 2;

        /* renamed from: n  reason: collision with root package name */
        public static final /* synthetic */ int[] f7033n = {1, 2};

        public static int[] a() {
            return (int[]) f7027h.clone();
        }
    }

    public static C0407a0 f(C0407a0 a0Var, byte[] bArr) {
        C0407a0 a0Var2 = (C0407a0) a0Var.k(c.f7023d, (Object) null, (Object) null);
        try {
            M0.a().d(a0Var2).h(a0Var2, bArr, 0, bArr.length, new C0468v());
            M0.a().d(a0Var2).c(a0Var2);
            if (a0Var2.zzex == 0) {
                return a0Var2;
            }
            throw new RuntimeException();
        } catch (IOException e4) {
            if (e4.getCause() instanceof C0425g0) {
                throw ((C0425g0) e4.getCause());
            }
            throw new C0425g0(e4.getMessage()).f(a0Var2);
        } catch (IndexOutOfBoundsException unused) {
            throw C0425g0.a().f(a0Var2);
        }
    }

    public static Object l(B0 b02, String str, Object[] objArr) {
        return new O0(b02, str, objArr);
    }

    public static Object m(Method method, Object obj, Object... objArr) {
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

    public static void n(Class cls, C0407a0 a0Var) {
        zzjr.put(cls, a0Var);
    }

    public static C0407a0 o(C0407a0 a0Var, byte[] bArr) {
        C0407a0 f4 = f(a0Var, bArr);
        if (f4 != null) {
            byte byteValue = ((Byte) f4.k(c.f7020a, (Object) null, (Object) null)).byteValue();
            boolean z4 = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z4 = false;
                } else {
                    z4 = M0.a().d(f4).j(f4);
                    f4.k(c.f7021b, z4 ? f4 : null, (Object) null);
                }
            }
            if (!z4) {
                throw new C0425g0(new X0(f4).getMessage()).f(f4);
            }
        }
        return f4;
    }

    public static C0422f0 p() {
        return N0.t();
    }

    public static C0407a0 q(Class cls) {
        C0407a0 a0Var = zzjr.get(cls);
        if (a0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                a0Var = zzjr.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (a0Var != null) {
            return a0Var;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    public final void a(K k4) {
        M0.a().b(getClass()).f(this, M.a(k4));
    }

    public final /* synthetic */ C0 b() {
        a aVar = (a) k(c.f7024e, (Object) null, (Object) null);
        aVar.k(this);
        return aVar;
    }

    public final void c(int i4) {
        this.zzjq = i4;
    }

    public final int d() {
        return this.zzjq;
    }

    public final /* synthetic */ C0 e() {
        return (a) k(c.f7024e, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C0407a0) k(c.f7025f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return M0.a().d(this).b(this, (C0407a0) obj);
    }

    public final int g() {
        if (this.zzjq == -1) {
            this.zzjq = M0.a().d(this).i(this);
        }
        return this.zzjq;
    }

    public final /* synthetic */ B0 h() {
        return (C0407a0) k(c.f7025f, (Object) null, (Object) null);
    }

    public int hashCode() {
        int i4 = this.zzex;
        if (i4 != 0) {
            return i4;
        }
        int e4 = M0.a().d(this).e(this);
        this.zzex = e4;
        return e4;
    }

    public abstract Object k(int i4, Object obj, Object obj2);

    public String toString() {
        return E0.a(this, super.toString());
    }
}
