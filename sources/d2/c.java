package D2;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class c implements Closeable, Flushable {

    /* renamed from: n  reason: collision with root package name */
    public static final String[] f761n = new String[128];

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f762o;

    /* renamed from: e  reason: collision with root package name */
    public final Writer f763e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f764f = new int[32];

    /* renamed from: g  reason: collision with root package name */
    public int f765g = 0;

    /* renamed from: h  reason: collision with root package name */
    public String f766h;

    /* renamed from: i  reason: collision with root package name */
    public String f767i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f768j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f769k;

    /* renamed from: l  reason: collision with root package name */
    public String f770l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f771m;

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            f761n[i4] = String.format("\\u%04x", new Object[]{Integer.valueOf(i4)});
        }
        String[] strArr = f761n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f762o = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        w(6);
        this.f767i = ":";
        this.f771m = true;
        if (writer != null) {
            this.f763e = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public final void B(boolean z4) {
        this.f768j = z4;
    }

    public final void C(boolean z4) {
        this.f771m = z4;
    }

    public final void D(String str) {
        String str2;
        String[] strArr = this.f769k ? f762o : f761n;
        this.f763e.write(34);
        int length = str.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i4 < i5) {
                this.f763e.write(str, i4, i5 - i4);
            }
            this.f763e.write(str2);
            i4 = i5 + 1;
        }
        if (i4 < length) {
            this.f763e.write(str, i4, length - i4);
        }
        this.f763e.write(34);
    }

    public c F(long j4) {
        M();
        c();
        this.f763e.write(Long.toString(j4));
        return this;
    }

    public c H(Boolean bool) {
        if (bool == null) {
            return r();
        }
        M();
        c();
        this.f763e.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c J(Number number) {
        if (number == null) {
            return r();
        }
        M();
        String obj = number.toString();
        if (this.f768j || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            c();
            this.f763e.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c K(String str) {
        if (str == null) {
            return r();
        }
        M();
        c();
        D(str);
        return this;
    }

    public c L(boolean z4) {
        M();
        c();
        this.f763e.write(z4 ? "true" : "false");
        return this;
    }

    public final void M() {
        if (this.f770l != null) {
            b();
            D(this.f770l);
            this.f770l = null;
        }
    }

    public final void b() {
        int t4 = t();
        if (t4 == 5) {
            this.f763e.write(44);
        } else if (t4 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m();
        x(4);
    }

    public final void c() {
        int t4 = t();
        if (t4 == 1) {
            x(2);
            m();
        } else if (t4 == 2) {
            this.f763e.append(',');
            m();
        } else if (t4 != 4) {
            if (t4 != 6) {
                if (t4 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f768j) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            x(7);
        } else {
            this.f763e.append(this.f767i);
            x(5);
        }
    }

    public void close() {
        this.f763e.close();
        int i4 = this.f765g;
        if (i4 > 1 || (i4 == 1 && this.f764f[i4 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f765g = 0;
    }

    public c d() {
        M();
        return s(1, '[');
    }

    public c e() {
        M();
        return s(3, '{');
    }

    public final c f(int i4, int i5, char c4) {
        int t4 = t();
        if (t4 != i5 && t4 != i4) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f770l == null) {
            this.f765g--;
            if (t4 == i5) {
                m();
            }
            this.f763e.write(c4);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f770l);
        }
    }

    public void flush() {
        if (this.f765g != 0) {
            this.f763e.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c g() {
        return f(1, 2, ']');
    }

    public c h() {
        return f(3, 5, '}');
    }

    public final boolean i() {
        return this.f771m;
    }

    public final boolean j() {
        return this.f769k;
    }

    public boolean k() {
        return this.f768j;
    }

    public c l(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f770l != null) {
            throw new IllegalStateException();
        } else if (this.f765g != 0) {
            this.f770l = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final void m() {
        if (this.f766h != null) {
            this.f763e.write(10);
            int i4 = this.f765g;
            for (int i5 = 1; i5 < i4; i5++) {
                this.f763e.write(this.f766h);
            }
        }
    }

    public c r() {
        if (this.f770l != null) {
            if (this.f771m) {
                M();
            } else {
                this.f770l = null;
                return this;
            }
        }
        c();
        this.f763e.write("null");
        return this;
    }

    public final c s(int i4, char c4) {
        c();
        w(i4);
        this.f763e.write(c4);
        return this;
    }

    public final int t() {
        int i4 = this.f765g;
        if (i4 != 0) {
            return this.f764f[i4 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void w(int i4) {
        int i5 = this.f765g;
        int[] iArr = this.f764f;
        if (i5 == iArr.length) {
            this.f764f = Arrays.copyOf(iArr, i5 * 2);
        }
        int[] iArr2 = this.f764f;
        int i6 = this.f765g;
        this.f765g = i6 + 1;
        iArr2[i6] = i4;
    }

    public final void x(int i4) {
        this.f764f[this.f765g - 1] = i4;
    }

    public final void y(boolean z4) {
        this.f769k = z4;
    }

    public final void z(String str) {
        if (str.length() == 0) {
            this.f766h = null;
            this.f767i = ":";
            return;
        }
        this.f766h = str;
        this.f767i = ": ";
    }
}
