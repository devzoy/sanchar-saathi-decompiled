package g;

import android.content.Context;
import android.content.Intent;
import g.C0631a;
import h3.C0666g;
import h3.C0670k;
import i3.C0720D;
import i3.C0721E;
import i3.C0735l;
import i3.C0746w;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import v3.g;
import v3.l;
import z3.e;

/* renamed from: g.b  reason: case insensitive filesystem */
public final class C0632b extends C0631a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9044a = new a((g) null);

    /* renamed from: g.b$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            l.e(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            l.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        public a() {
        }
    }

    /* renamed from: d */
    public Intent a(Context context, String[] strArr) {
        l.e(context, "context");
        l.e(strArr, "input");
        return f9044a.a(strArr);
    }

    /* renamed from: e */
    public C0631a.C0163a b(Context context, String[] strArr) {
        l.e(context, "context");
        l.e(strArr, "input");
        if (strArr.length == 0) {
            return new C0631a.C0163a(C0721E.g());
        }
        for (String a4 : strArr) {
            if (H.a.a(context, a4) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.a(C0720D.d(strArr.length), 16));
        for (String a5 : strArr) {
            C0666g a6 = C0670k.a(a5, Boolean.TRUE);
            linkedHashMap.put(a6.c(), a6.d());
        }
        return new C0631a.C0163a(linkedHashMap);
    }

    /* renamed from: f */
    public Map c(int i4, Intent intent) {
        if (i4 != -1) {
            return C0721E.g();
        }
        if (intent == null) {
            return C0721E.g();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C0721E.g();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i5 = 0; i5 < length; i5++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i5] == 0));
        }
        return C0721E.o(C0746w.M(C0735l.o(stringArrayExtra), arrayList));
    }
}
