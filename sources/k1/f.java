package K1;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

public abstract class f extends AbstractCollection implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object[] f1687e = new Object[0];

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Object[] s() {
        return null;
    }

    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public int t() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f1687e);
    }

    public int u() {
        throw new UnsupportedOperationException();
    }

    public abstract int v(Object[] objArr, int i4);

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] s4 = s();
            if (s4 != null) {
                return Arrays.copyOfRange(s4, t(), u(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        v(objArr, 0);
        return objArr;
    }
}
