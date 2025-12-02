package com.google.android.gms.internal.vision;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class h2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f7452a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f7453b = Z.c();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f7454c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7455d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f7456e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f7457f = E();

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f7458g = A();

    /* renamed from: h  reason: collision with root package name */
    public static final long f7459h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f7460i;

    /* renamed from: j  reason: collision with root package name */
    public static final long f7461j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f7462k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f7463l;

    /* renamed from: m  reason: collision with root package name */
    public static final long f7464m;

    /* renamed from: n  reason: collision with root package name */
    public static final long f7465n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f7466o;

    /* renamed from: p  reason: collision with root package name */
    public static final long f7467p;

    /* renamed from: q  reason: collision with root package name */
    public static final long f7468q;

    /* renamed from: r  reason: collision with root package name */
    public static final long f7469r;

    /* renamed from: s  reason: collision with root package name */
    public static final long f7470s;

    /* renamed from: t  reason: collision with root package name */
    public static final long f7471t;

    /* renamed from: u  reason: collision with root package name */
    public static final long f7472u;

    /* renamed from: v  reason: collision with root package name */
    public static final int f7473v;

    /* renamed from: w  reason: collision with root package name */
    public static final boolean f7474w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    public static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j4) {
            return h2.f7474w ? h2.L(obj, j4) : h2.M(obj, j4);
        }

        public final void b(Object obj, long j4, byte b4) {
            if (h2.f7474w) {
                h2.u(obj, j4, b4);
            } else {
                h2.y(obj, j4, b4);
            }
        }

        public final void c(Object obj, long j4, double d4) {
            f(obj, j4, Double.doubleToLongBits(d4));
        }

        public final void d(Object obj, long j4, float f4) {
            e(obj, j4, Float.floatToIntBits(f4));
        }

        public final void g(Object obj, long j4, boolean z4) {
            if (h2.f7474w) {
                h2.z(obj, j4, z4);
            } else {
                h2.D(obj, j4, z4);
            }
        }

        public final boolean h(Object obj, long j4) {
            return h2.f7474w ? h2.N(obj, j4) : h2.O(obj, j4);
        }

        public final float i(Object obj, long j4) {
            return Float.intBitsToFloat(k(obj, j4));
        }

        public final double j(Object obj, long j4) {
            return Double.longBitsToDouble(l(obj, j4));
        }
    }

    public static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j4) {
            return this.f7475a.getByte(obj, j4);
        }

        public final void b(Object obj, long j4, byte b4) {
            this.f7475a.putByte(obj, j4, b4);
        }

        public final void c(Object obj, long j4, double d4) {
            this.f7475a.putDouble(obj, j4, d4);
        }

        public final void d(Object obj, long j4, float f4) {
            this.f7475a.putFloat(obj, j4, f4);
        }

        public final void g(Object obj, long j4, boolean z4) {
            this.f7475a.putBoolean(obj, j4, z4);
        }

        public final boolean h(Object obj, long j4) {
            return this.f7475a.getBoolean(obj, j4);
        }

        public final float i(Object obj, long j4) {
            return this.f7475a.getFloat(obj, j4);
        }

        public final double j(Object obj, long j4) {
            return this.f7475a.getDouble(obj, j4);
        }
    }

    public static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j4) {
            return h2.f7474w ? h2.L(obj, j4) : h2.M(obj, j4);
        }

        public final void b(Object obj, long j4, byte b4) {
            if (h2.f7474w) {
                h2.u(obj, j4, b4);
            } else {
                h2.y(obj, j4, b4);
            }
        }

        public final void c(Object obj, long j4, double d4) {
            f(obj, j4, Double.doubleToLongBits(d4));
        }

        public final void d(Object obj, long j4, float f4) {
            e(obj, j4, Float.floatToIntBits(f4));
        }

        public final void g(Object obj, long j4, boolean z4) {
            if (h2.f7474w) {
                h2.z(obj, j4, z4);
            } else {
                h2.D(obj, j4, z4);
            }
        }

        public final boolean h(Object obj, long j4) {
            return h2.f7474w ? h2.N(obj, j4) : h2.O(obj, j4);
        }

        public final float i(Object obj, long j4) {
            return Float.intBitsToFloat(k(obj, j4));
        }

        public final double j(Object obj, long j4) {
            return Double.longBitsToDouble(l(obj, j4));
        }
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public Unsafe f7475a;

        public d(Unsafe unsafe) {
            this.f7475a = unsafe;
        }

        public abstract byte a(Object obj, long j4);

        public abstract void b(Object obj, long j4, byte b4);

        public abstract void c(Object obj, long j4, double d4);

        public abstract void d(Object obj, long j4, float f4);

        public final void e(Object obj, long j4, int i4) {
            this.f7475a.putInt(obj, j4, i4);
        }

        public final void f(Object obj, long j4, long j5) {
            this.f7475a.putLong(obj, j4, j5);
        }

        public abstract void g(Object obj, long j4, boolean z4);

        public abstract boolean h(Object obj, long j4);

        public abstract float i(Object obj, long j4);

        public abstract double j(Object obj, long j4);

        public final int k(Object obj, long j4) {
            return this.f7475a.getInt(obj, j4);
        }

        public final long l(Object obj, long j4) {
            return this.f7475a.getLong(obj, j4);
        }
    }

    static {
        Unsafe t4 = t();
        f7452a = t4;
        boolean B4 = B(Long.TYPE);
        f7454c = B4;
        boolean B5 = B(Integer.TYPE);
        f7455d = B5;
        d dVar = null;
        if (t4 != null) {
            if (!Z.b()) {
                dVar = new b(t4);
            } else if (B4) {
                dVar = new c(t4);
            } else if (B5) {
                dVar = new a(t4);
            }
        }
        f7456e = dVar;
        long n4 = (long) n(byte[].class);
        f7459h = n4;
        Class<boolean[]> cls = boolean[].class;
        f7460i = (long) n(cls);
        f7461j = (long) s(cls);
        Class<int[]> cls2 = int[].class;
        f7462k = (long) n(cls2);
        f7463l = (long) s(cls2);
        Class<long[]> cls3 = long[].class;
        f7464m = (long) n(cls3);
        f7465n = (long) s(cls3);
        Class<float[]> cls4 = float[].class;
        f7466o = (long) n(cls4);
        f7467p = (long) s(cls4);
        Class<double[]> cls5 = double[].class;
        f7468q = (long) n(cls5);
        f7469r = (long) s(cls5);
        Class<Object[]> cls6 = Object[].class;
        f7470s = (long) n(cls6);
        f7471t = (long) s(cls6);
        Field G4 = G();
        f7472u = (G4 == null || dVar == null) ? -1 : dVar.f7475a.objectFieldOffset(G4);
        f7473v = (int) (n4 & 7);
    }

    public static boolean A() {
        Class<Class> cls = Class.class;
        Class<Object> cls2 = Object.class;
        Unsafe unsafe = f7452a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls3 = unsafe.getClass();
            cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls3.getMethod("arrayBaseOffset", new Class[]{cls});
            cls3.getMethod("arrayIndexScale", new Class[]{cls});
            Class cls4 = Long.TYPE;
            cls3.getMethod("getInt", new Class[]{cls2, cls4});
            cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
            cls3.getMethod("getLong", new Class[]{cls2, cls4});
            cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
            cls3.getMethod("getObject", new Class[]{cls2, cls4});
            cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
            if (Z.b()) {
                return true;
            }
            cls3.getMethod("getByte", new Class[]{cls2, cls4});
            cls3.getMethod("putByte", new Class[]{cls2, cls4, Byte.TYPE});
            cls3.getMethod("getBoolean", new Class[]{cls2, cls4});
            cls3.getMethod("putBoolean", new Class[]{cls2, cls4, Boolean.TYPE});
            cls3.getMethod("getFloat", new Class[]{cls2, cls4});
            cls3.getMethod("putFloat", new Class[]{cls2, cls4, Float.TYPE});
            cls3.getMethod("getDouble", new Class[]{cls2, cls4});
            cls3.getMethod("putDouble", new Class[]{cls2, cls4, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(h2.class.getName());
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    public static boolean B(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!Z.b()) {
            return false;
        }
        try {
            Class cls3 = f7453b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static double C(Object obj, long j4) {
        return f7456e.j(obj, j4);
    }

    public static void D(Object obj, long j4, boolean z4) {
        y(obj, j4, z4 ? (byte) 1 : 0);
    }

    public static boolean E() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f7452a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (G() == null) {
                return false;
            }
            if (Z.b()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(h2.class.getName());
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    public static Object F(Object obj, long j4) {
        return f7456e.f7475a.getObject(obj, j4);
    }

    public static Field G() {
        Field d4;
        Class<Buffer> cls = Buffer.class;
        if (Z.b() && (d4 = d(cls, "effectiveDirectAddress")) != null) {
            return d4;
        }
        Field d5 = d(cls, "address");
        if (d5 == null || d5.getType() != Long.TYPE) {
            return null;
        }
        return d5;
    }

    public static byte L(Object obj, long j4) {
        return (byte) (b(obj, -4 & j4) >>> ((int) (((~j4) & 3) << 3)));
    }

    public static byte M(Object obj, long j4) {
        return (byte) (b(obj, -4 & j4) >>> ((int) ((j4 & 3) << 3)));
    }

    public static boolean N(Object obj, long j4) {
        return L(obj, j4) != 0;
    }

    public static boolean O(Object obj, long j4) {
        return M(obj, j4) != 0;
    }

    public static byte a(byte[] bArr, long j4) {
        return f7456e.a(bArr, f7459h + j4);
    }

    public static int b(Object obj, long j4) {
        return f7456e.k(obj, j4);
    }

    public static Object c(Class cls) {
        try {
            return f7452a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static Field d(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void f(Object obj, long j4, double d4) {
        f7456e.c(obj, j4, d4);
    }

    public static void g(Object obj, long j4, float f4) {
        f7456e.d(obj, j4, f4);
    }

    public static void h(Object obj, long j4, int i4) {
        f7456e.e(obj, j4, i4);
    }

    public static void i(Object obj, long j4, long j5) {
        f7456e.f(obj, j4, j5);
    }

    public static void j(Object obj, long j4, Object obj2) {
        f7456e.f7475a.putObject(obj, j4, obj2);
    }

    public static void k(Object obj, long j4, boolean z4) {
        f7456e.g(obj, j4, z4);
    }

    public static void l(byte[] bArr, long j4, byte b4) {
        f7456e.b(bArr, f7459h + j4, b4);
    }

    public static boolean m() {
        return f7458g;
    }

    public static int n(Class cls) {
        if (f7458g) {
            return f7456e.f7475a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static long o(Object obj, long j4) {
        return f7456e.l(obj, j4);
    }

    public static boolean r() {
        return f7457f;
    }

    public static int s(Class cls) {
        if (f7458g) {
            return f7456e.f7475a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void u(Object obj, long j4, byte b4) {
        long j5 = -4 & j4;
        int b5 = b(obj, j5);
        int i4 = ((~((int) j4)) & 3) << 3;
        h(obj, j5, ((255 & b4) << i4) | (b5 & (~(255 << i4))));
    }

    public static boolean w(Object obj, long j4) {
        return f7456e.h(obj, j4);
    }

    public static float x(Object obj, long j4) {
        return f7456e.i(obj, j4);
    }

    public static void y(Object obj, long j4, byte b4) {
        long j5 = -4 & j4;
        int i4 = (((int) j4) & 3) << 3;
        h(obj, j5, ((255 & b4) << i4) | (b(obj, j5) & (~(255 << i4))));
    }

    public static void z(Object obj, long j4, boolean z4) {
        u(obj, j4, z4 ? (byte) 1 : 0);
    }
}
