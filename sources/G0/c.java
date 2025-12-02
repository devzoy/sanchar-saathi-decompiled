package g0;

import g0.f;
import h3.C0666g;
import i3.C0720D;
import i3.C0735l;
import i3.C0739p;
import i3.C0746w;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import u3.l;
import v3.g;
import v3.m;
import z3.e;

public final class c extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Map f9047a;

    /* renamed from: b  reason: collision with root package name */
    public final b f9048b;

    public static final class a extends m implements l {

        /* renamed from: f  reason: collision with root package name */
        public static final a f9049f = new a();

        public a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence i(Map.Entry entry) {
            v3.l.e(entry, "entry");
            Object value = entry.getValue();
            String x4 = value instanceof byte[] ? C0735l.x((byte[]) value, ", ", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null) : String.valueOf(entry.getValue());
            return "  " + ((f.a) entry.getKey()).a() + " = " + x4;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Map map, boolean z4, int i4, g gVar) {
        this((i4 & 1) != 0 ? new LinkedHashMap() : map, (i4 & 2) != 0 ? true : z4);
    }

    public Map a() {
        C0666g gVar;
        Set<Map.Entry> entrySet = this.f9047a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.a(C0720D.d(C0739p.m(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                v3.l.d(copyOf, "copyOf(this, size)");
                gVar = new C0666g(key, copyOf);
            } else {
                gVar = new C0666g(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(gVar.c(), gVar.d());
        }
        return C0634a.b(linkedHashMap);
    }

    public Object b(f.a aVar) {
        v3.l.e(aVar, "key");
        Object obj = this.f9047a.get(aVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        v3.l.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void e() {
        if (this.f9048b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g0.c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            g0.c r6 = (g0.c) r6
            java.util.Map r0 = r6.f9047a
            java.util.Map r2 = r5.f9047a
            r3 = 1
            if (r0 != r2) goto L_0x0010
            return r3
        L_0x0010:
            int r0 = r0.size()
            java.util.Map r2 = r5.f9047a
            int r2 = r2.size()
            if (r0 == r2) goto L_0x001d
            return r1
        L_0x001d:
            java.util.Map r6 = r6.f9047a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0027
        L_0x0025:
            r1 = r3
            goto L_0x0067
        L_0x0027:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x002f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map r2 = r5.f9047a
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L_0x0064
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L_0x005f
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L_0x0064
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L_0x0064
            r0 = r3
            goto L_0x0065
        L_0x005f:
            boolean r0 = v3.l.a(r0, r2)
            goto L_0x0065
        L_0x0064:
            r0 = r1
        L_0x0065:
            if (r0 != 0) goto L_0x002f
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.c.equals(java.lang.Object):boolean");
    }

    public final void f() {
        e();
        this.f9047a.clear();
    }

    public final void g() {
        this.f9048b.b(true);
    }

    public final void h(f.b... bVarArr) {
        v3.l.e(bVarArr, "pairs");
        e();
        if (bVarArr.length > 0) {
            f.b bVar = bVarArr[0];
            throw null;
        }
    }

    public int hashCode() {
        int i4 = 0;
        for (Map.Entry value : this.f9047a.entrySet()) {
            Object value2 = value.getValue();
            i4 += value2 instanceof byte[] ? Arrays.hashCode((byte[]) value2) : value2.hashCode();
        }
        return i4;
    }

    public final Object i(f.a aVar) {
        v3.l.e(aVar, "key");
        e();
        return this.f9047a.remove(aVar);
    }

    public final void j(f.a aVar, Object obj) {
        v3.l.e(aVar, "key");
        k(aVar, obj);
    }

    public final void k(f.a aVar, Object obj) {
        v3.l.e(aVar, "key");
        e();
        if (obj == null) {
            i(aVar);
        } else if (obj instanceof Set) {
            this.f9047a.put(aVar, C0634a.a((Set) obj));
        } else if (obj instanceof byte[]) {
            Map map = this.f9047a;
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            v3.l.d(copyOf, "copyOf(this, size)");
            map.put(aVar, copyOf);
        } else {
            this.f9047a.put(aVar, obj);
        }
    }

    public String toString() {
        return C0746w.A(this.f9047a.entrySet(), ",\n", "{\n", "\n}", 0, (CharSequence) null, a.f9049f, 24, (Object) null);
    }

    public c(Map map, boolean z4) {
        v3.l.e(map, "preferencesMap");
        this.f9047a = map;
        this.f9048b = new b(z4);
    }
}
