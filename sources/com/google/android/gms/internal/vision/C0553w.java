package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.w  reason: case insensitive filesystem */
public final class C0553w extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final C0553w zzh;
    private static volatile E1 zzi;
    private int zzc;
    private C0524m zzd;
    private int zze;
    private C0536q zzf;
    private C0521l zzg;

    /* renamed from: com.google.android.gms.internal.vision.w$a */
    public static final class a extends N0.b implements C0552v1 {
        public a() {
            super(C0553w.zzh);
        }

        public /* synthetic */ a(C0562z zVar) {
            this();
        }
    }

    static {
        C0553w wVar = new C0553w();
        zzh = wVar;
        N0.q(C0553w.class, wVar);
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0553w();
            case 2:
                return new a((C0562z) null);
            case 3:
                return N0.o(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                E1 e13 = zzi;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0553w.class) {
                        try {
                            E1 e15 = zzi;
                            e12 = e15;
                            if (e15 == null) {
                                ? aVar = new N0.a(zzh);
                                zzi = aVar;
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
