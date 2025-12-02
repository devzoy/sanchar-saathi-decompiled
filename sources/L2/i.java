package l2;

import android.graphics.RectF;
import java.util.Arrays;

public final class i implements C0780c {

    /* renamed from: a  reason: collision with root package name */
    public final float f11052a;

    public i(float f4) {
        this.f11052a = f4;
    }

    public float a(RectF rectF) {
        return this.f11052a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f11052a == ((i) obj).f11052a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11052a)});
    }
}
