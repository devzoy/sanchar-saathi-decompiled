package f3;

import Y2.a;
import Y2.h;
import Y2.o;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* renamed from: f3.a  reason: case insensitive filesystem */
public abstract class C0622a {

    /* renamed from: f3.a$a  reason: collision with other inner class name */
    public static final class C0162a {

        /* renamed from: a  reason: collision with root package name */
        public Boolean f9026a;

        public static C0162a a(ArrayList arrayList) {
            C0162a aVar = new C0162a();
            aVar.c((Boolean) arrayList.get(0));
            return aVar;
        }

        public Boolean b() {
            return this.f9026a;
        }

        public void c(Boolean bool) {
            if (bool != null) {
                this.f9026a = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
        }

        public ArrayList d() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.f9026a);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0162a.class != obj.getClass()) {
                return false;
            }
            return this.f9026a.equals(((C0162a) obj).f9026a);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f9026a});
        }
    }

    /* renamed from: f3.a$b */
    public static class b extends RuntimeException {

        /* renamed from: e  reason: collision with root package name */
        public final String f9027e;

        /* renamed from: f  reason: collision with root package name */
        public final Object f9028f;

        public b(String str, String str2, Object obj) {
            super(str2);
            this.f9027e = str;
            this.f9028f = obj;
        }
    }

    /* renamed from: f3.a$c */
    public static class c extends o {

        /* renamed from: d  reason: collision with root package name */
        public static final c f9029d = new c();

        public Object g(byte b4, ByteBuffer byteBuffer) {
            return b4 != -127 ? b4 != -126 ? super.g(b4, byteBuffer) : C0162a.a((ArrayList) f(byteBuffer)) : e.a((ArrayList) f(byteBuffer));
        }

        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof e) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((e) obj).h());
            } else if (obj instanceof C0162a) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((C0162a) obj).d());
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        }
    }

    /* renamed from: f3.a$d */
    public interface d {
        static h a() {
            return c.f9029d;
        }

        static /* synthetic */ void b(d dVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, dVar.o());
            } catch (Throwable th) {
                arrayList = C0622a.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void d(d dVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, dVar.m((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (e) arrayList2.get(2), (C0162a) arrayList2.get(3)));
            } catch (Throwable th) {
                arrayList = C0622a.a(th);
            }
            eVar.a(arrayList);
        }

        static void f(Y2.b bVar, d dVar) {
            q(bVar, "", dVar);
        }

        static /* synthetic */ void h(d dVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, dVar.k((String) arrayList2.get(0), (Map) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = C0622a.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void n(d dVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, dVar.e((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = C0622a.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void p(d dVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                dVar.j();
                arrayList.add(0, (Object) null);
            } catch (Throwable th) {
                arrayList = C0622a.a(th);
            }
            eVar.a(arrayList);
        }

        static void q(Y2.b bVar, String str, d dVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            a aVar = new a(bVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl" + str2, a());
            if (dVar != null) {
                aVar.e(new C0623b(dVar));
            } else {
                aVar.e((a.d) null);
            }
            a aVar2 = new a(bVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl" + str2, a());
            if (dVar != null) {
                aVar2.e(new C0624c(dVar));
            } else {
                aVar2.e((a.d) null);
            }
            a aVar3 = new a(bVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp" + str2, a());
            if (dVar != null) {
                aVar3.e(new C0625d(dVar));
            } else {
                aVar3.e((a.d) null);
            }
            a aVar4 = new a(bVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs" + str2, a());
            if (dVar != null) {
                aVar4.e(new C0626e(dVar));
            } else {
                aVar4.e((a.d) null);
            }
            a aVar5 = new a(bVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView" + str2, a());
            if (dVar != null) {
                aVar5.e(new C0627f(dVar));
            } else {
                aVar5.e((a.d) null);
            }
        }

        Boolean e(String str);

        void j();

        Boolean k(String str, Map map);

        Boolean m(String str, Boolean bool, e eVar, C0162a aVar);

        Boolean o();
    }

    /* renamed from: f3.a$e */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public Boolean f9030a;

        /* renamed from: b  reason: collision with root package name */
        public Boolean f9031b;

        /* renamed from: c  reason: collision with root package name */
        public Map f9032c;

        public static e a(ArrayList arrayList) {
            e eVar = new e();
            eVar.f((Boolean) arrayList.get(0));
            eVar.e((Boolean) arrayList.get(1));
            eVar.g((Map) arrayList.get(2));
            return eVar;
        }

        public Boolean b() {
            return this.f9031b;
        }

        public Boolean c() {
            return this.f9030a;
        }

        public Map d() {
            return this.f9032c;
        }

        public void e(Boolean bool) {
            if (bool != null) {
                this.f9031b = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f9030a.equals(eVar.f9030a) && this.f9031b.equals(eVar.f9031b) && this.f9032c.equals(eVar.f9032c);
        }

        public void f(Boolean bool) {
            if (bool != null) {
                this.f9030a = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }

        public void g(Map map) {
            if (map != null) {
                this.f9032c = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }

        public ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f9030a);
            arrayList.add(this.f9031b);
            arrayList.add(this.f9032c);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f9030a, this.f9031b, this.f9032c});
        }
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof b) {
            b bVar = (b) th;
            arrayList.add(bVar.f9027e);
            arrayList.add(bVar.getMessage());
            arrayList.add(bVar.f9028f);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
