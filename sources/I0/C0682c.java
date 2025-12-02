package i0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: i0.c  reason: case insensitive filesystem */
public class C0682c implements Parcelable {
    public static final Parcelable.Creator<C0682c> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public final List f10042e;

    /* renamed from: f  reason: collision with root package name */
    public final List f10043f;

    /* renamed from: i0.c$a */
    public class a implements Parcelable.Creator {
        /* renamed from: a */
        public C0682c createFromParcel(Parcel parcel) {
            return new C0682c(parcel);
        }

        /* renamed from: b */
        public C0682c[] newArray(int i4) {
            return new C0682c[i4];
        }
    }

    public C0682c(Parcel parcel) {
        this.f10042e = parcel.createStringArrayList();
        this.f10043f = parcel.createTypedArrayList(C0681b.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f10042e);
        parcel.writeTypedList(this.f10043f);
    }
}
