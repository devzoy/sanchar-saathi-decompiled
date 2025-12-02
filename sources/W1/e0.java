package w1;

import K1.r;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import v.C0944a;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f12606a = Collections.synchronizedMap(new C0944a());

    /* renamed from: b  reason: collision with root package name */
    public int f12607b = 0;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f12608c;

    public final C0974g a(String str, Class cls) {
        return (C0974g) cls.cast(this.f12606a.get(str));
    }

    public final void b(String str, C0974g gVar) {
        Map map = this.f12606a;
        if (!map.containsKey(str)) {
            map.put(str, gVar);
            if (this.f12607b > 0) {
                new r(Looper.getMainLooper()).post(new d0(this, gVar, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void c(Bundle bundle) {
        this.f12607b = 1;
        this.f12608c = bundle;
        for (Map.Entry entry : this.f12606a.entrySet()) {
            ((C0974g) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void d() {
        this.f12607b = 2;
        for (C0974g j4 : this.f12606a.values()) {
            j4.j();
        }
    }

    public final void e() {
        this.f12607b = 3;
        for (C0974g h4 : this.f12606a.values()) {
            h4.h();
        }
    }

    public final void f(int i4, int i5, Intent intent) {
        for (C0974g e4 : this.f12606a.values()) {
            e4.e(i4, i5, intent);
        }
    }

    public final void g(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : this.f12606a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((C0974g) entry.getValue()).i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void h() {
        this.f12607b = 4;
        for (C0974g k4 : this.f12606a.values()) {
            k4.k();
        }
    }

    public final void i() {
        this.f12607b = 5;
        for (C0974g g4 : this.f12606a.values()) {
            g4.g();
        }
    }

    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (C0974g a4 : this.f12606a.values()) {
            a4.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final /* synthetic */ int k() {
        return this.f12607b;
    }

    public final /* synthetic */ Bundle l() {
        return this.f12608c;
    }
}
