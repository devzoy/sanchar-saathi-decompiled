package Q0;

import Q0.u;
import androidx.work.OverwritingInputMerger;
import v3.g;
import v3.l;

public final class k extends u {

    /* renamed from: e  reason: collision with root package name */
    public static final b f2389e = new b((g) null);

    public static final class a extends u.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class cls) {
            super(cls);
            l.e(cls, "workerClass");
            g().f3837d = OverwritingInputMerger.class.getName();
        }

        /* renamed from: j */
        public k b() {
            if (!c() || !g().f3843j.h()) {
                return new k(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* renamed from: k */
        public a f() {
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final k a(Class cls) {
            l.e(cls, "workerClass");
            return (k) new a(cls).a();
        }

        public b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(a aVar) {
        super(aVar.d(), aVar.g(), aVar.e());
        l.e(aVar, "builder");
    }

    public static final k e(Class cls) {
        return f2389e.a(cls);
    }
}
