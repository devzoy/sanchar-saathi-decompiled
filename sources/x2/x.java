package X2;

import Y2.i;
import Y2.j;
import android.os.Bundle;
import io.flutter.plugin.editing.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class x {

    /* renamed from: a  reason: collision with root package name */
    public final j f3659a;

    /* renamed from: b  reason: collision with root package name */
    public f f3660b;

    /* renamed from: c  reason: collision with root package name */
    public final j.c f3661c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(i iVar, j.d dVar) {
            Bundle bundle;
            i iVar2 = iVar;
            j.d dVar2 = dVar;
            if (x.this.f3660b != null) {
                String str = iVar2.f3766a;
                Object obj = iVar2.f3767b;
                M2.b.f("TextInputChannel", "Received '" + str + "' message.");
                str.hashCode();
                char c4 = 65535;
                switch (str.hashCode()) {
                    case -1779068172:
                        if (str.equals("TextInput.setPlatformViewClient")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case -1015421462:
                        if (str.equals("TextInput.setEditingState")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case -37561188:
                        if (str.equals("TextInput.setClient")) {
                            c4 = 2;
                            break;
                        }
                        break;
                    case 270476819:
                        if (str.equals("TextInput.hide")) {
                            c4 = 3;
                            break;
                        }
                        break;
                    case 270803918:
                        if (str.equals("TextInput.show")) {
                            c4 = 4;
                            break;
                        }
                        break;
                    case 649192816:
                        if (str.equals("TextInput.sendAppPrivateCommand")) {
                            c4 = 5;
                            break;
                        }
                        break;
                    case 1204752139:
                        if (str.equals("TextInput.setEditableSizeAndTransform")) {
                            c4 = 6;
                            break;
                        }
                        break;
                    case 1727570905:
                        if (str.equals("TextInput.finishAutofillContext")) {
                            c4 = 7;
                            break;
                        }
                        break;
                    case 1904427655:
                        if (str.equals("TextInput.clearClient")) {
                            c4 = 8;
                            break;
                        }
                        break;
                    case 2113369584:
                        if (str.equals("TextInput.requestAutofill")) {
                            c4 = 9;
                            break;
                        }
                        break;
                }
                switch (c4) {
                    case 0:
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            x.this.f3660b.d(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            dVar2.a((Object) null);
                            return;
                        } catch (JSONException e4) {
                            dVar2.b("error", e4.getMessage(), (Object) null);
                            return;
                        }
                    case 1:
                        try {
                            x.this.f3660b.g(e.a((JSONObject) obj));
                            dVar2.a((Object) null);
                            return;
                        } catch (JSONException e5) {
                            dVar2.b("error", e5.getMessage(), (Object) null);
                            return;
                        }
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            x.this.f3660b.h(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                            dVar2.a((Object) null);
                            return;
                        } catch (NoSuchFieldException | JSONException e6) {
                            dVar2.b("error", e6.getMessage(), (Object) null);
                            return;
                        }
                    case 3:
                        x.this.f3660b.j();
                        dVar2.a((Object) null);
                        return;
                    case 4:
                        x.this.f3660b.a();
                        dVar2.a((Object) null);
                        return;
                    case 5:
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            x.this.f3660b.c(string, bundle);
                            dVar2.a((Object) null);
                            return;
                        } catch (JSONException e7) {
                            dVar2.b("error", e7.getMessage(), (Object) null);
                            return;
                        }
                    case 6:
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d4 = jSONObject3.getDouble("width");
                            double d5 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i4 = 0; i4 < 16; i4++) {
                                dArr[i4] = jSONArray2.getDouble(i4);
                            }
                            x.this.f3660b.e(d4, d5, dArr);
                            dVar2.a((Object) null);
                            return;
                        } catch (JSONException e8) {
                            dVar2.b("error", e8.getMessage(), (Object) null);
                            return;
                        }
                    case 7:
                        x.this.f3660b.i(((Boolean) obj).booleanValue());
                        dVar2.a((Object) null);
                        return;
                    case 8:
                        x.this.f3660b.b();
                        dVar2.a((Object) null);
                        return;
                    case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                        x.this.f3660b.f();
                        dVar2.a((Object) null);
                        return;
                    default:
                        dVar.c();
                        return;
                }
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3663a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3664b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3665c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f3666d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f3667e;

        /* renamed from: f  reason: collision with root package name */
        public final d f3668f;

        /* renamed from: g  reason: collision with root package name */
        public final c f3669g;

        /* renamed from: h  reason: collision with root package name */
        public final Integer f3670h;

        /* renamed from: i  reason: collision with root package name */
        public final String f3671i;

        /* renamed from: j  reason: collision with root package name */
        public final a f3672j;

        /* renamed from: k  reason: collision with root package name */
        public final String[] f3673k;

        /* renamed from: l  reason: collision with root package name */
        public final b[] f3674l;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f3675a;

            /* renamed from: b  reason: collision with root package name */
            public final String[] f3676b;

            /* renamed from: c  reason: collision with root package name */
            public final e f3677c;

            /* renamed from: d  reason: collision with root package name */
            public final String f3678d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f3675a = str;
                this.f3676b = strArr;
                this.f3678d = str2;
                this.f3677c = eVar;
            }

            public static a a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    strArr[i4] = b(jSONArray.getString(i4));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            public static String b(String str) {
                str.hashCode();
                char c4 = 65535;
                switch (str.hashCode()) {
                    case -2058889126:
                        if (str.equals("birthdayYear")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case -1917283616:
                        if (str.equals("oneTimeCode")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case -1844815832:
                        if (str.equals("creditCardExpirationMonth")) {
                            c4 = 2;
                            break;
                        }
                        break;
                    case -1825589953:
                        if (str.equals("telephoneNumberNational")) {
                            c4 = 3;
                            break;
                        }
                        break;
                    case -1821235109:
                        if (str.equals("newPassword")) {
                            c4 = 4;
                            break;
                        }
                        break;
                    case -1757573738:
                        if (str.equals("creditCardSecurityCode")) {
                            c4 = 5;
                            break;
                        }
                        break;
                    case -1682373820:
                        if (str.equals("creditCardExpirationDay")) {
                            c4 = 6;
                            break;
                        }
                        break;
                    case -1658955742:
                        if (str.equals("fullStreetAddress")) {
                            c4 = 7;
                            break;
                        }
                        break;
                    case -1567118045:
                        if (str.equals("telephoneNumberDevice")) {
                            c4 = 8;
                            break;
                        }
                        break;
                    case -1476752575:
                        if (str.equals("countryName")) {
                            c4 = 9;
                            break;
                        }
                        break;
                    case -1413737489:
                        if (str.equals("middleInitial")) {
                            c4 = 10;
                            break;
                        }
                        break;
                    case -1377792129:
                        if (str.equals("addressCity")) {
                            c4 = 11;
                            break;
                        }
                        break;
                    case -1249512767:
                        if (str.equals("gender")) {
                            c4 = 12;
                            break;
                        }
                        break;
                    case -1186060294:
                        if (str.equals("postalAddressExtendedPostalCode")) {
                            c4 = 13;
                            break;
                        }
                        break;
                    case -1151034798:
                        if (str.equals("creditCardNumber")) {
                            c4 = 14;
                            break;
                        }
                        break;
                    case -835992323:
                        if (str.equals("namePrefix")) {
                            c4 = 15;
                            break;
                        }
                        break;
                    case -818219584:
                        if (str.equals("middleName")) {
                            c4 = 16;
                            break;
                        }
                        break;
                    case -747304516:
                        if (str.equals("nameSuffix")) {
                            c4 = 17;
                            break;
                        }
                        break;
                    case -613980922:
                        if (str.equals("creditCardExpirationDate")) {
                            c4 = 18;
                            break;
                        }
                        break;
                    case -613352043:
                        if (str.equals("creditCardExpirationYear")) {
                            c4 = 19;
                            break;
                        }
                        break;
                    case -549230602:
                        if (str.equals("telephoneNumberCountryCode")) {
                            c4 = 20;
                            break;
                        }
                        break;
                    case -265713450:
                        if (str.equals("username")) {
                            c4 = 21;
                            break;
                        }
                        break;
                    case 3373707:
                        if (str.equals("name")) {
                            c4 = 22;
                            break;
                        }
                        break;
                    case 96619420:
                        if (str.equals("email")) {
                            c4 = 23;
                            break;
                        }
                        break;
                    case 253202685:
                        if (str.equals("addressState")) {
                            c4 = 24;
                            break;
                        }
                        break;
                    case 588174851:
                        if (str.equals("birthdayMonth")) {
                            c4 = 25;
                            break;
                        }
                        break;
                    case 798554127:
                        if (str.equals("familyName")) {
                            c4 = 26;
                            break;
                        }
                        break;
                    case 892233837:
                        if (str.equals("telephoneNumber")) {
                            c4 = 27;
                            break;
                        }
                        break;
                    case 991032982:
                        if (str.equals("newUsername")) {
                            c4 = 28;
                            break;
                        }
                        break;
                    case 1069376125:
                        if (str.equals("birthday")) {
                            c4 = 29;
                            break;
                        }
                        break;
                    case 1216985755:
                        if (str.equals("password")) {
                            c4 = 30;
                            break;
                        }
                        break;
                    case 1469046696:
                        if (str.equals("givenName")) {
                            c4 = 31;
                            break;
                        }
                        break;
                    case 1662667945:
                        if (str.equals("postalAddress")) {
                            c4 = ' ';
                            break;
                        }
                        break;
                    case 1921869058:
                        if (str.equals("postalAddressExtended")) {
                            c4 = '!';
                            break;
                        }
                        break;
                    case 2011152728:
                        if (str.equals("postalCode")) {
                            c4 = '\"';
                            break;
                        }
                        break;
                    case 2011773919:
                        if (str.equals("birthdayDay")) {
                            c4 = '#';
                            break;
                        }
                        break;
                }
                switch (c4) {
                    case 0:
                        return "birthDateYear";
                    case 1:
                        return "smsOTPCode";
                    case 2:
                        return "creditCardExpirationMonth";
                    case 3:
                        return "phoneNational";
                    case 4:
                        return "newPassword";
                    case 5:
                        return "creditCardSecurityCode";
                    case 6:
                        return "creditCardExpirationDay";
                    case 7:
                        return "streetAddress";
                    case 8:
                        return "phoneNumberDevice";
                    case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                        return "addressCountry";
                    case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                        return "personMiddleInitial";
                    case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                        return "addressLocality";
                    case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                        return "gender";
                    case 13:
                        return "extendedPostalCode";
                    case 14:
                        return "creditCardNumber";
                    case 15:
                        return "personNamePrefix";
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                        return "personMiddleName";
                    case 17:
                        return "personNameSuffix";
                    case 18:
                        return "creditCardExpirationDate";
                    case 19:
                        return "creditCardExpirationYear";
                    case Q0.i.f2380c:
                        return "phoneCountryCode";
                    case 21:
                        return "username";
                    case 22:
                        return "personName";
                    case 23:
                        return "emailAddress";
                    case 24:
                        return "addressRegion";
                    case 25:
                        return "birthDateMonth";
                    case 26:
                        return "personFamilyName";
                    case 27:
                        return "phoneNumber";
                    case 28:
                        return "newUsername";
                    case 29:
                        return "birthDateFull";
                    case 30:
                        return "password";
                    case 31:
                        return "personGivenName";
                    case ' ':
                        return "postalAddress";
                    case '!':
                        return "extendedAddress";
                    case '\"':
                        return "postalCode";
                    case '#':
                        return "birthDateDay";
                    default:
                        return str;
                }
            }
        }

        public b(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.f3663a = z4;
            this.f3664b = z5;
            this.f3665c = z6;
            this.f3666d = z7;
            this.f3667e = z8;
            this.f3668f = dVar;
            this.f3669g = cVar;
            this.f3670h = num;
            this.f3671i = str;
            this.f3672j = aVar;
            this.f3673k = strArr;
            this.f3674l = bVarArr;
        }

        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            JSONObject jSONObject2 = jSONObject;
            String string = jSONObject2.getString("inputAction");
            if (string != null) {
                a aVar = null;
                if (!jSONObject2.isNull("fields")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("fields");
                    int length = jSONArray.length();
                    b[] bVarArr2 = new b[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        bVarArr2[i4] = a(jSONArray.getJSONObject(i4));
                    }
                    bVarArr = bVarArr2;
                } else {
                    bVarArr = null;
                }
                Integer b4 = b(string);
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray2 = jSONObject2.isNull("contentCommitMimeTypes") ? null : jSONObject2.getJSONArray("contentCommitMimeTypes");
                if (jSONArray2 != null) {
                    for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                        arrayList.add(jSONArray2.optString(i5));
                    }
                }
                boolean optBoolean = jSONObject2.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject2.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject2.optBoolean("enableSuggestions");
                boolean optBoolean4 = jSONObject2.optBoolean("enableIMEPersonalizedLearning");
                boolean optBoolean5 = jSONObject2.optBoolean("enableDeltaModel");
                d f4 = d.f(jSONObject2.getString("textCapitalization"));
                c a4 = c.a(jSONObject2.getJSONObject("inputType"));
                String string2 = jSONObject2.isNull("actionLabel") ? null : jSONObject2.getString("actionLabel");
                if (!jSONObject2.isNull("autofill")) {
                    aVar = a.a(jSONObject2.getJSONObject("autofill"));
                }
                return new b(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, f4, a4, b4, string2, aVar, (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Integer b(java.lang.String r12) {
            /*
                r0 = 7
                r1 = 6
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r12.hashCode()
                r6 = 1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r8 = 0
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                r10 = -1
                int r11 = r12.hashCode()
                switch(r11) {
                    case -810971940: goto L_0x0076;
                    case -737377923: goto L_0x006d;
                    case -737089298: goto L_0x0062;
                    case -737080013: goto L_0x0057;
                    case -736940669: goto L_0x004c;
                    case 469250275: goto L_0x0041;
                    case 1241689507: goto L_0x0036;
                    case 1539450297: goto L_0x002b;
                    case 2110497650: goto L_0x001e;
                    default: goto L_0x001b;
                }
            L_0x001b:
                r6 = r10
                goto L_0x0080
            L_0x001e:
                java.lang.String r6 = "TextInputAction.previous"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L_0x0027
                goto L_0x001b
            L_0x0027:
                r6 = 8
                goto L_0x0080
            L_0x002b:
                java.lang.String r6 = "TextInputAction.newline"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L_0x0034
                goto L_0x001b
            L_0x0034:
                r6 = r0
                goto L_0x0080
            L_0x0036:
                java.lang.String r6 = "TextInputAction.go"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L_0x003f
                goto L_0x001b
            L_0x003f:
                r6 = r1
                goto L_0x0080
            L_0x0041:
                java.lang.String r6 = "TextInputAction.search"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L_0x004a
                goto L_0x001b
            L_0x004a:
                r6 = r2
                goto L_0x0080
            L_0x004c:
                java.lang.String r6 = "TextInputAction.send"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L_0x0055
                goto L_0x001b
            L_0x0055:
                r6 = r3
                goto L_0x0080
            L_0x0057:
                java.lang.String r6 = "TextInputAction.none"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L_0x0060
                goto L_0x001b
            L_0x0060:
                r6 = r4
                goto L_0x0080
            L_0x0062:
                java.lang.String r6 = "TextInputAction.next"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L_0x006b
                goto L_0x001b
            L_0x006b:
                r6 = r5
                goto L_0x0080
            L_0x006d:
                java.lang.String r8 = "TextInputAction.done"
                boolean r12 = r12.equals(r8)
                if (r12 != 0) goto L_0x0080
                goto L_0x001b
            L_0x0076:
                java.lang.String r6 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L_0x007f
                goto L_0x001b
            L_0x007f:
                r6 = r8
            L_0x0080:
                switch(r6) {
                    case 0: goto L_0x00a4;
                    case 1: goto L_0x009f;
                    case 2: goto L_0x009a;
                    case 3: goto L_0x0099;
                    case 4: goto L_0x0094;
                    case 5: goto L_0x008f;
                    case 6: goto L_0x008a;
                    case 7: goto L_0x0089;
                    case 8: goto L_0x0084;
                    default: goto L_0x0083;
                }
            L_0x0083:
                return r9
            L_0x0084:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
                return r12
            L_0x0089:
                return r7
            L_0x008a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L_0x008f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L_0x0094:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L_0x0099:
                return r7
            L_0x009a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            L_0x009f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L_0x00a4:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: X2.x.b.b(java.lang.String):java.lang.Integer");
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f3679a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3680b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3681c;

        public c(g gVar, boolean z4, boolean z5) {
            this.f3679a = gVar;
            this.f3680b = z4;
            this.f3681c = z5;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.f(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        

        /* renamed from: e  reason: collision with root package name */
        public final String f3687e;

        /* access modifiers changed from: public */
        d(String str) {
            this.f3687e = str;
        }

        public static d f(String str) {
            for (d dVar : values()) {
                if (dVar.f3687e.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f3688a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3689b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3690c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3691d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3692e;

        public e(String str, int i4, int i5, int i6, int i7) {
            if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i5 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i4) + ", " + String.valueOf(i5) + ")");
            } else if (!(i6 == -1 && i7 == -1) && (i6 < 0 || i6 > i7)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i6) + ", " + String.valueOf(i7) + ")");
            } else if (i7 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i6));
            } else if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i4));
            } else if (i5 <= str.length()) {
                this.f3688a = str;
                this.f3689b = i4;
                this.f3690c = i5;
                this.f3691d = i6;
                this.f3692e = i7;
            } else {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i5));
            }
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i4 = this.f3691d;
            return i4 >= 0 && this.f3692e > i4;
        }

        public boolean c() {
            return this.f3689b >= 0;
        }
    }

    public interface f {
        void a();

        void b();

        void c(String str, Bundle bundle);

        void d(int i4, boolean z4);

        void e(double d4, double d5, double[] dArr);

        void f();

        void g(e eVar);

        void h(int i4, b bVar);

        void i(boolean z4);

        void j();
    }

    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none"),
        WEB_SEARCH("TextInputType.webSearch"),
        TWITTER("TextInputType.twitter");
        

        /* renamed from: e  reason: collision with root package name */
        public final String f3707e;

        /* access modifiers changed from: public */
        g(String str) {
            this.f3707e = str;
        }

        public static g f(String str) {
            for (g gVar : values()) {
                if (gVar.f3707e.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public x(P2.a aVar) {
        a aVar2 = new a();
        this.f3661c = aVar2;
        j jVar = new j(aVar, "flutter/textinput", Y2.f.f3765a);
        this.f3659a = jVar;
        jVar.e(aVar2);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((o) it.next()).b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    public static HashMap d(String str, int i4, int i5, int i6, int i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i4));
        hashMap.put("selectionExtent", Integer.valueOf(i5));
        hashMap.put("composingBase", Integer.valueOf(i6));
        hashMap.put("composingExtent", Integer.valueOf(i7));
        return hashMap;
    }

    public void b(int i4, Map map) {
        M2.b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.f3659a.c("TextInputClient.performAction", Arrays.asList(new Object[]{Integer.valueOf(i4), "TextInputAction.commitContent", map}));
    }

    public void e(int i4) {
        M2.b.f("TextInputChannel", "Sending 'done' message.");
        this.f3659a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.done"}));
    }

    public void f(int i4) {
        M2.b.f("TextInputChannel", "Sending 'go' message.");
        this.f3659a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.go"}));
    }

    public void g(int i4) {
        M2.b.f("TextInputChannel", "Sending 'newline' message.");
        this.f3659a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.newline"}));
    }

    public void h(int i4) {
        M2.b.f("TextInputChannel", "Sending 'next' message.");
        this.f3659a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.next"}));
    }

    public void i(int i4, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof byte[]) {
                    hashMap2.put(next, bundle.getByteArray(next));
                } else if (obj instanceof Byte) {
                    hashMap2.put(next, Byte.valueOf(bundle.getByte(next)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(next, bundle.getCharArray(next));
                } else if (obj instanceof Character) {
                    hashMap2.put(next, Character.valueOf(bundle.getChar(next)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(next, bundle.getCharSequenceArray(next));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(next, bundle.getCharSequence(next));
                } else if (obj instanceof float[]) {
                    hashMap2.put(next, bundle.getFloatArray(next));
                } else if (obj instanceof Float) {
                    hashMap2.put(next, Float.valueOf(bundle.getFloat(next)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f3659a.c("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[]{Integer.valueOf(i4), hashMap}));
    }

    public void j(int i4) {
        M2.b.f("TextInputChannel", "Sending 'previous' message.");
        this.f3659a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.previous"}));
    }

    public void k() {
        this.f3659a.c("TextInputClient.requestExistingInputState", (Object) null);
    }

    public void l(int i4) {
        M2.b.f("TextInputChannel", "Sending 'search' message.");
        this.f3659a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.search"}));
    }

    public void m(int i4) {
        M2.b.f("TextInputChannel", "Sending 'send' message.");
        this.f3659a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.send"}));
    }

    public void n(f fVar) {
        this.f3660b = fVar;
    }

    public void o(int i4) {
        M2.b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.f3659a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.unspecified"}));
    }

    public void p(int i4, String str, int i5, int i6, int i7, int i8) {
        M2.b.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i5 + "\nSelection end: " + i6 + "\nComposing start: " + i7 + "\nComposing end: " + i8);
        HashMap d4 = d(str, i5, i6, i7, i8);
        this.f3659a.c("TextInputClient.updateEditingState", Arrays.asList(new Serializable[]{Integer.valueOf(i4), d4}));
    }

    public void q(int i4, ArrayList arrayList) {
        M2.b.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        HashMap c4 = c(arrayList);
        this.f3659a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(new Serializable[]{Integer.valueOf(i4), c4}));
    }

    public void r(int i4, HashMap hashMap) {
        M2.b.f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            e eVar = (e) entry.getValue();
            hashMap2.put((String) entry.getKey(), d(eVar.f3688a, eVar.f3689b, eVar.f3690c, -1, -1));
        }
        this.f3659a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i4), hashMap2}));
    }
}
