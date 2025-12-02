package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.s  reason: case insensitive filesystem */
public abstract class C0459s extends AbstractList implements C0422f0 {

    /* renamed from: e  reason: collision with root package name */
    public boolean f7155e = true;

    public boolean add(Object obj) {
        s();
        return super.add(obj);
    }

    public boolean addAll(int i4, Collection collection) {
        s();
        return super.addAll(i4, collection);
    }

    public void clear() {
        s();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (!get(i4).equals(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = (i4 * 31) + get(i5).hashCode();
        }
        return i4;
    }

    public boolean j() {
        return this.f7155e;
    }

    public final void m() {
        this.f7155e = false;
    }

    public boolean remove(Object obj) {
        s();
        return super.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        s();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        s();
        return super.retainAll(collection);
    }

    public final void s() {
        if (!this.f7155e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean addAll(Collection collection) {
        s();
        return super.addAll(collection);
    }
}
