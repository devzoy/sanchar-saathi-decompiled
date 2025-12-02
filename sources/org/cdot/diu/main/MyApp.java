package org.cdot.diu.main;

import P2.a;
import Q0.b;
import Q0.c;
import Q0.j;
import Q0.n;
import Q0.t;
import R2.d;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import io.flutter.embedding.engine.a;
import java.util.concurrent.TimeUnit;

public class MyApp extends Application {
    public void onCreate() {
        super.onCreate();
        d dVar = new d();
        dVar.m(getApplicationContext());
        dVar.f(getApplicationContext(), (String[]) null);
        a aVar = new a(this);
        aVar.k().j(new a.c(dVar.g(), "backgroundMain"));
        O2.a.b().c("my_engine", aVar);
        NotificationChannel notificationChannel = new NotificationChannel("offline_data_channel", "Offline Data Submission", 3);
        notificationChannel.setDescription("Notifies when offline Hive data is sent");
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        t d4 = t.d(this);
        c cVar = c.KEEP;
        d4.c("NetworkTask", cVar, (n) ((n.a) new n.a(NetworkWorker.class, 15, TimeUnit.MINUTES).h(new b.a().b(j.CONNECTED).a())).a());
    }
}
