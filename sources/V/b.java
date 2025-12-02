package v;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b implements Collection, Set {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f12350i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public static final Object[] f12351j = new Object[0];

    /* renamed from: k  reason: collision with root package name */
    public static Object[] f12352k;

    /* renamed from: l  reason: collision with root package name */
    public static int f12353l;

    /* renamed from: m  reason: collision with root package name */
    public static Object[] f12354m;

    /* renamed from: n  reason: collision with root package name */
    public static int f12355n;

    /* renamed from: e  reason: collision with root package name */
    public int[] f12356e;

    /* renamed from: f  reason: collision with root package name */
    public Object[] f12357f;

    /* renamed from: g  reason: collision with root package name */
    public int f12358g;

    /* renamed from: h  reason: collision with root package name */
    public f f12359h;

    public class a extends f {
        public a() {
        }

        public void a() {
            b.this.clear();
        }

        public Object b(int i4, int i5) {
            return b.this.f12357f[i4];
        }

        public Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        public int d() {
            return b.this.f12358g;
        }

        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        public void g(Object obj, Object obj2) {
            b.this.add(obj);
        }

        public void h(int i4) {
            b.this.y(i4);
        }

        public Object i(int i4, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public static void u(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                try {
                    if (f12355n < 10) {
                        objArr[0] = f12354m;
                        objArr[1] = iArr;
                        for (int i5 = i4 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f12354m = objArr;
                        f12355n++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                try {
                    if (f12353l < 10) {
                        objArr[0] = f12352k;
                        objArr[1] = iArr;
                        for (int i6 = i4 - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f12352k = objArr;
                        f12353l++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean add(Object obj) {
        int i4;
        int i5;
        if (obj == null) {
            i5 = x();
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            i5 = w(obj, hashCode);
        }
        if (i5 >= 0) {
            return false;
        }
        int i6 = ~i5;
        int i7 = this.f12358g;
        int[] iArr = this.f12356e;
        if (i7 >= iArr.length) {
            int i8 = 8;
            if (i7 >= 8) {
                i8 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i8 = 4;
            }
            Object[] objArr = this.f12357f;
            s(i8);
            int[] iArr2 = this.f12356e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f12357f, 0, objArr.length);
            }
            u(iArr, objArr, this.f12358g);
        }
        int i9 = this.f12358g;
        if (i6 < i9) {
            int[] iArr3 = this.f12356e;
            int i10 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i10, i9 - i6);
            Object[] objArr2 = this.f12357f;
            System.arraycopy(objArr2, i6, objArr2, i10, this.f12358g - i6);
        }
        this.f12356e[i6] = i4;
        this.f12357f[i6] = obj;
        this.f12358g++;
        return true;
    }

    public boolean addAll(Collection collection) {
        t(this.f12358g + collection.size());
        boolean z4 = false;
        for (Object add : collection) {
            z4 |= add(add);
        }
        return z4;
    }

    public void clear() {
        int i4 = this.f12358g;
        if (i4 != 0) {
            u(this.f12356e, this.f12357f, i4);
            this.f12356e = f12350i;
            this.f12357f = f12351j;
            this.f12358g = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i4 = 0;
            while (i4 < this.f12358g) {
                try {
                    if (!set.contains(z(i4))) {
                        return false;
                    }
                    i4++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f12356e;
        int i4 = this.f12358g;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    public int indexOf(Object obj) {
        return obj == null ? x() : w(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f12358g <= 0;
    }

    public Iterator iterator() {
        return v().m().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        y(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        boolean z4 = false;
        for (Object remove : collection) {
            z4 |= remove(remove);
        }
        return z4;
    }

    public boolean retainAll(Collection collection) {
        boolean z4 = false;
        for (int i4 = this.f12358g - 1; i4 >= 0; i4--) {
            if (!collection.contains(this.f12357f[i4])) {
                y(i4);
                z4 = true;
            }
        }
        return z4;
    }

    public final void s(int i4) {
        if (i4 == 8) {
            synchronized (b.class) {
                try {
                    Object[] objArr = f12354m;
                    if (objArr != null) {
                        this.f12357f = objArr;
                        f12354m = (Object[]) objArr[0];
                        this.f12356e = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f12355n--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i4 == 4) {
            synchronized (b.class) {
                try {
                    Object[] objArr2 = f12352k;
                    if (objArr2 != null) {
                        this.f12357f = objArr2;
                        f12352k = (Object[]) objArr2[0];
                        this.f12356e = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f12353l--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f12356e = new int[i4];
        this.f12357f = new Object[i4];
    }

    public int size() {
        return this.f12358g;
    }

    public void t(int i4) {
        int[] iArr = this.f12356e;
        if (iArr.length < i4) {
            Object[] objArr = this.f12357f;
            s(i4);
            int i5 = this.f12358g;
            if (i5 > 0) {
                System.arraycopy(iArr, 0, this.f12356e, 0, i5);
                System.arraycopy(objArr, 0, this.f12357f, 0, this.f12358g);
            }
            u(iArr, objArr, this.f12358g);
        }
    }

    public Object[] toArray() {
        int i4 = this.f12358g;
        Object[] objArr = new Object[i4];
        System.arraycopy(this.f12357f, 0, objArr, 0, i4);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12358g * 14);
        sb.append('{');
        for (int i4 = 0; i4 < this.f12358g; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object z4 = z(i4);
            if (z4 != this) {
                sb.append(z4);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final f v() {
        if (this.f12359h == null) {
            this.f12359h = new a();
        }
        return this.f12359h;
    }

    public final int w(Object obj, int i4) {
        int i5 = this.f12358g;
        if (i5 == 0) {
            return -1;
        }
        int a4 = c.a(this.f12356e, i5, i4);
        if (a4 < 0 || obj.equals(this.f12357f[a4])) {
            return a4;
        }
        int i6 = a4 + 1;
        while (i6 < i5 && this.f12356e[i6] == i4) {
            if (obj.equals(this.f12357f[i6])) {
                return i6;
            }
            i6++;
        }
        int i7 = a4 - 1;
        while (i7 >= 0 && this.f12356e[i7] == i4) {
            if (obj.equals(this.f12357f[i7])) {
                return i7;
            }
            i7--;
        }
        return ~i6;
    }

    public final int x() {
        int i4 = this.f12358g;
        if (i4 == 0) {
            return -1;
        }
        int a4 = c.a(this.f12356e, i4, 0);
        if (a4 < 0 || this.f12357f[a4] == null) {
            return a4;
        }
        int i5 = a4 + 1;
        while (i5 < i4 && this.f12356e[i5] == 0) {
            if (this.f12357f[i5] == null) {
                return i5;
            }
            i5++;
        }
        int i6 = a4 - 1;
        while (i6 >= 0 && this.f12356e[i6] == 0) {
            if (this.f12357f[i6] == null) {
                return i6;
            }
            i6--;
        }
        return ~i5;
    }

    public Object y(int i4) {
        Object[] objArr = this.f12357f;
        Object obj = objArr[i4];
        int i5 = this.f12358g;
        if (i5 <= 1) {
            u(this.f12356e, objArr, i5);
            this.f12356e = f12350i;
            this.f12357f = f12351j;
            this.f12358g = 0;
        } else {
            int[] iArr = this.f12356e;
            int i6 = 8;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                int i7 = i5 - 1;
                this.f12358g = i7;
                if (i4 < i7) {
                    int i8 = i4 + 1;
                    System.arraycopy(iArr, i8, iArr, i4, i7 - i4);
                    Object[] objArr2 = this.f12357f;
                    System.arraycopy(objArr2, i8, objArr2, i4, this.f12358g - i4);
                }
                this.f12357f[this.f12358g] = null;
            } else {
                if (i5 > 8) {
                    i6 = i5 + (i5 >> 1);
                }
                s(i6);
                this.f12358g--;
                if (i4 > 0) {
                    System.arraycopy(iArr, 0, this.f12356e, 0, i4);
                    System.arraycopy(objArr, 0, this.f12357f, 0, i4);
                }
                int i9 = this.f12358g;
                if (i4 < i9) {
                    int i10 = i4 + 1;
                    System.arraycopy(iArr, i10, this.f12356e, i4, i9 - i4);
                    System.arraycopy(objArr, i10, this.f12357f, i4, this.f12358g - i4);
                }
            }
        }
        return obj;
    }

    public Object z(int i4) {
        return this.f12357f[i4];
    }

    public b(int i4) {
        if (i4 == 0) {
            this.f12356e = f12350i;
            this.f12357f = f12351j;
        } else {
            s(i4);
        }
        this.f12358g = 0;
    }

    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f12358g) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f12358g);
        }
        System.arraycopy(this.f12357f, 0, objArr, 0, this.f12358g);
        int length = objArr.length;
        int i4 = this.f12358g;
        if (length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
