package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class N0 extends X {
    private static Map<Object, N0> zzd = new ConcurrentHashMap();
    protected C0498d2 zzb = C0498d2.a();
    private int zzc = -1;

    public static class a extends Y {

        /* renamed from: b  reason: collision with root package name */
        public final N0 f7311b;

        public a(N0 n02) {
            this.f7311b = n02;
        }
    }

    public static abstract class b extends W {

        /* renamed from: e  reason: collision with root package name */
        public final N0 f7312e;

        /* renamed from: f  reason: collision with root package name */
        public N0 f7313f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f7314g = false;

        public b(N0 n02) {
            this.f7312e = n02;
            this.f7313f = (N0) n02.n(d.f7318d, (Object) null, (Object) null);
        }

        public static void n(N0 n02, N0 n03) {
            F1.a().c(n02).f(n02, n03);
        }

        public /* synthetic */ Object clone() {
            b bVar = (b) this.f7312e.n(d.f7319e, (Object) null, (Object) null);
            bVar.k((N0) c());
            return bVar;
        }

        public final /* synthetic */ C0546t1 h() {
            return this.f7312e;
        }

        public final /* synthetic */ W l(byte[] bArr, int i4, int i5, A0 a02) {
            return o(bArr, 0, i5, a02);
        }

        /* renamed from: m */
        public final b k(N0 n02) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            n(this.f7313f, n02);
            return this;
        }

        public final b o(byte[] bArr, int i4, int i5, A0 a02) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            try {
                F1.a().c(this.f7313f).i(this.f7313f, bArr, 0, i5, new C0492c0(a02));
                return this;
            } catch (W0 e4) {
                throw e4;
            } catch (IndexOutOfBoundsException unused) {
                throw W0.a();
            } catch (IOException e5) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e5);
            }
        }

        public void p() {
            N0 n02 = (N0) this.f7313f.n(d.f7318d, (Object) null, (Object) null);
            n(n02, this.f7313f);
            this.f7313f = n02;
        }

        /* renamed from: q */
        public N0 c() {
            if (this.f7314g) {
                return this.f7313f;
            }
            N0 n02 = this.f7313f;
            F1.a().c(n02).c(n02);
            this.f7314g = true;
            return this.f7313f;
        }

        /* renamed from: r */
        public final N0 s() {
            N0 n02 = (N0) c();
            if (n02.t()) {
                return n02;
            }
            throw new C0490b2(n02);
        }
    }

    public static class c extends C0560y0 {
    }

    /* 'enum' modifier removed */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final int f7315a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f7316b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f7317c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f7318d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f7319e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f7320f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f7321g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ int[] f7322h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f7322h.clone();
        }
    }

    public static N0 l(Class cls) {
        N0 n02 = zzd.get(cls);
        if (n02 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                n02 = zzd.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (n02 == null) {
            n02 = (N0) ((N0) h2.c(cls)).n(d.f7320f, (Object) null, (Object) null);
            if (n02 != null) {
                zzd.put(cls, n02);
            } else {
                throw new IllegalStateException();
            }
        }
        return n02;
    }

    public static X0 m(X0 x02) {
        int size = x02.size();
        return x02.b(size == 0 ? 10 : size << 1);
    }

    public static Object o(C0546t1 t1Var, String str, Object[] objArr) {
        return new I1(t1Var, str, objArr);
    }

    public static Object p(Method method, Object obj, Object... objArr) {
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

    public static void q(Class cls, N0 n02) {
        zzd.put(cls, n02);
    }

    public static final boolean r(N0 n02, boolean z4) {
        byte byteValue = ((Byte) n02.n(d.f7315a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d4 = F1.a().c(n02).d(n02);
        if (z4) {
            n02.n(d.f7316b, d4 ? n02 : null, (Object) null);
        }
        return d4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.P0, com.google.android.gms.internal.vision.V0] */
    public static V0 u() {
        return P0.v();
    }

    public static X0 v() {
        return J1.v();
    }

    public final /* synthetic */ C0555w1 a() {
        b bVar = (b) n(d.f7319e, (Object) null, (Object) null);
        bVar.k(this);
        return bVar;
    }

    public final void b(C0551v0 v0Var) {
        F1.a().c(this).h(this, C0557x0.P(v0Var));
    }

    public final /* synthetic */ C0555w1 e() {
        return (b) n(d.f7319e, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return F1.a().c(this).e(this, (N0) obj);
        }
        return false;
    }

    public final int g() {
        if (this.zzc == -1) {
            this.zzc = F1.a().c(this).g(this);
        }
        return this.zzc;
    }

    public final /* synthetic */ C0546t1 h() {
        return (N0) n(d.f7320f, (Object) null, (Object) null);
    }

    public int hashCode() {
        int i4 = this.zza;
        if (i4 != 0) {
            return i4;
        }
        int b4 = F1.a().c(this).b(this);
        this.zza = b4;
        return b4;
    }

    public final void i(int i4) {
        this.zzc = i4;
    }

    public final int k() {
        return this.zzc;
    }

    public abstract Object n(int i4, Object obj, Object obj2);

    public final b s() {
        return (b) n(d.f7319e, (Object) null, (Object) null);
    }

    public final boolean t() {
        return r(this, true);
    }

    public String toString() {
        return C0561y1.a(this, super.toString());
    }
}
