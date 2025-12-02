package l2;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: l2.a  reason: case insensitive filesystem */
public final class C0778a implements C0780c {

    /* renamed from: a  reason: collision with root package name */
    public final float f10999a;

    public C0778a(float f4) {
        this.f10999a = f4;
    }

    public float a(RectF rectF) {
        return this.f10999a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0778a)) {
            return false;
        }
        return this.f10999a == ((C0778a) obj).f10999a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10999a)});
    }
}
