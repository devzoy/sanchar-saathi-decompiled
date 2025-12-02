package com.google.android.gms.internal.vision;

import net.sqlcipher.IBulkCursor;

public enum S implements Q0 {
    UNKNOWN_FORMAT(0),
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    TEXT(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12),
    BOARDING_PASS(13);
    

    /* renamed from: t  reason: collision with root package name */
    public static final T0 f7376t = null;

    /* renamed from: e  reason: collision with root package name */
    public final int f7378e;

    static {
        f7376t = new V();
    }

    /* access modifiers changed from: public */
    S(int i4) {
        this.f7378e = i4;
    }

    public static S b(int i4) {
        switch (i4) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return CONTACT_INFO;
            case 2:
                return EMAIL;
            case 3:
                return ISBN;
            case 4:
                return PHONE;
            case 5:
                return PRODUCT;
            case 6:
                return SMS;
            case 7:
                return TEXT;
            case 8:
                return URL;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                return WIFI;
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                return GEO;
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                return CALENDAR_EVENT;
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                return DRIVER_LICENSE;
            case 13:
                return BOARDING_PASS;
            default:
                return null;
        }
    }

    public static S0 f() {
        return U.f7385a;
    }

    public final int a() {
        return this.f7378e;
    }

    public final String toString() {
        return "<" + S.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7378e + " name=" + name() + '>';
    }
}
