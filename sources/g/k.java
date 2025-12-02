package G;

import G.i;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class k implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1198a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f1199b;

    /* renamed from: c  reason: collision with root package name */
    public final i.e f1200c;

    /* renamed from: d  reason: collision with root package name */
    public RemoteViews f1201d;

    /* renamed from: e  reason: collision with root package name */
    public RemoteViews f1202e;

    /* renamed from: f  reason: collision with root package name */
    public final List f1203f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f1204g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    public int f1205h;

    /* renamed from: i  reason: collision with root package name */
    public RemoteViews f1206i;

    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i4, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z4) {
            return builder.setGroupSummary(z4);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z4) {
            return builder.setLocalOnly(z4);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i4) {
            return builder.setColor(i4);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i4) {
            return builder.setVisibility(i4);
        }
    }

    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z4) {
            return builder.setAllowGeneratedReplies(z4);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i4) {
            return builder.setBadgeIconType(i4);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z4) {
            return builder.setColorized(z4);
        }

        public static Notification.Builder d(Notification.Builder builder, int i4) {
            return builder.setGroupAlertBehavior(i4);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j4) {
            return builder.setTimeoutAfter(j4);
        }
    }

    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i4) {
            return builder.setSemanticAction(i4);
        }
    }

    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z4) {
            return builder.setAllowSystemGeneratedContextualActions(z4);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z4) {
            return builder.setContextual(z4);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z4) {
            return builder.setAuthenticationRequired(z4);
        }

        public static Notification.Builder b(Notification.Builder builder, int i4) {
            return builder.setForegroundServiceBehavior(i4);
        }
    }

    public k(i.e eVar) {
        int i4;
        this.f1200c = eVar;
        Context context = eVar.f1146a;
        this.f1198a = context;
        Notification.Builder a4 = e.a(context, eVar.f1135L);
        this.f1199b = a4;
        Notification notification = eVar.f1142S;
        a4.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f1154i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f1150e).setContentText(eVar.f1151f).setContentInfo(eVar.f1156k).setContentIntent(eVar.f1152g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f1153h, (notification.flags & 128) != 0).setNumber(eVar.f1157l).setProgress(eVar.f1166u, eVar.f1167v, eVar.f1168w);
        IconCompat iconCompat = eVar.f1155j;
        c.b(a4, iconCompat == null ? null : iconCompat.v(context));
        a4.setSubText(eVar.f1163r).setUsesChronometer(eVar.f1160o).setPriority(eVar.f1158m);
        i.j jVar = eVar.f1162q;
        if (jVar instanceof i.f) {
            for (i.a b4 : ((i.f) jVar).n()) {
                b(b4);
            }
        } else {
            Iterator it = eVar.f1147b.iterator();
            while (it.hasNext()) {
                b((i.a) it.next());
            }
        }
        Bundle bundle = eVar.f1128E;
        if (bundle != null) {
            this.f1204g.putAll(bundle);
        }
        this.f1201d = eVar.f1132I;
        this.f1202e = eVar.f1133J;
        this.f1199b.setShowWhen(eVar.f1159n);
        a.i(this.f1199b, eVar.f1124A);
        a.g(this.f1199b, eVar.f1169x);
        a.j(this.f1199b, eVar.f1171z);
        a.h(this.f1199b, eVar.f1170y);
        this.f1205h = eVar.f1139P;
        b.b(this.f1199b, eVar.f1127D);
        b.c(this.f1199b, eVar.f1129F);
        b.f(this.f1199b, eVar.f1130G);
        b.d(this.f1199b, eVar.f1131H);
        b.e(this.f1199b, notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList = eVar.f1145V;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (String a5 : arrayList) {
                b.a(this.f1199b, a5);
            }
        }
        this.f1206i = eVar.f1134K;
        if (eVar.f1149d.size() > 0) {
            Bundle bundle2 = eVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i5 = 0; i5 < eVar.f1149d.size(); i5++) {
                bundle4.putBundle(Integer.toString(i5), l.a((i.a) eVar.f1149d.get(i5)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f1204g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        Object obj = eVar.f1144U;
        if (obj != null) {
            c.c(this.f1199b, obj);
        }
        this.f1199b.setExtras(eVar.f1128E);
        d.e(this.f1199b, eVar.f1165t);
        RemoteViews remoteViews = eVar.f1132I;
        if (remoteViews != null) {
            d.c(this.f1199b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f1133J;
        if (remoteViews2 != null) {
            d.b(this.f1199b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f1134K;
        if (remoteViews3 != null) {
            d.d(this.f1199b, remoteViews3);
        }
        e.b(this.f1199b, eVar.f1136M);
        e.e(this.f1199b, eVar.f1164s);
        e.f(this.f1199b, eVar.f1137N);
        e.g(this.f1199b, eVar.f1138O);
        e.d(this.f1199b, eVar.f1139P);
        if (eVar.f1126C) {
            e.c(this.f1199b, eVar.f1125B);
        }
        if (!TextUtils.isEmpty(eVar.f1135L)) {
            this.f1199b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
        }
        Iterator it2 = eVar.f1148c.iterator();
        while (it2.hasNext()) {
            f.a(this.f1199b, ((q) it2.next()).i());
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            g.a(this.f1199b, eVar.f1141R);
            g.b(this.f1199b, i.d.a((i.d) null));
        }
        if (i6 >= 31 && (i4 = eVar.f1140Q) != 0) {
            h.b(this.f1199b, i4);
        }
        if (eVar.f1143T) {
            if (this.f1200c.f1170y) {
                this.f1205h = 2;
            } else {
                this.f1205h = 1;
            }
            this.f1199b.setVibrate((long[]) null);
            this.f1199b.setSound((Uri) null);
            int i7 = notification.defaults & -4;
            notification.defaults = i7;
            this.f1199b.setDefaults(i7);
            if (TextUtils.isEmpty(this.f1200c.f1169x)) {
                a.g(this.f1199b, "silent");
            }
            e.d(this.f1199b, this.f1205h);
        }
    }

    public Notification.Builder a() {
        return this.f1199b;
    }

    public final void b(i.a aVar) {
        IconCompat d4 = aVar.d();
        Notification.Action.Builder a4 = c.a(d4 != null ? d4.u() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput c4 : s.b(aVar.e())) {
                a.c(a4, c4);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i4 = Build.VERSION.SDK_INT;
        d.a(a4, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        f.b(a4, aVar.f());
        if (i4 >= 29) {
            g.c(a4, aVar.j());
        }
        if (i4 >= 31) {
            h.a(a4, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(a4, bundle);
        a.a(this.f1199b, a.d(a4));
    }

    public Notification c() {
        Bundle a4;
        RemoteViews k4;
        RemoteViews i4;
        i.j jVar = this.f1200c.f1162q;
        if (jVar != null) {
            jVar.b(this);
        }
        RemoteViews j4 = jVar != null ? jVar.j(this) : null;
        Notification d4 = d();
        if (j4 != null) {
            d4.contentView = j4;
        } else {
            RemoteViews remoteViews = this.f1200c.f1132I;
            if (remoteViews != null) {
                d4.contentView = remoteViews;
            }
        }
        if (!(jVar == null || (i4 = jVar.i(this)) == null)) {
            d4.bigContentView = i4;
        }
        if (!(jVar == null || (k4 = this.f1200c.f1162q.k(this)) == null)) {
            d4.headsUpContentView = k4;
        }
        if (!(jVar == null || (a4 = i.a(d4)) == null)) {
            jVar.a(a4);
        }
        return d4;
    }

    public Notification d() {
        return this.f1199b.build();
    }

    public Context e() {
        return this.f1198a;
    }
}
