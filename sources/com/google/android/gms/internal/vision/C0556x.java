package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.x  reason: case insensitive filesystem */
public final class C0556x extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final C0556x zzi;
    private static volatile E1 zzj;
    private int zzc;
    private C0527n zzd;
    private C0544t zze;
    private r zzf;
    private int zzg;
    private boolean zzh;

    /* renamed from: com.google.android.gms.internal.vision.x$a */
    public static final class a extends N0.b implements C0552v1 {
        public a() {
            super(C0556x.zzi);
        }

        public final a t(r rVar) {
            if (this.f7314g) {
                p();
                this.f7314g = false;
            }
            ((C0556x) this.f7313f).x(rVar);
            return this;
        }

        public /* synthetic */ a(C0562z zVar) {
            this();
        }
    }

    static {
        C0556x xVar = new C0556x();
        zzi = xVar;
        N0.q(C0556x.class, xVar);
    }

    public static a w() {
        return (a) zzi.s();
    }

    /* JADX WARNING: type inference failed for: r7v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0556x();
            case 2:
                return new a((C0562z) null);
            case 3:
                return N0.o(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                E1 e13 = zzj;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0556x.class) {
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

    public final void x(r rVar) {
        rVar.getClass();
        this.zzf = rVar;
        this.zzc |= 4;
    }
}
