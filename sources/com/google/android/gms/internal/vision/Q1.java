package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class Q1 implements Iterator {

    /* renamed from: e  reason: collision with root package name */
    public int f7354e;

    /* renamed from: f  reason: collision with root package name */
    public Iterator f7355f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ O1 f7356g;

    public Q1(O1 o12) {
        this.f7356g = o12;
        this.f7354e = o12.f7325f.size();
    }

    public final Iterator c() {
        if (this.f7355f == null) {
            this.f7355f = this.f7356g.f7329j.entrySet().iterator();
        }
        return this.f7355f;
    }

    public final boolean hasNext() {
        int i4 = this.f7354e;
        return (i4 > 0 && i4 <= this.f7356g.f7325f.size()) || c().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (c().hasNext()) {
            return (Map.Entry) c().next();
        }
        List g4 = this.f7356g.f7325f;
        int i4 = this.f7354e - 1;
        this.f7354e = i4;
        return (Map.Entry) g4.get(i4);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Q1(O1 o12, N1 n12) {
        this(o12);
    }
}
