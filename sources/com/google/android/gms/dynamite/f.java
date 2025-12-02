package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class f implements DynamiteModule.b {
    public final DynamiteModule.b.C0126b a(Context context, String str, DynamiteModule.b.a aVar) {
        int i4;
        DynamiteModule.b.C0126b bVar = new DynamiteModule.b.C0126b();
        int b4 = aVar.b(context, str);
        bVar.f6696a = b4;
        int i5 = 1;
        int i6 = 0;
        if (b4 != 0) {
            i4 = aVar.a(context, str, false);
            bVar.f6697b = i4;
        } else {
            i4 = aVar.a(context, str, true);
            bVar.f6697b = i4;
        }
        int i7 = bVar.f6696a;
        if (i7 != 0) {
            i6 = i7;
        } else if (i4 == 0) {
            i5 = 0;
            bVar.f6698c = i5;
            return bVar;
        }
        if (i6 >= i4) {
            i5 = -1;
        }
        bVar.f6698c = i5;
        return bVar;
    }
}
