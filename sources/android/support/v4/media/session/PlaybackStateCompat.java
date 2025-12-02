package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public final int f4044e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4045f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4046g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4047h;

    /* renamed from: i  reason: collision with root package name */
    public final long f4048i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4049j;

    /* renamed from: k  reason: collision with root package name */
    public final CharSequence f4050k;

    /* renamed from: l  reason: collision with root package name */
    public final long f4051l;

    /* renamed from: m  reason: collision with root package name */
    public List f4052m;

    /* renamed from: n  reason: collision with root package name */
    public final long f4053n;

    /* renamed from: o  reason: collision with root package name */
    public final Bundle f4054o;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public final String f4055e;

        /* renamed from: f  reason: collision with root package name */
        public final CharSequence f4056f;

        /* renamed from: g  reason: collision with root package name */
        public final int f4057g;

        /* renamed from: h  reason: collision with root package name */
        public final Bundle f4058h;

        public static class a implements Parcelable.Creator {
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i4) {
                return new CustomAction[i4];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f4055e = parcel.readString();
            this.f4056f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4057g = parcel.readInt();
            this.f4058h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f4056f + ", mIcon=" + this.f4057g + ", mExtras=" + this.f4058h;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f4055e);
            TextUtils.writeToParcel(this.f4056f, parcel, i4);
            parcel.writeInt(this.f4057g);
            parcel.writeBundle(this.f4058h);
        }
    }

    public static class a implements Parcelable.Creator {
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i4) {
            return new PlaybackStateCompat[i4];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f4044e = parcel.readInt();
        this.f4045f = parcel.readLong();
        this.f4047h = parcel.readFloat();
        this.f4051l = parcel.readLong();
        this.f4046g = parcel.readLong();
        this.f4048i = parcel.readLong();
        this.f4050k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4052m = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f4053n = parcel.readLong();
        this.f4054o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f4049j = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f4044e + ", position=" + this.f4045f + ", buffered position=" + this.f4046g + ", speed=" + this.f4047h + ", updated=" + this.f4051l + ", actions=" + this.f4048i + ", error code=" + this.f4049j + ", error message=" + this.f4050k + ", custom actions=" + this.f4052m + ", active item id=" + this.f4053n + "}";
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f4044e);
        parcel.writeLong(this.f4045f);
        parcel.writeFloat(this.f4047h);
        parcel.writeLong(this.f4051l);
        parcel.writeLong(this.f4046g);
        parcel.writeLong(this.f4048i);
        TextUtils.writeToParcel(this.f4050k, parcel, i4);
        parcel.writeTypedList(this.f4052m);
        parcel.writeLong(this.f4053n);
        parcel.writeBundle(this.f4054o);
        parcel.writeInt(this.f4049j);
    }
}
