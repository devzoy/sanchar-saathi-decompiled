package z1;

import android.os.Bundle;
import v1.C0947a;

/* renamed from: z1.u  reason: case insensitive filesystem */
public class C1037u implements C0947a.d {

    /* renamed from: b  reason: collision with root package name */
    public static final C1037u f13022b = a().a();

    /* renamed from: a  reason: collision with root package name */
    public final String f13023a;

    /* renamed from: z1.u$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f13024a;

        public /* synthetic */ a(byte[] bArr) {
        }

        public C1037u a() {
            return new C1037u(this.f13024a, (byte[]) null);
        }
    }

    public /* synthetic */ C1037u(String str, byte[] bArr) {
        this.f13023a = str;
    }

    public static a a() {
        return new a((byte[]) null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f13023a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1037u)) {
            return false;
        }
        return C1031n.a(this.f13023a, ((C1037u) obj).f13023a);
    }

    public final int hashCode() {
        return C1031n.b(this.f13023a);
    }
}
