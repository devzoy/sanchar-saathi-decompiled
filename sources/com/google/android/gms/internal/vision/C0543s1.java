package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.s1  reason: case insensitive filesystem */
public abstract class C0543s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0538q1 f7535a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final C0538q1 f7536b = new C0535p1();

    public static C0538q1 a() {
        return f7535a;
    }

    public static C0538q1 b() {
        return f7536b;
    }

    public static C0538q1 c() {
        try {
            return (C0538q1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
