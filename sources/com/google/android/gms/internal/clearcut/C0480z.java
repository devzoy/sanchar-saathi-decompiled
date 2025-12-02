package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.clearcut.z  reason: case insensitive filesystem */
public final class C0480z implements Iterator {

    /* renamed from: e  reason: collision with root package name */
    public int f7187e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final int f7188f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0477y f7189g;

    public C0480z(C0477y yVar) {
        this.f7189g = yVar;
        this.f7188f = yVar.size();
    }

    public final byte b() {
        try {
            C0477y yVar = this.f7189g;
            int i4 = this.f7187e;
            this.f7187e = i4 + 1;
            return yVar.B(i4);
        } catch (IndexOutOfBoundsException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f7187e < this.f7188f;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(b());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
