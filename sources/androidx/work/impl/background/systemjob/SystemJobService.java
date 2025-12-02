package androidx.work.impl.background.systemjob;

import Q0.i;
import R0.C0303e;
import R0.E;
import R0.v;
import R0.w;
import Z0.m;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.PersistableBundle;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements C0303e {

    /* renamed from: f  reason: collision with root package name */
    public static final String f6194f = i.i("SystemJobService");

    /* renamed from: c  reason: collision with root package name */
    public E f6195c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f6196d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final w f6197e = new w();

    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    public static m a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public void d(m mVar, boolean z4) {
        JobParameters jobParameters;
        i e4 = i.e();
        String str = f6194f;
        e4.a(str, mVar.b() + " executed on JobScheduler");
        synchronized (this.f6196d) {
            jobParameters = (JobParameters) this.f6196d.remove(mVar);
        }
        this.f6197e.b(mVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z4);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            E l4 = E.l(getApplicationContext());
            this.f6195c = l4;
            l4.n().g(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                i.e().k(f6194f, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        E e4 = this.f6195c;
        if (e4 != null) {
            e4.n().n(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r2 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.a.b(r8) == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        r2.f6096b = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.a.b(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.a.a(r8) == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        r2.f6095a = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.a.a(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        r2.f6097c = androidx.work.impl.background.systemjob.SystemJobService.b.a(r8);
        r7.f6195c.x(r7.f6197e.d(r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r8) {
        /*
            r7 = this;
            R0.E r0 = r7.f6195c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            Q0.i r0 = Q0.i.e()
            java.lang.String r3 = f6194f
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            r0.a(r3, r4)
            r7.jobFinished(r8, r1)
            return r2
        L_0x0015:
            Z0.m r0 = a(r8)
            if (r0 != 0) goto L_0x0027
            Q0.i r8 = Q0.i.e()
            java.lang.String r0 = f6194f
            java.lang.String r1 = "WorkSpec id not found!"
            r8.c(r0, r1)
            return r2
        L_0x0027:
            java.util.Map r3 = r7.f6196d
            monitor-enter(r3)
            java.util.Map r4 = r7.f6196d     // Catch:{ all -> 0x004e }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0050
            Q0.i r8 = Q0.i.e()     // Catch:{ all -> 0x004e }
            java.lang.String r1 = f6194f     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r4.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r5 = "Job is already being executed by SystemJobService: "
            r4.append(r5)     // Catch:{ all -> 0x004e }
            r4.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x004e }
            r8.a(r1, r0)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            return r2
        L_0x004e:
            r8 = move-exception
            goto L_0x00a7
        L_0x0050:
            Q0.i r2 = Q0.i.e()     // Catch:{ all -> 0x004e }
            java.lang.String r4 = f6194f     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r5.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r6 = "onStartJob for "
            r5.append(r6)     // Catch:{ all -> 0x004e }
            r5.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004e }
            r2.a(r4, r5)     // Catch:{ all -> 0x004e }
            java.util.Map r2 = r7.f6196d     // Catch:{ all -> 0x004e }
            r2.put(r0, r8)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r3 = androidx.work.impl.background.systemjob.SystemJobService.a.b(r8)
            if (r3 == 0) goto L_0x0085
            android.net.Uri[] r3 = androidx.work.impl.background.systemjob.SystemJobService.a.b(r8)
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.f6096b = r3
        L_0x0085:
            java.lang.String[] r3 = androidx.work.impl.background.systemjob.SystemJobService.a.a(r8)
            if (r3 == 0) goto L_0x0095
            java.lang.String[] r3 = androidx.work.impl.background.systemjob.SystemJobService.a.a(r8)
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.f6095a = r3
        L_0x0095:
            android.net.Network r8 = androidx.work.impl.background.systemjob.SystemJobService.b.a(r8)
            r2.f6097c = r8
            R0.E r8 = r7.f6195c
            R0.w r3 = r7.f6197e
            R0.v r0 = r3.d(r0)
            r8.x(r0, r2)
            return r1
        L_0x00a7:
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f6195c == null) {
            i.e().a(f6194f, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        m a4 = a(jobParameters);
        if (a4 == null) {
            i.e().c(f6194f, "WorkSpec id not found!");
            return false;
        }
        i e4 = i.e();
        String str = f6194f;
        e4.a(str, "onStopJob for " + a4);
        synchronized (this.f6196d) {
            this.f6196d.remove(a4);
        }
        v b4 = this.f6197e.b(a4);
        if (b4 != null) {
            this.f6195c.z(b4);
        }
        return !this.f6195c.n().j(a4.b());
    }
}
