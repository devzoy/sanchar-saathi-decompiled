package z1;

import android.app.Activity;
import android.content.Intent;

/* renamed from: z1.x  reason: case insensitive filesystem */
public final class C1040x extends C1042z {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Intent f13027c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Activity f13028d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13029e;

    public C1040x(Intent intent, Activity activity, int i4) {
        this.f13027c = intent;
        this.f13028d = activity;
        this.f13029e = i4;
    }

    public final void a() {
        Intent intent = this.f13027c;
        if (intent != null) {
            this.f13028d.startActivityForResult(intent, this.f13029e);
        }
    }
}
