package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.c1  reason: case insensitive filesystem */
public final class C0414c1 extends AbstractList implements C0437k0, RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    public final C0437k0 f7050e;

    public C0414c1(C0437k0 k0Var) {
        this.f7050e = k0Var;
    }

    public final Object g(int i4) {
        return this.f7050e.g(i4);
    }

    public final /* synthetic */ Object get(int i4) {
        return (String) this.f7050e.get(i4);
    }

    public final Iterator iterator() {
        return new C0420e1(this);
    }

    public final List l() {
        return this.f7050e.l();
    }

    public final ListIterator listIterator(int i4) {
        return new C0417d1(this, i4);
    }

    public final C0437k0 p() {
        return this;
    }

    public final int size() {
        return this.f7050e.size();
    }
}
