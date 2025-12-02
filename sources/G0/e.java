package g0;

import D3.I;
import O3.r;
import c0.h;
import c0.w;
import d0.C0569b;
import e0.d;
import java.io.File;
import java.util.List;
import s3.i;
import u3.p;
import v3.g;
import v3.l;
import v3.m;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f9054a = new e();

    public static final class a extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ u3.a f9055f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u3.a aVar) {
            super(0);
            this.f9055f = aVar;
        }

        /* renamed from: a */
        public final r c() {
            File file = (File) this.f9055f.c();
            if (l.a(i.c(file), "preferences_pb")) {
                r.a aVar = r.f2128f;
                File absoluteFile = file.getAbsoluteFile();
                l.d(absoluteFile, "file.absoluteFile");
                return r.a.d(aVar, absoluteFile, false, 1, (Object) null);
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    public final h a(w wVar, C0569b bVar, List list, I i4) {
        l.e(wVar, "storage");
        l.e(list, "migrations");
        l.e(i4, "scope");
        return new d(c0.i.f6309a.a(wVar, bVar, list, i4));
    }

    public final h b(C0569b bVar, List list, I i4, u3.a aVar) {
        l.e(list, "migrations");
        l.e(i4, "scope");
        l.e(aVar, "produceFile");
        return new d(a(new d(O3.h.f2116b, j.f9060a, (p) null, new a(aVar), 4, (g) null), bVar, list, i4));
    }
}
