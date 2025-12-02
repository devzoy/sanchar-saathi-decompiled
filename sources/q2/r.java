package q2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import u2.C0943a;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public final s f11906a;

    /* renamed from: b  reason: collision with root package name */
    public final IntentFilter f11907b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f11908c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f11909d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public q f11910e = null;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f11911f = false;

    public r(s sVar, IntentFilter intentFilter, Context context) {
        this.f11906a = sVar;
        this.f11907b = intentFilter;
        this.f11908c = F.a(context);
    }

    public abstract void a(Context context, Intent intent);

    public final synchronized void b(C0943a aVar) {
        this.f11906a.d("registerListener", new Object[0]);
        C0897d.a(aVar, "Registered Play Core listener should not be null.");
        this.f11909d.add(aVar);
        e();
    }

    public final synchronized void c(C0943a aVar) {
        this.f11906a.d("unregisterListener", new Object[0]);
        C0897d.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f11909d.remove(aVar);
        e();
    }

    public final synchronized void d(Object obj) {
        Iterator it = new HashSet(this.f11909d).iterator();
        while (it.hasNext()) {
            ((C0943a) it.next()).a(obj);
        }
    }

    public final void e() {
        q qVar;
        if (!this.f11909d.isEmpty() && this.f11910e == null) {
            q qVar2 = new q(this, (p) null);
            this.f11910e = qVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f11908c.registerReceiver(qVar2, this.f11907b, 2);
            } else {
                this.f11908c.registerReceiver(qVar2, this.f11907b);
            }
        }
        if (this.f11909d.isEmpty() && (qVar = this.f11910e) != null) {
            this.f11908c.unregisterReceiver(qVar);
            this.f11910e = null;
        }
    }
}
