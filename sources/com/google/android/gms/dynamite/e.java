package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class e implements DynamiteModule.b {
    public final DynamiteModule.b.C0126b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0126b bVar = new DynamiteModule.b.C0126b();
        bVar.f6696a = aVar.b(context, str);
        int i4 = 1;
        int a4 = aVar.a(context, str, true);
        bVar.f6697b = a4;
        int i5 = bVar.f6696a;
        if (i5 == 0) {
            i5 = 0;
            if (a4 == 0) {
                i4 = 0;
                bVar.f6698c = i4;
                return bVar;
            }
        }
        if (i5 >= a4) {
            i4 = -1;
        }
        bVar.f6698c = i4;
        return bVar;
    }
}
