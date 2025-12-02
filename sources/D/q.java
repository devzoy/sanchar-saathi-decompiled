package d;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.C0382i;
import androidx.lifecycle.C0384k;
import h3.C0673n;
import i3.C0731h;
import java.util.Iterator;
import java.util.ListIterator;
import u3.l;
import v3.m;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f8644a;

    /* renamed from: b  reason: collision with root package name */
    public final R.a f8645b;

    /* renamed from: c  reason: collision with root package name */
    public final C0731h f8646c;

    /* renamed from: d  reason: collision with root package name */
    public p f8647d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedCallback f8648e;

    /* renamed from: f  reason: collision with root package name */
    public OnBackInvokedDispatcher f8649f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8650g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8651h;

    public static final class a extends m implements l {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q f8652f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(q qVar) {
            super(1);
            this.f8652f = qVar;
        }

        public final void a(C0566b bVar) {
            v3.l.e(bVar, "backEvent");
            this.f8652f.m(bVar);
        }

        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((C0566b) obj);
            return C0673n.f9639a;
        }
    }

    public static final class b extends m implements l {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q f8653f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(q qVar) {
            super(1);
            this.f8653f = qVar;
        }

        public final void a(C0566b bVar) {
            v3.l.e(bVar, "backEvent");
            this.f8653f.l(bVar);
        }

        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((C0566b) obj);
            return C0673n.f9639a;
        }
    }

    public static final class c extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q f8654f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(q qVar) {
            super(0);
            this.f8654f = qVar;
        }

        public final void a() {
            this.f8654f.k();
        }

        public /* bridge */ /* synthetic */ Object c() {
            a();
            return C0673n.f9639a;
        }
    }

    public static final class d extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q f8655f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(q qVar) {
            super(0);
            this.f8655f = qVar;
        }

        public final void a() {
            this.f8655f.j();
        }

        public /* bridge */ /* synthetic */ Object c() {
            a();
            return C0673n.f9639a;
        }
    }

    public static final class e extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q f8656f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(q qVar) {
            super(0);
            this.f8656f = qVar;
        }

        public final void a() {
            this.f8656f.k();
        }

        public /* bridge */ /* synthetic */ Object c() {
            a();
            return C0673n.f9639a;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f8657a = new f();

        public static final void c(u3.a aVar) {
            v3.l.e(aVar, "$onBackInvoked");
            aVar.c();
        }

        public final OnBackInvokedCallback b(u3.a aVar) {
            v3.l.e(aVar, "onBackInvoked");
            return new r(aVar);
        }

        public final void d(Object obj, int i4, Object obj2) {
            v3.l.e(obj, "dispatcher");
            v3.l.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i4, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            v3.l.e(obj, "dispatcher");
            v3.l.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f8658a = new g();

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ l f8659a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ l f8660b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ u3.a f8661c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ u3.a f8662d;

            public a(l lVar, l lVar2, u3.a aVar, u3.a aVar2) {
                this.f8659a = lVar;
                this.f8660b = lVar2;
                this.f8661c = aVar;
                this.f8662d = aVar2;
            }

            public void onBackCancelled() {
                this.f8662d.c();
            }

            public void onBackInvoked() {
                this.f8661c.c();
            }

            public void onBackProgressed(BackEvent backEvent) {
                v3.l.e(backEvent, "backEvent");
                this.f8660b.i(new C0566b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                v3.l.e(backEvent, "backEvent");
                this.f8659a.i(new C0566b(backEvent));
            }
        }

        public final OnBackInvokedCallback a(l lVar, l lVar2, u3.a aVar, u3.a aVar2) {
            v3.l.e(lVar, "onBackStarted");
            v3.l.e(lVar2, "onBackProgressed");
            v3.l.e(aVar, "onBackInvoked");
            v3.l.e(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    public final class h implements C0382i, C0567c {

        /* renamed from: c  reason: collision with root package name */
        public final C0380g f8663c;

        /* renamed from: d  reason: collision with root package name */
        public final p f8664d;

        /* renamed from: e  reason: collision with root package name */
        public C0567c f8665e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q f8666f;

        public h(q qVar, C0380g gVar, p pVar) {
            v3.l.e(gVar, "lifecycle");
            v3.l.e(pVar, "onBackPressedCallback");
            this.f8666f = qVar;
            this.f8663c = gVar;
            this.f8664d = pVar;
            gVar.a(this);
        }

        public void cancel() {
            this.f8663c.c(this);
            this.f8664d.i(this);
            C0567c cVar = this.f8665e;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f8665e = null;
        }

        public void d(C0384k kVar, C0380g.a aVar) {
            v3.l.e(kVar, "source");
            v3.l.e(aVar, "event");
            if (aVar == C0380g.a.ON_START) {
                this.f8665e = this.f8666f.i(this.f8664d);
            } else if (aVar == C0380g.a.ON_STOP) {
                C0567c cVar = this.f8665e;
                if (cVar != null) {
                    cVar.cancel();
                }
            } else if (aVar == C0380g.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    public final class i implements C0567c {

        /* renamed from: c  reason: collision with root package name */
        public final p f8667c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ q f8668d;

        public i(q qVar, p pVar) {
            v3.l.e(pVar, "onBackPressedCallback");
            this.f8668d = qVar;
            this.f8667c = pVar;
        }

        public void cancel() {
            this.f8668d.f8646c.remove(this.f8667c);
            if (v3.l.a(this.f8668d.f8647d, this.f8667c)) {
                this.f8667c.c();
                this.f8668d.f8647d = null;
            }
            this.f8667c.i(this);
            u3.a b4 = this.f8667c.b();
            if (b4 != null) {
                b4.c();
            }
            this.f8667c.k((u3.a) null);
        }
    }

    public /* synthetic */ class j extends v3.j implements u3.a {
        public j(Object obj) {
            super(0, obj, q.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public /* bridge */ /* synthetic */ Object c() {
            o();
            return C0673n.f9639a;
        }

        public final void o() {
            ((q) this.f12446f).p();
        }
    }

    public /* synthetic */ class k extends v3.j implements u3.a {
        public k(Object obj) {
            super(0, obj, q.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public /* bridge */ /* synthetic */ Object c() {
            o();
            return C0673n.f9639a;
        }

        public final void o() {
            ((q) this.f12446f).p();
        }
    }

    public q(Runnable runnable, R.a aVar) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f8644a = runnable;
        this.f8645b = aVar;
        this.f8646c = new C0731h();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            if (i4 >= 34) {
                onBackInvokedCallback = g.f8658a.a(new a(this), new b(this), new c(this), new d(this));
            } else {
                onBackInvokedCallback = f.f8657a.b(new e(this));
            }
            this.f8648e = onBackInvokedCallback;
        }
    }

    public final void h(C0384k kVar, p pVar) {
        v3.l.e(kVar, "owner");
        v3.l.e(pVar, "onBackPressedCallback");
        C0380g b4 = kVar.b();
        if (b4.b() != C0380g.b.DESTROYED) {
            pVar.a(new h(this, b4, pVar));
            p();
            pVar.k(new j(this));
        }
    }

    public final C0567c i(p pVar) {
        v3.l.e(pVar, "onBackPressedCallback");
        this.f8646c.add(pVar);
        i iVar = new i(this, pVar);
        pVar.a(iVar);
        p();
        pVar.k(new k(this));
        return iVar;
    }

    public final void j() {
        Object obj;
        p pVar = this.f8647d;
        if (pVar == null) {
            C0731h hVar = this.f8646c;
            ListIterator listIterator = hVar.listIterator(hVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((p) obj).g()) {
                    break;
                }
            }
            pVar = (p) obj;
        }
        this.f8647d = null;
        if (pVar != null) {
            pVar.c();
        }
    }

    public final void k() {
        Object obj;
        p pVar = this.f8647d;
        if (pVar == null) {
            C0731h hVar = this.f8646c;
            ListIterator listIterator = hVar.listIterator(hVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((p) obj).g()) {
                    break;
                }
            }
            pVar = (p) obj;
        }
        this.f8647d = null;
        if (pVar != null) {
            pVar.d();
            return;
        }
        Runnable runnable = this.f8644a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: d.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: d.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: d.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: d.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(d.C0566b r4) {
        /*
            r3 = this;
            d.p r0 = r3.f8647d
            if (r0 != 0) goto L_0x0026
            i3.h r0 = r3.f8646c
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L_0x000e:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.previous()
            r2 = r1
            d.p r2 = (d.p) r2
            boolean r2 = r2.g()
            if (r2 == 0) goto L_0x000e
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            r0 = r1
            d.p r0 = (d.p) r0
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            r0.e(r4)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.q.l(d.b):void");
    }

    public final void m(C0566b bVar) {
        Object obj;
        C0731h hVar = this.f8646c;
        ListIterator listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((p) obj).g()) {
                break;
            }
        }
        p pVar = (p) obj;
        this.f8647d = pVar;
        if (pVar != null) {
            pVar.f(bVar);
        }
    }

    public final void n(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        v3.l.e(onBackInvokedDispatcher, "invoker");
        this.f8649f = onBackInvokedDispatcher;
        o(this.f8651h);
    }

    public final void o(boolean z4) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f8649f;
        OnBackInvokedCallback onBackInvokedCallback = this.f8648e;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z4 && !this.f8650g) {
                f.f8657a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f8650g = true;
            } else if (!z4 && this.f8650g) {
                f.f8657a.e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f8650g = false;
            }
        }
    }

    public final void p() {
        boolean z4 = this.f8651h;
        C0731h hVar = this.f8646c;
        boolean z5 = false;
        if (hVar == null || !hVar.isEmpty()) {
            Iterator it = hVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((p) it.next()).g()) {
                        z5 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f8651h = z5;
        if (z5 != z4) {
            R.a aVar = this.f8645b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z5));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                o(z5);
            }
        }
    }

    public q(Runnable runnable) {
        this(runnable, (R.a) null);
    }
}
