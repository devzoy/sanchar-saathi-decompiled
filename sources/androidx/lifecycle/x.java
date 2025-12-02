package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C0380g;
import v3.g;
import v3.l;

public class x extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    public static final b f5434d = new b((g) null);

    /* renamed from: c  reason: collision with root package name */
    public a f5435c;

    public interface a {
        void a();

        void b();

        void c();
    }

    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final void a(Activity activity, C0380g.a aVar) {
            l.e(activity, "activity");
            l.e(aVar, "event");
            if (activity instanceof C0384k) {
                C0380g b4 = ((C0384k) activity).b();
                if (b4 instanceof l) {
                    ((l) b4).h(aVar);
                }
            }
        }

        public final x b(Activity activity) {
            l.e(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            l.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (x) findFragmentByTag;
        }

        public final void c(Activity activity) {
            l.e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new x(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        public b() {
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a((g) null);

        public static final class a {
            public /* synthetic */ a(g gVar) {
                this();
            }

            public final void a(Activity activity) {
                l.e(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }

            public a() {
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.e(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            l.e(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            l.e(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            l.e(activity, "activity");
            x.f5434d.a(activity, C0380g.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            l.e(activity, "activity");
            x.f5434d.a(activity, C0380g.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            l.e(activity, "activity");
            x.f5434d.a(activity, C0380g.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            l.e(activity, "activity");
            x.f5434d.a(activity, C0380g.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            l.e(activity, "activity");
            x.f5434d.a(activity, C0380g.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            l.e(activity, "activity");
            x.f5434d.a(activity, C0380g.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            l.e(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.e(activity, "activity");
            l.e(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            l.e(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            l.e(activity, "activity");
        }
    }

    public static final void e(Activity activity) {
        f5434d.c(activity);
    }

    public final void a(C0380g.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f5434d;
            Activity activity = getActivity();
            l.d(activity, "activity");
            bVar.a(activity, aVar);
        }
    }

    public final void b(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void c(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void d(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void f(a aVar) {
        this.f5435c = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f5435c);
        a(C0380g.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(C0380g.a.ON_DESTROY);
        this.f5435c = null;
    }

    public void onPause() {
        super.onPause();
        a(C0380g.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        c(this.f5435c);
        a(C0380g.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        d(this.f5435c);
        a(C0380g.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(C0380g.a.ON_STOP);
    }
}
