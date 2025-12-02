package w1;

import android.app.Dialog;
import java.util.Objects;

public final class V extends C0967D {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Dialog f12560a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ W f12561b;

    public V(W w4, Dialog dialog) {
        this.f12560a = dialog;
        Objects.requireNonNull(w4);
        this.f12561b = w4;
    }

    public final void a() {
        this.f12561b.f12563f.r();
        Dialog dialog = this.f12560a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
