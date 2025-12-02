package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.v  reason: case insensitive filesystem */
public final class C0550v extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final C0550v zzf;
    private static volatile E1 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    /* renamed from: com.google.android.gms.internal.vision.v$a */
    public static final class a extends N0.b implements C0552v1 {
        public a() {
            super(C0550v.zzf);
        }

        public /* synthetic */ a(C0562z zVar) {
            this();
        }
    }

    static {
        C0550v vVar = new C0550v();
        zzf = vVar;
        N0.q(C0550v.class, vVar);
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0550v();
            case 2:
                return new a((C0562z) null);
            case 3:
                return N0.o(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                E1 e13 = zzg;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0550v.class) {
                        try {
                            E1 e15 = zzg;
                            e12 = e15;
                            if (e15 == null) {
                                ? aVar = new N0.a(zzf);
                                zzg = aVar;
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
