package v1;

import Q0.i;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: v1.c  reason: case insensitive filesystem */
public abstract class C0949c {
    public static String a(int i4) {
        switch (i4) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case IBulkCursor.GET_EXTRAS_TRANSACTION:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case i.f2380c:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 21);
                sb.append("unknown status code: ");
                sb.append(i4);
                return sb.toString();
        }
    }
}
