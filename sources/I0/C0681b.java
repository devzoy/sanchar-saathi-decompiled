package i0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.C0380g;
import i0.Q;
import java.util.ArrayList;

/* renamed from: i0.b  reason: case insensitive filesystem */
public final class C0681b implements Parcelable {
    public static final Parcelable.Creator<C0681b> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public final int[] f10028e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f10029f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f10030g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f10031h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10032i;

    /* renamed from: j  reason: collision with root package name */
    public final String f10033j;

    /* renamed from: k  reason: collision with root package name */
    public final int f10034k;

    /* renamed from: l  reason: collision with root package name */
    public final int f10035l;

    /* renamed from: m  reason: collision with root package name */
    public final CharSequence f10036m;

    /* renamed from: n  reason: collision with root package name */
    public final int f10037n;

    /* renamed from: o  reason: collision with root package name */
    public final CharSequence f10038o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f10039p;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f10040q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f10041r;

    /* renamed from: i0.b$a */
    public class a implements Parcelable.Creator {
        /* renamed from: a */
        public C0681b createFromParcel(Parcel parcel) {
            return new C0681b(parcel);
        }

        /* renamed from: b */
        public C0681b[] newArray(int i4) {
            return new C0681b[i4];
        }
    }

    public C0681b(C0680a aVar) {
        int size = aVar.f9928c.size();
        this.f10028e = new int[(size * 6)];
        if (aVar.f9934i) {
            this.f10029f = new ArrayList(size);
            this.f10030g = new int[size];
            this.f10031h = new int[size];
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Q.a aVar2 = (Q.a) aVar.f9928c.get(i5);
                int i6 = i4 + 1;
                this.f10028e[i4] = aVar2.f9945a;
                ArrayList arrayList = this.f10029f;
                C0695p pVar = aVar2.f9946b;
                arrayList.add(pVar != null ? pVar.f10169h : null);
                int[] iArr = this.f10028e;
                iArr[i6] = aVar2.f9947c;
                iArr[i4 + 2] = aVar2.f9948d;
                iArr[i4 + 3] = aVar2.f9949e;
                int i7 = i4 + 5;
                iArr[i4 + 4] = aVar2.f9950f;
                i4 += 6;
                iArr[i7] = aVar2.f9951g;
                this.f10030g[i5] = aVar2.f9952h.ordinal();
                this.f10031h[i5] = aVar2.f9953i.ordinal();
            }
            this.f10032i = aVar.f9933h;
            this.f10033j = aVar.f9936k;
            this.f10034k = aVar.f10026v;
            this.f10035l = aVar.f9937l;
            this.f10036m = aVar.f9938m;
            this.f10037n = aVar.f9939n;
            this.f10038o = aVar.f9940o;
            this.f10039p = aVar.f9941p;
            this.f10040q = aVar.f9942q;
            this.f10041r = aVar.f9943r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final void a(C0680a aVar) {
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z4 = true;
            if (i4 < this.f10028e.length) {
                Q.a aVar2 = new Q.a();
                int i6 = i4 + 1;
                aVar2.f9945a = this.f10028e[i4];
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i5 + " base fragment #" + this.f10028e[i6]);
                }
                aVar2.f9952h = C0380g.b.values()[this.f10030g[i5]];
                aVar2.f9953i = C0380g.b.values()[this.f10031h[i5]];
                int[] iArr = this.f10028e;
                int i7 = i4 + 2;
                if (iArr[i6] == 0) {
                    z4 = false;
                }
                aVar2.f9947c = z4;
                int i8 = iArr[i7];
                aVar2.f9948d = i8;
                int i9 = iArr[i4 + 3];
                aVar2.f9949e = i9;
                int i10 = i4 + 5;
                int i11 = iArr[i4 + 4];
                aVar2.f9950f = i11;
                i4 += 6;
                int i12 = iArr[i10];
                aVar2.f9951g = i12;
                aVar.f9929d = i8;
                aVar.f9930e = i9;
                aVar.f9931f = i11;
                aVar.f9932g = i12;
                aVar.e(aVar2);
                i5++;
            } else {
                aVar.f9933h = this.f10032i;
                aVar.f9936k = this.f10033j;
                aVar.f9934i = true;
                aVar.f9937l = this.f10035l;
                aVar.f9938m = this.f10036m;
                aVar.f9939n = this.f10037n;
                aVar.f9940o = this.f10038o;
                aVar.f9941p = this.f10039p;
                aVar.f9942q = this.f10040q;
                aVar.f9943r = this.f10041r;
                return;
            }
        }
    }

    public C0680a c(I i4) {
        C0680a aVar = new C0680a(i4);
        a(aVar);
        aVar.f10026v = this.f10034k;
        for (int i5 = 0; i5 < this.f10029f.size(); i5++) {
            String str = (String) this.f10029f.get(i5);
            if (str != null) {
                ((Q.a) aVar.f9928c.get(i5)).f9946b = i4.f0(str);
            }
        }
        aVar.p(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f10028e);
        parcel.writeStringList(this.f10029f);
        parcel.writeIntArray(this.f10030g);
        parcel.writeIntArray(this.f10031h);
        parcel.writeInt(this.f10032i);
        parcel.writeString(this.f10033j);
        parcel.writeInt(this.f10034k);
        parcel.writeInt(this.f10035l);
        TextUtils.writeToParcel(this.f10036m, parcel, 0);
        parcel.writeInt(this.f10037n);
        TextUtils.writeToParcel(this.f10038o, parcel, 0);
        parcel.writeStringList(this.f10039p);
        parcel.writeStringList(this.f10040q);
        parcel.writeInt(this.f10041r ? 1 : 0);
    }

    public C0681b(Parcel parcel) {
        this.f10028e = parcel.createIntArray();
        this.f10029f = parcel.createStringArrayList();
        this.f10030g = parcel.createIntArray();
        this.f10031h = parcel.createIntArray();
        this.f10032i = parcel.readInt();
        this.f10033j = parcel.readString();
        this.f10034k = parcel.readInt();
        this.f10035l = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f10036m = (CharSequence) creator.createFromParcel(parcel);
        this.f10037n = parcel.readInt();
        this.f10038o = (CharSequence) creator.createFromParcel(parcel);
        this.f10039p = parcel.createStringArrayList();
        this.f10040q = parcel.createStringArrayList();
        this.f10041r = parcel.readInt() != 0;
    }
}
