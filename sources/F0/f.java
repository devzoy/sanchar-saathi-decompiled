package f0;

import androidx.datastore.preferences.protobuf.C0370w;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.r0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

public final class f extends C0370w implements Q {
    /* access modifiers changed from: private */
    public static final f DEFAULT_INSTANCE;
    private static volatile Y PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private J preferences_ = J.g();

    public static final class a extends C0370w.a implements Q {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a u(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            p();
            ((f) this.f5319f).Q().put(str, hVar);
            return this;
        }

        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final I f8987a = I.d(r0.b.STRING, "", r0.b.MESSAGE, h.Z());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        C0370w.L(f.class, fVar);
    }

    public static a U() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static f V(InputStream inputStream) {
        return (f) C0370w.J(DEFAULT_INSTANCE, inputStream);
    }

    public final Map Q() {
        return S();
    }

    public Map R() {
        return Collections.unmodifiableMap(T());
    }

    public final J S() {
        if (!this.preferences_.m()) {
            this.preferences_ = this.preferences_.p();
        }
        return this.preferences_;
    }

    public final J T() {
        return this.preferences_;
    }

    public final Object s(C0370w.d dVar, Object obj, Object obj2) {
        switch (e.f8986a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a((e) null);
            case 3:
                return C0370w.H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f8987a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y y4 = PARSER;
                if (y4 == null) {
                    synchronized (f.class) {
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
