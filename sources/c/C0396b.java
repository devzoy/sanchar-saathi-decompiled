package c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import c.C0395a;

/* renamed from: c.b  reason: case insensitive filesystem */
public class C0396b implements Parcelable {
    public static final Parcelable.Creator<C0396b> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6277e = false;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f6278f = null;

    /* renamed from: g  reason: collision with root package name */
    public C0395a f6279g;

    /* renamed from: c.b$a */
    public class a implements Parcelable.Creator {
        /* renamed from: a */
        public C0396b createFromParcel(Parcel parcel) {
            return new C0396b(parcel);
        }

        /* renamed from: b */
        public C0396b[] newArray(int i4) {
            return new C0396b[i4];
        }
    }

    /* renamed from: c.b$b  reason: collision with other inner class name */
    public class C0115b extends C0395a.C0113a {
        public C0115b() {
        }

        public void F(int i4, Bundle bundle) {
            C0396b bVar = C0396b.this;
            Handler handler = bVar.f6278f;
            if (handler != null) {
                handler.post(new c(i4, bundle));
            } else {
                bVar.a(i4, bundle);
            }
        }
    }

    /* renamed from: c.b$c */
    public class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final int f6281e;

        /* renamed from: f  reason: collision with root package name */
        public final Bundle f6282f;

        public c(int i4, Bundle bundle) {
            this.f6281e = i4;
            this.f6282f = bundle;
        }

        public void run() {
            C0396b.this.a(this.f6281e, this.f6282f);
        }
    }

    public C0396b(Parcel parcel) {
        this.f6279g = C0395a.C0113a.H(parcel.readStrongBinder());
    }

    public void a(int i4, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        synchronized (this) {
            try {
                if (this.f6279g == null) {
                    this.f6279g = new C0115b();
                }
                parcel.writeStrongBinder(this.f6279g.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
