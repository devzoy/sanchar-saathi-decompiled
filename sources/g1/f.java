package G1;

import F1.a;
import K1.a;
import K1.q;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class f extends a implements IInterface {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final F1.a J(F1.a aVar, String str, int i4) {
        Parcel I4 = I();
        q.b(I4, aVar);
        I4.writeString(str);
        I4.writeInt(i4);
        Parcel H4 = H(2, I4);
        F1.a I5 = a.C0011a.I(H4.readStrongBinder());
        H4.recycle();
        return I5;
    }

    public final int K(F1.a aVar, String str, boolean z4) {
        Parcel I4 = I();
        q.b(I4, aVar);
        I4.writeString(str);
        I4.writeInt(z4 ? 1 : 0);
        Parcel H4 = H(3, I4);
        int readInt = H4.readInt();
        H4.recycle();
        return readInt;
    }

    public final F1.a L(F1.a aVar, String str, int i4) {
        Parcel I4 = I();
        q.b(I4, aVar);
        I4.writeString(str);
        I4.writeInt(i4);
        Parcel H4 = H(4, I4);
        F1.a I5 = a.C0011a.I(H4.readStrongBinder());
        H4.recycle();
        return I5;
    }

    public final int M(F1.a aVar, String str, boolean z4) {
        Parcel I4 = I();
        q.b(I4, aVar);
        I4.writeString(str);
        I4.writeInt(z4 ? 1 : 0);
        Parcel H4 = H(5, I4);
        int readInt = H4.readInt();
        H4.recycle();
        return readInt;
    }

    public final int N() {
        Parcel H4 = H(6, I());
        int readInt = H4.readInt();
        H4.recycle();
        return readInt;
    }

    public final F1.a O(F1.a aVar, String str, boolean z4, long j4) {
        Parcel I4 = I();
        q.b(I4, aVar);
        I4.writeString(str);
        I4.writeInt(z4 ? 1 : 0);
        I4.writeLong(j4);
        Parcel H4 = H(7, I4);
        F1.a I5 = a.C0011a.I(H4.readStrongBinder());
        H4.recycle();
        return I5;
    }

    public final F1.a P(F1.a aVar, String str, int i4, F1.a aVar2) {
        Parcel I4 = I();
        q.b(I4, aVar);
        I4.writeString(str);
        I4.writeInt(i4);
        q.b(I4, aVar2);
        Parcel H4 = H(8, I4);
        F1.a I5 = a.C0011a.I(H4.readStrongBinder());
        H4.recycle();
        return I5;
    }
}
