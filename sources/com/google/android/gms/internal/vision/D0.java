package com.google.android.gms.internal.vision;

public abstract class D0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0 f7205a = new B0();

    /* renamed from: b  reason: collision with root package name */
    public static final C0 f7206b = c();

    public static C0 a() {
        return f7205a;
    }

    public static C0 b() {
        C0 c02 = f7206b;
        if (c02 != null) {
            return c02;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static C0 c() {
        try {
            return (C0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
