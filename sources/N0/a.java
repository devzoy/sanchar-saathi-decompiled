package N0;

import H0.h;
import H0.j;
import K0.c;
import K0.d;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import i3.C0738o;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v3.g;
import v3.l;
import v3.m;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0040a f1839b = new C0040a((g) null);

    /* renamed from: c  reason: collision with root package name */
    public static final String f1840c = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final j f1841a;

    /* renamed from: N0.a$a  reason: collision with other inner class name */
    public static final class C0040a {
        public /* synthetic */ C0040a(g gVar) {
            this();
        }

        public final int a(SidecarDeviceState sidecarDeviceState) {
            l.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", (Class[]) null).invoke(sidecarDeviceState, (Object[]) null);
                    l.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) invoke).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            l.e(sidecarDeviceState, "sidecarDeviceState");
            int a4 = a(sidecarDeviceState);
            if (a4 < 0 || a4 > 4) {
                return 0;
            }
            return a4;
        }

        public final List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            l.e(sidecarWindowLayoutInfo, "info");
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? C0738o.h() : list;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", (Class[]) null).invoke(sidecarWindowLayoutInfo, (Object[]) null);
                    l.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                    return (List) invoke;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return C0738o.h();
                }
            }
        }

        public final void d(SidecarDeviceState sidecarDeviceState, int i4) {
            l.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                sidecarDeviceState.posture = i4;
            } catch (NoSuchFieldError unused) {
                try {
                    SidecarDeviceState.class.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{Integer.valueOf(i4)});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
            }
        }

        public C0040a() {
        }
    }

    public static final class b extends m implements u3.l {

        /* renamed from: f  reason: collision with root package name */
        public static final b f1842f = new b();

        public b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
            l.e(sidecarDisplayFeature, "$this$require");
            boolean z4 = true;
            if (!(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2)) {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    public static final class c extends m implements u3.l {

        /* renamed from: f  reason: collision with root package name */
        public static final c f1843f = new c();

        public c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
            l.e(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    public static final class d extends m implements u3.l {

        /* renamed from: f  reason: collision with root package name */
        public static final d f1844f = new d();

        public d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
            l.e(sidecarDisplayFeature, "$this$require");
            boolean z4 = true;
            if (!(sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0)) {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    public static final class e extends m implements u3.l {

        /* renamed from: f  reason: collision with root package name */
        public static final e f1845f = new e();

        public e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
            l.e(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    public a(j jVar) {
        l.e(jVar, "verificationMode");
        this.f1841a = jVar;
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (l.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        C0040a aVar = f1839b;
        return aVar.b(sidecarDeviceState) == aVar.b(sidecarDeviceState2);
    }

    public final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (l.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return l.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!b((SidecarDisplayFeature) list.get(i4), (SidecarDisplayFeature) list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (l.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        C0040a aVar = f1839b;
        return c(aVar.c(sidecarWindowLayoutInfo), aVar.c(sidecarWindowLayoutInfo2));
    }

    public final K0.j e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        l.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new K0.j(C0738o.h());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C0040a aVar = f1839b;
        aVar.d(sidecarDeviceState2, aVar.b(sidecarDeviceState));
        return new K0.j(f(aVar.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final List f(List list, SidecarDeviceState sidecarDeviceState) {
        l.e(list, "sidecarDisplayFeatures");
        l.e(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            K0.a g4 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g4 != null) {
                arrayList.add(g4);
            }
        }
        return arrayList;
    }

    public final K0.a g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        d.b bVar;
        c.b bVar2;
        l.e(sidecarDisplayFeature, "feature");
        l.e(sidecarDeviceState, "deviceState");
        h.a aVar = h.f1380a;
        String str = f1840c;
        l.d(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) h.a.b(aVar, sidecarDisplayFeature, str, this.f1841a, (H0.g) null, 4, (Object) null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f1842f).c("Feature bounds must not be 0", c.f1843f).c("TYPE_FOLD must have 0 area", d.f1844f).c("Feature be pinned to either left or top", e.f1845f).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            bVar = d.b.f1643b.a();
        } else if (type != 2) {
            return null;
        } else {
            bVar = d.b.f1643b.b();
        }
        int b4 = f1839b.b(sidecarDeviceState);
        if (b4 == 0 || b4 == 1) {
            return null;
        }
        if (b4 == 2) {
            bVar2 = c.b.f1637d;
        } else if (b4 == 3) {
            bVar2 = c.b.f1636c;
        } else if (b4 == 4) {
            return null;
        } else {
            bVar2 = c.b.f1636c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        l.d(rect, "feature.rect");
        return new K0.d(new H0.b(rect), bVar, bVar2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(j jVar, int i4, g gVar) {
        this((i4 & 1) != 0 ? j.QUIET : jVar);
    }
}
