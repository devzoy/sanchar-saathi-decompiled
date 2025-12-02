package K1;

import java.util.NoSuchElementException;

public abstract class c extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f1682e;

    /* renamed from: f  reason: collision with root package name */
    public int f1683f;

    public c(int i4, int i5) {
        w.c(i5, i4, "index");
        this.f1682e = i4;
        this.f1683f = i5;
    }

    public abstract Object c(int i4);

    public final boolean hasNext() {
        return this.f1683f < this.f1682e;
    }

    public final boolean hasPrevious() {
        return this.f1683f > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i4 = this.f1683f;
            this.f1683f = i4 + 1;
            return c(i4);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f1683f;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i4 = this.f1683f - 1;
            this.f1683f = i4;
            return c(i4);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f1683f - 1;
    }
}
