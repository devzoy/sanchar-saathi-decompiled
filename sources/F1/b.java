package F1;

import F1.a;
import android.os.IBinder;
import java.lang.reflect.Field;
import z1.C1032o;

public final class b extends a.C0011a {

    /* renamed from: c  reason: collision with root package name */
    public final Object f1030c;

    public b(Object obj) {
        this.f1030c = obj;
    }

    public static Object J(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f1030c;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i4 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i4++;
                field = field2;
            }
        }
        if (i4 == 1) {
            C1032o.f(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e4) {
                    throw new IllegalArgumentException("Binder object is null.", e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e5);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 53);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static a K(Object obj) {
        return new b(obj);
    }
}
