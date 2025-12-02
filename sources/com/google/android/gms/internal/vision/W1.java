package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

public final class W1 implements Iterator {

    /* renamed from: e  reason: collision with root package name */
    public int f7388e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7389f;

    /* renamed from: g  reason: collision with root package name */
    public Iterator f7390g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ O1 f7391h;

    public W1(O1 o12) {
        this.f7391h = o12;
        this.f7388e = -1;
    }

    public final Iterator c() {
        if (this.f7390g == null) {
            this.f7390g = this.f7391h.f7326g.entrySet().iterator();
        }
        return this.f7390g;
    }

    public final boolean hasNext() {
        return this.f7388e + 1 < this.f7391h.f7325f.size() || (!this.f7391h.f7326g.isEmpty() && c().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f7389f = true;
        int i4 = this.f7388e + 1;
        this.f7388e = i4;
        return i4 < this.f7391h.f7325f.size() ? (Map.Entry) this.f7391h.f7325f.get(this.f7388e) : (Map.Entry) c().next();
    }

    public final void remove() {
        if (this.f7389f) {
            this.f7389f = false;
            this.f7391h.p();
            if (this.f7388e < this.f7391h.f7325f.size()) {
                O1 o12 = this.f7391h;
                int i4 = this.f7388e;
                this.f7388e = i4 - 1;
                Object unused = o12.k(i4);
                return;
            }
            c().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ W1(O1 o12, N1 n12) {
        this(o12);
    }
}
