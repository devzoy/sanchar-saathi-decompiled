package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class P0 extends C0484a0 implements X0, D1, RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    public static final P0 f7350h;

    /* renamed from: f  reason: collision with root package name */
    public int[] f7351f;

    /* renamed from: g  reason: collision with root package name */
    public int f7352g;

    static {
        P0 p02 = new P0(new int[0], 0);
        f7350h = p02;
        p02.d();
    }

    public P0(int[] iArr, int i4) {
        this.f7351f = iArr;
        this.f7352g = i4;
    }

    public static P0 v() {
        return f7350h;
    }

    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        int intValue = ((Integer) obj).intValue();
        s();
        if (i4 < 0 || i4 > (i5 = this.f7352g)) {
            throw new IndexOutOfBoundsException(x(i4));
        }
        int[] iArr = this.f7351f;
        if (i5 < iArr.length) {
            System.arraycopy(iArr, i4, iArr, i4 + 1, i5 - i4);
        } else {
            int[] iArr2 = new int[(((i5 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            System.arraycopy(this.f7351f, i4, iArr2, i4 + 1, this.f7352g - i4);
            this.f7351f = iArr2;
        }
        this.f7351f[i4] = intValue;
        this.f7352g++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        s();
        R0.d(collection);
        if (!(collection instanceof P0)) {
            return super.addAll(collection);
        }
        P0 p02 = (P0) collection;
        int i4 = p02.f7352g;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f7352g;
        if (Integer.MAX_VALUE - i5 >= i4) {
            int i6 = i5 + i4;
            int[] iArr = this.f7351f;
            if (i6 > iArr.length) {
                this.f7351f = Arrays.copyOf(iArr, i6);
            }
            System.arraycopy(p02.f7351f, 0, this.f7351f, this.f7352g, p02.f7352g);
            this.f7352g = i6;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ X0 b(int i4) {
        if (i4 >= this.f7352g) {
            return new P0(Arrays.copyOf(this.f7351f, i4), this.f7352g);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return super.equals(obj);
        }
        P0 p02 = (P0) obj;
        if (this.f7352g != p02.f7352g) {
            return false;
        }
        int[] iArr = p02.f7351f;
        for (int i4 = 0; i4 < this.f7352g; i4++) {
            if (this.f7351f[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i4) {
        return Integer.valueOf(t(i4));
    }

    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f7352g; i5++) {
            i4 = (i4 * 31) + this.f7351f[i5];
        }
        return i4;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f7351f[i4] == intValue) {
                return i4;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i4) {
        s();
        w(i4);
        int[] iArr = this.f7351f;
        int i5 = iArr[i4];
        int i6 = this.f7352g;
        if (i4 < i6 - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (i6 - i4) - 1);
        }
        this.f7352g--;
        this.modCount++;
        return Integer.valueOf(i5);
    }

    public final void removeRange(int i4, int i5) {
        s();
        if (i5 >= i4) {
            int[] iArr = this.f7351f;
            System.arraycopy(iArr, i5, iArr, i4, this.f7352g - i5);
            this.f7352g -= i5 - i4;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i4, Object obj) {
        int intValue = ((Integer) obj).intValue();
        s();
        w(i4);
        int[] iArr = this.f7351f;
        int i5 = iArr[i4];
        iArr[i4] = intValue;
        return Integer.valueOf(i5);
    }

    public final int size() {
        return this.f7352g;
    }

    public final int t(int i4) {
        w(i4);
        return this.f7351f[i4];
    }

    public final void u(int i4) {
        s();
        int i5 = this.f7352g;
        int[] iArr = this.f7351f;
        if (i5 == iArr.length) {
            int[] iArr2 = new int[(((i5 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.f7351f = iArr2;
        }
        int[] iArr3 = this.f7351f;
        int i6 = this.f7352g;
        this.f7352g = i6 + 1;
        iArr3[i6] = i4;
    }

    public final void w(int i4) {
        if (i4 < 0 || i4 >= this.f7352g) {
            throw new IndexOutOfBoundsException(x(i4));
        }
    }

    public final String x(int i4) {
        int i5 = this.f7352g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i4);
        sb.append(", Size:");
        sb.append(i5);
        return sb.toString();
    }

    public final /* synthetic */ boolean add(Object obj) {
        u(((Integer) obj).intValue());
        return true;
    }
}
