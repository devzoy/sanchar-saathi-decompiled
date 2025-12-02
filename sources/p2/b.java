package P2;

import P2.c;
import java.nio.ByteBuffer;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c f2238e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f2239f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f2240g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c.f f2241h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f2242i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f2243j;

    public /* synthetic */ b(c cVar, String str, int i4, c.f fVar, ByteBuffer byteBuffer, long j4) {
        this.f2238e = cVar;
        this.f2239f = str;
        this.f2240g = i4;
        this.f2241h = fVar;
        this.f2242i = byteBuffer;
        this.f2243j = j4;
    }

    public final void run() {
        this.f2238e.m(this.f2239f, this.f2240g, this.f2241h, this.f2242i, this.f2243j);
    }
}
