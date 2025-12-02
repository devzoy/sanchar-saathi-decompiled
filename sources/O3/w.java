package O3;

import P3.d;
import i3.C0734k;
import v3.l;

public final class w extends e {

    /* renamed from: j  reason: collision with root package name */
    public final transient byte[][] f2152j;

    /* renamed from: k  reason: collision with root package name */
    public final transient int[] f2153k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(byte[][] bArr, int[] iArr) {
        super(e.f2093i.l());
        l.e(bArr, "segments");
        l.e(iArr, "directory");
        this.f2152j = bArr;
        this.f2153k = iArr;
    }

    public e E(int i4, int i5) {
        int d4 = C0297a.d(this, i5);
        if (i4 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i4 + " < 0").toString());
        } else if (d4 <= C()) {
            int i6 = d4 - i4;
            if (i6 < 0) {
                throw new IllegalArgumentException(("endIndex=" + d4 + " < beginIndex=" + i4).toString());
            } else if (i4 == 0 && d4 == C()) {
                return this;
            } else {
                if (i4 == d4) {
                    return e.f2093i;
                }
                int b4 = d.b(this, i4);
                int b5 = d.b(this, d4 - 1);
                byte[][] bArr = (byte[][]) C0734k.i(J(), b4, b5 + 1);
                int[] iArr = new int[(bArr.length * 2)];
                int i7 = 0;
                if (b4 <= b5) {
                    int i8 = b4;
                    int i9 = 0;
                    while (true) {
                        iArr[i9] = Math.min(I()[i8] - i4, i6);
                        int i10 = i9 + 1;
                        iArr[i9 + bArr.length] = I()[J().length + i8];
                        if (i8 == b5) {
                            break;
                        }
                        i8++;
                        i9 = i10;
                    }
                }
                if (b4 != 0) {
                    i7 = I()[b4 - 1];
                }
                int length = bArr.length;
                iArr[length] = iArr[length] + (i4 - i7);
                return new w(bArr, iArr);
            }
        } else {
            throw new IllegalArgumentException(("endIndex=" + d4 + " > length(" + C() + ')').toString());
        }
    }

    public void H(C0298b bVar, int i4, int i5) {
        l.e(bVar, "buffer");
        int i6 = i4 + i5;
        int b4 = d.b(this, i4);
        while (i4 < i6) {
            int i7 = b4 == 0 ? 0 : I()[b4 - 1];
            int i8 = I()[J().length + b4];
            int min = Math.min(i6, (I()[b4] - i7) + i7) - i4;
            int i9 = i8 + (i4 - i7);
            u uVar = new u(J()[b4], i9, i9 + min, true, false);
            u uVar2 = bVar.f2082e;
            if (uVar2 == null) {
                uVar.f2146g = uVar;
                uVar.f2145f = uVar;
                bVar.f2082e = uVar;
            } else {
                l.b(uVar2);
                u uVar3 = uVar2.f2146g;
                l.b(uVar3);
                uVar3.c(uVar);
            }
            i4 += min;
            b4++;
        }
        bVar.F(bVar.H() + ((long) i5));
    }

    public final int[] I() {
        return this.f2153k;
    }

    public final byte[][] J() {
        return this.f2152j;
    }

    public byte[] K() {
        byte[] bArr = new byte[C()];
        int length = J().length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = I()[length + i4];
            int i8 = I()[i4];
            int i9 = i8 - i5;
            C0734k.d(J()[i4], bArr, i6, i7, i7 + i9);
            i6 += i9;
            i4++;
            i5 = i8;
        }
        return bArr;
    }

    public final e L() {
        return new e(K());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.C() == C() && y(0, eVar, 0, C())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int m4 = m();
        if (m4 != 0) {
            return m4;
        }
        int length = J().length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int i7 = I()[length + i4];
            int i8 = I()[i4];
            byte[] bArr = J()[i4];
            int i9 = (i8 - i6) + i7;
            while (i7 < i9) {
                i5 = (i5 * 31) + bArr[i7];
                i7++;
            }
            i4++;
            i6 = i8;
        }
        A(i5);
        return i5;
    }

    public int n() {
        return I()[J().length - 1];
    }

    public String p() {
        return L().p();
    }

    public int r(byte[] bArr, int i4) {
        l.e(bArr, "other");
        return L().r(bArr, i4);
    }

    public byte[] t() {
        return K();
    }

    public String toString() {
        return L().toString();
    }

    public byte u(int i4) {
        C0297a.b((long) I()[J().length - 1], (long) i4, 1);
        int b4 = d.b(this, i4);
        return J()[b4][(i4 - (b4 == 0 ? 0 : I()[b4 - 1])) + I()[J().length + b4]];
    }

    public int w(byte[] bArr, int i4) {
        l.e(bArr, "other");
        return L().w(bArr, i4);
    }

    public boolean y(int i4, e eVar, int i5, int i6) {
        l.e(eVar, "other");
        if (i4 < 0 || i4 > C() - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int b4 = d.b(this, i4);
        while (i4 < i7) {
            int i8 = b4 == 0 ? 0 : I()[b4 - 1];
            int i9 = I()[J().length + b4];
            int min = Math.min(i7, (I()[b4] - i8) + i8) - i4;
            if (!eVar.z(i5, J()[b4], i9 + (i4 - i8), min)) {
                return false;
            }
            i5 += min;
            i4 += min;
            b4++;
        }
        return true;
    }

    public boolean z(int i4, byte[] bArr, int i5, int i6) {
        l.e(bArr, "other");
        if (i4 < 0 || i4 > C() - i6 || i5 < 0 || i5 > bArr.length - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int b4 = d.b(this, i4);
        while (i4 < i7) {
            int i8 = b4 == 0 ? 0 : I()[b4 - 1];
            int i9 = I()[J().length + b4];
            int min = Math.min(i7, (I()[b4] - i8) + i8) - i4;
            if (!C0297a.a(J()[b4], i9 + (i4 - i8), bArr, i5, min)) {
                return false;
            }
            i5 += min;
            i4 += min;
            b4++;
        }
        return true;
    }
}
