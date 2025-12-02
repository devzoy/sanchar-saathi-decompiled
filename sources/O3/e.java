package O3;

import C3.o;
import i3.C0734k;
import java.io.Serializable;
import java.util.Arrays;
import v3.g;
import v3.l;

public class e implements Serializable, Comparable {

    /* renamed from: h  reason: collision with root package name */
    public static final a f2092h = new a((g) null);

    /* renamed from: i  reason: collision with root package name */
    public static final e f2093i = new e(new byte[0]);

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f2094e;

    /* renamed from: f  reason: collision with root package name */
    public transient int f2095f;

    /* renamed from: g  reason: collision with root package name */
    public transient String f2096g;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final e a(String str) {
            l.e(str, "<this>");
            e eVar = new e(B.a(str));
            eVar.B(str);
            return eVar;
        }

        public a() {
        }
    }

    public e(byte[] bArr) {
        l.e(bArr, "data");
        this.f2094e = bArr;
    }

    public static /* synthetic */ e F(e eVar, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = C0297a.c();
            }
            return eVar.E(i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static /* synthetic */ int s(e eVar, e eVar2, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i4 = 0;
            }
            return eVar.q(eVar2, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int x(e eVar, e eVar2, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i4 = C0297a.c();
            }
            return eVar.v(eVar2, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public final void A(int i4) {
        this.f2095f = i4;
    }

    public final void B(String str) {
        this.f2096g = str;
    }

    public final int C() {
        return n();
    }

    public final boolean D(e eVar) {
        l.e(eVar, "prefix");
        return y(0, eVar, 0, eVar.C());
    }

    public e E(int i4, int i5) {
        int d4 = C0297a.d(this, i5);
        if (i4 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        } else if (d4 > l().length) {
            throw new IllegalArgumentException(("endIndex > length(" + l().length + ')').toString());
        } else if (d4 - i4 >= 0) {
            return (i4 == 0 && d4 == l().length) ? this : new e(C0734k.h(l(), i4, d4));
        } else {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
    }

    public String G() {
        String o4 = o();
        if (o4 != null) {
            return o4;
        }
        String c4 = B.c(t());
        B(c4);
        return c4;
    }

    public void H(C0298b bVar, int i4, int i5) {
        l.e(bVar, "buffer");
        P3.a.c(this, bVar, i4, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r0 < r1) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x002a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(O3.e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            v3.l.e(r10, r0)
            int r0 = r9.C()
            int r1 = r10.C()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002e
            byte r7 = r9.k(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.k(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x002c
        L_0x002a:
            r3 = r5
            goto L_0x0034
        L_0x002c:
            r3 = r6
            goto L_0x0034
        L_0x002e:
            if (r0 != r1) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            if (r0 >= r1) goto L_0x002c
            goto L_0x002a
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.e.compareTo(O3.e):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.C() == l().length && eVar.z(0, l(), 0, l().length)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(e eVar) {
        l.e(eVar, "suffix");
        return y(C() - eVar.C(), eVar, 0, eVar.C());
    }

    public int hashCode() {
        int m4 = m();
        if (m4 != 0) {
            return m4;
        }
        int hashCode = Arrays.hashCode(l());
        A(hashCode);
        return hashCode;
    }

    public final byte k(int i4) {
        return u(i4);
    }

    public final byte[] l() {
        return this.f2094e;
    }

    public final int m() {
        return this.f2095f;
    }

    public int n() {
        return l().length;
    }

    public final String o() {
        return this.f2096g;
    }

    public String p() {
        char[] cArr = new char[(l().length * 2)];
        int i4 = 0;
        for (byte b4 : l()) {
            int i5 = i4 + 1;
            cArr[i4] = P3.a.d()[(b4 >> 4) & 15];
            i4 += 2;
            cArr[i5] = P3.a.d()[b4 & 15];
        }
        return o.l(cArr);
    }

    public final int q(e eVar, int i4) {
        l.e(eVar, "other");
        return r(eVar.t(), i4);
    }

    public int r(byte[] bArr, int i4) {
        l.e(bArr, "other");
        int length = l().length - bArr.length;
        int max = Math.max(i4, 0);
        if (max <= length) {
            while (!C0297a.a(l(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] t() {
        return l();
    }

    public String toString() {
        String str;
        if (l().length == 0) {
            str = "[size=0]";
        } else {
            int a4 = P3.a.b(l(), 64);
            if (a4 != -1) {
                String G4 = G();
                String substring = G4.substring(0, a4);
                l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String t4 = o.t(o.t(o.t(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a4 < G4.length()) {
                    return "[size=" + l().length + " text=" + t4 + "…]";
                }
                return "[text=" + t4 + ']';
            } else if (l().length <= 64) {
                str = "[hex=" + p() + ']';
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(l().length);
                sb.append(" hex=");
                int d4 = C0297a.d(this, 64);
                if (d4 > l().length) {
                    throw new IllegalArgumentException(("endIndex > length(" + l().length + ')').toString());
                } else if (d4 >= 0) {
                    sb.append((d4 == l().length ? this : new e(C0734k.h(l(), 0, d4))).p());
                    sb.append("…]");
                    return sb.toString();
                } else {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                }
            }
        }
        return str;
    }

    public byte u(int i4) {
        return l()[i4];
    }

    public final int v(e eVar, int i4) {
        l.e(eVar, "other");
        return w(eVar.t(), i4);
    }

    public int w(byte[] bArr, int i4) {
        l.e(bArr, "other");
        for (int min = Math.min(C0297a.d(this, i4), l().length - bArr.length); -1 < min; min--) {
            if (C0297a.a(l(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean y(int i4, e eVar, int i5, int i6) {
        l.e(eVar, "other");
        return eVar.z(i5, l(), i4, i6);
    }

    public boolean z(int i4, byte[] bArr, int i5, int i6) {
        l.e(bArr, "other");
        return i4 >= 0 && i4 <= l().length - i6 && i5 >= 0 && i5 <= bArr.length - i6 && C0297a.a(l(), i4, bArr, i5, i6);
    }
}
