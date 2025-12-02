package androidx.recyclerview.widget;

import android.view.View;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public final b f6028a;

    /* renamed from: b  reason: collision with root package name */
    public a f6029b = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f6030a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f6031b;

        /* renamed from: c  reason: collision with root package name */
        public int f6032c;

        /* renamed from: d  reason: collision with root package name */
        public int f6033d;

        /* renamed from: e  reason: collision with root package name */
        public int f6034e;

        public void a(int i4) {
            this.f6030a = i4 | this.f6030a;
        }

        public boolean b() {
            int i4 = this.f6030a;
            if ((i4 & 7) != 0 && (i4 & c(this.f6033d, this.f6031b)) == 0) {
                return false;
            }
            int i5 = this.f6030a;
            if ((i5 & 112) != 0 && (i5 & (c(this.f6033d, this.f6032c) << 4)) == 0) {
                return false;
            }
            int i6 = this.f6030a;
            if ((i6 & 1792) != 0 && (i6 & (c(this.f6034e, this.f6031b) << 8)) == 0) {
                return false;
            }
            int i7 = this.f6030a;
            return (i7 & 28672) == 0 || (i7 & (c(this.f6034e, this.f6032c) << 12)) != 0;
        }

        public int c(int i4, int i5) {
            if (i4 > i5) {
                return 1;
            }
            return i4 == i5 ? 2 : 4;
        }

        public void d() {
            this.f6030a = 0;
        }

        public void e(int i4, int i5, int i6, int i7) {
            this.f6031b = i4;
            this.f6032c = i5;
            this.f6033d = i6;
            this.f6034e = i7;
        }
    }

    public interface b {
        View a(int i4);

        int b();

        int c(View view);

        int d();

        int e(View view);
    }

    public o(b bVar) {
        this.f6028a = bVar;
    }

    public View a(int i4, int i5, int i6, int i7) {
        int d4 = this.f6028a.d();
        int b4 = this.f6028a.b();
        int i8 = i5 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i5) {
            View a4 = this.f6028a.a(i4);
            this.f6029b.e(d4, b4, this.f6028a.c(a4), this.f6028a.e(a4));
            if (i6 != 0) {
                this.f6029b.d();
                this.f6029b.a(i6);
                if (this.f6029b.b()) {
                    return a4;
                }
            }
            if (i7 != 0) {
                this.f6029b.d();
                this.f6029b.a(i7);
                if (this.f6029b.b()) {
                    view = a4;
                }
            }
            i4 += i8;
        }
        return view;
    }

    public boolean b(View view, int i4) {
        this.f6029b.e(this.f6028a.d(), this.f6028a.b(), this.f6028a.c(view), this.f6028a.e(view));
        if (i4 == 0) {
            return false;
        }
        this.f6029b.d();
        this.f6029b.a(i4);
        return this.f6029b.b();
    }
}
