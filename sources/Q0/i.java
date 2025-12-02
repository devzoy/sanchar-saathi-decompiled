package Q0;

import android.util.Log;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f2378a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile i f2379b = null;

    /* renamed from: c  reason: collision with root package name */
    public static final int f2380c = 20;

    public static class a extends i {

        /* renamed from: d  reason: collision with root package name */
        public final int f2381d;

        public a(int i4) {
            super(i4);
            this.f2381d = i4;
        }

        public void a(String str, String str2) {
            if (this.f2381d <= 3) {
                Log.d(str, str2);
            }
        }

        public void b(String str, String str2, Throwable th) {
            if (this.f2381d <= 3) {
                Log.d(str, str2, th);
            }
        }

        public void c(String str, String str2) {
            if (this.f2381d <= 6) {
                Log.e(str, str2);
            }
        }

        public void d(String str, String str2, Throwable th) {
            if (this.f2381d <= 6) {
                Log.e(str, str2, th);
            }
        }

        public void f(String str, String str2) {
            if (this.f2381d <= 4) {
                Log.i(str, str2);
            }
        }

        public void g(String str, String str2, Throwable th) {
            if (this.f2381d <= 4) {
                Log.i(str, str2, th);
            }
        }

        public void j(String str, String str2) {
            if (this.f2381d <= 2) {
                Log.v(str, str2);
            }
        }

        public void k(String str, String str2) {
            if (this.f2381d <= 5) {
                Log.w(str, str2);
            }
        }

        public void l(String str, String str2, Throwable th) {
            if (this.f2381d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public i(int i4) {
    }

    public static i e() {
        i iVar;
        synchronized (f2378a) {
            try {
                if (f2379b == null) {
                    f2379b = new a(3);
                }
                iVar = f2379b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static void h(i iVar) {
        synchronized (f2378a) {
            f2379b = iVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i4 = f2380c;
        if (length >= i4) {
            sb.append(str.substring(0, i4));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}
