package M0;

import H0.b;
import K0.c;
import K0.d;
import K0.j;
import K0.k;
import K0.m;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import v3.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f1795a = new f();

    public final c a(k kVar, FoldingFeature foldingFeature) {
        d.b bVar;
        c.b bVar2;
        l.e(kVar, "windowMetrics");
        l.e(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = d.b.f1643b.a();
        } else if (type != 2) {
            return null;
        } else {
            bVar = d.b.f1643b.b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = c.b.f1636c;
        } else if (state != 2) {
            return null;
        } else {
            bVar2 = c.b.f1637d;
        }
        Rect bounds = foldingFeature.getBounds();
        l.d(bounds, "oemFeature.bounds");
        if (!d(kVar, new b(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        l.d(bounds2, "oemFeature.bounds");
        return new d(new b(bounds2), bVar, bVar2);
    }

    public final j b(k kVar, WindowLayoutInfo windowLayoutInfo) {
        c cVar;
        l.e(kVar, "windowMetrics");
        l.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        l.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                f fVar = f1795a;
                l.d(foldingFeature, "feature");
                cVar = fVar.a(kVar, foldingFeature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new j(arrayList);
    }

    public final j c(Context context, WindowLayoutInfo windowLayoutInfo) {
        l.e(context, "context");
        l.e(windowLayoutInfo, "info");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            return b(m.f1677b.d(context), windowLayoutInfo);
        }
        if (i4 >= 29 && (context instanceof Activity)) {
            return b(m.f1677b.c((Activity) context), windowLayoutInfo);
        }
        throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
    }

    public final boolean d(k kVar, b bVar) {
        Rect a4 = kVar.a();
        if (bVar.e()) {
            return false;
        }
        if (bVar.d() != a4.width() && bVar.a() != a4.height()) {
            return false;
        }
        if (bVar.d() >= a4.width() || bVar.a() >= a4.height()) {
            return (bVar.d() == a4.width() && bVar.a() == a4.height()) ? false : true;
        }
        return false;
    }
}
