package N2;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class G {

    /* renamed from: c  reason: collision with root package name */
    public static G f1884c;

    /* renamed from: a  reason: collision with root package name */
    public final LongSparseArray f1885a = new LongSparseArray();

    /* renamed from: b  reason: collision with root package name */
    public final PriorityQueue f1886b = new PriorityQueue();

    public static class a {

        /* renamed from: b  reason: collision with root package name */
        public static final AtomicLong f1887b = new AtomicLong(0);

        /* renamed from: a  reason: collision with root package name */
        public final long f1888a;

        public a(long j4) {
            this.f1888a = j4;
        }

        public static a b() {
            return c(f1887b.incrementAndGet());
        }

        public static a c(long j4) {
            return new a(j4);
        }

        public long d() {
            return this.f1888a;
        }
    }

    public static G a() {
        if (f1884c == null) {
            f1884c = new G();
        }
        return f1884c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f1886b.isEmpty() && ((Long) this.f1886b.peek()).longValue() < aVar.f1888a) {
            this.f1885a.remove(((Long) this.f1886b.poll()).longValue());
        }
        if (!this.f1886b.isEmpty() && ((Long) this.f1886b.peek()).longValue() == aVar.f1888a) {
            this.f1886b.poll();
        }
        MotionEvent motionEvent = (MotionEvent) this.f1885a.get(aVar.f1888a);
        this.f1885a.remove(aVar.f1888a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b4 = a.b();
        this.f1885a.put(b4.f1888a, MotionEvent.obtain(motionEvent));
        this.f1886b.add(Long.valueOf(b4.f1888a));
        return b4;
    }
}
