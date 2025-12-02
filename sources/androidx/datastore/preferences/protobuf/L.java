package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;
import java.util.Map;

public final class L implements K {
    public static int i(int i4, Object obj, Object obj2) {
        J j4 = (J) obj;
        I i5 = (I) obj2;
        int i6 = 0;
        if (j4.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : j4.entrySet()) {
            i6 += i5.a(i4, entry.getKey(), entry.getValue());
        }
        return i6;
    }

    public static J j(Object obj, Object obj2) {
        J j4 = (J) obj;
        J j5 = (J) obj2;
        if (!j5.isEmpty()) {
            if (!j4.m()) {
                j4 = j4.p();
            }
            j4.o(j5);
        }
        return j4;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public Object b(Object obj) {
        return J.g().p();
    }

    public int c(int i4, Object obj, Object obj2) {
        return i(i4, obj, obj2);
    }

    public boolean d(Object obj) {
        return !((J) obj).m();
    }

    public Object e(Object obj) {
        ((J) obj).n();
        return obj;
    }

    public I.a f(Object obj) {
        return ((I) obj).c();
    }

    public Map g(Object obj) {
        return (J) obj;
    }

    public Map h(Object obj) {
        return (J) obj;
    }
}
