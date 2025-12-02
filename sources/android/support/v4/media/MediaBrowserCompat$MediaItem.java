package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public final int f4006e;

    /* renamed from: f  reason: collision with root package name */
    public final MediaDescriptionCompat f4007f;

    public static class a implements Parcelable.Creator {
        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i4) {
            return new MediaBrowserCompat$MediaItem[i4];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f4006e = parcel.readInt();
        this.f4007f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f4006e + ", mDescription=" + this.f4007f + '}';
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f4006e);
        this.f4007f.writeToParcel(parcel, i4);
    }
}
