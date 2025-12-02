package com.google.android.gms.internal.vision;

public enum Y0 {
    VOID(Void.class, Void.class, (Class) null),
    INT(r0, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C0507g0.class, C0507g0.class, C0507g0.f7445f),
    ENUM(r0, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: e  reason: collision with root package name */
    public final Class f7404e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f7405f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f7406g;

    /* access modifiers changed from: public */
    Y0(Class cls, Class cls2, Object obj) {
        this.f7404e = cls;
        this.f7405f = cls2;
        this.f7406g = obj;
    }

    public final Class b() {
        return this.f7405f;
    }
}
