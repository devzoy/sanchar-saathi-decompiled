package P;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.Executor;

public abstract class g {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f2188a;

        /* renamed from: b  reason: collision with root package name */
        public final b[] f2189b;

        public a(int i4, b[] bVarArr) {
            this.f2188a = i4;
            this.f2189b = bVarArr;
        }

        public static a a(int i4, b[] bVarArr) {
            return new a(i4, bVarArr);
        }

        public b[] b() {
            return this.f2189b;
        }

        public int c() {
            return this.f2188a;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f2190a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2191b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2192c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2193d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2194e;

        public b(Uri uri, int i4, int i5, boolean z4, int i6) {
            this.f2190a = (Uri) R.g.c(uri);
            this.f2191b = i4;
            this.f2192c = i5;
            this.f2193d = z4;
            this.f2194e = i6;
        }

        public static b a(Uri uri, int i4, int i5, boolean z4, int i6) {
            return new b(uri, i4, i5, z4, i6);
        }

        public int b() {
            return this.f2194e;
        }

        public int c() {
            return this.f2191b;
        }

        public Uri d() {
            return this.f2190a;
        }

        public int e() {
            return this.f2192c;
        }

        public boolean f() {
            return this.f2193d;
        }
    }

    public static class c {
        public abstract void a(int i4);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, e eVar, int i4, boolean z4, int i5, Handler handler, c cVar) {
        a aVar = new a(cVar, handler);
        return z4 ? f.e(context, eVar, aVar, i4, i5) : f.d(context, eVar, i4, (Executor) null, aVar);
    }
}
