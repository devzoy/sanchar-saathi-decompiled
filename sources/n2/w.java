package N2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.Window;
import android.view.WindowInsets;
import g3.C0644h;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.util.Collections;
import java.util.List;

public class w {
    public List a(Context context) {
        WindowInsets b4 = b(context);
        return b4 == null ? Collections.emptyList() : b4.getBoundingRects(WindowInsets.Type.captionBar());
    }

    public WindowInsets b(Context context) {
        Window window;
        Activity e4 = C0644h.e(context);
        if (e4 == null || (window = e4.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().getRootWindowInsets();
    }

    public void c(Context context, FlutterRenderer.h hVar) {
        List<Rect> a4 = a(context);
        int i4 = hVar.f10394d;
        for (Rect rect : a4) {
            i4 = Math.max(i4, rect.bottom);
        }
        hVar.f10394d = i4;
    }
}
