package com.google.gson.internal.bind;

import D2.b;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class a extends D2.a {

    /* renamed from: x  reason: collision with root package name */
    public static final Reader f8493x = new C0139a();

    /* renamed from: y  reason: collision with root package name */
    public static final Object f8494y = new Object();

    /* renamed from: t  reason: collision with root package name */
    public Object[] f8495t = new Object[32];

    /* renamed from: u  reason: collision with root package name */
    public int f8496u = 0;

    /* renamed from: v  reason: collision with root package name */
    public String[] f8497v = new String[32];

    /* renamed from: w  reason: collision with root package name */
    public int[] f8498w = new int[32];

    /* renamed from: com.google.gson.internal.bind.a$a  reason: collision with other inner class name */
    public class C0139a extends Reader {
        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i4, int i5) {
            throw new AssertionError();
        }
    }

    public a(h hVar) {
        super(f8493x);
        Y(hVar);
    }

    private String m() {
        return " at path " + getPath();
    }

    public String C() {
        b F4 = F();
        b bVar = b.STRING;
        if (F4 == bVar || F4 == b.NUMBER) {
            String w4 = ((m) W()).w();
            int i4 = this.f8496u;
            if (i4 > 0) {
                int[] iArr = this.f8498w;
                int i5 = i4 - 1;
                iArr[i5] = iArr[i5] + 1;
            }
            return w4;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + F4 + m());
    }

    public b F() {
        if (this.f8496u == 0) {
            return b.END_DOCUMENT;
        }
        Object V3 = V();
        if (V3 instanceof Iterator) {
            boolean z4 = this.f8495t[this.f8496u - 2] instanceof k;
            Iterator it = (Iterator) V3;
            if (!it.hasNext()) {
                return z4 ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z4) {
                return b.NAME;
            }
            Y(it.next());
            return F();
        } else if (V3 instanceof k) {
            return b.BEGIN_OBJECT;
        } else {
            if (V3 instanceof e) {
                return b.BEGIN_ARRAY;
            }
            if (V3 instanceof m) {
                m mVar = (m) V3;
                if (mVar.I()) {
                    return b.STRING;
                }
                if (mVar.F()) {
                    return b.BOOLEAN;
                }
                if (mVar.H()) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (V3 instanceof j) {
                return b.NULL;
            } else {
                if (V3 == f8494y) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void R() {
        if (F() == b.NAME) {
            x();
            this.f8497v[this.f8496u - 2] = "null";
        } else {
            W();
            int i4 = this.f8496u;
            if (i4 > 0) {
                this.f8497v[i4 - 1] = "null";
            }
        }
        int i5 = this.f8496u;
        if (i5 > 0) {
            int[] iArr = this.f8498w;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
    }

    public final void T(b bVar) {
        if (F() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + F() + m());
        }
    }

    public h U() {
        b F4 = F();
        if (F4 == b.NAME || F4 == b.END_ARRAY || F4 == b.END_OBJECT || F4 == b.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + F4 + " when reading a JsonElement.");
        }
        h hVar = (h) V();
        R();
        return hVar;
    }

    public final Object V() {
        return this.f8495t[this.f8496u - 1];
    }

    public final Object W() {
        Object[] objArr = this.f8495t;
        int i4 = this.f8496u - 1;
        this.f8496u = i4;
        Object obj = objArr[i4];
        objArr[i4] = null;
        return obj;
    }

    public void X() {
        T(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) V()).next();
        Y(entry.getValue());
        Y(new m((String) entry.getKey()));
    }

    public final void Y(Object obj) {
        int i4 = this.f8496u;
        Object[] objArr = this.f8495t;
        if (i4 == objArr.length) {
            int i5 = i4 * 2;
            this.f8495t = Arrays.copyOf(objArr, i5);
            this.f8498w = Arrays.copyOf(this.f8498w, i5);
            this.f8497v = (String[]) Arrays.copyOf(this.f8497v, i5);
        }
        Object[] objArr2 = this.f8495t;
        int i6 = this.f8496u;
        this.f8496u = i6 + 1;
        objArr2[i6] = obj;
    }

    public void b() {
        T(b.BEGIN_ARRAY);
        Y(((e) V()).iterator());
        this.f8498w[this.f8496u - 1] = 0;
    }

    public void c() {
        T(b.BEGIN_OBJECT);
        Y(((k) V()).C().iterator());
    }

    public void close() {
        this.f8495t = new Object[]{f8494y};
        this.f8496u = 1;
    }

    public void g() {
        T(b.END_ARRAY);
        W();
        W();
        int i4 = this.f8496u;
        if (i4 > 0) {
            int[] iArr = this.f8498w;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i4 = 0;
        while (true) {
            int i5 = this.f8496u;
            if (i4 >= i5) {
                return sb.toString();
            }
            Object[] objArr = this.f8495t;
            Object obj = objArr[i4];
            if (obj instanceof e) {
                i4++;
                if (i4 < i5 && (objArr[i4] instanceof Iterator)) {
                    sb.append('[');
                    sb.append(this.f8498w[i4]);
                    sb.append(']');
                }
            } else if ((obj instanceof k) && (i4 = i4 + 1) < i5 && (objArr[i4] instanceof Iterator)) {
                sb.append('.');
                String str = this.f8497v[i4];
                if (str != null) {
                    sb.append(str);
                }
            }
            i4++;
        }
    }

    public void h() {
        T(b.END_OBJECT);
        W();
        W();
        int i4 = this.f8496u;
        if (i4 > 0) {
            int[] iArr = this.f8498w;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    public boolean j() {
        b F4 = F();
        return (F4 == b.END_OBJECT || F4 == b.END_ARRAY) ? false : true;
    }

    public boolean r() {
        T(b.BOOLEAN);
        boolean s4 = ((m) W()).s();
        int i4 = this.f8496u;
        if (i4 > 0) {
            int[] iArr = this.f8498w;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
        return s4;
    }

    public double s() {
        b F4 = F();
        b bVar = b.NUMBER;
        if (F4 == bVar || F4 == b.STRING) {
            double B4 = ((m) V()).B();
            if (k() || (!Double.isNaN(B4) && !Double.isInfinite(B4))) {
                W();
                int i4 = this.f8496u;
                if (i4 > 0) {
                    int[] iArr = this.f8498w;
                    int i5 = i4 - 1;
                    iArr[i5] = iArr[i5] + 1;
                }
                return B4;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + B4);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + F4 + m());
    }

    public int t() {
        b F4 = F();
        b bVar = b.NUMBER;
        if (F4 == bVar || F4 == b.STRING) {
            int C4 = ((m) V()).C();
            W();
            int i4 = this.f8496u;
            if (i4 > 0) {
                int[] iArr = this.f8498w;
                int i5 = i4 - 1;
                iArr[i5] = iArr[i5] + 1;
            }
            return C4;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + F4 + m());
    }

    public String toString() {
        return a.class.getSimpleName() + m();
    }

    public long w() {
        b F4 = F();
        b bVar = b.NUMBER;
        if (F4 == bVar || F4 == b.STRING) {
            long D4 = ((m) V()).D();
            W();
            int i4 = this.f8496u;
            if (i4 > 0) {
                int[] iArr = this.f8498w;
                int i5 = i4 - 1;
                iArr[i5] = iArr[i5] + 1;
            }
            return D4;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + F4 + m());
    }

    public String x() {
        T(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) V()).next();
        String str = (String) entry.getKey();
        this.f8497v[this.f8496u - 1] = str;
        Y(entry.getValue());
        return str;
    }

    public void z() {
        T(b.NULL);
        W();
        int i4 = this.f8496u;
        if (i4 > 0) {
            int[] iArr = this.f8498w;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }
}
