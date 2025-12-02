package com.google.android.gms.internal.vision;

public abstract class B1 {

    /* renamed from: a  reason: collision with root package name */
    public static final A1 f7196a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final A1 f7197b = new C1();

    public static A1 a() {
        return f7196a;
    }

    public static A1 b() {
        return f7197b;
    }

    public static A1 c() {
        try {
            return (A1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
