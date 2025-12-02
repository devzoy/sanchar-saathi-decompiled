package G;

import android.content.res.Configuration;
import v3.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1094a;

    /* renamed from: b  reason: collision with root package name */
    public Configuration f1095b;

    public f(boolean z4) {
        this.f1094a = z4;
    }

    public final boolean a() {
        return this.f1094a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(boolean z4, Configuration configuration) {
        this(z4);
        l.e(configuration, "newConfig");
        this.f1095b = configuration;
    }
}
