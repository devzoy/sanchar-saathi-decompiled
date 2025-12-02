package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;

public class F extends E {

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f6768h;

    public F(byte[] bArr) {
        this.f6768h = bArr;
    }

    public byte B(int i4) {
        return this.f6768h[i4];
    }

    public final boolean E(C0477y yVar, int i4, int i5) {
        if (i5 > yVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i5);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i5 > yVar.size()) {
            int size2 = yVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i5);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(yVar instanceof F)) {
            return yVar.t(0, i5).equals(t(0, i5));
        } else {
            F f4 = (F) yVar;
            byte[] bArr = this.f6768h;
            byte[] bArr2 = f4.f6768h;
            int F4 = F() + i5;
            int F5 = F();
            int F6 = f4.F();
            while (F5 < F4) {
                if (bArr[F5] != bArr2[F6]) {
                    return false;
                }
                F5++;
                F6++;
            }
            return true;
        }
    }

    public int F() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0477y) || size() != ((C0477y) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof F)) {
            return obj.equals(this);
        }
        F f4 = (F) obj;
        int x4 = x();
        int x5 = f4.x();
        if (x4 == 0 || x5 == 0 || x4 == x5) {
            return E(f4, 0, size());
        }
        return false;
    }

    public final int s(int i4, int i5, int i6) {
        return C0413c0.c(i4, this.f6768h, F(), i6);
    }

    public int size() {
        return this.f6768h.length;
    }

    public final C0477y t(int i4, int i5) {
        int y4 = C0477y.y(0, i5, size());
        return y4 == 0 ? C0477y.f7181f : new B(this.f6768h, F(), y4);
    }

    public final String u(Charset charset) {
        return new String(this.f6768h, F(), size(), charset);
    }

    public final void v(C0474x xVar) {
        xVar.a(this.f6768h, F(), size());
    }

    public final boolean w() {
        int F4 = F();
        return C0429h1.i(this.f6768h, F4, size() + F4);
    }
}
