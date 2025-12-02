package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.t  reason: case insensitive filesystem */
public final class C0544t extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final C0544t zzj;
    private static volatile E1 zzk;
    private int zzc;
    private String zzd = "";
    private long zze;
    private C0515j zzf;
    private String zzg = "";
    private C0533p zzh;
    private C0518k zzi;

    /* renamed from: com.google.android.gms.internal.vision.t$a */
    public static final class a extends N0.b implements C0552v1 {
        public a() {
            super(C0544t.zzj);
        }

        public /* synthetic */ a(C0562z zVar) {
            this();
        }
    }

    static {
        C0544t tVar = new C0544t();
        zzj = tVar;
        N0.q(C0544t.class, tVar);
    }

    /* JADX WARNING: type inference failed for: r8v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0544t();
            case 2:
                return new a((C0562z) null);
            case 3:
                return N0.o(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                E1 e13 = zzk;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0544t.class) {
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
