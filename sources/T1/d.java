package T1;

import android.os.Parcelable;

public final class d implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v8, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v10, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v11, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v12, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r22) {
        /*
            r21 = this;
            r0 = r22
            int r1 = A1.b.u(r22)
            r2 = 0
            r3 = 0
            r5 = r2
            r8 = r5
            r20 = r8
            r6 = r3
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
        L_0x001d:
            int r2 = r22.dataPosition()
            if (r2 >= r1) goto L_0x00bc
            int r2 = A1.b.o(r22)
            int r3 = A1.b.l(r2)
            switch(r3) {
                case 2: goto L_0x00b6;
                case 3: goto L_0x00b0;
                case 4: goto L_0x00aa;
                case 5: goto L_0x00a4;
                case 6: goto L_0x0099;
                case 7: goto L_0x008f;
                case 8: goto L_0x0085;
                case 9: goto L_0x007b;
                case 10: goto L_0x0071;
                case 11: goto L_0x0067;
                case 12: goto L_0x005d;
                case 13: goto L_0x0052;
                case 14: goto L_0x0047;
                case 15: goto L_0x003c;
                case 16: goto L_0x0037;
                case 17: goto L_0x0032;
                default: goto L_0x002e;
            }
        L_0x002e:
            A1.b.t(r0, r2)
            goto L_0x001d
        L_0x0032:
            boolean r20 = A1.b.m(r0, r2)
            goto L_0x001d
        L_0x0037:
            byte[] r19 = A1.b.b(r0, r2)
            goto L_0x001d
        L_0x003c:
            android.os.Parcelable$Creator<T1.a$e> r3 = T1.a.e.CREATOR
            android.os.Parcelable r2 = A1.b.e(r0, r2, r3)
            r18 = r2
            T1.a$e r18 = (T1.a.e) r18
            goto L_0x001d
        L_0x0047:
            android.os.Parcelable$Creator<T1.a$d> r3 = T1.a.d.CREATOR
            android.os.Parcelable r2 = A1.b.e(r0, r2, r3)
            r17 = r2
            T1.a$d r17 = (T1.a.d) r17
            goto L_0x001d
        L_0x0052:
            android.os.Parcelable$Creator<T1.a$c> r3 = T1.a.c.CREATOR
            android.os.Parcelable r2 = A1.b.e(r0, r2, r3)
            r16 = r2
            T1.a$c r16 = (T1.a.c) r16
            goto L_0x001d
        L_0x005d:
            android.os.Parcelable$Creator<T1.a$g> r3 = T1.a.g.CREATOR
            android.os.Parcelable r2 = A1.b.e(r0, r2, r3)
            r15 = r2
            T1.a$g r15 = (T1.a.g) r15
            goto L_0x001d
        L_0x0067:
            android.os.Parcelable$Creator<T1.a$k> r3 = T1.a.k.CREATOR
            android.os.Parcelable r2 = A1.b.e(r0, r2, r3)
            r14 = r2
            T1.a$k r14 = (T1.a.k) r14
            goto L_0x001d
        L_0x0071:
            android.os.Parcelable$Creator<T1.a$l> r3 = T1.a.l.CREATOR
            android.os.Parcelable r2 = A1.b.e(r0, r2, r3)
            r13 = r2
            T1.a$l r13 = (T1.a.l) r13
            goto L_0x001d
        L_0x007b:
            android.os.Parcelable$Creator<T1.a$j> r3 = T1.a.j.CREATOR
            android.os.Parcelable r2 = A1.b.e(r0, r2, r3)
            r12 = r2
            T1.a$j r12 = (T1.a.j) r12
            goto L_0x001d
        L_0x0085:
            android.os.Parcelable$Creator<T1.a$i> r3 = T1.a.i.CREATOR
            android.os.Parcelable r2 = A1.b.e(r0, r2, r3)
            r11 = r2
            T1.a$i r11 = (T1.a.i) r11
            goto L_0x001d
        L_0x008f:
            android.os.Parcelable$Creator<T1.a$f> r3 = T1.a.f.CREATOR
            android.os.Parcelable r2 = A1.b.e(r0, r2, r3)
            r10 = r2
            T1.a$f r10 = (T1.a.f) r10
            goto L_0x001d
        L_0x0099:
            android.os.Parcelable$Creator r3 = android.graphics.Point.CREATOR
            java.lang.Object[] r2 = A1.b.i(r0, r2, r3)
            r9 = r2
            android.graphics.Point[] r9 = (android.graphics.Point[]) r9
            goto L_0x001d
        L_0x00a4:
            int r8 = A1.b.q(r0, r2)
            goto L_0x001d
        L_0x00aa:
            java.lang.String r7 = A1.b.f(r0, r2)
            goto L_0x001d
        L_0x00b0:
            java.lang.String r6 = A1.b.f(r0, r2)
            goto L_0x001d
        L_0x00b6:
            int r5 = A1.b.q(r0, r2)
            goto L_0x001d
        L_0x00bc:
            A1.b.k(r0, r1)
            T1.a r0 = new T1.a
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.d.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new a[i4];
    }
}
