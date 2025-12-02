package com.google.android.gms.internal.vision;

import F1.b;
import T1.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.nio.ByteBuffer;
import z1.C1032o;

public final class g2 extends D2 {

    /* renamed from: i  reason: collision with root package name */
    public final C0514i1 f7449i;

    public g2(Context context, C0514i1 i1Var) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.f7449i = i1Var;
        e();
    }

    public final /* synthetic */ Object a(DynamiteModule dynamiteModule, Context context) {
        z2 z2Var;
        IBinder b4 = dynamiteModule.b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
        if (b4 == null) {
            z2Var = null;
        } else {
            IInterface queryLocalInterface = b4.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            z2Var = queryLocalInterface instanceof z2 ? (z2) queryLocalInterface : new B2(b4);
        }
        if (z2Var == null) {
            return null;
        }
        return z2Var.h(b.K(context), (C0514i1) C1032o.f(this.f7449i));
    }

    public final void b() {
        if (c()) {
            ((H1) C1032o.f((H1) e())).a();
        }
    }

    public final a[] f(Bitmap bitmap, C2 c22) {
        if (!c()) {
            return new a[0];
        }
        try {
            return ((H1) C1032o.f((H1) e())).l(b.K(bitmap), c22);
        } catch (RemoteException e4) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e4);
            return new a[0];
        }
    }

    public final a[] g(ByteBuffer byteBuffer, C2 c22) {
        if (!c()) {
            return new a[0];
        }
        try {
            return ((H1) C1032o.f((H1) e())).r(b.K(byteBuffer), c22);
        } catch (RemoteException e4) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e4);
            return new a[0];
        }
    }
}
