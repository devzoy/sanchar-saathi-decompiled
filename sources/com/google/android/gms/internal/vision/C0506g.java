package com.google.android.gms.internal.vision;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.vision.g  reason: case insensitive filesystem */
public final class C0506g extends WeakReference {

    /* renamed from: a  reason: collision with root package name */
    public final int f7444a;

    public C0506g(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f7444a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C0506g.class) {
            if (this == obj) {
                return true;
            }
            C0506g gVar = (C0506g) obj;
            return this.f7444a == gVar.f7444a && get() == gVar.get();
        }
    }

    public final int hashCode() {
        return this.f7444a;
    }
}
