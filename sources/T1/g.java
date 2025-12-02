package T1;

import T1.a;
import android.os.Parcelable;

public final class g implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = A1.b.u(r11)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x000c:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0058
            int r1 = A1.b.o(r11)
            int r2 = A1.b.l(r1)
            switch(r2) {
                case 2: goto L_0x004e;
                case 3: goto L_0x0049;
                case 4: goto L_0x0044;
                case 5: goto L_0x003a;
                case 6: goto L_0x0030;
                case 7: goto L_0x002b;
                case 8: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            A1.b.t(r11, r1)
            goto L_0x000c
        L_0x0021:
            android.os.Parcelable$Creator<T1.a$a> r2 = T1.a.C0062a.CREATOR
            java.lang.Object[] r1 = A1.b.i(r11, r1, r2)
            r9 = r1
            T1.a$a[] r9 = (T1.a.C0062a[]) r9
            goto L_0x000c
        L_0x002b:
            java.lang.String[] r8 = A1.b.g(r11, r1)
            goto L_0x000c
        L_0x0030:
            android.os.Parcelable$Creator<T1.a$f> r2 = T1.a.f.CREATOR
            java.lang.Object[] r1 = A1.b.i(r11, r1, r2)
            r7 = r1
            T1.a$f[] r7 = (T1.a.f[]) r7
            goto L_0x000c
        L_0x003a:
            android.os.Parcelable$Creator<T1.a$i> r2 = T1.a.i.CREATOR
            java.lang.Object[] r1 = A1.b.i(r11, r1, r2)
            r6 = r1
            T1.a$i[] r6 = (T1.a.i[]) r6
            goto L_0x000c
        L_0x0044:
            java.lang.String r5 = A1.b.f(r11, r1)
            goto L_0x000c
        L_0x0049:
            java.lang.String r4 = A1.b.f(r11, r1)
            goto L_0x000c
        L_0x004e:
            android.os.Parcelable$Creator<T1.a$h> r2 = T1.a.h.CREATOR
            android.os.Parcelable r1 = A1.b.e(r11, r1, r2)
            r3 = r1
            T1.a$h r3 = (T1.a.h) r3
            goto L_0x000c
        L_0x0058:
            A1.b.k(r11, r0)
            T1.a$d r11 = new T1.a$d
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.g.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new a.d[i4];
    }
}
