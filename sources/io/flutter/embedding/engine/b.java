package io.flutter.embedding.engine;

import P2.a;
import R2.d;
import android.content.Context;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.t;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final List f10330a = new ArrayList();

    public class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f10331a;

        public a(a aVar) {
            this.f10331a = aVar;
        }

        public void a() {
            b.this.f10330a.remove(this.f10331a);
        }

        public void b() {
        }
    }

    /* renamed from: io.flutter.embedding.engine.b$b  reason: collision with other inner class name */
    public static class C0174b {

        /* renamed from: a  reason: collision with root package name */
        public Context f10333a;

        /* renamed from: b  reason: collision with root package name */
        public a.c f10334b;

        /* renamed from: c  reason: collision with root package name */
        public String f10335c;

        /* renamed from: d  reason: collision with root package name */
        public List f10336d;

        /* renamed from: e  reason: collision with root package name */
        public t f10337e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10338f = true;

        /* renamed from: g  reason: collision with root package name */
        public boolean f10339g = false;

        public C0174b(Context context) {
            this.f10333a = context;
        }

        public boolean a() {
            return this.f10338f;
        }

        public Context b() {
            return this.f10333a;
        }

        public a.c c() {
            return this.f10334b;
        }

        public List d() {
            return this.f10336d;
        }

        public String e() {
            return this.f10335c;
        }

        public t f() {
            return this.f10337e;
        }

        public boolean g() {
            return this.f10339g;
        }

        public C0174b h(boolean z4) {
            this.f10338f = z4;
            return this;
        }

        public C0174b i(a.c cVar) {
            this.f10334b = cVar;
            return this;
        }

        public C0174b j(List list) {
            this.f10336d = list;
            return this;
        }

        public C0174b k(String str) {
            this.f10335c = str;
            return this;
        }

        public C0174b l(boolean z4) {
            this.f10339g = z4;
            return this;
        }
    }

    public b(Context context, String[] strArr) {
        d c4 = M2.a.e().c();
        if (!c4.k()) {
            c4.m(context.getApplicationContext());
            c4.f(context.getApplicationContext(), strArr);
        }
    }

    public a a(C0174b bVar) {
        a aVar;
        Context b4 = bVar.b();
        a.c c4 = bVar.c();
        String e4 = bVar.e();
        List d4 = bVar.d();
        t f4 = bVar.f();
        if (f4 == null) {
            f4 = new t();
        }
        t tVar = f4;
        boolean a4 = bVar.a();
        boolean g4 = bVar.g();
        a.c a5 = c4 == null ? a.c.a() : c4;
        if (this.f10330a.size() == 0) {
            aVar = b(b4, tVar, a4, g4);
            if (e4 != null) {
                aVar.o().c(e4);
            }
            aVar.k().k(a5, d4);
        } else {
            aVar = ((a) this.f10330a.get(0)).B(b4, a5, e4, d4, tVar, a4, g4);
        }
        this.f10330a.add(aVar);
        aVar.e(new a(aVar));
        return aVar;
    }

    public a b(Context context, t tVar, boolean z4, boolean z5) {
        return new a(context, (d) null, (FlutterJNI) null, tVar, (String[]) null, z4, z5, this);
    }
}
