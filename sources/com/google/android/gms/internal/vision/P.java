package com.google.android.gms.internal.vision;

import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;

public enum P implements Q0 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);
    

    /* renamed from: v  reason: collision with root package name */
    public static final T0 f7347v = null;

    /* renamed from: e  reason: collision with root package name */
    public final int f7349e;

    static {
        f7347v = new O();
    }

    /* access modifiers changed from: public */
    P(int i4) {
        this.f7349e = i4;
    }

    public static P b(int i4) {
        switch (i4) {
            case 0:
                return UNRECOGNIZED;
            case 1:
                return CODE_128;
            case 2:
                return CODE_39;
            case 3:
                return CODE_93;
            case 4:
                return CODABAR;
            case 5:
                return DATA_MATRIX;
            case 6:
                return EAN_13;
            case 7:
                return EAN_8;
            case 8:
                return ITF;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                return QR_CODE;
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                return UPC_A;
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                return UPC_E;
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                return PDF417;
            case 13:
                return AZTEC;
            case 14:
                return DATABAR;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                return TEZ_CODE;
            default:
                return null;
        }
    }

    public static S0 f() {
        return T.f7381a;
    }

    public final int a() {
        return this.f7349e;
    }

    public final String toString() {
        return "<" + P.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7349e + " name=" + name() + '>';
    }
}
