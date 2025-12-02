package u;

import android.os.Bundle;

/* renamed from: u.a  reason: case insensitive filesystem */
public final class C0934a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f12080a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f12081b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f12082c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f12083d;

    /* renamed from: u.a$a  reason: collision with other inner class name */
    public static final class C0196a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f12084a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f12085b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f12086c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f12087d;

        public C0934a a() {
            return new C0934a(this.f12084a, this.f12085b, this.f12086c, this.f12087d);
        }
    }

    public C0934a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f12080a = num;
        this.f12081b = num2;
        this.f12082c = num3;
        this.f12083d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f12080a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f12081b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f12082c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f12083d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
