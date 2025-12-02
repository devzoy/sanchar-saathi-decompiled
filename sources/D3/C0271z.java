package D3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v3.g;

/* renamed from: D3.z  reason: case insensitive filesystem */
public class C0271z {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f871b = AtomicIntegerFieldUpdater.newUpdater(C0271z.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f872a;

    public C0271z(Throwable th, boolean z4) {
        this.f872a = th;
        this._handled = z4 ? 1 : 0;
    }

    public final boolean a() {
        return f871b.get(this) != 0;
    }

    public final boolean b() {
        return f871b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return M.a(this) + '[' + this.f872a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0271z(Throwable th, boolean z4, int i4, g gVar) {
        this(th, (i4 & 2) != 0 ? false : z4);
    }
}
