package androidx.lifecycle;

import android.os.Bundle;
import android.support.v4.media.session.b;
import h3.C0663d;
import h3.C0664e;
import java.util.Iterator;
import java.util.Map;
import v3.l;
import v3.m;
import x0.C0998d;

public final class B implements C0998d.c {

    /* renamed from: a  reason: collision with root package name */
    public final C0998d f5340a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5341b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f5342c;

    /* renamed from: d  reason: collision with root package name */
    public final C0663d f5343d;

    public static final class a extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ I f5344f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(I i4) {
            super(0);
            this.f5344f = i4;
        }

        /* renamed from: a */
        public final C c() {
            return A.b(this.f5344f);
        }
    }

    public B(C0998d dVar, I i4) {
        l.e(dVar, "savedStateRegistry");
        l.e(i4, "viewModelStoreOwner");
        this.f5340a = dVar;
        this.f5343d = C0664e.a(new a(i4));
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5342c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = b().c().entrySet().iterator();
        if (!it.hasNext()) {
            this.f5341b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        String str = (String) entry.getKey();
        b.a(entry.getValue());
        throw null;
    }

    public final C b() {
        return (C) this.f5343d.getValue();
    }

    public final void c() {
        if (!this.f5341b) {
            Bundle b4 = this.f5340a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f5342c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (b4 != null) {
                bundle.putAll(b4);
            }
            this.f5342c = bundle;
            this.f5341b = true;
            b();
        }
    }
}
