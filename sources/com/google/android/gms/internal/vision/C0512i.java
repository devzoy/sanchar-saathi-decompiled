package com.google.android.gms.internal.vision;

import java.util.List;

/* renamed from: com.google.android.gms.internal.vision.i  reason: case insensitive filesystem */
public final class C0512i extends C0499e {

    /* renamed from: b  reason: collision with root package name */
    public final C0509h f7476b = new C0509h();

    public final void a(Throwable th) {
        th.printStackTrace();
        List<Throwable> a4 = this.f7476b.a(th, false);
        if (a4 != null) {
            synchronized (a4) {
                try {
                    for (Throwable printStackTrace : a4) {
                        System.err.print("Suppressed: ");
                        printStackTrace.printStackTrace();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
