package T;

import T.p;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f2797a;

    /* renamed from: b  reason: collision with root package name */
    public int f2798b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f2799c = -1;

    public static class a {

        /* renamed from: A  reason: collision with root package name */
        public static final a f2800A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (p) null, (Class) null);

        /* renamed from: B  reason: collision with root package name */
        public static final a f2801B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (p) null, p.e.class);

        /* renamed from: C  reason: collision with root package name */
        public static final a f2802C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (p) null, (Class) null);

        /* renamed from: D  reason: collision with root package name */
        public static final a f2803D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (p) null, (Class) null);

        /* renamed from: E  reason: collision with root package name */
        public static final a f2804E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (p) null, (Class) null);

        /* renamed from: F  reason: collision with root package name */
        public static final a f2805F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (p) null, (Class) null);

        /* renamed from: G  reason: collision with root package name */
        public static final a f2806G;

        /* renamed from: H  reason: collision with root package name */
        public static final a f2807H;

        /* renamed from: I  reason: collision with root package name */
        public static final a f2808I;

        /* renamed from: J  reason: collision with root package name */
        public static final a f2809J;

        /* renamed from: K  reason: collision with root package name */
        public static final a f2810K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (p) null, (Class) null);

        /* renamed from: L  reason: collision with root package name */
        public static final a f2811L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (CharSequence) null, (p) null, p.f.class);

        /* renamed from: M  reason: collision with root package name */
        public static final a f2812M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, (CharSequence) null, (p) null, p.d.class);

        /* renamed from: N  reason: collision with root package name */
        public static final a f2813N = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, 16908356, (CharSequence) null, (p) null, (Class) null);

        /* renamed from: O  reason: collision with root package name */
        public static final a f2814O = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, 16908357, (CharSequence) null, (p) null, (Class) null);

        /* renamed from: P  reason: collision with root package name */
        public static final a f2815P;

        /* renamed from: Q  reason: collision with root package name */
        public static final a f2816Q;

        /* renamed from: R  reason: collision with root package name */
        public static final a f2817R;

        /* renamed from: S  reason: collision with root package name */
        public static final a f2818S;

        /* renamed from: T  reason: collision with root package name */
        public static final a f2819T;

        /* renamed from: U  reason: collision with root package name */
        public static final a f2820U;

        /* renamed from: V  reason: collision with root package name */
        public static final a f2821V;

        /* renamed from: e  reason: collision with root package name */
        public static final a f2822e = new a(1, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f2823f = new a(2, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f2824g = new a(4, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f2825h = new a(8, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f2826i = new a(16, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f2827j = new a(32, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f2828k = new a(64, (CharSequence) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f2829l = new a(128, (CharSequence) null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f2830m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f2831n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f2832o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f2833p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f2834q = new a(4096, (CharSequence) null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f2835r = new a(8192, (CharSequence) null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f2836s = new a(16384, (CharSequence) null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f2837t = new a(32768, (CharSequence) null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f2838u = new a(65536, (CharSequence) null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f2839v = new a(131072, (CharSequence) null, p.g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f2840w = new a(262144, (CharSequence) null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f2841x = new a(524288, (CharSequence) null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f2842y = new a(1048576, (CharSequence) null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f2843z = new a(2097152, (CharSequence) null, p.h.class);

        /* renamed from: a  reason: collision with root package name */
        public final Object f2844a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2845b;

        /* renamed from: c  reason: collision with root package name */
        public final Class f2846c;

        /* renamed from: d  reason: collision with root package name */
        public final p f2847d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            Class<p.b> cls = p.b.class;
            f2830m = new a(256, (CharSequence) null, (Class) cls);
            f2831n = new a(512, (CharSequence) null, (Class) cls);
            Class<p.c> cls2 = p.c.class;
            f2832o = new a(1024, (CharSequence) null, (Class) cls2);
            f2833p = new a(2048, (CharSequence) null, (Class) cls2);
            int i4 = Build.VERSION.SDK_INT;
            f2806G = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (p) null, (Class) null);
            f2807H = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (p) null, (Class) null);
            f2808I = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (p) null, (Class) null);
            f2809J = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (p) null, (Class) null);
            f2815P = new a(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (p) null, (Class) null);
            f2816Q = new a(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (CharSequence) null, (p) null, (Class) null);
            f2817R = new a(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (CharSequence) null, (p) null, (Class) null);
            f2818S = new a(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (CharSequence) null, (p) null, (Class) null);
            f2819T = new a(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (CharSequence) null, (p) null, (Class) null);
            f2820U = new a(i4 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, (CharSequence) null, (p) null, (Class) null);
            if (i4 >= 34) {
                accessibilityAction = d.a();
            }
            f2821V = new a(accessibilityAction, 16908382, (CharSequence) null, (p) null, (Class) null);
        }

        public a(int i4, CharSequence charSequence) {
            this((Object) null, i4, charSequence, (p) null, (Class) null);
        }

        public a a(CharSequence charSequence, p pVar) {
            return new a((Object) null, this.f2845b, charSequence, pVar, this.f2846c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2844a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2844a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f2847d == null) {
                return false;
            }
            Class cls = this.f2846c;
            if (cls != null) {
                try {
                    android.support.v4.media.session.b.a(cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
                    throw null;
                } catch (Exception e4) {
                    Class cls2 = this.f2846c;
                    String name = cls2 == null ? "null" : cls2.getName();
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e4);
                }
            }
            return this.f2847d.a(view, (p.a) null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f2844a;
            return obj2 == null ? aVar.f2844a == null : obj2.equals(aVar.f2844a);
        }

        public int hashCode() {
            Object obj = this.f2844a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String g4 = m.g(this.f2845b);
            if (g4.equals("ACTION_UNKNOWN") && c() != null) {
                g4 = c().toString();
            }
            sb.append(g4);
            return sb.toString();
        }

        public a(int i4, CharSequence charSequence, p pVar) {
            this((Object) null, i4, charSequence, pVar, (Class) null);
        }

        public a(Object obj) {
            this(obj, 0, (CharSequence) null, (p) null, (Class) null);
        }

        public a(int i4, CharSequence charSequence, Class cls) {
            this((Object) null, i4, charSequence, (p) null, cls);
        }

        public a(Object obj, int i4, CharSequence charSequence, p pVar, Class cls) {
            this.f2845b = i4;
            this.f2847d = pVar;
            if (obj == null) {
                this.f2844a = new AccessibilityNodeInfo.AccessibilityAction(i4, charSequence);
            } else {
                this.f2844a = obj;
            }
            this.f2846c = cls;
        }
    }

    public static class b {
        public static Object a(int i4, float f4, float f5, float f6) {
            return new AccessibilityNodeInfo.RangeInfo(i4, f4, f5, f6);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    public static class c {
        public static f a(boolean z4, int i4, int i5, int i6, int i7, boolean z5, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z4).setColumnIndex(i4).setRowIndex(i5).setColumnSpan(i6).setRowSpan(i7).setSelected(z5).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static m b(AccessibilityNodeInfo accessibilityNodeInfo, int i4, int i5) {
            return m.D0(accessibilityNodeInfo.getChild(i4, i5));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static m f(AccessibilityNodeInfo accessibilityNodeInfo, int i4) {
            return m.D0(accessibilityNodeInfo.getParent(i4));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
            accessibilityNodeInfo.setTextSelectable(z4);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z4);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j4) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j4));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z4) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z4);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z4);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final Object f2848a;

        public e(Object obj) {
            this.f2848a = obj;
        }

        public static e a(int i4, int i5, boolean z4, int i6) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i4, i5, z4, i6));
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final Object f2849a;

        public f(Object obj) {
            this.f2849a = obj;
        }

        public static f a(int i4, int i5, int i6, int i7, boolean z4, boolean z5) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z4, z5));
        }
    }

    public m(Object obj) {
        this.f2797a = (AccessibilityNodeInfo) obj;
    }

    public static m C0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new m(accessibilityNodeInfo);
    }

    public static m D0(Object obj) {
        if (obj != null) {
            return new m(obj);
        }
        return null;
    }

    public static m S() {
        return C0(AccessibilityNodeInfo.obtain());
    }

    public static m T(m mVar) {
        return C0(AccessibilityNodeInfo.obtain(mVar.f2797a));
    }

    public static m U(View view) {
        return C0(AccessibilityNodeInfo.obtain(view));
    }

    public static String g(int i4) {
        if (i4 == 1) {
            return "ACTION_FOCUS";
        }
        if (i4 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i4) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i4) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i4) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i4) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] o(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public final boolean A() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void A0(boolean z4) {
        this.f2797a.setVisibleToUser(z4);
    }

    public boolean B() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.f2797a) : i(64);
    }

    public AccessibilityNodeInfo B0() {
        return this.f2797a;
    }

    public boolean C() {
        return this.f2797a.isCheckable();
    }

    public boolean D() {
        return this.f2797a.isChecked();
    }

    public boolean E() {
        return this.f2797a.isClickable();
    }

    public boolean F() {
        return this.f2797a.isContextClickable();
    }

    public boolean G() {
        return this.f2797a.isEnabled();
    }

    public boolean H() {
        return this.f2797a.isFocusable();
    }

    public boolean I() {
        return this.f2797a.isFocused();
    }

    public boolean J() {
        return i(67108864);
    }

    public boolean K() {
        return this.f2797a.isImportantForAccessibility();
    }

    public boolean L() {
        return this.f2797a.isLongClickable();
    }

    public boolean M() {
        return this.f2797a.isPassword();
    }

    public boolean N() {
        return this.f2797a.isScrollable();
    }

    public boolean O() {
        return this.f2797a.isSelected();
    }

    public boolean P() {
        return this.f2797a.isShowingHintText();
    }

    public boolean Q() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.f2797a) : i(8388608);
    }

    public boolean R() {
        return this.f2797a.isVisibleToUser();
    }

    public boolean V(int i4, Bundle bundle) {
        return this.f2797a.performAction(i4, bundle);
    }

    public void W() {
    }

    public void X(boolean z4) {
        this.f2797a.setAccessibilityFocused(z4);
    }

    public void Y(Rect rect) {
        this.f2797a.setBoundsInParent(rect);
    }

    public void Z(Rect rect) {
        this.f2797a.setBoundsInScreen(rect);
    }

    public void a(int i4) {
        this.f2797a.addAction(i4);
    }

    public void a0(boolean z4) {
        this.f2797a.setCheckable(z4);
    }

    public void b(a aVar) {
        this.f2797a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2844a);
    }

    public void b0(boolean z4) {
        this.f2797a.setChecked(z4);
    }

    public void c(View view, int i4) {
        this.f2797a.addChild(view, i4);
    }

    public void c0(CharSequence charSequence) {
        this.f2797a.setClassName(charSequence);
    }

    public void d(CharSequence charSequence, View view) {
    }

    public void d0(boolean z4) {
        this.f2797a.setClickable(z4);
    }

    public final List e(String str) {
        ArrayList<Integer> integerArrayList = this.f2797a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f2797a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void e0(Object obj) {
        this.f2797a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f2848a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2797a;
        if (accessibilityNodeInfo == null) {
            if (mVar.f2797a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(mVar.f2797a)) {
            return false;
        }
        return this.f2799c == mVar.f2799c && this.f2798b == mVar.f2798b;
    }

    public List f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f2797a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new a(actionList.get(i4)));
        }
        return arrayList;
    }

    public void f0(Object obj) {
        this.f2797a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f2849a);
    }

    public void g0(CharSequence charSequence) {
        this.f2797a.setContentDescription(charSequence);
    }

    public int h() {
        return this.f2797a.getActions();
    }

    public void h0(boolean z4) {
        this.f2797a.setDismissable(z4);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2797a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final boolean i(int i4) {
        Bundle s4 = s();
        return s4 != null && (s4.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i4) == i4;
    }

    public void i0(boolean z4) {
        this.f2797a.setEnabled(z4);
    }

    public void j(Rect rect) {
        this.f2797a.getBoundsInParent(rect);
    }

    public void j0(CharSequence charSequence) {
        this.f2797a.setError(charSequence);
    }

    public void k(Rect rect) {
        this.f2797a.getBoundsInScreen(rect);
    }

    public void k0(boolean z4) {
        this.f2797a.setFocusable(z4);
    }

    public void l(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f2797a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f2797a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void l0(boolean z4) {
        this.f2797a.setFocused(z4);
    }

    public int m() {
        return this.f2797a.getChildCount();
    }

    public void m0(boolean z4) {
        this.f2797a.setHeading(z4);
    }

    public CharSequence n() {
        return this.f2797a.getClassName();
    }

    public void n0(CharSequence charSequence) {
        this.f2797a.setHintText(charSequence);
    }

    public void o0(int i4) {
        this.f2797a.setMaxTextLength(i4);
    }

    public CharSequence p() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f2797a) : this.f2797a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void p0(CharSequence charSequence) {
        this.f2797a.setPackageName(charSequence);
    }

    public CharSequence q() {
        return this.f2797a.getContentDescription();
    }

    public void q0(CharSequence charSequence) {
        this.f2797a.setPaneTitle(charSequence);
    }

    public CharSequence r() {
        return this.f2797a.getError();
    }

    public void r0(View view) {
        this.f2798b = -1;
        this.f2797a.setParent(view);
    }

    public Bundle s() {
        return this.f2797a.getExtras();
    }

    public void s0(View view, int i4) {
        this.f2798b = i4;
        this.f2797a.setParent(view, i4);
    }

    public int t() {
        return this.f2797a.getMaxTextLength();
    }

    public void t0(boolean z4) {
        this.f2797a.setScreenReaderFocusable(z4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        sb.append("; boundsInParent: " + rect);
        k(rect);
        sb.append("; boundsInScreen: " + rect);
        l(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(u());
        sb.append("; className: ");
        sb.append(n());
        sb.append("; text: ");
        sb.append(w());
        sb.append("; error: ");
        sb.append(r());
        sb.append("; maxTextLength: ");
        sb.append(t());
        sb.append("; stateDescription: ");
        sb.append(v());
        sb.append("; contentDescription: ");
        sb.append(q());
        sb.append("; tooltipText: ");
        sb.append(x());
        sb.append("; viewIdResName: ");
        sb.append(z());
        sb.append("; uniqueId: ");
        sb.append(y());
        sb.append("; checkable: ");
        sb.append(C());
        sb.append("; checked: ");
        sb.append(D());
        sb.append("; focusable: ");
        sb.append(H());
        sb.append("; focused: ");
        sb.append(I());
        sb.append("; selected: ");
        sb.append(O());
        sb.append("; clickable: ");
        sb.append(E());
        sb.append("; longClickable: ");
        sb.append(L());
        sb.append("; contextClickable: ");
        sb.append(F());
        sb.append("; enabled: ");
        sb.append(G());
        sb.append("; password: ");
        sb.append(M());
        sb.append("; scrollable: " + N());
        sb.append("; containerTitle: ");
        sb.append(p());
        sb.append("; granularScrollingSupported: ");
        sb.append(J());
        sb.append("; importantForAccessibility: ");
        sb.append(K());
        sb.append("; visible: ");
        sb.append(R());
        sb.append("; isTextSelectable: ");
        sb.append(Q());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(B());
        sb.append("; [");
        List f4 = f();
        for (int i4 = 0; i4 < f4.size(); i4++) {
            a aVar = (a) f4.get(i4);
            String g4 = g(aVar.b());
            if (g4.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                g4 = aVar.c().toString();
            }
            sb.append(g4);
            if (i4 != f4.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        return this.f2797a.getPackageName();
    }

    public void u0(boolean z4) {
        this.f2797a.setScrollable(z4);
    }

    public CharSequence v() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.f2797a) : this.f2797a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void v0(boolean z4) {
        this.f2797a.setShowingHintText(z4);
    }

    public CharSequence w() {
        if (!A()) {
            return this.f2797a.getText();
        }
        List e4 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List e5 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List e6 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List e7 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2797a.getText(), 0, this.f2797a.getText().length()));
        for (int i4 = 0; i4 < e4.size(); i4++) {
            spannableString.setSpan(new a(((Integer) e7.get(i4)).intValue(), this, s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) e4.get(i4)).intValue(), ((Integer) e5.get(i4)).intValue(), ((Integer) e6.get(i4)).intValue());
        }
        return spannableString;
    }

    public void w0(View view, int i4) {
        this.f2799c = i4;
        this.f2797a.setSource(view, i4);
    }

    public CharSequence x() {
        return this.f2797a.getTooltipText();
    }

    public void x0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.f2797a, charSequence);
        } else {
            this.f2797a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public String y() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.f2797a) : this.f2797a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void y0(CharSequence charSequence) {
        this.f2797a.setText(charSequence);
    }

    public String z() {
        return this.f2797a.getViewIdResourceName();
    }

    public void z0(View view) {
        this.f2797a.setTraversalAfter(view);
    }

    public m(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2797a = accessibilityNodeInfo;
    }
}
