package U1;

import com.google.android.gms.internal.vision.C0556x;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;

public final class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f2949e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0556x f2950f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ DynamiteClearcutLogger f2951g;

    public a(DynamiteClearcutLogger dynamiteClearcutLogger, int i4, C0556x xVar) {
        this.f2951g = dynamiteClearcutLogger;
        this.f2949e = i4;
        this.f2950f = xVar;
    }

    public final void run() {
        this.f2951g.zzc.zza(this.f2949e, this.f2950f);
    }
}
