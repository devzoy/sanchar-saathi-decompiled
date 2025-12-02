package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

public final class r extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final r zzg;
    private static volatile E1 zzh;
    private int zzc;
    private C0541s zzd;
    private C0547u zze;
    private X0 zzf = N0.v();

    public static final class a extends N0.b implements C0552v1 {
        public a() {
            super(r.zzg);
        }

        public final a t(C0541s sVar) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((r) this.f7313f).z(sVar);
            return this;
        }

        public final a u(Iterable iterable) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((r) this.f7313f).A(iterable);
            return this;
        }

        public /* synthetic */ a(C0562z zVar) {
            this();
        }
    }

    static {
        r rVar = new r();
        zzg = rVar;
        N0.q(r.class, rVar);
    }

    /* access modifiers changed from: private */
    public final void A(Iterable iterable) {
        C();
        X.f(iterable, this.zzf);
    }

    public static a w() {
        return (a) zzg.s();
    }

    public final void C() {
        X0 x02 = this.zzf;
        if (!x02.a()) {
            this.zzf = N0.m(x02);
        }
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new r();
            case 2:
                return new a((C0562z) null);
            case 3:
                return N0.o(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", C0530o.class});
            case 4:
                return zzg;
            case 5:
                E1 e13 = zzh;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (r.class) {
                        try {
                            E1 e15 = zzh;
                            e12 = e15;
                            if (e15 == null) {
                                ? aVar = new N0.a(zzg);
                                zzh = aVar;
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

    public final void z(C0541s sVar) {
        sVar.getClass();
        this.zzd = sVar;
        this.zzc |= 1;
    }
}
