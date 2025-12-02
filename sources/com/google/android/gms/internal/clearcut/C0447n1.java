package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.n1  reason: case insensitive filesystem */
public enum C0447n1 {
    DOUBLE(C0461s1.DOUBLE, 1),
    FLOAT(C0461s1.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C0461s1.BOOLEAN, 0),
    STRING(C0461s1.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(C0461s1.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(C0461s1.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: e  reason: collision with root package name */
    public final C0461s1 f7144e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7145f;

    /* access modifiers changed from: public */
    C0447n1(C0461s1 s1Var, int i4) {
        this.f7144e = s1Var;
        this.f7145f = i4;
    }
}
