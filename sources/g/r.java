package G;

import android.content.res.Configuration;
import v3.l;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1244a;

    /* renamed from: b  reason: collision with root package name */
    public Configuration f1245b;

    public r(boolean z4) {
        this.f1244a = z4;
    }

    public final boolean a() {
        return this.f1244a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r(boolean z4, Configuration configuration) {
        this(z4);
        l.e(configuration, "newConfig");
        this.f1245b = configuration;
    }
}
