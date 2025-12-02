package U0;

import Q0.i;
import Q0.s;
import R.a;
import R0.E;
import R0.t;
import Z0.l;
import Z0.m;
import Z0.u;
import Z0.v;
import Z0.x;
import a1.k;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class c implements t {

    /* renamed from: g  reason: collision with root package name */
    public static final String f2944g = i.i("SystemJobScheduler");

    /* renamed from: c  reason: collision with root package name */
    public final Context f2945c;

    /* renamed from: d  reason: collision with root package name */
    public final JobScheduler f2946d;

    /* renamed from: e  reason: collision with root package name */
    public final E f2947e;

    /* renamed from: f  reason: collision with root package name */
    public final b f2948f;

    public c(Context context, E e4) {
        this(context, e4, (JobScheduler) context.getSystemService("jobscheduler"), new b(context));
    }

    public static void b(Context context) {
        List<JobInfo> g4;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g4 = g(context, jobScheduler)) != null && !g4.isEmpty()) {
            for (JobInfo id : g4) {
                d(jobScheduler, id.getId());
            }
        }
    }

    public static void d(JobScheduler jobScheduler, int i4) {
        try {
            jobScheduler.cancel(i4);
        } catch (Throwable th) {
            i.e().d(f2944g, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i4)}), th);
        }
    }

    public static List e(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g4 = g(context, jobScheduler);
        if (g4 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g4) {
            m h4 = h(jobInfo);
            if (h4 != null && str.equals(h4.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            i.e().d(f2944g, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, E e4) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g4 = g(context, jobScheduler);
        List<String> b4 = e4.q().G().b();
        boolean z4 = false;
        HashSet hashSet = new HashSet(g4 != null ? g4.size() : 0);
        if (g4 != null && !g4.isEmpty()) {
            for (JobInfo jobInfo : g4) {
                m h4 = h(jobInfo);
                if (h4 != null) {
                    hashSet.add(h4.b());
                } else {
                    d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = b4.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    i.e().a(f2944g, "Reconciling jobs");
                    z4 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z4) {
            WorkDatabase q4 = e4.q();
            q4.e();
            try {
                v J4 = q4.J();
                for (String f4 : b4) {
                    J4.f(f4, -1);
                }
                q4.B();
                q4.i();
            } catch (Throwable th) {
                q4.i();
                throw th;
            }
        }
        return z4;
    }

    public void a(String str) {
        List<Integer> e4 = e(this.f2945c, this.f2946d, str);
        if (e4 != null && !e4.isEmpty()) {
            for (Integer intValue : e4) {
                d(this.f2946d, intValue.intValue());
            }
            this.f2947e.q().G().f(str);
        }
    }

    public void c(u... uVarArr) {
        WorkDatabase q4 = this.f2947e.q();
        k kVar = new k(q4);
        int length = uVarArr.length;
        int i4 = 0;
        while (i4 < length) {
            u uVar = uVarArr[i4];
            q4.e();
            try {
                u m4 = q4.J().m(uVar.f3834a);
                if (m4 == null) {
                    i e4 = i.e();
                    String str = f2944g;
                    e4.k(str, "Skipping scheduling " + uVar.f3834a + " because it's no longer in the DB");
                    q4.B();
                } else if (m4.f3835b != s.ENQUEUED) {
                    i e5 = i.e();
                    String str2 = f2944g;
                    e5.k(str2, "Skipping scheduling " + uVar.f3834a + " because it is no longer enqueued");
                    q4.B();
                } else {
                    m a4 = x.a(uVar);
                    Z0.i e6 = q4.G().e(a4);
                    int e7 = e6 != null ? e6.f3809c : kVar.e(this.f2947e.j().i(), this.f2947e.j().g());
                    if (e6 == null) {
                        this.f2947e.q().G().c(l.a(a4, e7));
                    }
                    j(uVar, e7);
                    q4.B();
                }
                i4++;
            } finally {
                q4.i();
            }
        }
    }

    public boolean f() {
        return true;
    }

    public void j(u uVar, int i4) {
        JobInfo a4 = this.f2948f.a(uVar, i4);
        i e4 = i.e();
        String str = f2944g;
        e4.a(str, "Scheduling work ID " + uVar.f3834a + "Job ID " + i4);
        int i5 = 0;
        try {
            if (this.f2946d.schedule(a4) == 0) {
                i e5 = i.e();
                e5.k(str, "Unable to schedule work ID " + uVar.f3834a);
                if (uVar.f3850q && uVar.f3851r == Q0.m.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    uVar.f3850q = false;
                    i.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{uVar.f3834a}));
                    j(uVar, i4);
                }
            }
        } catch (IllegalStateException e6) {
            List g4 = g(this.f2945c, this.f2946d);
            if (g4 != null) {
                i5 = g4.size();
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(i5), Integer.valueOf(this.f2947e.q().J().s().size()), Integer.valueOf(this.f2947e.j().h())});
            i.e().c(f2944g, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e6);
            a l4 = this.f2947e.j().l();
            if (l4 != null) {
                l4.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th) {
            i e7 = i.e();
            String str2 = f2944g;
            e7.d(str2, "Unable to schedule " + uVar, th);
        }
    }

    public c(Context context, E e4, JobScheduler jobScheduler, b bVar) {
        this.f2945c = context;
        this.f2947e = e4;
        this.f2946d = jobScheduler;
        this.f2948f = bVar;
    }
}
