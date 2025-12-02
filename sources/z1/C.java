package z1;

import android.content.Context;
import android.util.SparseIntArray;
import u1.e;
import v1.C0947a;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f12861a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    public e f12862b;

    public C(e eVar) {
        C1032o.f(eVar);
        this.f12862b = eVar;
    }

    public final int a(Context context, C0947a.f fVar) {
        int g4;
        C1032o.f(context);
        C1032o.f(fVar);
        int i4 = 0;
        if (!fVar.f()) {
            return 0;
        }
        int i5 = fVar.i();
        int b4 = b(context, i5);
        if (b4 != -1) {
            return b4;
        }
        SparseIntArray sparseIntArray = this.f12861a;
        synchronized (sparseIntArray) {
            int i6 = 0;
            while (true) {
                try {
                    if (i6 >= sparseIntArray.size()) {
                        i4 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i6);
                    if (keyAt > i5 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    }
                    i6++;
                } finally {
                }
            }
            g4 = i4 == -1 ? this.f12862b.g(context, i5) : i4;
            sparseIntArray.put(i5, g4);
        }
        return g4;
    }

    public final int b(Context context, int i4) {
        int i5;
        SparseIntArray sparseIntArray = this.f12861a;
        synchronized (sparseIntArray) {
            i5 = sparseIntArray.get(i4, -1);
        }
        return i5;
    }

    public final void c() {
        SparseIntArray sparseIntArray = this.f12861a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
    }
}
