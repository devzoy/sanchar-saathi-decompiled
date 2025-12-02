package v3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f12459a = new Object[0];

    public static final Object[] a(Collection collection) {
        l.e(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    objArr[i4] = it.next();
                    if (i5 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i6 = ((i5 * 3) + 1) >>> 1;
                        if (i6 <= i5) {
                            i6 = 2147483645;
                            if (i5 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i6);
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i5);
                        l.d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i4 = i5;
                }
            }
        }
        return f12459a;
    }

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArr2;
        l.e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i4 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    l.c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i5 = i4 + 1;
                    objArr2[i4] = it.next();
                    if (i5 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i6 = ((i5 * 3) + 1) >>> 1;
                        if (i6 <= i5) {
                            i6 = 2147483645;
                            if (i5 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i6);
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i5] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i5);
                        l.d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i4 = i5;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }
}
