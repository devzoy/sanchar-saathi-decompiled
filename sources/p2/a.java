package P2;

import Y2.b;
import Y2.q;
import android.content.res.AssetManager;
import g3.C0641e;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;

public class a implements Y2.b {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f2223a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager f2224b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2225c;

    /* renamed from: d  reason: collision with root package name */
    public final Y2.b f2226d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2227e = false;

    /* renamed from: f  reason: collision with root package name */
    public String f2228f;

    /* renamed from: g  reason: collision with root package name */
    public final b.a f2229g;

    /* renamed from: P2.a$a  reason: collision with other inner class name */
    public class C0047a implements b.a {
        public C0047a() {
        }

        public void a(ByteBuffer byteBuffer, b.C0071b bVar) {
            String unused = a.this.f2228f = q.f3784b.b(byteBuffer);
            e unused2 = a.this.getClass();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f2231a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2232b;

        /* renamed from: c  reason: collision with root package name */
        public final FlutterCallbackInformation f2233c;

        public b(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
            this.f2231a = assetManager;
            this.f2232b = str;
            this.f2233c = flutterCallbackInformation;
        }

        public String toString() {
            return "DartCallback( bundle path: " + this.f2232b + ", library path: " + this.f2233c.callbackLibraryPath + ", function: " + this.f2233c.callbackName + " )";
        }
    }

    public static class d implements Y2.b {

        /* renamed from: a  reason: collision with root package name */
        public final c f2237a;

        public /* synthetic */ d(c cVar, C0047a aVar) {
            this(cVar);
        }

        public b.c a(b.d dVar) {
            return this.f2237a.a(dVar);
        }

        public void b(String str, b.a aVar, b.c cVar) {
            this.f2237a.b(str, aVar, cVar);
        }

        public void c(String str, ByteBuffer byteBuffer, b.C0071b bVar) {
            this.f2237a.c(str, byteBuffer, bVar);
        }

        public void e(String str, b.a aVar) {
            this.f2237a.e(str, aVar);
        }

        public void f(String str, ByteBuffer byteBuffer) {
            this.f2237a.c(str, byteBuffer, (b.C0071b) null);
        }

        public d(c cVar) {
            this.f2237a = cVar;
        }
    }

    public interface e {
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        C0047a aVar = new C0047a();
        this.f2229g = aVar;
        this.f2223a = flutterJNI;
        this.f2224b = assetManager;
        c cVar = new c(flutterJNI);
        this.f2225c = cVar;
        cVar.e("flutter/isolate", aVar);
        this.f2226d = new d(cVar, (C0047a) null);
        if (flutterJNI.isAttached()) {
            this.f2227e = true;
        }
    }

    public b.c a(b.d dVar) {
        return this.f2226d.a(dVar);
    }

    public void b(String str, b.a aVar, b.c cVar) {
        this.f2226d.b(str, aVar, cVar);
    }

    public void c(String str, ByteBuffer byteBuffer, b.C0071b bVar) {
        this.f2226d.c(str, byteBuffer, bVar);
    }

    public void e(String str, b.a aVar) {
        this.f2226d.e(str, aVar);
    }

    public void f(String str, ByteBuffer byteBuffer) {
        this.f2226d.f(str, byteBuffer);
    }

    public void i(b bVar) {
        if (this.f2227e) {
            M2.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C0641e g4 = C0641e.g("DartExecutor#executeDartCallback");
        try {
            M2.b.f("DartExecutor", "Executing Dart callback: " + bVar);
            FlutterJNI flutterJNI = this.f2223a;
            String str = bVar.f2232b;
            FlutterCallbackInformation flutterCallbackInformation = bVar.f2233c;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, bVar.f2231a, (List<String>) null);
            this.f2227e = true;
            if (g4 != null) {
                g4.close();
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void j(c cVar) {
        k(cVar, (List) null);
    }

    public void k(c cVar, List list) {
        if (this.f2227e) {
            M2.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C0641e g4 = C0641e.g("DartExecutor#executeDartEntrypoint");
        try {
            M2.b.f("DartExecutor", "Executing Dart entrypoint: " + cVar);
            this.f2223a.runBundleAndSnapshotFromLibrary(cVar.f2234a, cVar.f2236c, cVar.f2235b, this.f2224b, list);
            this.f2227e = true;
            if (g4 != null) {
                g4.close();
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public Y2.b l() {
        return this.f2226d;
    }

    public boolean m() {
        return this.f2227e;
    }

    public void n() {
        if (this.f2223a.isAttached()) {
            this.f2223a.notifyLowMemoryWarning();
        }
    }

    public void o() {
        M2.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f2223a.setPlatformMessageHandler(this.f2225c);
    }

    public void p() {
        M2.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f2223a.setPlatformMessageHandler((f) null);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f2234a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2235b;

        /* renamed from: c  reason: collision with root package name */
        public final String f2236c;

        public c(String str, String str2) {
            this.f2234a = str;
            this.f2235b = null;
            this.f2236c = str2;
        }

        public static c a() {
            R2.d c4 = M2.a.e().c();
            if (c4.k()) {
                return new c(c4.g(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f2234a.equals(cVar.f2234a)) {
                return false;
            }
            return this.f2236c.equals(cVar.f2236c);
        }

        public int hashCode() {
            return (this.f2234a.hashCode() * 31) + this.f2236c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f2234a + ", function: " + this.f2236c + " )";
        }

        public c(String str, String str2, String str3) {
            this.f2234a = str;
            this.f2235b = str2;
            this.f2236c = str3;
        }
    }
}
