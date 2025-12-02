package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0372y;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.c  reason: case insensitive filesystem */
public abstract class C0351c extends AbstractList implements C0372y.b {

    /* renamed from: e  reason: collision with root package name */
    public boolean f5082e;

    public C0351c(boolean z4) {
        this.f5082e = z4;
    }

    public boolean addAll(Collection collection) {
        s();
        return super.addAll(collection);
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

    public final void i() {
        if (this.f5082e) {
            this.f5082e = false;
        }
    }

    public boolean r() {
        return this.f5082e;
    }

    public abstract Object remove(int i4);

    public boolean remove(Object obj) {
        s();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        s();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        s();
        return super.retainAll(collection);
    }

    public void s() {
        if (!this.f5082e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean addAll(int i4, Collection collection) {
        s();
        return super.addAll(i4, collection);
    }
}
