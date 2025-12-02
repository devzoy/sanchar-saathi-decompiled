package f0;

import androidx.datastore.preferences.protobuf.C0355g;
import androidx.datastore.preferences.protobuf.C0370w;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import f0.g;

public final class h extends C0370w implements Q {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Y PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends C0370w.a implements Q {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a A(String str) {
            p();
            ((h) this.f5319f).o0(str);
            return this;
        }

        public a B(g.a aVar) {
            p();
            ((h) this.f5319f).p0((g) aVar.m());
            return this;
        }

        public a u(boolean z4) {
            p();
            ((h) this.f5319f).i0(z4);
            return this;
        }

        public a v(C0355g gVar) {
            p();
            ((h) this.f5319f).j0(gVar);
            return this;
        }

        public a w(double d4) {
            p();
            ((h) this.f5319f).k0(d4);
            return this;
        }

        public a x(float f4) {
            p();
            ((h) this.f5319f).l0(f4);
            return this;
        }

        public a y(int i4) {
            p();
            ((h) this.f5319f).m0(i4);
            return this;
        }

        public a z(long j4) {
            p();
            ((h) this.f5319f).n0(j4);
            return this;
        }

        public a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);
        

        /* renamed from: e  reason: collision with root package name */
        public final int f8998e;

        /* access modifiers changed from: public */
        b(int i4) {
            this.f8998e = i4;
        }

        public static b f(int i4) {
            switch (i4) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        C0370w.L(h.class, hVar);
    }

    public static h Z() {
        return DEFAULT_INSTANCE;
    }

    public static a h0() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public boolean X() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public C0355g Y() {
        return this.valueCase_ == 8 ? (C0355g) this.value_ : C0355g.f5093f;
    }

    public double a0() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float b0() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int c0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long d0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0;
    }

    public String e0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g f0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.S();
    }

    public b g0() {
        return b.f(this.valueCase_);
    }

    public final void i0(boolean z4) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z4);
    }

    public final void j0(C0355g gVar) {
        gVar.getClass();
        this.valueCase_ = 8;
        this.value_ = gVar;
    }

    public final void k0(double d4) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d4);
    }

    public final void l0(float f4) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f4);
    }

    public final void m0(int i4) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i4);
    }

    public final void n0(long j4) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j4);
    }

    public final void o0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void p0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    public final Object s(C0370w.d dVar, Object obj, Object obj2) {
        switch (e.f8986a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a((e) null);
            case 3:
                return C0370w.H(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y y4 = PARSER;
                if (y4 == null) {
                    synchronized (h.class) {
                        try {
                            y4 = PARSER;
                            if (y4 == null) {
                                y4 = new C0370w.b(DEFAULT_INSTANCE);
                                PARSER = y4;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return y4;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
