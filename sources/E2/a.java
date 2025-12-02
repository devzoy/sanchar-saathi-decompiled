package E2;

import android.net.Uri;
import java.util.HashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f885a;

    /* renamed from: b  reason: collision with root package name */
    public final String f886b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f887c;

    /* renamed from: d  reason: collision with root package name */
    public final long f888d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f889e;

    /* renamed from: E2.a$a  reason: collision with other inner class name */
    public static class C0009a {

        /* renamed from: a  reason: collision with root package name */
        public String f890a;

        /* renamed from: b  reason: collision with root package name */
        public String f891b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f892c;

        /* renamed from: d  reason: collision with root package name */
        public long f893d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f894e;

        public a a() {
            return new a(this.f890a, this.f891b, this.f892c, this.f893d, this.f894e);
        }

        public C0009a b(byte[] bArr) {
            this.f894e = bArr;
            return this;
        }

        public C0009a c(String str) {
            this.f891b = str;
            return this;
        }

        public C0009a d(String str) {
            this.f890a = str;
            return this;
        }

        public C0009a e(long j4) {
            this.f893d = j4;
            return this;
        }

        public C0009a f(Uri uri) {
            this.f892c = uri;
            return this;
        }
    }

    public a(String str, String str2, Uri uri, long j4, byte[] bArr) {
        this.f885a = str;
        this.f886b = str2;
        this.f888d = j4;
        this.f889e = bArr;
        this.f887c = uri;
    }

    public HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put("path", this.f885a);
        hashMap.put("name", this.f886b);
        hashMap.put("size", Long.valueOf(this.f888d));
        hashMap.put("bytes", this.f889e);
        hashMap.put("identifier", this.f887c.toString());
        return hashMap;
    }
}
