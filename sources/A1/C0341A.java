package a1;

import Q0.e;
import Q0.f;
import Q0.i;
import Z0.u;
import Z0.v;
import Z0.x;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import b1.C0392c;
import c1.C0403b;
import java.util.UUID;
import y2.C1007a;

/* renamed from: a1.A  reason: case insensitive filesystem */
public class C0341A implements f {

    /* renamed from: d  reason: collision with root package name */
    public static final String f3933d = i.i("WMFgUpdater");

    /* renamed from: a  reason: collision with root package name */
    public final C0403b f3934a;

    /* renamed from: b  reason: collision with root package name */
    public final Y0.a f3935b;

    /* renamed from: c  reason: collision with root package name */
    public final v f3936c;

    /* renamed from: a1.A$a */
    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C0392c f3937e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ UUID f3938f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ e f3939g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Context f3940h;

        public a(C0392c cVar, UUID uuid, e eVar, Context context) {
            this.f3937e = cVar;
            this.f3938f = uuid;
            this.f3939g = eVar;
            this.f3940h = context;
        }

        public void run() {
            try {
                if (!this.f3937e.isCancelled()) {
                    String uuid = this.f3938f.toString();
                    u m4 = C0341A.this.f3936c.m(uuid);
                    if (m4 == null || m4.f3835b.f()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C0341A.this.f3935b.b(uuid, this.f3939g);
                    this.f3940h.startService(androidx.work.impl.foreground.a.c(this.f3940h, x.a(m4), this.f3939g));
                }
                this.f3937e.p((Object) null);
            } catch (Throwable th) {
                this.f3937e.q(th);
            }
        }
    }

    public C0341A(WorkDatabase workDatabase, Y0.a aVar, C0403b bVar) {
        this.f3935b = aVar;
        this.f3934a = bVar;
        this.f3936c = workDatabase.J();
    }

    public C1007a a(Context context, UUID uuid, e eVar) {
        C0392c t4 = C0392c.t();
        this.f3934a.c(new a(t4, uuid, eVar, context));
        return t4;
    }
}
