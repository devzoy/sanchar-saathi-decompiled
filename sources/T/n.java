package T;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2850a;

    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final n f2851a;

        public a(n nVar) {
            this.f2851a = nVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
            m b4 = this.f2851a.b(i4);
            if (b4 == null) {
                return null;
            }
            return b4.B0();
        }

        public List findAccessibilityNodeInfosByText(String str, int i4) {
            List c4 = this.f2851a.c(str, i4);
            if (c4 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c4.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(((m) c4.get(i5)).B0());
            }
            return arrayList;
        }

        public AccessibilityNodeInfo findFocus(int i4) {
            m d4 = this.f2851a.d(i4);
            if (d4 == null) {
                return null;
            }
            return d4.B0();
        }

        public boolean performAction(int i4, int i5, Bundle bundle) {
            return this.f2851a.f(i4, i5, bundle);
        }
    }

    public static class b extends a {
        public b(n nVar) {
            super(nVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i4, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f2851a.a(i4, m.C0(accessibilityNodeInfo), str, bundle);
        }
    }

    public n() {
        this.f2850a = new b(this);
    }

    public void a(int i4, m mVar, String str, Bundle bundle) {
    }

    public m b(int i4) {
        return null;
    }

    public List c(String str, int i4) {
        return null;
    }

    public m d(int i4) {
        return null;
    }

    public Object e() {
        return this.f2850a;
    }

    public boolean f(int i4, int i5, Bundle bundle) {
        return false;
    }

    public n(Object obj) {
        this.f2850a = obj;
    }
}
