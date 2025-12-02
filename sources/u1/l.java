package u1;

import A1.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        PendingIntent pendingIntent = null;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                i4 = b.q(parcel, o4);
            } else if (l4 == 2) {
                i5 = b.q(parcel, o4);
            } else if (l4 == 3) {
                pendingIntent = (PendingIntent) b.e(parcel, o4, PendingIntent.CREATOR);
            } else if (l4 != 4) {
                b.t(parcel, o4);
            } else {
                str = b.f(parcel, o4);
            }
        }
        b.k(parcel, u4);
        return new C0941a(i4, i5, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new C0941a[i4];
    }
}
