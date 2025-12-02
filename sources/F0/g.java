package f0;

import androidx.datastore.preferences.protobuf.C0349a;
import androidx.datastore.preferences.protobuf.C0370w;
import androidx.datastore.preferences.protobuf.C0372y;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import java.util.List;

public final class g extends C0370w implements Q {
    /* access modifiers changed from: private */
    public static final g DEFAULT_INSTANCE;
    private static volatile Y PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C0372y.b strings_ = C0370w.t();

    public static final class a extends C0370w.a implements Q {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a u(Iterable iterable) {
            p();
            ((g) this.f5319f).Q(iterable);
            return this;
        }

        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        C0370w.L(g.class, gVar);
    }

    public static g S() {
        return DEFAULT_INSTANCE;
    }

    public static a U() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public final void Q(Iterable iterable) {
        R();
        C0349a.c(iterable, this.strings_);
    }

    public final void R() {
        C0372y.b bVar = this.strings_;
        if (!bVar.r()) {
            this.strings_ = C0370w.F(bVar);
        }
    }

    public List T() {
        return this.strings_;
    }

    public final Object s(C0370w.d dVar, Object obj, Object obj2) {
        switch (e.f8986a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a((e) null);
            case 3:
                return C0370w.H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y y4 = PARSER;
                if (y4 == null) {
                    synchronized (g.class) {
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
