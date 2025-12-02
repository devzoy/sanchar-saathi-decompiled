package u1;

import A1.a;
import A1.c;
import Q0.i;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;
import z1.C1031n;

/* renamed from: u1.a  reason: case insensitive filesystem */
public final class C0941a extends a {
    public static final Parcelable.Creator<C0941a> CREATOR = new l();

    /* renamed from: i  reason: collision with root package name */
    public static final C0941a f12304i = new C0941a(0);

    /* renamed from: e  reason: collision with root package name */
    public final int f12305e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12306f;

    /* renamed from: g  reason: collision with root package name */
    public final PendingIntent f12307g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12308h;

    public C0941a(int i4, int i5, PendingIntent pendingIntent, String str) {
        this.f12305e = i4;
        this.f12306f = i5;
        this.f12307g = pendingIntent;
        this.f12308h = str;
    }

    public static String j(int i4) {
        if (i4 == 99) {
            return "UNFINISHED";
        }
        if (i4 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i4) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
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
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION:
                return "SERVICE_INVALID";
            case IBulkCursor.GET_EXTRAS_TRANSACTION:
                return "DEVELOPER_ERROR";
            case IBulkCursor.RESPOND_TRANSACTION:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i4) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case i.f2380c:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i4);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public int d() {
        return this.f12306f;
    }

    public String e() {
        return this.f12308h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0941a)) {
            return false;
        }
        C0941a aVar = (C0941a) obj;
        return this.f12306f == aVar.f12306f && C1031n.a(this.f12307g, aVar.f12307g) && C1031n.a(this.f12308h, aVar.f12308h);
    }

    public PendingIntent g() {
        return this.f12307g;
    }

    public boolean h() {
        return (this.f12306f == 0 || this.f12307g == null) ? false : true;
    }

    public int hashCode() {
        return C1031n.b(Integer.valueOf(this.f12306f), this.f12307g, this.f12308h);
    }

    public boolean i() {
        return this.f12306f == 0;
    }

    public String toString() {
        C1031n.a c4 = C1031n.c(this);
        c4.a("statusCode", j(this.f12306f));
        c4.a("resolution", this.f12307g);
        c4.a("message", this.f12308h);
        return c4.toString();
    }

    public void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.f12305e;
        int a4 = c.a(parcel);
        c.i(parcel, 1, i5);
        c.i(parcel, 2, d());
        c.l(parcel, 3, g(), i4, false);
        c.m(parcel, 4, e(), false);
        c.b(parcel, a4);
    }

    public C0941a(int i4) {
        this(i4, (PendingIntent) null, (String) null);
    }

    public C0941a(int i4, PendingIntent pendingIntent) {
        this(i4, pendingIntent, (String) null);
    }

    public C0941a(int i4, PendingIntent pendingIntent, String str) {
        this(1, i4, pendingIntent, str);
    }
}
