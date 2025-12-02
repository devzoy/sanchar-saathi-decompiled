package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import h3.C0673n;
import java.util.LinkedHashMap;
import java.util.Map;
import u0.j;
import u0.k;
import v3.l;

public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: c  reason: collision with root package name */
    public int f6041c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f6042d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final RemoteCallbackList f6043e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    public final k.a f6044f = new a(this);

    public static final class a extends k.a {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ MultiInstanceInvalidationService f6045c;

        public a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f6045c = multiInstanceInvalidationService;
        }

        public int s(j jVar, String str) {
            l.e(jVar, "callback");
            int i4 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList a4 = this.f6045c.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6045c;
            synchronized (a4) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                    int c4 = multiInstanceInvalidationService.c();
                    if (multiInstanceInvalidationService.a().register(jVar, Integer.valueOf(c4))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(c4), str);
                        i4 = c4;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                        multiInstanceInvalidationService.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i4;
        }

        public void x(j jVar, int i4) {
            l.e(jVar, "callback");
            RemoteCallbackList a4 = this.f6045c.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6045c;
            synchronized (a4) {
                multiInstanceInvalidationService.a().unregister(jVar);
                String str = (String) multiInstanceInvalidationService.b().remove(Integer.valueOf(i4));
            }
        }

        public void z(int i4, String[] strArr) {
            l.e(strArr, "tables");
            RemoteCallbackList a4 = this.f6045c.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f6045c;
            synchronized (a4) {
                String str = (String) multiInstanceInvalidationService.b().get(Integer.valueOf(i4));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                int i5 = 0;
                while (i5 < beginBroadcast) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i5);
                        l.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.b().get(num);
                        if (i4 != intValue && l.a(str, str2)) {
                            try {
                                ((j) multiInstanceInvalidationService.a().getBroadcastItem(i5)).p(strArr);
                            } catch (RemoteException e4) {
                                Log.w("ROOM", "Error invoking a remote callback", e4);
                            }
                        }
                        i5++;
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.a().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                C0673n nVar = C0673n.f9639a;
            }
        }
    }

    public static final class b extends RemoteCallbackList {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MultiInstanceInvalidationService f6046a;

        public b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f6046a = multiInstanceInvalidationService;
        }

        /* renamed from: a */
        public void onCallbackDied(j jVar, Object obj) {
            l.e(jVar, "callback");
            l.e(obj, "cookie");
            this.f6046a.b().remove((Integer) obj);
        }
    }

    public final RemoteCallbackList a() {
        return this.f6043e;
    }

    public final Map b() {
        return this.f6042d;
    }

    public final int c() {
        return this.f6041c;
    }

    public final void d(int i4) {
        this.f6041c = i4;
    }

    public IBinder onBind(Intent intent) {
        l.e(intent, "intent");
        return this.f6044f;
    }
}
