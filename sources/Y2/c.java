package Y2;

import Y2.b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f3753a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3754b;

    /* renamed from: c  reason: collision with root package name */
    public final k f3755c;

    /* renamed from: d  reason: collision with root package name */
    public final b.c f3756d;

    public interface b {
        void a(Object obj);
    }

    /* renamed from: Y2.c$c  reason: collision with other inner class name */
    public final class C0072c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final d f3757a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReference f3758b = new AtomicReference((Object) null);

        /* renamed from: Y2.c$c$a */
        public final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public final AtomicBoolean f3760a;

            public a() {
                this.f3760a = new AtomicBoolean(false);
            }

            public void a(Object obj) {
                if (!this.f3760a.get() && C0072c.this.f3758b.get() == this) {
                    c.this.f3753a.f(c.this.f3754b, c.this.f3755c.a(obj));
                }
            }
        }

        public C0072c(d dVar) {
            this.f3757a = dVar;
        }

        public void a(ByteBuffer byteBuffer, b.C0071b bVar) {
            i e4 = c.this.f3755c.e(byteBuffer);
            if (e4.f3766a.equals("listen")) {
                d(e4.f3767b, bVar);
            } else if (e4.f3766a.equals("cancel")) {
                c(e4.f3767b, bVar);
            } else {
                bVar.a((ByteBuffer) null);
            }
        }

        public final void c(Object obj, b.C0071b bVar) {
            if (((b) this.f3758b.getAndSet((Object) null)) != null) {
                try {
                    this.f3757a.b(obj);
                    bVar.a(c.this.f3755c.a((Object) null));
                } catch (RuntimeException e4) {
                    M2.b.c("EventChannel#" + c.this.f3754b, "Failed to close event stream", e4);
                    bVar.a(c.this.f3755c.d("error", e4.getMessage(), (Object) null));
                }
            } else {
                bVar.a(c.this.f3755c.d("error", "No active stream to cancel", (Object) null));
            }
        }

        public final void d(Object obj, b.C0071b bVar) {
            a aVar = new a();
            if (((b) this.f3758b.getAndSet(aVar)) != null) {
                try {
                    this.f3757a.b((Object) null);
                } catch (RuntimeException e4) {
                    M2.b.c("EventChannel#" + c.this.f3754b, "Failed to close existing event stream", e4);
                }
            }
            try {
                this.f3757a.a(obj, aVar);
                bVar.a(c.this.f3755c.a((Object) null));
            } catch (RuntimeException e5) {
                this.f3758b.set((Object) null);
                M2.b.c("EventChannel#" + c.this.f3754b, "Failed to open event stream", e5);
                bVar.a(c.this.f3755c.d("error", e5.getMessage(), (Object) null));
            }
        }
    }

    public interface d {
        void a(Object obj, b bVar);

        void b(Object obj);
    }

    public c(b bVar, String str) {
        this(bVar, str, p.f3781b);
    }

    public void d(d dVar) {
        C0072c cVar = null;
        if (this.f3756d != null) {
            b bVar = this.f3753a;
            String str = this.f3754b;
            if (dVar != null) {
                cVar = new C0072c(dVar);
            }
            bVar.b(str, cVar, this.f3756d);
            return;
        }
        b bVar2 = this.f3753a;
        String str2 = this.f3754b;
        if (dVar != null) {
            cVar = new C0072c(dVar);
        }
        bVar2.e(str2, cVar);
    }

    public c(b bVar, String str, k kVar) {
        this(bVar, str, kVar, (b.c) null);
    }

    public c(b bVar, String str, k kVar, b.c cVar) {
        this.f3753a = bVar;
        this.f3754b = str;
        this.f3755c = kVar;
        this.f3756d = cVar;
    }
}
