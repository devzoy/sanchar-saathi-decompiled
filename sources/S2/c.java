package s2;

import com.google.android.play.core.install.InstallState;

public final class c extends InstallState {

    /* renamed from: a  reason: collision with root package name */
    public final int f12023a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12024b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12025c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12026d;

    /* renamed from: e  reason: collision with root package name */
    public final String f12027e;

    public c(int i4, long j4, long j5, int i5, String str) {
        this.f12023a = i4;
        this.f12024b = j4;
        this.f12025c = j5;
        this.f12026d = i5;
        if (str != null) {
            this.f12027e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final long a() {
        return this.f12024b;
    }

    public final int b() {
        return this.f12026d;
    }

    public final int c() {
        return this.f12023a;
    }

    public final String d() {
        return this.f12027e;
    }

    public final long e() {
        return this.f12025c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f12023a == installState.c() && this.f12024b == installState.a() && this.f12025c == installState.e() && this.f12026d == installState.b() && this.f12027e.equals(installState.d());
        }
    }

    public final int hashCode() {
        long j4 = this.f12024b;
        long j5 = this.f12025c;
        return ((((((((this.f12023a ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f12026d) * 1000003) ^ this.f12027e.hashCode();
    }

    public final String toString() {
        int i4 = this.f12023a;
        long j4 = this.f12024b;
        long j5 = this.f12025c;
        int i5 = this.f12026d;
        String str = this.f12027e;
        return "InstallState{installStatus=" + i4 + ", bytesDownloaded=" + j4 + ", totalBytesToDownload=" + j5 + ", installErrorCode=" + i5 + ", packageName=" + str + "}";
    }
}
