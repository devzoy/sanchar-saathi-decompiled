package v1;

import R1.f;
import R1.g;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Collections;
import v1.C0947a;
import w1.C0966C;
import w1.C0968a;
import w1.C0969b;
import w1.C0972e;
import w1.C0979l;
import w1.C0981n;
import w1.C0983p;
import w1.C0989w;
import w1.M;
import z1.C1021d;
import z1.C1022e;
import z1.C1032o;

/* renamed from: v1.e  reason: case insensitive filesystem */
public abstract class C0951e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12410a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12411b;

    /* renamed from: c  reason: collision with root package name */
    public final E1.a f12412c;

    /* renamed from: d  reason: collision with root package name */
    public final C0947a f12413d;

    /* renamed from: e  reason: collision with root package name */
    public final C0947a.d f12414e;

    /* renamed from: f  reason: collision with root package name */
    public final C0969b f12415f;

    /* renamed from: g  reason: collision with root package name */
    public final Looper f12416g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12417h;

    /* renamed from: i  reason: collision with root package name */
    public final C0952f f12418i;

    /* renamed from: j  reason: collision with root package name */
    public final C0979l f12419j;

    /* renamed from: k  reason: collision with root package name */
    public final C0972e f12420k;

    /* renamed from: v1.e$a */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f12421c = new C0205a().a();

        /* renamed from: a  reason: collision with root package name */
        public final C0979l f12422a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f12423b;

        /* renamed from: v1.e$a$a  reason: collision with other inner class name */
        public static class C0205a {

            /* renamed from: a  reason: collision with root package name */
            public C0979l f12424a;

            /* renamed from: b  reason: collision with root package name */
            public Looper f12425b;

            public a a() {
                if (this.f12424a == null) {
                    this.f12424a = new C0968a();
                }
                if (this.f12425b == null) {
                    this.f12425b = Looper.getMainLooper();
                }
                return new a(this.f12424a, (Account) null, this.f12425b, (byte[]) null);
            }

            public C0205a b(C0979l lVar) {
                C1032o.g(lVar, "StatusExceptionMapper must not be null.");
                this.f12424a = lVar;
                return this;
            }
        }

        public a(C0979l lVar, Account account, Looper looper) {
            this.f12422a = lVar;
            this.f12423b = looper;
        }

        public /* synthetic */ a(C0979l lVar, Account account, Looper looper, byte[] bArr) {
            this(lVar, (Account) null, looper);
        }
    }

    public C0951e(Context context, Activity activity, C0947a aVar, C0947a.d dVar, a aVar2) {
        String str;
        C1032o.g(context, "Null context is not permitted.");
        C1032o.g(aVar, "Api must not be null.");
        C1032o.g(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) C1032o.g(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f12410a = context2;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            str = H.a.b(context);
        } else {
            str = g(context);
        }
        this.f12411b = str;
        this.f12412c = i4 >= 31 ? new E1.a(context.getAttributionSource()) : null;
        this.f12413d = aVar;
        this.f12414e = dVar;
        this.f12416g = aVar2.f12423b;
        C0969b a4 = C0969b.a(aVar, dVar, str);
        this.f12415f = a4;
        this.f12418i = new C0966C(this);
        C0972e m4 = C0972e.m(context2);
        this.f12420k = m4;
        this.f12417h = m4.n();
        this.f12419j = aVar2.f12422a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C0983p.t(activity, m4, a4);
        }
        m4.o(this);
    }

    public C0952f c() {
        return this.f12418i;
    }

    public C1022e.a d() {
        C1022e.a aVar = new C1022e.a();
        aVar.c((Account) null);
        aVar.d(Collections.emptySet());
        Context context = this.f12410a;
        aVar.e(context.getClass().getName());
        aVar.b(context.getPackageName());
        return aVar;
    }

    public f e(C0981n nVar) {
        return o(2, nVar);
    }

    public com.google.android.gms.common.api.internal.a f(com.google.android.gms.common.api.internal.a aVar) {
        n(2, aVar);
        return aVar;
    }

    public String g(Context context) {
        return null;
    }

    public final C0969b h() {
        return this.f12415f;
    }

    public String i() {
        return this.f12411b;
    }

    public Looper j() {
        return this.f12416g;
    }

    public final C0947a.f k(Looper looper, C0989w wVar) {
        C0947a.f a4 = ((C0947a.C0204a) C1032o.f(this.f12413d.a())).a(this.f12410a, looper, d().a(), this.f12414e, wVar, wVar);
        E1.a aVar = this.f12412c;
        if (aVar == null || !(a4 instanceof C1021d)) {
            String i4 = i();
            if (i4 != null && (a4 instanceof C1021d)) {
                ((C1021d) a4).P(i4);
            }
            return a4;
        }
        ((C1021d) a4).O(aVar);
        return a4;
    }

    public final int l() {
        return this.f12417h;
    }

    public final M m(Context context, Handler handler) {
        return new M(context, handler, d().a());
    }

    public final com.google.android.gms.common.api.internal.a n(int i4, com.google.android.gms.common.api.internal.a aVar) {
        aVar.g();
        this.f12420k.t(this, i4, aVar);
        return aVar;
    }

    public final f o(int i4, C0981n nVar) {
        g gVar = new g();
        this.f12420k.u(this, i4, nVar, gVar, this.f12419j);
        return gVar.a();
    }

    public C0951e(Context context, C0947a aVar, C0947a.d dVar, a aVar2) {
        this(context, (Activity) null, aVar, dVar, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0951e(android.content.Context r2, v1.C0947a r3, v1.C0947a.d r4, w1.C0979l r5) {
        /*
            r1 = this;
            v1.e$a$a r0 = new v1.e$a$a
            r0.<init>()
            r0.b(r5)
            v1.e$a r5 = r0.a()
            r1.<init>((android.content.Context) r2, (v1.C0947a) r3, (v1.C0947a.d) r4, (v1.C0951e.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.C0951e.<init>(android.content.Context, v1.a, v1.a$d, w1.l):void");
    }
}
