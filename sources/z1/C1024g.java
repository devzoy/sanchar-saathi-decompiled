package z1;

import A1.a;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import u1.c;
import z1.C1027j;

/* renamed from: z1.g  reason: case insensitive filesystem */
public class C1024g extends a {
    public static final Parcelable.Creator<C1024g> CREATOR = new Y();

    /* renamed from: s  reason: collision with root package name */
    public static final Scope[] f12975s = new Scope[0];

    /* renamed from: t  reason: collision with root package name */
    public static final c[] f12976t = new c[0];

    /* renamed from: e  reason: collision with root package name */
    public final int f12977e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12978f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12979g;

    /* renamed from: h  reason: collision with root package name */
    public String f12980h;

    /* renamed from: i  reason: collision with root package name */
    public IBinder f12981i;

    /* renamed from: j  reason: collision with root package name */
    public Scope[] f12982j;

    /* renamed from: k  reason: collision with root package name */
    public Bundle f12983k;

    /* renamed from: l  reason: collision with root package name */
    public Account f12984l;

    /* renamed from: m  reason: collision with root package name */
    public c[] f12985m;

    /* renamed from: n  reason: collision with root package name */
    public c[] f12986n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f12987o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12988p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12989q;

    /* renamed from: r  reason: collision with root package name */
    public final String f12990r;

    public C1024g(int i4, int i5, int i6, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c[] cVarArr, c[] cVarArr2, boolean z4, int i7, boolean z5, String str2) {
        scopeArr = scopeArr == null ? f12975s : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? f12976t : cVarArr;
        cVarArr2 = cVarArr2 == null ? f12976t : cVarArr2;
        this.f12977e = i4;
        this.f12978f = i5;
        this.f12979g = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f12980h = "com.google.android.gms";
        } else {
            this.f12980h = str;
        }
        if (i4 < 2) {
            this.f12984l = iBinder != null ? C1018a.J(C1027j.a.I(iBinder)) : null;
        } else {
            this.f12981i = iBinder;
            this.f12984l = account;
        }
        this.f12982j = scopeArr;
        this.f12983k = bundle;
        this.f12985m = cVarArr;
        this.f12986n = cVarArr2;
        this.f12987o = z4;
        this.f12988p = i7;
        this.f12989q = z5;
        this.f12990r = str2;
    }

    public String d() {
        return this.f12990r;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        Y.a(this, parcel, i4);
    }
}
