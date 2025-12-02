package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.vision.n1  reason: case insensitive filesystem */
public final class C0529n1 extends LinkedHashMap {

    /* renamed from: f  reason: collision with root package name */
    public static final C0529n1 f7496f;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7497e = true;

    static {
        C0529n1 n1Var = new C0529n1();
        f7496f = n1Var;
        n1Var.f7497e = false;
    }

    public C0529n1() {
    }

    public static int a(Object obj) {
        if (obj instanceof byte[]) {
            return R0.j((byte[]) obj);
        }
        if (!(obj instanceof Q0)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static C0529n1 b() {
        return f7496f;
    }

    public final void clear() {
        l();
        super.clear();
    }

    public final void e(C0529n1 n1Var) {
        l();
        if (!n1Var.isEmpty()) {
            putAll(n1Var);
        }
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = r1
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = r0
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0529n1.equals(java.lang.Object):boolean");
    }

    public final C0529n1 g() {
        return isEmpty() ? new C0529n1() : new C0529n1(this);
    }

    public final void h() {
        this.f7497e = false;
    }

    public final int hashCode() {
        int i4 = 0;
        for (Map.Entry entry : entrySet()) {
            i4 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i4;
    }

    public final boolean k() {
        return this.f7497e;
    }

    public final void l() {
        if (!this.f7497e) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object put(Object obj, Object obj2) {
        l();
        R0.d(obj);
        R0.d(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        l();
        for (Object next : map.keySet()) {
            R0.d(next);
            R0.d(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        l();
        return super.remove(obj);
    }

    public C0529n1(Map map) {
        super(map);
    }
}
