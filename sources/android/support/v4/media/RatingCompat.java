package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public final int f4030e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4031f;

    public static class a implements Parcelable.Creator {
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i4) {
            return new RatingCompat[i4];
        }
    }

    public RatingCompat(int i4, float f4) {
        this.f4030e = i4;
        this.f4031f = f4;
    }

    public int describeContents() {
        return this.f4030e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f4030e);
        sb.append(" rating=");
        float f4 = this.f4031f;
        sb.append(f4 < 0.0f ? "unrated" : String.valueOf(f4));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f4030e);
        parcel.writeFloat(this.f4031f);
    }
}
