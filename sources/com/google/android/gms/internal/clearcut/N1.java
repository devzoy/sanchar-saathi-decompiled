package com.google.android.gms.internal.clearcut;

public abstract class N1 extends C0473w1 implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public static volatile N1[] f6856f;

    public static N1[] l() {
        if (f6856f == null) {
            synchronized (C0476x1.f7180c) {
                try {
                    if (f6856f == null) {
                        f6856f = new N1[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6856f;
    }
}
