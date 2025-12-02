package r0;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallerInitializer;

/* renamed from: r0.g  reason: case insensitive filesystem */
public final /* synthetic */ class C0909g implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f11961e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f11962f;

    public /* synthetic */ C0909g(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f11961e = profileInstallerInitializer;
        this.f11962f = context;
    }

    public final void run() {
        this.f11961e.i(this.f11962f);
    }
}
