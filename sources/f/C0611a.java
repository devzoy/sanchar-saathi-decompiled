package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f.a  reason: case insensitive filesystem */
public final class C0611a implements Parcelable {
    public static final Parcelable.Creator<C0611a> CREATOR = new C0159a();

    /* renamed from: e  reason: collision with root package name */
    public final int f8954e;

    /* renamed from: f  reason: collision with root package name */
    public final Intent f8955f;

    /* renamed from: f.a$a  reason: collision with other inner class name */
    public class C0159a implements Parcelable.Creator {
        /* renamed from: a */
        public C0611a createFromParcel(Parcel parcel) {
            return new C0611a(parcel);
        }

        /* renamed from: b */
        public C0611a[] newArray(int i4) {
            return new C0611a[i4];
        }
    }

    public C0611a(int i4, Intent intent) {
        this.f8954e = i4;
        this.f8955f = intent;
    }

    public static String d(int i4) {
        return i4 != -1 ? i4 != 0 ? String.valueOf(i4) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f8955f;
    }

    public int c() {
        return this.f8954e;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + d(this.f8954e) + ", data=" + this.f8955f + '}';
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f8954e);
        parcel.writeInt(this.f8955f == null ? 0 : 1);
        Intent intent = this.f8955f;
        if (intent != null) {
            intent.writeToParcel(parcel, i4);
        }
    }

    public C0611a(Parcel parcel) {
        this.f8954e = parcel.readInt();
        this.f8955f = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
