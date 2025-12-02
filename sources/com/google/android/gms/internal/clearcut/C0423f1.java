package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.clearcut.f1  reason: case insensitive filesystem */
public abstract class C0423f1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7071a = Logger.getLogger(C0423f1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final Unsafe f7072b;

    /* renamed from: c  reason: collision with root package name */
    public static final Class f7073c = C0462t.c();

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7074d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f7075e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f7076f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f7077g = B();

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f7078h = A();

    /* renamed from: i  reason: collision with root package name */
    public static final long f7079i = ((long) E(byte[].class));

    /* renamed from: j  reason: collision with root package name */
    public static final long f7080j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f7081k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f7082l;

    /* renamed from: m  reason: collision with root package name */
    public static final long f7083m;

    /* renamed from: n  reason: collision with root package name */
    public static final long f7084n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f7085o;

    /* renamed from: p  reason: collision with root package name */
    public static final long f7086p;

    /* renamed from: q  reason: collision with root package name */
    public static final long f7087q;

    /* renamed from: r  reason: collision with root package name */
    public static final long f7088r;

    /* renamed from: s  reason: collision with root package name */
    public static final long f7089s;

    /* renamed from: t  reason: collision with root package name */
    public static final long f7090t;

    /* renamed from: u  reason: collision with root package name */
    public static final long f7091u;

    /* renamed from: v  reason: collision with root package name */
    public static final long f7092v = n(C());

    /* renamed from: w  reason: collision with root package name */
    public static final long f7093w;

    /* renamed from: x  reason: collision with root package name */
    public static final boolean f7094x = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.clearcut.f1$a */
    public static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        public final void b(long j4, byte b4) {
            Memory.pokeByte((int) j4, b4);
        }

        public final void c(Object obj, long j4, double d4) {
            f(obj, j4, Double.doubleToLongBits(d4));
        }

        public final void d(Object obj, long j4, float f4) {
            e(obj, j4, Float.floatToIntBits(f4));
        }

        public final void g(Object obj, long j4, boolean z4) {
            if (C0423f1.f7094x) {
                C0423f1.r(obj, j4, z4);
            } else {
                C0423f1.t(obj, j4, z4);
            }
        }

        public final void h(byte[] bArr, long j4, long j5, long j6) {
            Memory.pokeByteArray((int) j5, bArr, (int) j4, (int) j6);
        }

        public final void i(Object obj, long j4, byte b4) {
            if (C0423f1.f7094x) {
                C0423f1.d(obj, j4, b4);
            } else {
                C0423f1.q(obj, j4, b4);
            }
        }

        public final boolean l(Object obj, long j4) {
            return C0423f1.f7094x ? C0423f1.P(obj, j4) : C0423f1.Q(obj, j4);
        }

        public final float m(Object obj, long j4) {
            return Float.intBitsToFloat(j(obj, j4));
        }

        public final double n(Object obj, long j4) {
            return Double.longBitsToDouble(k(obj, j4));
        }

        public final byte o(Object obj, long j4) {
            return C0423f1.f7094x ? C0423f1.N(obj, j4) : C0423f1.O(obj, j4);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f1$b */
    public static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public final void b(long j4, byte b4) {
            Memory.pokeByte(j4, b4);
        }

        public final void c(Object obj, long j4, double d4) {
            f(obj, j4, Double.doubleToLongBits(d4));
        }

        public final void d(Object obj, long j4, float f4) {
            e(obj, j4, Float.floatToIntBits(f4));
        }

        public final void g(Object obj, long j4, boolean z4) {
            if (C0423f1.f7094x) {
                C0423f1.r(obj, j4, z4);
            } else {
                C0423f1.t(obj, j4, z4);
            }
        }

        public final void h(byte[] bArr, long j4, long j5, long j6) {
            Memory.pokeByteArray(j5, bArr, (int) j4, (int) j6);
        }

        public final void i(Object obj, long j4, byte b4) {
            if (C0423f1.f7094x) {
                C0423f1.d(obj, j4, b4);
            } else {
                C0423f1.q(obj, j4, b4);
            }
        }

        public final boolean l(Object obj, long j4) {
            return C0423f1.f7094x ? C0423f1.P(obj, j4) : C0423f1.Q(obj, j4);
        }

        public final float m(Object obj, long j4) {
            return Float.intBitsToFloat(j(obj, j4));
        }

        public final double n(Object obj, long j4) {
            return Double.longBitsToDouble(k(obj, j4));
        }

        public final byte o(Object obj, long j4) {
            return C0423f1.f7094x ? C0423f1.N(obj, j4) : C0423f1.O(obj, j4);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f1$c */
    public static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        public final void b(long j4, byte b4) {
            this.f7095a.putByte(j4, b4);
        }

        public final void c(Object obj, long j4, double d4) {
            this.f7095a.putDouble(obj, j4, d4);
        }

        public final void d(Object obj, long j4, float f4) {
            this.f7095a.putFloat(obj, j4, f4);
        }

        public final void g(Object obj, long j4, boolean z4) {
            this.f7095a.putBoolean(obj, j4, z4);
        }

        public final void h(byte[] bArr, long j4, long j5, long j6) {
            this.f7095a.copyMemory(bArr, C0423f1.f7079i + j4, (Object) null, j5, j6);
        }

        public final void i(Object obj, long j4, byte b4) {
            this.f7095a.putByte(obj, j4, b4);
        }

        public final boolean l(Object obj, long j4) {
            return this.f7095a.getBoolean(obj, j4);
        }

        public final float m(Object obj, long j4) {
            return this.f7095a.getFloat(obj, j4);
        }

        public final double n(Object obj, long j4) {
            return this.f7095a.getDouble(obj, j4);
        }

        public final byte o(Object obj, long j4) {
            return this.f7095a.getByte(obj, j4);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f1$d */
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public Unsafe f7095a;

        public d(Unsafe unsafe) {
            this.f7095a = unsafe;
        }

        public final long a(Field field) {
            return this.f7095a.objectFieldOffset(field);
        }

        public abstract void b(long j4, byte b4);

        public abstract void c(Object obj, long j4, double d4);

        public abstract void d(Object obj, long j4, float f4);

        public final void e(Object obj, long j4, int i4) {
            this.f7095a.putInt(obj, j4, i4);
        }

        public final void f(Object obj, long j4, long j5) {
            this.f7095a.putLong(obj, j4, j5);
        }

        public abstract void g(Object obj, long j4, boolean z4);

        public abstract void h(byte[] bArr, long j4, long j5, long j6);

        public abstract void i(Object obj, long j4, byte b4);

        public final int j(Object obj, long j4) {
            return this.f7095a.getInt(obj, j4);
        }

        public final long k(Object obj, long j4) {
            return this.f7095a.getLong(obj, j4);
        }

        public abstract boolean l(Object obj, long j4);

        public abstract float m(Object obj, long j4);

        public abstract double n(Object obj, long j4);

        public abstract byte o(Object obj, long j4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ec  */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.clearcut.f1> r0 = com.google.android.gms.internal.clearcut.C0423f1.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f7071a = r0
            sun.misc.Unsafe r0 = z()
            f7072b = r0
            java.lang.Class r1 = com.google.android.gms.internal.clearcut.C0462t.c()
            f7073c = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = G(r1)
            f7074d = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = G(r2)
            f7075e = r2
            r3 = 0
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r1 = r3
            goto L_0x0048
        L_0x002d:
            boolean r4 = com.google.android.gms.internal.clearcut.C0462t.b()
            if (r4 == 0) goto L_0x0043
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.internal.clearcut.f1$b r1 = new com.google.android.gms.internal.clearcut.f1$b
            r1.<init>(r0)
            goto L_0x0048
        L_0x003b:
            if (r2 == 0) goto L_0x002b
            com.google.android.gms.internal.clearcut.f1$a r1 = new com.google.android.gms.internal.clearcut.f1$a
            r1.<init>(r0)
            goto L_0x0048
        L_0x0043:
            com.google.android.gms.internal.clearcut.f1$c r1 = new com.google.android.gms.internal.clearcut.f1$c
            r1.<init>(r0)
        L_0x0048:
            f7076f = r1
            boolean r0 = B()
            f7077g = r0
            boolean r0 = A()
            f7078h = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = E(r0)
            long r0 = (long) r0
            f7079i = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            int r1 = E(r0)
            long r1 = (long) r1
            f7080j = r1
            int r0 = F(r0)
            long r0 = (long) r0
            f7081k = r0
            java.lang.Class<int[]> r0 = int[].class
            int r1 = E(r0)
            long r1 = (long) r1
            f7082l = r1
            int r0 = F(r0)
            long r0 = (long) r0
            f7083m = r0
            java.lang.Class<long[]> r0 = long[].class
            int r1 = E(r0)
            long r1 = (long) r1
            f7084n = r1
            int r0 = F(r0)
            long r0 = (long) r0
            f7085o = r0
            java.lang.Class<float[]> r0 = float[].class
            int r1 = E(r0)
            long r1 = (long) r1
            f7086p = r1
            int r0 = F(r0)
            long r0 = (long) r0
            f7087q = r0
            java.lang.Class<double[]> r0 = double[].class
            int r1 = E(r0)
            long r1 = (long) r1
            f7088r = r1
            int r0 = F(r0)
            long r0 = (long) r0
            f7089s = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r1 = E(r0)
            long r1 = (long) r1
            f7090t = r1
            int r0 = F(r0)
            long r0 = (long) r0
            f7091u = r0
            java.lang.reflect.Field r0 = C()
            long r0 = n(r0)
            f7092v = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "value"
            java.lang.reflect.Field r0 = p(r0, r1)
            if (r0 == 0) goto L_0x00dc
            java.lang.Class r1 = r0.getType()
            java.lang.Class<char[]> r2 = char[].class
            if (r1 != r2) goto L_0x00dc
            r3 = r0
        L_0x00dc:
            long r0 = n(r3)
            f7093w = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            f7094x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C0423f1.<clinit>():void");
    }

    public static boolean A() {
        Class<Class> cls = Class.class;
        Class<Object> cls2 = Object.class;
        Unsafe unsafe = f7072b;
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
            if (C0462t.b()) {
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
            Logger logger = f7071a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    public static boolean B() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f7072b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (C() == null) {
                return false;
            }
            if (C0462t.b()) {
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
            Logger logger = f7071a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    public static Field C() {
        Field p4;
        Class<Buffer> cls = Buffer.class;
        if (C0462t.b() && (p4 = p(cls, "effectiveDirectAddress")) != null) {
            return p4;
        }
        Field p5 = p(cls, "address");
        if (p5 == null || p5.getType() != Long.TYPE) {
            return null;
        }
        return p5;
    }

    public static int E(Class cls) {
        if (f7078h) {
            return f7076f.f7095a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int F(Class cls) {
        if (f7078h) {
            return f7076f.f7095a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static boolean G(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C0462t.b()) {
            return false;
        }
        try {
            Class cls3 = f7073c;
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

    public static int H(Object obj, long j4) {
        return f7076f.j(obj, j4);
    }

    public static long I(Object obj, long j4) {
        return f7076f.k(obj, j4);
    }

    public static boolean J(Object obj, long j4) {
        return f7076f.l(obj, j4);
    }

    public static float K(Object obj, long j4) {
        return f7076f.m(obj, j4);
    }

    public static double L(Object obj, long j4) {
        return f7076f.n(obj, j4);
    }

    public static Object M(Object obj, long j4) {
        return f7076f.f7095a.getObject(obj, j4);
    }

    public static byte N(Object obj, long j4) {
        return (byte) (H(obj, -4 & j4) >>> ((int) (((~j4) & 3) << 3)));
    }

    public static byte O(Object obj, long j4) {
        return (byte) (H(obj, -4 & j4) >>> ((int) ((j4 & 3) << 3)));
    }

    public static boolean P(Object obj, long j4) {
        return N(obj, j4) != 0;
    }

    public static boolean Q(Object obj, long j4) {
        return O(obj, j4) != 0;
    }

    public static byte a(byte[] bArr, long j4) {
        return f7076f.o(bArr, f7079i + j4);
    }

    public static long b(Field field) {
        return f7076f.a(field);
    }

    public static void c(long j4, byte b4) {
        f7076f.b(j4, b4);
    }

    public static void d(Object obj, long j4, byte b4) {
        long j5 = -4 & j4;
        int H4 = H(obj, j5);
        int i4 = ((~((int) j4)) & 3) << 3;
        g(obj, j5, ((255 & b4) << i4) | (H4 & (~(255 << i4))));
    }

    public static void e(Object obj, long j4, double d4) {
        f7076f.c(obj, j4, d4);
    }

    public static void f(Object obj, long j4, float f4) {
        f7076f.d(obj, j4, f4);
    }

    public static void g(Object obj, long j4, int i4) {
        f7076f.e(obj, j4, i4);
    }

    public static void h(Object obj, long j4, long j5) {
        f7076f.f(obj, j4, j5);
    }

    public static void i(Object obj, long j4, Object obj2) {
        f7076f.f7095a.putObject(obj, j4, obj2);
    }

    public static void j(Object obj, long j4, boolean z4) {
        f7076f.g(obj, j4, z4);
    }

    public static void k(byte[] bArr, long j4, byte b4) {
        f7076f.i(bArr, f7079i + j4, b4);
    }

    public static void l(byte[] bArr, long j4, long j5, long j6) {
        f7076f.h(bArr, j4, j5, j6);
    }

    public static long n(Field field) {
        d dVar;
        if (field == null || (dVar = f7076f) == null) {
            return -1;
        }
        return dVar.a(field);
    }

    public static long o(ByteBuffer byteBuffer) {
        return f7076f.k(byteBuffer, f7092v);
    }

    public static Field p(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void q(Object obj, long j4, byte b4) {
        long j5 = -4 & j4;
        int i4 = (((int) j4) & 3) << 3;
        g(obj, j5, ((255 & b4) << i4) | (H(obj, j5) & (~(255 << i4))));
    }

    public static void r(Object obj, long j4, boolean z4) {
        d(obj, j4, z4 ? (byte) 1 : 0);
    }

    public static void t(Object obj, long j4, boolean z4) {
        q(obj, j4, z4 ? (byte) 1 : 0);
    }

    public static boolean x() {
        return f7078h;
    }

    public static boolean y() {
        return f7077g;
    }

    public static Unsafe z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C0426g1());
        } catch (Throwable unused) {
            return null;
        }
    }
}
