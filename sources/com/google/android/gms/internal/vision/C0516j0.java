package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.j0  reason: case insensitive filesystem */
public final class C0516j0 extends C0539r0 {

    /* renamed from: j  reason: collision with root package name */
    public final int f7481j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7482k;

    public C0516j0(byte[] bArr, int i4, int i5) {
        super(bArr);
        C0507g0.D(i4, i4 + i5, bArr.length);
        this.f7481j = i4;
        this.f7482k = i5;
    }

    public final byte B(int i4) {
        return this.f7527i[this.f7481j + i4];
    }

    public final int J() {
        return this.f7481j;
    }

    public final byte s(int i4) {
        int t4 = t();
        if (((t4 - (i4 + 1)) | i4) >= 0) {
            return this.f7527i[this.f7481j + i4];
        }
        if (i4 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i4);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i4);
        sb2.append(", ");
        sb2.append(t4);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final int t() {
        return this.f7482k;
    }
}
