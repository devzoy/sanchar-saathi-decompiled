package Q1;

import J1.b;
import J1.c;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import net.sqlcipher.IBulkCursor;
import u1.C0941a;

public abstract class e extends b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean H(int i4, Parcel parcel, Parcel parcel2, int i5) {
        switch (i4) {
            case 3:
                C0941a aVar = (C0941a) c.a(parcel, C0941a.CREATOR);
                b bVar = (b) c.a(parcel, b.CREATOR);
                c.d(parcel);
                break;
            case 4:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                c.d(parcel);
                break;
            case 6:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                c.d(parcel);
                break;
            case 7:
                Status status3 = (Status) c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR);
                c.d(parcel);
                break;
            case 8:
                c.d(parcel);
                w((l) c.a(parcel, l.CREATOR));
                break;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                h hVar = (h) c.a(parcel, h.CREATOR);
                c.d(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
