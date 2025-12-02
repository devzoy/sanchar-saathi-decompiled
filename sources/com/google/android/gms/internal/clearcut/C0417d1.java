package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.clearcut.d1  reason: case insensitive filesystem */
public final class C0417d1 implements ListIterator {

    /* renamed from: e  reason: collision with root package name */
    public ListIterator f7052e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f7053f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0414c1 f7054g;

    public C0417d1(C0414c1 c1Var, int i4) {
        this.f7054g = c1Var;
        this.f7053f = i4;
        this.f7052e = c1Var.f7050e.listIterator(i4);
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f7052e.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f7052e.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f7052e.next();
    }

    public final int nextIndex() {
        return this.f7052e.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f7052e.previous();
    }

    public final int previousIndex() {
        return this.f7052e.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
