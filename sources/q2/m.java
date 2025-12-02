package q2;

import android.os.Bundle;
import android.os.Parcel;

public abstract class m extends h implements n {
    public m() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    public final boolean H(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 == 2) {
            i.b(parcel);
            f((Bundle) i.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i4 != 3) {
            return false;
        } else {
            i.b(parcel);
            b((Bundle) i.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
