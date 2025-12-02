package r0;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallerInitializer;

/* renamed from: r0.h  reason: case insensitive filesystem */
public final /* synthetic */ class C0910h implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Context f11963e;

    public /* synthetic */ C0910h(Context context) {
        this.f11963e = context;
    }

    public final void run() {
        ProfileInstallerInitializer.l(this.f11963e);
    }
}
