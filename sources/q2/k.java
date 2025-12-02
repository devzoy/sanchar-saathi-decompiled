package q2;

import android.os.IBinder;
import android.os.IInterface;

public abstract class k extends h implements l {
    public static l I(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof l ? (l) queryLocalInterface : new j(iBinder);
    }
}
