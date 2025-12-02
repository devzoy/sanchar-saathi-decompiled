package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public int f4039e;

    /* renamed from: f  reason: collision with root package name */
    public int f4040f;

    /* renamed from: g  reason: collision with root package name */
    public int f4041g;

    /* renamed from: h  reason: collision with root package name */
    public int f4042h;

    /* renamed from: i  reason: collision with root package name */
    public int f4043i;

    public static class a implements Parcelable.Creator {
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i4) {
            return new ParcelableVolumeInfo[i4];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f4039e = parcel.readInt();
        this.f4041g = parcel.readInt();
        this.f4042h = parcel.readInt();
        this.f4043i = parcel.readInt();
        this.f4040f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f4039e);
        parcel.writeInt(this.f4041g);
        parcel.writeInt(this.f4042h);
        parcel.writeInt(this.f4043i);
        parcel.writeInt(this.f4040f);
    }
}
