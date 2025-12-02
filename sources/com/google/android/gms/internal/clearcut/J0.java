package com.google.android.gms.internal.clearcut;

public abstract class J0 {

    /* renamed from: a  reason: collision with root package name */
    public static final H0 f6803a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final H0 f6804b = new I0();

    public static H0 a() {
        return f6803a;
    }

    public static H0 b() {
        return f6804b;
    }

    public static H0 c() {
        try {
            return (H0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
