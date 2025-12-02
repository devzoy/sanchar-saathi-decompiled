package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f5178a = A();

    /* renamed from: b  reason: collision with root package name */
    public static final Class f5179b = C0352d.b();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f5180c = m(Long.TYPE);

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f5181d = m(Integer.TYPE);

    /* renamed from: e  reason: collision with root package name */
    public static final e f5182e = y();

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f5183f = Q();

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f5184g = P();

    /* renamed from: h  reason: collision with root package name */
    public static final long f5185h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f5186i;

    /* renamed from: j  reason: collision with root package name */
    public static final long f5187j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f5188k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f5189l;

    /* renamed from: m  reason: collision with root package name */
    public static final long f5190m;

    /* renamed from: n  reason: collision with root package name */
    public static final long f5191n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f5192o;

    /* renamed from: p  reason: collision with root package name */
    public static final long f5193p;

    /* renamed from: q  reason: collision with root package name */
    public static final long f5194q;

    /* renamed from: r  reason: collision with root package name */
    public static final long f5195r;

    /* renamed from: s  reason: collision with root package name */
    public static final long f5196s;

    /* renamed from: t  reason: collision with root package name */
    public static final long f5197t;

    /* renamed from: u  reason: collision with root package name */
    public static final long f5198u = o(l());

    /* renamed from: v  reason: collision with root package name */
    public static final int f5199v;

    /* renamed from: w  reason: collision with root package name */
    public static final boolean f5200w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    public class a implements PrivilegedExceptionAction {
        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j4) {
            return p0.f5200w ? p0.q(obj, j4) : p0.r(obj, j4);
        }

        public double d(Object obj, long j4) {
            return Double.longBitsToDouble(g(obj, j4));
        }

        public float e(Object obj, long j4) {
            return Float.intBitsToFloat(f(obj, j4));
        }

        public void j(Object obj, long j4, boolean z4) {
            if (p0.f5200w) {
                p0.F(obj, j4, z4);
            } else {
                p0.G(obj, j4, z4);
            }
        }

        public void k(Object obj, long j4, byte b4) {
            if (p0.f5200w) {
                p0.I(obj, j4, b4);
            } else {
                p0.J(obj, j4, b4);
            }
        }

        public void l(Object obj, long j4, double d4) {
            o(obj, j4, Double.doubleToLongBits(d4));
        }

        public void m(Object obj, long j4, float f4) {
            n(obj, j4, Float.floatToIntBits(f4));
        }

        public boolean r() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j4) {
            return p0.f5200w ? p0.q(obj, j4) : p0.r(obj, j4);
        }

        public double d(Object obj, long j4) {
            return Double.longBitsToDouble(g(obj, j4));
        }

        public float e(Object obj, long j4) {
            return Float.intBitsToFloat(f(obj, j4));
        }

        public void j(Object obj, long j4, boolean z4) {
            if (p0.f5200w) {
                p0.F(obj, j4, z4);
            } else {
                p0.G(obj, j4, z4);
            }
        }

        public void k(Object obj, long j4, byte b4) {
            if (p0.f5200w) {
                p0.I(obj, j4, b4);
            } else {
                p0.J(obj, j4, b4);
            }
        }

        public void l(Object obj, long j4, double d4) {
            o(obj, j4, Double.doubleToLongBits(d4));
        }

        public void m(Object obj, long j4, float f4) {
            n(obj, j4, Float.floatToIntBits(f4));
        }

        public boolean r() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j4) {
            return this.f5201a.getBoolean(obj, j4);
        }

        public double d(Object obj, long j4) {
            return this.f5201a.getDouble(obj, j4);
        }

        public float e(Object obj, long j4) {
            return this.f5201a.getFloat(obj, j4);
        }

        public void j(Object obj, long j4, boolean z4) {
            this.f5201a.putBoolean(obj, j4, z4);
        }

        public void k(Object obj, long j4, byte b4) {
            this.f5201a.putByte(obj, j4, b4);
        }

        public void l(Object obj, long j4, double d4) {
            this.f5201a.putDouble(obj, j4, d4);
        }

        public void m(Object obj, long j4, float f4) {
            this.f5201a.putFloat(obj, j4, f4);
        }

        public boolean q() {
            Class<Object> cls = Object.class;
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f5201a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th) {
                p0.D(th);
                return false;
            }
        }

        public boolean r() {
            Class<Object> cls = Object.class;
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f5201a.getClass();
                Class cls3 = Long.TYPE;
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
                p0.D(th);
                return false;
            }
        }
    }

    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public Unsafe f5201a;

        public e(Unsafe unsafe) {
            this.f5201a = unsafe;
        }

        public final int a(Class cls) {
            return this.f5201a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f5201a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j4);

        public abstract double d(Object obj, long j4);

        public abstract float e(Object obj, long j4);

        public final int f(Object obj, long j4) {
            return this.f5201a.getInt(obj, j4);
        }

        public final long g(Object obj, long j4) {
            return this.f5201a.getLong(obj, j4);
        }

        public final Object h(Object obj, long j4) {
            return this.f5201a.getObject(obj, j4);
        }

        public final long i(Field field) {
            return this.f5201a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j4, boolean z4);

        public abstract void k(Object obj, long j4, byte b4);

        public abstract void l(Object obj, long j4, double d4);

        public abstract void m(Object obj, long j4, float f4);

        public final void n(Object obj, long j4, int i4) {
            this.f5201a.putInt(obj, j4, i4);
        }

        public final void o(Object obj, long j4, long j5) {
            this.f5201a.putLong(obj, j4, j5);
        }

        public final void p(Object obj, long j4, Object obj2) {
            this.f5201a.putObject(obj, j4, obj2);
        }

        public boolean q() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f5201a;
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
                return true;
            } catch (Throwable th) {
                p0.D(th);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f5201a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                return p0.l() != null;
            } catch (Throwable th) {
                p0.D(th);
                return false;
            }
        }
    }

    static {
        long j4 = (long) j(byte[].class);
        f5185h = j4;
        Class<boolean[]> cls = boolean[].class;
        f5186i = (long) j(cls);
        f5187j = (long) k(cls);
        Class<int[]> cls2 = int[].class;
        f5188k = (long) j(cls2);
        f5189l = (long) k(cls2);
        Class<long[]> cls3 = long[].class;
        f5190m = (long) j(cls3);
        f5191n = (long) k(cls3);
        Class<float[]> cls4 = float[].class;
        f5192o = (long) j(cls4);
        f5193p = (long) k(cls4);
        Class<double[]> cls5 = double[].class;
        f5194q = (long) j(cls5);
        f5195r = (long) k(cls5);
        Class<Object[]> cls6 = Object[].class;
        f5196s = (long) j(cls6);
        f5197t = (long) k(cls6);
        f5199v = (int) (j4 & 7);
    }

    public static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean B() {
        return f5184g;
    }

    public static boolean C() {
        return f5183f;
    }

    public static void D(Throwable th) {
        Logger logger = Logger.getLogger(p0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void E(Object obj, long j4, boolean z4) {
        f5182e.j(obj, j4, z4);
    }

    public static void F(Object obj, long j4, boolean z4) {
        I(obj, j4, z4 ? (byte) 1 : 0);
    }

    public static void G(Object obj, long j4, boolean z4) {
        J(obj, j4, z4 ? (byte) 1 : 0);
    }

    public static void H(byte[] bArr, long j4, byte b4) {
        f5182e.k(bArr, f5185h + j4, b4);
    }

    public static void I(Object obj, long j4, byte b4) {
        long j5 = -4 & j4;
        int w4 = w(obj, j5);
        int i4 = ((~((int) j4)) & 3) << 3;
        M(obj, j5, ((255 & b4) << i4) | (w4 & (~(255 << i4))));
    }

    public static void J(Object obj, long j4, byte b4) {
        long j5 = -4 & j4;
        int i4 = (((int) j4) & 3) << 3;
        M(obj, j5, ((255 & b4) << i4) | (w(obj, j5) & (~(255 << i4))));
    }

    public static void K(Object obj, long j4, double d4) {
        f5182e.l(obj, j4, d4);
    }

    public static void L(Object obj, long j4, float f4) {
        f5182e.m(obj, j4, f4);
    }

    public static void M(Object obj, long j4, int i4) {
        f5182e.n(obj, j4, i4);
    }

    public static void N(Object obj, long j4, long j5) {
        f5182e.o(obj, j4, j5);
    }

    public static void O(Object obj, long j4, Object obj2) {
        f5182e.p(obj, j4, obj2);
    }

    public static boolean P() {
        e eVar = f5182e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    public static boolean Q() {
        e eVar = f5182e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    public static Object i(Class cls) {
        try {
            return f5178a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int j(Class cls) {
        if (f5184g) {
            return f5182e.a(cls);
        }
        return -1;
    }

    public static int k(Class cls) {
        if (f5184g) {
            return f5182e.b(cls);
        }
        return -1;
    }

    public static Field l() {
        Field n4;
        Class<Buffer> cls = Buffer.class;
        if (C0352d.c() && (n4 = n(cls, "effectiveDirectAddress")) != null) {
            return n4;
        }
        Field n5 = n(cls, "address");
        if (n5 == null || n5.getType() != Long.TYPE) {
            return null;
        }
        return n5;
    }

    public static boolean m(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C0352d.c()) {
            return false;
        }
        try {
            Class cls3 = f5179b;
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

    public static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f5182e) == null) {
            return -1;
        }
        return eVar.i(field);
    }

    public static boolean p(Object obj, long j4) {
        return f5182e.c(obj, j4);
    }

    public static boolean q(Object obj, long j4) {
        return s(obj, j4) != 0;
    }

    public static boolean r(Object obj, long j4) {
        return t(obj, j4) != 0;
    }

    public static byte s(Object obj, long j4) {
        return (byte) ((w(obj, -4 & j4) >>> ((int) (((~j4) & 3) << 3))) & 255);
    }

    public static byte t(Object obj, long j4) {
        return (byte) ((w(obj, -4 & j4) >>> ((int) ((j4 & 3) << 3))) & 255);
    }

    public static double u(Object obj, long j4) {
        return f5182e.d(obj, j4);
    }

    public static float v(Object obj, long j4) {
        return f5182e.e(obj, j4);
    }

    public static int w(Object obj, long j4) {
        return f5182e.f(obj, j4);
    }

    public static long x(Object obj, long j4) {
        return f5182e.g(obj, j4);
    }

    public static e y() {
        Unsafe unsafe = f5178a;
        if (unsafe == null) {
            return null;
        }
        if (!C0352d.c()) {
            return new d(unsafe);
        }
        if (f5180c) {
            return new c(unsafe);
        }
        if (f5181d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object z(Object obj, long j4) {
        return f5182e.h(obj, j4);
    }
}
