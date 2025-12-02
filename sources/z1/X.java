package z1;

import android.os.Parcelable;

public final class X implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = A1.b.u(r11)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r9 = r7
            r5 = r2
            r6 = r5
            r8 = r6
        L_0x000c:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0044
            int r1 = A1.b.o(r11)
            int r2 = A1.b.l(r1)
            switch(r2) {
                case 1: goto L_0x003a;
                case 2: goto L_0x0035;
                case 3: goto L_0x0030;
                case 4: goto L_0x002b;
                case 5: goto L_0x0026;
                case 6: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            A1.b.t(r11, r1)
            goto L_0x000c
        L_0x0021:
            int[] r9 = A1.b.d(r11, r1)
            goto L_0x000c
        L_0x0026:
            int r8 = A1.b.q(r11, r1)
            goto L_0x000c
        L_0x002b:
            int[] r7 = A1.b.d(r11, r1)
            goto L_0x000c
        L_0x0030:
            boolean r6 = A1.b.m(r11, r1)
            goto L_0x000c
        L_0x0035:
            boolean r5 = A1.b.m(r11, r1)
            goto L_0x000c
        L_0x003a:
            android.os.Parcelable$Creator<z1.q> r2 = z1.C1034q.CREATOR
            android.os.Parcelable r1 = A1.b.e(r11, r1, r2)
            r4 = r1
            z1.q r4 = (z1.C1034q) r4
            goto L_0x000c
        L_0x0044:
            A1.b.k(r11, r0)
            z1.f r11 = new z1.f
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.X.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1023f[i4];
    }
}
