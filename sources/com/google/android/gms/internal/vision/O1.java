package com.google.android.gms.internal.vision;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class O1 extends AbstractMap {

    /* renamed from: e  reason: collision with root package name */
    public final int f7324e;

    /* renamed from: f  reason: collision with root package name */
    public List f7325f;

    /* renamed from: g  reason: collision with root package name */
    public Map f7326g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7327h;

    /* renamed from: i  reason: collision with root package name */
    public volatile V1 f7328i;

    /* renamed from: j  reason: collision with root package name */
    public Map f7329j;

    /* renamed from: k  reason: collision with root package name */
    public volatile P1 f7330k;

    public O1(int i4) {
        this.f7324e = i4;
        this.f7325f = Collections.emptyList();
        this.f7326g = Collections.emptyMap();
        this.f7329j = Collections.emptyMap();
    }

    public static O1 b(int i4) {
        return new N1(i4);
    }

    public final int a(Comparable comparable) {
        int i4;
        int size = this.f7325f.size();
        int i5 = size - 1;
        if (i5 >= 0) {
            int compareTo = comparable.compareTo((Comparable) ((T1) this.f7325f.get(i5)).getKey());
            if (compareTo > 0) {
                i4 = size + 1;
                return -i4;
            } else if (compareTo == 0) {
                return i5;
            }
        }
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) / 2;
            int compareTo2 = comparable.compareTo((Comparable) ((T1) this.f7325f.get(i7)).getKey());
            if (compareTo2 < 0) {
                i5 = i7 - 1;
            } else if (compareTo2 <= 0) {
                return i7;
            } else {
                i6 = i7 + 1;
            }
        }
        i4 = i6 + 1;
        return -i4;
    }

    public void clear() {
        p();
        if (!this.f7325f.isEmpty()) {
            this.f7325f.clear();
        }
        if (!this.f7326g.isEmpty()) {
            this.f7326g.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f7326g.containsKey(comparable);
    }

    /* renamed from: d */
    public final Object put(Comparable comparable, Object obj) {
        p();
        int a4 = a(comparable);
        if (a4 >= 0) {
            return ((T1) this.f7325f.get(a4)).setValue(obj);
        }
        p();
        if (this.f7325f.isEmpty() && !(this.f7325f instanceof ArrayList)) {
            this.f7325f = new ArrayList(this.f7324e);
        }
        int i4 = -(a4 + 1);
        if (i4 >= this.f7324e) {
            return q().put(comparable, obj);
        }
        int size = this.f7325f.size();
        int i5 = this.f7324e;
        if (size == i5) {
            T1 t12 = (T1) this.f7325f.remove(i5 - 1);
            q().put((Comparable) t12.getKey(), t12.getValue());
        }
        this.f7325f.add(i4, new T1(this, comparable, obj));
        return null;
    }

    public void e() {
        if (!this.f7327h) {
            this.f7326g = this.f7326g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7326g);
            this.f7329j = this.f7329j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7329j);
            this.f7327h = true;
        }
    }

    public Set entrySet() {
        if (this.f7328i == null) {
            this.f7328i = new V1(this, (N1) null);
        }
        return this.f7328i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O1)) {
            return super.equals(obj);
        }
        O1 o12 = (O1) obj;
        int size = size();
        if (size != o12.size()) {
            return false;
        }
        int j4 = j();
        if (j4 != o12.j()) {
            return entrySet().equals(o12.entrySet());
        }
        for (int i4 = 0; i4 < j4; i4++) {
            if (!h(i4).equals(o12.h(i4))) {
                return false;
            }
        }
        if (j4 != size) {
            return this.f7326g.equals(o12.f7326g);
        }
        return true;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a4 = a(comparable);
        return a4 >= 0 ? ((T1) this.f7325f.get(a4)).getValue() : this.f7326g.get(comparable);
    }

    public final Map.Entry h(int i4) {
        return (Map.Entry) this.f7325f.get(i4);
    }

    public int hashCode() {
        int j4 = j();
        int i4 = 0;
        for (int i5 = 0; i5 < j4; i5++) {
            i4 += ((T1) this.f7325f.get(i5)).hashCode();
        }
        return this.f7326g.size() > 0 ? i4 + this.f7326g.hashCode() : i4;
    }

    public final boolean i() {
        return this.f7327h;
    }

    public final int j() {
        return this.f7325f.size();
    }

    public final Object k(int i4) {
        p();
        Object value = ((T1) this.f7325f.remove(i4)).getValue();
        if (!this.f7326g.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f7325f.add(new T1(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public final Iterable m() {
        return this.f7326g.isEmpty() ? S1.a() : this.f7326g.entrySet();
    }

    public final Set o() {
        if (this.f7330k == null) {
            this.f7330k = new P1(this, (N1) null);
        }
        return this.f7330k;
    }

    public final void p() {
        if (this.f7327h) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap q() {
        p();
        if (this.f7326g.isEmpty() && !(this.f7326g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7326g = treeMap;
            this.f7329j = treeMap.descendingMap();
        }
        return (SortedMap) this.f7326g;
    }

    public Object remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int a4 = a(comparable);
        if (a4 >= 0) {
            return k(a4);
        }
        if (this.f7326g.isEmpty()) {
            return null;
        }
        return this.f7326g.remove(comparable);
    }

    public int size() {
        return this.f7325f.size() + this.f7326g.size();
    }

    public /* synthetic */ O1(int i4, N1 n12) {
        this(i4);
    }
}
