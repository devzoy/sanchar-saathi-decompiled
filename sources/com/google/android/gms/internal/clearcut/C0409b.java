package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.clearcut.b  reason: case insensitive filesystem */
public abstract class C0409b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile UserManager f7034a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f7035b = (!b());

    public static boolean a(Context context) {
        return b() && !c(context);
    }

    public static boolean b() {
        return true;
    }

    public static boolean c(Context context) {
        boolean z4 = f7035b;
        if (!z4) {
            UserManager userManager = f7034a;
            if (userManager == null) {
                synchronized (C0409b.class) {
                    try {
                        userManager = f7034a;
                        if (userManager == null) {
                            UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                            f7034a = userManager2;
                            if (userManager2 == null) {
                                f7035b = true;
                                return true;
                            }
                            userManager = userManager2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            z4 = userManager.isUserUnlocked();
            f7035b = z4;
            if (z4) {
                f7034a = null;
            }
        }
        return z4;
    }
}
