package X2;

import Y2.i;
import Y2.j;
import Y2.p;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public final j f3580a;

    /* renamed from: b  reason: collision with root package name */
    public g f3581b;

    /* renamed from: c  reason: collision with root package name */
    public final j.c f3582c;

    public class a implements j.c {
        public a() {
        }

        public static /* synthetic */ void e(j.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", (Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf((double) cVar.f3584a));
            hashMap.put("height", Double.valueOf((double) cVar.f3585b));
            dVar.a(hashMap);
        }

        public final void b(i iVar, j.d dVar) {
            try {
                q.this.f3581b.e(((Integer) iVar.b()).intValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e4) {
                dVar.b("error", q.c(e4), (Object) null);
            }
        }

        public final void c(i iVar, j.d dVar) {
            j.d dVar2 = dVar;
            Map map = (Map) iVar.b();
            boolean z4 = false;
            boolean z5 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            if (z5) {
                try {
                    q.this.f3581b.i(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, wrap));
                    dVar2.a((Object) null);
                } catch (IllegalStateException e4) {
                    dVar2.b("error", q.c(e4), (Object) null);
                }
            } else {
                if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z4 = true;
                }
                d.a aVar = z4 ? d.a.TEXTURE_WITH_HYBRID_FALLBACK : d.a.TEXTURE_WITH_VIRTUAL_FALLBACK;
                int intValue = ((Integer) map.get("id")).intValue();
                String str = (String) map.get("viewType");
                double d4 = 0.0d;
                double doubleValue = map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d;
                if (map.containsKey("left")) {
                    d4 = ((Double) map.get("left")).doubleValue();
                }
                long f4 = q.this.f3581b.f(new d(intValue, str, doubleValue, d4, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), aVar, wrap));
                if (f4 != -2) {
                    dVar2.a(Long.valueOf(f4));
                } else if (z4) {
                    dVar2.a((Object) null);
                } else {
                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                }
            }
        }

        public final void d(i iVar, j.d dVar) {
            try {
                q.this.f3581b.h(((Integer) ((Map) iVar.b()).get("id")).intValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e4) {
                dVar.b("error", q.c(e4), (Object) null);
            }
        }

        public final void f(i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                q.this.f3581b.b(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e4) {
                dVar.b("error", q.c(e4), (Object) null);
            }
        }

        public final void g(i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                q.this.f3581b.g(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new p(dVar));
            } catch (IllegalStateException e4) {
                dVar.b("error", q.c(e4), (Object) null);
            }
        }

        public final void h(i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                q.this.f3581b.c(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e4) {
                dVar.b("error", q.c(e4), (Object) null);
            }
        }

        public final void i(i iVar, j.d dVar) {
            try {
                q.this.f3581b.a(((Boolean) iVar.b()).booleanValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e4) {
                dVar.b("error", q.c(e4), (Object) null);
            }
        }

        public final void j(i iVar, j.d dVar) {
            j.d dVar2;
            j.d dVar3 = dVar;
            List list = (List) iVar.b();
            f fVar = r2;
            f fVar2 = fVar;
            f fVar3 = new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
            try {
                q.this.f3581b.d(fVar);
                dVar2 = dVar;
                try {
                    dVar2.a((Object) null);
                } catch (IllegalStateException e4) {
                    e = e4;
                }
            } catch (IllegalStateException e5) {
                e = e5;
                dVar2 = dVar;
                dVar2.b("error", q.c(e), (Object) null);
            }
        }

        public void onMethodCall(i iVar, j.d dVar) {
            if (q.this.f3581b != null) {
                M2.b.f("PlatformViewsChannel", "Received '" + iVar.f3766a + "' message.");
                String str = iVar.f3766a;
                str.hashCode();
                char c4 = 65535;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case -1019779949:
                        if (str.equals("offset")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case -934437708:
                        if (str.equals("resize")) {
                            c4 = 2;
                            break;
                        }
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c4 = 3;
                            break;
                        }
                        break;
                    case -308988850:
                        if (str.equals("synchronizeToNativeViewHierarchy")) {
                            c4 = 4;
                            break;
                        }
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c4 = 5;
                            break;
                        }
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c4 = 6;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c4 = 7;
                            break;
                        }
                        break;
                }
                switch (c4) {
                    case 0:
                        c(iVar, dVar);
                        return;
                    case 1:
                        f(iVar, dVar);
                        return;
                    case 2:
                        g(iVar, dVar);
                        return;
                    case 3:
                        b(iVar, dVar);
                        return;
                    case 4:
                        i(iVar, dVar);
                        return;
                    case 5:
                        j(iVar, dVar);
                        return;
                    case 6:
                        h(iVar, dVar);
                        return;
                    case 7:
                        d(iVar, dVar);
                        return;
                    default:
                        dVar.c();
                        return;
                }
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f3584a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3585b;

        public c(int i4, int i5) {
            this.f3584a = i4;
            this.f3585b = i5;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f3586a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3587b;

        /* renamed from: c  reason: collision with root package name */
        public final double f3588c;

        /* renamed from: d  reason: collision with root package name */
        public final double f3589d;

        /* renamed from: e  reason: collision with root package name */
        public final double f3590e;

        /* renamed from: f  reason: collision with root package name */
        public final double f3591f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3592g;

        /* renamed from: h  reason: collision with root package name */
        public final a f3593h;

        /* renamed from: i  reason: collision with root package name */
        public final ByteBuffer f3594i;

        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i4, String str, double d4, double d5, double d6, double d7, int i5, a aVar, ByteBuffer byteBuffer) {
            this.f3586a = i4;
            this.f3587b = str;
            this.f3590e = d4;
            this.f3591f = d5;
            this.f3588c = d6;
            this.f3589d = d7;
            this.f3592g = i5;
            this.f3593h = aVar;
            this.f3594i = byteBuffer;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f3599a;

        /* renamed from: b  reason: collision with root package name */
        public final double f3600b;

        /* renamed from: c  reason: collision with root package name */
        public final double f3601c;

        public e(int i4, double d4, double d5) {
            this.f3599a = i4;
            this.f3600b = d4;
            this.f3601c = d5;
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f3602a;

        /* renamed from: b  reason: collision with root package name */
        public final Number f3603b;

        /* renamed from: c  reason: collision with root package name */
        public final Number f3604c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3605d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3606e;

        /* renamed from: f  reason: collision with root package name */
        public final Object f3607f;

        /* renamed from: g  reason: collision with root package name */
        public final Object f3608g;

        /* renamed from: h  reason: collision with root package name */
        public final int f3609h;

        /* renamed from: i  reason: collision with root package name */
        public final int f3610i;

        /* renamed from: j  reason: collision with root package name */
        public final float f3611j;

        /* renamed from: k  reason: collision with root package name */
        public final float f3612k;

        /* renamed from: l  reason: collision with root package name */
        public final int f3613l;

        /* renamed from: m  reason: collision with root package name */
        public final int f3614m;

        /* renamed from: n  reason: collision with root package name */
        public final int f3615n;

        /* renamed from: o  reason: collision with root package name */
        public final int f3616o;

        /* renamed from: p  reason: collision with root package name */
        public final long f3617p;

        public f(int i4, Number number, Number number2, int i5, int i6, Object obj, Object obj2, int i7, int i8, float f4, float f5, int i9, int i10, int i11, int i12, long j4) {
            this.f3602a = i4;
            this.f3603b = number;
            this.f3604c = number2;
            this.f3605d = i5;
            this.f3606e = i6;
            this.f3607f = obj;
            this.f3608g = obj2;
            this.f3609h = i7;
            this.f3610i = i8;
            this.f3611j = f4;
            this.f3612k = f5;
            this.f3613l = i9;
            this.f3614m = i10;
            this.f3615n = i11;
            this.f3616o = i12;
            this.f3617p = j4;
        }
    }

    public interface g {
        void a(boolean z4);

        void b(int i4, double d4, double d5);

        void c(int i4, int i5);

        void d(f fVar);

        void e(int i4);

        long f(d dVar);

        void g(e eVar, b bVar);

        void h(int i4);

        void i(d dVar);
    }

    public q(P2.a aVar) {
        a aVar2 = new a();
        this.f3582c = aVar2;
        j jVar = new j(aVar, "flutter/platform_views", p.f3781b);
        this.f3580a = jVar;
        jVar.e(aVar2);
    }

    public static String c(Exception exc) {
        return M2.b.d(exc);
    }

    public void d(int i4) {
        j jVar = this.f3580a;
        if (jVar != null) {
            jVar.c("viewFocused", Integer.valueOf(i4));
        }
    }

    public void e(g gVar) {
        this.f3581b = gVar;
    }
}
