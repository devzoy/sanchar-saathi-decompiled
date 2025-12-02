package v2;

import R1.f;
import R1.g;
import android.content.Context;
import android.content.Intent;
import w2.i;
import w2.o;
import w2.t;
import w2.w;

public final class m {

    /* renamed from: c  reason: collision with root package name */
    public static final i f12438c = new i("ReviewService");

    /* renamed from: a  reason: collision with root package name */
    public t f12439a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12440b;

    public m(Context context) {
        this.f12440b = context.getPackageName();
        if (w.a(context)) {
            Context context2 = context;
            this.f12439a = new t(context2, f12438c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new i(), (o) null);
        }
    }

    public final f a() {
        String str = this.f12440b;
        i iVar = f12438c;
        iVar.c("requestInAppReview (%s)", str);
        if (this.f12439a == null) {
            iVar.a("Play Store app is either not installed or not the official version", new Object[0]);
            return R1.i.a(new C0957a(-1));
        }
        g gVar = new g();
        this.f12439a.s(new j(this, gVar, gVar), gVar);
        return gVar.a();
    }
}
