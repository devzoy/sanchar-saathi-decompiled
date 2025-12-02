package Y2;

import Y2.b;
import java.nio.ByteBuffer;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f3742a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3743b;

    /* renamed from: c  reason: collision with root package name */
    public final h f3744c;

    /* renamed from: d  reason: collision with root package name */
    public final b.c f3745d;

    public final class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final d f3746a;

        /* renamed from: Y2.a$b$a  reason: collision with other inner class name */
        public class C0070a implements e {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b.C0071b f3748a;

            public C0070a(b.C0071b bVar) {
                this.f3748a = bVar;
            }

            public void a(Object obj) {
                this.f3748a.a(a.this.f3744c.a(obj));
            }
        }

        public void a(ByteBuffer byteBuffer, b.C0071b bVar) {
            try {
                this.f3746a.a(a.this.f3744c.b(byteBuffer), new C0070a(bVar));
            } catch (RuntimeException e4) {
                M2.b.c("BasicMessageChannel#" + a.this.f3743b, "Failed to handle message", e4);
                bVar.a((ByteBuffer) null);
            }
        }

        public b(d dVar) {
            this.f3746a = dVar;
        }
    }

    public final class c implements b.C0071b {

        /* renamed from: a  reason: collision with root package name */
        public final e f3750a;

        public void a(ByteBuffer byteBuffer) {
            try {
                this.f3750a.a(a.this.f3744c.b(byteBuffer));
            } catch (RuntimeException e4) {
                M2.b.c("BasicMessageChannel#" + a.this.f3743b, "Failed to handle message reply", e4);
            }
        }

        public c(e eVar) {
            this.f3750a = eVar;
        }
    }

    public interface d {
        void a(Object obj, e eVar);
    }

    public interface e {
        void a(Object obj);
    }

    public a(b bVar, String str, h hVar) {
        this(bVar, str, hVar, (b.c) null);
    }

    public void c(Object obj) {
        d(obj, (e) null);
    }

    public void d(Object obj, e eVar) {
        b bVar = this.f3742a;
        String str = this.f3743b;
        ByteBuffer a4 = this.f3744c.a(obj);
        c cVar = null;
        if (eVar != null) {
            cVar = new c(eVar);
        }
        bVar.c(str, a4, cVar);
    }

    public void e(d dVar) {
        b bVar = null;
        if (this.f3745d != null) {
            b bVar2 = this.f3742a;
            String str = this.f3743b;
            if (dVar != null) {
                bVar = new b(dVar);
            }
            bVar2.b(str, bVar, this.f3745d);
            return;
        }
        b bVar3 = this.f3742a;
        String str2 = this.f3743b;
        if (dVar != null) {
            bVar = new b(dVar);
        }
        bVar3.e(str2, bVar);
    }

    public a(b bVar, String str, h hVar, b.c cVar) {
        this.f3742a = bVar;
        this.f3743b = str;
        this.f3744c = hVar;
        this.f3745d = cVar;
    }
}
