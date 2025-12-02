package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;

class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C0750a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused = false;
    private final d state;
    private int viewId;

    public static class a extends FrameLayout {

        /* renamed from: c  reason: collision with root package name */
        public final C0750a f10520c;

        /* renamed from: d  reason: collision with root package name */
        public final View f10521d;

        public a(Context context, C0750a aVar, View view) {
            super(context);
            this.f10520c = aVar;
            this.f10521d = view;
        }

        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f10520c.b(this.f10521d, view, accessibilityEvent);
        }
    }

    public static class b extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        public final InputMethodManager f10522a;

        public b(Context context) {
            this(context, (InputMethodManager) null);
        }

        public Context createDisplayContext(Display display) {
            return new b(super.createDisplayContext(display), this.f10522a);
        }

        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f10522a : super.getSystemService(str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.view.inputmethod.InputMethodManager} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(android.content.Context r1, android.view.inputmethod.InputMethodManager r2) {
            /*
                r0 = this;
                r0.<init>(r1)
                if (r2 == 0) goto L_0x0006
                goto L_0x000f
            L_0x0006:
                java.lang.String r2 = "input_method"
                java.lang.Object r1 = r1.getSystemService(r2)
                r2 = r1
                android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            L_0x000f:
                r0.f10522a = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.SingleViewPresentation.b.<init>(android.content.Context, android.view.inputmethod.InputMethodManager):void");
        }
    }

    public static class c extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        public final D f10523a;

        /* renamed from: b  reason: collision with root package name */
        public WindowManager f10524b;

        /* renamed from: c  reason: collision with root package name */
        public final Context f10525c;

        public c(Context context, D d4, Context context2) {
            super(context);
            this.f10523a = d4;
            this.f10525c = context2;
        }

        public final WindowManager a() {
            if (this.f10524b == null) {
                this.f10524b = this.f10523a;
            }
            return this.f10524b;
        }

        public final boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i4 = 0;
            while (i4 < stackTrace.length && i4 < 11) {
                if (stackTrace[i4].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i4].getMethodName().equals("<init>")) {
                    return true;
                }
                i4++;
            }
            return false;
        }

        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.f10525c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public h f10526a;

        /* renamed from: b  reason: collision with root package name */
        public D f10527b;

        /* renamed from: c  reason: collision with root package name */
        public u f10528c;
    }

    public SingleViewPresentation(Context context, Display display, h hVar, C0750a aVar, int i4, View.OnFocusChangeListener onFocusChangeListener) {
        super(new b(context), display);
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i4;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        d dVar = new d();
        this.state = dVar;
        h unused = dVar.f10526a = hVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public d detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        a aVar = this.rootView;
        if (aVar != null) {
            aVar.removeAllViews();
        }
        return this.state;
    }

    public h getView() {
        return this.state.f10526a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f10528c == null) {
            u unused = this.state.f10528c = new u(getContext());
        }
        if (this.state.f10527b == null) {
            d dVar = this.state;
            D unused2 = dVar.f10527b = new D((WindowManager) getContext().getSystemService("window"), dVar.f10528c);
        }
        this.container = new FrameLayout(getContext());
        c cVar = new c(getContext(), this.state.f10527b, this.outerContext);
        View c4 = this.state.f10526a.c();
        if (c4.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) c4.getContext()).setBaseContext(cVar);
        } else {
            M2.b.g(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(c4);
        a aVar = new a(getContext(), this.accessibilityEventsDelegate, c4);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f10528c);
        c4.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            c4.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C0750a aVar, d dVar, View.OnFocusChangeListener onFocusChangeListener, boolean z4) {
        super(new b(context), display);
        this.accessibilityEventsDelegate = aVar;
        this.state = dVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z4;
    }
}
