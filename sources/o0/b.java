package O0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.inputmethodservice.InputMethodService;
import v3.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2025a = new b();

    public final Context a(Context context) {
        l.e(context, "context");
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                return context2;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                return context2;
            }
            context2 = contextWrapper.getBaseContext();
            l.d(context2, "iterator.baseContext");
        }
        throw new IllegalArgumentException("Context " + context + " is not a UiContext");
    }
}
