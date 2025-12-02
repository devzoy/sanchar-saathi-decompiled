package i3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import v3.l;

/* renamed from: i3.s  reason: case insensitive filesystem */
public abstract class C0742s extends C0741r {
    public static final void n(List list) {
        l.e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final void o(List list, Comparator comparator) {
        l.e(list, "<this>");
        l.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
