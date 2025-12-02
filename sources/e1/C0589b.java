package e1;

import S1.e;
import S1.f;
import T1.a;
import android.content.Context;
import com.amolg.flutterbarcodescanner.camera.GraphicOverlay;

/* renamed from: e1.b  reason: case insensitive filesystem */
public class C0589b implements e.b {

    /* renamed from: a  reason: collision with root package name */
    public GraphicOverlay f8761a;

    /* renamed from: b  reason: collision with root package name */
    public Context f8762b;

    /* renamed from: c  reason: collision with root package name */
    public int f8763c;

    public C0589b(GraphicOverlay graphicOverlay, Context context, int i4) {
        this.f8761a = graphicOverlay;
        this.f8762b = context;
        this.f8763c = i4;
    }

    /* renamed from: b */
    public f a(a aVar) {
        return new com.amolg.flutterbarcodescanner.a(this.f8761a, new C0588a(this.f8761a), this.f8762b, this.f8763c);
    }
}
