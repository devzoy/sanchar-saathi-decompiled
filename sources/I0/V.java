package i0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.A;
import androidx.lifecycle.C0379f;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.G;
import androidx.lifecycle.H;
import androidx.lifecycle.I;
import androidx.lifecycle.l;
import m0.C0785a;
import m0.C0786b;
import x0.C0998d;
import x0.C0999e;
import x0.C1000f;

public class V implements C0379f, C1000f, I {

    /* renamed from: c  reason: collision with root package name */
    public final C0695p f9979c;

    /* renamed from: d  reason: collision with root package name */
    public final H f9980d;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f9981e;

    /* renamed from: f  reason: collision with root package name */
    public l f9982f = null;

    /* renamed from: g  reason: collision with root package name */
    public C0999e f9983g = null;

    public V(C0695p pVar, H h4, Runnable runnable) {
        this.f9979c = pVar;
        this.f9980d = h4;
        this.f9981e = runnable;
    }

    public void a(C0380g.a aVar) {
        this.f9982f.h(aVar);
    }

    public C0380g b() {
        c();
        return this.f9982f;
    }

    public void c() {
        if (this.f9982f == null) {
            this.f9982f = new l(this);
            C0999e a4 = C0999e.a(this);
            this.f9983g = a4;
            a4.c();
            this.f9981e.run();
        }
    }

    public boolean d() {
        return this.f9982f != null;
    }

    public void e(Bundle bundle) {
        this.f9983g.d(bundle);
    }

    public void f(Bundle bundle) {
        this.f9983g.e(bundle);
    }

    public void g(C0380g.b bVar) {
        this.f9982f.m(bVar);
    }

    public C0998d l() {
        c();
        return this.f9983g.b();
    }

    public C0785a o() {
        Application application;
        Context applicationContext = this.f9979c.q1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        C0786b bVar = new C0786b();
        if (application != null) {
            bVar.b(G.a.f5357e, application);
        }
        bVar.b(A.f5337a, this.f9979c);
        bVar.b(A.f5338b, this);
        if (this.f9979c.r() != null) {
            bVar.b(A.f5339c, this.f9979c.r());
        }
        return bVar;
    }

    public H t() {
        c();
        return this.f9980d;
    }
}
