package com.google.android.gms.internal.vision;

import java.lang.reflect.Type;

public enum G0 {
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
    MAP(50, I0.MAP, Y0.VOID);
    

    /* renamed from: i0  reason: collision with root package name */
    public static final G0[] f7259i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public static final Type[] f7261j0 = null;

    /* renamed from: e  reason: collision with root package name */
    public final Y0 f7279e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7280f;

    /* renamed from: g  reason: collision with root package name */
    public final I0 f7281g;

    /* renamed from: h  reason: collision with root package name */
    public final Class f7282h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7283i;

    static {
        f7261j0 = new Type[0];
        G0[] values = values();
        f7259i0 = new G0[values.length];
        for (G0 g02 : values) {
            f7259i0[g02.f7280f] = g02;
        }
    }

    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = com.google.android.gms.internal.vision.J0.f7299b[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    G0(int r3, com.google.android.gms.internal.vision.I0 r4, com.google.android.gms.internal.vision.Y0 r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f7280f = r3
            r0.f7281g = r4
            r0.f7279e = r5
            int[] r1 = com.google.android.gms.internal.vision.J0.f7298a
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x001b
            r1 = 0
            r0.f7282h = r1
            goto L_0x0028
        L_0x001b:
            java.lang.Class r1 = r5.b()
            r0.f7282h = r1
            goto L_0x0028
        L_0x0022:
            java.lang.Class r1 = r5.b()
            r0.f7282h = r1
        L_0x0028:
            com.google.android.gms.internal.vision.I0 r1 = com.google.android.gms.internal.vision.I0.SCALAR
            if (r4 != r1) goto L_0x003c
            int[] r1 = com.google.android.gms.internal.vision.J0.f7299b
            int r4 = r5.ordinal()
            r1 = r1[r4]
            if (r1 == r3) goto L_0x003c
            if (r1 == r2) goto L_0x003c
            r2 = 3
            if (r1 == r2) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            r0.f7283i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.G0.<init>(java.lang.String, int, int, com.google.android.gms.internal.vision.I0, com.google.android.gms.internal.vision.Y0):void");
    }

    public final int a() {
        return this.f7280f;
    }
}
