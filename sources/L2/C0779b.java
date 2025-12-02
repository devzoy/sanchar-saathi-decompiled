package l2;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: l2.b  reason: case insensitive filesystem */
public final class C0779b implements C0780c {

    /* renamed from: a  reason: collision with root package name */
    public final C0780c f11000a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11001b;

    public C0779b(float f4, C0780c cVar) {
        while (cVar instanceof C0779b) {
            cVar = ((C0779b) cVar).f11000a;
            f4 += ((C0779b) cVar).f11001b;
        }
        this.f11000a = cVar;
        this.f11001b = f4;
    }

    public float a(RectF rectF) {
        return Math.max(0.0f, this.f11000a.a(rectF) + this.f11001b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0779b)) {
            return false;
        }
        C0779b bVar = (C0779b) obj;
        return this.f11000a.equals(bVar.f11000a) && this.f11001b == bVar.f11001b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11000a, Float.valueOf(this.f11001b)});
    }
}
