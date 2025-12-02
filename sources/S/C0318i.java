package S;

import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: S.i  reason: case insensitive filesystem */
public abstract class C0318i {

    /* renamed from: S.i$a */
    public interface a {
        boolean f(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        return C.g(view, keyEvent);
    }

    public static boolean b(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return aVar.f(keyEvent);
    }
}
