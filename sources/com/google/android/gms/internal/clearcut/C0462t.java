package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.t  reason: case insensitive filesystem */
public abstract class C0462t {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f7168a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f7169b = (a("org.robolectric.Robolectric") != null);

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b() {
        return f7168a != null && !f7169b;
    }

    public static Class c() {
        return f7168a;
    }
}
