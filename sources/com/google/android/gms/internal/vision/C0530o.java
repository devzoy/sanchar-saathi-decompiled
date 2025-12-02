package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.o  reason: case insensitive filesystem */
public final class C0530o extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final C0530o zzl;
    private static volatile E1 zzm;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private X0 zzf = N0.v();
    private int zzg;
    private String zzh = "";
    private long zzi;
    private long zzj;
    private X0 zzk = N0.v();

    /* renamed from: com.google.android.gms.internal.vision.o$a */
    public enum a implements Q0 {
        RESULT_UNKNOWN(0),
        RESULT_SUCCESS(1),
        RESULT_FAIL(2),
        RESULT_SKIPPED(3);
        

        /* renamed from: j  reason: collision with root package name */
        public static final T0 f7502j = null;

        /* renamed from: e  reason: collision with root package name */
        public final int f7504e;

        static {
            f7502j = new E();
        }

        /* access modifiers changed from: public */
        a(int i4) {
            this.f7504e = i4;
        }

        public static a b(int i4) {
            if (i4 == 0) {
                return RESULT_UNKNOWN;
            }
            if (i4 == 1) {
                return RESULT_SUCCESS;
            }
            if (i4 == 2) {
                return RESULT_FAIL;
            }
            if (i4 != 3) {
                return null;
            }
            return RESULT_SKIPPED;
        }

        public static S0 f() {
            return D.f7204a;
        }

        public final int a() {
            return this.f7504e;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7504e + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.o$b */
    public static final class b extends N0.b implements C0552v1 {
        public b() {
            super(C0530o.zzl);
        }

        public final b t(long j4) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((C0530o) this.f7313f).x(j4);
            return this;
        }

        public final b u(Iterable iterable) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((C0530o) this.f7313f).B(iterable);
            return this;
        }

        public final b v(String str) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((C0530o) this.f7313f).C(str);
            return this;
        }

        public final b w(long j4) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((C0530o) this.f7313f).E(j4);
            return this;
        }

        public /* synthetic */ b(C0562z zVar) {
            this();
        }
    }

    static {
        C0530o oVar = new C0530o();
        zzl = oVar;
        N0.q(C0530o.class, oVar);
    }

    /* access modifiers changed from: private */
    public final void C(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    public static b w() {
        return (b) zzl.s();
    }

    public final void B(Iterable iterable) {
        X0 x02 = this.zzk;
        if (!x02.a()) {
            this.zzk = N0.m(x02);
        }
        X.f(iterable, this.zzk);
    }

    public final void E(long j4) {
        this.zzc |= 32;
        this.zzj = j4;
    }

    /* JADX WARNING: type inference failed for: r12v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0530o();
            case 2:
                return new b((C0562z) null);
            case 3:
                return N0.o(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", a.f(), "zzh", "zzi", "zzj", "zzk", C0553w.class});
            case 4:
                return zzl;
            case 5:
                E1 e13 = zzm;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0530o.class) {
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

    public final void x(long j4) {
        this.zzc |= 16;
        this.zzi = j4;
    }
}
