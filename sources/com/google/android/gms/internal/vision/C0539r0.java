package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.vision.r0  reason: case insensitive filesystem */
public class C0539r0 extends C0531o0 {

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f7527i;

    public C0539r0(byte[] bArr) {
        bArr.getClass();
        this.f7527i = bArr;
    }

    public final void A(C0496d0 d0Var) {
        d0Var.a(this.f7527i, J(), t());
    }

    public byte B(int i4) {
        return this.f7527i[i4];
    }

    public final boolean G() {
        int J4 = J();
        return k2.g(this.f7527i, J4, t() + J4);
    }

    public final boolean I(C0507g0 g0Var, int i4, int i5) {
        if (i5 > g0Var.t()) {
            int t4 = t();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i5);
            sb.append(t4);
            throw new IllegalArgumentException(sb.toString());
        } else if (i5 > g0Var.t()) {
            int t5 = g0Var.t();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i5);
            sb2.append(", ");
            sb2.append(t5);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(g0Var instanceof C0539r0)) {
            return g0Var.w(0, i5).equals(w(0, i5));
        } else {
            C0539r0 r0Var = (C0539r0) g0Var;
            byte[] bArr = this.f7527i;
            byte[] bArr2 = r0Var.f7527i;
            int J4 = J() + i5;
            int J5 = J();
            int J6 = r0Var.J();
            while (J5 < J4) {
                if (bArr[J5] != bArr2[J6]) {
                    return false;
                }
                J5++;
                J6++;
            }
            return true;
        }
    }

    public int J() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0507g0) || t() != ((C0507g0) obj).t()) {
            return false;
        }
        if (t() == 0) {
            return true;
        }
        if (!(obj instanceof C0539r0)) {
            return obj.equals(this);
        }
        C0539r0 r0Var = (C0539r0) obj;
        int H4 = H();
        int H5 = r0Var.H();
        if (H4 == 0 || H5 == 0 || H4 == H5) {
            return I(r0Var, 0, t());
        }
        return false;
    }

    public byte s(int i4) {
        return this.f7527i[i4];
    }

    public int t() {
        return this.f7527i.length;
    }

    public final int v(int i4, int i5, int i6) {
        return R0.a(i4, this.f7527i, J(), i6);
    }

    public final C0507g0 w(int i4, int i5) {
        int D4 = C0507g0.D(0, i5, t());
        return D4 == 0 ? C0507g0.f7445f : new C0516j0(this.f7527i, J(), D4);
    }

    public final String z(Charset charset) {
        return new String(this.f7527i, J(), t(), charset);
    }
}
