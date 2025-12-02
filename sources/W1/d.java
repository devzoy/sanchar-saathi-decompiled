package W1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public long f3403a;

    /* renamed from: b  reason: collision with root package name */
    public long f3404b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f3405c;

    /* renamed from: d  reason: collision with root package name */
    public int f3406d;

    /* renamed from: e  reason: collision with root package name */
    public int f3407e;

    public d(long j4, long j5) {
        this.f3405c = null;
        this.f3406d = 0;
        this.f3407e = 1;
        this.f3403a = j4;
        this.f3404b = j5;
    }

    public static d a(ValueAnimator valueAnimator) {
        d dVar = new d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        dVar.f3406d = valueAnimator.getRepeatCount();
        dVar.f3407e = valueAnimator.getRepeatMode();
        return dVar;
    }

    public static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f3397b : interpolator instanceof AccelerateInterpolator ? a.f3398c : interpolator instanceof DecelerateInterpolator ? a.f3399d : interpolator;
    }

    public long b() {
        return this.f3403a;
    }

    public long c() {
        return this.f3404b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f3405c;
        return timeInterpolator != null ? timeInterpolator : a.f3397b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (b() == dVar.b() && c() == dVar.c() && f() == dVar.f() && g() == dVar.g()) {
            return d().getClass().equals(dVar.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f3406d;
    }

    public int g() {
        return this.f3407e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public d(long j4, long j5, TimeInterpolator timeInterpolator) {
        this.f3406d = 0;
        this.f3407e = 1;
        this.f3403a = j4;
        this.f3404b = j5;
        this.f3405c = timeInterpolator;
    }
}
