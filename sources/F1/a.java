package F1;

import K1.p;
import android.os.IBinder;
import android.os.IInterface;

public interface a extends IInterface {

    /* renamed from: F1.a$a  reason: collision with other inner class name */
    public static abstract class C0011a extends p implements a {
        public C0011a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a I(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder);
        }
    }
}
