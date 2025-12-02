package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0407a0;
import java.util.List;

public final class J1 extends C0407a0 implements D0 {
    private static volatile K0 zzbg;
    /* access modifiers changed from: private */
    public static final J1 zzbir;
    private C0422f0 zzbiq = C0407a0.p();

    public static final class a extends C0407a0.a implements D0 {
        public a() {
            super(J1.zzbir);
        }

        public /* synthetic */ a(K1 k12) {
            this();
        }
    }

    public static final class b extends C0407a0 implements D0 {
        private static volatile K0 zzbg;
        /* access modifiers changed from: private */
        public static final b zzbiv;
        private int zzbb;
        private String zzbis = "";
        private long zzbit;
        private long zzbiu;
        private int zzya;

        public static final class a extends C0407a0.a implements D0 {
            public a() {
                super(b.zzbiv);
            }

            public final a q(String str) {
                n();
                ((b) this.f7017f).B(str);
                return this;
            }

            public final a r(long j4) {
                n();
                ((b) this.f7017f).C(j4);
                return this;
            }

            public final a s(long j4) {
                n();
                ((b) this.f7017f).D(j4);
                return this;
            }

            public /* synthetic */ a(K1 k12) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzbiv = bVar;
            C0407a0.n(b.class, bVar);
        }

        public static a z() {
            return (a) ((C0407a0.a) zzbiv.k(C0407a0.c.f7024e, (Object) null, (Object) null));
        }

        public final void B(String str) {
            str.getClass();
            this.zzbb |= 2;
            this.zzbis = str;
        }

        public final void C(long j4) {
            this.zzbb |= 4;
            this.zzbit = j4;
        }

        public final void D(long j4) {
            this.zzbb |= 8;
            this.zzbiu = j4;
        }

        /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.gms.internal.clearcut.a0$b, com.google.android.gms.internal.clearcut.K0] */
        public final Object k(int i4, Object obj, Object obj2) {
            K0 k02;
            switch (K1.f6824a[i4 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a((K1) null);
                case 3:
                    return C0407a0.l(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return zzbiv;
                case 5:
                    K0 k03 = zzbg;
                    K0 k04 = k03;
                    if (k03 == null) {
                        synchronized (b.class) {
                            try {
                                K0 k05 = zzbg;
                                k02 = k05;
                                if (k05 == null) {
                                    ? bVar = new C0407a0.b(zzbiv);
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

        public final int r() {
            return this.zzya;
        }

        public final boolean v() {
            return (this.zzbb & 1) == 1;
        }

        public final String w() {
            return this.zzbis;
        }

        public final long x() {
            return this.zzbit;
        }

        public final long y() {
            return this.zzbiu;
        }
    }

    static {
        J1 j12 = new J1();
        zzbir = j12;
        C0407a0.n(J1.class, j12);
    }

    public static J1 s() {
        return zzbir;
    }

    public static J1 u(byte[] bArr) {
        return (J1) C0407a0.o(zzbir, bArr);
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.internal.clearcut.a0$b, com.google.android.gms.internal.clearcut.K0] */
    public final Object k(int i4, Object obj, Object obj2) {
        K0 k02;
        switch (K1.f6824a[i4 - 1]) {
            case 1:
                return new J1();
            case 2:
                return new a((K1) null);
            case 3:
                return C0407a0.l(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", b.class});
            case 4:
                return zzbir;
            case 5:
                K0 k03 = zzbg;
                K0 k04 = k03;
                if (k03 == null) {
                    synchronized (J1.class) {
                        try {
                            K0 k05 = zzbg;
                            k02 = k05;
                            if (k05 == null) {
                                ? bVar = new C0407a0.b(zzbir);
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

    public final List r() {
        return this.zzbiq;
    }
}
