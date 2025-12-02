package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

public class c implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public final NotificationDetails f6613e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6614f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f6615g;

    public c(NotificationDetails notificationDetails, int i4, ArrayList arrayList) {
        this.f6613e = notificationDetails;
        this.f6614f = i4;
        this.f6615g = arrayList;
    }

    public String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f6613e + ", startMode=" + this.f6614f + ", foregroundServiceTypes=" + this.f6615g + '}';
    }
}
