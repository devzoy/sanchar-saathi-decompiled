package a1;

import Q0.l;
import Q0.s;
import R0.E;
import R0.o;
import R0.t;
import R0.u;
import Z0.C0336b;
import Z0.v;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import java.util.UUID;

/* renamed from: a1.b  reason: case insensitive filesystem */
public abstract class C0345b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final o f3953e = new o();

    /* renamed from: a1.b$a */
    public class a extends C0345b {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ E f3954f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ UUID f3955g;

        public a(E e4, UUID uuid) {
            this.f3954f = e4;
            this.f3955g = uuid;
        }

        /* JADX INFO: finally extract failed */
        public void g() {
            WorkDatabase q4 = this.f3954f.q();
            q4.e();
            try {
                a(this.f3954f, this.f3955g.toString());
                q4.B();
                q4.i();
                f(this.f3954f);
            } catch (Throwable th) {
                q4.i();
                throw th;
            }
        }
    }

    /* renamed from: a1.b$b  reason: collision with other inner class name */
    public class C0079b extends C0345b {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ E f3956f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String f3957g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ boolean f3958h;

        public C0079b(E e4, String str, boolean z4) {
            this.f3956f = e4;
            this.f3957g = str;
            this.f3958h = z4;
        }

        public void g() {
            WorkDatabase q4 = this.f3956f.q();
            q4.e();
            try {
                for (String a4 : q4.J().g(this.f3957g)) {
                    a(this.f3956f, a4);
                }
                q4.B();
                q4.i();
                if (this.f3958h) {
                    f(this.f3956f);
                }
            } catch (Throwable th) {
                q4.i();
                throw th;
            }
        }
    }

    public static C0345b b(UUID uuid, E e4) {
        return new a(e4, uuid);
    }

    public static C0345b c(String str, E e4, boolean z4) {
        return new C0079b(e4, str, z4);
    }

    public void a(E e4, String str) {
        e(e4.q(), str);
        e4.n().r(str);
        for (t a4 : e4.o()) {
            a4.a(str);
        }
    }

    public l d() {
        return this.f3953e;
    }

    public final void e(WorkDatabase workDatabase, String str) {
        v J4 = workDatabase.J();
        C0336b E4 = workDatabase.E();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            s k4 = J4.k(str2);
            if (!(k4 == s.SUCCEEDED || k4 == s.FAILED)) {
                J4.n(s.CANCELLED, str2);
            }
            linkedList.addAll(E4.c(str2));
        }
    }

    public void f(E e4) {
        u.b(e4.j(), e4.q(), e4.o());
    }

    public abstract void g();

    public void run() {
        try {
            g();
            this.f3953e.a(l.f2390a);
        } catch (Throwable th) {
            this.f3953e.a(new l.b.a(th));
        }
    }
}
