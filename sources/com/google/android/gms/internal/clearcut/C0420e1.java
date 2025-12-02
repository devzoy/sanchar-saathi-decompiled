package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.e1  reason: case insensitive filesystem */
public final class C0420e1 implements Iterator {

    /* renamed from: e  reason: collision with root package name */
    public Iterator f7067e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0414c1 f7068f;

    public C0420e1(C0414c1 c1Var) {
        this.f7068f = c1Var;
        this.f7067e = c1Var.f7050e.iterator();
    }

    public final boolean hasNext() {
        return this.f7067e.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f7067e.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
