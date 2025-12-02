package i3;

import java.util.Iterator;

/* renamed from: i3.B  reason: case insensitive filesystem */
public abstract class C0718B implements Iterator {
    public abstract int c();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(c());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
