package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public class a {

    /* renamed from: e  reason: collision with root package name */
    public static a f8060e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f8061a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f8062b = new Handler(Looper.getMainLooper(), new C0131a());

    /* renamed from: c  reason: collision with root package name */
    public c f8063c;

    /* renamed from: d  reason: collision with root package name */
    public c f8064d;

    /* renamed from: com.google.android.material.snackbar.a$a  reason: collision with other inner class name */
    public class C0131a implements Handler.Callback {
        public C0131a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    public interface b {
        void a();

        void b(int i4);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f8066a;

        /* renamed from: b  reason: collision with root package name */
        public int f8067b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8068c;

        public c(int i4, b bVar) {
            this.f8066a = new WeakReference(bVar);
            this.f8067b = i4;
        }

        public boolean a(b bVar) {
            return bVar != null && this.f8066a.get() == bVar;
        }
    }

    public static a c() {
        if (f8060e == null) {
            f8060e = new a();
        }
        return f8060e;
    }

    public final boolean a(c cVar, int i4) {
        b bVar = (b) cVar.f8066a.get();
        if (bVar == null) {
            return false;
        }
        this.f8062b.removeCallbacksAndMessages(cVar);
        bVar.b(i4);
        return true;
    }

    public void b(b bVar, int i4) {
        synchronized (this.f8061a) {
            try {
                if (f(bVar)) {
                    a(this.f8063c, i4);
                } else if (g(bVar)) {
                    a(this.f8064d, i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(c cVar) {
        synchronized (this.f8061a) {
            try {
                if (this.f8063c != cVar) {
                    if (this.f8064d == cVar) {
                    }
                }
                a(cVar, 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z4;
        synchronized (this.f8061a) {
            try {
                if (!f(bVar)) {
                    if (!g(bVar)) {
                        z4 = false;
                    }
                }
                z4 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    public final boolean f(b bVar) {
        c cVar = this.f8063c;
        return cVar != null && cVar.a(bVar);
    }

    public final boolean g(b bVar) {
        c cVar = this.f8064d;
        return cVar != null && cVar.a(bVar);
    }

    public void h(b bVar) {
        synchronized (this.f8061a) {
            try {
                if (f(bVar)) {
                    this.f8063c = null;
                    if (this.f8064d != null) {
                        n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f8061a) {
            try {
                if (f(bVar)) {
                    l(this.f8063c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f8061a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f8063c;
                    if (!cVar.f8068c) {
                        cVar.f8068c = true;
                        this.f8062b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f8061a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f8063c;
                    if (cVar.f8068c) {
                        cVar.f8068c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(c cVar) {
        int i4 = cVar.f8067b;
        if (i4 != -2) {
            if (i4 <= 0) {
                i4 = i4 == -1 ? 1500 : 2750;
            }
            this.f8062b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f8062b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i4);
        }
    }

    public void m(int i4, b bVar) {
        synchronized (this.f8061a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f8063c;
                    cVar.f8067b = i4;
                    this.f8062b.removeCallbacksAndMessages(cVar);
                    l(this.f8063c);
                    return;
                }
                if (g(bVar)) {
                    this.f8064d.f8067b = i4;
                } else {
                    this.f8064d = new c(i4, bVar);
                }
                c cVar2 = this.f8063c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f8063c = null;
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        c cVar = this.f8064d;
        if (cVar != null) {
            this.f8063c = cVar;
            this.f8064d = null;
            b bVar = (b) cVar.f8066a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.f8063c = null;
            }
        }
    }
}
