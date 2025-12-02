package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.p  reason: case insensitive filesystem */
public final class C0533p extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final C0533p zzj;
    private static volatile E1 zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.p$a */
    public static final class a extends N0.b implements C0552v1 {
        public a() {
            super(C0533p.zzj);
        }

        public /* synthetic */ a(C0562z zVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$b */
    public enum b implements Q0 {
        CLASSIFICATION_UNKNOWN(0),
        CLASSIFICATION_NONE(1),
        CLASSIFICATION_ALL(2);
        

        /* renamed from: i  reason: collision with root package name */
        public static final T0 f7508i = null;

        /* renamed from: e  reason: collision with root package name */
        public final int f7510e;

        static {
            f7508i = new F();
        }

        /* access modifiers changed from: public */
        b(int i4) {
            this.f7510e = i4;
        }

        public static b b(int i4) {
            if (i4 == 0) {
                return CLASSIFICATION_UNKNOWN;
            }
            if (i4 == 1) {
                return CLASSIFICATION_NONE;
            }
            if (i4 != 2) {
                return null;
            }
            return CLASSIFICATION_ALL;
        }

        public static S0 f() {
            return G.f7224a;
        }

        public final int a() {
            return this.f7510e;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7510e + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$c */
    public enum c implements Q0 {
        LANDMARK_UNKNOWN(0),
        LANDMARK_NONE(1),
        LANDMARK_ALL(2),
        LANDMARK_CONTOUR(3);
        

        /* renamed from: j  reason: collision with root package name */
        public static final T0 f7515j = null;

        /* renamed from: e  reason: collision with root package name */
        public final int f7517e;

        static {
            f7515j = new I();
        }

        /* access modifiers changed from: public */
        c(int i4) {
            this.f7517e = i4;
        }

        public static c b(int i4) {
            if (i4 == 0) {
                return LANDMARK_UNKNOWN;
            }
            if (i4 == 1) {
                return LANDMARK_NONE;
            }
            if (i4 == 2) {
                return LANDMARK_ALL;
            }
            if (i4 != 3) {
                return null;
            }
            return LANDMARK_CONTOUR;
        }

        public static S0 f() {
            return H.f7287a;
        }

        public final int a() {
            return this.f7517e;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7517e + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$d */
    public enum d implements Q0 {
        MODE_UNKNOWN(0),
        MODE_ACCURATE(1),
        MODE_FAST(2),
        MODE_SELFIE(3);
        

        /* renamed from: j  reason: collision with root package name */
        public static final T0 f7522j = null;

        /* renamed from: e  reason: collision with root package name */
        public final int f7524e;

        static {
            f7522j = new J();
        }

        /* access modifiers changed from: public */
        d(int i4) {
            this.f7524e = i4;
        }

        public static d b(int i4) {
            if (i4 == 0) {
                return MODE_UNKNOWN;
            }
            if (i4 == 1) {
                return MODE_ACCURATE;
            }
            if (i4 == 2) {
                return MODE_FAST;
            }
            if (i4 != 3) {
                return null;
            }
            return MODE_SELFIE;
        }

        public static S0 f() {
            return K.f7303a;
        }

        public final int a() {
            return this.f7524e;
        }

        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7524e + " name=" + name() + '>';
        }
    }

    static {
        C0533p pVar = new C0533p();
        zzj = pVar;
        N0.q(C0533p.class, pVar);
    }

    /* JADX WARNING: type inference failed for: r11v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0533p();
            case 2:
                return new a((C0562z) null);
            case 3:
                return N0.o(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", d.f(), "zze", c.f(), "zzf", b.f(), "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                E1 e13 = zzk;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0533p.class) {
                        try {
                            E1 e15 = zzk;
                            e12 = e15;
                            if (e15 == null) {
                                ? aVar = new N0.a(zzj);
                                zzk = aVar;
                                e12 = aVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    e14 = e12;
                }
                return e14;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
