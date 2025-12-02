package i0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C0380g;

public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public final String f9900e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9901f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9902g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9903h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9904i;

    /* renamed from: j  reason: collision with root package name */
    public final String f9905j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9906k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f9907l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f9908m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f9909n;

    /* renamed from: o  reason: collision with root package name */
    public final int f9910o;

    /* renamed from: p  reason: collision with root package name */
    public final String f9911p;

    /* renamed from: q  reason: collision with root package name */
    public final int f9912q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f9913r;

    public class a implements Parcelable.Creator {
        /* renamed from: a */
        public N createFromParcel(Parcel parcel) {
            return new N(parcel);
        }

        /* renamed from: b */
        public N[] newArray(int i4) {
            return new N[i4];
        }
    }

    public N(C0695p pVar) {
        this.f9900e = pVar.getClass().getName();
        this.f9901f = pVar.f10169h;
        this.f9902g = pVar.f10179r;
        this.f9903h = pVar.f10133A;
        this.f9904i = pVar.f10134B;
        this.f9905j = pVar.f10135C;
        this.f9906k = pVar.f10138F;
        this.f9907l = pVar.f10176o;
        this.f9908m = pVar.f10137E;
        this.f9909n = pVar.f10136D;
        this.f9910o = pVar.f10154V.ordinal();
        this.f9911p = pVar.f10172k;
        this.f9912q = pVar.f10173l;
        this.f9913r = pVar.f10146N;
    }

    public C0695p a(C0704z zVar, ClassLoader classLoader) {
        C0695p a4 = zVar.a(classLoader, this.f9900e);
        a4.f10169h = this.f9901f;
        a4.f10179r = this.f9902g;
        a4.f10181t = true;
        a4.f10133A = this.f9903h;
        a4.f10134B = this.f9904i;
        a4.f10135C = this.f9905j;
        a4.f10138F = this.f9906k;
        a4.f10176o = this.f9907l;
        a4.f10137E = this.f9908m;
        a4.f10136D = this.f9909n;
        a4.f10154V = C0380g.b.values()[this.f9910o];
        a4.f10172k = this.f9911p;
        a4.f10173l = this.f9912q;
        a4.f10146N = this.f9913r;
        return a4;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f9900e);
        sb.append(" (");
        sb.append(this.f9901f);
        sb.append(")}:");
        if (this.f9902g) {
            sb.append(" fromLayout");
        }
        if (this.f9904i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f9904i));
        }
        String str = this.f9905j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f9905j);
        }
        if (this.f9906k) {
            sb.append(" retainInstance");
        }
        if (this.f9907l) {
            sb.append(" removing");
        }
        if (this.f9908m) {
            sb.append(" detached");
        }
        if (this.f9909n) {
            sb.append(" hidden");
        }
        if (this.f9911p != null) {
            sb.append(" targetWho=");
            sb.append(this.f9911p);
            sb.append(" targetRequestCode=");
            sb.append(this.f9912q);
        }
        if (this.f9913r) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f9900e);
        parcel.writeString(this.f9901f);
        parcel.writeInt(this.f9902g ? 1 : 0);
        parcel.writeInt(this.f9903h);
        parcel.writeInt(this.f9904i);
        parcel.writeString(this.f9905j);
        parcel.writeInt(this.f9906k ? 1 : 0);
        parcel.writeInt(this.f9907l ? 1 : 0);
        parcel.writeInt(this.f9908m ? 1 : 0);
        parcel.writeInt(this.f9909n ? 1 : 0);
        parcel.writeInt(this.f9910o);
        parcel.writeString(this.f9911p);
        parcel.writeInt(this.f9912q);
        parcel.writeInt(this.f9913r ? 1 : 0);
    }

    public N(Parcel parcel) {
        this.f9900e = parcel.readString();
        this.f9901f = parcel.readString();
        boolean z4 = false;
        this.f9902g = parcel.readInt() != 0;
        this.f9903h = parcel.readInt();
        this.f9904i = parcel.readInt();
        this.f9905j = parcel.readString();
        this.f9906k = parcel.readInt() != 0;
        this.f9907l = parcel.readInt() != 0;
        this.f9908m = parcel.readInt() != 0;
        this.f9909n = parcel.readInt() != 0;
        this.f9910o = parcel.readInt();
        this.f9911p = parcel.readString();
        this.f9912q = parcel.readInt();
        this.f9913r = parcel.readInt() != 0 ? true : z4;
    }
}
