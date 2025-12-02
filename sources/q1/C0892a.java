package q1;

import A1.b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import net.sqlcipher.IBulkCursor;

/* renamed from: q1.a  reason: case insensitive filesystem */
public final class C0892a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u4 = b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j4 = 0;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            switch (b.l(o4)) {
                case 2:
                    str = b.f(parcel2, o4);
                    break;
                case 3:
                    str2 = b.f(parcel2, o4);
                    break;
                case 4:
                    str3 = b.f(parcel2, o4);
                    break;
                case 5:
                    str4 = b.f(parcel2, o4);
                    break;
                case 6:
                    uri = (Uri) b.e(parcel2, o4, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.f(parcel2, o4);
                    break;
                case 8:
                    j4 = b.r(parcel2, o4);
                    break;
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION:
                    str6 = b.f(parcel2, o4);
                    break;
                case IBulkCursor.GET_EXTRAS_TRANSACTION:
                    arrayList = b.j(parcel2, o4, Scope.CREATOR);
                    break;
                case IBulkCursor.RESPOND_TRANSACTION:
                    str7 = b.f(parcel2, o4);
                    break;
                case IBulkCursor.CLOSE_TRANSACTION:
                    str8 = b.f(parcel2, o4);
                    break;
                default:
                    b.t(parcel2, o4);
                    break;
            }
        }
        b.k(parcel2, u4);
        return new GoogleSignInAccount(str, str2, str3, str4, uri, str5, j4, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new GoogleSignInAccount[i4];
    }
}
