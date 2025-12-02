package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.y0  reason: case insensitive filesystem */
public abstract class C0478y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0472w0 f7184a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final C0472w0 f7185b = new C0475x0();

    public static C0472w0 a() {
        return f7184a;
    }

    public static C0472w0 b() {
        return f7185b;
    }

    public static C0472w0 c() {
        try {
            return (C0472w0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
