package v2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new f();

    public abstract PendingIntent a();

    public abstract boolean c();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(a(), 0);
        parcel.writeInt(c() ? 1 : 0);
    }
}
