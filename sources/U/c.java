package u;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import u.C0934a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f12088a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f12089b;

    public static class a {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    public static class b {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* renamed from: u.c$c  reason: collision with other inner class name */
    public static class C0197c {
        public static void a(ActivityOptions activityOptions, boolean z4) {
            activityOptions.setShareIdentityEnabled(z4);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f12090a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        public final C0934a.C0196a f12091b = new C0934a.C0196a();

        /* renamed from: c  reason: collision with root package name */
        public ArrayList f12092c;

        /* renamed from: d  reason: collision with root package name */
        public ActivityOptions f12093d;

        /* renamed from: e  reason: collision with root package name */
        public ArrayList f12094e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray f12095f;

        /* renamed from: g  reason: collision with root package name */
        public Bundle f12096g;

        /* renamed from: h  reason: collision with root package name */
        public int f12097h = 0;

        /* renamed from: i  reason: collision with root package name */
        public boolean f12098i = true;

        /* renamed from: j  reason: collision with root package name */
        public boolean f12099j;

        public c a() {
            Bundle bundle = null;
            if (!this.f12090a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c((IBinder) null, (PendingIntent) null);
            }
            ArrayList arrayList = this.f12092c;
            if (arrayList != null) {
                this.f12090a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList arrayList2 = this.f12094e;
            if (arrayList2 != null) {
                this.f12090a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f12090a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f12098i);
            this.f12090a.putExtras(this.f12091b.a().a());
            Bundle bundle2 = this.f12096g;
            if (bundle2 != null) {
                this.f12090a.putExtras(bundle2);
            }
            if (this.f12095f != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f12095f);
                this.f12090a.putExtras(bundle3);
            }
            this.f12090a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f12097h);
            int i4 = Build.VERSION.SDK_INT;
            b();
            if (i4 >= 34) {
                d();
            }
            ActivityOptions activityOptions = this.f12093d;
            if (activityOptions != null) {
                bundle = activityOptions.toBundle();
            }
            return new c(this.f12090a, bundle);
        }

        public final void b() {
            String a4 = b.a();
            if (!TextUtils.isEmpty(a4)) {
                Bundle bundleExtra = this.f12090a.hasExtra("com.android.browser.headers") ? this.f12090a.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", a4);
                    this.f12090a.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }

        public final void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f12090a.putExtras(bundle);
        }

        public final void d() {
            if (this.f12093d == null) {
                this.f12093d = a.a();
            }
            C0197c.a(this.f12093d, this.f12099j);
        }

        public d e(boolean z4) {
            this.f12090a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z4 ? 1 : 0);
            return this;
        }
    }

    public c(Intent intent, Bundle bundle) {
        this.f12088a = intent;
        this.f12089b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f12088a.setData(uri);
        H.a.l(context, this.f12088a, this.f12089b);
    }
}
