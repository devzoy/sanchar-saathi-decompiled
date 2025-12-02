package v2;

import R1.g;
import android.app.PendingIntent;
import android.os.Bundle;
import w2.i;

public final class l extends k {
    public l(m mVar, g gVar, String str) {
        super(mVar, new i("OnRequestInstallCallback"), gVar);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.f12436d.d(new e((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
