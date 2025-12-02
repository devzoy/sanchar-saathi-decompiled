package androidx.datastore.preferences.protobuf;

public enum A {
    VOID(Void.class, Void.class, (Class) null),
    INT(r0, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C0355g.class, C0355g.class, C0355g.f5093f),
    ENUM(r0, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: e  reason: collision with root package name */
    public final Class f5026e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f5027f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f5028g;

    /* access modifiers changed from: public */
    A(Class cls, Class cls2, Object obj) {
        this.f5026e = cls;
        this.f5027f = cls2;
        this.f5028g = obj;
    }

    public Class b() {
        return this.f5027f;
    }
}
