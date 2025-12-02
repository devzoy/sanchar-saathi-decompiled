package i0;

import android.os.Parcel;
import android.os.Parcelable;
import i0.I;
import java.util.ArrayList;

public final class K implements Parcelable {
    public static final Parcelable.Creator<K> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f9884e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f9885f;

    /* renamed from: g  reason: collision with root package name */
    public C0681b[] f9886g;

    /* renamed from: h  reason: collision with root package name */
    public int f9887h;

    /* renamed from: i  reason: collision with root package name */
    public String f9888i = null;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f9889j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f9890k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f9891l;

    public class a implements Parcelable.Creator {
        /* renamed from: a */
        public K createFromParcel(Parcel parcel) {
            return new K(parcel);
        }

        /* renamed from: b */
        public K[] newArray(int i4) {
            return new K[i4];
        }
    }

    public K() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f9884e);
        parcel.writeStringList(this.f9885f);
        parcel.writeTypedArray(this.f9886g, i4);
        parcel.writeInt(this.f9887h);
        parcel.writeString(this.f9888i);
        parcel.writeStringList(this.f9889j);
        parcel.writeTypedList(this.f9890k);
        parcel.writeTypedList(this.f9891l);
    }

    public K(Parcel parcel) {
        this.f9884e = parcel.createStringArrayList();
        this.f9885f = parcel.createStringArrayList();
        this.f9886g = (C0681b[]) parcel.createTypedArray(C0681b.CREATOR);
        this.f9887h = parcel.readInt();
        this.f9888i = parcel.readString();
        this.f9889j = parcel.createStringArrayList();
        this.f9890k = parcel.createTypedArrayList(C0682c.CREATOR);
        this.f9891l = parcel.createTypedArrayList(I.k.CREATOR);
    }
}
