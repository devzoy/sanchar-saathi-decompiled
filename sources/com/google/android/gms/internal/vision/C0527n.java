package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.n  reason: case insensitive filesystem */
public final class C0527n extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final C0527n zzl;
    private static volatile E1 zzm;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj = "";
    private boolean zzk;

    /* renamed from: com.google.android.gms.internal.vision.n$a */
    public static final class a extends N0.b implements C0552v1 {
        public a() {
            super(C0527n.zzl);
        }

        public /* synthetic */ a(C0562z zVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.n$b */
    public enum b implements Q0 {
        REASON_UNKNOWN(0),
        REASON_MISSING(1),
        REASON_UPGRADE(2),
        REASON_INVALID(3);
        

        /* renamed from: j  reason: collision with root package name */
        public static final T0 f7491j = null;

        /* renamed from: e  reason: collision with root package name */
        public final int f7493e;

        static {
            f7491j = new B();
        }

        /* access modifiers changed from: public */
        b(int i4) {
            this.f7493e = i4;
        }

        public static b b(int i4) {
            if (i4 == 0) {
                return REASON_UNKNOWN;
            }
            if (i4 == 1) {
                return REASON_MISSING;
            }
            if (i4 == 2) {
                return REASON_UPGRADE;
            }
            if (i4 != 3) {
                return null;
            }
            return REASON_INVALID;
        }

        public static S0 f() {
            return C.f7198a;
        }

        public final int a() {
            return this.f7493e;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7493e + " name=" + name() + '>';
        }
    }

    static {
        C0527n nVar = new C0527n();
        zzl = nVar;
        N0.q(C0527n.class, nVar);
    }

    /* JADX WARNING: type inference failed for: r11v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0527n();
            case 2:
                return new a((C0562z) null);
            case 3:
                return N0.o(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", b.f(), "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                E1 e13 = zzm;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0527n.class) {
                        try {
                            E1 e15 = zzm;
                            e12 = e15;
                            if (e15 == null) {
                                ? aVar = new N0.a(zzl);
                                zzm = aVar;
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
