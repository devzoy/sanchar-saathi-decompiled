package g;

import android.content.Context;
import android.content.Intent;
import f.C0611a;
import v3.g;
import v3.l;

/* renamed from: g.c  reason: case insensitive filesystem */
public final class C0633c extends C0631a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9045a = new a((g) null);

    /* renamed from: g.c$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: d */
    public Intent a(Context context, Intent intent) {
        l.e(context, "context");
        l.e(intent, "input");
        return intent;
    }

    /* renamed from: e */
    public C0611a c(int i4, Intent intent) {
        return new C0611a(i4, intent);
    }
}
