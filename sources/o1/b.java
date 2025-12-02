package O1;

import M1.d;
import android.net.Uri;
import v1.C0947a;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0947a.g f2042a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0947a.C0204a f2043b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0947a f2044c;

    /* renamed from: d  reason: collision with root package name */
    public static final i f2045d = new d();

    /* JADX WARNING: type inference failed for: r0v1, types: [M1.d, O1.i] */
    static {
        C0947a.g gVar = new C0947a.g();
        f2042a = gVar;
        h hVar = new h();
        f2043b = hVar;
        f2044c = new C0947a("Phenotype.API", hVar, gVar);
    }

    public static Uri a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
    }
}
