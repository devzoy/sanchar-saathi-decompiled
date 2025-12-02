package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.l  reason: case insensitive filesystem */
public final class C0521l extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final C0521l zzg;
    private static volatile E1 zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    /* renamed from: com.google.android.gms.internal.vision.l$a */
    public static final class a extends N0.b implements C0552v1 {
        public a() {
            super(C0521l.zzg);
        }

        public /* synthetic */ a(C0562z zVar) {
            this();
        }
    }

    static {
        C0521l lVar = new C0521l();
        zzg = lVar;
        N0.q(C0521l.class, lVar);
    }

    /* JADX WARNING: type inference failed for: r7v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0521l();
            case 2:
                return new a((C0562z) null);
            case 3:
                return N0.o(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", P.f(), "zze", S.f(), "zzf"});
            case 4:
                return zzg;
            case 5:
                E1 e13 = zzh;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0521l.class) {
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
}
