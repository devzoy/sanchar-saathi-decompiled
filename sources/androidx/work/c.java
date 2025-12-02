package androidx.work;

import Q0.v;
import android.content.Context;
import b1.C0392c;
import java.util.UUID;
import java.util.concurrent.Executor;
import y2.C1007a;

public abstract class c {

    /* renamed from: c  reason: collision with root package name */
    public Context f6130c;

    /* renamed from: d  reason: collision with root package name */
    public WorkerParameters f6131d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f6132e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6133f;

    public static abstract class a {

        /* renamed from: androidx.work.c$a$a  reason: collision with other inner class name */
        public static final class C0105a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final b f6134a;

            public C0105a() {
                this(b.f6127c);
            }

            public b e() {
                return this.f6134a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0105a.class != obj.getClass()) {
                    return false;
                }
                return this.f6134a.equals(((C0105a) obj).f6134a);
            }

            public int hashCode() {
                return (C0105a.class.getName().hashCode() * 31) + this.f6134a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f6134a + '}';
            }

            public C0105a(b bVar) {
                this.f6134a = bVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.c$a$c  reason: collision with other inner class name */
        public static final class C0106c extends a {

            /* renamed from: a  reason: collision with root package name */
            public final b f6135a;

            public C0106c() {
                this(b.f6127c);
            }

            public b e() {
                return this.f6135a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0106c.class != obj.getClass()) {
                    return false;
                }
                return this.f6135a.equals(((C0106c) obj).f6135a);
            }

            public int hashCode() {
                return (C0106c.class.getName().hashCode() * 31) + this.f6135a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f6135a + '}';
            }

            public C0106c(b bVar) {
                this.f6135a = bVar;
            }
        }

        public static a a() {
            return new C0105a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new C0106c();
        }

        public static a d(b bVar) {
            return new C0106c(bVar);
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f6130c = context;
            this.f6131d = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context a() {
        return this.f6130c;
    }

    public Executor c() {
        return this.f6131d.a();
    }

    public C1007a d() {
        C0392c t4 = C0392c.t();
        t4.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t4;
    }

    public final UUID f() {
        return this.f6131d.c();
    }

    public final b g() {
        return this.f6131d.d();
    }

    public v h() {
        return this.f6131d.e();
    }

    public final boolean i() {
        return this.f6132e;
    }

    public final boolean j() {
        return this.f6133f;
    }

    public void k() {
    }

    public final void l() {
        this.f6133f = true;
    }

    public abstract C1007a m();

    public final void n() {
        this.f6132e = true;
        k();
    }
}
