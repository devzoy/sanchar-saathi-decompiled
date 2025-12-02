package w2;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class g extends b implements h {
    public g() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    public final boolean H(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i6 = c.f12656a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            b(bundle);
            return true;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }
}
