package G;

import G.q;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class i {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f1096a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f1097b;

        /* renamed from: c  reason: collision with root package name */
        public final s[] f1098c;

        /* renamed from: d  reason: collision with root package name */
        public final s[] f1099d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1100e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1101f;

        /* renamed from: g  reason: collision with root package name */
        public final int f1102g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f1103h;

        /* renamed from: i  reason: collision with root package name */
        public int f1104i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f1105j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f1106k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1107l;

        /* renamed from: G.i$a$a  reason: collision with other inner class name */
        public static final class C0014a {

            /* renamed from: a  reason: collision with root package name */
            public final IconCompat f1108a;

            /* renamed from: b  reason: collision with root package name */
            public final CharSequence f1109b;

            /* renamed from: c  reason: collision with root package name */
            public final PendingIntent f1110c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f1111d;

            /* renamed from: e  reason: collision with root package name */
            public final Bundle f1112e;

            /* renamed from: f  reason: collision with root package name */
            public ArrayList f1113f;

            /* renamed from: g  reason: collision with root package name */
            public int f1114g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f1115h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f1116i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f1117j;

            public C0014a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), (s[]) null, true, 0, true, false, false);
            }

            public C0014a a(s sVar) {
                if (this.f1113f == null) {
                    this.f1113f = new ArrayList();
                }
                if (sVar != null) {
                    this.f1113f.add(sVar);
                }
                return this;
            }

            /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public G.i.a b() {
                /*
                    r17 = this;
                    r0 = r17
                    r17.c()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList r3 = r0.f1113f
                    if (r3 == 0) goto L_0x0031
                    java.util.Iterator r3 = r3.iterator()
                L_0x0017:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0031
                    java.lang.Object r4 = r3.next()
                    G.s r4 = (G.s) r4
                    boolean r5 = r4.k()
                    if (r5 == 0) goto L_0x002d
                    r1.add(r4)
                    goto L_0x0017
                L_0x002d:
                    r2.add(r4)
                    goto L_0x0017
                L_0x0031:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L_0x003a
                    r11 = r4
                    goto L_0x0047
                L_0x003a:
                    int r3 = r1.size()
                    G.s[] r3 = new G.s[r3]
                    java.lang.Object[] r1 = r1.toArray(r3)
                    G.s[] r1 = (G.s[]) r1
                    r11 = r1
                L_0x0047:
                    boolean r1 = r2.isEmpty()
                    if (r1 == 0) goto L_0x004f
                L_0x004d:
                    r10 = r4
                    goto L_0x005d
                L_0x004f:
                    int r1 = r2.size()
                    G.s[] r1 = new G.s[r1]
                    java.lang.Object[] r1 = r2.toArray(r1)
                    r4 = r1
                    G.s[] r4 = (G.s[]) r4
                    goto L_0x004d
                L_0x005d:
                    G.i$a r1 = new G.i$a
                    androidx.core.graphics.drawable.IconCompat r6 = r0.f1108a
                    java.lang.CharSequence r7 = r0.f1109b
                    android.app.PendingIntent r8 = r0.f1110c
                    android.os.Bundle r9 = r0.f1112e
                    boolean r12 = r0.f1111d
                    int r13 = r0.f1114g
                    boolean r14 = r0.f1115h
                    boolean r15 = r0.f1116i
                    boolean r2 = r0.f1117j
                    r5 = r1
                    r16 = r2
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: G.i.a.C0014a.b():G.i$a");
            }

            public final void c() {
                if (this.f1116i && this.f1110c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0014a d(boolean z4) {
                this.f1111d = z4;
                return this;
            }

            public C0014a e(boolean z4) {
                this.f1116i = z4;
                return this;
            }

            public C0014a f(boolean z4) {
                this.f1115h = z4;
                return this;
            }

            public C0014a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, s[] sVarArr, boolean z4, int i4, boolean z5, boolean z6, boolean z7) {
                ArrayList arrayList;
                this.f1111d = true;
                this.f1115h = true;
                this.f1108a = iconCompat;
                this.f1109b = e.e(charSequence);
                this.f1110c = pendingIntent;
                this.f1112e = bundle;
                if (sVarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(Arrays.asList(sVarArr));
                }
                this.f1113f = arrayList;
                this.f1111d = z4;
                this.f1114g = i4;
                this.f1115h = z5;
                this.f1116i = z6;
                this.f1117j = z7;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i4 != 0 ? IconCompat.k((Resources) null, "", i4) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f1106k;
        }

        public boolean b() {
            return this.f1100e;
        }

        public Bundle c() {
            return this.f1096a;
        }

        public IconCompat d() {
            int i4;
            if (this.f1097b == null && (i4 = this.f1104i) != 0) {
                this.f1097b = IconCompat.k((Resources) null, "", i4);
            }
            return this.f1097b;
        }

        public s[] e() {
            return this.f1098c;
        }

        public int f() {
            return this.f1102g;
        }

        public boolean g() {
            return this.f1101f;
        }

        public CharSequence h() {
            return this.f1105j;
        }

        public boolean i() {
            return this.f1107l;
        }

        public boolean j() {
            return this.f1103h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (s[]) null, (s[]) null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, s[] sVarArr, s[] sVarArr2, boolean z4, int i4, boolean z5, boolean z6, boolean z7) {
            this.f1101f = true;
            this.f1097b = iconCompat;
            if (iconCompat != null && iconCompat.o() == 2) {
                this.f1104i = iconCompat.m();
            }
            this.f1105j = e.e(charSequence);
            this.f1106k = pendingIntent;
            this.f1096a = bundle == null ? new Bundle() : bundle;
            this.f1098c = sVarArr;
            this.f1099d = sVarArr2;
            this.f1100e = z4;
            this.f1102g = i4;
            this.f1101f = z5;
            this.f1103h = z6;
            this.f1107l = z7;
        }
    }

    public static class b extends j {

        /* renamed from: e  reason: collision with root package name */
        public IconCompat f1118e;

        /* renamed from: f  reason: collision with root package name */
        public IconCompat f1119f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1120g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f1121h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1122i;

        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: G.i$b$b  reason: collision with other inner class name */
        public static class C0015b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z4) {
                bigPictureStyle.showBigPictureWhenCollapsed(z4);
            }
        }

        public static IconCompat n(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.b((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.f((Bitmap) parcelable);
            }
            return null;
        }

        public static IconCompat q(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            return parcelable != null ? n(parcelable) : n(bundle.getParcelable("android.pictureIcon"));
        }

        public void b(h hVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(hVar.a()).setBigContentTitle(this.f1195b);
            IconCompat iconCompat = this.f1118e;
            Context context = null;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0015b.a(bigContentTitle, this.f1118e.v(hVar instanceof k ? ((k) hVar).e() : null));
                } else if (iconCompat.o() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f1118e.l());
                }
            }
            if (this.f1120g) {
                if (this.f1119f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    if (hVar instanceof k) {
                        context = ((k) hVar).e();
                    }
                    a.a(bigContentTitle, this.f1119f.v(context));
                }
            }
            if (this.f1197d) {
                bigContentTitle.setSummaryText(this.f1196c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0015b.c(bigContentTitle, this.f1122i);
                C0015b.b(bigContentTitle, this.f1121h);
            }
        }

        public String h() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public void l(Bundle bundle) {
            super.l(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f1119f = n(bundle.getParcelable("android.largeIcon.big"));
                this.f1120g = true;
            }
            this.f1118e = q(bundle);
            this.f1122i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        public b o(Bitmap bitmap) {
            this.f1119f = bitmap == null ? null : IconCompat.f(bitmap);
            this.f1120g = true;
            return this;
        }

        public b p(Bitmap bitmap) {
            this.f1118e = bitmap == null ? null : IconCompat.f(bitmap);
            return this;
        }

        public b r(CharSequence charSequence) {
            this.f1195b = e.e(charSequence);
            return this;
        }

        public b s(CharSequence charSequence) {
            this.f1196c = e.e(charSequence);
            this.f1197d = true;
            return this;
        }
    }

    public static class c extends j {

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f1123e;

        public void a(Bundle bundle) {
            super.a(bundle);
        }

        public void b(h hVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(hVar.a()).setBigContentTitle(this.f1195b).bigText(this.f1123e);
            if (this.f1197d) {
                bigText.setSummaryText(this.f1196c);
            }
        }

        public String h() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public void l(Bundle bundle) {
            super.l(bundle);
            this.f1123e = bundle.getCharSequence("android.bigText");
        }

        public c n(CharSequence charSequence) {
            this.f1123e = e.e(charSequence);
            return this;
        }

        public c o(CharSequence charSequence) {
            this.f1195b = e.e(charSequence);
            return this;
        }

        public c p(CharSequence charSequence) {
            this.f1196c = e.e(charSequence);
            this.f1197d = true;
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class f extends j {

        /* renamed from: e  reason: collision with root package name */
        public int f1172e;

        /* renamed from: f  reason: collision with root package name */
        public q f1173f;

        /* renamed from: g  reason: collision with root package name */
        public PendingIntent f1174g;

        /* renamed from: h  reason: collision with root package name */
        public PendingIntent f1175h;

        /* renamed from: i  reason: collision with root package name */
        public PendingIntent f1176i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1177j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f1178k;

        /* renamed from: l  reason: collision with root package name */
        public Integer f1179l;

        /* renamed from: m  reason: collision with root package name */
        public IconCompat f1180m;

        /* renamed from: n  reason: collision with root package name */
        public CharSequence f1181n;

        public static class a {
            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        public static class b {
            public static Parcelable a(Icon icon) {
                return icon;
            }

            public static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            public static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        public static class c {
            public static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            public static Parcelable b(Person person) {
                return person;
            }
        }

        public static class d {
            public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, int i4) {
                return callStyle.setAnswerButtonColorHint(i4);
            }

            public static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z4) {
                return builder.setAuthenticationRequired(z4);
            }

            public static Notification.CallStyle f(Notification.CallStyle callStyle, int i4) {
                return callStyle.setDeclineButtonColorHint(i4);
            }

            public static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z4) {
                return callStyle.setIsVideo(z4);
            }

            public static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            public static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f1172e);
            bundle.putBoolean("android.callIsVideo", this.f1177j);
            q qVar = this.f1173f;
            if (qVar != null) {
                bundle.putParcelable("android.callPerson", c.b(qVar.i()));
            }
            IconCompat iconCompat = this.f1180m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.v(this.f1194a.f1146a)));
            }
            bundle.putCharSequence("android.verificationText", this.f1181n);
            bundle.putParcelable("android.answerIntent", this.f1174g);
            bundle.putParcelable("android.declineIntent", this.f1175h);
            bundle.putParcelable("android.hangUpIntent", this.f1176i);
            Integer num = this.f1178k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f1179l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        public void b(h hVar) {
            Notification.CallStyle callStyle = null;
            if (Build.VERSION.SDK_INT >= 31) {
                int i4 = this.f1172e;
                if (i4 == 1) {
                    callStyle = d.a(this.f1173f.i(), this.f1175h, this.f1174g);
                } else if (i4 == 2) {
                    callStyle = d.b(this.f1173f.i(), this.f1176i);
                } else if (i4 == 3) {
                    callStyle = d.c(this.f1173f.i(), this.f1176i, this.f1174g);
                } else if (Log.isLoggable("NotifCompat", 3)) {
                    Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f1172e));
                }
                if (callStyle != null) {
                    callStyle.setBuilder(hVar.a());
                    Integer num = this.f1178k;
                    if (num != null) {
                        d.d(callStyle, num.intValue());
                    }
                    Integer num2 = this.f1179l;
                    if (num2 != null) {
                        d.f(callStyle, num2.intValue());
                    }
                    d.i(callStyle, this.f1181n);
                    IconCompat iconCompat = this.f1180m;
                    if (iconCompat != null) {
                        d.h(callStyle, iconCompat.v(this.f1194a.f1146a));
                    }
                    d.g(callStyle, this.f1177j);
                    return;
                }
                return;
            }
            Notification.Builder a4 = hVar.a();
            q qVar = this.f1173f;
            a4.setContentTitle(qVar != null ? qVar.e() : null);
            Bundle bundle = this.f1194a.f1128E;
            if (bundle != null && bundle.containsKey("android.text")) {
                callStyle = this.f1194a.f1128E.getCharSequence("android.text");
            }
            if (callStyle == null) {
                callStyle = o();
            }
            a4.setContentText(callStyle);
            q qVar2 = this.f1173f;
            if (qVar2 != null) {
                if (qVar2.c() != null) {
                    b.c(a4, this.f1173f.c().v(this.f1194a.f1146a));
                }
                c.a(a4, this.f1173f.i());
            }
            a.b(a4, "call");
        }

        public String h() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public void l(Bundle bundle) {
            super.l(bundle);
            this.f1172e = bundle.getInt("android.callType");
            this.f1177j = bundle.getBoolean("android.callIsVideo");
            if (bundle.containsKey("android.callPerson")) {
                this.f1173f = q.a((Person) bundle.getParcelable("android.callPerson"));
            } else if (bundle.containsKey("android.callPersonCompat")) {
                this.f1173f = q.b(bundle.getBundle("android.callPersonCompat"));
            }
            if (bundle.containsKey("android.verificationIcon")) {
                this.f1180m = IconCompat.b((Icon) bundle.getParcelable("android.verificationIcon"));
            } else if (bundle.containsKey("android.verificationIconCompat")) {
                this.f1180m = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
            }
            this.f1181n = bundle.getCharSequence("android.verificationText");
            this.f1174g = (PendingIntent) bundle.getParcelable("android.answerIntent");
            this.f1175h = (PendingIntent) bundle.getParcelable("android.declineIntent");
            this.f1176i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
            Integer num = null;
            this.f1178k = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
            if (bundle.containsKey("android.declineColor")) {
                num = Integer.valueOf(bundle.getInt("android.declineColor"));
            }
            this.f1179l = num;
        }

        public ArrayList n() {
            a s4 = s();
            a r4 = r();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(s4);
            ArrayList<a> arrayList2 = this.f1194a.f1147b;
            int i4 = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!p(aVar) && i4 > 1) {
                        arrayList.add(aVar);
                        i4--;
                    }
                    if (r4 != null && i4 == 1) {
                        arrayList.add(r4);
                        i4--;
                    }
                }
            }
            if (r4 != null && i4 >= 1) {
                arrayList.add(r4);
            }
            return arrayList;
        }

        public final String o() {
            int i4 = this.f1172e;
            if (i4 == 1) {
                return this.f1194a.f1146a.getResources().getString(F.e.f993e);
            }
            if (i4 == 2) {
                return this.f1194a.f1146a.getResources().getString(F.e.f994f);
            }
            if (i4 != 3) {
                return null;
            }
            return this.f1194a.f1146a.getResources().getString(F.e.f995g);
        }

        public final boolean p(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        public final a q(int i4, int i5, Integer num, int i6, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(H.a.c(this.f1194a.f1146a, i6));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f1194a.f1146a.getResources().getString(i5));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a b4 = new a.C0014a(IconCompat.j(this.f1194a.f1146a, i4), spannableStringBuilder, pendingIntent).b();
            b4.c().putBoolean("key_action_priority", true);
            return b4;
        }

        public final a r() {
            int i4 = F.c.f945b;
            int i5 = F.c.f944a;
            PendingIntent pendingIntent = this.f1174g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z4 = this.f1177j;
            return q(z4 ? i4 : i5, z4 ? F.e.f990b : F.e.f989a, this.f1178k, F.b.f942a, pendingIntent);
        }

        public final a s() {
            int i4 = F.c.f946c;
            PendingIntent pendingIntent = this.f1175h;
            if (pendingIntent == null) {
                return q(i4, F.e.f992d, this.f1179l, F.b.f943b, this.f1176i);
            }
            return q(i4, F.e.f991c, this.f1179l, F.b.f943b, pendingIntent);
        }
    }

    public static class g extends j {

        public static class a {
            public static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        public void b(h hVar) {
            hVar.a().setStyle(a.a());
        }

        public String h() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        public RemoteViews i(h hVar) {
            return null;
        }

        public RemoteViews j(h hVar) {
            return null;
        }

        public RemoteViews k(h hVar) {
            return null;
        }
    }

    public static class h extends j {

        /* renamed from: e  reason: collision with root package name */
        public ArrayList f1182e = new ArrayList();

        public void b(h hVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(hVar.a()).setBigContentTitle(this.f1195b);
            if (this.f1197d) {
                bigContentTitle.setSummaryText(this.f1196c);
            }
            Iterator it = this.f1182e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        public String h() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public void l(Bundle bundle) {
            super.l(bundle);
            this.f1182e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f1182e, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        public h n(CharSequence charSequence) {
            if (charSequence != null) {
                this.f1182e.add(e.e(charSequence));
            }
            return this;
        }

        public h o(CharSequence charSequence) {
            this.f1195b = e.e(charSequence);
            return this;
        }

        public h p(CharSequence charSequence) {
            this.f1196c = e.e(charSequence);
            this.f1197d = true;
            return this;
        }
    }

    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public e f1194a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f1195b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f1196c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1197d = false;

        public static j c(String str) {
            if (str == null) {
                return null;
            }
            char c4 = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 714386739:
                    if (str.equals("androidx.core.app.NotificationCompat$CallStyle")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        c4 = 5;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    return new g();
                case 1:
                    return new b();
                case 2:
                    return new f();
                case 3:
                    return new h();
                case 4:
                    return new c();
                case 5:
                    return new C0016i();
                default:
                    return null;
            }
        }

        public static j d(String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new b();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new c();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new h();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new C0016i();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new g();
            }
            return null;
        }

        public static j e(Bundle bundle) {
            j c4 = c(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return c4 != null ? c4 : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new C0016i() : (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) ? new b() : bundle.containsKey("android.bigText") ? new c() : bundle.containsKey("android.textLines") ? new h() : bundle.containsKey("android.callType") ? new f() : d(bundle.getString("android.template"));
        }

        public static j f(Bundle bundle) {
            j e4 = e(bundle);
            if (e4 == null) {
                return null;
            }
            try {
                e4.l(bundle);
                return e4;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        public static j g(Notification notification) {
            Bundle a4 = i.a(notification);
            if (a4 == null) {
                return null;
            }
            return f(a4);
        }

        public void a(Bundle bundle) {
            if (this.f1197d) {
                bundle.putCharSequence("android.summaryText", this.f1196c);
            }
            CharSequence charSequence = this.f1195b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String h4 = h();
            if (h4 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", h4);
            }
        }

        public abstract void b(h hVar);

        public String h() {
            return null;
        }

        public RemoteViews i(h hVar) {
            return null;
        }

        public RemoteViews j(h hVar) {
            return null;
        }

        public RemoteViews k(h hVar) {
            return null;
        }

        public void l(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f1196c = bundle.getCharSequence("android.summaryText");
                this.f1197d = true;
            }
            this.f1195b = bundle.getCharSequence("android.title.big");
        }

        public void m(e eVar) {
            if (this.f1194a != eVar) {
                this.f1194a = eVar;
                if (eVar != null) {
                    eVar.G(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        return bitmap;
    }

    /* renamed from: G.i$i  reason: collision with other inner class name */
    public static class C0016i extends j {

        /* renamed from: e  reason: collision with root package name */
        public final List f1183e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public final List f1184f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        public q f1185g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f1186h;

        /* renamed from: i  reason: collision with root package name */
        public Boolean f1187i;

        /* renamed from: G.i$i$a */
        public static class a {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            public static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* renamed from: G.i$i$b */
        public static class b {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* renamed from: G.i$i$c */
        public static class c {
            public static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z4) {
                return messagingStyle.setGroupConversation(z4);
            }
        }

        /* renamed from: G.i$i$d */
        public static final class d {

            /* renamed from: a  reason: collision with root package name */
            public final CharSequence f1188a;

            /* renamed from: b  reason: collision with root package name */
            public final long f1189b;

            /* renamed from: c  reason: collision with root package name */
            public final q f1190c;

            /* renamed from: d  reason: collision with root package name */
            public Bundle f1191d = new Bundle();

            /* renamed from: e  reason: collision with root package name */
            public String f1192e;

            /* renamed from: f  reason: collision with root package name */
            public Uri f1193f;

            /* renamed from: G.i$i$d$a */
            public static class a {
                public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j4, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j4, charSequence2);
                }

                public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* renamed from: G.i$i$d$b */
            public static class b {
                public static Parcelable a(Person person) {
                    return person;
                }

                public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j4, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j4, person);
                }
            }

            public d(CharSequence charSequence, long j4, q qVar) {
                this.f1188a = charSequence;
                this.f1189b = j4;
                this.f1190c = qVar;
            }

            public static Bundle[] a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    bundleArr[i4] = ((d) list.get(i4)).l();
                }
                return bundleArr;
            }

            public static d e(Bundle bundle) {
                try {
                    if (bundle.containsKey("text")) {
                        if (bundle.containsKey("time")) {
                            d dVar = new d(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey("person") ? q.b(bundle.getBundle("person")) : bundle.containsKey("sender_person") ? q.a((Person) bundle.getParcelable("sender_person")) : bundle.containsKey("sender") ? new q.b().f(bundle.getCharSequence("sender")).a() : null);
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                dVar.j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                dVar.d().putAll(bundle.getBundle("extras"));
                            }
                            return dVar;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            public static List f(Parcelable[] parcelableArr) {
                d e4;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Bundle bundle : parcelableArr) {
                    if ((bundle instanceof Bundle) && (e4 = e(bundle)) != null) {
                        arrayList.add(e4);
                    }
                }
                return arrayList;
            }

            public String b() {
                return this.f1192e;
            }

            public Uri c() {
                return this.f1193f;
            }

            public Bundle d() {
                return this.f1191d;
            }

            public q g() {
                return this.f1190c;
            }

            public CharSequence h() {
                return this.f1188a;
            }

            public long i() {
                return this.f1189b;
            }

            public d j(String str, Uri uri) {
                this.f1192e = str;
                this.f1193f = uri;
                return this;
            }

            public Notification.MessagingStyle.Message k() {
                q g4 = g();
                Notification.MessagingStyle.Message b4 = b.b(h(), i(), g4 == null ? null : g4.i());
                if (b() != null) {
                    a.b(b4, b(), c());
                }
                return b4;
            }

            public final Bundle l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f1188a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f1189b);
                q qVar = this.f1190c;
                if (qVar != null) {
                    bundle.putCharSequence("sender", qVar.e());
                    bundle.putParcelable("sender_person", b.a(this.f1190c.i()));
                }
                String str = this.f1192e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f1193f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f1191d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        public C0016i() {
        }

        public static C0016i o(Notification notification) {
            j g4 = j.g(notification);
            if (g4 instanceof C0016i) {
                return (C0016i) g4;
            }
            return null;
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f1185g.e());
            bundle.putBundle("android.messagingStyleUser", this.f1185g.j());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f1186h);
            if (this.f1186h != null && this.f1187i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f1186h);
            }
            if (!this.f1183e.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.f1183e));
            }
            if (!this.f1184f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f1184f));
            }
            Boolean bool = this.f1187i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        public void b(h hVar) {
            u(s());
            Notification.MessagingStyle a4 = c.a(this.f1185g.i());
            for (d k4 : this.f1183e) {
                a.a(a4, k4.k());
            }
            for (d k5 : this.f1184f) {
                b.a(a4, k5.k());
            }
            this.f1187i.booleanValue();
            a.c(a4, this.f1186h);
            c.b(a4, this.f1187i.booleanValue());
            a4.setBuilder(hVar.a());
        }

        public String h() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public void l(Bundle bundle) {
            super.l(bundle);
            this.f1183e.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                this.f1185g = q.b(bundle.getBundle("android.messagingStyleUser"));
            } else {
                this.f1185g = new q.b().f(bundle.getString("android.selfDisplayName")).a();
            }
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f1186h = charSequence;
            if (charSequence == null) {
                this.f1186h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f1183e.addAll(d.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f1184f.addAll(d.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f1187i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        public C0016i n(d dVar) {
            if (dVar != null) {
                this.f1183e.add(dVar);
                if (this.f1183e.size() > 25) {
                    this.f1183e.remove(0);
                }
            }
            return this;
        }

        public CharSequence p() {
            return this.f1186h;
        }

        public List q() {
            return this.f1183e;
        }

        public q r() {
            return this.f1185g;
        }

        public boolean s() {
            e eVar = this.f1194a;
            if (eVar != null && eVar.f1146a.getApplicationInfo().targetSdkVersion < 28 && this.f1187i == null) {
                return this.f1186h != null;
            }
            Boolean bool = this.f1187i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public C0016i t(CharSequence charSequence) {
            this.f1186h = charSequence;
            return this;
        }

        public C0016i u(boolean z4) {
            this.f1187i = Boolean.valueOf(z4);
            return this;
        }

        public C0016i(q qVar) {
            if (!TextUtils.isEmpty(qVar.e())) {
                this.f1185g = qVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    public static class e {

        /* renamed from: A  reason: collision with root package name */
        public boolean f1124A;

        /* renamed from: B  reason: collision with root package name */
        public boolean f1125B;

        /* renamed from: C  reason: collision with root package name */
        public boolean f1126C;

        /* renamed from: D  reason: collision with root package name */
        public String f1127D;

        /* renamed from: E  reason: collision with root package name */
        public Bundle f1128E;

        /* renamed from: F  reason: collision with root package name */
        public int f1129F;

        /* renamed from: G  reason: collision with root package name */
        public int f1130G;

        /* renamed from: H  reason: collision with root package name */
        public Notification f1131H;

        /* renamed from: I  reason: collision with root package name */
        public RemoteViews f1132I;

        /* renamed from: J  reason: collision with root package name */
        public RemoteViews f1133J;

        /* renamed from: K  reason: collision with root package name */
        public RemoteViews f1134K;

        /* renamed from: L  reason: collision with root package name */
        public String f1135L;

        /* renamed from: M  reason: collision with root package name */
        public int f1136M;

        /* renamed from: N  reason: collision with root package name */
        public String f1137N;

        /* renamed from: O  reason: collision with root package name */
        public long f1138O;

        /* renamed from: P  reason: collision with root package name */
        public int f1139P;

        /* renamed from: Q  reason: collision with root package name */
        public int f1140Q;

        /* renamed from: R  reason: collision with root package name */
        public boolean f1141R;

        /* renamed from: S  reason: collision with root package name */
        public Notification f1142S;

        /* renamed from: T  reason: collision with root package name */
        public boolean f1143T;

        /* renamed from: U  reason: collision with root package name */
        public Object f1144U;

        /* renamed from: V  reason: collision with root package name */
        public ArrayList f1145V;

        /* renamed from: a  reason: collision with root package name */
        public Context f1146a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f1147b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList f1148c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList f1149d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f1150e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f1151f;

        /* renamed from: g  reason: collision with root package name */
        public PendingIntent f1152g;

        /* renamed from: h  reason: collision with root package name */
        public PendingIntent f1153h;

        /* renamed from: i  reason: collision with root package name */
        public RemoteViews f1154i;

        /* renamed from: j  reason: collision with root package name */
        public IconCompat f1155j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f1156k;

        /* renamed from: l  reason: collision with root package name */
        public int f1157l;

        /* renamed from: m  reason: collision with root package name */
        public int f1158m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1159n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1160o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1161p;

        /* renamed from: q  reason: collision with root package name */
        public j f1162q;

        /* renamed from: r  reason: collision with root package name */
        public CharSequence f1163r;

        /* renamed from: s  reason: collision with root package name */
        public CharSequence f1164s;

        /* renamed from: t  reason: collision with root package name */
        public CharSequence[] f1165t;

        /* renamed from: u  reason: collision with root package name */
        public int f1166u;

        /* renamed from: v  reason: collision with root package name */
        public int f1167v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f1168w;

        /* renamed from: x  reason: collision with root package name */
        public String f1169x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f1170y;

        /* renamed from: z  reason: collision with root package name */
        public String f1171z;

        public static class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i4) {
                return builder.setContentType(i4);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i4) {
                return builder.setLegacyStreamType(i4);
            }

            public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i4) {
                return builder.setUsage(i4);
            }
        }

        public e(Context context, String str) {
            this.f1147b = new ArrayList();
            this.f1148c = new ArrayList();
            this.f1149d = new ArrayList();
            this.f1159n = true;
            this.f1124A = false;
            this.f1129F = 0;
            this.f1130G = 0;
            this.f1136M = 0;
            this.f1139P = 0;
            this.f1140Q = 0;
            Notification notification = new Notification();
            this.f1142S = notification;
            this.f1146a = context;
            this.f1135L = str;
            notification.when = System.currentTimeMillis();
            this.f1142S.audioStreamType = -1;
            this.f1158m = 0;
            this.f1145V = new ArrayList();
            this.f1141R = true;
        }

        public static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e A(int i4, int i5, boolean z4) {
            this.f1166u = i4;
            this.f1167v = i5;
            this.f1168w = z4;
            return this;
        }

        public e B(String str) {
            this.f1137N = str;
            return this;
        }

        public e C(boolean z4) {
            this.f1159n = z4;
            return this;
        }

        public e D(boolean z4) {
            this.f1143T = z4;
            return this;
        }

        public e E(int i4) {
            this.f1142S.icon = i4;
            return this;
        }

        public e F(Uri uri) {
            Notification notification = this.f1142S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e4 = a.e(a.c(a.b(), 4), 5);
            this.f1142S.audioAttributes = a.a(e4);
            return this;
        }

        public e G(j jVar) {
            if (this.f1162q != jVar) {
                this.f1162q = jVar;
                if (jVar != null) {
                    jVar.m(this);
                }
            }
            return this;
        }

        public e H(CharSequence charSequence) {
            this.f1163r = e(charSequence);
            return this;
        }

        public e I(CharSequence charSequence) {
            this.f1142S.tickerText = e(charSequence);
            return this;
        }

        public e J(long j4) {
            this.f1138O = j4;
            return this;
        }

        public e K(boolean z4) {
            this.f1160o = z4;
            return this;
        }

        public e L(long[] jArr) {
            this.f1142S.vibrate = jArr;
            return this;
        }

        public e M(int i4) {
            this.f1130G = i4;
            return this;
        }

        public e N(long j4) {
            this.f1142S.when = j4;
            return this;
        }

        public e a(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1147b.add(new a(i4, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f1147b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new k(this).c();
        }

        public Bundle d() {
            if (this.f1128E == null) {
                this.f1128E = new Bundle();
            }
            return this.f1128E;
        }

        public e f(boolean z4) {
            o(16, z4);
            return this;
        }

        public e g(String str) {
            this.f1127D = str;
            return this;
        }

        public e h(String str) {
            this.f1135L = str;
            return this;
        }

        public e i(boolean z4) {
            this.f1161p = z4;
            d().putBoolean("android.chronometerCountDown", z4);
            return this;
        }

        public e j(int i4) {
            this.f1129F = i4;
            return this;
        }

        public e k(boolean z4) {
            this.f1125B = z4;
            this.f1126C = true;
            return this;
        }

        public e l(PendingIntent pendingIntent) {
            this.f1152g = pendingIntent;
            return this;
        }

        public e m(CharSequence charSequence) {
            this.f1151f = e(charSequence);
            return this;
        }

        public e n(CharSequence charSequence) {
            this.f1150e = e(charSequence);
            return this;
        }

        public final void o(int i4, boolean z4) {
            if (z4) {
                Notification notification = this.f1142S;
                notification.flags = i4 | notification.flags;
                return;
            }
            Notification notification2 = this.f1142S;
            notification2.flags = (~i4) & notification2.flags;
        }

        public e p(PendingIntent pendingIntent, boolean z4) {
            this.f1153h = pendingIntent;
            o(128, z4);
            return this;
        }

        public e q(String str) {
            this.f1169x = str;
            return this;
        }

        public e r(int i4) {
            this.f1139P = i4;
            return this;
        }

        public e s(boolean z4) {
            this.f1170y = z4;
            return this;
        }

        public e t(Bitmap bitmap) {
            this.f1155j = bitmap == null ? null : IconCompat.f(i.b(this.f1146a, bitmap));
            return this;
        }

        public e u(int i4, int i5, int i6) {
            Notification notification = this.f1142S;
            notification.ledARGB = i4;
            notification.ledOnMS = i5;
            notification.ledOffMS = i6;
            notification.flags = ((i5 == 0 || i6 == 0) ? 0 : 1) | (notification.flags & -2);
            return this;
        }

        public e v(boolean z4) {
            this.f1124A = z4;
            return this;
        }

        public e w(int i4) {
            this.f1157l = i4;
            return this;
        }

        public e x(boolean z4) {
            o(2, z4);
            return this;
        }

        public e y(boolean z4) {
            o(8, z4);
            return this;
        }

        public e z(int i4) {
            this.f1158m = i4;
            return this;
        }

        public e(Context context) {
            this(context, (String) null);
        }
    }
}
