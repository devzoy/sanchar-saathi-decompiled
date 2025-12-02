package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class c implements DynamiteModule.b {
    public final DynamiteModule.b.C0126b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0126b bVar = new DynamiteModule.b.C0126b();
        int b4 = aVar.b(context, str);
        bVar.f6696a = b4;
        if (b4 != 0) {
            bVar.f6698c = -1;
        } else {
            int a4 = aVar.a(context, str, true);
            bVar.f6697b = a4;
            if (a4 != 0) {
                bVar.f6698c = 1;
            }
        }
        return bVar;
    }
}
