package v1;

import A1.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import u1.C0941a;

public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        C0941a aVar = null;
        int i4 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                i4 = b.q(parcel, o4);
            } else if (l4 == 2) {
                str = b.f(parcel, o4);
            } else if (l4 == 3) {
                pendingIntent = (PendingIntent) b.e(parcel, o4, PendingIntent.CREATOR);
            } else if (l4 != 4) {
                b.t(parcel, o4);
            } else {
                aVar = (C0941a) b.e(parcel, o4, C0941a.CREATOR);
            }
        }
        b.k(parcel, u4);
        return new Status(i4, str, pendingIntent, aVar);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new Status[i4];
    }
}
