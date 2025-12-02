package Q0;

import Q0.u;
import java.util.concurrent.TimeUnit;
import v3.g;
import v3.l;

public final class n extends u {

    /* renamed from: e  reason: collision with root package name */
    public static final b f2396e = new b((g) null);

    public static final class a extends u.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class cls, long j4, TimeUnit timeUnit) {
            super(cls);
            l.e(cls, "workerClass");
            l.e(timeUnit, "repeatIntervalTimeUnit");
            g().i(timeUnit.toMillis(j4));
        }

        /* renamed from: j */
        public n b() {
            if (c() && g().f3843j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            } else if (!g().f3850q) {
                return new n(this);
            } else {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
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

        public b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(a aVar) {
        super(aVar.d(), aVar.g(), aVar.e());
        l.e(aVar, "builder");
    }
}
