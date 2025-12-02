package i3;

import java.util.Collection;
import v3.l;

/* renamed from: i3.p  reason: case insensitive filesystem */
public abstract class C0739p extends C0738o {
    public static int m(Iterable iterable, int i4) {
        l.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i4;
    }
}
