package androidx.datastore.preferences.protobuf;

public abstract class r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f5205a = c(1, 3);

    /* renamed from: b  reason: collision with root package name */
    public static final int f5206b = c(1, 4);

    /* renamed from: c  reason: collision with root package name */
    public static final int f5207c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f5208d = c(3, 2);

    public enum b {
        DOUBLE(c.DOUBLE, 1),
        FLOAT(c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(c.BOOLEAN, 0),
        STRING(c.STRING, 2) {
        },
        GROUP(r13, 3) {
        },
        MESSAGE(r13, 2) {
        },
        BYTES(c.BYTE_STRING, 2) {
        },
        UINT32(r11, 0),
        ENUM(c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        

        /* renamed from: e  reason: collision with root package name */
        public final c f5228e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5229f;

        public c b() {
            return this.f5228e;
        }

        public int f() {
            return this.f5229f;
        }

        /* access modifiers changed from: public */
        b(c cVar, int i4) {
            this.f5228e = cVar;
            this.f5229f = i4;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C0355g.f5093f),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: e  reason: collision with root package name */
        public final Object f5240e;

        /* access modifiers changed from: public */
        c(Object obj) {
            this.f5240e = obj;
        }
    }

    public static int a(int i4) {
        return i4 >>> 3;
    }

    public static int b(int i4) {
        return i4 & 7;
    }

    public static int c(int i4, int i5) {
        return (i4 << 3) | i5;
    }
}
