package Q0;

import R0.E;
import android.content.Context;
import java.util.Collections;
import java.util.List;

public abstract class t {

    public enum a {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    public static t d(Context context) {
        return E.l(context);
    }

    public static void e(Context context, androidx.work.a aVar) {
        E.e(context, aVar);
    }

    public final l a(u uVar) {
        return b(Collections.singletonList(uVar));
    }

    public abstract l b(List list);

    public abstract l c(String str, c cVar, n nVar);
}
