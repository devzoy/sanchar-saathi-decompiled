package f0;

import D3.I;
import android.content.Context;
import c0.h;
import d0.C0569b;
import g0.e;
import java.io.File;
import java.util.List;
import u3.l;
import v3.m;

/* renamed from: f0.c  reason: case insensitive filesystem */
public final class C0619c implements w3.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f8978a;

    /* renamed from: b  reason: collision with root package name */
    public final l f8979b;

    /* renamed from: c  reason: collision with root package name */
    public final I f8980c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8981d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public volatile h f8982e;

    /* renamed from: f0.c$a */
    public static final class a extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Context f8983f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ C0619c f8984g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, C0619c cVar) {
            super(0);
            this.f8983f = context;
            this.f8984g = cVar;
        }

        /* renamed from: a */
        public final File c() {
            Context context = this.f8983f;
            v3.l.d(context, "applicationContext");
            return C0618b.a(context, this.f8984g.f8978a);
        }
    }

    public C0619c(String str, C0569b bVar, l lVar, I i4) {
        v3.l.e(str, "name");
        v3.l.e(lVar, "produceMigrations");
        v3.l.e(i4, "scope");
        this.f8978a = str;
        this.f8979b = lVar;
        this.f8980c = i4;
    }

    /* renamed from: c */
    public h a(Context context, A3.h hVar) {
        h hVar2;
        v3.l.e(context, "thisRef");
        v3.l.e(hVar, "property");
        h hVar3 = this.f8982e;
        if (hVar3 != null) {
            return hVar3;
        }
        synchronized (this.f8981d) {
            try {
                if (this.f8982e == null) {
                    Context applicationContext = context.getApplicationContext();
                    e eVar = e.f9054a;
                    l lVar = this.f8979b;
                    v3.l.d(applicationContext, "applicationContext");
                    this.f8982e = eVar.b((C0569b) null, (List) lVar.i(applicationContext), this.f8980c, new a(applicationContext, this));
                }
                hVar2 = this.f8982e;
                v3.l.b(hVar2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar2;
    }
}
