package D2;

import com.google.gson.internal.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;

public class a implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public final Reader f735e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f736f = false;

    /* renamed from: g  reason: collision with root package name */
    public final char[] f737g = new char[1024];

    /* renamed from: h  reason: collision with root package name */
    public int f738h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f739i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f740j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f741k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f742l = 0;

    /* renamed from: m  reason: collision with root package name */
    public long f743m;

    /* renamed from: n  reason: collision with root package name */
    public int f744n;

    /* renamed from: o  reason: collision with root package name */
    public String f745o;

    /* renamed from: p  reason: collision with root package name */
    public int[] f746p;

    /* renamed from: q  reason: collision with root package name */
    public int f747q;

    /* renamed from: r  reason: collision with root package name */
    public String[] f748r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f749s;

    /* renamed from: D2.a$a  reason: collision with other inner class name */
    public class C0006a extends e {
        public void a(a aVar) {
            if (aVar instanceof com.google.gson.internal.bind.a) {
                ((com.google.gson.internal.bind.a) aVar).X();
                return;
            }
            int i4 = aVar.f742l;
            if (i4 == 0) {
                i4 = aVar.f();
            }
            if (i4 == 13) {
                aVar.f742l = 9;
            } else if (i4 == 12) {
                aVar.f742l = 8;
            } else if (i4 == 14) {
                aVar.f742l = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.F() + aVar.m());
            }
        }
    }

    static {
        e.f8524a = new C0006a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f746p = iArr;
        this.f747q = 1;
        iArr[0] = 6;
        this.f748r = new String[32];
        this.f749s = new int[32];
        if (reader != null) {
            this.f735e = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r1 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f738h = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String B(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f737g
            r1 = 0
        L_0x0003:
            int r2 = r9.f738h
            int r3 = r9.f739i
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x005a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L_0x0028
            r9.f738h = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0020
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L_0x0020:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0028:
            r8 = 92
            if (r2 != r8) goto L_0x004d
            r9.f738h = r7
            int r7 = r7 - r3
            int r2 = r7 + -1
            if (r1 != 0) goto L_0x003e
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L_0x003e:
            r1.append(r0, r3, r2)
            char r2 = r9.L()
            r1.append(r2)
            int r2 = r9.f738h
            int r3 = r9.f739i
            goto L_0x0007
        L_0x004d:
            r5 = 10
            if (r2 != r5) goto L_0x0058
            int r2 = r9.f740j
            int r2 = r2 + r6
            r9.f740j = r2
            r9.f741k = r7
        L_0x0058:
            r2 = r7
            goto L_0x0009
        L_0x005a:
            if (r1 != 0) goto L_0x006a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x006a:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f738h = r2
            boolean r2 = r9.i(r6)
            if (r2 == 0) goto L_0x0078
            goto L_0x0003
        L_0x0078:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.S(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.a.B(char):java.lang.String");
    }

    public String C() {
        String str;
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        if (i4 == 10) {
            str = D();
        } else if (i4 == 8) {
            str = B('\'');
        } else if (i4 == 9) {
            str = B('\"');
        } else if (i4 == 11) {
            str = this.f745o;
            this.f745o = null;
        } else if (i4 == 15) {
            str = Long.toString(this.f743m);
        } else if (i4 == 16) {
            str = new String(this.f737g, this.f738h, this.f744n);
            this.f738h += this.f744n;
        } else {
            throw new IllegalStateException("Expected a string but was " + F() + m());
        }
        this.f742l = 0;
        int[] iArr = this.f749s;
        int i5 = this.f747q - 1;
        iArr[i5] = iArr[i5] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String D() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r6.f738h
            int r4 = r3 + r2
            int r5 = r6.f739i
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f737g
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.d()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f737g
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.i(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r1 = r2
            goto L_0x007e
        L_0x005e:
            if (r0 != 0) goto L_0x006b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f737g
            int r4 = r6.f738h
            r0.append(r3, r4, r2)
            int r3 = r6.f738h
            int r3 = r3 + r2
            r6.f738h = r3
            r2 = 1
            boolean r2 = r6.i(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f737g
            int r3 = r6.f738h
            r0.<init>(r2, r3, r1)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f737g
            int r3 = r6.f738h
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L_0x0095:
            int r2 = r6.f738h
            int r2 = r2 + r1
            r6.f738h = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.a.D():java.lang.String");
    }

    public b F() {
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        switch (i4) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                return b.STRING;
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int H() {
        int i4;
        String str;
        String str2;
        char c4 = this.f737g[this.f738h];
        if (c4 == 't' || c4 == 'T') {
            str2 = "true";
            str = "TRUE";
            i4 = 5;
        } else if (c4 == 'f' || c4 == 'F') {
            str2 = "false";
            str = "FALSE";
            i4 = 6;
        } else if (c4 != 'n' && c4 != 'N') {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i4 = 7;
        }
        int length = str2.length();
        for (int i5 = 1; i5 < length; i5++) {
            if (this.f738h + i5 >= this.f739i && !i(i5 + 1)) {
                return 0;
            }
            char c5 = this.f737g[this.f738h + i5];
            if (c5 != str2.charAt(i5) && c5 != str.charAt(i5)) {
                return 0;
            }
        }
        if ((this.f738h + length < this.f739i || i(length + 1)) && l(this.f737g[this.f738h + length])) {
            return 0;
        }
        this.f738h += length;
        this.f742l = i4;
        return i4;
    }

    public final int J() {
        char c4;
        char c5;
        char[] cArr = this.f737g;
        int i4 = this.f738h;
        int i5 = this.f739i;
        int i6 = 0;
        int i7 = 0;
        char c6 = 0;
        boolean z4 = false;
        boolean z5 = true;
        long j4 = 0;
        while (true) {
            if (i4 + i7 == i5) {
                if (i7 == cArr.length) {
                    return i6;
                }
                if (!i(i7 + 1)) {
                    break;
                }
                i4 = this.f738h;
                i5 = this.f739i;
            }
            c4 = cArr[i4 + i7];
            if (c4 == '+') {
                c5 = 6;
                i6 = 0;
                if (c6 != 5) {
                    return 0;
                }
            } else if (c4 == 'E' || c4 == 'e') {
                i6 = 0;
                if (c6 != 2 && c6 != 4) {
                    return 0;
                }
                c6 = 5;
                i7++;
            } else if (c4 != '-') {
                c5 = 3;
                if (c4 == '.') {
                    i6 = 0;
                    if (c6 != 2) {
                        return 0;
                    }
                } else if (c4 >= '0' && c4 <= '9') {
                    if (c6 == 1 || c6 == 0) {
                        j4 = (long) (-(c4 - '0'));
                        c6 = 2;
                    } else if (c6 != 2) {
                        if (c6 == 3) {
                            i6 = 0;
                            c6 = 4;
                        } else if (c6 == 5 || c6 == 6) {
                            i6 = 0;
                            c6 = 7;
                        }
                        i7++;
                    } else if (j4 == 0) {
                        return 0;
                    } else {
                        long j5 = (10 * j4) - ((long) (c4 - '0'));
                        int i8 = (j4 > -922337203685477580L ? 1 : (j4 == -922337203685477580L ? 0 : -1));
                        z5 &= i8 > 0 || (i8 == 0 && j5 < j4);
                        j4 = j5;
                    }
                    i6 = 0;
                    i7++;
                }
            } else {
                c5 = 6;
                i6 = 0;
                if (c6 == 0) {
                    c6 = 1;
                    z4 = true;
                    i7++;
                } else if (c6 != 5) {
                    return 0;
                }
            }
            c6 = c5;
            i7++;
        }
        if (l(c4)) {
            return 0;
        }
        if (c6 == 2 && z5 && ((j4 != Long.MIN_VALUE || z4) && (j4 != 0 || !z4))) {
            if (!z4) {
                j4 = -j4;
            }
            this.f743m = j4;
            this.f738h += i7;
            this.f742l = 15;
            return 15;
        } else if (c6 != 2 && c6 != 4 && c6 != 7) {
            return 0;
        } else {
            this.f744n = i7;
            this.f742l = 16;
            return 16;
        }
    }

    public final void K(int i4) {
        int i5 = this.f747q;
        int[] iArr = this.f746p;
        if (i5 == iArr.length) {
            int i6 = i5 * 2;
            this.f746p = Arrays.copyOf(iArr, i6);
            this.f749s = Arrays.copyOf(this.f749s, i6);
            this.f748r = (String[]) Arrays.copyOf(this.f748r, i6);
        }
        int[] iArr2 = this.f746p;
        int i7 = this.f747q;
        this.f747q = i7 + 1;
        iArr2[i7] = i4;
    }

    public final char L() {
        int i4;
        if (this.f738h != this.f739i || i(1)) {
            char[] cArr = this.f737g;
            int i5 = this.f738h;
            int i6 = i5 + 1;
            this.f738h = i6;
            char c4 = cArr[i5];
            if (c4 == 10) {
                this.f740j++;
                this.f741k = i6;
            } else if (!(c4 == '\"' || c4 == '\'' || c4 == '/' || c4 == '\\')) {
                if (c4 == 'b') {
                    return 8;
                }
                if (c4 == 'f') {
                    return 12;
                }
                if (c4 == 'n') {
                    return 10;
                }
                if (c4 == 'r') {
                    return 13;
                }
                if (c4 == 't') {
                    return 9;
                }
                if (c4 != 'u') {
                    throw S("Invalid escape sequence");
                } else if (i5 + 5 <= this.f739i || i(4)) {
                    int i7 = this.f738h;
                    int i8 = i7 + 4;
                    char c5 = 0;
                    while (i7 < i8) {
                        char c6 = this.f737g[i7];
                        char c7 = (char) (c5 << 4);
                        if (c6 >= '0' && c6 <= '9') {
                            i4 = c6 - '0';
                        } else if (c6 >= 'a' && c6 <= 'f') {
                            i4 = c6 - 'W';
                        } else if (c6 < 'A' || c6 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f737g, this.f738h, 4));
                        } else {
                            i4 = c6 - '7';
                        }
                        c5 = (char) (c7 + i4);
                        i7++;
                    }
                    this.f738h += 4;
                    return c5;
                } else {
                    throw S("Unterminated escape sequence");
                }
            }
            return c4;
        }
        throw S("Unterminated escape sequence");
    }

    public final void M(boolean z4) {
        this.f736f = z4;
    }

    public final void N(char c4) {
        char[] cArr = this.f737g;
        do {
            int i4 = this.f738h;
            int i5 = this.f739i;
            while (i4 < i5) {
                int i6 = i4 + 1;
                char c5 = cArr[i4];
                if (c5 == c4) {
                    this.f738h = i6;
                    return;
                } else if (c5 == '\\') {
                    this.f738h = i6;
                    L();
                    i4 = this.f738h;
                    i5 = this.f739i;
                } else {
                    if (c5 == 10) {
                        this.f740j++;
                        this.f741k = i6;
                    }
                    i4 = i6;
                }
            }
            this.f738h = i4;
        } while (i(1));
        throw S("Unterminated string");
    }

    public final boolean O(String str) {
        int length = str.length();
        while (true) {
            int i4 = 0;
            if (this.f738h + length > this.f739i && !i(length)) {
                return false;
            }
            char[] cArr = this.f737g;
            int i5 = this.f738h;
            if (cArr[i5] == 10) {
                this.f740j++;
                this.f741k = i5 + 1;
            } else {
                while (i4 < length) {
                    if (this.f737g[this.f738h + i4] == str.charAt(i4)) {
                        i4++;
                    }
                }
                return true;
            }
            this.f738h++;
        }
    }

    public final void P() {
        char c4;
        do {
            if (this.f738h < this.f739i || i(1)) {
                char[] cArr = this.f737g;
                int i4 = this.f738h;
                int i5 = i4 + 1;
                this.f738h = i5;
                c4 = cArr[i4];
                if (c4 == 10) {
                    this.f740j++;
                    this.f741k = i5;
                    return;
                }
            } else {
                return;
            }
        } while (c4 != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f738h
            int r2 = r1 + r0
            int r3 = r4.f739i
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f737g
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.d()
        L_0x004b:
            int r1 = r4.f738h
            int r1 = r1 + r0
            r4.f738h = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f738h = r1
            r0 = 1
            boolean r0 = r4.i(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.a.Q():void");
    }

    public void R() {
        int i4 = 0;
        do {
            int i5 = this.f742l;
            if (i5 == 0) {
                i5 = f();
            }
            if (i5 == 3) {
                K(1);
            } else if (i5 == 1) {
                K(3);
            } else {
                if (i5 == 4) {
                    this.f747q--;
                } else if (i5 == 2) {
                    this.f747q--;
                } else if (i5 == 14 || i5 == 10) {
                    Q();
                    this.f742l = 0;
                } else if (i5 == 8 || i5 == 12) {
                    N('\'');
                    this.f742l = 0;
                } else if (i5 == 9 || i5 == 13) {
                    N('\"');
                    this.f742l = 0;
                } else {
                    if (i5 == 16) {
                        this.f738h += this.f744n;
                    }
                    this.f742l = 0;
                }
                i4--;
                this.f742l = 0;
            }
            i4++;
            this.f742l = 0;
        } while (i4 != 0);
        int[] iArr = this.f749s;
        int i6 = this.f747q;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.f748r[i6 - 1] = "null";
    }

    public final IOException S(String str) {
        throw new d(str + m());
    }

    public void b() {
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        if (i4 == 3) {
            K(1);
            this.f749s[this.f747q - 1] = 0;
            this.f742l = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + F() + m());
    }

    public void c() {
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        if (i4 == 1) {
            K(3);
            this.f742l = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + F() + m());
    }

    public void close() {
        this.f742l = 0;
        this.f746p[0] = 8;
        this.f747q = 1;
        this.f735e.close();
    }

    public final void d() {
        if (!this.f736f) {
            throw S("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final void e() {
        y(true);
        int i4 = this.f738h;
        int i5 = i4 - 1;
        this.f738h = i5;
        if (i4 + 4 <= this.f739i || i(5)) {
            char[] cArr = this.f737g;
            if (cArr[i5] == ')' && cArr[i4] == ']' && cArr[i4 + 1] == '}' && cArr[i4 + 2] == '\'' && cArr[i4 + 3] == 10) {
                this.f738h += 5;
            }
        }
    }

    public int f() {
        int y4;
        int[] iArr = this.f746p;
        int i4 = this.f747q;
        int i5 = iArr[i4 - 1];
        if (i5 == 1) {
            iArr[i4 - 1] = 2;
        } else if (i5 == 2) {
            int y5 = y(true);
            if (y5 != 44) {
                if (y5 == 59) {
                    d();
                } else if (y5 == 93) {
                    this.f742l = 4;
                    return 4;
                } else {
                    throw S("Unterminated array");
                }
            }
        } else if (i5 == 3 || i5 == 5) {
            iArr[i4 - 1] = 4;
            if (i5 == 5 && (y4 = y(true)) != 44) {
                if (y4 == 59) {
                    d();
                } else if (y4 == 125) {
                    this.f742l = 2;
                    return 2;
                } else {
                    throw S("Unterminated object");
                }
            }
            int y6 = y(true);
            if (y6 == 34) {
                this.f742l = 13;
                return 13;
            } else if (y6 == 39) {
                d();
                this.f742l = 12;
                return 12;
            } else if (y6 != 125) {
                d();
                this.f738h--;
                if (l((char) y6)) {
                    this.f742l = 14;
                    return 14;
                }
                throw S("Expected name");
            } else if (i5 != 5) {
                this.f742l = 2;
                return 2;
            } else {
                throw S("Expected name");
            }
        } else if (i5 == 4) {
            iArr[i4 - 1] = 5;
            int y7 = y(true);
            if (y7 != 58) {
                if (y7 == 61) {
                    d();
                    if (this.f738h < this.f739i || i(1)) {
                        char[] cArr = this.f737g;
                        int i6 = this.f738h;
                        if (cArr[i6] == '>') {
                            this.f738h = i6 + 1;
                        }
                    }
                } else {
                    throw S("Expected ':'");
                }
            }
        } else if (i5 == 6) {
            if (this.f736f) {
                e();
            }
            this.f746p[this.f747q - 1] = 7;
        } else if (i5 == 7) {
            if (y(false) == -1) {
                this.f742l = 17;
                return 17;
            }
            d();
            this.f738h--;
        } else if (i5 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int y8 = y(true);
        if (y8 == 34) {
            this.f742l = 9;
            return 9;
        } else if (y8 != 39) {
            if (!(y8 == 44 || y8 == 59)) {
                if (y8 == 91) {
                    this.f742l = 3;
                    return 3;
                } else if (y8 != 93) {
                    if (y8 != 123) {
                        this.f738h--;
                        int H4 = H();
                        if (H4 != 0) {
                            return H4;
                        }
                        int J4 = J();
                        if (J4 != 0) {
                            return J4;
                        }
                        if (l(this.f737g[this.f738h])) {
                            d();
                            this.f742l = 10;
                            return 10;
                        }
                        throw S("Expected value");
                    }
                    this.f742l = 1;
                    return 1;
                } else if (i5 == 1) {
                    this.f742l = 4;
                    return 4;
                }
            }
            if (i5 == 1 || i5 == 2) {
                d();
                this.f738h--;
                this.f742l = 7;
                return 7;
            }
            throw S("Unexpected value");
        } else {
            d();
            this.f742l = 8;
            return 8;
        }
    }

    public void g() {
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        if (i4 == 4) {
            int i5 = this.f747q;
            this.f747q = i5 - 1;
            int[] iArr = this.f749s;
            int i6 = i5 - 2;
            iArr[i6] = iArr[i6] + 1;
            this.f742l = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + F() + m());
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i4 = this.f747q;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.f746p[i5];
            if (i6 == 1 || i6 == 2) {
                sb.append('[');
                sb.append(this.f749s[i5]);
                sb.append(']');
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                sb.append('.');
                String str = this.f748r[i5];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public void h() {
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        if (i4 == 2) {
            int i5 = this.f747q;
            int i6 = i5 - 1;
            this.f747q = i6;
            this.f748r[i6] = null;
            int[] iArr = this.f749s;
            int i7 = i5 - 2;
            iArr[i7] = iArr[i7] + 1;
            this.f742l = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + F() + m());
    }

    public final boolean i(int i4) {
        int i5;
        int i6;
        char[] cArr = this.f737g;
        int i7 = this.f741k;
        int i8 = this.f738h;
        this.f741k = i7 - i8;
        int i9 = this.f739i;
        if (i9 != i8) {
            int i10 = i9 - i8;
            this.f739i = i10;
            System.arraycopy(cArr, i8, cArr, 0, i10);
        } else {
            this.f739i = 0;
        }
        this.f738h = 0;
        do {
            Reader reader = this.f735e;
            int i11 = this.f739i;
            int read = reader.read(cArr, i11, cArr.length - i11);
            if (read == -1) {
                return false;
            }
            i5 = this.f739i + read;
            this.f739i = i5;
            if (this.f740j == 0 && (i6 = this.f741k) == 0 && i5 > 0 && cArr[0] == 65279) {
                this.f738h++;
                this.f741k = i6 + 1;
                i4++;
                continue;
            }
        } while (i5 < i4);
        return true;
    }

    public boolean j() {
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        return (i4 == 2 || i4 == 4) ? false : true;
    }

    public final boolean k() {
        return this.f736f;
    }

    public final boolean l(char c4) {
        if (c4 == 9 || c4 == 10 || c4 == 12 || c4 == 13 || c4 == ' ') {
            return false;
        }
        if (c4 != '#') {
            if (c4 == ',') {
                return false;
            }
            if (!(c4 == '/' || c4 == '=')) {
                if (c4 == '{' || c4 == '}' || c4 == ':') {
                    return false;
                }
                if (c4 != ';') {
                    switch (c4) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    public String m() {
        return " at line " + (this.f740j + 1) + " column " + ((this.f738h - this.f741k) + 1) + " path " + getPath();
    }

    public boolean r() {
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        if (i4 == 5) {
            this.f742l = 0;
            int[] iArr = this.f749s;
            int i5 = this.f747q - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        } else if (i4 == 6) {
            this.f742l = 0;
            int[] iArr2 = this.f749s;
            int i6 = this.f747q - 1;
            iArr2[i6] = iArr2[i6] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + F() + m());
        }
    }

    public double s() {
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        if (i4 == 15) {
            this.f742l = 0;
            int[] iArr = this.f749s;
            int i5 = this.f747q - 1;
            iArr[i5] = iArr[i5] + 1;
            return (double) this.f743m;
        }
        if (i4 == 16) {
            this.f745o = new String(this.f737g, this.f738h, this.f744n);
            this.f738h += this.f744n;
        } else if (i4 == 8 || i4 == 9) {
            this.f745o = B(i4 == 8 ? '\'' : '\"');
        } else if (i4 == 10) {
            this.f745o = D();
        } else if (i4 != 11) {
            throw new IllegalStateException("Expected a double but was " + F() + m());
        }
        this.f742l = 11;
        double parseDouble = Double.parseDouble(this.f745o);
        if (this.f736f || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f745o = null;
            this.f742l = 0;
            int[] iArr2 = this.f749s;
            int i6 = this.f747q - 1;
            iArr2[i6] = iArr2[i6] + 1;
            return parseDouble;
        }
        throw new d("JSON forbids NaN and infinities: " + parseDouble + m());
    }

    public int t() {
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        if (i4 == 15) {
            long j4 = this.f743m;
            int i5 = (int) j4;
            if (j4 == ((long) i5)) {
                this.f742l = 0;
                int[] iArr = this.f749s;
                int i6 = this.f747q - 1;
                iArr[i6] = iArr[i6] + 1;
                return i5;
            }
            throw new NumberFormatException("Expected an int but was " + this.f743m + m());
        }
        if (i4 == 16) {
            this.f745o = new String(this.f737g, this.f738h, this.f744n);
            this.f738h += this.f744n;
        } else if (i4 == 8 || i4 == 9 || i4 == 10) {
            if (i4 == 10) {
                this.f745o = D();
            } else {
                this.f745o = B(i4 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f745o);
                this.f742l = 0;
                int[] iArr2 = this.f749s;
                int i7 = this.f747q - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + F() + m());
        }
        this.f742l = 11;
        double parseDouble = Double.parseDouble(this.f745o);
        int i8 = (int) parseDouble;
        if (((double) i8) == parseDouble) {
            this.f745o = null;
            this.f742l = 0;
            int[] iArr3 = this.f749s;
            int i9 = this.f747q - 1;
            iArr3[i9] = iArr3[i9] + 1;
            return i8;
        }
        throw new NumberFormatException("Expected an int but was " + this.f745o + m());
    }

    public String toString() {
        return getClass().getSimpleName() + m();
    }

    public long w() {
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        if (i4 == 15) {
            this.f742l = 0;
            int[] iArr = this.f749s;
            int i5 = this.f747q - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f743m;
        }
        if (i4 == 16) {
            this.f745o = new String(this.f737g, this.f738h, this.f744n);
            this.f738h += this.f744n;
        } else if (i4 == 8 || i4 == 9 || i4 == 10) {
            if (i4 == 10) {
                this.f745o = D();
            } else {
                this.f745o = B(i4 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f745o);
                this.f742l = 0;
                int[] iArr2 = this.f749s;
                int i6 = this.f747q - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + F() + m());
        }
        this.f742l = 11;
        double parseDouble = Double.parseDouble(this.f745o);
        long j4 = (long) parseDouble;
        if (((double) j4) == parseDouble) {
            this.f745o = null;
            this.f742l = 0;
            int[] iArr3 = this.f749s;
            int i7 = this.f747q - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return j4;
        }
        throw new NumberFormatException("Expected a long but was " + this.f745o + m());
    }

    public String x() {
        String str;
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        if (i4 == 14) {
            str = D();
        } else if (i4 == 12) {
            str = B('\'');
        } else if (i4 == 13) {
            str = B('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + F() + m());
        }
        this.f742l = 0;
        this.f748r[this.f747q - 1] = str;
        return str;
    }

    public final int y(boolean z4) {
        char[] cArr = this.f737g;
        int i4 = this.f738h;
        int i5 = this.f739i;
        while (true) {
            if (i4 == i5) {
                this.f738h = i4;
                if (i(1)) {
                    i4 = this.f738h;
                    i5 = this.f739i;
                } else if (!z4) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + m());
                }
            }
            int i6 = i4 + 1;
            char c4 = cArr[i4];
            if (c4 == 10) {
                this.f740j++;
                this.f741k = i6;
            } else if (!(c4 == ' ' || c4 == 13 || c4 == 9)) {
                if (c4 == '/') {
                    this.f738h = i6;
                    if (i6 == i5) {
                        this.f738h = i4;
                        boolean i7 = i(2);
                        this.f738h++;
                        if (!i7) {
                            return c4;
                        }
                    }
                    d();
                    int i8 = this.f738h;
                    char c5 = cArr[i8];
                    if (c5 == '*') {
                        this.f738h = i8 + 1;
                        if (O("*/")) {
                            i4 = this.f738h + 2;
                            i5 = this.f739i;
                        } else {
                            throw S("Unterminated comment");
                        }
                    } else if (c5 != '/') {
                        return c4;
                    } else {
                        this.f738h = i8 + 1;
                        P();
                        i4 = this.f738h;
                        i5 = this.f739i;
                    }
                } else if (c4 == '#') {
                    this.f738h = i6;
                    d();
                    P();
                    i4 = this.f738h;
                    i5 = this.f739i;
                } else {
                    this.f738h = i6;
                    return c4;
                }
            }
            i4 = i6;
        }
    }

    public void z() {
        int i4 = this.f742l;
        if (i4 == 0) {
            i4 = f();
        }
        if (i4 == 7) {
            this.f742l = 0;
            int[] iArr = this.f749s;
            int i5 = this.f747q - 1;
            iArr[i5] = iArr[i5] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + F() + m());
    }
}
