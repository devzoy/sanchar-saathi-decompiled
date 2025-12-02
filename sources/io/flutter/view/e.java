package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

public class e {

    /* renamed from: e  reason: collision with root package name */
    public static e f10792e;

    /* renamed from: f  reason: collision with root package name */
    public static b f10793f;

    /* renamed from: a  reason: collision with root package name */
    public long f10794a = -1;

    /* renamed from: b  reason: collision with root package name */
    public FlutterJNI f10795b;

    /* renamed from: c  reason: collision with root package name */
    public c f10796c = new c(0);

    /* renamed from: d  reason: collision with root package name */
    public final FlutterJNI.b f10797d = new a();

    public class a implements FlutterJNI.b {
        public a() {
        }

        public void a(long j4) {
            Choreographer.getInstance().postFrameCallback(b(j4));
        }

        public final Choreographer.FrameCallback b(long j4) {
            if (e.this.f10796c == null) {
                return new c(j4);
            }
            long unused = e.this.f10796c.f10801a = j4;
            c d4 = e.this.f10796c;
            c unused2 = e.this.f10796c = null;
            return d4;
        }
    }

    public class b implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        public DisplayManager f10799a;

        public b(DisplayManager displayManager) {
            this.f10799a = displayManager;
        }

        public void a() {
            this.f10799a.registerDisplayListener(this, (Handler) null);
        }

        public void onDisplayAdded(int i4) {
        }

        public void onDisplayChanged(int i4) {
            if (i4 == 0) {
                float refreshRate = this.f10799a.getDisplay(0).getRefreshRate();
                long unused = e.this.f10794a = (long) (1.0E9d / ((double) refreshRate));
                e.this.f10795b.setRefreshRateFPS(refreshRate);
            }
        }

        public void onDisplayRemoved(int i4) {
        }
    }

    public class c implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        public long f10801a;

        public c(long j4) {
            this.f10801a = j4;
        }

        public void doFrame(long j4) {
            long nanoTime = System.nanoTime() - j4;
            e.this.f10795b.onVsync(nanoTime < 0 ? 0 : nanoTime, e.this.f10794a, this.f10801a);
            c unused = e.this.f10796c = this;
        }
    }

    public e(FlutterJNI flutterJNI) {
        this.f10795b = flutterJNI;
    }

    public static e f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f10792e == null) {
            f10792e = new e(flutterJNI);
        }
        if (f10793f == null) {
            e eVar = f10792e;
            Objects.requireNonNull(eVar);
            b bVar = new b(displayManager);
            f10793f = bVar;
            bVar.a();
        }
        if (f10792e.f10794a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f10792e.f10794a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f10792e;
    }

    public void g() {
        this.f10795b.setAsyncWaitForVsyncDelegate(this.f10797d);
    }
}
