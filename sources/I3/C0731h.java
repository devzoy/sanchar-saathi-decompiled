package i3;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import v3.g;
import v3.l;
import z3.e;

/* renamed from: i3.h  reason: case insensitive filesystem */
public final class C0731h extends C0728e {

    /* renamed from: h  reason: collision with root package name */
    public static final a f10298h = new a((g) null);

    /* renamed from: i  reason: collision with root package name */
    public static final Object[] f10299i = new Object[0];

    /* renamed from: e  reason: collision with root package name */
    public int f10300e;

    /* renamed from: f  reason: collision with root package name */
    public Object[] f10301f = f10299i;

    /* renamed from: g  reason: collision with root package name */
    public int f10302g;

    /* renamed from: i3.h$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public final void A(int i4, int i5) {
        if (i4 < i5) {
            C0734k.j(this.f10301f, (Object) null, i4, i5);
            return;
        }
        Object[] objArr = this.f10301f;
        C0734k.j(objArr, (Object) null, i4, objArr.length);
        C0734k.j(this.f10301f, (Object) null, 0, i5);
    }

    public final int B(int i4) {
        Object[] objArr = this.f10301f;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    public final void C() {
        this.modCount++;
    }

    public final Object D() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final void E(int i4, int i5) {
        int B4 = B(this.f10300e + (i4 - 1));
        int B5 = B(this.f10300e + (i5 - 1));
        while (i4 > 0) {
            int i6 = B4 + 1;
            int min = Math.min(i4, Math.min(i6, B5 + 1));
            Object[] objArr = this.f10301f;
            int i7 = B5 - min;
            int i8 = B4 - min;
            C0734k.e(objArr, objArr, i7 + 1, i8 + 1, i6);
            B4 = z(i8);
            B5 = z(i7);
            i4 -= min;
        }
    }

    public final void F(int i4, int i5) {
        int B4 = B(this.f10300e + i5);
        int B5 = B(this.f10300e + i4);
        int size = size();
        while (true) {
            size -= i5;
            if (size > 0) {
                Object[] objArr = this.f10301f;
                i5 = Math.min(size, Math.min(objArr.length - B4, objArr.length - B5));
                Object[] objArr2 = this.f10301f;
                int i6 = B4 + i5;
                C0734k.e(objArr2, objArr2, B5, B4, i6);
                B4 = B(i6);
                B5 = B(B5 + i5);
            } else {
                return;
            }
        }
    }

    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        l.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        C();
        x(size() + collection.size());
        u(B(this.f10300e + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        C();
        x(size() + 1);
        int w4 = w(this.f10300e);
        this.f10300e = w4;
        this.f10301f[w4] = obj;
        this.f10302g = size() + 1;
    }

    public final void addLast(Object obj) {
        C();
        x(size() + 1);
        this.f10301f[B(this.f10300e + size())] = obj;
        this.f10302g = size() + 1;
    }

    public void clear() {
        if (!isEmpty()) {
            C();
            A(this.f10300e, B(this.f10300e + size()));
        }
        this.f10300e = 0;
        this.f10302g = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public Object get(int i4) {
        C0726c.f10289e.a(i4, size());
        return this.f10301f[B(this.f10300e + i4)];
    }

    public int indexOf(Object obj) {
        int i4;
        int B4 = B(this.f10300e + size());
        int i5 = this.f10300e;
        if (i5 < B4) {
            while (i5 < B4) {
                if (l.a(obj, this.f10301f[i5])) {
                    i4 = this.f10300e;
                } else {
                    i5++;
                }
            }
            return -1;
        } else if (i5 < B4) {
            return -1;
        } else {
            int length = this.f10301f.length;
            while (true) {
                if (i5 >= length) {
                    int i6 = 0;
                    while (i6 < B4) {
                        if (l.a(obj, this.f10301f[i6])) {
                            i5 = i6 + this.f10301f.length;
                            i4 = this.f10300e;
                        } else {
                            i6++;
                        }
                    }
                    return -1;
                } else if (l.a(obj, this.f10301f[i5])) {
                    i4 = this.f10300e;
                    break;
                } else {
                    i5++;
                }
            }
        }
        return i5 - i4;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int lastIndexOf(Object obj) {
        int i4;
        int i5;
        int B4 = B(this.f10300e + size());
        int i6 = this.f10300e;
        if (i6 < B4) {
            i4 = B4 - 1;
            if (i6 <= i4) {
                while (!l.a(obj, this.f10301f[i4])) {
                    if (i4 != i6) {
                        i4--;
                    }
                }
                i5 = this.f10300e;
            }
            return -1;
        }
        if (i6 > B4) {
            int i7 = B4 - 1;
            while (true) {
                if (-1 >= i7) {
                    int q4 = C0735l.q(this.f10301f);
                    int i8 = this.f10300e;
                    if (i8 <= q4) {
                        while (!l.a(obj, this.f10301f[i4])) {
                            if (i4 != i8) {
                                q4 = i4 - 1;
                            }
                        }
                        i5 = this.f10300e;
                    }
                } else if (l.a(obj, this.f10301f[i7])) {
                    i4 = i7 + this.f10301f.length;
                    i5 = this.f10300e;
                    break;
                } else {
                    i7--;
                }
            }
        }
        return -1;
        return i4 - i5;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            v3.l.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Object[] r0 = r11.f10301f
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0091
        L_0x0013:
            int r0 = r11.f10300e
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.B(r0)
            int r2 = r11.f10300e
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0043
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003d
            java.lang.Object[] r6 = r11.f10301f
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L_0x0039
            java.lang.Object[] r7 = r11.f10301f
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003d:
            java.lang.Object[] r12 = r11.f10301f
            i3.C0734k.j(r12, r3, r5, r0)
            goto L_0x0083
        L_0x0043:
            java.lang.Object[] r5 = r11.f10301f
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0048:
            if (r2 >= r5) goto L_0x0062
            java.lang.Object[] r8 = r11.f10301f
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L_0x005e
            java.lang.Object[] r8 = r11.f10301f
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0062:
            int r2 = r11.B(r6)
            r5 = r2
        L_0x0067:
            if (r1 >= r0) goto L_0x0082
            java.lang.Object[] r2 = r11.f10301f
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L_0x007e
            java.lang.Object[] r2 = r11.f10301f
            r2[r5] = r6
            int r5 = r11.y(r5)
            goto L_0x007f
        L_0x007e:
            r7 = r4
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0082:
            r1 = r7
        L_0x0083:
            if (r1 == 0) goto L_0x0091
            r11.C()
            int r12 = r11.f10300e
            int r5 = r5 - r12
            int r12 = r11.z(r5)
            r11.f10302g = r12
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C0731h.removeAll(java.util.Collection):boolean");
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            C();
            Object[] objArr = this.f10301f;
            int i4 = this.f10300e;
            Object obj = objArr[i4];
            objArr[i4] = null;
            this.f10300e = y(i4);
            this.f10302g = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            C();
            int B4 = B(this.f10300e + C0738o.i(this));
            Object[] objArr = this.f10301f;
            Object obj = objArr[B4];
            objArr[B4] = null;
            this.f10302g = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public void removeRange(int i4, int i5) {
        C0726c.f10289e.c(i4, i5, size());
        int i6 = i5 - i4;
        if (i6 != 0) {
            if (i6 == size()) {
                clear();
            } else if (i6 == 1) {
                remove(i4);
            } else {
                C();
                if (i4 < size() - i5) {
                    E(i4, i5);
                    int B4 = B(this.f10300e + i6);
                    A(this.f10300e, B4);
                    this.f10300e = B4;
                } else {
                    F(i4, i5);
                    int B5 = B(this.f10300e + size());
                    A(z(B5 - i6), B5);
                }
                this.f10302g = size() - i6;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            v3.l.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Object[] r0 = r11.f10301f
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0091
        L_0x0013:
            int r0 = r11.f10300e
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.B(r0)
            int r2 = r11.f10300e
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0043
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003d
            java.lang.Object[] r6 = r11.f10301f
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0039
            java.lang.Object[] r7 = r11.f10301f
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003d:
            java.lang.Object[] r12 = r11.f10301f
            i3.C0734k.j(r12, r3, r5, r0)
            goto L_0x0083
        L_0x0043:
            java.lang.Object[] r5 = r11.f10301f
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0048:
            if (r2 >= r5) goto L_0x0062
            java.lang.Object[] r8 = r11.f10301f
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x005e
            java.lang.Object[] r8 = r11.f10301f
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0062:
            int r2 = r11.B(r6)
            r5 = r2
        L_0x0067:
            if (r1 >= r0) goto L_0x0082
            java.lang.Object[] r2 = r11.f10301f
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x007e
            java.lang.Object[] r2 = r11.f10301f
            r2[r5] = r6
            int r5 = r11.y(r5)
            goto L_0x007f
        L_0x007e:
            r7 = r4
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0082:
            r1 = r7
        L_0x0083:
            if (r1 == 0) goto L_0x0091
            r11.C()
            int r12 = r11.f10300e
            int r5 = r5 - r12
            int r12 = r11.z(r5)
            r11.f10302g = r12
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C0731h.retainAll(java.util.Collection):boolean");
    }

    public int s() {
        return this.f10302g;
    }

    public Object set(int i4, Object obj) {
        C0726c.f10289e.a(i4, size());
        int B4 = B(this.f10300e + i4);
        Object[] objArr = this.f10301f;
        Object obj2 = objArr[B4];
        objArr[B4] = obj;
        return obj2;
    }

    public Object t(int i4) {
        C0726c.f10289e.a(i4, size());
        if (i4 == C0738o.i(this)) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        C();
        int B4 = B(this.f10300e + i4);
        Object obj = this.f10301f[B4];
        if (i4 < (size() >> 1)) {
            int i5 = this.f10300e;
            if (B4 >= i5) {
                Object[] objArr = this.f10301f;
                C0734k.e(objArr, objArr, i5 + 1, i5, B4);
            } else {
                Object[] objArr2 = this.f10301f;
                C0734k.e(objArr2, objArr2, 1, 0, B4);
                Object[] objArr3 = this.f10301f;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i6 = this.f10300e;
                C0734k.e(objArr3, objArr3, i6 + 1, i6, objArr3.length - 1);
            }
            Object[] objArr4 = this.f10301f;
            int i7 = this.f10300e;
            objArr4[i7] = null;
            this.f10300e = y(i7);
        } else {
            int B5 = B(this.f10300e + C0738o.i(this));
            if (B4 <= B5) {
                Object[] objArr5 = this.f10301f;
                C0734k.e(objArr5, objArr5, B4, B4 + 1, B5 + 1);
            } else {
                Object[] objArr6 = this.f10301f;
                C0734k.e(objArr6, objArr6, B4, B4 + 1, objArr6.length);
                Object[] objArr7 = this.f10301f;
                objArr7[objArr7.length - 1] = objArr7[0];
                C0734k.e(objArr7, objArr7, 0, 1, B5 + 1);
            }
            this.f10301f[B5] = null;
        }
        this.f10302g = size() - 1;
        return obj;
    }

    public Object[] toArray(Object[] objArr) {
        l.e(objArr, "array");
        if (objArr.length < size()) {
            objArr = C0732i.a(objArr, size());
        }
        int B4 = B(this.f10300e + size());
        int i4 = this.f10300e;
        if (i4 < B4) {
            C0734k.g(this.f10301f, objArr, 0, i4, B4, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f10301f;
            C0734k.e(objArr2, objArr, 0, this.f10300e, objArr2.length);
            Object[] objArr3 = this.f10301f;
            C0734k.e(objArr3, objArr, objArr3.length - this.f10300e, 0, B4);
        }
        return C0737n.e(size(), objArr);
    }

    public final void u(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f10301f.length;
        while (i4 < length && it.hasNext()) {
            this.f10301f[i4] = it.next();
            i4++;
        }
        int i5 = this.f10300e;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f10301f[i6] = it.next();
        }
        this.f10302g = size() + collection.size();
    }

    public final void v(int i4) {
        Object[] objArr = new Object[i4];
        Object[] objArr2 = this.f10301f;
        C0734k.e(objArr2, objArr, 0, this.f10300e, objArr2.length);
        Object[] objArr3 = this.f10301f;
        int length = objArr3.length;
        int i5 = this.f10300e;
        C0734k.e(objArr3, objArr, length - i5, 0, i5);
        this.f10300e = 0;
        this.f10301f = objArr;
    }

    public final int w(int i4) {
        return i4 == 0 ? C0735l.q(this.f10301f) : i4 - 1;
    }

    public final void x(int i4) {
        if (i4 >= 0) {
            Object[] objArr = this.f10301f;
            if (i4 > objArr.length) {
                if (objArr == f10299i) {
                    this.f10301f = new Object[e.a(i4, 10)];
                } else {
                    v(C0726c.f10289e.d(objArr.length, i4));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    public final int y(int i4) {
        if (i4 == C0735l.q(this.f10301f)) {
            return 0;
        }
        return i4 + 1;
    }

    public final int z(int i4) {
        return i4 < 0 ? i4 + this.f10301f.length : i4;
    }

    public void add(int i4, Object obj) {
        C0726c.f10289e.b(i4, size());
        if (i4 == size()) {
            addLast(obj);
        } else if (i4 == 0) {
            addFirst(obj);
        } else {
            C();
            x(size() + 1);
            int B4 = B(this.f10300e + i4);
            if (i4 < ((size() + 1) >> 1)) {
                int w4 = w(B4);
                int w5 = w(this.f10300e);
                int i5 = this.f10300e;
                if (w4 >= i5) {
                    Object[] objArr = this.f10301f;
                    objArr[w5] = objArr[i5];
                    C0734k.e(objArr, objArr, i5, i5 + 1, w4 + 1);
                } else {
                    Object[] objArr2 = this.f10301f;
                    C0734k.e(objArr2, objArr2, i5 - 1, i5, objArr2.length);
                    Object[] objArr3 = this.f10301f;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C0734k.e(objArr3, objArr3, 0, 1, w4 + 1);
                }
                this.f10301f[w4] = obj;
                this.f10300e = w5;
            } else {
                int B5 = B(this.f10300e + size());
                if (B4 < B5) {
                    Object[] objArr4 = this.f10301f;
                    C0734k.e(objArr4, objArr4, B4 + 1, B4, B5);
                } else {
                    Object[] objArr5 = this.f10301f;
                    C0734k.e(objArr5, objArr5, 1, 0, B5);
                    Object[] objArr6 = this.f10301f;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C0734k.e(objArr6, objArr6, B4 + 1, B4, objArr6.length - 1);
                }
                this.f10301f[B4] = obj;
            }
            this.f10302g = size() + 1;
        }
    }

    public boolean addAll(int i4, Collection collection) {
        l.e(collection, "elements");
        C0726c.f10289e.b(i4, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i4 == size()) {
            return addAll(collection);
        }
        C();
        x(size() + collection.size());
        int B4 = B(this.f10300e + size());
        int B5 = B(this.f10300e + i4);
        int size = collection.size();
        if (i4 < ((size() + 1) >> 1)) {
            int i5 = this.f10300e;
            int i6 = i5 - size;
            if (B5 < i5) {
                Object[] objArr = this.f10301f;
                C0734k.e(objArr, objArr, i6, i5, objArr.length);
                if (size >= B5) {
                    Object[] objArr2 = this.f10301f;
                    C0734k.e(objArr2, objArr2, objArr2.length - size, 0, B5);
                } else {
                    Object[] objArr3 = this.f10301f;
                    C0734k.e(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f10301f;
                    C0734k.e(objArr4, objArr4, 0, size, B5);
                }
            } else if (i6 >= 0) {
                Object[] objArr5 = this.f10301f;
                C0734k.e(objArr5, objArr5, i6, i5, B5);
            } else {
                Object[] objArr6 = this.f10301f;
                i6 += objArr6.length;
                int i7 = B5 - i5;
                int length = objArr6.length - i6;
                if (length >= i7) {
                    C0734k.e(objArr6, objArr6, i6, i5, B5);
                } else {
                    C0734k.e(objArr6, objArr6, i6, i5, i5 + length);
                    Object[] objArr7 = this.f10301f;
                    C0734k.e(objArr7, objArr7, 0, this.f10300e + length, B5);
                }
            }
            this.f10300e = i6;
            u(z(B5 - size), collection);
        } else {
            int i8 = B5 + size;
            if (B5 < B4) {
                int i9 = size + B4;
                Object[] objArr8 = this.f10301f;
                if (i9 <= objArr8.length) {
                    C0734k.e(objArr8, objArr8, i8, B5, B4);
                } else if (i8 >= objArr8.length) {
                    C0734k.e(objArr8, objArr8, i8 - objArr8.length, B5, B4);
                } else {
                    int length2 = B4 - (i9 - objArr8.length);
                    C0734k.e(objArr8, objArr8, 0, length2, B4);
                    Object[] objArr9 = this.f10301f;
                    C0734k.e(objArr9, objArr9, i8, B5, length2);
                }
            } else {
                Object[] objArr10 = this.f10301f;
                C0734k.e(objArr10, objArr10, size, 0, B4);
                Object[] objArr11 = this.f10301f;
                if (i8 >= objArr11.length) {
                    C0734k.e(objArr11, objArr11, i8 - objArr11.length, B5, objArr11.length);
                } else {
                    C0734k.e(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f10301f;
                    C0734k.e(objArr12, objArr12, i8, B5, objArr12.length - size);
                }
            }
            u(B5, collection);
        }
        return true;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
