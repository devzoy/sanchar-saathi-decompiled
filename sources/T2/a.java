package T2;

import android.content.Context;
import io.flutter.plugin.platform.j;
import io.flutter.view.TextureRegistry;

public interface a {

    /* renamed from: T2.a$a  reason: collision with other inner class name */
    public interface C0063a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f2934a;

        /* renamed from: b  reason: collision with root package name */
        public final io.flutter.embedding.engine.a f2935b;

        /* renamed from: c  reason: collision with root package name */
        public final Y2.b f2936c;

        /* renamed from: d  reason: collision with root package name */
        public final TextureRegistry f2937d;

        /* renamed from: e  reason: collision with root package name */
        public final j f2938e;

        /* renamed from: f  reason: collision with root package name */
        public final C0063a f2939f;

        /* renamed from: g  reason: collision with root package name */
        public final io.flutter.embedding.engine.b f2940g;

        public b(Context context, io.flutter.embedding.engine.a aVar, Y2.b bVar, TextureRegistry textureRegistry, j jVar, C0063a aVar2, io.flutter.embedding.engine.b bVar2) {
            this.f2934a = context;
            this.f2935b = aVar;
            this.f2936c = bVar;
            this.f2937d = textureRegistry;
            this.f2938e = jVar;
            this.f2939f = aVar2;
            this.f2940g = bVar2;
        }

        public Context a() {
            return this.f2934a;
        }

        public Y2.b b() {
            return this.f2936c;
        }

        public j c() {
            return this.f2938e;
        }
    }

    void onAttachedToEngine(b bVar);

    void onDetachedFromEngine(b bVar);
}
