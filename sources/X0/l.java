package X0;

import Q0.i;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c1.C0403b;

public final class l extends e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context, C0403b bVar) {
        super(context, bVar);
        v3.l.e(context, "context");
        v3.l.e(bVar, "taskExecutor");
    }

    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    public void k(Intent intent) {
        v3.l.e(intent, "intent");
        if (intent.getAction() != null) {
            i e4 = i.e();
            String a4 = m.f3457a;
            e4.a(a4, "Received " + intent.getAction());
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1181163412) {
                    if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        g(Boolean.TRUE);
                    }
                } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    g(Boolean.FALSE);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L_0x003c;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean e() {
        /*
            r5 = this;
            android.content.Context r0 = r5.d()
            r1 = 0
            android.content.IntentFilter r2 = r5.j()
            android.content.Intent r0 = r0.registerReceiver(r1, r2)
            r1 = 1
            if (r0 == 0) goto L_0x003d
            java.lang.String r2 = r0.getAction()
            if (r2 != 0) goto L_0x0017
            goto L_0x003d
        L_0x0017:
            java.lang.String r0 = r0.getAction()
            r2 = 0
            if (r0 == 0) goto L_0x003c
            int r3 = r0.hashCode()
            r4 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r3 == r4) goto L_0x0036
            r4 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r3 == r4) goto L_0x002d
            goto L_0x003c
        L_0x002d:
            java.lang.String r3 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x003d
            goto L_0x003c
        L_0x0036:
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r0 = r0.equals(r1)
        L_0x003c:
            r1 = r2
        L_0x003d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.l.e():java.lang.Boolean");
    }
}
