package P;

import R.g;
import android.util.Base64;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f2166a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2167b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2168c;

    /* renamed from: d  reason: collision with root package name */
    public final List f2169d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2170e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final String f2171f;

    public e(String str, String str2, String str3, List list) {
        this.f2166a = (String) g.c(str);
        this.f2167b = (String) g.c(str2);
        this.f2168c = (String) g.c(str3);
        this.f2169d = (List) g.c(list);
        this.f2171f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f2169d;
    }

    public int c() {
        return this.f2170e;
    }

    public String d() {
        return this.f2171f;
    }

    public String e() {
        return this.f2166a;
    }

    public String f() {
        return this.f2167b;
    }

    public String g() {
        return this.f2168c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2166a + ", mProviderPackage: " + this.f2167b + ", mQuery: " + this.f2168c + ", mCertificates:");
        for (int i4 = 0; i4 < this.f2169d.size(); i4++) {
            sb.append(" [");
            List list = (List) this.f2169d.get(i4);
            for (int i5 = 0; i5 < list.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2170e);
        return sb.toString();
    }
}
