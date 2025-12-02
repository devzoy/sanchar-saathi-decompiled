package com.pairip.licensecheck;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;

public class LicenseActivity extends Activity {
    public static final String ACTIVITY_TYPE_ARG_NAME = "activitytype";
    public static final String PAYWALL_INTENT_ARG_NAME = "paywallintent";
    private static final String TAG = "LicenseActivity";

    public enum ActivityType {
        PAYWALL,
        ERROR_DIALOG
    }

    public void onStart() {
        super.onStart();
        try {
            int ordinal = ((ActivityType) getIntent().getSerializableExtra(ACTIVITY_TYPE_ARG_NAME)).ordinal();
            if (ordinal == 0) {
                showPaywallAndCloseApp();
            } else if (ordinal == 1) {
                showErrorDialog();
            }
        } catch (Exception e4) {
            logAndShowErrorDialog("Couldn't process license activity correctly.", e4);
        }
    }

    private void showPaywallAndCloseApp() {
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra(PAYWALL_INTENT_ARG_NAME);
        if (pendingIntent == null) {
            logAndShowErrorDialog("Paywall intent is not provided.");
        } else {
            runOnUiThread(new LicenseActivity$$ExternalSyntheticLambda0(this, pendingIntent));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$showPaywallAndCloseApp$0(PendingIntent pendingIntent) {
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
            } else {
                pendingIntent.send();
            }
            closeApp();
        } catch (PendingIntent.CanceledException e4) {
            logAndShowErrorDialog("Paywall intent unexpectedly cancelled.", e4);
        }
    }

    private void logAndShowErrorDialog(String str, Exception exc) {
        String stackTraceString = Log.getStackTraceString(exc);
        logAndShowErrorDialog(str + " " + stackTraceString);
    }

    private void logAndShowErrorDialog(String str) {
        Log.e(TAG, str);
        showErrorDialog();
    }

    private void showErrorDialog() {
        runOnUiThread(new LicenseActivity$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$showErrorDialog$0() {
        try {
            new AlertDialog.Builder(this).setTitle("Something went wrong").setMessage("Check that Google Play is enabled on your device and that you're using an up-to-date version before opening the app. If the problem persists try reinstalling the app.").setPositiveButton("Close", new LicenseActivity$$ExternalSyntheticLambda2(this)).setCancelable(false).show();
        } catch (RuntimeException e4) {
            String stackTraceString = Log.getStackTraceString(e4);
            Log.d(TAG, "Couldn't show the error dialog. " + stackTraceString);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$showErrorDialog$1(DialogInterface dialogInterface, int i4) {
        closeApp();
    }

    /* access modifiers changed from: protected */
    public void closeApp() {
        finishAndRemoveTask();
        System.exit(0);
    }
}
