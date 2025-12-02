package u1;

import D1.f;
import D1.g;
import E1.b;
import G.i;
import H.a;
import J1.e;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import i0.C0699u;
import s1.C0921a;
import s1.C0922b;
import w1.C0967D;
import w1.C0975h;
import w1.E;
import z1.C1032o;
import z1.C1039w;
import z1.C1042z;

public class d extends e {

    /* renamed from: d  reason: collision with root package name */
    public static final int f12315d = e.f12319a;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f12316e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final d f12317f = new d();

    /* renamed from: c  reason: collision with root package name */
    public String f12318c;

    public static d m() {
        return f12317f;
    }

    public Intent a(Context context, int i4, String str) {
        return super.a(context, i4, str);
    }

    public PendingIntent b(Context context, int i4, int i5) {
        return super.b(context, i4, i5);
    }

    public final String d(int i4) {
        return super.d(i4);
    }

    public int f(Context context) {
        return super.f(context);
    }

    public int g(Context context, int i4) {
        return super.g(context, i4);
    }

    public final boolean i(int i4) {
        return super.i(i4);
    }

    public Dialog j(Activity activity, int i4, int i5) {
        return k(activity, i4, i5, (DialogInterface.OnCancelListener) null);
    }

    public Dialog k(Activity activity, int i4, int i5, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i4, C1042z.b(activity, a(activity, i4, "d"), i5), onCancelListener, (DialogInterface.OnClickListener) null);
    }

    public PendingIntent l(Context context, C0941a aVar) {
        return aVar.h() ? aVar.g() : b(context, aVar.d(), 0);
    }

    public boolean n(Activity activity, int i4, int i5, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k4 = k(activity, i4, i5, onCancelListener);
        if (k4 == null) {
            return false;
        }
        v(activity, k4, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i4) {
        r(context, i4, (String) null, c(context, i4, 0, "n"));
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.DialogInterface$OnClickListener] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog p(android.content.Context r6, int r7, z1.C1042z r8, android.content.DialogInterface.OnCancelListener r9, android.content.DialogInterface.OnClickListener r10) {
        /*
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r3 = 16843529(0x1010309, float:2.3695736E-38)
            r4 = 1
            r2.resolveAttribute(r3, r1, r4)
            android.content.res.Resources r2 = r6.getResources()
            int r1 = r1.resourceId
            java.lang.String r1 = r2.getResourceEntryName(r1)
            java.lang.String r2 = "Theme.Dialog.Alert"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002c
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r1 = 5
            r0.<init>(r6, r1)
        L_0x002c:
            if (r0 != 0) goto L_0x0033
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r6)
        L_0x0033:
            java.lang.String r1 = z1.C1039w.c(r6, r7)
            r0.setMessage(r1)
            if (r9 == 0) goto L_0x003f
            r0.setOnCancelListener(r9)
        L_0x003f:
            java.lang.String r9 = z1.C1039w.e(r6, r7)
            if (r9 == 0) goto L_0x004b
            if (r8 != 0) goto L_0x0048
            r8 = r10
        L_0x0048:
            r0.setPositiveButton(r9, r8)
        L_0x004b:
            java.lang.String r6 = z1.C1039w.a(r6, r7)
            if (r6 == 0) goto L_0x0054
            r0.setTitle(r6)
        L_0x0054:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "Creating dialog for Google Play services availability issue. ConnectionResult=%s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            java.lang.String r8 = "GoogleApiAvailability"
            android.util.Log.w(r8, r6, r7)
            android.app.AlertDialog r6 = r0.create()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.d.p(android.content.Context, int, z1.z, android.content.DialogInterface$OnCancelListener, android.content.DialogInterface$OnClickListener):android.app.Dialog");
    }

    public final boolean q(Activity activity, C0975h hVar, int i4, int i5, DialogInterface.OnCancelListener onCancelListener) {
        Dialog p4 = p(activity, i4, C1042z.c(hVar, a(activity, i4, "d"), 2), onCancelListener, (DialogInterface.OnClickListener) null);
        if (p4 == null) {
            return false;
        }
        v(activity, p4, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final void r(Context context, int i4, String str, PendingIntent pendingIntent) {
        int i5;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i4), null}), new IllegalArgumentException());
        if (i4 == 18) {
            w(context);
        } else if (pendingIntent != null) {
            String b4 = C1039w.b(context, i4);
            String d4 = C1039w.d(context, i4);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C1032o.f(context.getSystemService("notification"));
            i.e G4 = new i.e(context).v(true).f(true).n(b4).G(new i.c().n(d4));
            int i6 = 17301642;
            if (f.b(context)) {
                C1032o.h(g.a());
                int i7 = context.getApplicationInfo().icon;
                if (i7 != 0) {
                    i6 = i7;
                }
                G4.E(i6).z(2);
                if (f.c(context)) {
                    G4.a(C0921a.f12007a, resources.getString(C0922b.f12022o), pendingIntent);
                } else {
                    G4.l(pendingIntent);
                }
            } else {
                G4.E(17301642).I(resources.getString(C0922b.f12015h)).N(System.currentTimeMillis()).l(pendingIntent).m(d4);
            }
            if (g.c()) {
                C1032o.h(g.c());
                synchronized (f12316e) {
                    str2 = this.f12318c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String string = context.getResources().getString(C0922b.f12014g);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, string, 4));
                    } else if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                G4.h(str2);
            }
            Notification c4 = G4.c();
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                g.f12323b.set(false);
                i5 = 10436;
            } else {
                i5 = 39789;
            }
            notificationManager.notify(i5, c4);
        } else if (i4 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final boolean s(Context context, C0941a aVar, int i4) {
        PendingIntent l4;
        if (b.a(context) || (l4 = l(context, aVar)) == null) {
            return false;
        }
        r(context, aVar.d(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, l4, i4, true), e.f1619a | 134217728));
        return true;
    }

    public final Dialog t(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C1039w.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        v(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final E u(Context context, C0967D d4) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        E e4 = new E(d4);
        a.i(context, e4, intentFilter, 2);
        e4.a(context);
        if (h(context, "com.google.android.gms")) {
            return e4;
        }
        d4.a();
        e4.b();
        return null;
    }

    public final void v(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof C0699u) {
                j.S1(dialog, onCancelListener).R1(((C0699u) activity).T(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        C0942b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void w(Context context) {
        new k(this, context).sendEmptyMessageDelayed(1, 120000);
    }
}
