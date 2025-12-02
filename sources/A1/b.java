package A1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public abstract class b {

    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r5, android.os.Parcel r6) {
            /*
                r4 = this;
                int r0 = r6.dataPosition()
                int r6 = r6.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r5)
                int r1 = r1.length()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                int r2 = r2.length()
                java.lang.String r3 = java.lang.String.valueOf(r6)
                int r3 = r3.length()
                int r1 = r1 + 13
                int r1 = r1 + r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 6
                int r1 = r1 + r3
                r2.<init>(r1)
                r2.append(r5)
                java.lang.String r5 = " Parcel: pos="
                r2.append(r5)
                r2.append(r0)
                java.lang.String r5 = " size="
                r2.append(r5)
                r2.append(r6)
                java.lang.String r5 = r2.toString()
                r4.<init>(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: A1.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int i4) {
        int s4 = s(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + s4);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i4) {
        int s4 = s(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + s4);
        return createByteArray;
    }

    public static byte[][] c(Parcel parcel, int i4) {
        int s4 = s(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i5 = 0; i5 < readInt; i5++) {
            bArr[i5] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + s4);
        return bArr;
    }

    public static int[] d(Parcel parcel, int i4) {
        int s4 = s(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + s4);
        return createIntArray;
    }

    public static Parcelable e(Parcel parcel, int i4, Parcelable.Creator creator) {
        int s4 = s(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + s4);
        return parcelable;
    }

    public static String f(Parcel parcel, int i4) {
        int s4 = s(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + s4);
        return readString;
    }

    public static String[] g(Parcel parcel, int i4) {
        int s4 = s(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + s4);
        return createStringArray;
    }

    public static ArrayList h(Parcel parcel, int i4) {
        int s4 = s(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + s4);
        return createStringArrayList;
    }

    public static Object[] i(Parcel parcel, int i4, Parcelable.Creator creator) {
        int s4 = s(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + s4);
        return createTypedArray;
    }

    public static ArrayList j(Parcel parcel, int i4, Parcelable.Creator creator) {
        int s4 = s(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + s4);
        return createTypedArrayList;
    }

    public static void k(Parcel parcel, int i4) {
        if (parcel.dataPosition() != i4) {
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 26);
            sb.append("Overread allowed size end=");
            sb.append(i4);
            throw new a(sb.toString(), parcel);
        }
    }

    public static int l(int i4) {
        return (char) i4;
    }

    public static boolean m(Parcel parcel, int i4) {
        v(parcel, i4, 4);
        return parcel.readInt() != 0;
    }

    public static double n(Parcel parcel, int i4) {
        v(parcel, i4, 8);
        return parcel.readDouble();
    }

    public static int o(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder p(Parcel parcel, int i4) {
        int s4 = s(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + s4);
        return readStrongBinder;
    }

    public static int q(Parcel parcel, int i4) {
        v(parcel, i4, 4);
        return parcel.readInt();
    }

    public static long r(Parcel parcel, int i4) {
        v(parcel, i4, 8);
        return parcel.readLong();
    }

    public static int s(Parcel parcel, int i4) {
        return (i4 & -65536) != -65536 ? (char) (i4 >> 16) : parcel.readInt();
    }

    public static void t(Parcel parcel, int i4) {
        parcel.setDataPosition(parcel.dataPosition() + s(parcel, i4));
    }

    public static int u(Parcel parcel) {
        int o4 = o(parcel);
        int s4 = s(parcel, o4);
        int l4 = l(o4);
        int dataPosition = parcel.dataPosition();
        if (l4 == 20293) {
            int i4 = s4 + dataPosition;
            if (i4 >= dataPosition && i4 <= parcel.dataSize()) {
                return i4;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i4).length());
            sb.append("Size read is invalid start=");
            sb.append(dataPosition);
            sb.append(" end=");
            sb.append(i4);
            throw new a(sb.toString(), parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(o4))), parcel);
    }

    public static void v(Parcel parcel, int i4, int i5) {
        int s4 = s(parcel, i4);
        if (s4 != i5) {
            String hexString = Integer.toHexString(s4);
            int length = String.valueOf(i5).length();
            StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(s4).length() + 4 + String.valueOf(hexString).length() + 1);
            sb.append("Expected size ");
            sb.append(i5);
            sb.append(" got ");
            sb.append(s4);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new a(sb.toString(), parcel);
        }
    }
}
