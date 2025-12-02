package G1;

import F1.a;
import K1.a;
import K1.q;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class g extends a implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final F1.a J(F1.a aVar, String str, int i4, F1.a aVar2) {
        Parcel I4 = I();
        q.b(I4, aVar);
        I4.writeString(str);
        I4.writeInt(i4);
        q.b(I4, aVar2);
        Parcel H4 = H(2, I4);
        F1.a I5 = a.C0011a.I(H4.readStrongBinder());
        H4.recycle();
        return I5;
    }

    public final F1.a K(F1.a aVar, String str, int i4, F1.a aVar2) {
        Parcel I4 = I();
        q.b(I4, aVar);
        I4.writeString(str);
        I4.writeInt(i4);
        q.b(I4, aVar2);
        Parcel H4 = H(3, I4);
        F1.a I5 = a.C0011a.I(H4.readStrongBinder());
        H4.recycle();
        return I5;
    }
}
