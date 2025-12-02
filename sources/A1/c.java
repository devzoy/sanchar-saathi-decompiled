package A1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public abstract class c {
    public static int a(Parcel parcel) {
        return s(parcel, 20293);
    }

    public static void b(Parcel parcel, int i4) {
        t(parcel, i4);
    }

    public static void c(Parcel parcel, int i4, boolean z4) {
        r(parcel, i4, 4);
        parcel.writeInt(z4 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i4, Bundle bundle, boolean z4) {
        if (bundle != null) {
            int s4 = s(parcel, i4);
            parcel.writeBundle(bundle);
            t(parcel, s4);
        } else if (z4) {
            r(parcel, i4, 0);
        }
    }

    public static void e(Parcel parcel, int i4, byte[] bArr, boolean z4) {
        if (bArr != null) {
            int s4 = s(parcel, i4);
            parcel.writeByteArray(bArr);
            t(parcel, s4);
        } else if (z4) {
            r(parcel, i4, 0);
        }
    }

    public static void f(Parcel parcel, int i4, byte[][] bArr, boolean z4) {
        if (bArr != null) {
            int s4 = s(parcel, i4);
            parcel.writeInt(r5);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            t(parcel, s4);
        } else if (z4) {
            r(parcel, i4, 0);
        }
    }

    public static void g(Parcel parcel, int i4, double d4) {
        r(parcel, i4, 8);
        parcel.writeDouble(d4);
    }

    public static void h(Parcel parcel, int i4, IBinder iBinder, boolean z4) {
        if (iBinder != null) {
            int s4 = s(parcel, i4);
            parcel.writeStrongBinder(iBinder);
            t(parcel, s4);
        } else if (z4) {
            r(parcel, i4, 0);
        }
    }

    public static void i(Parcel parcel, int i4, int i5) {
        r(parcel, i4, 4);
        parcel.writeInt(i5);
    }

    public static void j(Parcel parcel, int i4, int[] iArr, boolean z4) {
        if (iArr != null) {
            int s4 = s(parcel, i4);
            parcel.writeIntArray(iArr);
            t(parcel, s4);
        } else if (z4) {
            r(parcel, i4, 0);
        }
    }

    public static void k(Parcel parcel, int i4, long j4) {
        r(parcel, i4, 8);
        parcel.writeLong(j4);
    }

    public static void l(Parcel parcel, int i4, Parcelable parcelable, int i5, boolean z4) {
        if (parcelable != null) {
            int s4 = s(parcel, i4);
            parcelable.writeToParcel(parcel, i5);
            t(parcel, s4);
        } else if (z4) {
            r(parcel, i4, 0);
        }
    }

    public static void m(Parcel parcel, int i4, String str, boolean z4) {
        if (str != null) {
            int s4 = s(parcel, i4);
            parcel.writeString(str);
            t(parcel, s4);
        } else if (z4) {
            r(parcel, i4, 0);
        }
    }

    public static void n(Parcel parcel, int i4, String[] strArr, boolean z4) {
        if (strArr != null) {
            int s4 = s(parcel, i4);
            parcel.writeStringArray(strArr);
            t(parcel, s4);
        } else if (z4) {
            r(parcel, i4, 0);
        }
    }

    public static void o(Parcel parcel, int i4, List list, boolean z4) {
        if (list != null) {
            int s4 = s(parcel, i4);
            parcel.writeStringList(list);
            t(parcel, s4);
        } else if (z4) {
            r(parcel, i4, 0);
        }
    }

    public static void p(Parcel parcel, int i4, Parcelable[] parcelableArr, int i5, boolean z4) {
        if (parcelableArr != null) {
            int s4 = s(parcel, i4);
            parcel.writeInt(r7);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    u(parcel, parcelable, i5);
                }
            }
            t(parcel, s4);
        } else if (z4) {
            r(parcel, i4, 0);
        }
    }

    public static void q(Parcel parcel, int i4, List list, boolean z4) {
        if (list != null) {
            int s4 = s(parcel, i4);
            int size = list.size();
            parcel.writeInt(size);
            for (int i5 = 0; i5 < size; i5++) {
                Parcelable parcelable = (Parcelable) list.get(i5);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    u(parcel, parcelable, 0);
                }
            }
            t(parcel, s4);
        } else if (z4) {
            r(parcel, i4, 0);
        }
    }

    public static void r(Parcel parcel, int i4, int i5) {
        parcel.writeInt(i4 | (i5 << 16));
    }

    public static int s(Parcel parcel, int i4) {
        parcel.writeInt(i4 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void t(Parcel parcel, int i4) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i4 - 4);
        parcel.writeInt(dataPosition - i4);
        parcel.setDataPosition(dataPosition);
    }

    public static void u(Parcel parcel, Parcelable parcelable, int i4) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i4);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
