package com.dexterous.flutterlocalnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ScheduledNotificationBootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (action.equals("android.intent.action.BOOT_COMPLETED") || action.equals("android.intent.action.MY_PACKAGE_REPLACED") || action.equals("android.intent.action.QUICKBOOT_POWERON") || action.equals("com.htc.intent.action.QUICKBOOT_POWERON")) {
            FlutterLocalNotificationsPlugin.rescheduleNotifications(context);
        }
    }
}
