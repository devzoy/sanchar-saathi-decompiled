package androidx.work;

import Q0.h;
import Q0.q;
import Q0.v;
import R0.C0302d;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f6098a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f6099b;

    /* renamed from: c  reason: collision with root package name */
    public final v f6100c;

    /* renamed from: d  reason: collision with root package name */
    public final h f6101d;

    /* renamed from: e  reason: collision with root package name */
    public final q f6102e;

    /* renamed from: f  reason: collision with root package name */
    public final R.a f6103f;

    /* renamed from: g  reason: collision with root package name */
    public final R.a f6104g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6105h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6106i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6107j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6108k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6109l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6110m;

    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    public class C0104a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f6111a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f6112b;

        public C0104a(boolean z4) {
            this.f6112b = z4;
        }

        public Thread newThread(Runnable runnable) {
            String str = this.f6112b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f6111a.incrementAndGet());
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Executor f6114a;

        /* renamed from: b  reason: collision with root package name */
        public v f6115b;

        /* renamed from: c  reason: collision with root package name */
        public h f6116c;

        /* renamed from: d  reason: collision with root package name */
        public Executor f6117d;

        /* renamed from: e  reason: collision with root package name */
        public q f6118e;

        /* renamed from: f  reason: collision with root package name */
        public R.a f6119f;

        /* renamed from: g  reason: collision with root package name */
        public R.a f6120g;

        /* renamed from: h  reason: collision with root package name */
        public String f6121h;

        /* renamed from: i  reason: collision with root package name */
        public int f6122i = 4;

        /* renamed from: j  reason: collision with root package name */
        public int f6123j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f6124k = Integer.MAX_VALUE;

        /* renamed from: l  reason: collision with root package name */
        public int f6125l = 20;

        public a a() {
            return new a(this);
        }
    }

    public a(b bVar) {
        Executor executor = bVar.f6114a;
        if (executor == null) {
            this.f6098a = a(false);
        } else {
            this.f6098a = executor;
        }
        Executor executor2 = bVar.f6117d;
        if (executor2 == null) {
            this.f6110m = true;
            this.f6099b = a(true);
        } else {
            this.f6110m = false;
            this.f6099b = executor2;
        }
        v vVar = bVar.f6115b;
        if (vVar == null) {
            this.f6100c = v.c();
        } else {
            this.f6100c = vVar;
        }
        h hVar = bVar.f6116c;
        if (hVar == null) {
            this.f6101d = h.c();
        } else {
            this.f6101d = hVar;
        }
        q qVar = bVar.f6118e;
        if (qVar == null) {
            this.f6102e = new C0302d();
        } else {
            this.f6102e = qVar;
        }
        this.f6106i = bVar.f6122i;
        this.f6107j = bVar.f6123j;
        this.f6108k = bVar.f6124k;
        this.f6109l = bVar.f6125l;
        this.f6103f = bVar.f6119f;
        this.f6104g = bVar.f6120g;
        this.f6105h = bVar.f6121h;
    }

    public final Executor a(boolean z4) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z4));
    }

    public final ThreadFactory b(boolean z4) {
        return new C0104a(z4);
    }

    public String c() {
        return this.f6105h;
    }

    public Executor d() {
        return this.f6098a;
    }

    public R.a e() {
        return this.f6103f;
    }

    public h f() {
        return this.f6101d;
    }

    public int g() {
        return this.f6108k;
    }

    public int h() {
        return this.f6109l;
    }

    public int i() {
        return this.f6107j;
    }

    public int j() {
        return this.f6106i;
    }

    public q k() {
        return this.f6102e;
    }

    public R.a l() {
        return this.f6104g;
    }

    public Executor m() {
        return this.f6099b;
    }

    public v n() {
        return this.f6100c;
    }
}
