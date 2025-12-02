package Z;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final a f3785f = new C0074a();

    /* renamed from: e  reason: collision with root package name */
    public final Parcelable f3786e;

    /* renamed from: Z.a$a  reason: collision with other inner class name */
    public class C0074a extends a {
        public C0074a() {
            super((C0074a) null);
        }
    }

    public class b implements Parcelable.ClassLoaderCreator {
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f3785f;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i4) {
            return new a[i4];
        }
    }

    public /* synthetic */ a(C0074a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.f3786e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3786e, i4);
    }

    public a() {
        this.f3786e = null;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3786e = parcelable == f3785f ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3786e = readParcelable == null ? f3785f : readParcelable;
    }
}
