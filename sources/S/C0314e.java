package S;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: S.e  reason: case insensitive filesystem */
public class C0314e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2682a;

    /* renamed from: b  reason: collision with root package name */
    public final C0315f f2683b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2684c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2685d;

    /* renamed from: e  reason: collision with root package name */
    public VelocityTracker f2686e;

    /* renamed from: f  reason: collision with root package name */
    public float f2687f;

    /* renamed from: g  reason: collision with root package name */
    public int f2688g;

    /* renamed from: h  reason: collision with root package name */
    public int f2689h;

    /* renamed from: i  reason: collision with root package name */
    public int f2690i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f2691j;

    /* renamed from: S.e$a */
    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i4);
    }

    /* renamed from: S.e$b */
    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i4);
    }

    public C0314e(Context context, C0315f fVar) {
        this(context, fVar, new C0312c(), new C0313d());
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = G.g(context, viewConfiguration, motionEvent.getDeviceId(), i4, motionEvent.getSource());
        iArr[1] = G.f(context, viewConfiguration, motionEvent.getDeviceId(), i4, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i4) {
        C0334z.a(velocityTracker, motionEvent);
        C0334z.b(velocityTracker, 1000);
        return C0334z.d(velocityTracker, i4);
    }

    public final boolean d(MotionEvent motionEvent, int i4) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f2689h == source && this.f2690i == deviceId && this.f2688g == i4) {
            return false;
        }
        this.f2684c.a(this.f2682a, this.f2691j, motionEvent, i4);
        this.f2689h = source;
        this.f2690i = deviceId;
        this.f2688g = i4;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i4) {
        if (this.f2686e == null) {
            this.f2686e = VelocityTracker.obtain();
        }
        return this.f2685d.a(this.f2686e, motionEvent, i4);
    }

    public void g(MotionEvent motionEvent, int i4) {
        boolean d4 = d(motionEvent, i4);
        if (this.f2691j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f2686e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2686e = null;
                return;
            }
            return;
        }
        float e4 = e(motionEvent, i4) * this.f2683b.b();
        float signum = Math.signum(e4);
        float f4 = 0.0f;
        if (d4 || !(signum == Math.signum(this.f2687f) || signum == 0.0f)) {
            this.f2683b.c();
        }
        float abs = Math.abs(e4);
        int[] iArr = this.f2691j;
        if (abs >= ((float) iArr[0])) {
            int i5 = iArr[1];
            float max = Math.max((float) (-i5), Math.min(e4, (float) i5));
            if (this.f2683b.a(max)) {
                f4 = max;
            }
            this.f2687f = f4;
        }
    }

    public C0314e(Context context, C0315f fVar, b bVar, a aVar) {
        this.f2688g = -1;
        this.f2689h = -1;
        this.f2690i = -1;
        this.f2691j = new int[]{Integer.MAX_VALUE, 0};
        this.f2682a = context;
        this.f2683b = fVar;
        this.f2684c = bVar;
        this.f2685d = aVar;
    }
}
