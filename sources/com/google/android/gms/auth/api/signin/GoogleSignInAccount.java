package com.google.android.gms.auth.api.signin;

import A1.a;
import D1.c;
import D1.e;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import q1.C0892a;
import z1.C1032o;

@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C0892a();

    /* renamed from: q  reason: collision with root package name */
    public static final c f6620q = e.c();

    /* renamed from: e  reason: collision with root package name */
    public final String f6621e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6622f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6623g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6624h;

    /* renamed from: i  reason: collision with root package name */
    public final Uri f6625i;

    /* renamed from: j  reason: collision with root package name */
    public String f6626j;

    /* renamed from: k  reason: collision with root package name */
    public final long f6627k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6628l;

    /* renamed from: m  reason: collision with root package name */
    public final List f6629m;

    /* renamed from: n  reason: collision with root package name */
    public final String f6630n;

    /* renamed from: o  reason: collision with root package name */
    public final String f6631o;

    /* renamed from: p  reason: collision with root package name */
    public final Set f6632p = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j4, String str6, List list, String str7, String str8) {
        this.f6621e = str;
        this.f6622f = str2;
        this.f6623g = str3;
        this.f6624h = str4;
        this.f6625i = uri;
        this.f6626j = str5;
        this.f6627k = j4;
        this.f6628l = str6;
        this.f6629m = list;
        this.f6630n = str7;
        this.f6631o = str8;
    }

    public static GoogleSignInAccount r(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(new Scope(jSONArray.getString(i4)));
        }
        GoogleSignInAccount s4 = s(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        s4.f6626j = str2;
        return s4;
    }

    public static GoogleSignInAccount s(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l4, String str7, Set set) {
        return new GoogleSignInAccount(str, str2, str3, str4, uri, (String) null, l4.longValue(), C1032o.d(str7), new ArrayList((Collection) C1032o.f(set)), str5, str6);
    }

    public String d() {
        return this.f6624h;
    }

    public String e() {
        return this.f6623g;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f6628l.equals(this.f6628l) && googleSignInAccount.l().equals(l());
    }

    public String g() {
        return this.f6631o;
    }

    public String h() {
        return this.f6630n;
    }

    public int hashCode() {
        return ((this.f6628l.hashCode() + 527) * 31) + l().hashCode();
    }

    public String i() {
        return this.f6621e;
    }

    public String j() {
        return this.f6622f;
    }

    public Uri k() {
        return this.f6625i;
    }

    public Set l() {
        HashSet hashSet = new HashSet(this.f6629m);
        hashSet.addAll(this.f6632p);
        return hashSet;
    }

    public String m() {
        return this.f6626j;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        int a4 = A1.c.a(parcel);
        A1.c.m(parcel, 2, i(), false);
        A1.c.m(parcel, 3, j(), false);
        A1.c.m(parcel, 4, e(), false);
        A1.c.m(parcel, 5, d(), false);
        A1.c.l(parcel, 6, k(), i4, false);
        A1.c.m(parcel, 7, m(), false);
        A1.c.k(parcel, 8, this.f6627k);
        A1.c.m(parcel, 9, this.f6628l, false);
        A1.c.q(parcel, 10, this.f6629m, false);
        A1.c.m(parcel, 11, h(), false);
        A1.c.m(parcel, 12, g(), false);
        A1.c.b(parcel, a4);
    }
}
