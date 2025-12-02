package w1;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class c0 extends Fragment implements C0975h {

    /* renamed from: d  reason: collision with root package name */
    public static final WeakHashMap f12581d = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final e0 f12582c = new e0();

    public static c0 b(Activity activity) {
        c0 c0Var;
        WeakHashMap weakHashMap = f12581d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (c0Var = (c0) weakReference.get()) != null) {
            return c0Var;
        }
        try {
            c0 c0Var2 = (c0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (c0Var2 == null || c0Var2.isRemoving()) {
                c0Var2 = new c0();
                activity.getFragmentManager().beginTransaction().add(c0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(c0Var2));
            return c0Var2;
        } catch (ClassCastException e4) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e4);
        }
    }

    public final void a(String str, C0974g gVar) {
        this.f12582c.b(str, gVar);
    }

    public final C0974g c(String str, Class cls) {
        return this.f12582c.a(str, cls);
    }

    public final Activity d() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f12582c.j(str, fileDescriptor, printWriter, strArr);
    }

    public final void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        this.f12582c.f(i4, i5, intent);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12582c.c(bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f12582c.i();
    }

    public final void onResume() {
        super.onResume();
        this.f12582c.e();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f12582c.g(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.f12582c.d();
    }

    public final void onStop() {
        super.onStop();
        this.f12582c.h();
    }
}
