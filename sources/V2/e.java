package v2;

import android.app.PendingIntent;

public final class e extends b {

    /* renamed from: e  reason: collision with root package name */
    public final PendingIntent f12428e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12429f;

    public e(PendingIntent pendingIntent, boolean z4) {
        if (pendingIntent != null) {
            this.f12428e = pendingIntent;
            this.f12429f = z4;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final PendingIntent a() {
        return this.f12428e;
    }

    public final boolean c() {
        return this.f12429f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f12428e.equals(bVar.a()) && this.f12429f == bVar.c();
        }
    }

    public final int hashCode() {
        return ((this.f12428e.hashCode() ^ 1000003) * 1000003) ^ (true != this.f12429f ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f12428e.toString();
        return "ReviewInfo{pendingIntent=" + obj + ", isNoOp=" + this.f12429f + "}";
    }
}
