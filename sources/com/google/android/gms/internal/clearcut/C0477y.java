package com.google.android.gms.internal.clearcut;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.y  reason: case insensitive filesystem */
public abstract class C0477y implements Serializable, Iterable {

    /* renamed from: f  reason: collision with root package name */
    public static final C0477y f7181f = new F(C0413c0.f7047c);

    /* renamed from: g  reason: collision with root package name */
    public static final C f7182g = (C0462t.b() ? new G((C0480z) null) : new A((C0480z) null));

    /* renamed from: e  reason: collision with root package name */
    public int f7183e = 0;

    public static C0477y A(String str) {
        return new F(str.getBytes(C0413c0.f7045a));
    }

    public static D C(int i4) {
        return new D(i4, (C0480z) null);
    }

    public static int y(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i4);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i5 < i4) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i4);
            sb2.append(", ");
            sb2.append(i5);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i5);
            sb3.append(" >= ");
            sb3.append(i6);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public static C0477y z(byte[] bArr, int i4, int i5) {
        return new F(f7182g.a(bArr, i4, i5));
    }

    public abstract byte B(int i4);

    public final String D() {
        return size() == 0 ? "" : u(C0413c0.f7045a);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i4 = this.f7183e;
        if (i4 == 0) {
            int size = size();
            i4 = s(size, 0, size);
            if (i4 == 0) {
                i4 = 1;
            }
            this.f7183e = i4;
        }
        return i4;
    }

    public /* synthetic */ Iterator iterator() {
        return new C0480z(this);
    }

    public abstract int s(int i4, int i5, int i6);

    public abstract int size();

    public abstract C0477y t(int i4, int i5);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public abstract String u(Charset charset);

    public abstract void v(C0474x xVar);

    public abstract boolean w();

    public final int x() {
        return this.f7183e;
    }
}
