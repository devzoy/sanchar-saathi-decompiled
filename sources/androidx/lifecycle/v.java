package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.x;
import v3.g;
import v3.l;

public final class v implements C0384k {

    /* renamed from: k  reason: collision with root package name */
    public static final b f5420k = new b((g) null);

    /* renamed from: l  reason: collision with root package name */
    public static final v f5421l = new v();

    /* renamed from: c  reason: collision with root package name */
    public int f5422c;

    /* renamed from: d  reason: collision with root package name */
    public int f5423d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5424e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5425f = true;

    /* renamed from: g  reason: collision with root package name */
    public Handler f5426g;

    /* renamed from: h  reason: collision with root package name */
    public final l f5427h = new l(this);

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f5428i = new u(this);

    /* renamed from: j  reason: collision with root package name */
    public final x.a f5429j = new d(this);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f5430a = new a();

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            l.e(activity, "activity");
            l.e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final C0384k a() {
            return v.f5421l;
        }

        public final void b(Context context) {
            l.e(context, "context");
            v.f5421l.i(context);
        }

        public b() {
        }
    }

    public static final class c extends C0377d {
        final /* synthetic */ v this$0;

        public static final class a extends C0377d {
            final /* synthetic */ v this$0;

            public a(v vVar) {
                this.this$0 = vVar;
            }

            public void onActivityPostResumed(Activity activity) {
                l.e(activity, "activity");
                this.this$0.f();
            }

            public void onActivityPostStarted(Activity activity) {
                l.e(activity, "activity");
                this.this$0.g();
            }
        }

        public c(v vVar) {
            this.this$0 = vVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                x.f5434d.b(activity).f(this.this$0.f5429j);
            }
        }

        public void onActivityPaused(Activity activity) {
            l.e(activity, "activity");
            this.this$0.e();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            l.e(activity, "activity");
            a.a(activity, new a(this.this$0));
        }

        public void onActivityStopped(Activity activity) {
            l.e(activity, "activity");
            this.this$0.h();
        }
    }

    public static final class d implements x.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v f5431a;

        public d(v vVar) {
            this.f5431a = vVar;
        }

        public void a() {
        }

        public void b() {
            this.f5431a.f();
        }

        public void c() {
            this.f5431a.g();
        }
    }

    public static final void j(v vVar) {
        l.e(vVar, "this$0");
        vVar.m();
        vVar.n();
    }

    public static final C0384k o() {
        return f5420k.a();
    }

    public C0380g b() {
        return this.f5427h;
    }

    public final void e() {
        int i4 = this.f5423d - 1;
        this.f5423d = i4;
        if (i4 == 0) {
            Handler handler = this.f5426g;
            l.b(handler);
            handler.postDelayed(this.f5428i, 700);
        }
    }

    public final void f() {
        int i4 = this.f5423d + 1;
        this.f5423d = i4;
        if (i4 != 1) {
            return;
        }
        if (this.f5424e) {
            this.f5427h.h(C0380g.a.ON_RESUME);
            this.f5424e = false;
            return;
        }
        Handler handler = this.f5426g;
        l.b(handler);
        handler.removeCallbacks(this.f5428i);
    }

    public final void g() {
        int i4 = this.f5422c + 1;
        this.f5422c = i4;
        if (i4 == 1 && this.f5425f) {
            this.f5427h.h(C0380g.a.ON_START);
            this.f5425f = false;
        }
    }

    public final void h() {
        this.f5422c--;
        n();
    }

    public final void i(Context context) {
        l.e(context, "context");
        this.f5426g = new Handler();
        this.f5427h.h(C0380g.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        l.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c(this));
    }

    public final void m() {
        if (this.f5423d == 0) {
            this.f5424e = true;
            this.f5427h.h(C0380g.a.ON_PAUSE);
        }
    }

    public final void n() {
        if (this.f5422c == 0 && this.f5424e) {
            this.f5427h.h(C0380g.a.ON_STOP);
            this.f5425f = true;
        }
    }
}
