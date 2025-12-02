package z1;

import android.content.ComponentName;

public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public final String f12897a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12898b;

    /* renamed from: c  reason: collision with root package name */
    public final ComponentName f12899c = null;

    /* renamed from: d  reason: collision with root package name */
    public final int f12900d = 4225;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12901e;

    public Z(String str, String str2, int i4, boolean z4) {
        C1032o.d(str);
        this.f12897a = str;
        C1032o.d(str2);
        this.f12898b = str2;
        this.f12901e = z4;
    }

    public final String a() {
        return this.f12897a;
    }

    public final String b() {
        return this.f12898b;
    }

    public final ComponentName c() {
        return this.f12899c;
    }

    public final boolean d() {
        return this.f12901e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z4 = (Z) obj;
        return C1031n.a(this.f12897a, z4.f12897a) && C1031n.a(this.f12898b, z4.f12898b) && C1031n.a(this.f12899c, z4.f12899c) && this.f12901e == z4.f12901e;
    }

    public final int hashCode() {
        return C1031n.b(this.f12897a, this.f12898b, this.f12899c, 4225, Boolean.valueOf(this.f12901e));
    }

    public final String toString() {
        String str = this.f12897a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f12899c;
        C1032o.f(componentName);
        return componentName.flattenToString();
    }
}
