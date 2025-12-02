package S;

import F.d;
import T.m;
import T.n;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: S.a  reason: case insensitive filesystem */
public class C0310a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f2675c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f2676a;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f2677b;

    /* renamed from: S.a$a  reason: collision with other inner class name */
    public static final class C0054a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final C0310a f2678a;

        public C0054a(C0310a aVar) {
            this.f2678a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2678a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            n b4 = this.f2678a.b(view);
            if (b4 != null) {
                return (AccessibilityNodeProvider) b4.e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2678a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            m C02 = m.C0(accessibilityNodeInfo);
            C02.t0(C.P(view));
            C02.m0(C.K(view));
            C02.q0(C.m(view));
            C02.x0(C.D(view));
            this.f2678a.g(view, C02);
            C02.d(accessibilityNodeInfo.getText(), view);
            List c4 = C0310a.c(view);
            for (int i4 = 0; i4 < c4.size(); i4++) {
                C02.b((m.a) c4.get(i4));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2678a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2678a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
            return this.f2678a.j(view, i4, bundle);
        }

        public void sendAccessibilityEvent(View view, int i4) {
            this.f2678a.l(view, i4);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2678a.m(view, accessibilityEvent);
        }
    }

    public C0310a() {
        this(f2675c);
    }

    public static List c(View view) {
        List list = (List) view.getTag(d.f954H);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2676a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public n b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2676a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new n(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.f2677b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] o4 = m.o(view.createAccessibilityNodeInfo().getText());
            int i4 = 0;
            while (o4 != null && i4 < o4.length) {
                if (clickableSpan.equals(o4[i4])) {
                    return true;
                }
                i4++;
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2676a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, m mVar) {
        this.f2676a.onInitializeAccessibilityNodeInfo(view, mVar.B0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2676a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2676a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i4, Bundle bundle) {
        List c4 = c(view);
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= c4.size()) {
                break;
            }
            m.a aVar = (m.a) c4.get(i5);
            if (aVar.b() == i4) {
                z4 = aVar.d(view, bundle);
                break;
            }
            i5++;
        }
        if (!z4) {
            z4 = this.f2676a.performAccessibilityAction(view, i4, bundle);
        }
        return (z4 || i4 != d.f963a || bundle == null) ? z4 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i4, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(d.f955I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i4)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i4) {
        this.f2676a.sendAccessibilityEvent(view, i4);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2676a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0310a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2676a = accessibilityDelegate;
        this.f2677b = new C0054a(this);
    }
}
