package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.b;
import androidx.datastore.preferences.protobuf.C0370w;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o  reason: case insensitive filesystem */
public class C0363o {

    /* renamed from: b  reason: collision with root package name */
    public static volatile C0363o f5173b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0363o f5174c = new C0363o(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map f5175a = Collections.emptyMap();

    /* renamed from: androidx.datastore.preferences.protobuf.o$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f5176a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5177b;

        public a(Object obj, int i4) {
            this.f5176a = obj;
            this.f5177b = i4;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5176a == aVar.f5176a && this.f5177b == aVar.f5177b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f5176a) * 65535) + this.f5177b;
        }
    }

    public C0363o(boolean z4) {
    }

    public static C0363o b() {
        if (b0.f5079d) {
            return f5174c;
        }
        C0363o oVar = f5173b;
        if (oVar == null) {
            synchronized (C0363o.class) {
                try {
                    oVar = f5173b;
                    if (oVar == null) {
                        oVar = C0362n.a();
                        f5173b = oVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oVar;
    }

    public C0370w.c a(P p4, int i4) {
        b.a(this.f5175a.get(new a(p4, i4)));
        return null;
    }
}
