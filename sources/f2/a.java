package F2;

import T2.a;
import U2.c;
import Y2.j;
import android.app.Activity;
import v3.l;

public final class a implements T2.a, j.c, U2.a {

    /* renamed from: c  reason: collision with root package name */
    public Activity f1031c;

    /* renamed from: d  reason: collision with root package name */
    public j f1032d;

    public void onAttachedToActivity(c cVar) {
        l.e(cVar, "binding");
        this.f1031c = cVar.e();
    }

    public void onAttachedToEngine(a.b bVar) {
        l.e(bVar, "flutterPluginBinding");
        j jVar = new j(bVar.b(), "screen_protector");
        this.f1032d = jVar;
        jVar.e(this);
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(a.b bVar) {
        l.e(bVar, "binding");
        j jVar = this.f1032d;
        if (jVar == null) {
            l.n("channel");
            jVar = null;
        }
        jVar.e((j.c) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r3 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r3 = r3.getWindow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r3 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r3.clearFlags(8192);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r4.a(java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        r4.a(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r3.equals("protectDataLeakageOn") == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r3.equals("preventScreenshotOn") == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3 = r2.f1031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r3 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        r3 = r3.getWindow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r3 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r3.setFlags(8192, 8192);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        r4.a(java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        r4.a(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r3.equals("preventScreenshotOff") == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r3.equals("protectDataLeakageOff") == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r3 = r2.f1031c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(Y2.i r3, Y2.j.d r4) {
        /*
            r2 = this;
            java.lang.String r0 = "call"
            v3.l.e(r3, r0)
            java.lang.String r0 = "result"
            v3.l.e(r4, r0)
            java.lang.String r3 = r3.f3766a
            if (r3 == 0) goto L_0x007e
            int r0 = r3.hashCode()
            r1 = 8192(0x2000, float:1.14794E-41)
            switch(r0) {
                case -2122989593: goto L_0x006f;
                case -1079249955: goto L_0x004d;
                case -538896734: goto L_0x0044;
                case 474070284: goto L_0x0022;
                case 902989617: goto L_0x0019;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x007e
        L_0x0019:
            java.lang.String r0 = "preventScreenshotOff"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x002b
            goto L_0x007e
        L_0x0022:
            java.lang.String r0 = "protectDataLeakageOff"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x002b
            goto L_0x007e
        L_0x002b:
            android.app.Activity r3 = r2.f1031c     // Catch:{ Exception -> 0x003e }
            if (r3 == 0) goto L_0x0038
            android.view.Window r3 = r3.getWindow()     // Catch:{ Exception -> 0x003e }
            if (r3 == 0) goto L_0x0038
            r3.clearFlags(r1)     // Catch:{ Exception -> 0x003e }
        L_0x0038:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x003e }
            r4.a(r3)     // Catch:{ Exception -> 0x003e }
            goto L_0x0083
        L_0x003e:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.a(r3)
            goto L_0x0083
        L_0x0044:
            java.lang.String r0 = "protectDataLeakageOn"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0056
            goto L_0x007e
        L_0x004d:
            java.lang.String r0 = "preventScreenshotOn"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0056
            goto L_0x007e
        L_0x0056:
            android.app.Activity r3 = r2.f1031c     // Catch:{ Exception -> 0x0069 }
            if (r3 == 0) goto L_0x0063
            android.view.Window r3 = r3.getWindow()     // Catch:{ Exception -> 0x0069 }
            if (r3 == 0) goto L_0x0063
            r3.setFlags(r1, r1)     // Catch:{ Exception -> 0x0069 }
        L_0x0063:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0069 }
            r4.a(r3)     // Catch:{ Exception -> 0x0069 }
            goto L_0x0083
        L_0x0069:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.a(r3)
            goto L_0x0083
        L_0x006f:
            java.lang.String r0 = "isRecording"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0078
            goto L_0x007e
        L_0x0078:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.a(r3)
            goto L_0x0083
        L_0x007e:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.a(r3)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.a.onMethodCall(Y2.i, Y2.j$d):void");
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        l.e(cVar, "binding");
        this.f1031c = cVar.e();
    }
}
