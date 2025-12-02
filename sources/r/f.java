package R;

import v3.l;

public class f extends e {

    /* renamed from: c  reason: collision with root package name */
    public final Object f2437c = new Object();

    public f(int i4) {
        super(i4);
    }

    public boolean a(Object obj) {
        boolean a4;
        l.e(obj, "instance");
        synchronized (this.f2437c) {
            a4 = super.a(obj);
        }
        return a4;
    }

    public Object b() {
        Object b4;
        synchronized (this.f2437c) {
            b4 = super.b();
        }
        return b4;
    }
}
