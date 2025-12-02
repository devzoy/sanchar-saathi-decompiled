package E1;

import android.content.Context;

public class d {

    /* renamed from: b  reason: collision with root package name */
    public static final d f883b = new d();

    /* renamed from: a  reason: collision with root package name */
    public c f884a = null;

    public static c a(Context context) {
        return f883b.b(context);
    }

    public final synchronized c b(Context context) {
        try {
            if (this.f884a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f884a = new c(context);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f884a;
    }
}
