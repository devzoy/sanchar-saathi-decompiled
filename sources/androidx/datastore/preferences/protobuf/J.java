package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class J extends LinkedHashMap {

    /* renamed from: f  reason: collision with root package name */
    public static final J f5043f;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5044e = true;

    static {
        J j4 = new J();
        f5043f = j4;
        j4.n();
    }

    public J() {
    }

    public static int a(Map map) {
        int i4 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i4 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i4;
    }

    public static int b(Object obj) {
        return obj instanceof byte[] ? C0372y.d((byte[]) obj) : obj.hashCode();
    }

    public static void e(Map map) {
        for (Object next : map.keySet()) {
            C0372y.a(next);
            C0372y.a(map.get(next));
        }
    }

    public static J g() {
        return f5043f;
    }

    public static boolean k(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean l(java.util.Map r4, java.util.Map r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = k(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.J.l(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        h();
        super.clear();
    }

    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && l(this, (Map) obj);
    }

    public final void h() {
        if (!m()) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        return a(this);
    }

    public boolean m() {
        return this.f5044e;
    }

    public void n() {
        this.f5044e = false;
    }

    public void o(J j4) {
        h();
        if (!j4.isEmpty()) {
            putAll(j4);
        }
    }

    public J p() {
        return isEmpty() ? new J() : new J(this);
    }

    public Object put(Object obj, Object obj2) {
        h();
        C0372y.a(obj);
        C0372y.a(obj2);
        return super.put(obj, obj2);
    }

    public void putAll(Map map) {
        h();
        e(map);
        super.putAll(map);
    }

    public Object remove(Object obj) {
        h();
        return super.remove(obj);
    }

    public J(Map map) {
        super(map);
    }
}
