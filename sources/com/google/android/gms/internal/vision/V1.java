package com.google.android.gms.internal.vision;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class V1 extends AbstractSet {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ O1 f7386e;

    public V1(O1 o12) {
        this.f7386e = o12;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f7386e.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f7386e.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f7386e.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new W1(this.f7386e, (N1) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f7386e.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f7386e.size();
    }

    public /* synthetic */ V1(O1 o12, N1 n12) {
        this(o12);
    }
}
