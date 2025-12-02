package z1;

import A1.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class Y implements Parcelable.Creator {
    public static void a(C1024g gVar, Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.i(parcel, 1, gVar.f12977e);
        c.i(parcel, 2, gVar.f12978f);
        c.i(parcel, 3, gVar.f12979g);
        c.m(parcel, 4, gVar.f12980h, false);
        c.h(parcel, 5, gVar.f12981i, false);
        c.p(parcel, 6, gVar.f12982j, i4, false);
        c.d(parcel, 7, gVar.f12983k, false);
        c.l(parcel, 8, gVar.f12984l, i4, false);
        c.p(parcel, 10, gVar.f12985m, i4, false);
        c.p(parcel, 11, gVar.f12986n, i4, false);
        c.c(parcel, 12, gVar.f12987o);
        c.i(parcel, 13, gVar.f12988p);
        c.c(parcel, 14, gVar.f12989q);
        c.m(parcel, 15, gVar.d(), false);
        c.b(parcel, a4);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            int r1 = A1.b.u(r23)
            com.google.android.gms.common.api.Scope[] r2 = z1.C1024g.f12975s
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            u1.c[] r4 = z1.C1024g.f12976t
            r5 = 0
            r6 = 0
            r13 = r2
            r14 = r3
            r16 = r4
            r17 = r16
            r11 = r5
            r12 = r11
            r15 = r12
            r21 = r15
            r8 = r6
            r9 = r8
            r10 = r9
            r18 = r10
            r19 = r18
            r20 = r19
        L_0x0025:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto L_0x0096
            int r2 = A1.b.o(r23)
            int r3 = A1.b.l(r2)
            switch(r3) {
                case 1: goto L_0x0091;
                case 2: goto L_0x008c;
                case 3: goto L_0x0087;
                case 4: goto L_0x0082;
                case 5: goto L_0x007d;
                case 6: goto L_0x0073;
                case 7: goto L_0x006e;
                case 8: goto L_0x0064;
                case 9: goto L_0x0036;
                case 10: goto L_0x0059;
                case 11: goto L_0x004e;
                case 12: goto L_0x0049;
                case 13: goto L_0x0044;
                case 14: goto L_0x003f;
                case 15: goto L_0x003a;
                default: goto L_0x0036;
            }
        L_0x0036:
            A1.b.t(r0, r2)
            goto L_0x0025
        L_0x003a:
            java.lang.String r21 = A1.b.f(r0, r2)
            goto L_0x0025
        L_0x003f:
            boolean r20 = A1.b.m(r0, r2)
            goto L_0x0025
        L_0x0044:
            int r19 = A1.b.q(r0, r2)
            goto L_0x0025
        L_0x0049:
            boolean r18 = A1.b.m(r0, r2)
            goto L_0x0025
        L_0x004e:
            android.os.Parcelable$Creator<u1.c> r3 = u1.c.CREATOR
            java.lang.Object[] r2 = A1.b.i(r0, r2, r3)
            r17 = r2
            u1.c[] r17 = (u1.c[]) r17
            goto L_0x0025
        L_0x0059:
            android.os.Parcelable$Creator<u1.c> r3 = u1.c.CREATOR
            java.lang.Object[] r2 = A1.b.i(r0, r2, r3)
            r16 = r2
            u1.c[] r16 = (u1.c[]) r16
            goto L_0x0025
        L_0x0064:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = A1.b.e(r0, r2, r3)
            r15 = r2
            android.accounts.Account r15 = (android.accounts.Account) r15
            goto L_0x0025
        L_0x006e:
            android.os.Bundle r14 = A1.b.a(r0, r2)
            goto L_0x0025
        L_0x0073:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = A1.b.i(r0, r2, r3)
            r13 = r2
            com.google.android.gms.common.api.Scope[] r13 = (com.google.android.gms.common.api.Scope[]) r13
            goto L_0x0025
        L_0x007d:
            android.os.IBinder r12 = A1.b.p(r0, r2)
            goto L_0x0025
        L_0x0082:
            java.lang.String r11 = A1.b.f(r0, r2)
            goto L_0x0025
        L_0x0087:
            int r10 = A1.b.q(r0, r2)
            goto L_0x0025
        L_0x008c:
            int r9 = A1.b.q(r0, r2)
            goto L_0x0025
        L_0x0091:
            int r8 = A1.b.q(r0, r2)
            goto L_0x0025
        L_0x0096:
            A1.b.k(r0, r1)
            z1.g r0 = new z1.g
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.Y.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1024g[i4];
    }
}
