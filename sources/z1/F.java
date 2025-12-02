package z1;

import A1.b;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class F implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        Account account = null;
        int i4 = 0;
        int i5 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                i4 = b.q(parcel, o4);
            } else if (l4 == 2) {
                account = (Account) b.e(parcel, o4, Account.CREATOR);
            } else if (l4 == 3) {
                i5 = b.q(parcel, o4);
            } else if (l4 != 4) {
                b.t(parcel, o4);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.e(parcel, o4, GoogleSignInAccount.CREATOR);
            }
        }
        b.k(parcel, u4);
        return new E(i4, account, i5, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new E[i4];
    }
}
