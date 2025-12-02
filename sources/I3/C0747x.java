package i3;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: i3.x  reason: case insensitive filesystem */
public final class C0747x implements ListIterator {

    /* renamed from: e  reason: collision with root package name */
    public static final C0747x f10303e = new C0747x();

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public Void next() {
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public Void previous() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
