package v2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new e((PendingIntent) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() != 0);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new b[i4];
    }
}
