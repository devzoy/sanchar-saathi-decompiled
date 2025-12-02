package p2;

import R1.f;
import R1.g;
import R1.i;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import q2.C0896c;
import q2.D;
import q2.F;
import q2.o;
import q2.s;
import q2.y;
import s2.C0923a;

public final class w {

    /* renamed from: e  reason: collision with root package name */
    public static final s f11731e = new s("AppUpdateService");

    /* renamed from: f  reason: collision with root package name */
    public static final Intent f11732f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    public D f11733a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11734b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f11735c;

    /* renamed from: d  reason: collision with root package name */
    public final y f11736d;

    public w(Context context, y yVar) {
        this.f11734b = context.getPackageName();
        this.f11735c = context;
        this.f11736d = yVar;
        if (C0896c.a(context)) {
            this.f11733a = new D(F.a(context), f11731e, "AppUpdateService", f11732f, q.f11719a, (y) null);
        }
    }

    public static /* bridge */ /* synthetic */ Bundle b(w wVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(i());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(wVar.f11735c.getPackageManager().getPackageInfo(wVar.f11735c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f11731e.b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    public static /* bridge */ /* synthetic */ C0870a f(w wVar, Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        int i4 = bundle2.getInt("version.code", -1);
        int i5 = bundle2.getInt("update.availability");
        int i6 = bundle2.getInt("install.status", 0);
        Integer valueOf = bundle2.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle2.getInt("client.version.staleness"));
        int i7 = bundle2.getInt("in.app.update.priority", 0);
        long j4 = bundle2.getLong("bytes.downloaded");
        HashMap hashMap = r9;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("blocking.destructive.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        hashMap2.put("nonblocking.destructive.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        hashMap2.put("blocking.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        hashMap2.put("nonblocking.intent", k(bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return C0870a.k(str, i4, i5, i6, valueOf, i7, j4, bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), wVar.f11736d.a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"), hashMap);
    }

    public static Bundle i() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map a4 = o.a("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) a4.get("java")).intValue());
        if (a4.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) a4.get("native")).intValue());
        }
        if (a4.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) a4.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    public static f j() {
        f11731e.b("onError(%d)", -9);
        return i.a(new C0923a(-9));
    }

    public static HashSet k(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    public final f d(String str) {
        if (this.f11733a == null) {
            return j();
        }
        f11731e.d("completeUpdate(%s)", str);
        g gVar = new g();
        this.f11733a.s(new s(this, gVar, gVar, str), gVar);
        return gVar.a();
    }

    public final f e(String str) {
        if (this.f11733a == null) {
            return j();
        }
        f11731e.d("requestUpdateInfo(%s)", str);
        g gVar = new g();
        this.f11733a.s(new r(this, gVar, str, gVar), gVar);
        return gVar.a();
    }
}
