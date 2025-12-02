package o0;

import android.support.v4.media.session.b;
import androidx.lifecycle.C0384k;
import androidx.lifecycle.F;
import androidx.lifecycle.G;
import androidx.lifecycle.H;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import v.h;

/* renamed from: o0.b  reason: case insensitive filesystem */
public class C0815b extends C0814a {

    /* renamed from: a  reason: collision with root package name */
    public final C0384k f11315a;

    /* renamed from: b  reason: collision with root package name */
    public final a f11316b;

    /* renamed from: o0.b$a */
    public static class a extends F {

        /* renamed from: d  reason: collision with root package name */
        public static final G.c f11317d = new C0187a();

        /* renamed from: b  reason: collision with root package name */
        public h f11318b = new h();

        /* renamed from: c  reason: collision with root package name */
        public boolean f11319c = false;

        /* renamed from: o0.b$a$a  reason: collision with other inner class name */
        public static class C0187a implements G.c {
            public F a(Class cls) {
                return new a();
            }
        }

        public static a d(H h4) {
            return (a) new G(h4, f11317d).b(a.class);
        }

        public void b() {
            super.b();
            if (this.f11318b.o() <= 0) {
                this.f11318b.b();
            } else {
                b.a(this.f11318b.p(0));
                throw null;
            }
        }

        public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f11318b.o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                if (this.f11318b.o() > 0) {
                    b.a(this.f11318b.p(0));
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f11318b.m(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }

        public void e() {
            if (this.f11318b.o() > 0) {
                b.a(this.f11318b.p(0));
                throw null;
            }
        }
    }

    public C0815b(C0384k kVar, H h4) {
        this.f11315a = kVar;
        this.f11316b = a.d(h4);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f11316b.c(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.f11316b.e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        R.b.a(this.f11315a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
