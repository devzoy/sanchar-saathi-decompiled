package g;

import android.content.Context;
import android.content.Intent;
import v3.l;

/* renamed from: g.a  reason: case insensitive filesystem */
public abstract class C0631a {

    /* renamed from: g.a$a  reason: collision with other inner class name */
    public static final class C0163a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f9043a;

        public C0163a(Object obj) {
            this.f9043a = obj;
        }

        public final Object a() {
            return this.f9043a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0163a b(Context context, Object obj) {
        l.e(context, "context");
        return null;
    }

    public abstract Object c(int i4, Intent intent);
}
