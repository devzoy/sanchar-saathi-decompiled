package com.google.android.gms.internal.vision;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.vision.h  reason: case insensitive filesystem */
public final class C0509h {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f7450a = new ConcurrentHashMap(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    public final ReferenceQueue f7451b = new ReferenceQueue();

    public final List a(Throwable th, boolean z4) {
        Reference poll = this.f7451b.poll();
        while (poll != null) {
            this.f7450a.remove(poll);
            poll = this.f7451b.poll();
        }
        List list = (List) this.f7450a.get(new C0506g(th, (ReferenceQueue) null));
        if (!z4 || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.f7450a.putIfAbsent(new C0506g(th, this.f7451b), vector);
        return list2 == null ? vector : list2;
    }
}
