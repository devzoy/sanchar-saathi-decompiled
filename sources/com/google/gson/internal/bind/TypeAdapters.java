package com.google.gson.internal.bind;

import D2.b;
import D2.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.s;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public abstract class TypeAdapters {

    /* renamed from: A  reason: collision with root package name */
    public static final TypeAdapter f8425A = new TypeAdapter() {
        /* renamed from: f */
        public BigInteger c(D2.a aVar) {
            if (aVar.F() == b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return new BigInteger(aVar.C());
            } catch (NumberFormatException e4) {
                throw new o((Throwable) e4);
            }
        }

        /* renamed from: g */
        public void e(c cVar, BigInteger bigInteger) {
            cVar.J(bigInteger);
        }
    };

    /* renamed from: B  reason: collision with root package name */
    public static final s f8426B;

    /* renamed from: C  reason: collision with root package name */
    public static final TypeAdapter f8427C;

    /* renamed from: D  reason: collision with root package name */
    public static final s f8428D;

    /* renamed from: E  reason: collision with root package name */
    public static final TypeAdapter f8429E;

    /* renamed from: F  reason: collision with root package name */
    public static final s f8430F;

    /* renamed from: G  reason: collision with root package name */
    public static final TypeAdapter f8431G;

    /* renamed from: H  reason: collision with root package name */
    public static final s f8432H;

    /* renamed from: I  reason: collision with root package name */
    public static final TypeAdapter f8433I;

    /* renamed from: J  reason: collision with root package name */
    public static final s f8434J;

    /* renamed from: K  reason: collision with root package name */
    public static final TypeAdapter f8435K;

    /* renamed from: L  reason: collision with root package name */
    public static final s f8436L;

    /* renamed from: M  reason: collision with root package name */
    public static final TypeAdapter f8437M;

    /* renamed from: N  reason: collision with root package name */
    public static final s f8438N;

    /* renamed from: O  reason: collision with root package name */
    public static final TypeAdapter f8439O;

    /* renamed from: P  reason: collision with root package name */
    public static final s f8440P;

    /* renamed from: Q  reason: collision with root package name */
    public static final TypeAdapter f8441Q;

    /* renamed from: R  reason: collision with root package name */
    public static final s f8442R;

    /* renamed from: S  reason: collision with root package name */
    public static final TypeAdapter f8443S;

    /* renamed from: T  reason: collision with root package name */
    public static final s f8444T;

    /* renamed from: U  reason: collision with root package name */
    public static final TypeAdapter f8445U;

    /* renamed from: V  reason: collision with root package name */
    public static final s f8446V;

    /* renamed from: W  reason: collision with root package name */
    public static final s f8447W = new s() {
        public TypeAdapter create(Gson gson, C2.a aVar) {
            Class<? super Enum> c4 = aVar.c();
            Class<Enum> cls = Enum.class;
            if (!cls.isAssignableFrom(c4) || c4 == cls) {
                return null;
            }
            if (!c4.isEnum()) {
                c4 = c4.getSuperclass();
            }
            return new EnumTypeAdapter(c4);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final TypeAdapter f8448a;

    /* renamed from: b  reason: collision with root package name */
    public static final s f8449b;

    /* renamed from: c  reason: collision with root package name */
    public static final TypeAdapter f8450c;

    /* renamed from: d  reason: collision with root package name */
    public static final s f8451d;

    /* renamed from: e  reason: collision with root package name */
    public static final TypeAdapter f8452e;

    /* renamed from: f  reason: collision with root package name */
    public static final TypeAdapter f8453f = new TypeAdapter() {
        /* renamed from: f */
        public Boolean c(D2.a aVar) {
            if (aVar.F() != b.NULL) {
                return Boolean.valueOf(aVar.C());
            }
            aVar.z();
            return null;
        }

        /* renamed from: g */
        public void e(c cVar, Boolean bool) {
            cVar.K(bool == null ? "null" : bool.toString());
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public static final s f8454g;

    /* renamed from: h  reason: collision with root package name */
    public static final TypeAdapter f8455h;

    /* renamed from: i  reason: collision with root package name */
    public static final s f8456i;

    /* renamed from: j  reason: collision with root package name */
    public static final TypeAdapter f8457j;

    /* renamed from: k  reason: collision with root package name */
    public static final s f8458k;

    /* renamed from: l  reason: collision with root package name */
    public static final TypeAdapter f8459l;

    /* renamed from: m  reason: collision with root package name */
    public static final s f8460m;

    /* renamed from: n  reason: collision with root package name */
    public static final TypeAdapter f8461n;

    /* renamed from: o  reason: collision with root package name */
    public static final s f8462o;

    /* renamed from: p  reason: collision with root package name */
    public static final TypeAdapter f8463p;

    /* renamed from: q  reason: collision with root package name */
    public static final s f8464q;

    /* renamed from: r  reason: collision with root package name */
    public static final TypeAdapter f8465r;

    /* renamed from: s  reason: collision with root package name */
    public static final s f8466s;

    /* renamed from: t  reason: collision with root package name */
    public static final TypeAdapter f8467t = new TypeAdapter() {
        /* renamed from: f */
        public Number c(D2.a aVar) {
            if (aVar.F() == b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return Long.valueOf(aVar.w());
            } catch (NumberFormatException e4) {
                throw new o((Throwable) e4);
            }
        }

        /* renamed from: g */
        public void e(c cVar, Number number) {
            cVar.J(number);
        }
    };

    /* renamed from: u  reason: collision with root package name */
    public static final TypeAdapter f8468u = new TypeAdapter() {
        /* renamed from: f */
        public Number c(D2.a aVar) {
            if (aVar.F() != b.NULL) {
                return Float.valueOf((float) aVar.s());
            }
            aVar.z();
            return null;
        }

        /* renamed from: g */
        public void e(c cVar, Number number) {
            cVar.J(number);
        }
    };

    /* renamed from: v  reason: collision with root package name */
    public static final TypeAdapter f8469v = new TypeAdapter() {
        /* renamed from: f */
        public Number c(D2.a aVar) {
            if (aVar.F() != b.NULL) {
                return Double.valueOf(aVar.s());
            }
            aVar.z();
            return null;
        }

        /* renamed from: g */
        public void e(c cVar, Number number) {
            cVar.J(number);
        }
    };

    /* renamed from: w  reason: collision with root package name */
    public static final TypeAdapter f8470w;

    /* renamed from: x  reason: collision with root package name */
    public static final s f8471x;

    /* renamed from: y  reason: collision with root package name */
    public static final TypeAdapter f8472y;

    /* renamed from: z  reason: collision with root package name */
    public static final TypeAdapter f8473z = new TypeAdapter() {
        /* renamed from: f */
        public BigDecimal c(D2.a aVar) {
            if (aVar.F() == b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return new BigDecimal(aVar.C());
            } catch (NumberFormatException e4) {
                throw new o((Throwable) e4);
            }
        }

        /* renamed from: g */
        public void e(c cVar, BigDecimal bigDecimal) {
            cVar.J(bigDecimal);
        }
    };

    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final Map f8488a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map f8489b = new HashMap();

        public class a implements PrivilegedAction {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Field f8490a;

            public a(Field field) {
                this.f8490a = field;
            }

            /* renamed from: a */
            public Void run() {
                this.f8490a.setAccessible(true);
                return null;
            }
        }

        public EnumTypeAdapter(Class cls) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new a(field));
                        Enum enumR = (Enum) field.get((Object) null);
                        String name = enumR.name();
                        z2.c cVar = (z2.c) field.getAnnotation(z2.c.class);
                        if (cVar != null) {
                            name = cVar.value();
                            for (String put : cVar.alternate()) {
                                this.f8488a.put(put, enumR);
                            }
                        }
                        this.f8488a.put(name, enumR);
                        this.f8489b.put(enumR, name);
                    }
                }
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            }
        }

        /* renamed from: f */
        public Enum c(D2.a aVar) {
            if (aVar.F() != b.NULL) {
                return (Enum) this.f8488a.get(aVar.C());
            }
            aVar.z();
            return null;
        }

        /* renamed from: g */
        public void e(c cVar, Enum enumR) {
            cVar.K(enumR == null ? null : (String) this.f8489b.get(enumR));
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8492a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                D2.b[] r0 = D2.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8492a = r0
                D2.b r1 = D2.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8492a     // Catch:{ NoSuchFieldError -> 0x001d }
                D2.b r1 = D2.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8492a     // Catch:{ NoSuchFieldError -> 0x0028 }
                D2.b r1 = D2.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8492a     // Catch:{ NoSuchFieldError -> 0x0033 }
                D2.b r1 = D2.b.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8492a     // Catch:{ NoSuchFieldError -> 0x003e }
                D2.b r1 = D2.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8492a     // Catch:{ NoSuchFieldError -> 0x0049 }
                D2.b r1 = D2.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8492a     // Catch:{ NoSuchFieldError -> 0x0054 }
                D2.b r1 = D2.b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8492a     // Catch:{ NoSuchFieldError -> 0x0060 }
                D2.b r1 = D2.b.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8492a     // Catch:{ NoSuchFieldError -> 0x006c }
                D2.b r1 = D2.b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f8492a     // Catch:{ NoSuchFieldError -> 0x0078 }
                D2.b r1 = D2.b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.a.<clinit>():void");
        }
    }

    static {
        TypeAdapter b4 = new TypeAdapter() {
            /* renamed from: f */
            public Class c(D2.a aVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            /* renamed from: g */
            public void e(c cVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.b();
        f8448a = b4;
        f8449b = b(Class.class, b4);
        TypeAdapter b5 = new TypeAdapter() {
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
                if (r8.t() != 0) goto L_0x0069;
             */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.util.BitSet c(D2.a r8) {
                /*
                    r7 = this;
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r8.b()
                    D2.b r1 = r8.F()
                    r2 = 0
                    r3 = r2
                L_0x000e:
                    D2.b r4 = D2.b.END_ARRAY
                    if (r1 == r4) goto L_0x0075
                    int[] r4 = com.google.gson.internal.bind.TypeAdapters.a.f8492a
                    int r5 = r1.ordinal()
                    r4 = r4[r5]
                    r5 = 1
                    if (r4 == r5) goto L_0x0063
                    r6 = 2
                    if (r4 == r6) goto L_0x005e
                    r6 = 3
                    if (r4 != r6) goto L_0x0047
                    java.lang.String r1 = r8.C()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                    if (r1 == 0) goto L_0x002e
                    goto L_0x0069
                L_0x002e:
                    r5 = r2
                    goto L_0x0069
                L_0x0030:
                    com.google.gson.o r8 = new com.google.gson.o
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>((java.lang.String) r0)
                    throw r8
                L_0x0047:
                    com.google.gson.o r8 = new com.google.gson.o
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Invalid bitset value type: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>((java.lang.String) r0)
                    throw r8
                L_0x005e:
                    boolean r5 = r8.r()
                    goto L_0x0069
                L_0x0063:
                    int r1 = r8.t()
                    if (r1 == 0) goto L_0x002e
                L_0x0069:
                    if (r5 == 0) goto L_0x006e
                    r0.set(r3)
                L_0x006e:
                    int r3 = r3 + 1
                    D2.b r1 = r8.F()
                    goto L_0x000e
                L_0x0075:
                    r8.g()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass2.c(D2.a):java.util.BitSet");
            }

            /* renamed from: g */
            public void e(c cVar, BitSet bitSet) {
                cVar.d();
                int length = bitSet.length();
                for (int i4 = 0; i4 < length; i4++) {
                    cVar.F(bitSet.get(i4) ? 1 : 0);
                }
                cVar.g();
            }
        }.b();
        f8450c = b5;
        f8451d = b(BitSet.class, b5);
        AnonymousClass3 r02 = new TypeAdapter() {
            /* renamed from: f */
            public Boolean c(D2.a aVar) {
                b F4 = aVar.F();
                if (F4 != b.NULL) {
                    return F4 == b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.C())) : Boolean.valueOf(aVar.r());
                }
                aVar.z();
                return null;
            }

            /* renamed from: g */
            public void e(c cVar, Boolean bool) {
                cVar.H(bool);
            }
        };
        f8452e = r02;
        f8454g = c(Boolean.TYPE, Boolean.class, r02);
        AnonymousClass5 r03 = new TypeAdapter() {
            /* renamed from: f */
            public Number c(D2.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.z();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) aVar.t());
                } catch (NumberFormatException e4) {
                    throw new o((Throwable) e4);
                }
            }

            /* renamed from: g */
            public void e(c cVar, Number number) {
                cVar.J(number);
            }
        };
        f8455h = r03;
        f8456i = c(Byte.TYPE, Byte.class, r03);
        AnonymousClass6 r04 = new TypeAdapter() {
            /* renamed from: f */
            public Number c(D2.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.z();
                    return null;
                }
                try {
                    return Short.valueOf((short) aVar.t());
                } catch (NumberFormatException e4) {
                    throw new o((Throwable) e4);
                }
            }

            /* renamed from: g */
            public void e(c cVar, Number number) {
                cVar.J(number);
            }
        };
        f8457j = r04;
        f8458k = c(Short.TYPE, Short.class, r04);
        AnonymousClass7 r05 = new TypeAdapter() {
            /* renamed from: f */
            public Number c(D2.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.z();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.t());
                } catch (NumberFormatException e4) {
                    throw new o((Throwable) e4);
                }
            }

            /* renamed from: g */
            public void e(c cVar, Number number) {
                cVar.J(number);
            }
        };
        f8459l = r05;
        f8460m = c(Integer.TYPE, Integer.class, r05);
        TypeAdapter b6 = new TypeAdapter() {
            /* renamed from: f */
            public AtomicInteger c(D2.a aVar) {
                try {
                    return new AtomicInteger(aVar.t());
                } catch (NumberFormatException e4) {
                    throw new o((Throwable) e4);
                }
            }

            /* renamed from: g */
            public void e(c cVar, AtomicInteger atomicInteger) {
                cVar.F((long) atomicInteger.get());
            }
        }.b();
        f8461n = b6;
        f8462o = b(AtomicInteger.class, b6);
        TypeAdapter b7 = new TypeAdapter() {
            /* renamed from: f */
            public AtomicBoolean c(D2.a aVar) {
                return new AtomicBoolean(aVar.r());
            }

            /* renamed from: g */
            public void e(c cVar, AtomicBoolean atomicBoolean) {
                cVar.L(atomicBoolean.get());
            }
        }.b();
        f8463p = b7;
        f8464q = b(AtomicBoolean.class, b7);
        TypeAdapter b8 = new TypeAdapter() {
            /* renamed from: f */
            public AtomicIntegerArray c(D2.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.j()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.t()));
                    } catch (NumberFormatException e4) {
                        throw new o((Throwable) e4);
                    }
                }
                aVar.g();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i4 = 0; i4 < size; i4++) {
                    atomicIntegerArray.set(i4, ((Integer) arrayList.get(i4)).intValue());
                }
                return atomicIntegerArray;
            }

            /* renamed from: g */
            public void e(c cVar, AtomicIntegerArray atomicIntegerArray) {
                cVar.d();
                int length = atomicIntegerArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    cVar.F((long) atomicIntegerArray.get(i4));
                }
                cVar.g();
            }
        }.b();
        f8465r = b8;
        f8466s = b(AtomicIntegerArray.class, b8);
        AnonymousClass14 r06 = new TypeAdapter() {
            /* renamed from: f */
            public Character c(D2.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.z();
                    return null;
                }
                String C4 = aVar.C();
                if (C4.length() == 1) {
                    return Character.valueOf(C4.charAt(0));
                }
                throw new o("Expecting character, got: " + C4);
            }

            /* renamed from: g */
            public void e(c cVar, Character ch) {
                cVar.K(ch == null ? null : String.valueOf(ch));
            }
        };
        f8470w = r06;
        f8471x = c(Character.TYPE, Character.class, r06);
        AnonymousClass15 r07 = new TypeAdapter() {
            /* renamed from: f */
            public String c(D2.a aVar) {
                b F4 = aVar.F();
                if (F4 != b.NULL) {
                    return F4 == b.BOOLEAN ? Boolean.toString(aVar.r()) : aVar.C();
                }
                aVar.z();
                return null;
            }

            /* renamed from: g */
            public void e(c cVar, String str) {
                cVar.K(str);
            }
        };
        f8472y = r07;
        f8426B = b(String.class, r07);
        AnonymousClass18 r08 = new TypeAdapter() {
            /* renamed from: f */
            public StringBuilder c(D2.a aVar) {
                if (aVar.F() != b.NULL) {
                    return new StringBuilder(aVar.C());
                }
                aVar.z();
                return null;
            }

            /* renamed from: g */
            public void e(c cVar, StringBuilder sb) {
                cVar.K(sb == null ? null : sb.toString());
            }
        };
        f8427C = r08;
        f8428D = b(StringBuilder.class, r08);
        AnonymousClass19 r09 = new TypeAdapter() {
            /* renamed from: f */
            public StringBuffer c(D2.a aVar) {
                if (aVar.F() != b.NULL) {
                    return new StringBuffer(aVar.C());
                }
                aVar.z();
                return null;
            }

            /* renamed from: g */
            public void e(c cVar, StringBuffer stringBuffer) {
                cVar.K(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        f8429E = r09;
        f8430F = b(StringBuffer.class, r09);
        AnonymousClass20 r010 = new TypeAdapter() {
            /* renamed from: f */
            public URL c(D2.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.z();
                    return null;
                }
                String C4 = aVar.C();
                if ("null".equals(C4)) {
                    return null;
                }
                return new URL(C4);
            }

            /* renamed from: g */
            public void e(c cVar, URL url) {
                cVar.K(url == null ? null : url.toExternalForm());
            }
        };
        f8431G = r010;
        f8432H = b(URL.class, r010);
        AnonymousClass21 r011 = new TypeAdapter() {
            /* renamed from: f */
            public URI c(D2.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.z();
                    return null;
                }
                try {
                    String C4 = aVar.C();
                    if ("null".equals(C4)) {
                        return null;
                    }
                    return new URI(C4);
                } catch (URISyntaxException e4) {
                    throw new i((Throwable) e4);
                }
            }

            /* renamed from: g */
            public void e(c cVar, URI uri) {
                cVar.K(uri == null ? null : uri.toASCIIString());
            }
        };
        f8433I = r011;
        f8434J = b(URI.class, r011);
        AnonymousClass22 r012 = new TypeAdapter() {
            /* renamed from: f */
            public InetAddress c(D2.a aVar) {
                if (aVar.F() != b.NULL) {
                    return InetAddress.getByName(aVar.C());
                }
                aVar.z();
                return null;
            }

            /* renamed from: g */
            public void e(c cVar, InetAddress inetAddress) {
                cVar.K(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        f8435K = r012;
        f8436L = e(InetAddress.class, r012);
        AnonymousClass23 r013 = new TypeAdapter() {
            /* renamed from: f */
            public UUID c(D2.a aVar) {
                if (aVar.F() != b.NULL) {
                    return UUID.fromString(aVar.C());
                }
                aVar.z();
                return null;
            }

            /* renamed from: g */
            public void e(c cVar, UUID uuid) {
                cVar.K(uuid == null ? null : uuid.toString());
            }
        };
        f8437M = r013;
        f8438N = b(UUID.class, r013);
        TypeAdapter b9 = new TypeAdapter() {
            /* renamed from: f */
            public Currency c(D2.a aVar) {
                return Currency.getInstance(aVar.C());
            }

            /* renamed from: g */
            public void e(c cVar, Currency currency) {
                cVar.K(currency.getCurrencyCode());
            }
        }.b();
        f8439O = b9;
        f8440P = b(Currency.class, b9);
        AnonymousClass25 r014 = new TypeAdapter() {
            /* renamed from: f */
            public Calendar c(D2.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.z();
                    return null;
                }
                aVar.c();
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (aVar.F() != b.END_OBJECT) {
                    String x4 = aVar.x();
                    int t4 = aVar.t();
                    if ("year".equals(x4)) {
                        i4 = t4;
                    } else if ("month".equals(x4)) {
                        i5 = t4;
                    } else if ("dayOfMonth".equals(x4)) {
                        i6 = t4;
                    } else if ("hourOfDay".equals(x4)) {
                        i7 = t4;
                    } else if ("minute".equals(x4)) {
                        i8 = t4;
                    } else if ("second".equals(x4)) {
                        i9 = t4;
                    }
                }
                aVar.h();
                return new GregorianCalendar(i4, i5, i6, i7, i8, i9);
            }

            /* renamed from: g */
            public void e(c cVar, Calendar calendar) {
                if (calendar == null) {
                    cVar.r();
                    return;
                }
                cVar.e();
                cVar.l("year");
                cVar.F((long) calendar.get(1));
                cVar.l("month");
                cVar.F((long) calendar.get(2));
                cVar.l("dayOfMonth");
                cVar.F((long) calendar.get(5));
                cVar.l("hourOfDay");
                cVar.F((long) calendar.get(11));
                cVar.l("minute");
                cVar.F((long) calendar.get(12));
                cVar.l("second");
                cVar.F((long) calendar.get(13));
                cVar.h();
            }
        };
        f8441Q = r014;
        f8442R = d(Calendar.class, GregorianCalendar.class, r014);
        AnonymousClass26 r015 = new TypeAdapter() {
            /* renamed from: f */
            public Locale c(D2.a aVar) {
                String str = null;
                if (aVar.F() == b.NULL) {
                    aVar.z();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.C(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
            }

            /* renamed from: g */
            public void e(c cVar, Locale locale) {
                cVar.K(locale == null ? null : locale.toString());
            }
        };
        f8443S = r015;
        f8444T = b(Locale.class, r015);
        AnonymousClass27 r016 = new TypeAdapter() {
            /* renamed from: f */
            public h c(D2.a aVar) {
                if (aVar instanceof a) {
                    return ((a) aVar).U();
                }
                switch (a.f8492a[aVar.F().ordinal()]) {
                    case 1:
                        return new m((Number) new f(aVar.C()));
                    case 2:
                        return new m(Boolean.valueOf(aVar.r()));
                    case 3:
                        return new m(aVar.C());
                    case 4:
                        aVar.z();
                        return j.f8570e;
                    case 5:
                        e eVar = new e();
                        aVar.b();
                        while (aVar.j()) {
                            eVar.B(c(aVar));
                        }
                        aVar.g();
                        return eVar;
                    case 6:
                        k kVar = new k();
                        aVar.c();
                        while (aVar.j()) {
                            kVar.B(aVar.x(), c(aVar));
                        }
                        aVar.h();
                        return kVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            /* renamed from: g */
            public void e(c cVar, h hVar) {
                if (hVar == null || hVar.y()) {
                    cVar.r();
                } else if (hVar.A()) {
                    m v4 = hVar.v();
                    if (v4.H()) {
                        cVar.J(v4.E());
                    } else if (v4.F()) {
                        cVar.L(v4.s());
                    } else {
                        cVar.K(v4.w());
                    }
                } else if (hVar.x()) {
                    cVar.d();
                    Iterator it = hVar.t().iterator();
                    while (it.hasNext()) {
                        e(cVar, (h) it.next());
                    }
                    cVar.g();
                } else if (hVar.z()) {
                    cVar.e();
                    for (Map.Entry entry : hVar.u().C()) {
                        cVar.l((String) entry.getKey());
                        e(cVar, (h) entry.getValue());
                    }
                    cVar.h();
                } else {
                    throw new IllegalArgumentException("Couldn't write " + hVar.getClass());
                }
            }
        };
        f8445U = r016;
        f8446V = e(h.class, r016);
    }

    public static s a(final C2.a aVar, final TypeAdapter typeAdapter) {
        return new s() {
            public TypeAdapter create(Gson gson, C2.a aVar) {
                if (aVar.equals(C2.a.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static s b(final Class cls, final TypeAdapter typeAdapter) {
        return new s() {
            public TypeAdapter create(Gson gson, C2.a aVar) {
                if (aVar.c() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static s c(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new s() {
            public TypeAdapter create(Gson gson, C2.a aVar) {
                Class c4 = aVar.c();
                if (c4 == cls || c4 == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static s d(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new s() {
            public TypeAdapter create(Gson gson, C2.a aVar) {
                Class c4 = aVar.c();
                if (c4 == cls || c4 == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static s e(final Class cls, final TypeAdapter typeAdapter) {
        return new s() {
            public TypeAdapter create(Gson gson, C2.a aVar) {
                final Class c4 = aVar.c();
                if (!cls.isAssignableFrom(c4)) {
                    return null;
                }
                return new TypeAdapter() {
                    public Object c(D2.a aVar) {
                        Object c4 = typeAdapter.c(aVar);
                        if (c4 == null || c4.isInstance(c4)) {
                            return c4;
                        }
                        throw new o("Expected a " + c4.getName() + " but was " + c4.getClass().getName());
                    }

                    public void e(c cVar, Object obj) {
                        typeAdapter.e(cVar, obj);
                    }
                };
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
