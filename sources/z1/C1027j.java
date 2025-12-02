package z1;

import K1.p;
import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: z1.j  reason: case insensitive filesystem */
public interface C1027j extends IInterface {

    /* renamed from: z1.j$a */
    public static abstract class a extends p implements C1027j {
        public static C1027j I(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C1027j ? (C1027j) queryLocalInterface : new f0(iBinder);
        }
    }

    Account d();
}
