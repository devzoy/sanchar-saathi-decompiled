package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.q  reason: case insensitive filesystem */
public abstract class C0454q implements C0 {
    public final /* synthetic */ C0 j(B0 b02) {
        if (h().getClass().isInstance(b02)) {
            return k((C0451p) b02);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract C0454q k(C0451p pVar);
}
