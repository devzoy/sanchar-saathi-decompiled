package com.google.android.play.core.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: c  reason: collision with root package name */
    public ResultReceiver f8288c;

    public final void a() {
        ResultReceiver resultReceiver = this.f8288c;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    public final void onActivityResult(int i4, int i5, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 0 && (resultReceiver = this.f8288c) != null) {
            if (i5 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i5 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            android.content.Intent r0 = r11.getIntent()
            r1 = 0
            java.lang.String r2 = "window_flags"
            int r0 = r0.getIntExtra(r2, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0023
            android.view.Window r3 = r11.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.setSystemUiVisibility(r0)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r3.putExtra(r2, r0)
            r7 = r3
            goto L_0x0024
        L_0x0023:
            r7 = r1
        L_0x0024:
            super.onCreate(r12)
            java.lang.String r0 = "result_receiver"
            if (r12 != 0) goto L_0x006a
            android.content.Intent r12 = r11.getIntent()
            android.os.Parcelable r12 = r12.getParcelableExtra(r0)
            android.os.ResultReceiver r12 = (android.os.ResultReceiver) r12
            r11.f8288c = r12
            android.content.Intent r12 = r11.getIntent()
            android.os.Bundle r12 = r12.getExtras()
            if (r12 == 0) goto L_0x004a
            java.lang.String r0 = "confirmation_intent"
            java.lang.Object r0 = r12.get(r0)
            r1 = r0
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x004a:
            if (r12 == 0) goto L_0x0063
            if (r1 != 0) goto L_0x004f
            goto L_0x0063
        L_0x004f:
            android.content.IntentSender r5 = r1.getIntentSender()     // Catch:{ SendIntentException -> 0x005c }
            r9 = 0
            r10 = 0
            r6 = 0
            r8 = 0
            r4 = r11
            r4.startIntentSenderForResult(r5, r6, r7, r8, r9, r10)     // Catch:{ SendIntentException -> 0x005c }
            return
        L_0x005c:
            r11.a()
            r11.finish()
            return
        L_0x0063:
            r11.a()
            r11.finish()
            return
        L_0x006a:
            android.os.Parcelable r12 = r12.getParcelable(r0)
            android.os.ResultReceiver r12 = (android.os.ResultReceiver) r12
            r11.f8288c = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.common.PlayCoreDialogWrapperActivity.onCreate(android.os.Bundle):void");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f8288c);
    }
}
