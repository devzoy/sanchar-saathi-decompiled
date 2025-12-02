package S;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import v.g;

public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f2696a;

    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Window f2697a;

        /* renamed from: b  reason: collision with root package name */
        public final C0333y f2698b;

        public a(Window window, C0333y yVar) {
            this.f2697a = window;
            this.f2698b = yVar;
        }

        public void c(int i4) {
            View decorView = this.f2697a.getDecorView();
            decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
        }

        public void d(int i4) {
            this.f2697a.addFlags(i4);
        }

        public void e(int i4) {
            View decorView = this.f2697a.getDecorView();
            decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
        }

        public void f(int i4) {
            this.f2697a.clearFlags(i4);
        }
    }

    public static class b extends a {
        public b(Window window, C0333y yVar) {
            super(window, yVar);
        }

        public void b(boolean z4) {
            if (z4) {
                f(67108864);
                d(Integer.MIN_VALUE);
                c(8192);
                return;
            }
            e(8192);
        }
    }

    public static class c extends b {
        public c(Window window, C0333y yVar) {
            super(window, yVar);
        }

        public void a(boolean z4) {
            if (z4) {
                f(134217728);
                d(Integer.MIN_VALUE);
                c(16);
                return;
            }
            e(16);
        }
    }

    public static class e {
        public abstract void a(boolean z4);

        public abstract void b(boolean z4);
    }

    public m0(Window window, View view) {
        C0333y yVar = new C0333y(view);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2696a = new d(window, this, yVar);
        } else {
            this.f2696a = new c(window, yVar);
        }
    }

    public void a(boolean z4) {
        this.f2696a.a(z4);
    }

    public void b(boolean z4) {
        this.f2696a.b(z4);
    }

    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final m0 f2699a;

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsetsController f2700b;

        /* renamed from: c  reason: collision with root package name */
        public final C0333y f2701c;

        /* renamed from: d  reason: collision with root package name */
        public final g f2702d;

        /* renamed from: e  reason: collision with root package name */
        public Window f2703e;

        public d(Window window, m0 m0Var, C0333y yVar) {
            this(window.getInsetsController(), m0Var, yVar);
            this.f2703e = window;
        }

        public void a(boolean z4) {
            if (z4) {
                if (this.f2703e != null) {
                    c(16);
                }
                this.f2700b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f2703e != null) {
                d(16);
            }
            this.f2700b.setSystemBarsAppearance(0, 16);
        }

        public void b(boolean z4) {
            if (z4) {
                if (this.f2703e != null) {
                    c(8192);
                }
                this.f2700b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f2703e != null) {
                d(8192);
            }
            this.f2700b.setSystemBarsAppearance(0, 8);
        }

        public void c(int i4) {
            View decorView = this.f2703e.getDecorView();
            decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
        }

        public void d(int i4) {
            View decorView = this.f2703e.getDecorView();
            decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, m0 m0Var, C0333y yVar) {
            this.f2702d = new g();
            this.f2700b = windowInsetsController;
            this.f2699a = m0Var;
            this.f2701c = yVar;
        }
    }
}
