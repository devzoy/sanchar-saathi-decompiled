package u0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import h3.C0673n;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import v3.g;
import v3.l;
import y0.h;

/* renamed from: u0.c  reason: case insensitive filesystem */
public final class C0940c {

    /* renamed from: m  reason: collision with root package name */
    public static final a f12112m = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public h f12113a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f12114b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public Runnable f12115c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12116d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public long f12117e;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f12118f;

    /* renamed from: g  reason: collision with root package name */
    public int f12119g;

    /* renamed from: h  reason: collision with root package name */
    public long f12120h;

    /* renamed from: i  reason: collision with root package name */
    public y0.g f12121i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12122j;

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f12123k;

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f12124l;

    /* renamed from: u0.c$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public C0940c(long j4, TimeUnit timeUnit, Executor executor) {
        l.e(timeUnit, "autoCloseTimeUnit");
        l.e(executor, "autoCloseExecutor");
        this.f12117e = timeUnit.toMillis(j4);
        this.f12118f = executor;
        this.f12120h = SystemClock.uptimeMillis();
        this.f12123k = new C0938a(this);
        this.f12124l = new C0939b(this);
    }

    public static final void c(C0940c cVar) {
        C0673n nVar;
        l.e(cVar, "this$0");
        synchronized (cVar.f12116d) {
            try {
                if (SystemClock.uptimeMillis() - cVar.f12120h >= cVar.f12117e) {
                    if (cVar.f12119g == 0) {
                        Runnable runnable = cVar.f12115c;
                        if (runnable != null) {
                            runnable.run();
                            nVar = C0673n.f9639a;
                        } else {
                            nVar = null;
                        }
                        if (nVar != null) {
                            y0.g gVar = cVar.f12121i;
                            if (gVar != null && gVar.isOpen()) {
                                gVar.close();
                            }
                            cVar.f12121i = null;
                            C0673n nVar2 = C0673n.f9639a;
                            return;
                        }
                        throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void f(C0940c cVar) {
        l.e(cVar, "this$0");
        cVar.f12118f.execute(cVar.f12124l);
    }

    public final void d() {
        synchronized (this.f12116d) {
            try {
                this.f12122j = true;
                y0.g gVar = this.f12121i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f12121i = null;
                C0673n nVar = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f12116d) {
            try {
                int i4 = this.f12119g;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    this.f12119g = i5;
                    if (i5 == 0) {
                        if (this.f12121i != null) {
                            this.f12114b.postDelayed(this.f12123k, this.f12117e);
                        } else {
                            return;
                        }
                    }
                    C0673n nVar = C0673n.f9639a;
                    return;
                }
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object g(u3.l lVar) {
        l.e(lVar, "block");
        try {
            return lVar.i(j());
        } finally {
            e();
        }
    }

    public final y0.g h() {
        return this.f12121i;
    }

    public final h i() {
        h hVar = this.f12113a;
        if (hVar != null) {
            return hVar;
        }
        l.n("delegateOpenHelper");
        return null;
    }

    public final y0.g j() {
        synchronized (this.f12116d) {
            this.f12114b.removeCallbacks(this.f12123k);
            this.f12119g++;
            if (!this.f12122j) {
                y0.g gVar = this.f12121i;
                if (gVar != null && gVar.isOpen()) {
                    return gVar;
                }
                y0.g writableDatabase = i().getWritableDatabase();
                this.f12121i = writableDatabase;
                return writableDatabase;
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    public final void k(h hVar) {
        l.e(hVar, "delegateOpenHelper");
        n(hVar);
    }

    public final boolean l() {
        return !this.f12122j;
    }

    public final void m(Runnable runnable) {
        l.e(runnable, "onAutoClose");
        this.f12115c = runnable;
    }

    public final void n(h hVar) {
        l.e(hVar, "<set-?>");
        this.f12113a = hVar;
    }
}
