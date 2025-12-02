package i3;

import java.lang.reflect.Array;
import v3.l;

/* renamed from: i3.i  reason: case insensitive filesystem */
public abstract class C0732i {
    public static final Object[] a(Object[] objArr, int i4) {
        l.e(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i4);
        l.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    public static final void b(int i4, int i5) {
        if (i4 > i5) {
            throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i5 + ").");
        }
    }
}
