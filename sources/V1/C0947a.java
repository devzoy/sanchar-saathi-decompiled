package v1;

import android.content.Context;
import android.os.Looper;
import java.util.Set;
import v1.C0952f;
import w1.C0971d;
import w1.C0977j;
import z1.C1021d;
import z1.C1022e;
import z1.C1027j;
import z1.C1032o;

/* renamed from: v1.a  reason: case insensitive filesystem */
public final class C0947a {

    /* renamed from: a  reason: collision with root package name */
    public final C0204a f12406a;

    /* renamed from: b  reason: collision with root package name */
    public final g f12407b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12408c;

    /* renamed from: v1.a$a  reason: collision with other inner class name */
    public static abstract class C0204a extends e {
        public f a(Context context, Looper looper, C1022e eVar, Object obj, C0952f.a aVar, C0952f.b bVar) {
            return b(context, looper, eVar, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, C1022e eVar, Object obj, C0971d dVar, C0977j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: v1.a$b */
    public interface b {
    }

    /* renamed from: v1.a$c */
    public static class c {
    }

    /* renamed from: v1.a$d */
    public interface d {
    }

    /* renamed from: v1.a$e */
    public static abstract class e {
    }

    /* renamed from: v1.a$f */
    public interface f extends b {
        void a(C1021d.c cVar);

        boolean b();

        Set c();

        void e(String str);

        boolean f();

        void h(C1021d.e eVar);

        int i();

        boolean j();

        u1.c[] k();

        String l();

        String m();

        void n();

        boolean o();

        void p(C1027j jVar, Set set);
    }

    /* renamed from: v1.a$g */
    public static final class g extends c {
    }

    public C0947a(String str, C0204a aVar, g gVar) {
        C1032o.g(aVar, "Cannot construct an Api with a null ClientBuilder");
        C1032o.g(gVar, "Cannot construct an Api with a null ClientKey");
        this.f12408c = str;
        this.f12406a = aVar;
        this.f12407b = gVar;
    }

    public final C0204a a() {
        return this.f12406a;
    }

    public final c b() {
        return this.f12407b;
    }

    public final String c() {
        return this.f12408c;
    }
}
