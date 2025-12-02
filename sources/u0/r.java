package u0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import u0.j;
import u0.k;
import u0.o;
import v3.l;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f12211a;

    /* renamed from: b  reason: collision with root package name */
    public final o f12212b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f12213c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f12214d;

    /* renamed from: e  reason: collision with root package name */
    public int f12215e;

    /* renamed from: f  reason: collision with root package name */
    public o.c f12216f;

    /* renamed from: g  reason: collision with root package name */
    public k f12217g;

    /* renamed from: h  reason: collision with root package name */
    public final j f12218h = new b(this);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f12219i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    public final ServiceConnection f12220j;

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f12221k;

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f12222l;

    public static final class a extends o.c {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ r f12223b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(r rVar, String[] strArr) {
            super(strArr);
            this.f12223b = rVar;
        }

        public boolean b() {
            return true;
        }

        public void c(Set set) {
            l.e(set, "tables");
            if (!this.f12223b.j().get()) {
                try {
                    k h4 = this.f12223b.h();
                    if (h4 != null) {
                        int c4 = this.f12223b.c();
                        Object[] array = set.toArray(new String[0]);
                        l.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        h4.z(c4, (String[]) array);
                    }
                } catch (RemoteException e4) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e4);
                }
            }
        }
    }

    public static final class b extends j.a {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ r f12224c;

        public b(r rVar) {
            this.f12224c = rVar;
        }

        public static final void J(r rVar, String[] strArr) {
            l.e(rVar, "this$0");
            l.e(strArr, "$tables");
            rVar.e().j((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public void p(String[] strArr) {
            l.e(strArr, "tables");
            this.f12224c.d().execute(new s(this.f12224c, strArr));
        }
    }

    public static final class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f12225a;

        public c(r rVar) {
            this.f12225a = rVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            l.e(componentName, "name");
            l.e(iBinder, "service");
            this.f12225a.m(k.a.H(iBinder));
            this.f12225a.d().execute(this.f12225a.i());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            l.e(componentName, "name");
            this.f12225a.d().execute(this.f12225a.g());
            this.f12225a.m((k) null);
        }
    }

    public r(Context context, String str, Intent intent, o oVar, Executor executor) {
        l.e(context, "context");
        l.e(str, "name");
        l.e(intent, "serviceIntent");
        l.e(oVar, "invalidationTracker");
        l.e(executor, "executor");
        this.f12211a = str;
        this.f12212b = oVar;
        this.f12213c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f12214d = applicationContext;
        c cVar = new c(this);
        this.f12220j = cVar;
        this.f12221k = new p(this);
        this.f12222l = new q(this);
        Object[] array = oVar.h().keySet().toArray(new String[0]);
        l.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        l(new a(this, (String[]) array));
        applicationContext.bindService(intent, cVar, 1);
    }

    public static final void k(r rVar) {
        l.e(rVar, "this$0");
        rVar.f12212b.m(rVar.f());
    }

    public static final void n(r rVar) {
        l.e(rVar, "this$0");
        try {
            k kVar = rVar.f12217g;
            if (kVar != null) {
                rVar.f12215e = kVar.s(rVar.f12218h, rVar.f12211a);
                rVar.f12212b.b(rVar.f());
            }
        } catch (RemoteException e4) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e4);
        }
    }

    public final int c() {
        return this.f12215e;
    }

    public final Executor d() {
        return this.f12213c;
    }

    public final o e() {
        return this.f12212b;
    }

    public final o.c f() {
        o.c cVar = this.f12216f;
        if (cVar != null) {
            return cVar;
        }
        l.n("observer");
        return null;
    }

    public final Runnable g() {
        return this.f12222l;
    }

    public final k h() {
        return this.f12217g;
    }

    public final Runnable i() {
        return this.f12221k;
    }

    public final AtomicBoolean j() {
        return this.f12219i;
    }

    public final void l(o.c cVar) {
        l.e(cVar, "<set-?>");
        this.f12216f = cVar;
    }

    public final void m(k kVar) {
        this.f12217g = kVar;
    }
}
