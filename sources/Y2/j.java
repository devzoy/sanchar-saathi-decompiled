package Y2;

import Y2.b;
import java.nio.ByteBuffer;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public final b f3768a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3769b;

    /* renamed from: c  reason: collision with root package name */
    public final k f3770c;

    /* renamed from: d  reason: collision with root package name */
    public final b.c f3771d;

    public final class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final c f3772a;

        /* renamed from: Y2.j$a$a  reason: collision with other inner class name */
        public class C0073a implements d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b.C0071b f3774a;

            public C0073a(b.C0071b bVar) {
                this.f3774a = bVar;
            }

            public void a(Object obj) {
                this.f3774a.a(j.this.f3770c.a(obj));
            }

            public void b(String str, String str2, Object obj) {
                this.f3774a.a(j.this.f3770c.d(str, str2, obj));
            }

            public void c() {
                this.f3774a.a((ByteBuffer) null);
            }
        }

        public a(c cVar) {
            this.f3772a = cVar;
        }

        public void a(ByteBuffer byteBuffer, b.C0071b bVar) {
            try {
                this.f3772a.onMethodCall(j.this.f3770c.e(byteBuffer), new C0073a(bVar));
            } catch (RuntimeException e4) {
                M2.b.c("MethodChannel#" + j.this.f3769b, "Failed to handle method call", e4);
                bVar.a(j.this.f3770c.b("error", e4.getMessage(), (Object) null, M2.b.d(e4)));
            }
        }
    }

    public final class b implements b.C0071b {

        /* renamed from: a  reason: collision with root package name */
        public final d f3776a;

        public b(d dVar) {
            this.f3776a = dVar;
        }

        public void a(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                try {
                    this.f3776a.c();
                } catch (RuntimeException e4) {
                    M2.b.c("MethodChannel#" + j.this.f3769b, "Failed to handle method call result", e4);
                }
            } else {
                try {
                    this.f3776a.a(j.this.f3770c.f(byteBuffer));
                } catch (d e5) {
                    this.f3776a.b(e5.f3762e, e5.getMessage(), e5.f3763f);
                }
            }
        }
    }

    public interface c {
        void onMethodCall(i iVar, d dVar);
    }

    public interface d {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public j(b bVar, String str) {
        this(bVar, str, p.f3781b);
    }

    public void c(String str, Object obj) {
        d(str, obj, (d) null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f3768a.c(this.f3769b, this.f3770c.c(new i(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        a aVar = null;
        if (this.f3771d != null) {
            b bVar = this.f3768a;
            String str = this.f3769b;
            if (cVar != null) {
                aVar = new a(cVar);
            }
            bVar.b(str, aVar, this.f3771d);
            return;
        }
        b bVar2 = this.f3768a;
        String str2 = this.f3769b;
        if (cVar != null) {
            aVar = new a(cVar);
        }
        bVar2.e(str2, aVar);
    }

    public j(b bVar, String str, k kVar) {
        this(bVar, str, kVar, (b.c) null);
    }

    public j(b bVar, String str, k kVar, b.c cVar) {
        this.f3768a = bVar;
        this.f3769b = str;
        this.f3770c = kVar;
        this.f3771d = cVar;
    }
}
