package v2;

import R1.f;
import R1.g;
import R1.i;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final m f12431a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f12432b = new Handler(Looper.getMainLooper());

    public h(m mVar) {
        this.f12431a = mVar;
    }

    public final f a() {
        return this.f12431a.a();
    }

    public final f b(Activity activity, b bVar) {
        if (bVar.c()) {
            return i.b((Object) null);
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", bVar.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        g gVar = new g();
        intent.putExtra("result_receiver", new g(this, this.f12432b, gVar));
        activity.startActivity(intent);
        return gVar.a();
    }
}
