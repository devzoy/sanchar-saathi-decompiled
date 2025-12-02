package h1;

import S1.a;
import S1.b;
import T1.b;
import Y2.i;
import Y2.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import io.flutter.plugin.platform.h;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: h1.e  reason: case insensitive filesystem */
public class C0657e implements h {

    /* renamed from: m  reason: collision with root package name */
    public static int f9601m = 400;

    /* renamed from: n  reason: collision with root package name */
    public static int f9602n = 200;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9603a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f9604b;

    /* renamed from: c  reason: collision with root package name */
    public final SurfaceView f9605c;

    /* renamed from: d  reason: collision with root package name */
    public final c f9606d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f9607e;

    /* renamed from: f  reason: collision with root package name */
    public final j f9608f;

    /* renamed from: g  reason: collision with root package name */
    public S1.a f9609g;

    /* renamed from: h  reason: collision with root package name */
    public T1.b f9610h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9611i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9612j = false;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f9613k;

    /* renamed from: l  reason: collision with root package name */
    public C0658f f9614l;

    /* renamed from: h1.e$a */
    public class a implements b.C0058b {
        public a() {
        }

        public void a(b.a aVar) {
            if (C0657e.this.f9611i) {
                SparseArray a4 = aVar.a();
                if (a4.size() > 0) {
                    Camera.Size previewSize = C0657e.this.q().getParameters().getPreviewSize();
                    float width = ((float) C0657e.this.f9605c.getWidth()) / ((float) previewSize.width);
                    float height = ((float) C0657e.this.f9605c.getHeight()) / ((float) previewSize.height);
                    int width2 = (C0657e.this.f9605c.getWidth() - C0657e.f9601m) / 2;
                    int height2 = (C0657e.this.f9605c.getHeight() - C0657e.f9602n) / 2;
                    RectF rectF = new RectF((float) width2, (float) height2, (float) (width2 + C0657e.f9601m), (float) (height2 + C0657e.f9602n));
                    for (int i4 = 0; i4 < a4.size(); i4++) {
                        T1.a aVar2 = (T1.a) a4.valueAt(i4);
                        RectF rectF2 = new RectF(((float) aVar2.d().left) * width, ((float) aVar2.d().top) * height, ((float) aVar2.d().right) * width, ((float) aVar2.d().bottom) * height);
                        if (RectF.intersects(rectF, rectF2)) {
                            RectF rectF3 = new RectF();
                            rectF3.setIntersect(rectF, rectF2);
                            float width3 = ((rectF3.width() * rectF3.height()) / (rectF2.width() * rectF2.height())) * 100.0f;
                            PrintStream printStream = System.out;
                            printStream.println("Overlap percentage: " + width3);
                            if (width3 >= 100.0f) {
                                C0657e.this.f9613k.post(new C0656d(this, aVar2));
                                return;
                            }
                        }
                    }
                }
            }
        }

        public final /* synthetic */ void c(T1.a aVar) {
            C0657e.this.f9608f.c("onBarcodeDetected", aVar.f2856f);
        }

        public void release() {
        }
    }

