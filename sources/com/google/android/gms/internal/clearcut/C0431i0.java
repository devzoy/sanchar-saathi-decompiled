package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.i0  reason: case insensitive filesystem */
public enum C0431i0 {
    VOID(Void.class, Void.class, (Class) null),
    INT(r0, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C0477y.class, C0477y.class, C0477y.f7181f),
    ENUM(r0, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: e  reason: collision with root package name */
    public final Class f7112e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f7113f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f7114g;

    /* access modifiers changed from: public */
    C0431i0(Class cls, Class cls2, Object obj) {
        this.f7112e = cls;
        this.f7113f = cls2;
        this.f7114g = obj;
    }

    public final Class b() {
        return this.f7113f;
    }
}
