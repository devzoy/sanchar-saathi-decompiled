package com.google.android.gms.internal.vision;

public abstract class Z {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f7407a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f7408b = (a("org.robolectric.Robolectric") != null);

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b() {
        return f7407a != null && !f7408b;
    }

    public static Class c() {
        return f7407a;
    }
}
