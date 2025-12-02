package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class f2 extends AbstractList implements C0497d1, RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    public final C0497d1 f7443e;

    public f2(C0497d1 d1Var) {
        this.f7443e = d1Var;
    }

    public final C0497d1 c() {
        return this;
    }

    public final List e() {
        return this.f7443e.e();
    }

    public final Object f(int i4) {
        return this.f7443e.f(i4);
    }

    public final /* synthetic */ Object get(int i4) {
        return (String) this.f7443e.get(i4);
    }

    public final Iterator iterator() {
        return new i2(this);
    }

    public final ListIterator listIterator(int i4) {
        return new C0502e2(this, i4);
    }

    public final void n(C0507g0 g0Var) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f7443e.size();
    }
}
