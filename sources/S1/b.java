package S1;

import S1.c;
import android.util.SparseArray;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2762a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public C0058b f2763b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray f2764a;

        /* renamed from: b  reason: collision with root package name */
        public final c.b f2765b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f2766c;

        public a(SparseArray sparseArray, c.b bVar, boolean z4) {
            this.f2764a = sparseArray;
            this.f2765b = bVar;
            this.f2766c = z4;
        }

        public SparseArray a() {
            return this.f2764a;
        }
    }

    /* renamed from: S1.b$b  reason: collision with other inner class name */
    public interface C0058b {
        void a(a aVar);

        void release();
    }

    public abstract SparseArray a(c cVar);

    public abstract boolean b();

    public void c(c cVar) {
        c.b bVar = new c.b(cVar.c());
        bVar.i();
        a aVar = new a(a(cVar), bVar, b());
        synchronized (this.f2762a) {
            try {
                C0058b bVar2 = this.f2763b;
                if (bVar2 != null) {
                    bVar2.a(aVar);
                } else {
                    throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        synchronized (this.f2762a) {
            try {
                C0058b bVar = this.f2763b;
                if (bVar != null) {
                    bVar.release();
                    this.f2763b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(C0058b bVar) {
        synchronized (this.f2762a) {
            try {
                C0058b bVar2 = this.f2763b;
                if (bVar2 != null) {
                    bVar2.release();
                }
                this.f2763b = bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
