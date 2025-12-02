package androidx.window.layout.adapter.sidecar;

import H0.k;
import K0.j;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import h3.C0673n;
import i3.C0738o;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import v3.g;
import v3.l;

public final class SidecarCompat implements a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f6057f = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final SidecarInterface f6058a;

    /* renamed from: b  reason: collision with root package name */
    public final N0.a f6059b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f6060c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f6061d;

    /* renamed from: e  reason: collision with root package name */
    public b f6062e;

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface h4;
            l.e(sidecarDeviceState, "newDeviceState");
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : SidecarCompat.this.f6060c.values()) {
                IBinder a4 = SidecarCompat.f6057f.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (!(a4 == null || (h4 = sidecarCompat.h()) == null)) {
                    sidecarWindowLayoutInfo = h4.getWindowLayoutInfo(a4);
                }
                b e4 = sidecarCompat.f6062e;
                if (e4 != null) {
                    e4.a(activity, sidecarCompat.f6059b.e(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            l.e(iBinder, "windowToken");
            l.e(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.f6060c.get(iBinder);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            N0.a f4 = SidecarCompat.this.f6059b;
            SidecarInterface h4 = SidecarCompat.this.h();
            if (h4 == null || (sidecarDeviceState = h4.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            j e4 = f4.e(sidecarWindowLayoutInfo, sidecarDeviceState);
            b e5 = SidecarCompat.this.f6062e;
            if (e5 != null) {
                e5.a(activity, e4);
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            l.e(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final k c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (!TextUtils.isEmpty(apiVersion)) {
                    return k.f1389j.b(apiVersion);
                }
                return null;
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    public static final class b implements a.C0102a {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0102a f6064a;

        /* renamed from: b  reason: collision with root package name */
        public final ReentrantLock f6065b = new ReentrantLock();

        /* renamed from: c  reason: collision with root package name */
        public final WeakHashMap f6066c = new WeakHashMap();

        public b(a.C0102a aVar) {
            l.e(aVar, "callbackInterface");
            this.f6064a = aVar;
        }

        public void a(Activity activity, j jVar) {
            l.e(activity, "activity");
            l.e(jVar, "newLayout");
            ReentrantLock reentrantLock = this.f6065b;
            reentrantLock.lock();
            try {
                if (!l.a(jVar, (j) this.f6066c.get(activity))) {
                    j jVar2 = (j) this.f6066c.put(activity, jVar);
                    reentrantLock.unlock();
                    this.f6064a.a(activity, jVar);
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(Activity activity) {
            l.e(activity, "activity");
            ReentrantLock reentrantLock = this.f6065b;
            reentrantLock.lock();
            try {
                this.f6066c.put(activity, (Object) null);
                C0673n nVar = C0673n.f9639a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: c  reason: collision with root package name */
        public final SidecarCompat f6067c;

        /* renamed from: d  reason: collision with root package name */
        public final WeakReference f6068d;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            l.e(sidecarCompat, "sidecarCompat");
            l.e(activity, "activity");
            this.f6067c = sidecarCompat;
            this.f6068d = new WeakReference(activity);
        }

        public void onViewAttachedToWindow(View view) {
            l.e(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f6068d.get();
            IBinder a4 = SidecarCompat.f6057f.a(activity);
            if (activity != null && a4 != null) {
                this.f6067c.j(a4, activity);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            l.e(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, N0.a aVar) {
        l.e(aVar, "sidecarAdapter");
        this.f6058a = sidecarInterface;
        this.f6059b = aVar;
        this.f6060c = new LinkedHashMap();
        this.f6061d = new LinkedHashMap();
    }

    public static final void l(SidecarCompat sidecarCompat, Activity activity, Configuration configuration) {
        l.e(sidecarCompat, "this$0");
        l.e(activity, "$activity");
        b bVar = sidecarCompat.f6062e;
        if (bVar != null) {
            bVar.a(activity, sidecarCompat.i(activity));
        }
    }

    public void a(a.C0102a aVar) {
        l.e(aVar, "extensionCallback");
        this.f6062e = new b(aVar);
        SidecarInterface sidecarInterface = this.f6058a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f6059b, new TranslatingCallback()));
        }
    }

    public void b(Activity activity) {
        l.e(activity, "activity");
        IBinder a4 = f6057f.a(activity);
        if (a4 != null) {
            j(a4, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
    }

    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        l.e(activity, "activity");
        IBinder a4 = f6057f.a(activity);
        if (a4 != null) {
            SidecarInterface sidecarInterface2 = this.f6058a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(a4);
            }
            m(activity);
            b bVar = this.f6062e;
            if (bVar != null) {
                bVar.b(activity);
            }
            boolean z4 = this.f6060c.size() == 1;
            this.f6060c.remove(a4);
            if (z4 && (sidecarInterface = this.f6058a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    public final SidecarInterface h() {
        return this.f6058a;
    }

    public final j i(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        l.e(activity, "activity");
        IBinder a4 = f6057f.a(activity);
        if (a4 == null) {
            return new j(C0738o.h());
        }
        SidecarInterface sidecarInterface = this.f6058a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a4) : null;
        N0.a aVar = this.f6059b;
        SidecarInterface sidecarInterface2 = this.f6058a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return aVar.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void j(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        l.e(iBinder, "windowToken");
        l.e(activity, "activity");
        this.f6060c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f6058a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f6060c.size() == 1 && (sidecarInterface = this.f6058a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f6062e;
        if (bVar != null) {
            bVar.a(activity, i(activity));
        }
        k(activity);
    }

    public final void k(Activity activity) {
        if (this.f6061d.get(activity) == null && (activity instanceof H.c)) {
            N0.b bVar = new N0.b(this, activity);
            this.f6061d.put(activity, bVar);
            ((H.c) activity).h(bVar);
        }
    }

    public final void m(Activity activity) {
        R.a aVar = (R.a) this.f6061d.get(activity);
        if (aVar != null) {
            if (activity instanceof H.c) {
                ((H.c) activity).s(aVar);
            }
            this.f6061d.remove(activity);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r0 = r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0103 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052 A[Catch:{ NoSuchFieldError -> 0x00b1, all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0057 A[Catch:{ NoSuchFieldError -> 0x00b1, all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060 A[Catch:{ NoSuchFieldError -> 0x00b1, all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0139 A[Catch:{ NoSuchFieldError -> 0x00b1, all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013a A[Catch:{ NoSuchFieldError -> 0x00b1, all -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0178 A[Catch:{ NoSuchFieldError -> 0x00b1, all -> 0x01a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean n() {
        /*
            r7 = this;
            androidx.window.sidecar.SidecarInterface r0 = r7.f6058a     // Catch:{ all -> 0x01a6 }
            r1 = 0
            if (r0 == 0) goto L_0x0018
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0018
            java.lang.String r2 = "setSidecarCallback"
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r3 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ all -> 0x01a6 }
            java.lang.reflect.Method r0 = r0.getMethod(r2, r3)     // Catch:{ all -> 0x01a6 }
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            if (r0 == 0) goto L_0x0020
            java.lang.Class r0 = r0.getReturnType()     // Catch:{ all -> 0x01a6 }
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.lang.Class r2 = java.lang.Void.TYPE     // Catch:{ all -> 0x01a6 }
            boolean r3 = v3.l.a(r0, r2)     // Catch:{ all -> 0x01a6 }
            if (r3 == 0) goto L_0x018f
            androidx.window.sidecar.SidecarInterface r0 = r7.f6058a     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0030
            r0.getDeviceState()     // Catch:{ all -> 0x01a6 }
        L_0x0030:
            androidx.window.sidecar.SidecarInterface r0 = r7.f6058a     // Catch:{ all -> 0x01a6 }
            r3 = 1
            if (r0 == 0) goto L_0x0038
            r0.onDeviceStateListenersChanged(r3)     // Catch:{ all -> 0x01a6 }
        L_0x0038:
            androidx.window.sidecar.SidecarInterface r0 = r7.f6058a     // Catch:{ all -> 0x01a6 }
            java.lang.Class<android.os.IBinder> r4 = android.os.IBinder.class
            if (r0 == 0) goto L_0x004f
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r5 = "getWindowLayoutInfo"
            java.lang.Class[] r6 = new java.lang.Class[]{r4}     // Catch:{ all -> 0x01a6 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ all -> 0x01a6 }
            goto L_0x0050
        L_0x004f:
            r0 = r1
        L_0x0050:
            if (r0 == 0) goto L_0x0057
            java.lang.Class r0 = r0.getReturnType()     // Catch:{ all -> 0x01a6 }
            goto L_0x0058
        L_0x0057:
            r0 = r1
        L_0x0058:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r5 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r5 = v3.l.a(r0, r5)     // Catch:{ all -> 0x01a6 }
            if (r5 == 0) goto L_0x0178
            androidx.window.sidecar.SidecarInterface r0 = r7.f6058a     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0075
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0075
            java.lang.String r5 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r6 = new java.lang.Class[]{r4}     // Catch:{ all -> 0x01a6 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ all -> 0x01a6 }
            goto L_0x0076
        L_0x0075:
            r0 = r1
        L_0x0076:
            if (r0 == 0) goto L_0x007d
            java.lang.Class r0 = r0.getReturnType()     // Catch:{ all -> 0x01a6 }
            goto L_0x007e
        L_0x007d:
            r0 = r1
        L_0x007e:
            boolean r5 = v3.l.a(r0, r2)     // Catch:{ all -> 0x01a6 }
            if (r5 == 0) goto L_0x0161
            androidx.window.sidecar.SidecarInterface r0 = r7.f6058a     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0099
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0099
            java.lang.String r5 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch:{ all -> 0x01a6 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r4)     // Catch:{ all -> 0x01a6 }
            goto L_0x009a
        L_0x0099:
            r0 = r1
        L_0x009a:
            if (r0 == 0) goto L_0x00a1
            java.lang.Class r0 = r0.getReturnType()     // Catch:{ all -> 0x01a6 }
            goto L_0x00a2
        L_0x00a1:
            r0 = r1
        L_0x00a2:
            boolean r2 = v3.l.a(r0, r2)     // Catch:{ all -> 0x01a6 }
            if (r2 == 0) goto L_0x014a
            androidx.window.sidecar.SidecarDeviceState r0 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x01a6 }
            r0.<init>()     // Catch:{ all -> 0x01a6 }
            r2 = 3
            r0.posture = r2     // Catch:{ NoSuchFieldError -> 0x00b1 }
            goto L_0x00e3
        L_0x00b1:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "setPosture"
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01a6 }
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch:{ all -> 0x01a6 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x01a6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01a6 }
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch:{ all -> 0x01a6 }
            r4.invoke(r0, r5)     // Catch:{ all -> 0x01a6 }
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "getPosture"
            java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r0 = r4.invoke(r0, r1)     // Catch:{ all -> 0x01a6 }
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Int"
            v3.l.c(r0, r4)     // Catch:{ all -> 0x01a6 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01a6 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01a6 }
            if (r0 != r2) goto L_0x0142
        L_0x00e3:
            androidx.window.sidecar.SidecarDisplayFeature r0 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x01a6 }
            r0.<init>()     // Catch:{ all -> 0x01a6 }
            android.graphics.Rect r2 = r0.getRect()     // Catch:{ all -> 0x01a6 }
            java.lang.String r4 = "displayFeature.rect"
            v3.l.d(r2, r4)     // Catch:{ all -> 0x01a6 }
            r0.setRect(r2)     // Catch:{ all -> 0x01a6 }
            r0.getType()     // Catch:{ all -> 0x01a6 }
            r0.setType(r3)     // Catch:{ all -> 0x01a6 }
            androidx.window.sidecar.SidecarWindowLayoutInfo r2 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            java.util.List r0 = r2.displayFeatures     // Catch:{ NoSuchFieldError -> 0x0103 }
            goto L_0x01a7
        L_0x0103:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x01a6 }
            r4.<init>()     // Catch:{ all -> 0x01a6 }
            r4.add(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "setDisplayFeatures"
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch:{ all -> 0x01a6 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ all -> 0x01a6 }
            java.lang.Object[] r5 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x01a6 }
            r0.invoke(r2, r5)     // Catch:{ all -> 0x01a6 }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "getDisplayFeatures"
            java.lang.reflect.Method r0 = r0.getMethod(r5, r1)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
            v3.l.c(r0, r1)     // Catch:{ all -> 0x01a6 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x01a6 }
            boolean r0 = v3.l.a(r4, r0)     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x013a
            goto L_0x01a7
        L_0x013a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = "Invalid display feature getter/setter"
            r0.<init>(r1)     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01a6 }
        L_0x0142:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = "Invalid device posture getter/setter"
            r0.<init>(r1)     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01a6 }
        L_0x014a:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            r2.append(r3)     // Catch:{ all -> 0x01a6 }
            r2.append(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a6 }
            throw r1     // Catch:{ all -> 0x01a6 }
        L_0x0161:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            r2.append(r3)     // Catch:{ all -> 0x01a6 }
            r2.append(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a6 }
            throw r1     // Catch:{ all -> 0x01a6 }
        L_0x0178:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = "Illegal return type for 'getWindowLayoutInfo': "
            r2.append(r3)     // Catch:{ all -> 0x01a6 }
            r2.append(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a6 }
            throw r1     // Catch:{ all -> 0x01a6 }
        L_0x018f:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r2.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = "Illegal return type for 'setSidecarCallback': "
            r2.append(r3)     // Catch:{ all -> 0x01a6 }
            r2.append(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a6 }
            throw r1     // Catch:{ all -> 0x01a6 }
        L_0x01a6:
            r3 = 0
        L_0x01a7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.SidecarCompat.n():boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f6057f.b(context), new N0.a((H0.j) null, 1, (g) null));
        l.e(context, "context");
    }
}
