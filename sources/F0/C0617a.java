package f0;

import D3.H0;
import D3.I;
import D3.J;
import D3.V;
import D3.p0;
import android.content.Context;
import d0.C0569b;
import i3.C0738o;
import java.util.List;
import u3.l;
import v3.m;
import w3.a;

/* renamed from: f0.a  reason: case insensitive filesystem */
public abstract class C0617a {

    /* renamed from: f0.a$a  reason: collision with other inner class name */
    public static final class C0160a extends m implements l {

        /* renamed from: f  reason: collision with root package name */
        public static final C0160a f8977f = new C0160a();

        public C0160a() {
            super(1);
        }

        /* renamed from: a */
        public final List i(Context context) {
            v3.l.e(context, "it");
            return C0738o.h();
        }
    }

    public static final a a(String str, C0569b bVar, l lVar, I i4) {
        v3.l.e(str, "name");
        v3.l.e(lVar, "produceMigrations");
        v3.l.e(i4, "scope");
        return new C0619c(str, bVar, lVar, i4);
    }

    public static /* synthetic */ a b(String str, C0569b bVar, l lVar, I i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            bVar = null;
        }
        if ((i5 & 4) != 0) {
            lVar = C0160a.f8977f;
        }
        if ((i5 & 8) != 0) {
            i4 = J.a(V.b().h(H0.b((p0) null, 1, (Object) null)));
        }
        return a(str, bVar, lVar, i4);
    }
}
