package w1;

import R1.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import v1.C0948b;

/* renamed from: w1.o  reason: case insensitive filesystem */
public final class C0982o {

    /* renamed from: a  reason: collision with root package name */
    public final Map f12620a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final Map f12621b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(BasePendingResult basePendingResult, boolean z4) {
        this.f12620a.put(basePendingResult, Boolean.valueOf(z4));
        basePendingResult.a(new a0(this, basePendingResult));
    }

    public final void b(g gVar, boolean z4) {
        this.f12621b.put(gVar, Boolean.valueOf(z4));
        gVar.a().a(new b0(this, gVar));
    }

    public final boolean c() {
        return !this.f12620a.isEmpty() || !this.f12621b.isEmpty();
    }

    public final void d() {
        h(false, C0972e.f12586p);
    }

    public final void e(int i4, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i4 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i4 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        h(true, new Status(20, sb.toString()));
    }

    public final /* synthetic */ Map f() {
        return this.f12620a;
    }

    public final /* synthetic */ Map g() {
        return this.f12621b;
    }

    public final void h(boolean z4, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = this.f12620a;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = this.f12621b;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z4 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z4 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((g) entry2.getKey()).c(new C0948b(status));
            }
        }
    }
}
