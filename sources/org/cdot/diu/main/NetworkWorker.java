package org.cdot.diu.main;

import Y2.j;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;

public class NetworkWorker extends Worker {

    public class a implements j.d {
        public a() {
        }

        public void a(Object obj) {
        }

        public void b(String str, String str2, Object obj) {
            Log.e("NetworkWorker", "Dart error: " + str2);
        }

        public void c() {
            Log.e("NetworkWorker", "submitOfflineData not implemented");
        }
    }

    public NetworkWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public c.a o() {
        if (!r()) {
            System.out.println("❌ No network available. Skipping Hive data submission.");
            Log.d("NetworkWorker", "❌ No network available. Skipping Hive data submission.");
            return c.a.b();
        }
        System.out.println("Network is ONLINE—NetworkWorker fired------Adam logs");
        Log.d("NetworkWorker", "✅ Network is ONLINE—NetworkWorker fired");
        new Handler(Looper.getMainLooper()).post(new Q3.a(this));
        return c.a.c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r0 = r0.getActiveNetworkInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r() {
        /*
            r2 = this;
            android.content.Context r0 = r2.a()
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r1 = 0
            if (r0 == 0) goto L_0x001c
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x001c
            r1 = 1
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.cdot.diu.main.NetworkWorker.r():boolean");
    }

    public final /* synthetic */ void s() {
        io.flutter.embedding.engine.a a4 = O2.a.b().a("my_engine");
        if (a4 == null) {
            Log.e("NetworkWorker", "Flutter engine not available");
        } else {
            new j(a4.k().l(), "org.cdot.diu.main/hive").d("submitOfflineData", (Object) null, new a());
        }
    }
}
