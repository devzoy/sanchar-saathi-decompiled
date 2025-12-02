package v;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class g {

    /* renamed from: h  reason: collision with root package name */
    public static Object[] f12392h;

    /* renamed from: i  reason: collision with root package name */
    public static int f12393i;

    /* renamed from: j  reason: collision with root package name */
    public static Object[] f12394j;

    /* renamed from: k  reason: collision with root package name */
    public static int f12395k;

    /* renamed from: e  reason: collision with root package name */
    public int[] f12396e;

    /* renamed from: f  reason: collision with root package name */
    public Object[] f12397f;

    /* renamed from: g  reason: collision with root package name */
    public int f12398g;

    public g() {
        this.f12396e = c.f12361a;
        this.f12397f = c.f12363c;
        this.f12398g = 0;
    }

    public static int b(int[] iArr, int i4, int i5) {
        try {
            return c.a(iArr, i4, i5);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void d(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                try {
                    if (f12395k < 10) {
                        objArr[0] = f12394j;
                        objArr[1] = iArr;
                        for (int i5 = (i4 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f12394j = objArr;
                        f12395k++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                try {
                    if (f12393i < 10) {
                        objArr[0] = f12392h;
                        objArr[1] = iArr;
                        for (int i6 = (i4 << 1) - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f12392h = objArr;
                        f12393i++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(int i4) {
        if (i4 == 8) {
            synchronized (g.class) {
                try {
                    Object[] objArr = f12394j;
                    if (objArr != null) {
                        this.f12397f = objArr;
                        f12394j = (Object[]) objArr[0];
                        this.f12396e = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f12395k--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i4 == 4) {
            synchronized (g.class) {
                try {
                    Object[] objArr2 = f12392h;
                    if (objArr2 != null) {
                        this.f12397f = objArr2;
                        f12392h = (Object[]) objArr2[0];
                        this.f12396e = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f12393i--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f12396e = new int[i4];
        this.f12397f = new Object[(i4 << 1)];
    }

    public void c(int i4) {
        int i5 = this.f12398g;
        int[] iArr = this.f12396e;
        if (iArr.length < i4) {
            Object[] objArr = this.f12397f;
            a(i4);
            if (this.f12398g > 0) {
                System.arraycopy(iArr, 0, this.f12396e, 0, i5);
                System.arraycopy(objArr, 0, this.f12397f, 0, i5 << 1);
            }
            d(iArr, objArr, i5);
        }
        if (this.f12398g != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i4 = this.f12398g;
        if (i4 > 0) {
            int[] iArr = this.f12396e;
            Object[] objArr = this.f12397f;
            this.f12396e = c.f12361a;
            this.f12397f = c.f12363c;
            this.f12398g = 0;
            d(iArr, objArr, i4);
        }
        if (this.f12398g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public int e(Object obj, int i4) {
        int i5 = this.f12398g;
        if (i5 == 0) {
            return -1;
        }
        int b4 = b(this.f12396e, i5, i4);
        if (b4 < 0 || obj.equals(this.f12397f[b4 << 1])) {
            return b4;
        }
        int i6 = b4 + 1;
        while (i6 < i5 && this.f12396e[i6] == i4) {
            if (obj.equals(this.f12397f[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        int i7 = b4 - 1;
        while (i7 >= 0 && this.f12396e[i7] == i4) {
            if (obj.equals(this.f12397f[i7 << 1])) {
                return i7;
            }
            i7--;
        }
        return ~i6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i4 = 0;
            while (i4 < this.f12398g) {
                try {
                    Object i5 = i(i4);
                    Object m4 = m(i4);
                    Object obj2 = gVar.get(i5);
                    if (m4 == null) {
                        if (obj2 != null || !gVar.containsKey(i5)) {
                            return false;
                        }
                    } else if (!m4.equals(obj2)) {
                        return false;
                    }
                    i4++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i6 = 0;
            while (i6 < this.f12398g) {
                try {
                    Object i7 = i(i6);
                    Object m5 = m(i6);
                    Object obj3 = map.get(i7);
                    if (m5 == null) {
                        if (obj3 != null || !map.containsKey(i7)) {
                            return false;
                        }
                    } else if (!m5.equals(obj3)) {
                        return false;
                    }
                    i6++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public int g() {
        int i4 = this.f12398g;
        if (i4 == 0) {
            return -1;
        }
        int b4 = b(this.f12396e, i4, 0);
        if (b4 < 0 || this.f12397f[b4 << 1] == null) {
            return b4;
        }
        int i5 = b4 + 1;
        while (i5 < i4 && this.f12396e[i5] == 0) {
            if (this.f12397f[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        int i6 = b4 - 1;
        while (i6 >= 0 && this.f12396e[i6] == 0) {
            if (this.f12397f[i6 << 1] == null) {
                return i6;
            }
            i6--;
        }
        return ~i5;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int f4 = f(obj);
        return f4 >= 0 ? this.f12397f[(f4 << 1) + 1] : obj2;
    }

    public int h(Object obj) {
        int i4 = this.f12398g * 2;
        Object[] objArr = this.f12397f;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f12396e;
        Object[] objArr = this.f12397f;
        int i4 = this.f12398g;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            i7 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return i7;
    }

    public Object i(int i4) {
        return this.f12397f[i4 << 1];
    }

    public boolean isEmpty() {
        return this.f12398g <= 0;
    }

    public void j(g gVar) {
        int i4 = gVar.f12398g;
        c(this.f12398g + i4);
        if (this.f12398g != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                put(gVar.i(i5), gVar.m(i5));
            }
        } else if (i4 > 0) {
            System.arraycopy(gVar.f12396e, 0, this.f12396e, 0, i4);
            System.arraycopy(gVar.f12397f, 0, this.f12397f, 0, i4 << 1);
            this.f12398g = i4;
        }
    }

    public Object k(int i4) {
        Object[] objArr = this.f12397f;
        int i5 = i4 << 1;
        Object obj = objArr[i5 + 1];
        int i6 = this.f12398g;
        int i7 = 0;
        if (i6 <= 1) {
            d(this.f12396e, objArr, i6);
            this.f12396e = c.f12361a;
            this.f12397f = c.f12363c;
        } else {
            int i8 = i6 - 1;
            int[] iArr = this.f12396e;
            int i9 = 8;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                if (i4 < i8) {
                    int i10 = i4 + 1;
                    int i11 = i8 - i4;
                    System.arraycopy(iArr, i10, iArr, i4, i11);
                    Object[] objArr2 = this.f12397f;
                    System.arraycopy(objArr2, i10 << 1, objArr2, i5, i11 << 1);
                }
                Object[] objArr3 = this.f12397f;
                int i12 = i8 << 1;
                objArr3[i12] = null;
                objArr3[i12 + 1] = null;
            } else {
                if (i6 > 8) {
                    i9 = i6 + (i6 >> 1);
                }
                a(i9);
                if (i6 == this.f12398g) {
                    if (i4 > 0) {
                        System.arraycopy(iArr, 0, this.f12396e, 0, i4);
                        System.arraycopy(objArr, 0, this.f12397f, 0, i5);
                    }
                    if (i4 < i8) {
                        int i13 = i4 + 1;
                        int i14 = i8 - i4;
                        System.arraycopy(iArr, i13, this.f12396e, i4, i14);
                        System.arraycopy(objArr, i13 << 1, this.f12397f, i5, i14 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i7 = i8;
        }
        if (i6 == this.f12398g) {
            this.f12398g = i7;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public Object l(int i4, Object obj) {
        int i5 = (i4 << 1) + 1;
        Object[] objArr = this.f12397f;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public Object m(int i4) {
        return this.f12397f[(i4 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i4;
        int i5;
        int i6 = this.f12398g;
        if (obj == null) {
            i5 = g();
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            i5 = e(obj, hashCode);
        }
        if (i5 >= 0) {
            int i7 = (i5 << 1) + 1;
            Object[] objArr = this.f12397f;
            Object obj3 = objArr[i7];
            objArr[i7] = obj2;
            return obj3;
        }
        int i8 = ~i5;
        int[] iArr = this.f12396e;
        if (i6 >= iArr.length) {
            int i9 = 8;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i9 = 4;
            }
            Object[] objArr2 = this.f12397f;
            a(i9);
            if (i6 == this.f12398g) {
                int[] iArr2 = this.f12396e;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f12397f, 0, objArr2.length);
                }
                d(iArr, objArr2, i6);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i8 < i6) {
            int[] iArr3 = this.f12396e;
            int i10 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i10, i6 - i8);
            Object[] objArr3 = this.f12397f;
            System.arraycopy(objArr3, i8 << 1, objArr3, i10 << 1, (this.f12398g - i8) << 1);
        }
        int i11 = this.f12398g;
        if (i6 == i11) {
            int[] iArr4 = this.f12396e;
            if (i8 < iArr4.length) {
                iArr4[i8] = i4;
                Object[] objArr4 = this.f12397f;
                int i12 = i8 << 1;
                objArr4[i12] = obj;
                objArr4[i12 + 1] = obj2;
                this.f12398g = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int f4 = f(obj);
        if (f4 >= 0) {
            return k(f4);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int f4 = f(obj);
        if (f4 >= 0) {
            return l(f4, obj2);
        }
        return null;
    }

    public int size() {
        return this.f12398g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12398g * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f12398g; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object i5 = i(i4);
            if (i5 != this) {
                sb.append(i5);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m4 = m(i4);
            if (m4 != this) {
                sb.append(m4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f4 = f(obj);
        if (f4 < 0) {
            return false;
        }
        Object m4 = m(f4);
        if (obj2 != m4 && (obj2 == null || !obj2.equals(m4))) {
            return false;
        }
        k(f4);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int f4 = f(obj);
        if (f4 < 0) {
            return false;
        }
        Object m4 = m(f4);
        if (m4 != obj2 && (obj2 == null || !obj2.equals(m4))) {
            return false;
        }
        l(f4, obj3);
        return true;
    }

    public g(int i4) {
        if (i4 == 0) {
            this.f12396e = c.f12361a;
            this.f12397f = c.f12363c;
        } else {
            a(i4);
        }
        this.f12398g = 0;
    }

    public g(g gVar) {
        this();
        if (gVar != null) {
            j(gVar);
        }
    }
}
