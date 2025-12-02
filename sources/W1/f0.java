package w1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import i0.C0695p;
import i0.C0699u;
import i0.I;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class f0 extends C0695p implements C0975h {

    /* renamed from: h0  reason: collision with root package name */
    public static final WeakHashMap f12610h0 = new WeakHashMap();

    /* renamed from: g0  reason: collision with root package name */
    public final e0 f12611g0 = new e0();

    public static f0 E1(C0699u uVar) {
        f0 f0Var;
        I T3 = uVar.T();
        WeakHashMap weakHashMap = f12610h0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(uVar);
        if (weakReference == null || (f0Var = (f0) weakReference.get()) == null) {
            try {
                f0Var = (f0) T3.i0("SLifecycleFragmentImpl");
                if (f0Var == null || f0Var.f0()) {
                    f0Var = new f0();
                    T3.n().d(f0Var, "SLifecycleFragmentImpl").g();
                }
                weakHashMap.put(uVar, new WeakReference(f0Var));
            } catch (ClassCastException e4) {
                throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e4);
            }
        }
        return f0Var;
    }

    public final void K0() {
        super.K0();
        this.f12611g0.e();
    }

    public final void L0(Bundle bundle) {
        super.L0(bundle);
        this.f12611g0.g(bundle);
    }

    public final void M0() {
        super.M0();
        this.f12611g0.d();
    }

    public final void N0() {
        super.N0();
        this.f12611g0.h();
    }

    public final void a(String str, C0974g gVar) {
        this.f12611g0.b(str, gVar);
    }

    public final C0974g c(String str, Class cls) {
        return this.f12611g0.a(str, cls);
    }

    public final Activity d() {
        return m();
    }

    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        this.f12611g0.j(str, fileDescriptor, printWriter, strArr);
    }

    public final void k0(int i4, int i5, Intent intent) {
        super.k0(i4, i5, intent);
        this.f12611g0.f(i4, i5, intent);
    }

    public final void p0(Bundle bundle) {
        super.p0(bundle);
        this.f12611g0.c(bundle);
    }

    public final void u0() {
        super.u0();
        this.f12611g0.i();
    }
}
