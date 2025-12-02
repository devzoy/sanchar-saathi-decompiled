package androidx.work;

import Q0.g;
import androidx.work.b;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v3.l;

public final class ArrayCreatingInputMerger extends g {
    public b b(List list) {
        l.e(list, "inputs");
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map h4 = ((b) it.next()).h();
            l.d(h4, "input.keyValueMap");
            Iterator it2 = h4.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    Class cls = value != null ? value.getClass() : String.class;
                    Object obj = hashMap.get(str);
                    l.d(str, "key");
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (l.a(cls2, cls)) {
                            l.d(value, "value");
                            value = d(obj, value);
                        } else if (l.a(cls2.getComponentType(), cls)) {
                            value = c(obj, value, cls);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else if (!cls.isArray()) {
                        value = e(value, cls);
                    }
                    l.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                }
            }
        }
        aVar.c(hashMap);
        b a4 = aVar.a();
        l.d(a4, "output.build()");
        return a4;
    }

    public final Object c(Object obj, Object obj2, Class cls) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        l.d(newInstance, "newArray");
        return newInstance;
    }

    public final Object d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        l.b(componentType);
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        l.d(newInstance, "newArray");
        return newInstance;
    }

    public final Object e(Object obj, Class cls) {
        Object newInstance = Array.newInstance(cls, 1);
        Array.set(newInstance, 0, obj);
        l.d(newInstance, "newArray");
        return newInstance;
    }
}
