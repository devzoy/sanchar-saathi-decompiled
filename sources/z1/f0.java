package z1;

import K1.a;
import K1.q;
import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

public final class f0 extends a implements C1027j {
    public f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account d() {
        Parcel H4 = H(2, I());
        Account account = (Account) q.a(H4, Account.CREATOR);
        H4.recycle();
        return account;
    }
}
