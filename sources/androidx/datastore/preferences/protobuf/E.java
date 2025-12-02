package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0372y;
import java.util.List;

public final class E implements D {
    public static C0372y.b d(Object obj, long j4) {
        return (C0372y.b) p0.z(obj, j4);
    }

    public void a(Object obj, long j4) {
        d(obj, j4).i();
    }

    public List b(Object obj, long j4) {
        C0372y.b d4 = d(obj, j4);
        if (d4.r()) {
            return d4;
        }
        int size = d4.size();
        C0372y.b k4 = d4.k(size == 0 ? 10 : size * 2);
        p0.O(obj, j4, k4);
        return k4;
    }

    public void c(Object obj, Object obj2, long j4) {
        C0372y.b d4 = d(obj, j4);
        C0372y.b d5 = d(obj2, j4);
        int size = d4.size();
        int size2 = d5.size();
        if (size > 0 && size2 > 0) {
            if (!d4.r()) {
                d4 = d4.k(size2 + size);
            }
            d4.addAll(d5);
        }
        if (size > 0) {
            d5 = d4;
        }
        p0.O(obj, j4, d5);
    }
}
