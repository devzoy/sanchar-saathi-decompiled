package i0;

import G.a;
import G.n;
import G.o;
import H.c;
import H.d;
import S.C0321l;
import S.C0324o;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.H;
import androidx.lifecycle.I;
import androidx.lifecycle.l;
import d.h;
import d.q;
import d.s;
import f.C0614d;
import f.C0615e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o0.C0814a;
import x0.C0998d;
import x0.C1000f;

/* renamed from: i0.u  reason: case insensitive filesystem */
public abstract class C0699u extends h implements a.d {

    /* renamed from: A  reason: collision with root package name */
    public boolean f10219A = true;

    /* renamed from: w  reason: collision with root package name */
    public final C0703y f10220w = C0703y.b(new a());

    /* renamed from: x  reason: collision with root package name */
    public final l f10221x = new l(this);

    /* renamed from: y  reason: collision with root package name */
    public boolean f10222y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f10223z;

    /* renamed from: i0.u$a */
    public class a extends C0679A implements c, d, n, o, I, s, C0615e, C1000f, M, C0321l {
        public a() {
            super(C0699u.this);
        }

        public void B() {
            C();
        }

        public void C() {
            C0699u.this.J();
        }

        /* renamed from: D */
        public C0699u y() {
            return C0699u.this;
        }

        public void a(I i4, C0695p pVar) {
            C0699u.this.b0(pVar);
        }

        public C0380g b() {
            return C0699u.this.f10221x;
        }

        public void c(R.a aVar) {
            C0699u.this.c(aVar);
        }

        public void d(R.a aVar) {
            C0699u.this.d(aVar);
        }

        public void e(R.a aVar) {
            C0699u.this.e(aVar);
        }

        public void g(R.a aVar) {
            C0699u.this.g(aVar);
        }

        public void h(R.a aVar) {
            C0699u.this.h(aVar);
        }

        public View i(int i4) {
            return C0699u.this.findViewById(i4);
        }

        public boolean j() {
            Window window = C0699u.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public q k() {
            return C0699u.this.k();
        }

        public C0998d l() {
            return C0699u.this.l();
        }

        public void m(R.a aVar) {
            C0699u.this.m(aVar);
        }

        public C0614d p() {
            return C0699u.this.p();
        }

        public void r(C0324o oVar) {
            C0699u.this.r(oVar);
        }

        public void s(R.a aVar) {
            C0699u.this.s(aVar);
        }

        public H t() {
            return C0699u.this.t();
        }

        public void u(C0324o oVar) {
            C0699u.this.u(oVar);
        }

        public void w(R.a aVar) {
            C0699u.this.w(aVar);
        }

        public void x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0699u.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        public LayoutInflater z() {
            return C0699u.this.getLayoutInflater().cloneInContext(C0699u.this);
        }
    }

    public C0699u() {
        U();
    }

    public static boolean a0(I i4, C0380g.b bVar) {
        boolean z4 = false;
        for (C0695p pVar : i4.u0()) {
            if (pVar != null) {
                if (pVar.C() != null) {
                    z4 |= a0(pVar.s(), bVar);
                }
                V v4 = pVar.f10156X;
                if (v4 != null && v4.b().b().f(C0380g.b.STARTED)) {
                    pVar.f10156X.g(bVar);
                    z4 = true;
                }
                if (pVar.f10155W.b().f(C0380g.b.STARTED)) {
                    pVar.f10155W.m(bVar);
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final View S(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f10220w.n(view, str, context, attributeSet);
    }

    public I T() {
        return this.f10220w.l();
    }

    public final void U() {
        l().h("android:support:lifecycle", new C0696q(this));
        h(new r(this));
        F(new C0697s(this));
        E(new C0698t(this));
    }

    public final /* synthetic */ Bundle V() {
        Z();
        this.f10221x.h(C0380g.a.ON_STOP);
        return new Bundle();
    }

    public final /* synthetic */ void W(Configuration configuration) {
        this.f10220w.m();
    }

    public final /* synthetic */ void X(Intent intent) {
        this.f10220w.m();
    }

    public final /* synthetic */ void Y(Context context) {
        this.f10220w.a((C0695p) null);
    }

    public void Z() {
        do {
        } while (a0(T(), C0380g.b.CREATED));
    }

    public final void a(int i4) {
    }

    public void b0(C0695p pVar) {
    }

    public void c0() {
        this.f10221x.h(C0380g.a.ON_RESUME);
        this.f10220w.h();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (x(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f10222y);
            printWriter.print(" mResumed=");
            printWriter.print(this.f10223z);
            printWriter.print(" mStopped=");
            printWriter.print(this.f10219A);
            if (getApplication() != null) {
                C0814a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f10220w.l().W(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void onActivityResult(int i4, int i5, Intent intent) {
        this.f10220w.m();
        super.onActivityResult(i4, i5, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10221x.h(C0380g.a.ON_CREATE);
        this.f10220w.e();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View S3 = S(view, str, context, attributeSet);
        return S3 == null ? super.onCreateView(view, str, context, attributeSet) : S3;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f10220w.f();
        this.f10221x.h(C0380g.a.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 6) {
            return this.f10220w.d(menuItem);
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.f10223z = false;
        this.f10220w.g();
        this.f10221x.h(C0380g.a.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        c0();
    }

    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        this.f10220w.m();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    public void onResume() {
        this.f10220w.m();
        super.onResume();
        this.f10223z = true;
        this.f10220w.k();
    }

    public void onStart() {
        this.f10220w.m();
        super.onStart();
        this.f10219A = false;
        if (!this.f10222y) {
            this.f10222y = true;
            this.f10220w.c();
        }
        this.f10220w.k();
        this.f10221x.h(C0380g.a.ON_START);
        this.f10220w.i();
    }

    public void onStateNotSaved() {
        this.f10220w.m();
    }

    public void onStop() {
        super.onStop();
        this.f10219A = true;
        Z();
        this.f10220w.j();
        this.f10221x.h(C0380g.a.ON_STOP);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View S3 = S((View) null, str, context, attributeSet);
        return S3 == null ? super.onCreateView(str, context, attributeSet) : S3;
    }
}
