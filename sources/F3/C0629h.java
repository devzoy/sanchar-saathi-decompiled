package f3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import f3.C0622a;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Collections;
import java.util.Map;
import u.b;
import u.c;

/* renamed from: f3.h  reason: case insensitive filesystem */
public final class C0629h implements C0622a.d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9039a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9040b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f9041c;

    /* renamed from: f3.h$a */
    public interface a {
        String a(Intent intent);
    }

    public C0629h(Context context, a aVar) {
        this.f9039a = context;
        this.f9040b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean t(java.util.Map r5) {
        /*
            r0 = 1
            r1 = 0
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x000a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.hashCode()
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -1423461112: goto L_0x0049;
                case -1229727188: goto L_0x003e;
                case 785670158: goto L_0x0033;
                case 802785917: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x0053
        L_0x0028:
            java.lang.String r4 = "accept-language"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0031
            goto L_0x0053
        L_0x0031:
            r3 = 3
            goto L_0x0053
        L_0x0033:
            java.lang.String r4 = "content-type"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x003c
            goto L_0x0053
        L_0x003c:
            r3 = 2
            goto L_0x0053
        L_0x003e:
            java.lang.String r4 = "content-language"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0047
            goto L_0x0053
        L_0x0047:
            r3 = r0
            goto L_0x0053
        L_0x0049:
            java.lang.String r4 = "accept"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r3 = r1
        L_0x0053:
            switch(r3) {
                case 0: goto L_0x000a;
                case 1: goto L_0x000a;
                case 2: goto L_0x000a;
                case 3: goto L_0x000a;
                default: goto L_0x0056;
            }
        L_0x0056:
            return r0
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.C0629h.t(java.util.Map):boolean");
    }

    public static Bundle v(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public static /* synthetic */ String w(Context context, Intent intent) {
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return null;
        }
        return resolveActivity.toShortString();
    }

    public static boolean x(Context context, Uri uri, Bundle bundle, C0622a.C0162a aVar) {
        c a4 = new c.d().e(aVar.b().booleanValue()).a();
        a4.f12088a.putExtra("com.android.browser.headers", bundle);
        try {
            a4.a(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public Boolean e(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        String a4 = this.f9040b.a(intent);
        return a4 == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(a4));
    }

    public void j() {
        this.f9039a.sendBroadcast(new Intent("close action"));
    }

    public Boolean k(String str, Map map) {
        u();
        try {
            this.f9041c.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", v(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public Boolean m(String str, Boolean bool, C0622a.e eVar, C0622a.C0162a aVar) {
        u();
        Bundle v4 = v(eVar.d());
        if (bool.booleanValue() && !t(eVar.d())) {
            if (x(this.f9041c, Uri.parse(str), v4, aVar)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.f9041c.startActivity(WebViewActivity.a(this.f9041c, str, eVar.c().booleanValue(), eVar.b().booleanValue(), v4));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public Boolean o() {
        return Boolean.valueOf(b.a(this.f9039a, Collections.emptyList()) != null);
    }

    public final void u() {
        if (this.f9041c == null) {
            throw new C0622a.b("NO_ACTIVITY", "Launching a URL requires a foreground activity.", (Object) null);
        }
    }

    public void y(Activity activity) {
        this.f9041c = activity;
    }

    public C0629h(Context context) {
        this(context, new C0628g(context));
    }
}
