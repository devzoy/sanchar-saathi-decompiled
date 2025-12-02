package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0407a0;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;

public final class D1 extends C0407a0 implements D0 {
    /* access modifiers changed from: private */
    public static final D1 zzbfc;
    private static volatile K0 zzbg;
    private int zzbb;
    private int zzbfa = -1;
    private int zzbfb;

    public static final class a extends C0407a0.a implements D0 {
        public a() {
            super(D1.zzbfc);
        }

        public /* synthetic */ a(F1 f12) {
            this();
        }
    }

    public enum b implements C0416d0 {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: A  reason: collision with root package name */
        public static final C0419e0 f6714A = null;

        /* renamed from: e  reason: collision with root package name */
        public final int f6737e;

        static {
            f6714A = new G1();
        }

        /* access modifiers changed from: public */
        b(int i4) {
            this.f6737e = i4;
        }

        public static b b(int i4) {
            if (i4 == 100) {
                return COMBINED;
            }
            switch (i4) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    return HSUPA;
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    return HSPA;
                case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                    return IDEN;
                case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        public static C0419e0 f() {
            return f6714A;
        }
    }

    public enum c implements C0416d0 {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);
        

        /* renamed from: y  reason: collision with root package name */
        public static final C0419e0 f6757y = null;

        /* renamed from: e  reason: collision with root package name */
        public final int f6759e;

        static {
            f6757y = new H1();
        }

        /* access modifiers changed from: public */
        c(int i4) {
            this.f6759e = i4;
        }

        public static c b(int i4) {
            switch (i4) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    return ETHERNET;
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    return MOBILE_FOTA;
                case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                    return MOBILE_IMS;
                case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        public static C0419e0 f() {
            return f6757y;
        }
    }

    static {
        D1 d12 = new D1();
        zzbfc = d12;
        C0407a0.n(D1.class, d12);
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.gms.internal.clearcut.a0$b, com.google.android.gms.internal.clearcut.K0] */
    public final Object k(int i4, Object obj, Object obj2) {
        K0 k02;
        switch (F1.f6788a[i4 - 1]) {
            case 1:
                return new D1();
            case 2:
                return new a((F1) null);
            case 3:
                return C0407a0.l(zzbfc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzbb", "zzbfa", c.f(), "zzbfb", b.f()});
            case 4:
                return zzbfc;
            case 5:
                K0 k03 = zzbg;
                K0 k04 = k03;
                if (k03 == null) {
                    synchronized (D1.class) {
                        try {
                            K0 k05 = zzbg;
                            k02 = k05;
                            if (k05 == null) {
                                ? bVar = new C0407a0.b(zzbfc);
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