    /* renamed from: h1.e$b */
    public class b implements SurfaceHolder.Callback {
        public b() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                C0657e.this.f9609g.b(C0657e.this.f9605c.getHolder());
            } catch (IOException e4) {
                Log.e("FlutterBarcodeView", "Error starting camera: " + e4.getMessage());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C0657e.this.f9609g.c();
        }
    }

    /* renamed from: h1.e$c */
    public class c extends View {

        /* renamed from: c  reason: collision with root package name */
        public final Paint f9617c;

        /* renamed from: d  reason: collision with root package name */
        public final Paint f9618d;

        public c(Context context) {
            super(context);
            Paint paint = new Paint();
            this.f9617c = paint;
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(5.0f);
            Paint paint2 = new Paint();
            this.f9618d = paint2;
            paint2.setColor(Color.parseColor("#80000000"));
            paint2.setStyle(Paint.Style.FILL);
        }

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int width = getWidth();
            int height = getHeight();
            int i4 = (width - C0657e.f9601m) / 2;
            int j4 = (height - C0657e.f9602n) / 2;
            int i5 = C0657e.f9601m + i4;
            int j5 = C0657e.f9602n + j4;
            float f4 = (float) width;
            float f5 = (float) j4;
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, f4, f5, this.f9618d);
            float f6 = (float) i4;
            float f7 = (float) j5;
            float f8 = f5;
            float f9 = f7;
            canvas2.drawRect(0.0f, f8, f6, f9, this.f9618d);
            float f10 = (float) i5;
            float f11 = f4;
            canvas2.drawRect(f10, f8, f11, f9, this.f9618d);
            canvas2.drawRect(0.0f, f7, f11, (float) height, this.f9618d);
            canvas2.drawRect(f6, f5, f10, f7, this.f9617c);
        }
    }

    public C0657e(Context context, Y2.b bVar, int i4, Object obj) {
        this.f9603a = context;
        this.f9613k = new Handler(Looper.getMainLooper());
        this.f9614l = C0658f.a((Map) obj);
        t();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9604b = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        SurfaceView surfaceView = new SurfaceView(context);
        this.f9605c = surfaceView;
        frameLayout.addView(surfaceView, new FrameLayout.LayoutParams(-1, -1));
        c cVar = new c(context);
        this.f9606d = cVar;
        frameLayout.addView(cVar, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(context);
        this.f9607e = imageView;
        imageView.setBackgroundColor(-65536);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(f9601m - 40, 5));
        x();
        j jVar = new j(bVar, "plugins.codingwithtashi/barcode_scanner_view_" + i4);
        this.f9608f = jVar;
        jVar.e(new C0654b(this));
        u();
        v();
        w();
    }

    public void a() {
        S1.a aVar = this.f9609g;
        if (aVar != null) {
            aVar.a();
            this.f9609g = null;
        }
        T1.b bVar = this.f9610h;
        if (bVar != null) {
            bVar.d();
            this.f9610h = null;
        }
        this.f9607e.clearAnimation();
    }

    public View c() {
        return this.f9604b;
    }

    public final Camera q() {
        try {
            for (Field field : S1.a.class.getDeclaredFields()) {
                if (field.getType() == Camera.class) {
                    field.setAccessible(true);
                    return (Camera) field.get(this.f9609g);
                }
            }
            return null;
        } catch (Exception e4) {
            Log.e("FlutterBarcodeView", "Error accessing camera: " + e4.getMessage());
            return null;
        }
    }

    public final /* synthetic */ void r() {
        this.f9607e.setX((float) (((this.f9605c.getWidth() - f9601m) / 2) + 20));
        this.f9607e.setY((float) ((this.f9605c.getHeight() - f9602n) / 2));
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (f9602n - 5));
        translateAnimation.setDuration(3000);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(2);
        this.f9607e.startAnimation(translateAnimation);
    }

    public final void s(i iVar, j.d dVar) {
        String str = iVar.f3766a;
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -2132834306:
                if (str.equals("resumeScanning")) {
                    c4 = 0;
                    break;
                }
                break;
            case -668845828:
                if (str.equals("toggleFlash")) {
                    c4 = 1;
                    break;
                }
                break;
            case 1526205639:
                if (str.equals("pauseScanning")) {
                    c4 = 2;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                this.f9611i = true;
                dVar.a((Object) null);
                return;
            case 1:
                y(dVar);
                return;
            case 2:
                this.f9611i = false;
                dVar.a((Object) null);
                return;
            default:
                dVar.c();
                return;
        }
    }

    public final void t() {
        f9601m = this.f9614l.c() != null ? this.f9614l.c().intValue() : f9601m;
        f9602n = this.f9614l.b() != null ? this.f9614l.b().intValue() : f9602n;
    }

    public final void u() {
        T1.b a4 = new b.a(this.f9603a).b(0).a();
        this.f9610h = a4;
        a4.e(new a());
    }

    public final void v() {
        this.f9609g = new a.C0057a(this.f9603a, this.f9610h).b(true).c(1600, 1024).a();
    }

    public final void w() {
        this.f9605c.getHolder().addCallback(new b());
    }

    public final void x() {
        this.f9607e.post(new C0655c(this));
    }

    public final void y(j.d dVar) {
        try {
            Camera q4 = q();
            if (q4 != null) {
                Camera.Parameters parameters = q4.getParameters();
                if (!this.f9612j) {
                    parameters.setFlashMode("torch");
                    this.f9612j = true;
                } else {
                    parameters.setFlashMode("off");
                    this.f9612j = false;
                }
                q4.setParameters(parameters);
                dVar.a(Boolean.valueOf(this.f9612j));
                return;
            }
            dVar.b("CAMERA_ERROR", "Camera not available", (Object) null);
        } catch (Exception e4) {
            dVar.b("FLASH_ERROR", "Error toggling flash: " + e4.getMessage(), (Object) null);
        }
    }
}
