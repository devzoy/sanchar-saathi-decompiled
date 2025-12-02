package com.google.android.gms.internal.clearcut;

public final class B extends F {

    /* renamed from: i  reason: collision with root package name */
    public final int f6702i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6703j;

    public B(byte[] bArr, int i4, int i5) {
        super(bArr);
        C0477y.y(i4, i4 + i5, bArr.length);
        this.f6702i = i4;
        this.f6703j = i5;
    }

    public final byte B(int i4) {
        int size = size();
        if (((size - (i4 + 1)) | i4) >= 0) {
            return this.f6768h[this.f6702i + i4];
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
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final int F() {
        return this.f6702i;
    }

    public final int size() {
        return this.f6703j;
    }
}
