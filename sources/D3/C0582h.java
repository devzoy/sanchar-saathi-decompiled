package d3;

import Y2.a;
import Y2.h;
import Y2.o;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d3.h  reason: case insensitive filesystem */
public abstract class C0582h {

    /* renamed from: d3.h$a */
    public interface a {
        static h a() {
            return b.f8684d;
        }

        static /* synthetic */ void b(a aVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.j());
            } catch (Throwable th) {
                arrayList = C0582h.a(th);
            }
            eVar.a(arrayList);
        }

        static void c(Y2.b bVar, String str, a aVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            Y2.a aVar2 = new Y2.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath" + str2, a(), bVar.d());
            if (aVar != null) {
                aVar2.e(new C0575a(aVar));
            } else {
                aVar2.e((a.d) null);
            }
            Y2.a aVar3 = new Y2.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath" + str2, a(), bVar.d());
            if (aVar != null) {
                aVar3.e(new C0576b(aVar));
            } else {
                aVar3.e((a.d) null);
            }
            Y2.a aVar4 = new Y2.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath" + str2, a(), bVar.d());
            if (aVar != null) {
                aVar4.e(new C0577c(aVar));
            } else {
                aVar4.e((a.d) null);
            }
            Y2.a aVar5 = new Y2.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath" + str2, a(), bVar.d());
            if (aVar != null) {
                aVar5.e(new C0578d(aVar));
            } else {
                aVar5.e((a.d) null);
            }
            Y2.a aVar6 = new Y2.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath" + str2, a(), bVar.d());
            if (aVar != null) {
                aVar6.e(new C0579e(aVar));
            } else {
                aVar6.e((a.d) null);
            }
            Y2.a aVar7 = new Y2.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths" + str2, a(), bVar.d());
            if (aVar != null) {
                aVar7.e(new C0580f(aVar));
            } else {
                aVar7.e((a.d) null);
            }
            Y2.a aVar8 = new Y2.a(bVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths" + str2, a(), bVar.d());
            if (aVar != null) {
                aVar8.e(new C0581g(aVar));
            } else {
                aVar8.e((a.d) null);
            }
        }

        static /* synthetic */ void e(a aVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.o());
            } catch (Throwable th) {
                arrayList = C0582h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void l(a aVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.v());
            } catch (Throwable th) {
                arrayList = C0582h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void n(a aVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.f());
            } catch (Throwable th) {
                arrayList = C0582h.a(th);
            }
            eVar.a(arrayList);
        }

        static void p(Y2.b bVar, a aVar) {
            c(bVar, "", aVar);
        }

        static /* synthetic */ void q(a aVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.g());
            } catch (Throwable th) {
                arrayList = C0582h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void u(a aVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.i((c) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = C0582h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void w(a aVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.h());
            } catch (Throwable th) {
                arrayList = C0582h.a(th);
            }
            eVar.a(arrayList);
        }

        String f();

        String g();

        String h();

        List i(c cVar);

        List j();

        String o();

        String v();
    }

    /* renamed from: d3.h$b */
    public static class b extends o {

        /* renamed from: d  reason: collision with root package name */
        public static final b f8684d = new b();

        public Object g(byte b4, ByteBuffer byteBuffer) {
            if (b4 != -127) {
                return super.g(b4, byteBuffer);
            }
            Object f4 = f(byteBuffer);
            if (f4 == null) {
                return null;
            }
            return c.values()[((Long) f4).intValue()];
        }

        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof c) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((c) obj).f8697e));
                return;
            }
            super.p(byteArrayOutputStream, obj);
        }
    }

    /* renamed from: d3.h$c */
    public enum c {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);
        

        /* renamed from: e  reason: collision with root package name */
        public final int f8697e;

        /* access modifiers changed from: public */
        c(int i4) {
            this.f8697e = i4;
        }
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
