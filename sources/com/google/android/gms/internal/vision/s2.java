package com.google.android.gms.internal.vision;

public enum s2 {
    DOUBLE(v2.DOUBLE, 1),
    FLOAT(v2.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(v2.BOOLEAN, 0),
    STRING(v2.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(v2.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(v2.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: e  reason: collision with root package name */
    public final v2 f7556e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7557f;

    /* access modifiers changed from: public */
    s2(v2 v2Var, int i4) {
        this.f7556e = v2Var;
        this.f7557f = i4;
    }

    public final v2 b() {
        return this.f7556e;
    }
}
