package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

/* renamed from: androidx.datastore.preferences.protobuf.t  reason: case insensitive filesystem */
public enum C0367t {
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
    MAP(50, b.MAP, A.VOID);
    

    /* renamed from: i0  reason: collision with root package name */
    public static final C0367t[] f5284i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public static final Type[] f5286j0 = null;

    /* renamed from: e  reason: collision with root package name */
    public final A f5304e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5305f;

    /* renamed from: g  reason: collision with root package name */
    public final b f5306g;

    /* renamed from: h  reason: collision with root package name */
    public final Class f5307h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5308i;

    /* renamed from: androidx.datastore.preferences.protobuf.t$a */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5309a = null;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f5310b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                androidx.datastore.preferences.protobuf.A[] r0 = androidx.datastore.preferences.protobuf.A.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5310b = r0
                r1 = 1
                androidx.datastore.preferences.protobuf.A r2 = androidx.datastore.preferences.protobuf.A.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5310b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.A r3 = androidx.datastore.preferences.protobuf.A.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f5310b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.A r4 = androidx.datastore.preferences.protobuf.A.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.datastore.preferences.protobuf.t$b[] r3 = androidx.datastore.preferences.protobuf.C0367t.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f5309a = r3
                androidx.datastore.preferences.protobuf.t$b r4 = androidx.datastore.preferences.protobuf.C0367t.b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f5309a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.datastore.preferences.protobuf.t$b r3 = androidx.datastore.preferences.protobuf.C0367t.b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f5309a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.datastore.preferences.protobuf.t$b r1 = androidx.datastore.preferences.protobuf.C0367t.b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0367t.a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t$b */
    public enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: e  reason: collision with root package name */
        public final boolean f5316e;

        /* access modifiers changed from: public */
        b(boolean z4) {
            this.f5316e = z4;
        }
    }

    static {
        f5286j0 = new Type[0];
        C0367t[] values = values();
        f5284i0 = new C0367t[values.length];
        for (C0367t tVar : values) {
            f5284i0[tVar.f5305f] = tVar;
        }
    }

    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = androidx.datastore.preferences.protobuf.C0367t.a.f5310b[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0367t(int r3, androidx.datastore.preferences.protobuf.C0367t.b r4, androidx.datastore.preferences.protobuf.A r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f5305f = r3
            r0.f5306g = r4
            r0.f5304e = r5
            int[] r1 = androidx.datastore.preferences.protobuf.C0367t.a.f5309a
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x001b
            r1 = 0
            r0.f5307h = r1
            goto L_0x0028
        L_0x001b:
            java.lang.Class r1 = r5.b()
            r0.f5307h = r1
            goto L_0x0028
        L_0x0022:
            java.lang.Class r1 = r5.b()
            r0.f5307h = r1
        L_0x0028:
            androidx.datastore.preferences.protobuf.t$b r1 = androidx.datastore.preferences.protobuf.C0367t.b.SCALAR
            if (r4 != r1) goto L_0x003c
            int[] r1 = androidx.datastore.preferences.protobuf.C0367t.a.f5310b
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
            r0.f5308i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0367t.<init>(java.lang.String, int, int, androidx.datastore.preferences.protobuf.t$b, androidx.datastore.preferences.protobuf.A):void");
    }

    public int b() {
        return this.f5305f;
    }
}
