package com.amolg.flutterbarcodescanner.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import f1.C0620a;
import java.io.IOException;
import y1.C1006a;

public class CameraSourcePreview extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    public Context f6567c;

    /* renamed from: d  reason: collision with root package name */
    public SurfaceView f6568d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6569e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6570f = false;

    /* renamed from: g  reason: collision with root package name */
    public C0620a f6571g;

    /* renamed from: h  reason: collision with root package name */
    public GraphicOverlay f6572h;

    public class b implements SurfaceHolder.Callback {
        public b() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            boolean unused = CameraSourcePreview.this.f6570f = true;
            try {
                CameraSourcePreview.this.g();
            } catch (SecurityException e4) {
                Log.e("CameraSourcePreview", "Do not have permission to start the camera", e4);
            } catch (IOException e5) {
                Log.e("CameraSourcePreview", "Could not start camera source.", e5);
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            boolean unused = CameraSourcePreview.this.f6570f = false;
        }
    }

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6567c = context;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f6568d = surfaceView;
        surfaceView.getHolder().addCallback(new b());
        addView(this.f6568d);
    }

    public final boolean c() {
        int i4 = this.f6567c.getResources().getConfiguration().orientation;
        if (i4 == 2) {
            return false;
        }
        if (i4 == 1) {
            return true;
        }
        Log.d("CameraSourcePreview", "isPortraitMode returning false by default");
        return false;
    }

    public void d() {
        C0620a aVar = this.f6571g;
        if (aVar != null) {
            aVar.v();
            this.f6571g = null;
        }
    }

    public void e(C0620a aVar) {
        if (aVar == null) {
            h();
        }
        this.f6571g = aVar;
        if (aVar != null) {
            this.f6569e = true;
            g();
        }
    }

    public void f(C0620a aVar, GraphicOverlay graphicOverlay) {
        this.f6572h = graphicOverlay;
        e(aVar);
    }

    public final void g() {
        if (this.f6569e && this.f6570f) {
            this.f6571g.A(this.f6568d.getHolder());
            if (this.f6572h != null) {
                C1006a u4 = this.f6571g.u();
                int min = Math.min(u4.b(), u4.a());
                int max = Math.max(u4.b(), u4.a());
                if (c()) {
                    this.f6572h.d(min, max, this.f6571g.q());
                } else {
                    this.f6572h.d(max, min, this.f6571g.q());
                }
                this.f6572h.b();
            }
            this.f6569e = false;
        }
    }

    public void h() {
        C0620a aVar = this.f6571g;
        if (aVar != null) {
            aVar.B();
        }
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        C1006a u4;
        if (c()) {
            i9 = i7 - i5;
            i8 = i6 - i4;
        } else {
            i9 = i6 - i4;
            i8 = i7 - i5;
        }
        C0620a aVar = this.f6571g;
        if (!(aVar == null || (u4 = aVar.u()) == null)) {
            i9 = u4.b();
            i8 = u4.a();
        }
        if (c()) {
            int i10 = i8;
            i8 = i9;
            i9 = i10;
        }
        int i11 = i6 - i4;
        int i12 = i7 - i5;
        float f4 = (float) i9;
        float f5 = (float) i8;
        int i13 = (int) ((((float) i11) / f4) * f5);
        if (i13 > i12) {
            i11 = (int) ((((float) i12) / f5) * f4);
        } else {
            i12 = i13;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            getChildAt(i14).layout(0, 0, i11, i12);
        }
        try {
            g();
        } catch (SecurityException e4) {
            Log.e("CameraSourcePreview", "Do not have permission to start the camera", e4);
        } catch (IOException e5) {
            Log.e("CameraSourcePreview", "Could not start camera source.", e5);
        }
    }
}
