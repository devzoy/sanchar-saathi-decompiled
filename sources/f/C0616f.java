package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import v3.g;
import v3.l;

/* renamed from: f.f  reason: case insensitive filesystem */
public final class C0616f implements Parcelable {
    public static final Parcelable.Creator<C0616f> CREATOR = new b();

    /* renamed from: i  reason: collision with root package name */
    public static final c f8968i = new c((g) null);

    /* renamed from: e  reason: collision with root package name */
    public final IntentSender f8969e;

    /* renamed from: f  reason: collision with root package name */
    public final Intent f8970f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8971g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8972h;

    /* renamed from: f.f$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final IntentSender f8973a;

        /* renamed from: b  reason: collision with root package name */
        public Intent f8974b;

        /* renamed from: c  reason: collision with root package name */
        public int f8975c;

        /* renamed from: d  reason: collision with root package name */
        public int f8976d;

        public a(IntentSender intentSender) {
            l.e(intentSender, "intentSender");
            this.f8973a = intentSender;
        }

        public final C0616f a() {
            return new C0616f(this.f8973a, this.f8974b, this.f8975c, this.f8976d);
        }

        public final a b(Intent intent) {
            this.f8974b = intent;
            return this;
        }

        public final a c(int i4, int i5) {
            this.f8976d = i4;
            this.f8975c = i5;
            return this;
        }
    }

    /* renamed from: f.f$b */
    public static final class b implements Parcelable.Creator {
        /* renamed from: a */
        public C0616f createFromParcel(Parcel parcel) {
            l.e(parcel, "inParcel");
            return new C0616f(parcel);
        }

        /* renamed from: b */
        public C0616f[] newArray(int i4) {
            return new C0616f[i4];
        }
    }

    /* renamed from: f.f$c */
    public static final class c {
        public /* synthetic */ c(g gVar) {
            this();
        }

        public c() {
        }
    }

    public C0616f(IntentSender intentSender, Intent intent, int i4, int i5) {
        l.e(intentSender, "intentSender");
        this.f8969e = intentSender;
        this.f8970f = intent;
        this.f8971g = i4;
        this.f8972h = i5;
    }

    public final Intent a() {
        return this.f8970f;
    }

    public final int c() {
        return this.f8971g;
    }

    public final int d() {
        return this.f8972h;
    }

    public int describeContents() {
        return 0;
    }

    public final IntentSender e() {
        return this.f8969e;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        l.e(parcel, "dest");
        parcel.writeParcelable(this.f8969e, i4);
        parcel.writeParcelable(this.f8970f, i4);
        parcel.writeInt(this.f8971g);
        parcel.writeInt(this.f8972h);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0616f(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            v3.l.e(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            v3.l.b(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.C0616f.<init>(android.os.Parcel):void");
    }
}
