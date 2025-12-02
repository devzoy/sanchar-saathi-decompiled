package androidx.window.layout.adapter.sidecar;

import N0.a;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;

public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6052a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public SidecarDeviceState f6053b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f6054c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final a f6055d;

    /* renamed from: e  reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f6056e;

    public DistinctElementSidecarCallback(a aVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f6055d = aVar;
        this.f6056e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState != null) {
            synchronized (this.f6052a) {
                try {
                    if (!this.f6055d.a(this.f6053b, sidecarDeviceState)) {
                        this.f6053b = sidecarDeviceState;
                        this.f6056e.onDeviceStateChanged(sidecarDeviceState);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f6052a) {
            try {
                if (!this.f6055d.d((SidecarWindowLayoutInfo) this.f6054c.get(iBinder), sidecarWindowLayoutInfo)) {
                    this.f6054c.put(iBinder, sidecarWindowLayoutInfo);
                    this.f6056e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
