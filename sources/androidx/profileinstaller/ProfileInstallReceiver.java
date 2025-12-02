package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.c;
import r0.C0907e;

public class ProfileInstallReceiver extends BroadcastReceiver {

    public class a implements c.C0096c {
        public a() {
        }

        public void a(int i4, Object obj) {
            c.f5552b.a(i4, obj);
        }

        public void b(int i4, Object obj) {
            c.f5552b.b(i4, obj);
            ProfileInstallReceiver.this.setResultCode(i4);
        }
    }

    public static void a(c.C0096c cVar) {
        Process.sendSignal(Process.myPid(), 10);
        cVar.b(12, (Object) null);
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                c.k(context, new C0907e(), new a(), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        c.l(context, new C0907e(), new a());
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        c.c(context, new C0907e(), new a());
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                a(new a());
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                a aVar = new a();
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    a.b(context, aVar);
                } else {
                    aVar.b(16, (Object) null);
                }
            }
        }
    }
}
