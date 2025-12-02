package b3;

import T2.a;
import U2.c;
import X2.r;
import Y2.j;
import Y2.l;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b3.a  reason: case insensitive filesystem */
public class C0394a implements a, U2.a, l, r.b {

    /* renamed from: c  reason: collision with root package name */
    public final r f6270c;

    /* renamed from: d  reason: collision with root package name */
    public final PackageManager f6271d;

    /* renamed from: e  reason: collision with root package name */
    public c f6272e;

    /* renamed from: f  reason: collision with root package name */
    public Map f6273f;

    /* renamed from: g  reason: collision with root package name */
    public Map f6274g = new HashMap();

    public C0394a(r rVar) {
        this.f6270c = rVar;
        this.f6271d = rVar.f3619b;
        rVar.b(this);
    }

    public void a(String str, String str2, boolean z4, j.d dVar) {
        if (this.f6272e == null) {
            dVar.b("error", "Plugin not bound to an Activity", (Object) null);
            return;
        }
        Map map = this.f6273f;
        if (map == null) {
            dVar.b("error", "Can not process text actions before calling queryTextActions", (Object) null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            dVar.b("error", "Text processing activity not found", (Object) null);
            return;
        }
        int hashCode = dVar.hashCode();
        this.f6274g.put(Integer.valueOf(hashCode), dVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z4);
        this.f6272e.e().startActivityForResult(intent, hashCode);
    }

    public Map b() {
        if (this.f6273f == null) {
            c();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.f6273f.keySet()) {
            hashMap.put(str, ((ResolveInfo) this.f6273f.get(str)).loadLabel(this.f6271d).toString());
        }
        return hashMap;
    }

    public final void c() {
        this.f6273f = new HashMap();
        int i4 = Build.VERSION.SDK_INT;
        Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        for (ResolveInfo next : i4 >= 33 ? this.f6271d.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0)) : this.f6271d.queryIntentActivities(type, 0)) {
            String str = next.activityInfo.name;
            next.loadLabel(this.f6271d).toString();
            this.f6273f.put(str, next);
        }
    }

    public boolean onActivityResult(int i4, int i5, Intent intent) {
        if (!this.f6274g.containsKey(Integer.valueOf(i4))) {
            return false;
        }
        ((j.d) this.f6274g.remove(Integer.valueOf(i4))).a(i5 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    public void onAttachedToActivity(c cVar) {
        this.f6272e = cVar;
        cVar.a(this);
    }

    public void onAttachedToEngine(a.b bVar) {
    }

    public void onDetachedFromActivity() {
        this.f6272e.f(this);
        this.f6272e = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f6272e.f(this);
        this.f6272e = null;
    }

    public void onDetachedFromEngine(a.b bVar) {
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        this.f6272e = cVar;
        cVar.a(this);
    }
}
