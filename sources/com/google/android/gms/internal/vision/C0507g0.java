package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.vision.g0  reason: case insensitive filesystem */
public abstract class C0507g0 implements Serializable, Iterable {

    /* renamed from: f  reason: collision with root package name */
    public static final C0507g0 f7445f = new C0539r0(R0.f7359c);

    /* renamed from: g  reason: collision with root package name */
    public static final C0525m0 f7446g = (Z.b() ? new C0537q0((C0504f0) null) : new C0519k0((C0504f0) null));

    /* renamed from: h  reason: collision with root package name */
    public static final Comparator f7447h = new C0513i0();

    /* renamed from: e  reason: collision with root package name */
    public int f7448e = 0;

    public static int C(byte b4) {
        return b4 & 255;
    }

    public static int D(int i4, int i5, int i6) {
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

    public static C0534p0 F(int i4) {
        return new C0534p0(i4, (C0504f0) null);
    }

    public static C0507g0 x(String str) {
        return new C0539r0(str.getBytes(R0.f7357a));
    }

    public static C0507g0 y(byte[] bArr, int i4, int i5) {
        D(i4, i4 + i5, bArr.length);
        return new C0539r0(f7446g.a(bArr, i4, i5));
    }

    public abstract void A(C0496d0 d0Var);

    public abstract byte B(int i4);

    public final String E() {
        return t() == 0 ? "" : z(R0.f7357a);
    }

    public abstract boolean G();

    public final int H() {
        return this.f7448e;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i4 = this.f7448e;
        if (i4 == 0) {
            int t4 = t();
            i4 = v(t4, 0, t4);
            if (i4 == 0) {
                i4 = 1;
            }
            this.f7448e = i4;
        }
        return i4;
    }

    public /* synthetic */ Iterator iterator() {
        return new C0504f0(this);
    }

    public abstract byte s(int i4);

    public abstract int t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(t()), t() <= 50 ? X1.a(this) : String.valueOf(X1.a(w(0, 47))).concat("...")});
    }

    public abstract int v(int i4, int i5, int i6);

    public abstract C0507g0 w(int i4, int i5);

    public abstract String z(Charset charset);
}
