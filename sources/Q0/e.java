package Q0;

import android.app.Notification;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f2374a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2375b;

    /* renamed from: c  reason: collision with root package name */
    public final Notification f2376c;

    public e(int i4, Notification notification, int i5) {
        this.f2374a = i4;
        this.f2376c = notification;
        this.f2375b = i5;
    }

    public int a() {
        return this.f2375b;
    }

    public Notification b() {
        return this.f2376c;
    }

    public int c() {
        return this.f2374a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f2374a == eVar.f2374a && this.f2375b == eVar.f2375b) {
            return this.f2376c.equals(eVar.f2376c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f2374a * 31) + this.f2375b) * 31) + this.f2376c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f2374a + ", mForegroundServiceType=" + this.f2375b + ", mNotification=" + this.f2376c + '}';
    }
}
