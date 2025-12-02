package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.a1  reason: case insensitive filesystem */
public final class C0485a1 implements Iterator {

    /* renamed from: e  reason: collision with root package name */
    public Iterator f7413e;

    public C0485a1(Iterator it) {
        this.f7413e = it;
    }

    public final boolean hasNext() {
        return this.f7413e.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f7413e.next();
        entry.getValue();
        return entry;
    }

    public final void remove() {
        this.f7413e.remove();
    }
}
