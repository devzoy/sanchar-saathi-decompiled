package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.q  reason: case insensitive filesystem */
public final class C0536q extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final C0536q zzj;
    private static volatile E1 zzk;
    private int zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.q$a */
    public static final class a extends N0.b implements C0552v1 {
        public a() {
            super(C0536q.zzj);
        }

        public /* synthetic */ a(C0562z zVar) {
            this();
        }
    }

    static {
        C0536q qVar = new C0536q();
        zzj = qVar;
        N0.q(C0536q.class, qVar);
    }

    /* JADX WARNING: type inference failed for: r8v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0536q();
            case 2:
                return new a((C0562z) null);
            case 3:
                return N0.o(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                E1 e13 = zzk;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0536q.class) {
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
