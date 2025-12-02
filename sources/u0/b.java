package U0;

import Q0.b;
import Q0.i;
import Q0.j;
import Z0.u;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;

public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f2941b = i.i("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f2942a;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2943a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                Q0.j[] r0 = Q0.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2943a = r0
                Q0.j r1 = Q0.j.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2943a     // Catch:{ NoSuchFieldError -> 0x001d }
                Q0.j r1 = Q0.j.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2943a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Q0.j r1 = Q0.j.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2943a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Q0.j r1 = Q0.j.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2943a     // Catch:{ NoSuchFieldError -> 0x003e }
                Q0.j r1 = Q0.j.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: U0.b.a.<clinit>():void");
        }
    }

    public b(Context context) {
        this.f2942a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri b(b.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.a(), cVar.b() ? 1 : 0);
    }

    public static int c(j jVar) {
        int i4 = a.f2943a[jVar.ordinal()];
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 3) {
            return 2;
        }
        if (i4 == 4) {
            return 3;
        }
        if (i4 == 5) {
            return 4;
        }
        i e4 = i.e();
        String str = f2941b;
        e4.a(str, "API version too low. Cannot convert network type value " + jVar);
        return 1;
    }

    public static void d(JobInfo.Builder builder, j jVar) {
        if (Build.VERSION.SDK_INT < 30 || jVar != j.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(jVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo a(u uVar, int i4) {
        Q0.b bVar = uVar.f3843j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", uVar.f3834a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", uVar.d());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", uVar.h());
        JobInfo.Builder extras = new JobInfo.Builder(i4, this.f2942a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.d());
        boolean z4 = false;
        if (!bVar.h()) {
            extras.setBackoffCriteria(uVar.f3846m, uVar.f3845l == Q0.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(uVar.a() - System.currentTimeMillis(), 0);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!uVar.f3850q) {
            extras.setImportantWhileForeground(true);
        }
        if (bVar.e()) {
            for (b.c b4 : bVar.c()) {
                extras.addTriggerContentUri(b(b4));
            }
            extras.setTriggerContentUpdateDelay(bVar.b());
            extras.setTriggerContentMaxDelay(bVar.a());
        }
        extras.setPersisted(false);
        int i5 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(bVar.f());
        extras.setRequiresStorageNotLow(bVar.i());
        boolean z5 = uVar.f3844k > 0;
        if (max > 0) {
            z4 = true;
        }
        if (i5 >= 31 && uVar.f3850q && !z5 && !z4) {
            JobInfo.Builder unused = extras.setExpedited(true);
        }
        return extras.build();
    }
}
