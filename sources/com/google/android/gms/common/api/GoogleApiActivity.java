package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import u1.C0941a;
import u1.d;
import w1.C0972e;
import z1.C1032o;

public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: c  reason: collision with root package name */
    public int f6634c = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i4, boolean z4) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i4);
        intent.putExtra("notify_manager", z4);
        return intent;
    }

    public final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
        } else if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                this.f6634c = 1;
            } catch (ActivityNotFoundException e4) {
                if (extras.getBoolean("notify_manager", true)) {
                    C0972e.m(this).x(new C0941a(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 36);
                    sb.append("Activity not found while launching ");
                    sb.append(obj);
                    sb.append(".");
                    String sb2 = sb.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        sb2 = sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", sb2, e4);
                }
                this.f6634c = 1;
                finish();
            } catch (IntentSender.SendIntentException e5) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e5);
                finish();
            }
        } else {
            d.m().n(this, ((Integer) C1032o.f(num)).intValue(), 2, this);
            this.f6634c = 1;
        }
    }

    public final void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f6634c = 0;
            setResult(i5, intent);
            if (booleanExtra) {
                C0972e m4 = C0972e.m(this);
                if (i5 == -1) {
                    m4.s();
                } else if (i5 == 0) {
                    m4.x(new C0941a(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i4 == 2) {
            this.f6634c = 0;
            setResult(i5, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f6634c = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6634c = bundle.getInt("resolution");
        }
        if (this.f6634c != 1) {
            b();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f6634c);
        super.onSaveInstanceState(bundle);
    }
}
