package v3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a implements Iterator {

    /* renamed from: e  reason: collision with root package name */
    public final Object[] f12442e;

    /* renamed from: f  reason: collision with root package name */
    public int f12443f;

    public a(Object[] objArr) {
        l.e(objArr, "array");
        this.f12442e = objArr;
    }

    public boolean hasNext() {
        return this.f12443f < this.f12442e.length;
    }

    public Object next() {
        try {
            Object[] objArr = this.f12442e;
            int i4 = this.f12443f;
            this.f12443f = i4 + 1;
            return objArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f12443f--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
