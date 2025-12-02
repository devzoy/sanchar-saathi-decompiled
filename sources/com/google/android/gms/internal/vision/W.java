package com.google.android.gms.internal.vision;

public abstract class W implements C0555w1 {
    public final /* synthetic */ C0555w1 d(C0546t1 t1Var) {
        if (h().getClass().isInstance(t1Var)) {
            return k((X) t1Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract W k(X x4);

    public abstract W l(byte[] bArr, int i4, int i5, A0 a02);
}
