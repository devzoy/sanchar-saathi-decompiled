package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.k  reason: case insensitive filesystem */
public final class C0518k extends N0 implements C0552v1 {
    private static final U0 zzd = new A();
    /* access modifiers changed from: private */
    public static final C0518k zze;
    private static volatile E1 zzf;
    private V0 zzc = N0.u();

    /* renamed from: com.google.android.gms.internal.vision.k$a */
    public static final class a extends N0.b implements C0552v1 {
        public a() {
            super(C0518k.zze);
        }

        public /* synthetic */ a(C0562z zVar) {
            this();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.U0, com.google.android.gms.internal.vision.A] */
    static {
        C0518k kVar = new C0518k();
        zze = kVar;
        N0.q(C0518k.class, kVar);
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0518k();
            case 2:
                return new a((C0562z) null);
            case 3:
                return N0.o(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", P.f()});
            case 4:
                return zze;
            case 5:
                E1 e13 = zzf;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0518k.class) {
                        try {
                            E1 e15 = zzf;
                            e12 = e15;
                            if (e15 == null) {
                                ? aVar = new N0.a(zze);
                                zzf = aVar;
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
