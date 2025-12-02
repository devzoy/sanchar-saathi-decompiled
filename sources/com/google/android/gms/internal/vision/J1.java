package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.RandomAccess;

public final class J1 extends C0484a0 implements RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    public static final J1 f7300h;

    /* renamed from: f  reason: collision with root package name */
    public Object[] f7301f;

    /* renamed from: g  reason: collision with root package name */
    public int f7302g;

    static {
        J1 j12 = new J1(new Object[0], 0);
        f7300h = j12;
        j12.d();
    }

    public J1(Object[] objArr, int i4) {
        this.f7301f = objArr;
        this.f7302g = i4;
    }

    public static J1 v() {
        return f7300h;
    }

    public final boolean add(Object obj) {
        s();
        int i4 = this.f7302g;
        Object[] objArr = this.f7301f;
        if (i4 == objArr.length) {
            this.f7301f = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7301f;
        int i5 = this.f7302g;
        this.f7302g = i5 + 1;
        objArr2[i5] = obj;
        this.modCount++;
        return true;
    }

    public final /* synthetic */ X0 b(int i4) {
        if (i4 >= this.f7302g) {
            return new J1(Arrays.copyOf(this.f7301f, i4), this.f7302g);
        }
        throw new IllegalArgumentException();
    }

    public final Object get(int i4) {
        t(i4);
        return this.f7301f[i4];
    }

    public final Object remove(int i4) {
        s();
        t(i4);
        Object[] objArr = this.f7301f;
        Object obj = objArr[i4];
        int i5 = this.f7302g;
        if (i4 < i5 - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (i5 - i4) - 1);
        }
        this.f7302g--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i4, Object obj) {
        s();
        t(i4);
        Object[] objArr = this.f7301f;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f7302g;
    }

    public final void t(int i4) {
        if (i4 < 0 || i4 >= this.f7302g) {
            throw new IndexOutOfBoundsException(u(i4));
        }
    }

    public final String u(int i4) {
        int i5 = this.f7302g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i4);
        sb.append(", Size:");
        sb.append(i5);
        return sb.toString();
    }

    public final void add(int i4, Object obj) {
        int i5;
        s();
        if (i4 < 0 || i4 > (i5 = this.f7302g)) {
            throw new IndexOutOfBoundsException(u(i4));
        }
        Object[] objArr = this.f7301f;
        if (i5 < objArr.length) {
            System.arraycopy(objArr, i4, objArr, i4 + 1, i5 - i4);
        } else {
            Object[] objArr2 = new Object[(((i5 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i4);
            System.arraycopy(this.f7301f, i4, objArr2, i4 + 1, this.f7302g - i4);
            this.f7301f = objArr2;
        }
        this.f7301f[i4] = obj;
        this.f7302g++;
        this.modCount++;
    }
}
