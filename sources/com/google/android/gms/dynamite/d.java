package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class d implements DynamiteModule.b {
    public final DynamiteModule.b.C0126b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0126b bVar = new DynamiteModule.b.C0126b();
        int i4 = 0;
        int a4 = aVar.a(context, str, false);
        bVar.f6697b = a4;
        if (a4 != 0) {
            i4 = 1;
        }
        bVar.f6698c = i4;
        return bVar;
    }
}
