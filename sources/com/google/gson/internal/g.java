package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class g extends AbstractMap implements Serializable {

    /* renamed from: l  reason: collision with root package name */
    public static final Comparator f8526l = new a();

    /* renamed from: e  reason: collision with root package name */
    public Comparator f8527e;

    /* renamed from: f  reason: collision with root package name */
    public e f8528f;

    /* renamed from: g  reason: collision with root package name */
    public int f8529g;

    /* renamed from: h  reason: collision with root package name */
    public int f8530h;

    /* renamed from: i  reason: collision with root package name */
    public final e f8531i;

    /* renamed from: j  reason: collision with root package name */
    public b f8532j;

    /* renamed from: k  reason: collision with root package name */
    public c f8533k;

    public class a implements Comparator {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet {

        public class a extends d {
            public a() {
                super();
            }

            /* renamed from: d */
            public Map.Entry next() {
                return c();
            }
        }

        public b() {
        }

        public void clear() {
            g.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.c((Map.Entry) obj) != null;
        }

        public Iterator iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            e c4;
            if (!(obj instanceof Map.Entry) || (c4 = g.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.f(c4, true);
            return true;
        }

        public int size() {
            return g.this.f8529g;
        }
    }

    public final class c extends AbstractSet {

        public class a extends d {
            public a() {
                super();
            }

            public Object next() {
                return c().f8547j;
            }
        }

        public c() {
        }

        public void clear() {
            g.this.clear();
        }

        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        public Iterator iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            return g.this.g(obj) != null;
        }

        public int size() {
            return g.this.f8529g;
        }
    }

    public abstract class d implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        public e f8538e;

        /* renamed from: f  reason: collision with root package name */
        public e f8539f = null;

        /* renamed from: g  reason: collision with root package name */
        public int f8540g;

        public d() {
            this.f8538e = g.this.f8531i.f8545h;
            this.f8540g = g.this.f8530h;
        }

        public final e c() {
            e eVar = this.f8538e;
            g gVar = g.this;
            if (eVar == gVar.f8531i) {
                throw new NoSuchElementException();
            } else if (gVar.f8530h == this.f8540g) {
                this.f8538e = eVar.f8545h;
                this.f8539f = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f8538e != g.this.f8531i;
        }

        public final void remove() {
            e eVar = this.f8539f;
            if (eVar != null) {
                g.this.f(eVar, true);
                this.f8539f = null;
                this.f8540g = g.this.f8530h;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public g() {
        this(f8526l);
    }

    public final boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public e b(Object obj, boolean z4) {
        int i4;
        e eVar;
        Comparator comparator = this.f8527e;
        e eVar2 = this.f8528f;
        if (eVar2 != null) {
            Comparable comparable = comparator == f8526l ? (Comparable) obj : null;
            while (true) {
                i4 = comparable != null ? comparable.compareTo(eVar2.f8547j) : comparator.compare(obj, eVar2.f8547j);
                if (i4 == 0) {
                    return eVar2;
                }
                e eVar3 = i4 < 0 ? eVar2.f8543f : eVar2.f8544g;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i4 = 0;
        }
        if (!z4) {
            return null;
        }
        e eVar4 = this.f8531i;
        if (eVar2 != null) {
            eVar = new e(eVar2, obj, eVar4, eVar4.f8546i);
            if (i4 < 0) {
                eVar2.f8543f = eVar;
            } else {
                eVar2.f8544g = eVar;
            }
            e(eVar2, true);
        } else if (comparator != f8526l || (obj instanceof Comparable)) {
            eVar = new e(eVar2, obj, eVar4, eVar4.f8546i);
            this.f8528f = eVar;
        } else {
            throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
        }
        this.f8529g++;
        this.f8530h++;
        return eVar;
    }

    public e c(Map.Entry entry) {
        e d4 = d(entry.getKey());
        if (d4 == null || !a(d4.f8548k, entry.getValue())) {
            return null;
        }
        return d4;
    }

    public void clear() {
        this.f8528f = null;
        this.f8529g = 0;
        this.f8530h++;
        e eVar = this.f8531i;
        eVar.f8546i = eVar;
        eVar.f8545h = eVar;
    }

    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    public e d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final void e(e eVar, boolean z4) {
        while (eVar != null) {
            e eVar2 = eVar.f8543f;
            e eVar3 = eVar.f8544g;
            int i4 = 0;
            int i5 = eVar2 != null ? eVar2.f8549l : 0;
            int i6 = eVar3 != null ? eVar3.f8549l : 0;
            int i7 = i5 - i6;
            if (i7 == -2) {
                e eVar4 = eVar3.f8543f;
                e eVar5 = eVar3.f8544g;
                int i8 = eVar5 != null ? eVar5.f8549l : 0;
                if (eVar4 != null) {
                    i4 = eVar4.f8549l;
                }
                int i9 = i4 - i8;
                if (i9 == -1 || (i9 == 0 && !z4)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z4) {
                    return;
                }
            } else if (i7 == 2) {
                e eVar6 = eVar2.f8543f;
                e eVar7 = eVar2.f8544g;
                int i10 = eVar7 != null ? eVar7.f8549l : 0;
                if (eVar6 != null) {
                    i4 = eVar6.f8549l;
                }
                int i11 = i4 - i10;
                if (i11 == 1 || (i11 == 0 && !z4)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z4) {
                    return;
                }
            } else if (i7 == 0) {
                eVar.f8549l = i5 + 1;
                if (z4) {
                    return;
                }
            } else {
                eVar.f8549l = Math.max(i5, i6) + 1;
                if (!z4) {
                    return;
                }
            }
            eVar = eVar.f8542e;
        }
    }

    public Set entrySet() {
        b bVar = this.f8532j;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f8532j = bVar2;
        return bVar2;
    }

    public void f(e eVar, boolean z4) {
        int i4;
        if (z4) {
            e eVar2 = eVar.f8546i;
            eVar2.f8545h = eVar.f8545h;
            eVar.f8545h.f8546i = eVar2;
        }
        e eVar3 = eVar.f8543f;
        e eVar4 = eVar.f8544g;
        e eVar5 = eVar.f8542e;
        int i5 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f8543f = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f8544g = null;
            } else {
                h(eVar, (e) null);
            }
            e(eVar5, false);
            this.f8529g--;
            this.f8530h++;
            return;
        }
        e b4 = eVar3.f8549l > eVar4.f8549l ? eVar3.b() : eVar4.a();
        f(b4, false);
        e eVar6 = eVar.f8543f;
        if (eVar6 != null) {
            i4 = eVar6.f8549l;
            b4.f8543f = eVar6;
            eVar6.f8542e = b4;
            eVar.f8543f = null;
        } else {
            i4 = 0;
        }
        e eVar7 = eVar.f8544g;
        if (eVar7 != null) {
            i5 = eVar7.f8549l;
            b4.f8544g = eVar7;
            eVar7.f8542e = b4;
            eVar.f8544g = null;
        }
        b4.f8549l = Math.max(i4, i5) + 1;
        h(eVar, b4);
    }

    public e g(Object obj) {
        e d4 = d(obj);
        if (d4 != null) {
            f(d4, true);
        }
        return d4;
    }

    public Object get(Object obj) {
        e d4 = d(obj);
        if (d4 != null) {
            return d4.f8548k;
        }
        return null;
    }

    public final void h(e eVar, e eVar2) {
        e eVar3 = eVar.f8542e;
        eVar.f8542e = null;
        if (eVar2 != null) {
            eVar2.f8542e = eVar3;
        }
        if (eVar3 == null) {
            this.f8528f = eVar2;
        } else if (eVar3.f8543f == eVar) {
            eVar3.f8543f = eVar2;
        } else {
            eVar3.f8544g = eVar2;
        }
    }

    public final void i(e eVar) {
        e eVar2 = eVar.f8543f;
        e eVar3 = eVar.f8544g;
        e eVar4 = eVar3.f8543f;
        e eVar5 = eVar3.f8544g;
        eVar.f8544g = eVar4;
        if (eVar4 != null) {
            eVar4.f8542e = eVar;
        }
        h(eVar, eVar3);
        eVar3.f8543f = eVar;
        eVar.f8542e = eVar3;
        int i4 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f8549l : 0, eVar4 != null ? eVar4.f8549l : 0) + 1;
        eVar.f8549l = max;
        if (eVar5 != null) {
            i4 = eVar5.f8549l;
        }
        eVar3.f8549l = Math.max(max, i4) + 1;
    }

    public final void j(e eVar) {
        e eVar2 = eVar.f8543f;
        e eVar3 = eVar.f8544g;
        e eVar4 = eVar2.f8543f;
        e eVar5 = eVar2.f8544g;
        eVar.f8543f = eVar5;
        if (eVar5 != null) {
            eVar5.f8542e = eVar;
        }
        h(eVar, eVar2);
        eVar2.f8544g = eVar;
        eVar.f8542e = eVar2;
        int i4 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f8549l : 0, eVar5 != null ? eVar5.f8549l : 0) + 1;
        eVar.f8549l = max;
        if (eVar4 != null) {
            i4 = eVar4.f8549l;
        }
        eVar2.f8549l = Math.max(max, i4) + 1;
    }

    public Set keySet() {
        c cVar = this.f8533k;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f8533k = cVar2;
        return cVar2;
    }

    public Object put(Object obj, Object obj2) {
        if (obj != null) {
            e b4 = b(obj, true);
            Object obj3 = b4.f8548k;
            b4.f8548k = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    public Object remove(Object obj) {
        e g4 = g(obj);
        if (g4 != null) {
            return g4.f8548k;
        }
        return null;
    }

    public int size() {
        return this.f8529g;
    }

    public g(Comparator comparator) {
        this.f8529g = 0;
        this.f8530h = 0;
        this.f8531i = new e();
        this.f8527e = comparator == null ? f8526l : comparator;
    }

    public static final class e implements Map.Entry {

        /* renamed from: e  reason: collision with root package name */
        public e f8542e;

        /* renamed from: f  reason: collision with root package name */
        public e f8543f;

        /* renamed from: g  reason: collision with root package name */
        public e f8544g;

        /* renamed from: h  reason: collision with root package name */
        public e f8545h;

        /* renamed from: i  reason: collision with root package name */
        public e f8546i;

        /* renamed from: j  reason: collision with root package name */
        public final Object f8547j;

        /* renamed from: k  reason: collision with root package name */
        public Object f8548k;

        /* renamed from: l  reason: collision with root package name */
        public int f8549l;

        public e() {
            this.f8547j = null;
            this.f8546i = this;
            this.f8545h = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f8543f; eVar2 != null; eVar2 = eVar2.f8543f) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f8544g; eVar2 != null; eVar2 = eVar2.f8544g) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r3.f8547j
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                java.lang.Object r0 = r3.f8548k
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.g.e.equals(java.lang.Object):boolean");
        }

        public Object getKey() {
            return this.f8547j;
        }

        public Object getValue() {
            return this.f8548k;
        }

        public int hashCode() {
            Object obj = this.f8547j;
            int i4 = 0;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f8548k;
            if (obj2 != null) {
                i4 = obj2.hashCode();
            }
            return hashCode ^ i4;
        }

        public Object setValue(Object obj) {
            Object obj2 = this.f8548k;
            this.f8548k = obj;
            return obj2;
        }

        public String toString() {
            return this.f8547j + "=" + this.f8548k;
        }

        public e(e eVar, Object obj, e eVar2, e eVar3) {
            this.f8542e = eVar;
            this.f8547j = obj;
            this.f8549l = 1;
            this.f8545h = eVar2;
            this.f8546i = eVar3;
            eVar3.f8545h = this;
            eVar2.f8546i = this;
        }
    }
}
