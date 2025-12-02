package dev.fluttercommunity.plus.share;

import Y2.j;
import Y2.l;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;
import v3.g;

public final class a implements l {

    /* renamed from: f  reason: collision with root package name */
    public static final C0145a f8702f = new C0145a((g) null);

    /* renamed from: c  reason: collision with root package name */
    public final Context f8703c;

    /* renamed from: d  reason: collision with root package name */
    public j.d f8704d;

    /* renamed from: e  reason: collision with root package name */
    public AtomicBoolean f8705e = new AtomicBoolean(true);

    /* renamed from: dev.fluttercommunity.plus.share.a$a  reason: collision with other inner class name */
    public static final class C0145a {
        public /* synthetic */ C0145a(g gVar) {
            this();
        }

        public C0145a() {
        }
    }

    public a(Context context) {
        v3.l.e(context, "context");
        this.f8703c = context;
    }

    public final void a() {
        this.f8705e.set(true);
        this.f8704d = null;
    }

    public final void b(String str) {
        j.d dVar;
        if (this.f8705e.compareAndSet(false, true) && (dVar = this.f8704d) != null) {
            v3.l.b(dVar);
            dVar.a(str);
            this.f8704d = null;
        }
    }

    public final void c(j.d dVar) {
        v3.l.e(dVar, "callback");
        if (this.f8705e.compareAndSet(true, false)) {
            SharePlusPendingIntent.f8700a.b("");
            this.f8705e.set(false);
            this.f8704d = dVar;
            return;
        }
        j.d dVar2 = this.f8704d;
        if (dVar2 != null) {
            dVar2.a("dev.fluttercommunity.plus/share/unavailable");
        }
        SharePlusPendingIntent.f8700a.b("");
        this.f8705e.set(false);
        this.f8704d = dVar;
    }

    public final void d() {
        b("dev.fluttercommunity.plus/share/unavailable");
    }

    public boolean onActivityResult(int i4, int i5, Intent intent) {
        if (i4 != 22643) {
            return false;
        }
        b(SharePlusPendingIntent.f8700a.a());
        return true;
    }
}
