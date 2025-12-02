package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.m  reason: case insensitive filesystem */
public final class C0524m extends N0 implements C0552v1 {
    /* access modifiers changed from: private */
    public static final C0524m zzd;
    private static volatile E1 zze;
    private X0 zzc = N0.v();

    /* renamed from: com.google.android.gms.internal.vision.m$a */
    public static final class a extends N0.b implements C0552v1 {
        public a() {
            super(C0524m.zzd);
        }

        public /* synthetic */ a(C0562z zVar) {
            this();
        }
    }

    static {
        C0524m mVar = new C0524m();
        zzd = mVar;
        N0.q(C0524m.class, mVar);
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    public final Object n(int i4, Object obj, Object obj2) {
        E1 e12;
        switch (C0562z.f7609a[i4 - 1]) {
            case 1:
                return new C0524m();
            case 2:
                return new a((C0562z) null);
            case 3:
                return N0.o(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C0550v.class});
            case 4:
                return zzd;
            case 5:
                E1 e13 = zze;
                E1 e14 = e13;
                if (e13 == null) {
                    synchronized (C0524m.class) {
                        try {
                            E1 e15 = zze;
                            e12 = e15;
                            if (e15 == null) {
                                ? aVar = new N0.a(zzd);
                                zze = aVar;
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
