package i3;

import java.util.AbstractList;
import java.util.List;

/* renamed from: i3.e  reason: case insensitive filesystem */
public abstract class C0728e extends AbstractList implements List {
    public final /* bridge */ Object remove(int i4) {
        return t(i4);
    }

    public abstract int s();

    public final /* bridge */ int size() {
        return s();
    }

    public abstract Object t(int i4);
}
