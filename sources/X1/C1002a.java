package x1;

import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: x1.a  reason: case insensitive filesystem */
public final class C1002a implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = A1.b.u(r10)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r8 = r6
            r4 = r2
            r7 = r4
        L_0x000b:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x004b
            int r1 = A1.b.o(r10)
            int r2 = A1.b.l(r1)
            r3 = 1
            if (r2 == r3) goto L_0x0046
            r3 = 2
            if (r2 == r3) goto L_0x003c
            r3 = 3
            if (r2 == r3) goto L_0x0037
            r3 = 4
            if (r2 == r3) goto L_0x0032
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r3) goto L_0x002d
            A1.b.t(r10, r1)
            goto L_0x000b
        L_0x002d:
            int r4 = A1.b.q(r10, r1)
            goto L_0x000b
        L_0x0032:
            android.os.Bundle r8 = A1.b.a(r10, r1)
            goto L_0x000b
        L_0x0037:
            int r7 = A1.b.q(r10, r1)
            goto L_0x000b
        L_0x003c:
            android.os.Parcelable$Creator r2 = android.database.CursorWindow.CREATOR
            java.lang.Object[] r1 = A1.b.i(r10, r1, r2)
            r6 = r1
            android.database.CursorWindow[] r6 = (android.database.CursorWindow[]) r6
            goto L_0x000b
        L_0x0046:
            java.lang.String[] r5 = A1.b.g(r10, r1)
            goto L_0x000b
        L_0x004b:
            A1.b.k(r10, r0)
            com.google.android.gms.common.data.DataHolder r10 = new com.google.android.gms.common.data.DataHolder
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r10.g()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.C1002a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new DataHolder[i4];
    }
}
