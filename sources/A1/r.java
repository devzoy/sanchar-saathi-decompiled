package a1;

import Q0.i;
import android.content.Context;
import androidx.work.a;
import v3.l;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3969a;

    static {
        String i4 = i.i("ProcessUtils");
        l.d(i4, "tagWithPrefix(\"ProcessUtils\")");
        f3969a = i4;
    }

    public static final String a(Context context) {
        return C0344a.f3952a.a();
    }

    public static final boolean b(Context context, a aVar) {
        l.e(context, "context");
        l.e(aVar, "configuration");
        String a4 = a(context);
        String c4 = aVar.c();
        return (c4 == null || c4.length() == 0) ? l.a(a4, context.getApplicationInfo().processName) : l.a(a4, aVar.c());
    }
}
