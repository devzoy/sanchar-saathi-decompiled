package android.support.v4.media.session;

import F0.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public abstract class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public final MediaDescriptionCompat f4033e;

        /* renamed from: f  reason: collision with root package name */
        public final long f4034f;

        public static class a implements Parcelable.Creator {
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i4) {
                return new QueueItem[i4];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f4033e = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f4034f = parcel.readLong();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f4033e + ", Id=" + this.f4034f + " }";
        }

        public void writeToParcel(Parcel parcel, int i4) {
            this.f4033e.writeToParcel(parcel, i4);
            parcel.writeLong(this.f4034f);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public ResultReceiver f4035e;

        public static class a implements Parcelable.Creator {
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i4) {
                return new ResultReceiverWrapper[i4];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f4035e = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            this.f4035e.writeToParcel(parcel, i4);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public final Object f4036e;

        /* renamed from: f  reason: collision with root package name */
        public a f4037f;

        /* renamed from: g  reason: collision with root package name */
        public c f4038g;

        public static class a implements Parcelable.Creator {
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            /* renamed from: b */
            public Token[] newArray(int i4) {
                return new Token[i4];
            }
        }

        public Token(Object obj) {
            this(obj, (a) null, (c) null);
        }

        public Object a() {
            return this.f4036e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f4036e;
            if (obj2 == null) {
                return token.f4036e == null;
            }
            Object obj3 = token.f4036e;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f4036e;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeParcelable((Parcelable) this.f4036e, i4);
        }

        public Token(Object obj, a aVar, c cVar) {
            this.f4036e = obj;
            this.f4038g = cVar;
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
