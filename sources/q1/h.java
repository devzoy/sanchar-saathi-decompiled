package Q1;

import A1.a;
import A1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import v1.C0956j;

public final class h extends a implements C0956j {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: e  reason: collision with root package name */
    public final List f2427e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2428f;

    public h(List list, String str) {
        this.f2427e = list;
        this.f2428f = str;
    }

    public final Status c() {
        return this.f2428f != null ? Status.f6638j : Status.f6642n;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        List list = this.f2427e;
        int a4 = c.a(parcel);
        c.o(parcel, 1, list, false);
        c.m(parcel, 2, this.f2428f, false);
        c.b(parcel, a4);
    }
}
