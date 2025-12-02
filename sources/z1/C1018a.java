package z1;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import z1.C1027j;

/* renamed from: z1.a  reason: case insensitive filesystem */
public abstract class C1018a extends C1027j.a {
    public static Account J(C1027j jVar) {
        Account account = null;
        if (jVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = jVar.d();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
