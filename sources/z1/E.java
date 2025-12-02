package z1;

import A1.a;
import A1.c;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class E extends a {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* renamed from: e  reason: collision with root package name */
    public final int f12863e;

    /* renamed from: f  reason: collision with root package name */
    public final Account f12864f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12865g;

    /* renamed from: h  reason: collision with root package name */
    public final GoogleSignInAccount f12866h;

    public E(int i4, Account account, int i5, GoogleSignInAccount googleSignInAccount) {
        this.f12863e = i4;
        this.f12864f = account;
        this.f12865g = i5;
        this.f12866h = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.f12863e;
        int a4 = c.a(parcel);
        c.i(parcel, 1, i5);
        c.l(parcel, 2, this.f12864f, i4, false);
        c.i(parcel, 3, this.f12865g);
        c.l(parcel, 4, this.f12866h, i4, false);
        c.b(parcel, a4);
    }

    public E(Account account, int i4, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i4, googleSignInAccount);
    }
}
