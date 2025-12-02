package c0;

import l3.i;
import u3.p;
import v3.g;
import v3.l;

/* renamed from: c0.A  reason: case insensitive filesystem */
public final class C0397A implements i.b {

    /* renamed from: g  reason: collision with root package name */
    public static final a f6284g = new a((g) null);

    /* renamed from: h  reason: collision with root package name */
    public static final String f6285h = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* renamed from: e  reason: collision with root package name */
    public final C0397A f6286e;

    /* renamed from: f  reason: collision with root package name */
    public final j f6287f;

    /* renamed from: c0.A$a */
    public static final class a {

        /* renamed from: c0.A$a$a  reason: collision with other inner class name */
        public static final class C0116a implements i.c {

            /* renamed from: e  reason: collision with root package name */
            public static final C0116a f6288e = new C0116a();
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public C0397A(C0397A a4, j jVar) {
        l.e(jVar, "instance");
        this.f6286e = a4;
        this.f6287f = jVar;
    }

    public i B(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    public Object H(Object obj, p pVar) {
        return i.b.a.a(this, obj, pVar);
    }

    public final void a(h hVar) {
        l.e(hVar, "candidate");
        if (this.f6287f != hVar) {
            C0397A a4 = this.f6286e;
            if (a4 != null) {
                a4.a(hVar);
                return;
            }
            return;
        }
        throw new IllegalStateException(f6285h.toString());
    }

    public i.b d(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    public i.c getKey() {
        return a.C0116a.f6288e;
    }

    public i h(i iVar) {
        return i.b.a.d(this, iVar);
    }
}
