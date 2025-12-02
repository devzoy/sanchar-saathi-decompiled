package Q1;

import A1.a;
import A1.c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import v1.C0956j;

public final class b extends a implements C0956j {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: e  reason: collision with root package name */
    public final int f2424e;

    /* renamed from: f  reason: collision with root package name */
    public int f2425f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f2426g;

    public b(int i4, int i5, Intent intent) {
        this.f2424e = i4;
        this.f2425f = i5;
        this.f2426g = intent;
    }

    public final Status c() {
        return this.f2425f == 0 ? Status.f6638j : Status.f6642n;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.f2424e;
        int a4 = c.a(parcel);
        c.i(parcel, 1, i5);
        c.i(parcel, 2, this.f2425f);
        c.l(parcel, 3, this.f2426g, i4, false);
        c.b(parcel, a4);
    }
}
