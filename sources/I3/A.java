package I3;

import java.util.concurrent.atomic.AtomicReferenceArray;
import z3.e;

public final class A {
    private volatile AtomicReferenceArray<Object> array;

    public A(int i4) {
        this.array = new AtomicReferenceArray<>(i4);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i4) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i4 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i4);
        }
        return null;
    }

    public final void c(int i4, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i4 < length) {
            atomicReferenceArray.set(i4, obj);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(e.a(i4 + 1, length * 2));
        for (int i5 = 0; i5 < length; i5++) {
            atomicReferenceArray2.set(i5, atomicReferenceArray.get(i5));
        }
        atomicReferenceArray2.set(i4, obj);
        this.array = atomicReferenceArray2;
    }
}
