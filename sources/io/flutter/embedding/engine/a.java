package io.flutter.embedding.engine;

import P2.a;
import R2.d;
import X2.f;
import X2.g;
import X2.k;
import X2.l;
import X2.m;
import X2.n;
import X2.o;
import X2.r;
import X2.s;
import X2.t;
import X2.u;
import X2.v;
import X2.w;
import X2.x;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import b3.C0394a;
import g3.C0644h;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class a implements C0644h.a {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f10306a;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterRenderer f10307b;

    /* renamed from: c  reason: collision with root package name */
    public final P2.a f10308c;

    /* renamed from: d  reason: collision with root package name */
    public final O2.b f10309d;

    /* renamed from: e  reason: collision with root package name */
    public final Z2.a f10310e;

    /* renamed from: f  reason: collision with root package name */
    public final X2.a f10311f;

    /* renamed from: g  reason: collision with root package name */
    public final g f10312g;

    /* renamed from: h  reason: collision with root package name */
    public final k f10313h;

    /* renamed from: i  reason: collision with root package name */
    public final l f10314i;

    /* renamed from: j  reason: collision with root package name */
    public final m f10315j;

    /* renamed from: k  reason: collision with root package name */
    public final n f10316k;

    /* renamed from: l  reason: collision with root package name */
    public final f f10317l;

    /* renamed from: m  reason: collision with root package name */
    public final s f10318m;

    /* renamed from: n  reason: collision with root package name */
    public final o f10319n;

    /* renamed from: o  reason: collision with root package name */
    public final r f10320o;

    /* renamed from: p  reason: collision with root package name */
    public final t f10321p;

    /* renamed from: q  reason: collision with root package name */
    public final u f10322q;

    /* renamed from: r  reason: collision with root package name */
    public final v f10323r;

    /* renamed from: s  reason: collision with root package name */
    public final w f10324s;

    /* renamed from: t  reason: collision with root package name */
    public final x f10325t;

    /* renamed from: u  reason: collision with root package name */
    public final io.flutter.plugin.platform.t f10326u;

    /* renamed from: v  reason: collision with root package name */
    public final Set f10327v;

    /* renamed from: w  reason: collision with root package name */
    public final b f10328w;

    /* renamed from: io.flutter.embedding.engine.a$a  reason: collision with other inner class name */
    public class C0173a implements b {
        public C0173a() {
        }

        public void a() {
        }

        public void b() {
            M2.b.f("FlutterEngine", "onPreEngineRestart()");
            for (b b4 : a.this.f10327v) {
                b4.b();
            }
            a.this.f10326u.m0();
            a.this.f10318m.g();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context) {
        this(context, (String[]) null);
    }

    public final boolean A() {
        return this.f10306a.isAttached();
    }

    public a B(Context context, a.c cVar, String str, List list, io.flutter.plugin.platform.t tVar, boolean z4, boolean z5) {
        a.c cVar2 = cVar;
        if (A()) {
            String str2 = str;
            return new a(context, (d) null, this.f10306a.spawn(cVar2.f2236c, cVar2.f2235b, str, list), tVar, (String[]) null, z4, z5);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    public void a(float f4, float f5, float f6) {
        this.f10306a.updateDisplayMetrics(0, f4, f5, f6);
    }

    public void e(b bVar) {
        this.f10327v.add(bVar);
    }

    public final void f() {
        M2.b.f("FlutterEngine", "Attaching to JNI.");
        this.f10306a.attachToNative();
        if (!A()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    public void g() {
        M2.b.f("FlutterEngine", "Destroying.");
        for (b a4 : this.f10327v) {
            a4.a();
        }
        this.f10309d.i();
        this.f10326u.i0();
        this.f10308c.p();
        this.f10306a.removeEngineLifecycleListener(this.f10328w);
        this.f10306a.setDeferredComponentManager((Q2.a) null);
        this.f10306a.detachFromNativeAndReleaseResources();
        M2.a.e().a();
    }

    public X2.a h() {
        return this.f10311f;
    }

    public U2.b i() {
        return this.f10309d;
    }

    public f j() {
        return this.f10317l;
    }

    public P2.a k() {
        return this.f10308c;
    }

    public k l() {
        return this.f10313h;
    }

    public Z2.a m() {
        return this.f10310e;
    }

    public m n() {
        return this.f10315j;
    }

    public n o() {
        return this.f10316k;
    }

    public o p() {
        return this.f10319n;
    }

    public io.flutter.plugin.platform.t q() {
        return this.f10326u;
    }

    public T2.b r() {
        return this.f10309d;
    }

    public r s() {
        return this.f10320o;
    }

    public FlutterRenderer t() {
        return this.f10307b;
    }

    public s u() {
        return this.f10318m;
    }

    public t v() {
        return this.f10321p;
    }

    public u w() {
        return this.f10322q;
    }

    public v x() {
        return this.f10323r;
    }

    public w y() {
        return this.f10324s;
    }

    public x z() {
        return this.f10325t;
    }

    public a(Context context, String[] strArr) {
        this(context, (d) null, (FlutterJNI) null, strArr, true);
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, String[] strArr, boolean z4) {
        this(context, dVar, flutterJNI, new io.flutter.plugin.platform.t(), strArr, z4);
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.t tVar, String[] strArr, boolean z4) {
        this(context, dVar, flutterJNI, tVar, strArr, z4, false);
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.t tVar, String[] strArr, boolean z4, boolean z5) {
        this(context, dVar, flutterJNI, tVar, strArr, z4, z5, (b) null);
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.t tVar, String[] strArr, boolean z4, boolean z5, b bVar) {
        AssetManager assetManager;
        this.f10327v = new HashSet();
        this.f10328w = new C0173a();
        try {
            assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assetManager = context.getAssets();
        }
        M2.a e4 = M2.a.e();
        flutterJNI = flutterJNI == null ? e4.d().a() : flutterJNI;
        this.f10306a = flutterJNI;
        P2.a aVar = new P2.a(flutterJNI, assetManager);
        this.f10308c = aVar;
        aVar.o();
        M2.a.e().a();
        this.f10311f = new X2.a(aVar, flutterJNI);
        this.f10312g = new g(aVar);
        this.f10313h = new k(aVar);
        l lVar = new l(aVar);
        this.f10314i = lVar;
        this.f10315j = new m(aVar);
        this.f10316k = new n(aVar);
        this.f10317l = new f(aVar);
        this.f10319n = new o(aVar);
        this.f10320o = new r(aVar, context.getPackageManager());
        this.f10318m = new s(aVar, z5);
        this.f10321p = new t(aVar);
        this.f10322q = new u(aVar);
        this.f10323r = new v(aVar);
        this.f10324s = new w(aVar);
        this.f10325t = new x(aVar);
        Z2.a aVar2 = new Z2.a(context, lVar);
        this.f10310e = aVar2;
        dVar = dVar == null ? e4.c() : dVar;
        if (!flutterJNI.isAttached()) {
            dVar.m(context.getApplicationContext());
            dVar.f(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f10328w);
        flutterJNI.setPlatformViewsController(tVar);
        flutterJNI.setLocalizationPlugin(aVar2);
        e4.a();
        flutterJNI.setDeferredComponentManager((Q2.a) null);
        if (!flutterJNI.isAttached()) {
            f();
        }
        this.f10307b = new FlutterRenderer(flutterJNI);
        this.f10326u = tVar;
        tVar.g0();
        O2.b bVar2 = new O2.b(context.getApplicationContext(), this, dVar, bVar);
        this.f10309d = bVar2;
        aVar2.d(context.getResources().getConfiguration());
        if (z4 && dVar.e()) {
            W2.a.a(this);
        }
        C0644h.c(context, this);
        bVar2.a(new C0394a(s()));
    }
}
