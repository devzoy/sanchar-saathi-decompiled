package com.google.android.gms.internal.clearcut;

public abstract class T {

    /* renamed from: a  reason: collision with root package name */
    public static final P f6899a = new Q();

    /* renamed from: b  reason: collision with root package name */
    public static final P f6900b = a();

    public static P a() {
        try {
            return (P) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static P b() {
        return f6899a;
    }

    public static P c() {
        P p4 = f6900b;
        if (p4 != null) {
            return p4;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
