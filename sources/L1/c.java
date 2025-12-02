package L1;

import android.os.Parcel;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ClassLoader f1770a = c.class.getClassLoader();

    public static void a(Parcel parcel, boolean z4) {
        parcel.writeInt(z4 ? 1 : 0);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
