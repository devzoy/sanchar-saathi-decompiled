package com.google.android.gms.internal.vision;

import java.util.Iterator;

public final class i2 implements Iterator {

    /* renamed from: e  reason: collision with root package name */
    public Iterator f7479e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f2 f7480f;

    public i2(f2 f2Var) {
        this.f7480f = f2Var;
        this.f7479e = f2Var.f7443e.iterator();
    }

    public final boolean hasNext() {
        return this.f7479e.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f7479e.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
