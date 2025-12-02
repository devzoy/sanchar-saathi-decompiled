package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.List;

public final class N0 extends C0459s {

    /* renamed from: g  reason: collision with root package name */
    public static final N0 f6854g;

    /* renamed from: f  reason: collision with root package name */
    public final List f6855f;

    static {
        N0 n02 = new N0();
        f6854g = n02;
        n02.m();
    }

    public N0() {
        this(new ArrayList(10));
    }

    public static N0 t() {
        return f6854g;
    }

    public final void add(int i4, Object obj) {
        s();
        this.f6855f.add(i4, obj);
        this.modCount++;
    }

    public final Object get(int i4) {
        return this.f6855f.get(i4);
    }

    public final /* synthetic */ C0422f0 h(int i4) {
        if (i4 >= size()) {
            ArrayList arrayList = new ArrayList(i4);
            arrayList.addAll(this.f6855f);
            return new N0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final Object remove(int i4) {
        s();
        Object remove = this.f6855f.remove(i4);
        this.modCount++;
        return remove;
    }

    public final Object set(int i4, Object obj) {
        s();
        Object obj2 = this.f6855f.set(i4, obj);
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f6855f.size();
    }

    public N0(List list) {
        this.f6855f = list;
    }
}
