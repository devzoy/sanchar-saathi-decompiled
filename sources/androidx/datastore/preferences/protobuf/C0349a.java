package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.P;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a  reason: case insensitive filesystem */
public abstract class C0349a implements P {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a  reason: collision with other inner class name */
    public static abstract class C0088a implements P.a {
        public static void h(Iterable iterable, List list) {
            C0372y.a(iterable);
            if (iterable instanceof C) {
                List q4 = ((C) iterable).q();
                C c4 = (C) list;
                int size = list.size();
                for (Object next : q4) {
                    if (next == null) {
                        String str = "Element at index " + (c4.size() - size) + " is null.";
                        for (int size2 = c4.size() - 1; size2 >= size; size2--) {
                            c4.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C0355g) {
                        c4.o((C0355g) next);
                    } else if (next instanceof byte[]) {
                        c4.o(C0355g.w((byte[]) next));
                    } else {
                        c4.add((String) next);
                    }
                }
            } else if (iterable instanceof Z) {
                list.addAll((Collection) iterable);
            } else {
                k(iterable, list);
            }
        }

        public static void k(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        public static l0 l(P p4) {
            return new l0(p4);
        }
    }

    public static void c(Iterable iterable, List list) {
        C0088a.h(iterable, list);
    }

    public abstract int d(f0 f0Var);

    public l0 h() {
        return new l0(this);
    }

    public void i(OutputStream outputStream) {
        C0358j Y3 = C0358j.Y(outputStream, C0358j.C(a()));
        e(Y3);
        Y3.V();
    }
}
