package L2;

import C3.o;
import C3.p;
import H.b;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import dev.fluttercommunity.plus.share.a;
import h3.C0663d;
import h3.C0664e;
import i3.C0738o;
import i3.C0746w;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;
import s3.i;
import v3.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1774a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f1775b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1776c;

    /* renamed from: d  reason: collision with root package name */
    public final C0663d f1777d = C0664e.a(new b(this));

    /* renamed from: e  reason: collision with root package name */
    public final C0663d f1778e = C0664e.a(new c());

    public d(Context context, Activity activity, a aVar) {
        l.e(context, "context");
        l.e(aVar, "manager");
        this.f1774a = context;
        this.f1775b = activity;
        this.f1776c = aVar;
    }

    public static final int l() {
        return 33554432;
    }

    public static final String m(d dVar) {
        String packageName = dVar.f().getPackageName();
        return packageName + ".flutter.share_provider";
    }

    public final void c() {
        File j4 = j();
        File[] listFiles = j4.listFiles();
        if (j4.exists() && listFiles != null && listFiles.length != 0) {
            for (File delete : listFiles) {
                delete.delete();
            }
            j4.delete();
        }
    }

    public final File d(File file) {
        File j4 = j();
        if (!j4.exists()) {
            j4.mkdirs();
        }
        File file2 = new File(j4, file.getName());
        i.b(file, file2, true, 0, 4, (Object) null);
        return file2;
    }

    public final boolean e(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            l.b(canonicalPath);
            String canonicalPath2 = j().getCanonicalPath();
            l.d(canonicalPath2, "getCanonicalPath(...)");
            return o.v(canonicalPath, canonicalPath2, false, 2, (Object) null);
        } catch (IOException unused) {
            return false;
        }
    }

    public final Context f() {
        Activity activity = this.f1775b;
        if (activity == null) {
            return this.f1774a;
        }
        l.b(activity);
        return activity;
    }

    public final int g() {
        return ((Number) this.f1778e.getValue()).intValue();
    }

    public final String h(String str) {
        if (str == null || !p.z(str, "/", false, 2, (Object) null)) {
            return "*";
        }
        String substring = str.substring(0, p.G(str, "/", 0, false, 6, (Object) null));
        l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String i() {
        return (String) this.f1777d.getValue();
    }

    public final File j() {
        return new File(f().getCacheDir(), "share_plus");
    }

    public final ArrayList k(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (!e(file)) {
                arrayList.add(b.h(f(), i(), d(file)));
            } else {
                String canonicalPath = j().getCanonicalPath();
                throw new IOException("Shared file can not be located in '" + canonicalPath + "'");
            }
        }
        return arrayList;
    }

    public final String n(List list) {
        if (list == null || list.isEmpty()) {
            return "*/*";
        }
        int i4 = 1;
        if (list.size() == 1) {
            return (String) C0746w.u(list);
        }
        String str = (String) C0746w.u(list);
        int i5 = C0738o.i(list);
        if (1 <= i5) {
            while (true) {
                if (!l.a(str, list.get(i4))) {
                    if (!l.a(h(str), h((String) list.get(i4)))) {
                        return "*/*";
                    }
                    str = h((String) list.get(i4)) + "/*";
                }
                if (i4 == i5) {
                    break;
                }
                i4++;
            }
        }
        return str;
    }

    public final void o(Activity activity) {
        this.f1775b = activity;
    }

    public final void p(String str, String str2, boolean z4) {
        l.e(str, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        Intent createChooser = z4 ? Intent.createChooser(intent, (CharSequence) null, PendingIntent.getBroadcast(this.f1774a, 0, new Intent(this.f1774a, SharePlusPendingIntent.class), 134217728 | g()).getIntentSender()) : Intent.createChooser(intent, (CharSequence) null);
        l.b(createChooser);
        r(createChooser, z4);
    }

    public final void q(List list, List list2, String str, String str2, boolean z4) {
        l.e(list, "paths");
        c();
        ArrayList<Uri> k4 = k(list);
        Intent intent = new Intent();
        if (!k4.isEmpty() || str == null || p.I(str)) {
            if (k4.size() == 1) {
                Collection collection = list2;
                String str3 = (collection == null || collection.isEmpty()) ? "*/*" : (String) C0746w.u(list2);
                intent.setAction("android.intent.action.SEND");
                intent.setType(str3);
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) C0746w.u(k4));
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                intent.setType(n(list2));
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", k4);
            }
            if (str != null) {
                intent.putExtra("android.intent.extra.TEXT", str);
            }
            if (str2 != null) {
                intent.putExtra("android.intent.extra.SUBJECT", str2);
            }
            intent.addFlags(1);
            Intent createChooser = z4 ? Intent.createChooser(intent, (CharSequence) null, PendingIntent.getBroadcast(this.f1774a, 0, new Intent(this.f1774a, SharePlusPendingIntent.class), 134217728 | g()).getIntentSender()) : Intent.createChooser(intent, (CharSequence) null);
            List<ResolveInfo> queryIntentActivities = f().getPackageManager().queryIntentActivities(createChooser, 65536);
            l.d(queryIntentActivities, "queryIntentActivities(...)");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str4 = resolveInfo.activityInfo.packageName;
                for (Uri grantUriPermission : k4) {
                    f().grantUriPermission(str4, grantUriPermission, 3);
                }
            }
            l.b(createChooser);
            r(createChooser, z4);
            return;
        }
        p(str, str2, z4);
    }

    public final void r(Intent intent, boolean z4) {
        Activity activity = this.f1775b;
        if (activity == null) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            if (z4) {
                this.f1776c.d();
            }
            this.f1774a.startActivity(intent);
        } else if (z4) {
            l.b(activity);
            activity.startActivityForResult(intent, 22643);
        } else {
            l.b(activity);
            activity.startActivity(intent);
        }
    }
}
