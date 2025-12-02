package androidx.versionedparcelable;

import F0.b;
import F0.c;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public final c f6047e;

    public static class a implements Parcelable.Creator {
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i4) {
            return new ParcelImpl[i4];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f6047e = new b(parcel).u();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        new b(parcel).L(this.f6047e);
    }
}
