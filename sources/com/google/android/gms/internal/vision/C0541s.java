package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.s  reason: case insensitive filesystem */
public final class C0541s extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final C0541s zzi;
    private static volatile E1 zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    /* renamed from: com.google.android.gms.internal.vision.s$a */
    public enum a implements Q0 {
        FORMAT_UNKNOWN(0),
        FORMAT_LUMINANCE(1),
        FORMAT_RGB8(2),
        FORMAT_MONOCHROME(3);
        

        /* renamed from: j  reason: collision with root package name */
        public static final T0 f7532j = null;

        /* renamed from: e  reason: collision with root package name */
        public final int f7534e;

        static {
            f7532j = new M();
        }

        /* access modifiers changed from: public */
        a(int i4) {
            this.f7534e = i4;
        }

        public static a b(int i4) {
            if (i4 == 0) {
                return FORMAT_UNKNOWN;
            }
            if (i4 == 1) {
                return FORMAT_LUMINANCE;
            }
            if (i4 == 2) {
                return FORMAT_RGB8;
            }
            if (i4 != 3) {
                return null;
            }
            return FORMAT_MONOCHROME;
        }

        public static S0 f() {
            return L.f7306a;
        }

        public final int a() {
            return this.f7534e;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7534e + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.s$b */
    public static final class b extends N0.b implements C0552v1 {
        public b() {
            super(C0541s.zzi);
        }

        public final b t(long j4) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((C0541s) this.f7313f).x(j4);
            return this;
        }

        public final b u(long j4) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((C0541s) this.f7313f).A(j4);
            return this;
        }

        public final b v(long j4) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((C0541s) this.f7313f).C(j4);
            return this;
        }

        public final b w(long j4) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((C0541s) this.f7313f).E(j4);
            return this;
        }

        public /* synthetic */ b(C0562z zVar) {
            this();
        }
    }

    static {
        C0541s sVar = new C0541s();
        zzi = sVar;
        N0.q(C0541s.class, sVar);
    }

    /* access modifiers changed from: private */
    public final void A(long j4) {
        this.zzc |= 4;
        this.zzf = j4;
    }

    public static b w() {
        return (b) zzi.s();
    }

    /* access modifiers changed from: private */
    public final void x(long j4) {
        this.zzc |= 2;
        this.zze = j4;
    }

    public final void C(long j4) {
        this.zzc |= 8;
        this.zzg = j4;
    }

    public final void E(long j4) {
        this.zzc |= 16;
        this.zzh = j4;
    }

    /* JADX WARNING: type inference failed for: r8v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0541s();
            case 2:
                return new b((C0562z) null);
            case 3:
                return N0.o(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", a.f(), "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                E1 e13 = zzj;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0541s.class) {
                        try {
                            E1 e15 = zzj;
                            e12 = e15;
                            if (e15 == null) {
                                ? aVar = new N0.a(zzi);
                                zzj = aVar;
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
