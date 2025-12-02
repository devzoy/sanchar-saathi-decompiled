package z1;

import android.content.Intent;
import w1.C0975h;

/* renamed from: z1.y  reason: case insensitive filesystem */
public final class C1041y extends C1042z {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Intent f13030c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0975h f13031d;

    public C1041y(Intent intent, C0975h hVar, int i4) {
        this.f13030c = intent;
        this.f13031d = hVar;
    }

    public final void a() {
        Intent intent = this.f13030c;
        if (intent != null) {
            this.f13031d.startActivityForResult(intent, 2);
        }
    }
}
