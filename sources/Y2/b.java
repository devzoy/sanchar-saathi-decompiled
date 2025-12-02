package Y2;

import java.nio.ByteBuffer;

public interface b {

    public interface a {
        void a(ByteBuffer byteBuffer, C0071b bVar);
    }

    /* renamed from: Y2.b$b  reason: collision with other inner class name */
    public interface C0071b {
        void a(ByteBuffer byteBuffer);
    }

    public interface c {
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3752a = true;

        public boolean a() {
            return this.f3752a;
        }
    }

    c a(d dVar);

    void b(String str, a aVar, c cVar);

    void c(String str, ByteBuffer byteBuffer, C0071b bVar);

    c d() {
        return a(new d());
    }

    void e(String str, a aVar);

    void f(String str, ByteBuffer byteBuffer);
}
