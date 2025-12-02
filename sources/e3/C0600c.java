package e3;

import Y2.a;
import Y2.b;
import Y2.h;
import Y2.o;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: e3.c  reason: case insensitive filesystem */
public abstract class C0600c {

    /* renamed from: e3.c$a */
    public static class a extends o {

        /* renamed from: d  reason: collision with root package name */
        public static final a f8933d = new a();

        public Object g(byte b4, ByteBuffer byteBuffer) {
            return super.g(b4, byteBuffer);
        }

        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            super.p(byteArrayOutputStream, obj);
        }
    }

    /* renamed from: e3.c$b */
    public interface b {
        static /* synthetic */ void B(b bVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.w((String) arrayList2.get(0), (Double) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = C0600c.a(th);
            }
            eVar.a(arrayList);
        }

        static void C(Y2.b bVar, b bVar2) {
            u(bVar, "", bVar2);
        }

        static /* synthetic */ void D(b bVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, bVar.y((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = C0600c.a(th);
            }
            eVar.a(arrayList);
        }

        static h a() {
            return a.f8933d;
        }

        static /* synthetic */ void b(b bVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.m((String) arrayList2.get(0), (String) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = C0600c.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void d(b bVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.t((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = C0600c.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void j(b bVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.o((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = C0600c.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void l(b bVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.k((String) arrayList2.get(0), (String) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = C0600c.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void p(b bVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.n((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = C0600c.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void r(b bVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.f((String) arrayList2.get(0), (Long) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = C0600c.a(th);
            }
            eVar.a(arrayList);
        }

        static void u(Y2.b bVar, String str, b bVar2) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            b.c d4 = bVar.d();
            Y2.a aVar = new Y2.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove" + str2, a(), d4);
            if (bVar2 != null) {
                aVar.e(new C0601d(bVar2));
            } else {
                aVar.e((a.d) null);
            }
            Y2.a aVar2 = new Y2.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool" + str2, a(), d4);
            if (bVar2 != null) {
                aVar2.e(new C0602e(bVar2));
            } else {
                aVar2.e((a.d) null);
            }
            Y2.a aVar3 = new Y2.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString" + str2, a(), d4);
            if (bVar2 != null) {
                aVar3.e(new C0603f(bVar2));
            } else {
                aVar3.e((a.d) null);
            }
            Y2.a aVar4 = new Y2.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt" + str2, a(), d4);
            if (bVar2 != null) {
                aVar4.e(new C0604g(bVar2));
            } else {
                aVar4.e((a.d) null);
            }
            Y2.a aVar5 = new Y2.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble" + str2, a(), d4);
            if (bVar2 != null) {
                aVar5.e(new C0605h(bVar2));
            } else {
                aVar5.e((a.d) null);
            }
            Y2.a aVar6 = new Y2.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList" + str2, a(), d4);
            if (bVar2 != null) {
                aVar6.e(new C0606i(bVar2));
            } else {
                aVar6.e((a.d) null);
            }
            Y2.a aVar7 = new Y2.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList" + str2, a(), d4);
            if (bVar2 != null) {
                aVar7.e(new C0607j(bVar2));
            } else {
                aVar7.e((a.d) null);
            }
            Y2.a aVar8 = new Y2.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear" + str2, a(), d4);
            if (bVar2 != null) {
                aVar8.e(new C0608k(bVar2));
            } else {
                aVar8.e((a.d) null);
            }
            Y2.a aVar9 = new Y2.a(bVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll" + str2, a(), d4);
            if (bVar2 != null) {
                aVar9.e(new C0609l(bVar2));
            } else {
                aVar9.e((a.d) null);
            }
        }

        static /* synthetic */ void z(b bVar, Object obj, a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.g((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = C0600c.a(th);
            }
            eVar.a(arrayList);
        }

        Boolean f(String str, Long l4);

        Map g(String str, List list);

        Boolean k(String str, String str2);

        Boolean m(String str, String str2);

        Boolean n(String str, List list);

        Boolean o(String str, List list);

        Boolean t(String str, Boolean bool);

        Boolean w(String str, Double d4);

        Boolean y(String str);
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
