package U1;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f2952a = Math.round(30000.0d);

    /* renamed from: b  reason: collision with root package name */
    public final Object f2953b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public long f2954c = Long.MIN_VALUE;

    public b(double d4) {
    }

    public final boolean a() {
        synchronized (this.f2953b) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f2954c + this.f2952a > currentTimeMillis) {
                    return false;
                }
                this.f2954c = currentTimeMillis;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
