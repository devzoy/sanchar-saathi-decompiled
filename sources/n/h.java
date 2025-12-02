package n;

import S.K;
import S.L;
import S.M;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f11215a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public long f11216b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f11217c;

    /* renamed from: d  reason: collision with root package name */
    public L f11218d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11219e;

    /* renamed from: f  reason: collision with root package name */
    public final M f11220f = new a();

    public class a extends M {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11221a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f11222b = 0;

        public a() {
        }

        public void b(View view) {
            int i4 = this.f11222b + 1;
            this.f11222b = i4;
            if (i4 == h.this.f11215a.size()) {
                L l4 = h.this.f11218d;
                if (l4 != null) {
                    l4.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.f11221a) {
                this.f11221a = true;
                L l4 = h.this.f11218d;
                if (l4 != null) {
                    l4.c((View) null);
                }
            }
        }

        public void d() {
            this.f11222b = 0;
            this.f11221a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f11219e) {
            Iterator it = this.f11215a.iterator();
            while (it.hasNext()) {
                ((K) it.next()).c();
            }
            this.f11219e = false;
        }
    }

    public void b() {
        this.f11219e = false;
    }

    public h c(K k4) {
        if (!this.f11219e) {
            this.f11215a.add(k4);
        }
        return this;
    }

    public h d(K k4, K k5) {
        this.f11215a.add(k4);
        k5.j(k4.d());
        this.f11215a.add(k5);
        return this;
    }

    public h e(long j4) {
        if (!this.f11219e) {
            this.f11216b = j4;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f11219e) {
            this.f11217c = interpolator;
        }
        return this;
    }

    public h g(L l4) {
        if (!this.f11219e) {
            this.f11218d = l4;
        }
        return this;
    }

    public void h() {
        if (!this.f11219e) {
            Iterator it = this.f11215a.iterator();
            while (it.hasNext()) {
                K k4 = (K) it.next();
                long j4 = this.f11216b;
                if (j4 >= 0) {
                    k4.f(j4);
                }
                Interpolator interpolator = this.f11217c;
                if (interpolator != null) {
                    k4.g(interpolator);
                }
                if (this.f11218d != null) {
                    k4.h(this.f11220f);
                }
                k4.l();
            }
            this.f11219e = true;
        }
    }
}
