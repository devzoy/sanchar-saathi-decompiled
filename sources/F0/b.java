package F0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import v.C0944a;

public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f1022d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f1023e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1024f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1025g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1026h;

    /* renamed from: i  reason: collision with root package name */
    public int f1027i;

    /* renamed from: j  reason: collision with root package name */
    public int f1028j;

    /* renamed from: k  reason: collision with root package name */
    public int f1029k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0944a(), new C0944a(), new C0944a());
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f1023e.writeInt(bArr.length);
            this.f1023e.writeByteArray(bArr);
            return;
        }
        this.f1023e.writeInt(-1);
    }

    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1023e, 0);
    }

    public void E(int i4) {
        this.f1023e.writeInt(i4);
    }

    public void G(Parcelable parcelable) {
        this.f1023e.writeParcelable(parcelable, 0);
    }

    public void I(String str) {
        this.f1023e.writeString(str);
    }

    public void a() {
        int i4 = this.f1027i;
        if (i4 >= 0) {
            int i5 = this.f1022d.get(i4);
            int dataPosition = this.f1023e.dataPosition();
            this.f1023e.setDataPosition(i5);
            this.f1023e.writeInt(dataPosition - i5);
            this.f1023e.setDataPosition(dataPosition);
        }
    }

    public a b() {
        Parcel parcel = this.f1023e;
        int dataPosition = parcel.dataPosition();
        int i4 = this.f1028j;
        if (i4 == this.f1024f) {
            i4 = this.f1025g;
        }
        int i5 = i4;
        return new b(parcel, dataPosition, i5, this.f1026h + "  ", this.f1019a, this.f1020b, this.f1021c);
    }

    public boolean g() {
        return this.f1023e.readInt() != 0;
    }

    public byte[] i() {
        int readInt = this.f1023e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1023e.readByteArray(bArr);
        return bArr;
    }

    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1023e);
    }

    public boolean m(int i4) {
        while (this.f1028j < this.f1025g) {
            int i5 = this.f1029k;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            this.f1023e.setDataPosition(this.f1028j);
            int readInt = this.f1023e.readInt();
            this.f1029k = this.f1023e.readInt();
            this.f1028j += readInt;
        }
        return this.f1029k == i4;
    }

    public int o() {
        return this.f1023e.readInt();
    }

    public Parcelable q() {
        return this.f1023e.readParcelable(getClass().getClassLoader());
    }

    public String s() {
        return this.f1023e.readString();
    }

    public void w(int i4) {
        a();
        this.f1027i = i4;
        this.f1022d.put(i4, this.f1023e.dataPosition());
        E(0);
        E(i4);
    }

    public void y(boolean z4) {
        this.f1023e.writeInt(z4 ? 1 : 0);
    }

    public b(Parcel parcel, int i4, int i5, String str, C0944a aVar, C0944a aVar2, C0944a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1022d = new SparseIntArray();
        this.f1027i = -1;
        this.f1029k = -1;
        this.f1023e = parcel;
        this.f1024f = i4;
        this.f1025g = i5;
        this.f1028j = i4;
        this.f1026h = str;
    }
}
