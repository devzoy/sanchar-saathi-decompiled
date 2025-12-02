package O1;

import A1.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class a extends A1.a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* renamed from: m  reason: collision with root package name */
    public static final byte[][] f2028m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f2029n;

    /* renamed from: o  reason: collision with root package name */
    public static final C0042a f2030o = new c();

    /* renamed from: p  reason: collision with root package name */
    public static final C0042a f2031p = new d();

    /* renamed from: q  reason: collision with root package name */
    public static final C0042a f2032q = new e();

    /* renamed from: r  reason: collision with root package name */
    public static final C0042a f2033r = new f();

    /* renamed from: e  reason: collision with root package name */
    public final String f2034e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f2035f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[][] f2036g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[][] f2037h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[][] f2038i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[][] f2039j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f2040k;

    /* renamed from: l  reason: collision with root package name */
    public final byte[][] f2041l;

    /* renamed from: O1.a$a  reason: collision with other inner class name */
    public interface C0042a {
    }

    static {
        byte[][] bArr = new byte[0][];
        f2028m = bArr;
        f2029n = new a("", (byte[]) null, bArr, bArr, bArr, bArr, (int[]) null, (byte[][]) null);
    }

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f2034e = str;
        this.f2035f = bArr;
        this.f2036g = bArr2;
        this.f2037h = bArr3;
        this.f2038i = bArr4;
        this.f2039j = bArr5;
        this.f2040k = iArr;
        this.f2041l = bArr6;
    }

    public static List d(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List e(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void g(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z4 = true;
            int i4 = 0;
            while (i4 < length) {
                byte[] bArr2 = bArr[i4];
                if (!z4) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i4++;
                z4 = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return j.a(this.f2034e, aVar.f2034e) && Arrays.equals(this.f2035f, aVar.f2035f) && j.a(e(this.f2036g), e(aVar.f2036g)) && j.a(e(this.f2037h), e(aVar.f2037h)) && j.a(e(this.f2038i), e(aVar.f2038i)) && j.a(e(this.f2039j), e(aVar.f2039j)) && j.a(d(this.f2040k), d(aVar.f2040k)) && j.a(e(this.f2041l), e(aVar.f2041l));
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.f2034e;
        if (str2 == null) {
            str = "null";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2);
            sb2.append("'");
            sb2.append(str2);
            sb2.append("'");
            str = sb2.toString();
        }
        sb.append(str);
        sb.append(", ");
        byte[] bArr = this.f2035f;
        sb.append("direct");
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        g(sb, "GAIA", this.f2036g);
        sb.append(", ");
        g(sb, "PSEUDO", this.f2037h);
        sb.append(", ");
        g(sb, "ALWAYS", this.f2038i);
        sb.append(", ");
        g(sb, "OTHER", this.f2039j);
        sb.append(", ");
        int[] iArr = this.f2040k;
        sb.append("weak");
        sb.append("=");
        if (iArr == null) {
            sb.append("null");
        } else {
            sb.append("(");
            int length = iArr.length;
            boolean z4 = true;
            int i4 = 0;
            while (i4 < length) {
                int i5 = iArr[i4];
                if (!z4) {
                    sb.append(", ");
                }
                sb.append(i5);
                i4++;
                z4 = false;
            }
            sb.append(")");
        }
        sb.append(", ");
        g(sb, "directs", this.f2041l);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.m(parcel, 2, this.f2034e, false);
        c.e(parcel, 3, this.f2035f, false);
        c.f(parcel, 4, this.f2036g, false);
        c.f(parcel, 5, this.f2037h, false);
        c.f(parcel, 6, this.f2038i, false);
        c.f(parcel, 7, this.f2039j, false);
        c.j(parcel, 8, this.f2040k, false);
        c.f(parcel, 9, this.f2041l, false);
        c.b(parcel, a4);
    }
}
