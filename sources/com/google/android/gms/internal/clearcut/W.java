package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Type;

public enum W {
    DOUBLE(0, r4, r42),
    FLOAT(1, r4, r43),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r54),
    FIXED64(5, r4, r55),
    FIXED32(6, r4, r54),
    BOOL(7, r4, r49),
    STRING(8, r4, r33),
    MESSAGE(9, r4, r56),
    BYTES(10, r4, r35),
    UINT32(11, r4, r54),
    ENUM(12, r4, r51),
    SFIXED32(13, r4, r54),
    SFIXED64(14, r4, r55),
    SINT32(15, r4, r54),
    SINT64(16, r4, r55),
    GROUP(17, r4, r56),
    DOUBLE_LIST(18, r4, r42),
    FLOAT_LIST(19, r4, r43),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r54),
    FIXED64_LIST(23, r4, r55),
    FIXED32_LIST(24, r4, r54),
    BOOL_LIST(25, r4, r49),
    STRING_LIST(26, r4, r33),
    MESSAGE_LIST(27, r4, r56),
    BYTES_LIST(28, r4, r35),
    UINT32_LIST(29, r4, r54),
    ENUM_LIST(30, r4, r51),
    SFIXED32_LIST(31, r4, r54),
    SFIXED64_LIST(32, r4, r55),
    SINT32_LIST(33, r4, r54),
    SINT64_LIST(34, r4, r55),
    DOUBLE_LIST_PACKED(35, r4, r42),
    FLOAT_LIST_PACKED(36, r4, r43),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r54),
    FIXED64_LIST_PACKED(40, r4, r55),
    FIXED32_LIST_PACKED(41, r4, r54),
    BOOL_LIST_PACKED(42, r4, r49),
    UINT32_LIST_PACKED(43, r4, r54),
    ENUM_LIST_PACKED(44, r4, r51),
    SFIXED32_LIST_PACKED(45, r4, r54),
    SFIXED64_LIST_PACKED(46, r4, r55),
    SINT32_LIST_PACKED(47, r4, r54),
    SINT64_LIST_PACKED(48, r4, r55),
    GROUP_LIST(49, r57, r56),
    MAP(50, Y.MAP, C0431i0.VOID);
    

    /* renamed from: i0  reason: collision with root package name */
    public static final W[] f6950i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public static final Type[] f6952j0 = null;

    /* renamed from: e  reason: collision with root package name */
    public final C0431i0 f6970e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6971f;

    /* renamed from: g  reason: collision with root package name */
    public final Y f6972g;

    /* renamed from: h  reason: collision with root package name */
    public final Class f6973h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6974i;

    static {
        f6952j0 = new Type[0];
        W[] values = values();
        f6950i0 = new W[values.length];
        for (W w4 : values) {
            f6950i0[w4.f6971f] = w4;
        }
    }

    /* access modifiers changed from: public */
    W(int i4, Y y4, C0431i0 i0Var) {
        int i5;
        this.f6971f = i4;
        this.f6972g = y4;
        this.f6970e = i0Var;
        int i6 = X.f6976a[y4.ordinal()];
        boolean z4 = true;
        this.f6973h = (i6 == 1 || i6 == 2) ? i0Var.b() : null;
        this.f6974i = (y4 != Y.SCALAR || (i5 = X.f6977b[i0Var.ordinal()]) == 1 || i5 == 2 || i5 == 3) ? false : z4;
    }

    public final int b() {
        return this.f6971f;
    }
}
