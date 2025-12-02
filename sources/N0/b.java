package N0;

import R.a;
import android.app.Activity;
import android.content.res.Configuration;
import androidx.window.layout.adapter.sidecar.SidecarCompat;

public final /* synthetic */ class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SidecarCompat f1846a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f1847b;

    public /* synthetic */ b(SidecarCompat sidecarCompat, Activity activity) {
        this.f1846a = sidecarCompat;
        this.f1847b = activity;
    }

    public final void accept(Object obj) {
        SidecarCompat.l(this.f1846a, this.f1847b, (Configuration) obj);
    }
}
