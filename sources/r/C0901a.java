package r;

import java.util.HashMap;
import java.util.Map;
import r.C0902b;

/* renamed from: r.a  reason: case insensitive filesystem */
public class C0901a extends C0902b {

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f11925i = new HashMap();

    public Map.Entry A(Object obj) {
        if (contains(obj)) {
            return ((C0902b.c) this.f11925i.get(obj)).f11933h;
        }
        return null;
    }

    public boolean contains(Object obj) {
        return this.f11925i.containsKey(obj);
    }

    public C0902b.c u(Object obj) {
        return (C0902b.c) this.f11925i.get(obj);
    }

    public Object y(Object obj, Object obj2) {
        C0902b.c u4 = u(obj);
        if (u4 != null) {
            return u4.f11931f;
        }
        this.f11925i.put(obj, x(obj, obj2));
        return null;
    }

    public Object z(Object obj) {
        Object z4 = super.z(obj);
        this.f11925i.remove(obj);
        return z4;
    }
}
