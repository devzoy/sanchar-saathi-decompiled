package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0407a0;

public final class C1 extends C0407a0 implements D0 {
    private static volatile K0 zzbg;
    /* access modifiers changed from: private */
    public static final C1 zztx;
    private int zzbb;
    private int zztu;
    private String zztv = "";
    private String zztw = "";

    public static final class a extends C0407a0.a implements D0 {
        public a() {
            super(C1.zztx);
        }

        public /* synthetic */ a(F1 f12) {
            this();
        }
    }

    static {
        C1 c12 = new C1();
        zztx = c12;
        C0407a0.n(C1.class, c12);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.a0$b, com.google.android.gms.internal.clearcut.K0] */
    public final Object k(int i4, Object obj, Object obj2) {
        K0 k02;
        switch (F1.f6788a[i4 - 1]) {
            case 1:
                return new C1();
            case 2:
                return new a((F1) null);
            case 3:
                return C0407a0.l(zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzbb", "zztu", "zztv", "zztw"});
            case 4:
                return zztx;
            case 5:
                K0 k03 = zzbg;
                K0 k04 = k03;
                if (k03 == null) {
                    synchronized (C1.class) {
                        try {
                            K0 k05 = zzbg;
                            k02 = k05;
                            if (k05 == null) {
                                ? bVar = new C0407a0.b(zztx);
                                zzbg = bVar;
                                k02 = bVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    k04 = k02;
                }
                return k04;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
