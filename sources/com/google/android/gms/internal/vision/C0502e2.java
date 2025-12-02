package com.google.android.gms.internal.vision;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.vision.e2  reason: case insensitive filesystem */
public final class C0502e2 implements ListIterator {

    /* renamed from: e  reason: collision with root package name */
    public ListIterator f7435e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f7436f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f2 f7437g;

    public C0502e2(f2 f2Var, int i4) {
        this.f7437g = f2Var;
        this.f7436f = i4;
        this.f7435e = f2Var.f7443e.listIterator(i4);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f7435e.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f7435e.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f7435e.next();
    }

    public final int nextIndex() {
        return this.f7435e.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f7435e.previous();
    }

    public final int previousIndex() {
        return this.f7435e.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
